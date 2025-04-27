package com.discord.chat.bridge.media

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
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
      val var8: Int = this.proxyUrl.hashCode();
      val var9: Int = this.loadingState.hashCode();
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

      return (((((((var7 * 31 + var8) * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var7: java.lang.String = this.url;
      val var3: java.lang.String = this.proxyUrl;
      val var4: UnfurledMediaLoadingState = this.loadingState;
      val var5: Int = this.height;
      val var1: Int = this.width;
      val var2: java.lang.String = this.contentType;
      val var8: java.lang.String = this.placeholder;
      val var6: Int = this.placeholderVersion;
      val var9: ContentScanMetadata = this.contentScanMetadata;
      val var10: StringBuilder = new StringBuilder();
      var10.append("UnfurledMediaItem(url=");
      var10.append(var7);
      var10.append(", proxyUrl=");
      var10.append(var3);
      var10.append(", loadingState=");
      var10.append(var4);
      var10.append(", height=");
      var10.append(var5);
      var10.append(", width=");
      var10.append(var1);
      var10.append(", contentType=");
      var10.append(var2);
      var10.append(", placeholder=");
      var10.append(var8);
      var10.append(", placeholderVersion=");
      var10.append(var6);
      var10.append(", contentScanMetadata=");
      var10.append(var9);
      var10.append(")");
      return var10.toString();
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
         val var2: C0 = C0.a;
         val var6: N = N.a;
         return new KSerializer[]{
            C0.a,
            C0.a,
            UnfurledMediaLoadingState.Serializer.INSTANCE,
            a.u(N.a),
            a.u(var6),
            a.u(var2),
            a.u(var2),
            a.u(var6),
            a.u(ContentScanMetadata.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): UnfurledMediaItem {
         q.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.c(var17);
         val var6: Boolean = var18.y();
         var var3: Byte = 7;
         var var9: java.lang.String = null;
         var var2: Int;
         var var10: Any;
         var var11: Any;
         var var12: java.lang.String;
         var var13: Any;
         var var14: Int;
         val var15: Any;
         val var16: Any;
         val var21: ContentScanMetadata;
         var var23: Any;
         if (var6) {
            var12 = var18.t(var17, 0);
            var15 = var18.t(var17, 1);
            var16 = var18.m(var17, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, null) as UnfurledMediaLoadingState;
            val var19: N = N.a;
            var13 = var18.v(var17, 3, N.a, null) as Int;
            var10 = var18.v(var17, 4, var19, null) as Int;
            var23 = C0.a;
            var9 = var18.v(var17, 5, C0.a, null) as java.lang.String;
            var23 = var18.v(var17, 6, (DeserializationStrategy)var23, null) as java.lang.String;
            val var20: Int = var18.v(var17, 7, var19, null) as Int;
            val var8: ContentScanMetadata = var18.v(var17, 8, ContentScanMetadata.$serializer.INSTANCE, null) as ContentScanMetadata;
            var2 = 511;
            var11 = var9;
            var14 = var20;
            var21 = var8;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var14 = null;
            var13 = null;
            var12 = null;
            var11 = null;
            var10 = null;
            var var25: Any = null;
            var23 = null;
            var var22: Any = null;

            while (var4) {
               val var5: Int = var18.x(var17);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var9 = var18.t(var17, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var25 = var18.t(var17, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var23 = var18.m(var17, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, var23) as UnfurledMediaLoadingState;
                     var2 |= 4;
                     break;
                  case 3:
                     var22 = var18.v(var17, 3, N.a, var22) as Int;
                     var2 |= 8;
                     break;
                  case 4:
                     var10 = var18.v(var17, 4, N.a, var10) as Int;
                     var2 |= 16;
                     break;
                  case 5:
                     var11 = var18.v(var17, 5, C0.a, var11) as java.lang.String;
                     var2 |= 32;
                     var3 = 7;
                     continue;
                  case 6:
                     var12 = var18.v(var17, 6, C0.a, var12) as java.lang.String;
                     var2 |= 64;
                     continue;
                  case 7:
                     var14 = var18.v(var17, var3, N.a, var14) as Int;
                     var2 |= 128;
                     continue;
                  case 8:
                     var13 = var18.v(var17, 8, ContentScanMetadata.$serializer.INSTANCE, var13) as ContentScanMetadata;
                     var2 |= 256;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 7;
            }

            var16 = var23;
            var21 = (ContentScanMetadata)var13;
            var23 = var12;
            var13 = var22;
            var15 = var25;
            var12 = var9;
         }

         var18.b(var17);
         return new UnfurledMediaItem(
            var2,
            var12,
            (java.lang.String)var15,
            (UnfurledMediaLoadingState)var16,
            (Integer)var13,
            (Integer)var10,
            (java.lang.String)var11,
            (java.lang.String)var23,
            var14,
            var21,
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnfurledMediaItem> {
         return UnfurledMediaItem.$serializer.INSTANCE;
      }
   }
}
