package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.graphics.PorterDuffColorFilter
import android.graphics.PorterDuff.Mode
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.ActionComponentState
import com.discord.chat.bridge.botuikit.ComponentEmoji
import com.discord.chat.bridge.botuikit.SearchableSelectItem
import com.discord.chat.bridge.botuikit.SelectComponent
import com.discord.chat.bridge.botuikit.SelectItem
import com.discord.chat.bridge.botuikit.SelectOptionType
import com.discord.chat.bridge.botuikit.StringSelectItem
import com.discord.chat.databinding.MessageComponentSelectPillViewBinding
import com.discord.chat.databinding.MessageComponentSelectViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.ComponentViewKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewGroupUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.request.BasePostprocessor
import com.facebook.imagepipeline.request.ImageRequestBuilder
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel
import com.google.android.flexbox.FlexboxLayout
import com.google.android.material.textview.MaterialTextView
import eh.l
import eh.p
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass

public class SelectComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<SelectComponent> {
   private final val postProcessor: BasePostprocessor
      private final get() {
         return this.postProcessor$delegate.getValue() as BasePostprocessor;
      }


   fun SelectComponentView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SelectComponentView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      this.postProcessor$delegate = l.b(<unrepresentable>.INSTANCE);
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: ComponentActionListener, var1: SelectComponent, var2: View) {
      r.h(var0, "$componentActionListener");
      r.h(var1, "$component");
      var0.onTapSelectActionComponent(var1.getId());
   }

   private fun setImage(view: SimpleDraweeSpanTextView, imageUrl: String, color: Int?, asCircle: Boolean) {
      val var6: DraweeSpanStringBuilder = new DraweeSpanStringBuilder();
      val var5: Int = SizeUtilsKt.getDpToPx(20);
      var6.append('\u200b');
      val var8: ImageRequestBuilder = ImageRequestBuilder.s(Uri.parse(var2)).E(new ResizeOptions(var5, var5)).z(RequestLevel.k);
      if (var4) {
         var8.A(this.getPostProcessor());
      }

      val var9: com.facebook.drawee.controller.a = (l4.c.g().D(var8.a()) as PipelineDraweeControllerBuilder).c();
      r.g(var9, "newDraweeControllerBuild…d())\n            .build()");
      val var7: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(this.getContext().getResources()).w(ScaleType.e);
      r.g(var7, "newInstance(context.reso…ils.ScaleType.FIT_CENTER)");
      if (var3 != null) {
         var7.v(new PorterDuffColorFilter(var3, Mode.SRC_IN));
      }

      var6.j(this.getContext(), var7.a(), var9, 0, var5, var5, false, 1);
      var1.setDraweeSpanStringBuilder(var6);
   }

   private fun FlexboxLayout.setSelectedOptions(selectedItems: List<SelectItem>) {
      ViewGroupUtilsKt.setUpLayoutForList(
         var1,
         var2.size(),
         new Function0<View>(LayoutInflater.from(var1.getContext())) {
            final LayoutInflater $inflater;

            {
               super(0);
               this.$inflater = var1;
            }

            public final View invoke() {
               val var1: MaterialTextView = MessageComponentSelectPillViewBinding.inflate(this.$inflater).getRoot();
               r.g(var1, "inflate(inflater).root");
               DiscordFontUtilsKt.setDiscordFont(var1, DiscordFont.PrimaryMedium);
               ViewBackgroundUtilsKt.setBackgroundRectangle$default(
                  var1, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
               );
               var1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
               return var1;
            }
         }
      );
      val var9: java.util.Iterator = var2.iterator();

      for (int var3 = 0; var9.hasNext(); var3++) {
         var var6: TextView = (TextView)var9.next();
         if (var3 < 0) {
            kotlin.collections.h.s();
         }

         val var5: SelectItem = var6 as SelectItem;
         var6 = var1.getChildAt(var3);
         if (var6 is TextView) {
            var6 = var6 as TextView;
         } else {
            var6 = null;
         }

         if (var6 != null) {
            var6.setText(var5.getLabel());
         }
      }
   }

   public open fun configure(
      component: SelectComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentActionListener");
      r.h(var4, "componentContext");
      val var28: MessageComponentSelectViewBinding = MessageComponentSelectViewBinding.bind(this);
      r.g(var28, "bind(this)");
      val var16: java.lang.String = var1.getPlaceholder();
      var var12: SelectComponentView = var28.getRoot();
      r.g(var12, "binding.root");
      RippleUtilsKt.addRipple(var12, true, SizeUtilsKt.getDpToPx(4));
      var12 = var28.getRoot();
      r.g(var12, "binding.root");
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var12,
         ThemeManagerKt.getTheme().getBackgroundSecondary(),
         SizeUtilsKt.getDpToPx(4),
         ThemeManagerKt.getTheme().getBackgroundTertiary(),
         SizeUtilsKt.getDpToPx(1)
      );
      val var33: MaterialTextView = var28.selectComponentSelectionText;
      r.g(var28.selectComponentSelectionText, "binding.selectComponentSelectionText");
      DiscordFontUtilsKt.setDiscordFont(var33, DiscordFont.PrimaryMedium);
      val var34: SimpleDraweeView = var28.selectComponentChevron;
      r.g(var28.selectComponentChevron, "binding.selectComponentChevron");
      ReactAssetUtilsKt.setReactAsset(var34, ReactAsset.ArrowRight);
      val var35: java.util.List = var1.getSelectedItems();
      if (var35.isEmpty() xor true) {
         if (var1.getMaxValues() == 1) {
            val var17: MaterialTextView = var28.selectComponentSelectionText;
            r.g(var28.selectComponentSelectionText, "binding.selectComponentSelectionText");
            var17.setVisibility(0);
            val var18: FlexboxLayout = var28.selectComponentSelectionsRoot;
            r.g(var28.selectComponentSelectionsRoot, "binding.selectComponentSelectionsRoot");
            var18.setVisibility(8);
            var28.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            val var36: SelectItem = kotlin.collections.h.c0(var35) as SelectItem;
            if (var36 != null) {
               var28.selectComponentSelectionText.setText(var36.getLabel());
               val var19: ComponentEmoji;
               if (var36 is StringSelectItem) {
                  var19 = (var36 as StringSelectItem).getEmoji();
               } else {
                  if (var36 !is SearchableSelectItem) {
                     throw new p();
                  }

                  var19 = (var36 as SearchableSelectItem).getIconEmoji();
               }

               if (var19 != null) {
                  val var37: SimpleDraweeSpanTextView = var28.selectComponentSelectionIcon;
                  r.g(var28.selectComponentSelectionIcon, "binding.selectComponentSelectionIcon");
                  ComponentViewKt.setEmojiOrHide(var37, var19);
               } else {
                  label68: {
                     if (var36 is SearchableSelectItem) {
                        val var14: SearchableSelectItem = var36 as SearchableSelectItem;
                        if ((var36 as SearchableSelectItem).getIconSrc() != null) {
                           val var21: SimpleDraweeSpanTextView = var28.selectComponentSelectionIcon;
                           r.g(var28.selectComponentSelectionIcon, "binding.selectComponentSelectionIcon");
                           val var13: java.lang.String = var14.getIconSrc();
                           val var38: Int = var14.getIconColor();
                           val var30: Boolean;
                           if (var14.getType() === SelectOptionType.USER) {
                              var30 = true;
                           } else {
                              var30 = false;
                           }

                           this.setImage(var21, var13, var38, var30);
                           val var22: SimpleDraweeSpanTextView = var28.selectComponentSelectionIcon;
                           r.g(var28.selectComponentSelectionIcon, "binding.selectComponentSelectionIcon");
                           var22.setVisibility(0);
                           break label68;
                        }
                     }

                     val var20: SimpleDraweeSpanTextView = var28.selectComponentSelectionIcon;
                     r.g(var28.selectComponentSelectionIcon, "binding.selectComponentSelectionIcon");
                     var20.setVisibility(8);
                  }
               }
            }
         } else {
            val var23: FlexboxLayout = var28.selectComponentSelectionsRoot;
            r.g(var28.selectComponentSelectionsRoot, "binding.selectComponentSelectionsRoot");
            val var41: MaterialTextView = var28.selectComponentSelectionText;
            r.g(var28.selectComponentSelectionText, "binding.selectComponentSelectionText");
            var41.setVisibility(8);
            var23.setVisibility(0);
            this.setSelectedOptions(var23, var35);
         }
      } else {
         val var39: MaterialTextView = var28.selectComponentSelectionText;
         r.g(var28.selectComponentSelectionText, "binding.selectComponentSelectionText");
         var39.setVisibility(0);
         val var40: FlexboxLayout = var28.selectComponentSelectionsRoot;
         r.g(var28.selectComponentSelectionsRoot, "binding.selectComponentSelectionsRoot");
         var40.setVisibility(8);
         var28.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         var28.selectComponentSelectionText.setText(var16);
      }

      val var6: Boolean;
      if (var1.getState() != ActionComponentState.DISABLED && !var1.getDisabled()) {
         var6 = false;
      } else {
         var6 = true;
      }

      val var7: Boolean;
      if (var1.getState() === ActionComponentState.LOADING) {
         var7 = true;
      } else {
         var7 = false;
      }

      val var24: ProgressBar = var28.selectComponentLoading;
      r.g(var28.selectComponentLoading, "binding.selectComponentLoading");
      var var8: Byte;
      if (var7 xor true) {
         var8 = 4;
      } else {
         var8 = 0;
      }

      var24.setVisibility(var8);
      val var25: SimpleDraweeView = var28.selectComponentChevron;
      r.g(var28.selectComponentChevron, "binding.selectComponentChevron");
      if (var7) {
         var8 = 4;
      } else {
         var8 = 0;
      }

      var25.setVisibility(var8);
      val var26: SelectComponentView = var28.getRoot();
      val var5: Float;
      if (var6) {
         var5 = 0.3F;
      } else {
         var5 = 1.0F;
      }

      var26.setAlpha(var5);
      val var27: SelectComponentView = var28.getRoot();
      r.g(var27, "binding.root");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var27, false, new k(var3, var1), 1, null);
      val var15: SelectComponentView = var28.getRoot();
      var var31: Boolean = false;
      if (!var7) {
         var31 = false;
         if (!var6) {
            var31 = true;
         }
      }

      var15.setClickable(var31);
      var28.getRoot().setEnabled(var6 xor true);
   }

   public override fun getComponentType(): KClass<SelectComponent> {
      return h0.b(SelectComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): SelectComponentView {
         r.h(var1, "context");
         r.h(var2, "root");
         val var3: SelectComponentView = MessageComponentSelectViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         r.g(var3, "inflate(\n               …false,\n            ).root");
         return var3;
      }
   }
}
