package com.discord.chat.bridge.embed

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import q1.d
import sb.f
import z9.j

@f
public data class EmbedFooter(iconURL: String? = null, iconProxyURL: String? = null, content: String? = null) {
   public final val iconURL: String?
   public final val iconProxyURL: String?
   public final val content: String?

   public final val imageUrl: String?
      public final get() {
         return this.imageUrl$delegate.getValue() as java.lang.String;
      }


   fun EmbedFooter() {
      this(null, null, null, 7, null);
   }

   init {
      this.iconURL = var1;
      this.iconProxyURL = var2;
      this.content = var3;
      this.imageUrl$delegate = j.a(new d(this));
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: EmbedFooter): java.lang.String {
      return var0.iconProxyURL;
   }

   @JvmStatic
   fun `imageUrl_delegate$lambda$0`(var0: EmbedFooter): java.lang.String {
      return var0.iconProxyURL;
   }

   public operator fun component1(): String? {
      return this.iconURL;
   }

   public operator fun component2(): String? {
      return this.iconProxyURL;
   }

   public operator fun component3(): String? {
      return this.content;
   }

   public fun copy(iconURL: String? = var0.iconURL, iconProxyURL: String? = var0.iconProxyURL, content: String? = var0.content): EmbedFooter {
      return new EmbedFooter(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedFooter) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.iconURL, var1.iconURL)) {
            return false;
         } else if (!r.c(this.iconProxyURL, var1.iconProxyURL)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.iconURL == null) {
         var1 = 0;
      } else {
         var1 = this.iconURL.hashCode();
      }

      val var2: Int;
      if (this.iconProxyURL == null) {
         var2 = 0;
      } else {
         var2 = this.iconProxyURL.hashCode();
      }

      if (this.content != null) {
         var3 = this.content.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.iconURL;
      val var2: java.lang.String = this.iconProxyURL;
      val var1: java.lang.String = this.content;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EmbedFooter(iconURL=");
      var3.append(var4);
      var3.append(", iconProxyURL=");
      var3.append(var2);
      var3.append(", content=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedFooter> {
         return EmbedFooter.$serializer.INSTANCE;
      }
   }
}
