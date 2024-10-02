package com.discord.chat.bridge.botuikit

import cl.f
import cl.n
import fl.b2
import fl.g0
import fl.h
import fl.n0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class SeparatorDisplayComponent(type: Int, id: String, divider: Boolean, spacing: SeparatorSpacingSize) : Component {
   public final val divider: Boolean
   public open val id: String
   public final val spacing: SeparatorSpacingSize
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var4, "spacing");
      super(null);
      this.type = var1;
      this.id = var2;
      this.divider = var3;
      this.spacing = var4;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): Boolean {
      return this.divider;
   }

   public operator fun component4(): SeparatorSpacingSize {
      return this.spacing;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, divider: Boolean = var0.divider, spacing: SeparatorSpacingSize = var0.spacing): SeparatorDisplayComponent {
      q.h(var2, "id");
      q.h(var4, "spacing");
      return new SeparatorDisplayComponent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.divider != var1.divider) {
            return false;
         } else {
            return this.spacing === var1.spacing;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + java.lang.Boolean.hashCode(this.divider)) * 31 + this.spacing.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var2: Boolean = this.divider;
      val var5: SeparatorSpacingSize = this.spacing;
      val var4: StringBuilder = new StringBuilder();
      var4.append("SeparatorDisplayComponent(type=");
      var4.append(var1);
      var4.append(", id=");
      var4.append(var3);
      var4.append(", divider=");
      var4.append(var2);
      var4.append(", spacing=");
      var4.append(var5);
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
         val var0: SeparatorDisplayComponent.$serializer = new SeparatorDisplayComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("14", var0, 4);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("divider", false);
         var1.l("spacing", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, h.a, SeparatorSpacingSize.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): SeparatorDisplayComponent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: java.lang.String;
         var var10: SeparatorSpacingSize;
         if (var9.y()) {
            var4 = var9.k(var8, 0);
            var7 = var9.t(var8, 1);
            val var2: Byte = var9.s(var8, 2);
            var10 = var9.m(var8, 3, SeparatorSpacingSize.Serializer.INSTANCE, null) as SeparatorSpacingSize;
            var5 = 15;
            var3 = var2;
         } else {
            var var12: Boolean = true;
            var4 = 0;
            var var11: Int = 0;
            var7 = null;
            var10 = null;
            var3 = 0;

            while (var12) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var10 = var9.m(var8, 3, SeparatorSpacingSize.Serializer.INSTANCE, var10) as SeparatorSpacingSize;
                           var11 |= 8;
                        } else {
                           var3 = var9.s(var8, 2);
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.t(var8, 1);
                        var11 |= 2;
                     }
                  } else {
                     var4 = var9.k(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var5 = var11;
         }

         var9.b(var8);
         return new SeparatorDisplayComponent(var5, var4, var7, (boolean)var3, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: SeparatorDisplayComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         SeparatorDisplayComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorDisplayComponent> {
         return SeparatorDisplayComponent.$serializer.INSTANCE;
      }
   }
}
