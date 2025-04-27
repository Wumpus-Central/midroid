package com.discord.chat.bridge.media

import ca.f
import ca.n
import da.a
import fa.C0
import fa.G
import fa.N
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class UnfurledMediaItem(url: String,
   proxyUrl: String,
   loadingState: UnfurledMediaLoadingState,
   height: Int? = null,
   width: Int? = null,
   contentType: String? = null,
   placeholder: String? = null,
   placeholderVersion: Int? = null,
   contentScanMetadata: ContentScanMetadata? = null
) {
   public final val contentScanMetadata: ContentScanMetadata?
   public final val contentType: String?
   public final val height: Int?
   public final val loadingState: UnfurledMediaLoadingState
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val proxyUrl: String
   public final val url: String
   public final val width: Int?

   init {
      q.h(var1, "url");
      q.h(var2, "proxyUrl");
      q.h(var3, "loadingState");
      super();
      this.url = var1;
      this.proxyUrl = var2;
      this.loadingState = var3;
      this.height = var4;
      this.width = var5;
      this.contentType = var6;
      this.placeholder = var7;
      this.placeholderVersion = var8;
      this.contentScanMetadata = var9;
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): String {
      return this.proxyUrl;
   }

   public operator fun component3(): UnfurledMediaLoadingState {
      return this.loadingState;
   }

   public operator fun component4(): Int? {
      return this.height;
   }

   public operator fun component5(): Int? {
      return this.width;
   }

   public operator fun component6(): String? {
      return this.contentType;
   }

   public operator fun component7(): String? {
      return this.placeholder;
   }

   public operator fun component8(): Int? {
      return this.placeholderVersion;
   }

   public operator fun component9(): ContentScanMetadata? {
      return this.contentScanMetadata;
   }

   public fun copy(
      url: String = var0.url,
      proxyUrl: String = var0.proxyUrl,
      loadingState: UnfurledMediaLoadingState = var0.loadingState,
      height: Int? = var0.height,
      width: Int? = var0.width,
      contentType: String? = var0.contentType,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion,
      contentScanMetadata: ContentScanMetadata? = var0.contentScanMetadata
   ): UnfurledMediaItem {
      q.h(var1, "url");
      q.h(var2, "proxyUrl");
      q.h(var3, "loadingState");
      return new UnfurledMediaItem(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnfurledMediaItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.proxyUrl, var1.proxyUrl)) {
            return false;
         } else if (this.loadingState != var1.loadingState) {
            return false;
         } else if (!q.c(this.height, var1.height)) {
            return false;
         } else if (!q.c(this.width, var1.width)) {
            return false;
         } else if (!q.c(this.contentType, var1.contentType)) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!q.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else {
            return q.c(this.contentScanMetadata, var1.contentScanMetadata);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.url.hashCode();
      val var9: Int = this.proxyUrl.hashCode();
      val var8: Int = this.loadingState.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.height == null) {
         var1 = 0;
      } else {
         var1 = this.height.hashCode();
      }

      val var2: Int;
      if (this.width == null) {
         var2 = 0;
      } else {
         var2 = this.width.hashCode();
      }

      val var3: Int;
      if (this.contentType == null) {
         var3 = 0;
      } else {
         var3 = this.contentType.hashCode();
      }

      val var4: Int;
      if (this.placeholder == null) {
         var4 = 0;
      } else {
         var4 = this.placeholder.hashCode();
      }

      val var5: Int;
      if (this.placeholderVersion == null) {
         var5 = 0;
      } else {
         var5 = this.placeholderVersion.hashCode();
      }

      if (this.contentScanMetadata != null) {
         var6 = this.contentScanMetadata.hashCode();
      }

      return (((((((var7 * 31 + var9) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.url;
      val var4: java.lang.String = this.proxyUrl;
      val var8: UnfurledMediaLoadingState = this.loadingState;
      val var10: Int = this.height;
      val var6: Int = this.width;
      val var9: java.lang.String = this.contentType;
      val var1: java.lang.String = this.placeholder;
      val var5: Int = this.placeholderVersion;
      val var2: ContentScanMetadata = this.contentScanMetadata;
      val var7: StringBuilder = new StringBuilder();
      var7.append("UnfurledMediaItem(url=");
      var7.append(var3);
      var7.append(", proxyUrl=");
      var7.append(var4);
      var7.append(", loadingState=");
      var7.append(var8);
      var7.append(", height=");
      var7.append(var10);
      var7.append(", width=");
      var7.append(var6);
      var7.append(", contentType=");
      var7.append(var9);
      var7.append(", placeholder=");
      var7.append(var1);
      var7.append(", placeholderVersion=");
      var7.append(var5);
      var7.append(", contentScanMetadata=");
      var7.append(var2);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UnfurledMediaItem.$serializer = new UnfurledMediaItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.media.UnfurledMediaItem", var0, 9);
         var1.l("url", false);
         var1.l("proxyUrl", false);
         var1.l("loadingState", false);
         var1.l("height", true);
         var1.l("width", true);
         var1.l("contentType", true);
         var1.l("placeholder", true);
         var1.l("placeholderVersion", true);
         var1.l("contentScanMetadata", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: C0 = C0.a;
         val var6: N = N.a;
         return new KSerializer[]{
            C0.a,
            C0.a,
            UnfurledMediaLoadingState.Serializer.INSTANCE,
            a.u(N.a),
            a.u(var6),
            a.u(var3),
            a.u(var3),
            a.u(var6),
            a.u(ContentScanMetadata.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): UnfurledMediaItem {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.c(var19);
         val var6: Boolean = var20.y();
         var var3: Byte = 7;
         var var9: java.lang.String = null;
         var var2: Int;
         var var12: Any;
         var var13: Any;
         val var14: java.lang.String;
         val var15: Any;
         val var16: Any;
         val var22: Int;
         var var24: Any;
         var var28: Any;
         var var30: ContentScanMetadata;
         if (var6) {
            var28 = var20.t(var19, 0);
            var13 = var20.t(var19, 1);
            val var11: UnfurledMediaLoadingState = var20.m(var19, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, null) as UnfurledMediaLoadingState;
            val var21: N = N.a;
            var12 = var20.v(var19, 3, N.a, null) as Int;
            var15 = var20.v(var19, 4, var21, null) as Int;
            var24 = C0.a;
            var9 = var20.v(var19, 5, C0.a, null) as java.lang.String;
            var24 = var20.v(var19, 6, (DeserializationStrategy)var24, null) as java.lang.String;
            var22 = var20.v(var19, 7, var21, null) as Int;
            val var8: ContentScanMetadata = var20.v(var19, 8, ContentScanMetadata.$serializer.INSTANCE, null) as ContentScanMetadata;
            var2 = 511;
            var14 = (java.lang.String)var28;
            var28 = var11;
            var16 = var9;
            var30 = var8;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var var35: Int = null;
            var13 = null;
            var12 = null;
            var30 = null;
            var28 = null;
            var var26: Any = null;
            var24 = null;
            var var23: Any = null;

            while (var4) {
               val var5: Int = var20.x(var19);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var9 = var20.t(var19, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var26 = var20.t(var19, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var24 = var20.m(var19, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, var24) as UnfurledMediaLoadingState;
                     var2 |= 4;
                     break;
                  case 3:
                     var23 = var20.v(var19, 3, N.a, var23) as Int;
                     var2 |= 8;
                     break;
                  case 4:
                     var28 = var20.v(var19, 4, N.a, var28) as Int;
                     var2 |= 16;
                     break;
                  case 5:
                     var30 = var20.v(var19, 5, C0.a, var30) as java.lang.String;
                     var2 |= 32;
                     var3 = 7;
                     continue;
                  case 6:
                     var12 = var20.v(var19, 6, C0.a, var12) as java.lang.String;
                     var2 |= 64;
                     continue;
                  case 7:
                     var35 = var20.v(var19, var3, N.a, var35) as Int;
                     var2 |= 128;
                     continue;
                  case 8:
                     var13 = var20.v(var19, 8, ContentScanMetadata.$serializer.INSTANCE, var13) as ContentScanMetadata;
                     var2 |= 256;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 7;
            }

            var30 = (ContentScanMetadata)var13;
            var22 = var35;
            var24 = var12;
            var16 = var30;
            var15 = var28;
            var12 = var23;
            var28 = var24;
            var13 = var26;
            var14 = var9;
         }

         var20.b(var19);
         return new UnfurledMediaItem(
            var2,
            var14,
            (java.lang.String)var13,
            (UnfurledMediaLoadingState)var28,
            (Integer)var12,
            (Integer)var15,
            (java.lang.String)var16,
            (java.lang.String)var24,
            var22,
            var30,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: UnfurledMediaItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UnfurledMediaItem.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
