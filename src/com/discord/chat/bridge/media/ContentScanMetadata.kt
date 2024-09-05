package com.discord.chat.bridge.media

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.n0
import qn.x0
import qn.g0.a

@f
public data class ContentScanMetadata(version: Int, contentFlags: Long) {
   public final val contentFlags: Long
   public final val version: Int

   init {
      super();
      this.version = var1;
      this.contentFlags = var2;
   }

   public operator fun component1(): Int {
      return this.version;
   }

   public operator fun component2(): Long {
      return this.contentFlags;
   }

   public fun copy(version: Int = var0.version, contentFlags: Long = var0.contentFlags): ContentScanMetadata {
      return new ContentScanMetadata(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentScanMetadata) {
         return false;
      } else {
         var1 = var1;
         if (this.version != var1.version) {
            return false;
         } else {
            return this.contentFlags == var1.contentFlags;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.version) * 31 + java.lang.Long.hashCode(this.contentFlags);
   }

   public override fun toString(): String {
      val var1: Int = this.version;
      val var2: Long = this.contentFlags;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ContentScanMetadata(version=");
      var4.append(var1);
      var4.append(", contentFlags=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ContentScanMetadata.$serializer = new ContentScanMetadata.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.media.ContentScanMetadata", var0, 2);
         var1.c("version", false);
         var1.c("contentFlags", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, x0.a};
      }

      public open fun deserialize(decoder: Decoder): ContentScanMetadata {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var6: Long;
         if (var9.p()) {
            var2 = var9.i(var8, 0);
            var6 = var9.f(var8, 1);
            var3 = 3;
         } else {
            var6 = 0L;
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var6 = var9.f(var8, 1);
                     var2 |= 2;
                  } else {
                     var3 = var9.i(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var2 = var3;
            var3 = var2;
         }

         var9.c(var8);
         return new ContentScanMetadata(var3, var2, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: ContentScanMetadata) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ContentScanMetadata.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentScanMetadata> {
         return ContentScanMetadata.$serializer.INSTANCE;
      }
   }
}
