package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.databinding.MessageComponentsViewBinding
import com.google.android.flexbox.FlexboxLayout
import java.util.ArrayList
import kotlin.jvm.internal.r

public class MessageComponentsView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: MessageComponentsViewBinding

   fun MessageComponentsView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageComponentsView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageComponentsViewBinding = MessageComponentsViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var4, "inflate(LayoutInflater.from(context), this)");
      this.binding = var4;
   }

   public fun setComponents(
      componentProvider: ComponentProvider?,
      components: List<Component>,
      componentContext: ComponentContext,
      actionListener: ComponentActionListener
   ) {
      r.h(var2, "components");
      r.h(var3, "componentContext");
      r.h(var4, "actionListener");
      val var8: ArrayList = new ArrayList(h.t(var2, 10));
      val var9: java.util.Iterator = var2.iterator();

      for (int var5 = 0; var9.hasNext(); var5++) {
         var var13: Any = var9.next();
         if (var5 < 0) {
            h.s();
         }

         val var10: Component = var13 as Component;
         var13 = null;
         if (var1 != null) {
            val var11: FlexboxLayout = this.binding.itemComponentsRoot;
            r.g(this.binding.itemComponentsRoot, "binding.itemComponentsRoot");
            var13 = var11.getChildAt(var5);
            var var6: ComponentView;
            if (var13 is ComponentView) {
               var6 = var13 as ComponentView;
            } else {
               var6 = null;
            }

            label32: {
               if (var6 != null) {
                  var13 = null;
                  if (var6.getComponentType() is Component) {
                     var13 = var6;
                  }

                  var6 = (ComponentView)var13;
                  if (var13 != null) {
                     break label32;
                  }
               }

               var6 = new ComponentInflater(var1.getContext()).inflateComponent(var10, var11);
            }

            var13 = var6;
            if (var6 != null) {
               var6.configure(var10, var1, var4, var3);
               var13 = var6;
            }
         }

         var8.add(var13);
      }

      val var12: FlexboxLayout = this.binding.itemComponentsRoot;
      r.g(this.binding.itemComponentsRoot, "binding.itemComponentsRoot");
      MessageComponentsViewKt.replaceViews(var12, h.X(var8));
   }
}
