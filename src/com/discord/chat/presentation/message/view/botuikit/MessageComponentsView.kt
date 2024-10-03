package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import com.discord.chat.bridge.botuikit.Component
import com.discord.misc.utilities.size.SizeUtilsKt
import java.util.ArrayList
import kotlin.jvm.internal.q

public class MessageComponentsView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout {
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
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
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
      val var8: ArrayList = new ArrayList(i.v(var2, 10));
      val var9: java.util.Iterator = var2.iterator();

      for (int var5 = 0; var9.hasNext(); var5++) {
         var var11: ComponentView = (ComponentView)var9.next();
         if (var5 < 0) {
            i.u();
         }

         val var10: Component = var11 as Component;
         var var6: ComponentView = null;
         if (var1 != null) {
            var11 = this.getChildAt(var5);
            if (var11 is ComponentView) {
               var11 = var11 as ComponentView;
            } else {
               var11 = null;
            }

            label32: {
               if (var11 != null) {
                  var6 = null;
                  if (((ComponentView)var11).getComponentType() is Component) {
                     var6 = (ComponentView)var11;
                  }

                  var11 = var6;
                  if (var6 != null) {
                     break label32;
                  }
               }

               var11 = var1.getInflater().getComponent(var10, this);
            }

            var6 = var11;
            if (var11 != null) {
               var11.configure(var10, var1, var4, var3);
               var6 = var11;
            }
         }

         var8.add(var6);
      }

      MessageComponentsViewKt.replaceViews$default(this, i.b0(var8), var1, SizeUtilsKt.getDpToPx(8), 0, 8, null);
   }
}
