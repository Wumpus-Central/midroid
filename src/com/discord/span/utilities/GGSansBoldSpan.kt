package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFont.Companion
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
      val var3: Companion = DiscordFont.Companion;
      val var4: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      val var5: DiscordFont;
      if (var4 != null) {
         var5 = var3.findByStyle(DiscordFont.PrimaryBold.getWeight(), var4.getItalic(), var4.getMonospace());
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var1.setTypeface(var5.typeface(this.context));
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
