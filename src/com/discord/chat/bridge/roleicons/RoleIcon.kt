package com.discord.chat.bridge.roleicons

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0
import yk.n0

@f
public data class RoleIcon(source: String? = null, unicodeEmoji: String? = null, name: String, size: Int, alt: String) {
   public final val alt: String
   public final val name: String
   public final val size: Int
   public final val source: String?
   public final val unicodeEmoji: String?

   init {
      q.h(var3, "name");
      q.h(var5, "alt");
      super();
      this.source = var1;
      this.unicodeEmoji = var2;
      this.name = var3;
      this.size = var4;
      this.alt = var5;
   }

   public operator fun component1(): String? {
      return this.source;
   }

   public operator fun component2(): String? {
      return this.unicodeEmoji;
   }

   public operator fun component3(): String {
      return this.name;
   }

   public operator fun component4(): Int {
      return this.size;
   }

   public operator fun component5(): String {
      return this.alt;
   }

   public fun copy(
      source: String? = var0.source,
      unicodeEmoji: String? = var0.unicodeEmoji,
      name: String = var0.name,
      size: Int = var0.size,
      alt: String = var0.alt
   ): RoleIcon {
      q.h(var3, "name");
      q.h(var5, "alt");
      return new RoleIcon(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleIcon) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.source, var1.source)) {
            return false;
         } else if (!q.c(this.unicodeEmoji, var1.unicodeEmoji)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (this.size != var1.size) {
            return false;
         } else {
            return q.c(this.alt, var1.alt);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.source == null) {
         var1 = 0;
      } else {
         var1 = this.source.hashCode();
      }

      if (this.unicodeEmoji != null) {
         var2 = this.unicodeEmoji.hashCode();
      }

      return (((var1 * 31 + var2) * 31 + this.name.hashCode()) * 31 + Integer.hashCode(this.size)) * 31 + this.alt.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.source;
      val var2: java.lang.String = this.unicodeEmoji;
      val var3: java.lang.String = this.name;
      val var1: Int = this.size;
      val var5: java.lang.String = this.alt;
      val var6: StringBuilder = new StringBuilder();
      var6.append("RoleIcon(source=");
      var6.append(var4);
      var6.append(", unicodeEmoji=");
      var6.append(var2);
      var6.append(", name=");
      var6.append(var3);
      var6.append(", size=");
      var6.append(var1);
      var6.append(", alt=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: RoleIcon.$serializer = new RoleIcon.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.roleicons.RoleIcon", var0, 5);
         var1.l("source", true);
         var1.l("unicodeEmoji", true);
         var1.l("name", false);
         var1.l("size", false);
         var1.l("alt", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1), var1, n0.a, var1};
      }

      public open fun deserialize(decoder: Decoder): RoleIcon {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var3: Int;
         val var4: Int;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var13: java.lang.String;
         var var17: java.lang.String;
         if (var11.y()) {
            val var12: b2 = b2.a;
            var8 = var11.v(var10, 0, b2.a, null) as java.lang.String;
            var17 = var11.v(var10, 1, var12, null) as java.lang.String;
            val var9: java.lang.String = var11.t(var10, 2);
            val var2: Int = var11.k(var10, 3);
            var13 = var11.t(var10, 4);
            var3 = 31;
            var7 = var17;
            var17 = var9;
            var4 = var2;
         } else {
            var var16: Boolean = true;
            var3 = 0;
            var8 = null;
            var7 = null;
            var17 = null;
            var13 = null;
            var var14: Int = 0;

            while (var16) {
               val var5: Int = var11.x(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var13 = var11.t(var10, 4);
                              var14 |= 16;
                           } else {
                              var3 = var11.k(var10, 3);
                              var14 |= 8;
                           }
                        } else {
                           var17 = var11.t(var10, 2);
                           var14 |= 4;
                        }
                     } else {
                        var7 = var11.v(var10, 1, b2.a, var7) as java.lang.String;
                        var14 |= 2;
                     }
                  } else {
                     var8 = var11.v(var10, 0, b2.a, var8) as java.lang.String;
                     var14 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var4 = var3;
            var3 = var14;
         }

         var11.b(var10);
         return new RoleIcon(var3, var8, var7, var17, var4, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: RoleIcon) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         RoleIcon.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleIcon> {
         return RoleIcon.$serializer.INSTANCE;
      }
   }
}
