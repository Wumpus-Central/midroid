package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.SectionAccessory
import com.discord.chat.bridge.botuikit.SectionChildComponent
import com.discord.chat.bridge.botuikit.SectionComponent
import com.discord.chat.databinding.MessageComponentSectionViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.flexbox.FlexboxLayout
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nSectionComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/SectionComponentView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,176:1\n1755#2,3:177\n1567#2:184\n1598#2,4:185\n257#3,2:180\n257#3,2:182\n257#3,2:189\n257#3,2:191\n*S KotlinDebug\n*F\n+ 1 SectionComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/SectionComponentView\n*L\n84#1:177,3\n93#1:184\n93#1:185,4\n87#1:180,2\n90#1:182,2\n111#1:189,2\n130#1:191,2\n*E\n"])
public class SectionComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(var1, var2, var3),
   ComponentView<SectionComponent> {
   private final val binding: MessageComponentSectionViewBinding
   private final val textComponentViews: LinearLayout
   private final var componentProvider: ComponentProvider?

   fun SectionComponentView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun SectionComponentView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var6: MessageComponentSectionViewBinding = MessageComponentSectionViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var6;
      val var5: LinearLayout = new LinearLayout(var1);
      this.textComponentViews = var5;
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
      var5.setOrientation(1);
      val var4: com.google.android.flexbox.FlexboxLayout.LayoutParams = new com.google.android.flexbox.FlexboxLayout.LayoutParams(-2, -2);
      var4.a(1.0F);
      var5.setLayoutParams(var4);
      var6.sectionLayoutBox.addView(var5);
   }

   private fun getCurrentAccessoryView(): View? {
      return if (this.binding.sectionLayoutBox.getChildCount() > 1) this.binding.sectionLayoutBox.getChildAt(1) else null;
   }

   private fun removeAndRecycleAccessoryView() {
      val var1: View = this.getCurrentAccessoryView();
      if (var1 != null) {
         this.binding.sectionLayoutBox.removeView(var1);
         if (this.componentProvider != null) {
            this.componentProvider.recycleComponentView(var1 as ComponentView<out Component>);
         }
      }
   }

   private fun setAccessoryView(newView: View) {
      if (!(var1 == this.getCurrentAccessoryView())) {
         this.removeAndRecycleAccessoryView();
         this.binding.sectionLayoutBox.addView(var1);
      }
   }

   public open fun configure(component: SectionComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      label75: {
         this.componentProvider = var2;
         var var8: java.util.List = var1.getComponents();
         var var5: Byte = 8;
         if (var8 == null || !var8.isEmpty()) {
            val var19: java.util.Iterator = var8.iterator();

            while (var19.hasNext()) {
               if (var19.next() as SectionChildComponent is SectionChildComponent.Unknown) {
                  break label75;
               }
            }
         }

         if (var1.getAccessory() !is SectionAccessory.Unknown) {
            this.setVisibility(0);
            val var9: java.util.List = var1.getComponents();
            val var20: ArrayList = new ArrayList(CollectionsKt.v(var9, 10));
            val var22: java.util.Iterator = var9.iterator();

            for (int var4 = 0; var22.hasNext(); var4++) {
               var var10: Any = var22.next();
               if (var4 < 0) {
                  CollectionsKt.u();
               }

               var10 = (var10 as SectionChildComponent).getComponent();
               var20.add(var2.getConfiguredComponentView((Component)var10, var3, this.textComponentViews, var4));
            }

            var8 = CollectionsKt.g0(var20);
            val var26: Component = var1.getAccessory().getComponent();
            val var23: FlexboxLayout = this.binding.sectionLayoutBox;
            val var24: ComponentView = var2.getConfiguredComponentView(var26, var3, var23, 1);
            if (!var8.isEmpty() && var24 != null) {
               MessageComponentsViewKt.replaceViews$default(this.textComponentViews, var8, var2, SizeUtilsKt.getDpToPx(4), 0, 8, null);
               this.setAccessoryView(var24 as View);
               if (var3.getWidthInfo().isLargeWidthRenderingMode()) {
                  this.binding.sectionLayoutBox.setFlexDirection(0);
               } else {
                  val var16: FlexboxLayout = this.binding.sectionLayoutBox;
                  val var12: SectionAccessory = var1.getAccessory();
                  val var7: Boolean = var12 is SectionAccessory.Button;
                  var var17: Byte = 2;
                  if (!var7 && var12 is SectionAccessory.Thumbnail) {
                     var17 = 0;
                  }

                  var16.setFlexDirection(var17);
               }

               val var13: ConstraintLayout = this.binding.sectionComponentViewGroupErrorRow.getRoot();
               val var18: Boolean;
               if (var1.getErrorText() != null) {
                  var18 = true;
               } else {
                  var18 = false;
               }

               if (var18) {
                  var5 = 0;
               }

               var13.setVisibility(var5);
               val var11: java.lang.String = var1.getErrorText();
               if (var11 != null) {
                  val var14: SimpleDraweeView = this.binding.sectionComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
                  ReactAssetUtilsKt.setReactAsset(var14, ReactAsset.Warning);
                  val var15: SimpleDraweeView = this.binding.sectionComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
                  ColorUtilsKt.setTintColor(var15, ThemeManagerKt.getTheme().getInfoDangerForeground());
                  this.binding.sectionComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(var11);
                  this.binding
                     .sectionComponentViewGroupErrorRow
                     .viewInteractionFailedLabelMessage
                     .setTextColor(ThemeManagerKt.getTheme().getInfoDangerForeground());
               }

               return;
            }

            this.setVisibility(8);
            return;
         }
      }

      this.setVisibility(8);
   }

   public override fun getComponentType(): KClass<SectionComponent> {
      return SectionComponent::class;
   }

   public override fun onRecycle(componentProvider: ComponentProvider) {
      MessageComponentsViewKt.recycleChildComponents(this.textComponentViews, var1);
      this.removeAndRecycleAccessoryView();
   }

   public companion object {
      public fun inflateComponent(context: Context): SectionComponentView {
         return new SectionComponentView(var1, null, 0, 6, null);
      }
   }
}
