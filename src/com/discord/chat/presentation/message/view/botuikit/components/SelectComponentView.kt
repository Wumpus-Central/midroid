package com.discord.chat.presentation.message.view.botuikit.components

import B9.n
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
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nSelectComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n176#2,2:266\n257#2,2:268\n257#2,2:270\n257#2,2:272\n257#2,2:274\n257#2,2:276\n257#2,2:278\n257#2,2:280\n257#2,2:282\n257#2,2:284\n257#2,2:286\n278#2,2:288\n257#2,2:290\n1872#3,3:292\n*S KotlinDebug\n*F\n+ 1 SelectComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView\n*L\n67#1:266,2\n103#1:268,2\n104#1:270,2\n125#1:272,2\n127#1:274,2\n134#1:276,2\n135#1:278,2\n136#1:280,2\n141#1:282,2\n142#1:284,2\n143#1:286,2\n151#1:288,2\n154#1:290,2\n260#1:292,3\n*E\n"])
public class SelectComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3),
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
      this(var1, null, 0, 6, null);
   }

   fun SelectComponentView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: MessageComponentSelectViewBinding = MessageComponentSelectViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      this.progressDots$delegate = B9.j.b(new i(this));
      this.postProcessor$delegate = B9.j.b(new j());
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
         this.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
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
      return var1 as ProgressDots;
   }

   private fun setImage(view: SimpleDraweeSpanTextView, imageUrl: String, color: Int?, asCircle: Boolean) {
      val var6: DraweeSpanStringBuilder = new DraweeSpanStringBuilder();
      val var5: Int = SizeUtilsKt.getDpToPx(20);
      var6.append('\u200b');
      val var8: ImageRequestBuilder = ImageRequestBuilder.x(Uri.parse(var2)).N(new ResizeOptions(var5, var5, 0.0F, 0.0F, 12, null)).I(RequestLevel.e);
      if (var4) {
         var8.J(this.getPostProcessor());
      }

      val var9: com.facebook.drawee.controller.a = (H2.d.g().F(var8.a()) as PipelineDraweeControllerBuilder).d();
      val var7: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(this.getContext().getResources()).w(ScaleType.e);
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
            CollectionsKt.u();
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
      DiscordFontUtilsKt.setDiscordFont(var1, DiscordFont.PrimaryMedium);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var1, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
      var1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      return var1;
   }

   public fun configure(component: SelectComponent, componentContext: ComponentContext) {
      val var10: java.lang.String = var1.getPlaceholder();
      this.configureWidth(var2);
      var var11: View = this.binding.getRoot();
      var var5: Byte = 4;
      RippleUtilsKt.addRipple(var11, true, SizeUtilsKt.getDpToPx(4));
      var11 = this.binding.getRoot();
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var11,
         ThemeManagerKt.getTheme().getBackgroundSecondary(),
         SizeUtilsKt.getDpToPx(4),
         ThemeManagerKt.getTheme().getBackgroundTertiary(),
         SizeUtilsKt.getDpToPx(1)
      );
      val var30: MaterialTextView = this.binding.selectComponentSelectionText;
      DiscordFontUtilsKt.setDiscordFont(var30, DiscordFont.PrimaryMedium);
      val var31: SimpleDraweeView = this.binding.selectComponentChevron;
      ReactAssetUtilsKt.setReactAsset(var31, ReactAsset.ArrowRight);
      val var32: java.util.List = var1.getSelectedItems();
      if (!var32.isEmpty()) {
         if (var1.getMaxValues() == 1) {
            val var18: MaterialTextView = this.binding.selectComponentSelectionText;
            var18.setVisibility(0);
            val var19: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
            var19.setVisibility(8);
            this.binding.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            val var33: SelectItem = CollectionsKt.firstOrNull(var32) as SelectItem;
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
                  ComponentViewKt.setEmojiOrHide(var34, var20);
               } else {
                  label71: {
                     if (var33 is SearchableSelectItem) {
                        val var21: SearchableSelectItem = var33 as SearchableSelectItem;
                        if ((var33 as SearchableSelectItem).getIconSrc() != null) {
                           val var13: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                           val var12: java.lang.String = var21.getIconSrc();
                           val var35: Int = var21.getIconColor();
                           val var16: Boolean;
                           if (var21.getType() === SelectOptionType.USER) {
                              var16 = true;
                           } else {
                              var16 = false;
                           }

                           this.setImage(var13, var12, var35, var16);
                           val var23: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                           var23.setVisibility(0);
                           break label71;
                        }
                     }

                     val var22: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
                     var22.setVisibility(8);
                  }
               }
            }
         } else {
            val var24: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
            val var39: MaterialTextView = this.binding.selectComponentSelectionText;
            var39.setVisibility(8);
            val var40: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
            var40.setVisibility(8);
            var24.setVisibility(0);
            this.setSelectedOptions(var24, var32);
         }
      } else {
         val var36: MaterialTextView = this.binding.selectComponentSelectionText;
         var36.setVisibility(0);
         val var37: SimpleDraweeSpanTextView = this.binding.selectComponentSelectionIcon;
         var37.setVisibility(8);
         val var38: FlexboxLayout = this.binding.selectComponentSelectionsRoot;
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

      val var8: Boolean;
      if (var1.getState() === ActionComponentState.LOADING) {
         var8 = true;
      } else {
         var8 = false;
      }

      val var25: SimpleDraweeView = this.binding.selectComponentChevron;
      if (!var8) {
         var5 = 0;
      }

      var25.setVisibility(var5);
      if (var8 != this.currentIsLoading) {
         val var26: ProgressDots = this.getProgressDots();
         var5 = 8;
         if (var8) {
            var5 = 0;
         }

         var26.setVisibility(var5);
      }

      this.currentIsLoading = var8;
      val var27: View = this.binding.getRoot();
      val var3: Float;
      if (var4) {
         var3 = 0.3F;
      } else {
         var3 = 1.0F;
      }

      var27.setAlpha(var3);
      val var28: View = this.binding.getRoot();
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var28, false, new g(var2, var1), 1, null);
      val var14: View = this.binding.getRoot();
      var var17: Boolean = false;
      if (!var8) {
         var17 = false;
         if (!var4) {
            var17 = true;
         }
      }

      var14.setClickable(var17);
      this.binding.getRoot().setEnabled(var4 xor true);
   }

   public open fun configure(component: SelectComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      this.configure(var1, var3);
   }

   public override fun getComponentType(): KClass<SelectComponent> {
      return SelectComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): SelectComponentView {
         return new SelectComponentView(var1, null, 0, 6, null);
      }
   }
}
