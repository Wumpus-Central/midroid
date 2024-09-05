package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import com.discord.chat.bridge.botuikit.SeparatorDisplayComponent
import com.discord.chat.databinding.MessageComponentSeparatorDisplayViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import vj.p

public class SeparatorDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : LinearLayout,
   ComponentView<SeparatorDisplayComponent> {
   fun SeparatorDisplayComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SeparatorDisplayComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
   }

   public open fun configure(
      component: SeparatorDisplayComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentActionListener");
      q.h(var4, "componentContext");
      val var8: MessageComponentSeparatorDisplayViewBinding = MessageComponentSeparatorDisplayViewBinding.bind(this);
      q.g(var8, "bind(...)");
      var8.divider.setBackgroundColor(ThemeManagerKt.getTheme().getTextMuted());
      val var7: Int = SeparatorDisplayComponentView.WhenMappings.$EnumSwitchMapping$0[var1.getSpacing().ordinal()];
      var var5: Int = 0;
      if (var7 != 1) {
         if (var7 != 2) {
            if (var7 != 3) {
               throw new p();
            }

            var5 = 0;
         } else {
            var5 = SizeUtilsKt.getDpToPx(8);
         }
      }

      val var9: View = var8.divider;
      q.g(var8.divider, "divider");
      val var11: LayoutParams = var9.getLayoutParams();
      if (var11 != null) {
         val var12: MarginLayoutParams = var11 as MarginLayoutParams;
         (var11 as MarginLayoutParams).height = var1.getDivider();
         var12.topMargin = var5;
         var12.bottomMargin = var5;
         var9.setLayoutParams(var12);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      }
   }

   public override fun getComponentType(): KClass<SeparatorDisplayComponent> {
      return g0.b(SeparatorDisplayComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): SeparatorDisplayComponentView {
         q.h(var1, "context");
         q.h(var2, "root");
         val var3: SeparatorDisplayComponentView = MessageComponentSeparatorDisplayViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         q.g(var3, "getRoot(...)");
         return var3;
      }
   }
}
