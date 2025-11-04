package com.discord.chat.bridge.embed

import kc.m
import kotlinx.serialization.KSerializer
import p2.b
import xa.l

@m
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
      super();
      this.name = var1;
      this.url = var2;
      this.iconURL = var3;
      this.iconProxyURL = var4;
      this.imageUrl$delegate = l.a(new b(this));
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
      return new EmbedAuthor(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedAuthor) {
         return false;
      } else {
         var1 = var1;
         if (!(this.name == var1.name)) {
            return false;
         } else if (!(this.url == var1.url)) {
            return false;
         } else if (!(this.iconURL == var1.iconURL)) {
            return false;
         } else {
            return this.iconProxyURL == var1.iconProxyURL;
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
      val var3: java.lang.String = this.name;
      val var4: java.lang.String = this.url;
      val var5: java.lang.String = this.iconURL;
      val var1: java.lang.String = this.iconProxyURL;
      val var2: StringBuilder = new StringBuilder();
      var2.append("EmbedAuthor(name=");
      var2.append(var3);
      var2.append(", url=");
      var2.append(var4);
      var2.append(", iconURL=");
      var2.append(var5);
      var2.append(", iconProxyURL=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedAuthor> {
         return EmbedAuthor.$serializer.INSTANCE;
      }
   }
}
