package com.discord.chat.bridge.media

import aa.f
import aa.n
import ba.a
import da.C0
import da.G
import da.N
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
      val var8: Int = this.url.hashCode();
      val var9: Int = this.proxyUrl.hashCode();
      val var7: Int = this.loadingState.hashCode();
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

      return (((((((var8 * 31 + var9) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.url;
      val var3: java.lang.String = this.proxyUrl;
      val var7: UnfurledMediaLoadingState = this.loadingState;
      val var9: Int = this.height;
      val var2: Int = this.width;
      val var5: java.lang.String = this.contentType;
      val var6: java.lang.String = this.placeholder;
      val var10: Int = this.placeholderVersion;
      val var8: ContentScanMetadata = this.contentScanMetadata;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UnfurledMediaItem(url=");
      var1.append(var4);
      var1.append(", proxyUrl=");
      var1.append(var3);
      var1.append(", loadingState=");
      var1.append(var7);
      var1.append(", height=");
      var1.append(var9);
      var1.append(", width=");
      var1.append(var2);
      var1.append(", contentType=");
      var1.append(var5);
      var1.append(", placeholder=");
      var1.append(var6);
      var1.append(", placeholderVersion=");
      var1.append(var10);
      var1.append(", contentScanMetadata=");
      var1.append(var8);
      var1.append(")");
      return var1.toString();
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
         val var5: C0 = C0.a;
         val var6: N = N.a;
         return new KSerializer[]{
            C0.a,
            C0.a,
            UnfurledMediaLoadingState.Serializer.INSTANCE,
            a.u(N.a),
            a.u(var6),
            a.u(var5),
            a.u(var5),
            a.u(var6),
            a.u(ContentScanMetadata.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): UnfurledMediaItem {
         q.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.c(var18);
         val var6: Boolean = var19.y();
         var var3: Byte = 7;
         var var9: java.lang.String = null;
         var var2: Int;
         var var10: Any;
         var var11: Any;
         var var12: java.lang.String;
         var var13: Any;
         var var14: Any;
         val var15: Int;
         val var16: Any;
         val var22: ContentScanMetadata;
         var var24: Any;
         if (var6) {
            var12 = var19.t(var18, 0);
            var14 = var19.t(var18, 1);
            var16 = var19.m(var18, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, null) as UnfurledMediaLoadingState;
            val var20: N = N.a;
            var13 = var19.v(var18, 3, N.a, null) as Int;
            var11 = var19.v(var18, 4, var20, null) as Int;
            var24 = C0.a;
            var9 = var19.v(var18, 5, C0.a, null) as java.lang.String;
            var24 = var19.v(var18, 6, (DeserializationStrategy)var24, null) as java.lang.String;
            val var21: Int = var19.v(var18, 7, var20, null) as Int;
            val var8: ContentScanMetadata = var19.v(var18, 8, ContentScanMetadata.$serializer.INSTANCE, null) as ContentScanMetadata;
            var2 = 511;
            var10 = var9;
            var15 = var21;
            var22 = var8;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var14 = null;
            var13 = null;
            var12 = null;
            var11 = null;
            var10 = null;
            var var26: Any = null;
            var24 = null;
            var var23: Any = null;

            while (var4) {
               val var5: Int = var19.x(var18);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var9 = var19.t(var18, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var26 = var19.t(var18, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var24 = var19.m(var18, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, var24) as UnfurledMediaLoadingState;
                     var2 |= 4;
                     break;
                  case 3:
                     var23 = var19.v(var18, 3, N.a, var23) as Int;
                     var2 |= 8;
                     break;
                  case 4:
                     var10 = var19.v(var18, 4, N.a, var10) as Int;
                     var2 |= 16;
                     break;
                  case 5:
                     var11 = var19.v(var18, 5, C0.a, var11) as java.lang.String;
                     var2 |= 32;
                     var3 = 7;
                     continue;
                  case 6:
                     var12 = var19.v(var18, 6, C0.a, var12) as java.lang.String;
                     var2 |= 64;
                     continue;
                  case 7:
                     var14 = var19.v(var18, var3, N.a, var14) as Int;
                     var2 |= 128;
                     continue;
                  case 8:
                     var13 = var19.v(var18, 8, ContentScanMetadata.$serializer.INSTANCE, var13) as ContentScanMetadata;
                     var2 |= 256;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 7;
            }

            var16 = var24;
            var22 = (ContentScanMetadata)var13;
            var15 = (Integer)var14;
            var24 = var12;
            var10 = var11;
            var11 = var10;
            var13 = var23;
            var14 = var26;
            var12 = var9;
         }

         var19.b(var18);
         return new UnfurledMediaItem(
            var2,
            var12,
            (java.lang.String)var14,
            (UnfurledMediaLoadingState)var16,
            (Integer)var13,
            (Integer)var11,
            (java.lang.String)var10,
            (java.lang.String)var24,
            var15,
            var22,
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
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
