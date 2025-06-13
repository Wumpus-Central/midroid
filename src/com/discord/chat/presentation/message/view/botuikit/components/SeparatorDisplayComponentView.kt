package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import com.discord.chat.bridge.botuikit.SeparatorDisplayComponent
import com.discord.chat.databinding.MessageComponentSeparatorDisplayViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import t9.n

public class SeparatorDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : LinearLayout,
   ComponentView<SeparatorDisplayComponent> {
   public final val binding: MessageComponentSeparatorDisplayViewBinding

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
      val var4: MessageComponentSeparatorDisplayViewBinding = MessageComponentSeparatorDisplayViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.setLayoutParams(new LayoutParams(-1, -2));
   }

   public open fun configure(component: SeparatorDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      this.binding.divider.setBackgroundColor(ThemeManagerKt.getTheme().getTextMuted());
      val var6: Int = SeparatorDisplayComponentView.WhenMappings.$EnumSwitchMapping$0[var1.getSpacing().ordinal()];
      var var4: Int = 0;
      if (var6 != 1) {
         if (var6 != 2) {
            if (var6 != 3) {
               throw new n();
            }

            var4 = 0;
         } else {
            var4 = SizeUtilsKt.getDpToPx(8);
         }
      }

      val var8: View = this.binding.divider;
      q.g(this.binding.divider, "divider");
      val var9: android.view.ViewGroup.LayoutParams = var8.getLayoutParams();
      if (var9 != null) {
         val var10: MarginLayoutParams = var9 as MarginLayoutParams;
         (var9 as MarginLayoutParams).height = var1.getDivider();
         var10.topMargin = var4;
         var10.bottomMargin = var4;
         var8.setLayoutParams(var10);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      }
   }

   public override fun getComponentType(): KClass<SeparatorDisplayComponent> {
      return G.b(SeparatorDisplayComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): SeparatorDisplayComponentView {
         q.h(var1, "context");
         return new SeparatorDisplayComponentView(var1, null, 0, 6, null);
      }
   }
}
