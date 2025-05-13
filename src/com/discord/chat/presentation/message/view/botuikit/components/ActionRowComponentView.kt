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
import kotlin.jvm.internal.E
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

   public open fun configure(component: ActionRowComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      val var7: java.util.List = var1.getComponents();
      val var6: ArrayList = new ArrayList(i.v(var7, 10));
      val var20: java.util.Iterator = var7.iterator();

      for (int var4 = 0; var20.hasNext(); var4++) {
         var var8: Any = var20.next();
         if (var4 < 0) {
            i.u();
         }

         var8 = var8 as Component;
         val var9: FlexboxLayout = this.binding.actionRowComponentViewGroup;
         q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
         var6.add(var2.getConfiguredComponentView((Component)var8, var3, var9, var4));
      }

      val var15: java.util.List = i.c0(var6);
      val var19: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      MessageComponentsViewKt.replaceViews$default(var19, var15, var2, 0, 0, 12, null);
      val var11: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      q.g(this.binding.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      val var16: Byte;
      if (!var15.isEmpty()) {
         var16 = 0;
      } else {
         var16 = 8;
      }

      var11.setVisibility(var16);
      val var12: ConstraintLayout = this.binding.actionRowComponentViewGroupErrorRow.getRoot();
      q.g(var12, "getRoot(...)");
      var var17: Boolean;
      if (var1.getErrorText() != null) {
         var17 = 1;
      } else {
         var17 = 0;
      }

      if (var17) {
         var17 = 0;
      } else {
         var17 = 8;
      }

      var12.setVisibility(var17);
      val var10: java.lang.String = var1.getErrorText();
      if (var10 != null) {
         val var13: SimpleDraweeView = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         q.g(this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
         ReactAssetUtilsKt.setReactAsset(var13, ReactAsset.Warning);
         val var14: SimpleDraweeView = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         q.g(this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
         ColorUtilsKt.setTintColor(var14, ThemeManagerKt.getTheme().getInfoDangerForeground());
         this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(var10);
         this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setTextColor(ThemeManagerKt.getTheme().getInfoDangerForeground());
      }
   }

   public override fun getComponentType(): KClass<ActionRowComponent> {
      return E.b(ActionRowComponent.class);
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
