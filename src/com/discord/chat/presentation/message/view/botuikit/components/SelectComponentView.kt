package com.discord.chat.presentation.message.view.botuikit.components

import A9.n
import android.content.Context
import android.graphics.PorterDuffColorFilter
import android.graphics.PorterDuff.Mode
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
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
import com.discord.image.fresco.postprocessors.PostProcessor
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewGroupUtilsKt
import com.discord.progress_dots.ProgressDots
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils$ScaleType
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
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlin.reflect.KClass

public class SelectComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<SelectComponent> {
   public final val binding: MessageComponentSelectViewBinding

   private final val progressDots: ProgressDots
      private final get() {
         return this.progressDots$delegate.getValue() as ProgressDots;
      }


   private final val postProcessor: BasePostprocessor
      private final get() {
         return this.postProcessor$delegate.getValue() as BasePostprocessor;
      }


   private final var currentIsLoading: Boolean

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
      val var4: MessageComponentSelectViewBinding = MessageComponentSelectViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var4, "inflate(...)");
      this.binding = var4;
      this.progressDots$delegate = A9.j.b(new i(this));
      this.postProcessor$delegate = A9.j.b(new j());
      this.setMinHeight(SizeUtilsKt.getDpToPx(40));
      var3 = SizeUtilsKt.getDpToPx(8);
      this.setPadding(var3, var3, var3, var3);
   }

   @JvmStatic
   fun `configure$lambda$3`(var0: ComponentContext, var1: SelectComponent, var2: View) {
      var0.getComponentActionEventHandlers().getOnTapSelectActionComponent().invoke(var1.getId());
   }

   private fun configureWidth(componentContext: ComponentContext) {
      if (var1.isInModal() || !var1.getWidthInfo().isLargeWidthRenderingMode()) {
         this.setMaxWidth(Integer.MAX_VALUE);
         this.setMinWidth(0);
         this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
      } else if (var1.isInContainerComponent()) {
         this.setMaxWidth(Integer.MAX_VALUE);
         this.setMinWidth(SizeUtilsKt.getDpToPx(400));
         val var2: android.widget.LinearLayout.LayoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
         var2.weight = 1.0F;
         this.setLayoutParams(var2);
      } else {
         this.setMaxWidth(SizeUtilsKt.getDpToPx(400));
         this.setMinWidth(SizeUtilsKt.getDpToPx(400));
         this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(SizeUtilsKt.getDpToPx(400), -2));
      }
   }

   @JvmStatic
   fun `postProcessor_delegate$lambda$1`(): BasePostprocessor {
      return PostProcessor.Circle.INSTANCE.create();
   }

   @JvmStatic
   fun `progressDots_delegate$lambda$0`(var0: SelectComponentView): ProgressDots {
      val var1: View = var0.binding.loadingDots.inflate();
      r.f(var1, "null cannot be cast to non-null type com.discord.progress_dots.ProgressDots");
      return var1 as ProgressDots;
   }

   private fun setImage(view: SimpleDraweeSpanTextView, imageUrl: String, color: Int?, asCircle: Boolean) {
      val var6: DraweeSpanStringBuilder = new DraweeSpanStringBuilder();
      val var5: Int = SizeUtilsKt.getDpToPx(20);
      var6.append('\u200b');
      val var8: ImageRequestBuilder = ImageRequestBuilder.x(Uri.parse(var2)).N(new ResizeOptions(var5, var5, 0.0F, 0.0F, 12, null)).I(RequestLevel.k);
      if (var4) {
         var8.J(this.getPostProcessor());
      }

      val var9: com.facebook.drawee.controller.a = (I2.d.g().F(var8.a()) as PipelineDraweeControllerBuilder).d();
      r.g(var9, "build(...)");
      val var7: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(this.getContext().getResources()).w(ScalingUtils$ScaleType.e);
      r.g(var7, "setActualImageScaleType(...)");
      if (var3 != null) {
         var7.v(new PorterDuffColorFilter(var3, Mode.SRC_IN));
      }

      var6.j(this.getContext(), var7.a(), var9, 0, var5, var5, false, 1);
      var1.setDraweeSpanStringBuilder(var6);
   }

   private fun FlexboxLayout.setSelectedOptions(selectedItems: List<SelectItem>) {
      ViewGroupUtilsKt.setUpLayoutForList(var1, var2.size(), new h(LayoutInflater.from(var1.getContext())));
      val var9: java.util.Iterator = var2.iterator();

      for (int var3 = 0; var9.hasNext(); var3++) {
         var var6: TextView = (TextView)var9.next();
         if (var3 < 0) {
            kotlin.collections.i.u();
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

   @JvmStatic
   fun `setSelectedOptions$lambda$5`(var0: LayoutInflater): View {
      val var1: MaterialTextView = MessageComponentSelectPillViewBinding.inflate(var0).getRoot();
      r.g(var1, "getRoot(...)");
      DiscordFontUtilsKt.setDiscordFont(var1, DiscordFont.PrimaryMedium);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var1, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
      var1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      return var1;
   }

   public fun configure(component: SelectComponent, componentContext: ComponentContext) {
      r.h(var1, "component");
      r.h(var2, "componentContext");
      val var10: java.lang.String = var1.getPlaceholder();
      this.configureWidth(var2);
      var var11: View = this.binding.getRoot();
      r.g(var11, "getRoot(...)");
      var var5: Byte = 4;
      RippleUtilsKt.addRipple(var11, true, SizeUtilsKt.getDpToPx(4));
      var11 = this.binding.getRoot();
      r.g(var11, "getRoot(...)");
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var11,
         ThemeManagerKt.getTheme().getBackgroundSecondary(),
         SizeUtilsKt.getDpToPx(4),
         ThemeManagerKt.getTheme().getBackgroundTertiary(),
         SizeUtilsKt.getDpToPx(1)
      );
      val var30: MaterialTextView = this.binding.selectComponentSelectionText;
      r.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
      DiscordFontUtilsKt.setDiscordFont(var30, DiscordFont.PrimaryMedium);
      val var31: SimpleDraweeView = this.binding.selectComponentChevron;
      r.g(this.binding.selectComponentChevron, "selectComponentChevron");
      ReactAssetUtilsKt.setReactAsset(var31, ReactAsset.ArrowRight);
      val var32: java.util.List = var1.getSelectedItems();
      if (!var32.isEmpty()) {
         if (var1.getMaxValues() == 1) {
            val var18: MaterialTextView = this.binding.selectComponentSelectionText;
            r.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
            var18.setVisibility(0);
            val var19: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
            r.g(this.binding.selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
            var19.setVisibility(8);
            this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            val var33: SelectItem = kotlin.collections.i.j0(var32) as SelectItem;
            if (var33 != null) {
               this.binding.selectComponentSelectionText.setText(var33.getLabel());
               val var20: ComponentEmoji;
               if (var33 is StringSelectItem) {
                  var20 = (var33 as StringSelectItem).getEmoji();
               } else {
                  if (var33 !is SearchableSelectItem) {
                     throw new n();
                  }

                  var20 = (var33 as SearchableSelectItem).getIconEmoji();
               }

               if (var20 != null) {
                  val var34: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                  r.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                  ComponentViewKt.setEmojiOrHide(var34, var20);
               } else {
                  label71: {
                     if (var33 is SearchableSelectItem) {
                        val var35: SearchableSelectItem = var33 as SearchableSelectItem;
                        if ((var33 as SearchableSelectItem).getIconSrc() != null) {
                           val var22: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                           r.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                           val var12: java.lang.String = var35.getIconSrc();
                           val var13: Int = var35.getIconColor();
                           val var16: Boolean;
                           if (var35.getType() === SelectOptionType.USER) {
                              var16 = true;
                           } else {
                              var16 = false;
                           }

                           this.setImage(var22, var12, var13, var16);
                           val var23: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                           r.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                           var23.setVisibility(0);
                           break label71;
                        }
                     }

                     val var21: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                     r.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
                     var21.setVisibility(8);
                  }
               }
            }
         } else {
            val var24: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
            r.g(this.binding.selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
            val var39: MaterialTextView = this.binding.selectComponentSelectionText;
            r.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
            var39.setVisibility(8);
            val var40: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
            r.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
            var40.setVisibility(8);
            var24.setVisibility(0);
            this.setSelectedOptions(var24, var32);
         }
      } else {
         val var36: MaterialTextView = this.binding.selectComponentSelectionText;
         r.g(this.binding.selectComponentSelectionText, "selectComponentSelectionText");
         var36.setVisibility(0);
         val var37: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
         r.g(this.binding.selectComponentSelectionIcon, "selectComponentSelectionIcon");
         var37.setVisibility(8);
         val var38: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
         r.g(this.binding.selectComponentSelectionsRoot, "selectComponentSelectionsRoot");
         var38.setVisibility(8);
         this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
         this.binding.selectComponentSelectionText.setText(var10);
      }

      val var4: Boolean;
      if (var1.getState() != ActionComponentState.DISABLED && !var1.getDisabled()) {
         var4 = false;
      } else {
         var4 = true;
      }

      val var17: Boolean;
      if (var1.getState() === ActionComponentState.LOADING) {
         var17 = true;
      } else {
         var17 = false;
      }

      val var25: SimpleDraweeView = this.binding.selectComponentChevron;
      r.g(this.binding.selectComponentChevron, "selectComponentChevron");
      if (!var17) {
         var5 = 0;
      }

      var25.setVisibility(var5);
      if (var17 != this.currentIsLoading) {
         val var26: ProgressDots = this.getProgressDots();
         var5 = 8;
         if (var17) {
            var5 = 0;
         }

         var26.setVisibility(var5);
      }

      this.currentIsLoading = var17;
      val var27: View = this.binding.getRoot();
      val var3: Float;
      if (var4) {
         var3 = 0.3F;
      } else {
         var3 = 1.0F;
      }

      var27.setAlpha(var3);
      val var28: View = this.binding.getRoot();
      r.g(var28, "getRoot(...)");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var28, false, new g(var2, var1), 1, null);
      val var14: View = this.binding.getRoot();
      var var8: Boolean = false;
      if (!var17) {
         var8 = false;
         if (!var4) {
            var8 = true;
         }
      }

      var14.setClickable(var8);
      this.binding.getRoot().setEnabled(var4 xor true);
   }

   public open fun configure(component: SelectComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentContext");
      this.configure(var1, var3);
   }

   public override fun getComponentType(): KClass<SelectComponent> {
      return H.b(SelectComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): SelectComponentView {
         r.h(var1, "context");
         return new SelectComponentView(var1, null, 0, 6, null);
      }
   }
}
