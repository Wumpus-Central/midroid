package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.databinding.MessageComponentsViewBinding
import com.google.android.flexbox.FlexboxLayout
import java.util.ArrayList
import kotlin.jvm.internal.q

public class MessageComponentsView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: MessageComponentsViewBinding

   fun MessageComponentsView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageComponentsView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageComponentsViewBinding = MessageComponentsViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
   }

   public fun setComponents(
      componentProvider: ComponentProvider?,
      components: List<Component>,
      componentContext: ComponentContext,
      actionListener: ComponentActionListener
   ) {
      q.h(var2, "components");
      q.h(var3, "componentContext");
      q.h(var4, "actionListener");
      val var8: ArrayList = new ArrayList(i.u(var2, 10));
      val var9: java.util.Iterator = var2.iterator();

      for (int var5 = 0; var9.hasNext(); var5++) {
         var var14: ComponentView = (ComponentView)var9.next();
         if (var5 < 0) {
            i.t();
         }

         val var10: Component = var14 as Component;
         var var6: ComponentView = null;
         if (var1 != null) {
            val var11: FlexboxLayout = this.binding.itemComponentsRoot;
            q.g(this.binding.itemComponentsRoot, "itemComponentsRoot");
            var14 = var11.getChildAt(var5);
            if (var14 is ComponentView) {
               var14 = var14 as ComponentView;
            } else {
               var14 = null;
            }

            label32: {
               if (var14 != null) {
                  var6 = null;
                  if (((ComponentView)var14).getComponentType() is Component) {
                     var6 = (ComponentView)var14;
                  }

                  var14 = var6;
                  if (var6 != null) {
                     break label32;
                  }
               }

               var14 = new ComponentInflater(var1.getContext()).inflateComponent(var10, var11);
            }

            var6 = var14;
            if (var14 != null) {
               var14.configure(var10, var1, var4, var3);
               var6 = var14;
            }
         }

         var8.add(var6);
      }

      val var12: FlexboxLayout = this.binding.itemComponentsRoot;
      q.g(this.binding.itemComponentsRoot, "itemComponentsRoot");
      MessageComponentsViewKt.replaceViews(var12, i.a0(var8));
   }
}
