package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
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
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass

public class ActionRowComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : LinearLayout,
   ComponentView<ActionRowComponent> {
   fun ActionRowComponentView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActionRowComponentView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
   }

   public open fun configure(
      component: ActionRowComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentActionListener");
      r.h(var4, "componentContext");
      val var11: MessageComponentActionRowViewBinding = MessageComponentActionRowViewBinding.bind(this);
      r.g(var11, "bind(this)");
      val var9: java.util.List = var1.getComponents();
      val var12: ArrayList = new ArrayList(kotlin.collections.h.t(var9, 10));
      val var13: java.util.Iterator = var9.iterator();

      for (int var5 = 0; var13.hasNext(); var5++) {
         var var27: Any = var13.next();
         if (var5 < 0) {
            kotlin.collections.h.s();
         }

         val var14: Component = var27 as Component;
         val var15: FlexboxLayout = var11.actionRowComponentViewGroup;
         r.g(var11.actionRowComponentViewGroup, "binding.actionRowComponentViewGroup");
         val var10: View = var15.getChildAt(var5);
         val var8: Boolean = var10 is ComponentView;
         var27 = null;
         val var29: ComponentView;
         if (var8) {
            var29 = var10 as ComponentView;
         } else {
            var29 = null;
         }

         label52: {
            if (var29 != null) {
               if (var29.getComponentType() is Component) {
                  var27 = var29;
               }

               var30 = (ComponentView)var27;
               if (var27 != null) {
                  break label52;
               }
            }

            var30 = new ComponentInflater(var2.getContext()).inflateComponent(var14, var15);
         }

         if (var30 != null) {
            var30.configure(var14, var2, var3, var4);
         }

         var12.add(var30);
      }

      val var17: java.util.List = kotlin.collections.h.W(var12);
      val var21: FlexboxLayout = var11.actionRowComponentViewGroup;
      r.g(var11.actionRowComponentViewGroup, "binding.actionRowComponentViewGroup");
      MessageComponentsViewKt.replaceViews(var21, var17);
      val var22: FlexboxLayout = var11.actionRowComponentViewGroup;
      r.g(var11.actionRowComponentViewGroup, "binding.actionRowComponentViewGroup");
      val var23: Byte;
      if (var17.isEmpty() xor true) {
         var23 = 0;
      } else {
         var23 = 8;
      }

      var22.setVisibility(var23);
      val var18: ConstraintLayout = var11.actionRowComponentViewGroupErrorRow.getRoot();
      r.g(var18, "binding.actionRowComponentViewGroupErrorRow.root");
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
         r.g(var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "binding.actionRowCompone…nteractionFailedLabelIcon");
         ReactAssetUtilsKt.setReactAsset(var19, ReactAsset.Warning);
         val var20: SimpleDraweeView = var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         r.g(var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon, "binding.actionRowCompone…nteractionFailedLabelIcon");
         ColorUtilsKt.setTintColor(var20, ThemeManagerKt.getTheme().getInfoDangerForeground());
         var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(var16);
         var11.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setTextColor(ThemeManagerKt.getTheme().getInfoDangerForeground());
      }
   }

   public override fun getComponentType(): KClass<ActionRowComponent> {
      return h0.b(ActionRowComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): ComponentView<ActionRowComponent> {
         r.h(var1, "context");
         r.h(var2, "root");
         val var3: ActionRowComponentView = MessageComponentActionRowViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         r.g(var3, "inflate(\n               …false,\n            ).root");
         return var3;
      }
   }
}
