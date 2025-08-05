package com.discord.chat.bridge.embed

import A9.j
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import q1.b
import tb.g

@g
public data class EmbedAuthor(name: String, url: String? = null, iconURL: String? = null, iconProxyURL: String? = null) {
   public final val name: String
   public final val url: String?
   public final val iconURL: String?
   public final val iconProxyURL: String?

   public final val imageUrl: String?
      public final get() {
         return this.imageUrl$delegate.getValue() as java.lang.String;
      }


   init {
      r.h(var1, "name");
      super();
      this.name = var1;
      this.url = var2;
      this.iconURL = var3;
      this.iconProxyURL = var4;
      this.imageUrl$delegate = j.b(new b(this));
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: EmbedAuthor): java.lang.String {
      return var0.iconProxyURL;
   }

   @JvmStatic
   fun `imageUrl_delegate$lambda$0`(var0: EmbedAuthor): java.lang.String {
      return var0.iconProxyURL;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public operator fun component2(): String? {
      return this.url;
   }

   public operator fun component3(): String? {
      return this.iconURL;
   }

   public operator fun component4(): String? {
      return this.iconProxyURL;
   }

   public fun copy(name: String = var0.name, url: String? = var0.url, iconURL: String? = var0.iconURL, iconProxyURL: String? = var0.iconProxyURL): EmbedAuthor {
      r.h(var1, "name");
      return new EmbedAuthor(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedAuthor) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.url, var1.url)) {
            return false;
         } else if (!r.c(this.iconURL, var1.iconURL)) {
            return false;
         } else {
            return r.c(this.iconProxyURL, var1.iconProxyURL);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.name.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.url == null) {
         var1 = 0;
      } else {
         var1 = this.url.hashCode();
      }

      val var2: Int;
      if (this.iconURL == null) {
         var2 = 0;
      } else {
         var2 = this.iconURL.hashCode();
      }

      if (this.iconProxyURL != null) {
         var3 = this.iconProxyURL.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.name;
      val var5: java.lang.String = this.url;
      val var3: java.lang.String = this.iconURL;
      val var1: java.lang.String = this.iconProxyURL;
      val var4: StringBuilder = new StringBuilder();
      var4.append("EmbedAuthor(name=");
      var4.append(var2);
      var4.append(", url=");
      var4.append(var5);
      var4.append(", iconURL=");
      var4.append(var3);
      var4.append(", iconProxyURL=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedAuthor> {
         return EmbedAuthor.$serializer.INSTANCE;
      }
   }
}
