package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.graphics.PorterDuffColorFilter
import android.graphics.PorterDuff.Mode
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
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
import com.facebook.drawee.drawable.ScalingUtils
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
import f8.l
import f8.p
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class SelectComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<SelectComponent> {
   public final val binding: MessageComponentSelectViewBinding

   private final val postProcessor: BasePostprocessor
      private final get() {
         return this.postProcessor$delegate.getValue() as BasePostprocessor;
      }


   fun SelectComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SelectComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageComponentSelectViewBinding = MessageComponentSelectViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.postProcessor$delegate = l.b(<unrepresentable>.INSTANCE);
      this.setMaxWidth(SizeUtilsKt.getDpToPx(300));
      this.setMinHeight(SizeUtilsKt.getDpToPx(40));
      var3 = SizeUtilsKt.getDpToPx(8);
      this.setPadding(var3, var3, var3, var3);
      this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: ComponentContext, var1: SelectComponent, var2: View) {
      q.h(var0, "$componentContext");
      q.h(var1, "$component");
      var0.getComponentActionEventHandlers().getOnTapSelectActionComponent().invoke(var1.getId());
   }

   private fun setImage(view: SimpleDraweeSpanTextView, imageUrl: String, color: Int?, asCircle: Boolean) {
      val var6: DraweeSpanStringBuilder = new DraweeSpanStringBuilder();
      val var5: Int = SizeUtilsKt.getDpToPx(20);
      var6.append('\u200b');
      val var8: ImageRequestBuilder = ImageRequestBuilder.w(Uri.parse(var2)).L(new ResizeOptions(var5, var5, 0.0F, 0.0F, 12, null)).G(RequestLevel.k);
      if (var4) {
         var8.H(this.getPostProcessor());
      }

      val var9: com.facebook.drawee.controller.a = (R1.c.g().F(var8.a()) as PipelineDraweeControllerBuilder).d();
      q.g(var9, "build(...)");
      val var7: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(this.getContext().getResources()).w(ScalingUtils.ScaleType.e);
      q.g(var7, "setActualImageScaleType(...)");
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
         new Function0(LayoutInflater.from(var1.getContext())) {
            final LayoutInflater $inflater;

            {
               super(0);
               this.$inflater = var1;
            }

            public final View invoke() {
               val var1: MaterialTextView = MessageComponentSelectPillViewBinding.inflate(this.$inflater).getRoot();
               q.g(var1, "getRoot(...)");
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
            i.u();
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

   public open fun configure(component: SelectComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      val var15: java.lang.String = var1.getPlaceholder();
      var var11: View = this.binding.getRoot();
      q.g(var11, "getRoot(...)");
      RippleUtilsKt.addRipple(var11, true, SizeUtilsKt.getDpToPx(4));
      var11 = this.binding.getRoot();
      q.g(var11, "getRoot(...)");
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var11,
         ThemeManagerKt.getTheme().getBackgroundSecondary(),
         SizeUtilsKt.getDpToPx(4),
         ThemeManagerKt.getTheme().getBackgroundTertiary(),
         SizeUtilsKt.getDpToPx(1)
      );
      val var31: MaterialTextView = this.binding.selectComponentSelectionText;
      q.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
      DiscordFontUtilsKt.setDiscordFont(var31, DiscordFont.PrimaryMedium);
      val var32: SimpleDraweeView = this.binding.selectComponentChevron;
      q.g(this.binding.selectComponentChevron, "selectComponentChevron");
      ReactAssetUtilsKt.setReactAsset(var32, ReactAsset.ArrowRight);
      val var33: java.util.List = var1.getSelectedItems();
      if (!var33.isEmpty()) {
         if (var1.getMaxValues() == 1) {
            val var16: MaterialTextView = this.binding.selectComponentSelectionText;
            q.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
            var16.setVisibility(0);
            val var17: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
            q.g(this.binding.selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
            var17.setVisibility(8);
            this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            val var34: SelectItem = i.h0(var33) as SelectItem;
            if (var34 != null) {
               this.binding.selectComponentSelectionText.setText(var34.getLabel());
               val var18: ComponentEmoji;
               if (var34 is StringSelectItem) {
                  var18 = (var34 as StringSelectItem).getEmoji();
               } else {
                  if (var34 !is SearchableSelectItem) {
                     throw new p();
                  }

                  var18 = (var34 as SearchableSelectItem).getIconEmoji();
               }

               if (var18 != null) {
                  val var35: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                  q.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                  ComponentViewKt.setEmojiOrHide(var35, var18);
               } else {
                  label68: {
                     if (var34 is SearchableSelectItem) {
                        val var36: SearchableSelectItem = var34 as SearchableSelectItem;
                        if ((var34 as SearchableSelectItem).getIconSrc() != null) {
                           val var20: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                           q.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                           val var12: java.lang.String = var36.getIconSrc();
                           val var13: Int = var36.getIconColor();
                           val var28: Boolean;
                           if (var36.getType() === SelectOptionType.USER) {
                              var28 = true;
                           } else {
                              var28 = false;
                           }

                           this.setImage(var20, var12, var13, var28);
                           val var21: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                           q.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                           var21.setVisibility(0);
                           break label68;
                        }
                     }

                     val var19: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                     q.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                     var19.setVisibility(8);
                  }
               }
            }
         } else {
            val var39: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
            q.g(this.binding.selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
            val var22: MaterialTextView = this.binding.selectComponentSelectionText;
            q.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
            var22.setVisibility(8);
            var39.setVisibility(0);
            this.setSelectedOptions(var39, var33);
         }
      } else {
         val var37: MaterialTextView = this.binding.selectComponentSelectionText;
         q.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
         var37.setVisibility(0);
         val var38: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
         q.g(this.binding.selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
         var38.setVisibility(8);
         this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         this.binding.selectComponentSelectionText.setText(var15);
      }

      val var5: Boolean;
      if (var1.getState() != ActionComponentState.DISABLED && !var1.getDisabled()) {
         var5 = false;
      } else {
         var5 = true;
      }

      val var6: Boolean;
      if (var1.getState() === ActionComponentState.LOADING) {
         var6 = true;
      } else {
         var6 = false;
      }

      val var23: ProgressBar = this.binding.selectComponentLoading;
      q.g(this.binding.selectComponentLoading, "selectComponentLoading");
      var var7: Byte;
      if (!var6) {
         var7 = 4;
      } else {
         var7 = 0;
      }

      var23.setVisibility(var7);
      val var24: SimpleDraweeView = this.binding.selectComponentChevron;
      q.g(this.binding.selectComponentChevron, "selectComponentChevron");
      if (var6) {
         var7 = 4;
      } else {
         var7 = 0;
      }

      var24.setVisibility(var7);
      val var25: View = this.binding.getRoot();
      val var4: Float;
      if (var5) {
         var4 = 0.3F;
      } else {
         var4 = 1.0F;
      }

      var25.setAlpha(var4);
      val var26: View = this.binding.getRoot();
      q.g(var26, "getRoot(...)");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var26, false, new d(var3, var1), 1, null);
      val var14: View = this.binding.getRoot();
      var var29: Boolean = false;
      if (!var6) {
         var29 = false;
         if (!var5) {
            var29 = true;
         }
      }

      var14.setClickable(var29);
      this.binding.getRoot().setEnabled(var5 xor true);
   }

   public override fun getComponentType(): KClass<SelectComponent> {
      return E.b(SelectComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): SelectComponentView {
         q.h(var1, "context");
         return new SelectComponentView(var1, null, 0, 6, null);
      }
   }
}
