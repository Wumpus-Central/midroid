package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.ActionRowComponent
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.databinding.MessageComponentActionRowViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.flexbox.FlexboxLayout
import java.util.ArrayList
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ActionRowComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : LinearLayout,
   ComponentView<ActionRowComponent> {
   public final val binding: MessageComponentActionRowViewBinding

   fun ActionRowComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActionRowComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageComponentActionRowViewBinding = MessageComponentActionRowViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
   }

   public open fun configure(
      component: ActionRowComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentActionListener");
      q.h(var4, "componentContext");
      val var9: java.util.List = var1.getComponents();
      val var11: ArrayList = new ArrayList(i.v(var9, 10));
      val var12: java.util.Iterator = var9.iterator();

      for (int var5 = 0; var12.hasNext(); var5++) {
         var var26: ComponentView = (ComponentView)var12.next();
         if (var5 < 0) {
            i.u();
         }

         val var13: Component = var26 as Component;
         val var14: FlexboxLayout = this.binding.actionRowComponentViewGroup;
         q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
         var26 = var14.getChildAt(var5);
         val var8: Boolean = var26 is ComponentView;
         var var10: ComponentView = null;
         if (var8) {
            var26 = var26 as ComponentView;
         } else {
            var26 = null;
         }

         label52: {
            if (var26 != null) {
               if (((ComponentView)var26).getComponentType() is Component) {
                  var10 = (ComponentView)var26;
               }

               var26 = var10;
               if (var10 != null) {
                  break label52;
               }
            }

            var26 = var2.getInflater().getComponent(var13, var14);
         }

         if (var26 != null) {
            var26.configure(var13, var2, var3, var4);
         }

         var11.add(var26);
      }

      val var20: java.util.List = i.b0(var11);
      val var21: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      MessageComponentsViewKt.replaceViews$default(var21, var20, var2, 0, 0, 12, null);
      val var16: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      val var22: Byte;
      if (var20.isEmpty() xor true) {
         var22 = 0;
      } else {
         var22 = 8;
      }

      var16.setVisibility(var22);
      val var17: ConstraintLayout = this.binding.actionRowComponentViewGroupErrorRow.getRoot();
      q.g(var17, "getRoot(...)");
      var var23: Boolean;
      if (var1.getErrorText() != null) {
         var23 = 1;
      } else {
         var23 = 0;
      }

      if (var23) {
         var23 = 0;
      } else {
         var23 = 8;
      }

      var17.setVisibility(var23);
      val var15: java.lang.String = var1.getErrorText();
      if (var15 != null) {
         val var18: SimpleDraweeView = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         q.g(this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
         ReactAssetUtilsKt.setReactAsset(var18, ReactAsset.Warning);
         val var19: SimpleDraweeView = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         q.g(this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
         ColorUtilsKt.setTintColor(var19, ThemeManagerKt.getTheme().getInfoDangerForeground());
         this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(var15);
         this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setTextColor(ThemeManagerKt.getTheme().getInfoDangerForeground());
      }
   }

   public override fun getComponentType(): KClass<ActionRowComponent> {
      return g0.b(ActionRowComponent.class);
   }

   public override fun onRecycle(componentProvider: ComponentProvider) {
      q.h(var1, "componentProvider");
      val var2: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      MessageComponentsViewKt.recycleChildComponents(var2, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): ComponentView<ActionRowComponent> {
         q.h(var1, "context");
         return new ActionRowComponentView(var1, null, 0, 6, null);
      }
   }
}
