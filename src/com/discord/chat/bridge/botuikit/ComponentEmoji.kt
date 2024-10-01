package com.discord.chat.bridge.botuikit

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ComponentEmoji(id: String? = null, name: String, src: String? = null, animated: Boolean = false, surrogates: String? = null) {
   public final val animated: Boolean
   public final val id: String?
   public final val name: String
   public final val src: String?
   public final val surrogates: String?

   init {
      q.h(var2, "name");
      super();
      this.id = var1;
      this.name = var2;
      this.src = var3;
      this.animated = var4;
      this.surrogates = var5;
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
      q.h(var2, "name");
      return new ComponentEmoji(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.src, var1.src)) {
            return false;
         } else if (this.animated != var1.animated) {
            return false;
         } else {
            return q.c(this.surrogates, var1.surrogates);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var4: Int = this.name.hashCode();
      val var2: Int;
      if (this.src == null) {
         var2 = 0;
      } else {
         var2 = this.src.hashCode();
      }

      val var5: Int = java.lang.Boolean.hashCode(this.animated);
      if (this.surrogates != null) {
         var3 = this.surrogates.hashCode();
      }

      return (((var1 * 31 + var4) * 31 + var2) * 31 + var5) * 31 + var3;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.id;
      val var4: java.lang.String = this.name;
      val var2: java.lang.String = this.src;
      val var1: Boolean = this.animated;
      val var3: java.lang.String = this.surrogates;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ComponentEmoji(id=");
      var6.append(var5);
      var6.append(", name=");
      var6.append(var4);
      var6.append(", src=");
      var6.append(var2);
      var6.append(", animated=");
      var6.append(var1);
      var6.append(", surrogates=");
      var6.append(var3);
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
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), var1, a.u(var1), h.a, a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ComponentEmoji {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var2: Int;
         var var5: Boolean;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         if (var11.y()) {
            val var6: b2 = b2.a;
            var8 = var11.v(var10, 0, b2.a, null) as java.lang.String;
            var7 = var11.t(var10, 1);
            val var12: java.lang.String = var11.v(var10, 2, var6, null) as java.lang.String;
            var5 = var11.s(var10, 3);
            val var9: java.lang.String = var11.v(var10, 4, var6, null) as java.lang.String;
            var2 = 31;
            var14 = var12;
            var13 = var9;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var8 = null;
            var7 = null;
            var14 = null;
            var13 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var11.v(var10, 4, b2.a, var13) as java.lang.String;
                              var2 |= 16;
                           } else {
                              var5 = var11.s(var10, 3);
                              var2 |= 8;
                           }
                        } else {
                           var14 = var11.v(var10, 2, b2.a, var14) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.v(var10, 0, b2.a, var8) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.b(var10);
         return new ComponentEmoji(var2, var8, var7, var14, var5, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: ComponentEmoji) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ComponentEmoji.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ComponentEmoji> {
         return ComponentEmoji.$serializer.INSTANCE;
      }
   }
}
