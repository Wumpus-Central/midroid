package com.discord.chat.bridge.ctabutton

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class CtaButton(text: String, textColor: Int? = null, backgroundColor: Int? = null, callback: String? = null) {
   public final val text: String
   public final val textColor: Int?
   public final val backgroundColor: Int?
   public final val callback: String?

   init {
      r.h(var1, "text");
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
      r.h(var1, "text");
      return new CtaButton(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CtaButton) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.textColor, var1.textColor)) {
            return false;
         } else if (!r.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return r.c(this.callback, var1.callback);
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
      val var2: java.lang.String = this.text;
      val var4: Int = this.textColor;
      val var5: Int = this.backgroundColor;
      val var3: java.lang.String = this.callback;
      val var1: StringBuilder = new StringBuilder();
      var1.append("CtaButton(text=");
      var1.append(var2);
      var1.append(", textColor=");
      var1.append(var4);
      var1.append(", backgroundColor=");
      var1.append(var5);
      var1.append(", callback=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CtaButton> {
         return CtaButton.$serializer.INSTANCE;
      }
   }
}
