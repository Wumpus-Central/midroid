package com.discord.chat.bridge.media

import Y9.f
import Y9.n
import ba.G
import ba.N
import ba.Y
import ba.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ContentScanMetadata(version: Int, flags: Long) {
   public final val flags: Long
   public final val version: Int

   init {
      super();
      this.version = var1;
      this.flags = var2;
   }

   public operator fun component1(): Int {
      return this.version;
   }

   public operator fun component2(): Long {
      return this.flags;
   }

   public fun copy(version: Int = var0.version, flags: Long = var0.flags): ContentScanMetadata {
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
            return this.flags == var1.flags;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.version) * 31 + java.lang.Long.hashCode(this.flags);
   }

   public override fun toString(): String {
      val var1: Int = this.version;
      val var2: Long = this.flags;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ContentScanMetadata(version=");
      var4.append(var1);
      var4.append(", flags=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ContentScanMetadata.$serializer = new ContentScanMetadata.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.media.ContentScanMetadata", var0, 2);
         var1.l("version", false);
         var1.l("flags", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{N.a, Y.a};
      }

      public open fun deserialize(decoder: Decoder): ContentScanMetadata {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         val var4: Int;
         var var6: Long;
         if (var9.y()) {
            var2 = var9.k(var8, 0);
            var6 = var9.h(var8, 1);
            var4 = 3;
         } else {
            var6 = 0L;
            var var11: Boolean = true;
            var var3: Int = 0;
            var2 = 0;

            while (var11) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var6 = var9.h(var8, 1);
                     var2 |= 2;
                  } else {
                     var3 = var9.k(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var11 = false;
               }
            }

            var4 = var2;
            var2 = var3;
         }

         var9.b(var8);
         return new ContentScanMetadata(var4, var2, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: ContentScanMetadata) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ContentScanMetadata.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
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
