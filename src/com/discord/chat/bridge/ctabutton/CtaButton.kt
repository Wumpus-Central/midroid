package com.discord.chat.bridge.ctabutton

import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class CtaButton(text: String, textColor: Int? = null, backgroundColor: Int? = null, callback: String? = null) {
   public final val text: String
   public final val textColor: Int?
   public final val backgroundColor: Int?
   public final val callback: String?

   init {
      q.h(var1, "text");
      super();
      this.text = var1;
      this.textColor = var2;
      this.backgroundColor = var3;
      this.callback = var4;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public operator fun component2(): Int? {
      return this.textColor;
   }

   public operator fun component3(): Int? {
      return this.backgroundColor;
   }

   public operator fun component4(): String? {
      return this.callback;
   }

   public fun copy(text: String = var0.text, textColor: Int? = var0.textColor, backgroundColor: Int? = var0.backgroundColor, callback: String? = var0.callback): CtaButton {
      q.h(var1, "text");
      return new CtaButton(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CtaButton) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.textColor, var1.textColor)) {
            return false;
         } else if (!q.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return q.c(this.callback, var1.callback);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.text.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.textColor == null) {
         var1 = 0;
      } else {
         var1 = this.textColor.hashCode();
      }

      val var2: Int;
      if (this.backgroundColor == null) {
         var2 = 0;
      } else {
         var2 = this.backgroundColor.hashCode();
      }

      if (this.callback != null) {
         var3 = this.callback.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.text;
      val var3: Int = this.textColor;
      val var5: Int = this.backgroundColor;
      val var2: java.lang.String = this.callback;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CtaButton(text=");
      var4.append(var1);
      var4.append(", textColor=");
      var4.append(var3);
      var4.append(", backgroundColor=");
      var4.append(var5);
      var4.append(", callback=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CtaButton> {
         return CtaButton.$serializer.INSTANCE;
      }
   }
}
