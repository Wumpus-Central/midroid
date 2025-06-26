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
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class SectionComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : LinearLayout,
   ComponentView<SectionComponent> {
   private final val binding: MessageComponentSectionViewBinding
   private final val textComponentViews: LinearLayout
   private final var componentProvider: ComponentProvider?

   fun SectionComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SectionComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var6: MessageComponentSectionViewBinding = MessageComponentSectionViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var6, "inflate(...)");
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
      val var1: View;
      if (this.binding.sectionLayoutBox.getChildCount() > 1) {
         var1 = this.binding.sectionLayoutBox.getChildAt(1);
      } else {
         var1 = null;
      }

      return var1;
   }

   private fun removeAndRecycleAccessoryView() {
      val var2: View = this.getCurrentAccessoryView();
      if (var2 != null) {
         this.binding.sectionLayoutBox.removeView(var2);
         if (this.componentProvider != null) {
            this.componentProvider.recycleComponentView(var2 as ComponentView<out Component>);
         }
      }
   }

   private fun setAccessoryView(newView: View) {
      if (!q.c(var1, this.getCurrentAccessoryView())) {
         this.removeAndRecycleAccessoryView();
         this.binding.sectionLayoutBox.addView(var1);
      }
   }

   public open fun configure(component: SectionComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      label75: {
         q.h(var1, "component");
         q.h(var2, "componentProvider");
         q.h(var3, "componentContext");
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
            val var20: ArrayList = new ArrayList(kotlin.collections.i.v(var9, 10));
            val var22: java.util.Iterator = var9.iterator();

            for (int var4 = 0; var22.hasNext(); var4++) {
               var var10: Any = var22.next();
               if (var4 < 0) {
                  kotlin.collections.i.u();
               }

               var10 = (var10 as SectionChildComponent).getComponent();
               q.e(var10);
               var20.add(var2.getConfiguredComponentView((Component)var10, var3, this.textComponentViews, var4));
            }

            var8 = kotlin.collections.i.e0(var20);
            val var23: Component = var1.getAccessory().getComponent();
            q.e(var23);
            val var26: FlexboxLayout = this.binding.sectionLayoutBox;
            q.g(this.binding.sectionLayoutBox, "sectionLayoutBox");
            val var24: ComponentView = var2.getConfiguredComponentView(var23, var3, var26, 1);
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
               q.g(var13, "getRoot(...)");
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
                  q.g(this.binding.sectionComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
                  ReactAssetUtilsKt.setReactAsset(var14, ReactAsset.Warning);
                  val var15: SimpleDraweeView = this.binding.sectionComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
                  q.g(this.binding.sectionComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
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
      return G.b(SectionComponent.class);
   }

   public override fun onRecycle(componentProvider: ComponentProvider) {
      q.h(var1, "componentProvider");
      MessageComponentsViewKt.recycleChildComponents(this.textComponentViews, var1);
      this.removeAndRecycleAccessoryView();
   }

   public companion object {
      public fun inflateComponent(context: Context): SectionComponentView {
         q.h(var1, "context");
         return new SectionComponentView(var1, null, 0, 6, null);
      }
   }
}
