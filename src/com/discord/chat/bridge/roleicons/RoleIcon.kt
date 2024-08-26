package com.discord.chat.bridge.roleicons

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0

@f
public data class RoleIcon(source: String? = null, unicodeEmoji: String? = null, name: String, size: Int, alt: String) {
   public final val alt: String
   public final val name: String
   public final val size: Int
   public final val source: String?
   public final val unicodeEmoji: String?

   init {
      r.h(var3, "name");
      r.h(var5, "alt");
      super();
      this.source = var1;
      this.unicodeEmoji = var2;
      this.name = var3;
      this.size = var4;
      this.alt = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: RoleIcon, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.source == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.source);
      }

      label24: {
         if (!var1.A(var2, 1)) {
            var3 = false;
            if (var0.unicodeEmoji == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.unicodeEmoji);
      }

      var1.z(var2, 2, var0.name);
      var1.w(var2, 3, var0.size);
      var1.z(var2, 4, var0.alt);
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
      r.h(var3, "name");
      r.h(var5, "alt");
      return new RoleIcon(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleIcon) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.source, var1.source)) {
            return false;
         } else if (!r.c(this.unicodeEmoji, var1.unicodeEmoji)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (this.size != var1.size) {
            return false;
         } else {
            return r.c(this.alt, var1.alt);
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
      val var5: java.lang.String = this.source;
      val var4: java.lang.String = this.unicodeEmoji;
      val var3: java.lang.String = this.name;
      val var1: Int = this.size;
      val var2: java.lang.String = this.alt;
      val var6: StringBuilder = new StringBuilder();
      var6.append("RoleIcon(source=");
      var6.append(var5);
      var6.append(", unicodeEmoji=");
      var6.append(var4);
      var6.append(", name=");
      var6.append(var3);
      var6.append(", size=");
      var6.append(var1);
      var6.append(", alt=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<RoleIcon> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), var1, m0.a, var1};
      }

      public open fun deserialize(decoder: Decoder): RoleIcon {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: Any;
         var var8: Any;
         var var13: Any;
         if (var11.p()) {
            var13 = a2.a;
            var8 = var11.n(var10, 0, a2.a, null);
            var7 = var11.n(var10, 1, (DeserializationStrategy)var13, null);
            var6 = var11.m(var10, 2);
            var3 = var11.i(var10, 3);
            var13 = var11.m(var10, 4);
            var2 = 31;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var8 = null;
            var7 = null;
            var13 = null;
            var6 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var11.o(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var6 = var11.m(var10, 4);
                              var2 |= 16;
                           } else {
                              var3 = var11.i(var10, 3);
                              var2 |= 8;
                           }
                        } else {
                           var13 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.n(var10, 1, a2.a, var7);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.n(var10, 0, a2.a, var8);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var6 = var13;
            var13 = var6;
         }

         var11.c(var10);
         return new RoleIcon(var2, var8 as java.lang.String, var7 as java.lang.String, (java.lang.String)var6, var3, (java.lang.String)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: RoleIcon) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         RoleIcon.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleIcon> {
         return RoleIcon.$serializer.INSTANCE;
      }
   }
}
