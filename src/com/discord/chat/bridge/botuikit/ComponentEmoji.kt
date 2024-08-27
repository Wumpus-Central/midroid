package com.discord.chat.bridge.botuikit

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
import xk.h

@f
public data class ComponentEmoji(id: String? = null, name: String, src: String? = null, animated: Boolean = false, surrogates: String? = null) {
   public final val animated: Boolean
   public final val id: String?
   public final val name: String
   public final val src: String?
   public final val surrogates: String?

   init {
      r.h(var2, "name");
      super();
      this.id = var1;
      this.name = var2;
      this.src = var3;
      this.animated = var4;
      this.surrogates = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: ComponentEmoji, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.id == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.id);
      }

      var1.z(var2, 1, var0.name);
      if (!var1.A(var2, 2) && var0.src == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.src);
      }

      if (!var1.A(var2, 3) && !var0.animated) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 3, var0.animated);
      }

      label40: {
         if (!var1.A(var2, 4)) {
            var3 = false;
            if (var0.surrogates == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.surrogates);
      }
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component2(): String {
      return this.name;
   }

   public operator fun component3(): String? {
      return this.src;
   }

   public operator fun component4(): Boolean {
      return this.animated;
   }

   public operator fun component5(): String? {
      return this.surrogates;
   }

   public fun copy(
      id: String? = var0.id,
      name: String = var0.name,
      src: String? = var0.src,
      animated: Boolean = var0.animated,
      surrogates: String? = var0.surrogates
   ): ComponentEmoji {
      r.h(var2, "name");
      return new ComponentEmoji(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.src, var1.src)) {
            return false;
         } else if (this.animated != var1.animated) {
            return false;
         } else {
            return r.c(this.surrogates, var1.surrogates);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var6: Int = this.name.hashCode();
      val var2: Int;
      if (this.src == null) {
         var2 = 0;
      } else {
         var2 = this.src.hashCode();
      }

      var var3: Byte = this.animated;
      if (this.animated != 0) {
         var3 = 1;
      }

      if (this.surrogates != null) {
         var4 = this.surrogates.hashCode();
      }

      return (((var1 * 31 + var6) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.id;
      val var2: java.lang.String = this.name;
      val var3: java.lang.String = this.src;
      val var1: Boolean = this.animated;
      val var6: java.lang.String = this.surrogates;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ComponentEmoji(id=");
      var4.append(var5);
      var4.append(", name=");
      var4.append(var2);
      var4.append(", src=");
      var4.append(var3);
      var4.append(", animated=");
      var4.append(var1);
      var4.append(", surrogates=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<ComponentEmoji> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ComponentEmoji.$serializer = new ComponentEmoji.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.ComponentEmoji", var0, 5);
         var1.l("id", true);
         var1.l("name", false);
         var1.l("src", true);
         var1.l("animated", true);
         var1.l("surrogates", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), var1, a.u(var1), h.a, a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ComponentEmoji {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var5: Boolean;
         var var6: Any;
         var var7: java.lang.String;
         var var13: Any;
         var var16: Any;
         if (var12.p()) {
            var16 = a2.a;
            var6 = var12.n(var11, 0, a2.a, null);
            var7 = var12.m(var11, 1);
            var13 = var12.n(var11, 2, (DeserializationStrategy)var16, null);
            var5 = var12.C(var11, 3);
            var16 = var12.n(var11, 4, (DeserializationStrategy)var16, null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var16 = null;
            var7 = null;
            var6 = null;
            var13 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var12.n(var11, 4, a2.a, var13);
                              var2 |= 16;
                           } else {
                              var5 = var12.C(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var12.n(var11, 2, a2.a, var6);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var12.m(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var16 = var12.n(var11, 0, a2.a, var16);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var16 = var13;
            var6 = var16;
            var13 = var6;
         }

         var12.c(var11);
         return new ComponentEmoji(var2, var6 as java.lang.String, var7, var13 as java.lang.String, var5, var16 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: ComponentEmoji) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ComponentEmoji.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ComponentEmoji> {
         return ComponentEmoji.$serializer.INSTANCE;
      }
   }
}
