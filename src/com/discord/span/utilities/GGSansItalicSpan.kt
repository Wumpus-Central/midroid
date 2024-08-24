package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFont.Companion
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

public class GGSansItalicSpan(context: Context) : StyleSpan {
   private final val context: Context

   init {
      r.h(var1, "context");
      super(2);
      this.context = var1;
   }

   private fun apply(paint: Paint, fallback: () -> Unit) {
      val var6: Companion = DiscordFont.Companion;
      var var5: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      var var3: Typeface = null;
      if (var5 != null) {
         var5 = Companion.findByStyle$default(var6, var5.getWeight(), true, false, 4, null);
         var3 = null;
         if (var5 != null) {
            var3 = var5.typeface(this.context);
         }
      }

      if (var3 != null) {
         var1.setTypeface(var3);
      } else {
         var2.invoke();
      }
   }

   public open fun updateDrawState(ds: TextPaint) {
      r.h(var1, "ds");
      this.apply(var1, new Function0<Unit>(this, var1) {
         final TextPaint $ds;
         final GGSansItalicSpan this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$ds = var2;
         }

         public final void invoke() {
            GGSansItalicSpan.access$updateDrawState$s-485726085(this.this$0, this.$ds);
         }
      });
   }

   public open fun updateMeasureState(paint: TextPaint) {
      r.h(var1, "paint");
      this.apply(var1, new Function0<Unit>(this, var1) {
         final TextPaint $paint;
         final GGSansItalicSpan this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$paint = var2;
         }

         public final void invoke() {
            GGSansItalicSpan.access$updateMeasureState$s-485726085(this.this$0, this.$paint);
         }
      });
   }
}
