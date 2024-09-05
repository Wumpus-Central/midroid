package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.ActionRowComponent
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.databinding.MessageComponentActionRowViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentInflater
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
      val var11: MessageComponentActionRowViewBinding = MessageComponentActionRowViewBinding.bind(this);
      q.g(var11, "bind(...)");
      val var9: java.util.List = var1.getComponents();
      val var12: ArrayList = new ArrayList(kotlin.collections.i.u(var9, 10));
      val var13: java.util.Iterator = var9.iterator();

      for (int var5 = 0; var13.hasNext(); var5++) {
         var var27: ComponentView = (ComponentView)var13.next();
         if (var5 < 0) {
            kotlin.collections.i.t();
         }

         val var14: Component = var27 as Component;
         val var15: FlexboxLayout = var11.actionRowComponentViewGroup;
         q.g(var11.actionRowComponentViewGroup, "actionRowComponentViewGroup");
         var27 = var15.getChildAt(var5);
         val var8: Boolean = var27 is ComponentView;
         var var10: ComponentView = null;
         if (var8) {
            var27 = var27 as ComponentView;
         } else {
            var27 = null;
         }

         label52: {
            if (var27 != null) {
               if (((ComponentView)var27).getComponentType() is Component) {
                  var10 = (ComponentView)var27;
               }

               var27 = var10;
               if (var10 != null) {
                  break label52;
               }
            }

            var27 = new ComponentInflater(var2.getContext()).inflateComponent(var14, var15);
         }

         if (var27 != null) {
            var27.configure(var14, var2, var3, var4);
         }

         var12.add(var27);
      }

      val var17: java.util.List = kotlin.collections.i.a0(var12);
      val var21: FlexboxLayout = var11.actionRowComponentViewGroup;
      q.g(var11.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      MessageComponentsViewKt.replaceViews(var21, var17);
      val var22: FlexboxLayout = var11.actionRowComponentViewGroup;
      q.g(var11.actionRowComponentViewGroup, "actionRowComponentViewGroup");
      val var23: Byte;
      if (var17.isEmpty() xor true) {
         var23 = 0;
      } else {
         var23 = 8;
      }

      var22.setVisibility(var23);
      val var18: ConstraintLayout = var11.actionRowComponentViewGroupErrorRow.getRoot();
      q.g(var18, "getRoot(...)");
      var var24: Boolean;
      if (var1.getErrorText() != null) {
         var24 = 1;
      } else {
         var24 = 0;
      }

      if (var24) {
         var24 = 0;
      } else {
         var24 = 8;
      }

      var18.setVisibility(var24);
      val var16: java.lang.String = var1.getErrorText();
      if (var16 != null) {
         val var19: SimpleDraweeView = var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         q.g(var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
         ReactAssetUtilsKt.setReactAsset(var19, ReactAsset.Warning);
         val var20: SimpleDraweeView = var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         q.g(var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "viewInteractionFailedLabelIcon");
         ColorUtilsKt.setTintColor(var20, ThemeManagerKt.getTheme().getInfoDangerForeground());
         var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(var16);
         var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setTextColor(ThemeManagerKt.getTheme().getInfoDangerForeground());
      }
   }

   public override fun getComponentType(): KClass<ActionRowComponent> {
      return g0.b(ActionRowComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): ComponentView<ActionRowComponent> {
         q.h(var1, "context");
         q.h(var2, "root");
         val var3: ActionRowComponentView = MessageComponentActionRowViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         q.g(var3, "getRoot(...)");
         return var3;
      }
   }
}
