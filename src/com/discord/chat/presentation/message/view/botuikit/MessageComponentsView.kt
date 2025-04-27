package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.util.AttributeSet
import android.view.View.MeasureSpec
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.misc.utilities.size.SizeUtilsKt
import java.util.ArrayList
import kotlin.jvm.internal.q

public class MessageComponentsView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout {
   public final var componentContext: ComponentContext?
      internal set

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

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      val var5: ComponentContext = this.componentContext;
      if (this.componentContext == null) {
         super.onMeasure(var1, var2);
      } else if (MessageAccessoriesView.Companion.getWidth(this.componentContext.getConstrainedWidth(), var5.isForwardedContent()) <= MAX_ALLOWED_WIDTH) {
         super.onMeasure(var1, var2);
      } else {
         super.onMeasure(MeasureSpec.makeMeasureSpec(MAX_ALLOWED_WIDTH, Integer.MIN_VALUE), var2);
      }
   }

   public fun setComponents(components: List<Component>, componentProvider: ComponentProvider?, componentContext: ComponentContext) {
      q.h(var1, "components");
      q.h(var3, "componentContext");
      this.componentContext = var3;
      val var5: ArrayList = new ArrayList(i.v(var1, 10));
      val var6: java.util.Iterator = var1.iterator();

      for (int var4 = 0; var6.hasNext(); var4++) {
         var var7: Any = var6.next();
         if (var4 < 0) {
            i.u();
         }

         var7 = var7 as Component;
         if (var2 != null) {
            var7 = var2.getConfiguredComponentView((Component)var7, var3, this, var4);
         } else {
            var7 = null;
         }

         var5.add(var7);
      }

      MessageComponentsViewKt.replaceViews$default(this, i.c0(var5), var2, SizeUtilsKt.getDpToPx(8), 0, 8, null);
   }

   public companion object {
      private final val MAX_ALLOWED_WIDTH: Int
   }
}
