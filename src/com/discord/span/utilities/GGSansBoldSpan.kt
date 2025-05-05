package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class GGSansBoldSpan(context: Context) : StyleSpan {
   private final val context: Context

   init {
      q.h(var1, "context");
      super(1);
      this.context = var1;
   }

   private fun apply(paint: Paint, fallback: () -> Unit) {
      val var4: DiscordFont.Companion = DiscordFont.Companion;
      var var3: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      if (var3 != null) {
         var3 = var4.findByStyle(DiscordFont.PrimaryBold.getWeight(), var3.getItalic(), var3.getMonospace());
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var1.setTypeface(var3.typeface(this.context));
      } else {
         var2.invoke();
      }
   }

   public open fun updateDrawState(ds: TextPaint) {
      q.h(var1, "ds");
      this.apply(var1, new Function0(this, var1) {
         final TextPaint $ds;
         final GGSansBoldSpan this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$ds = var2;
         }

         public final void invoke() {
            GGSansBoldSpan.access$updateDrawState$s-485726085(this.this$0, this.$ds);
         }
      });
   }

   public open fun updateMeasureState(paint: TextPaint) {
      q.h(var1, "paint");
      this.apply(var1, new Function0(this, var1) {
         final TextPaint $paint;
         final GGSansBoldSpan this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$paint = var2;
         }

         public final void invoke() {
            GGSansBoldSpan.access$updateMeasureState$s-485726085(this.this$0, this.$paint);
         }
      });
   }
}
