package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.f0.a

@f
public data class SeparatorDisplayComponent(type: Int, id: String, divider: Boolean, spacing: SeparatorSpacingSize) : Component {
   public final val divider: Boolean
   public open val id: String
   public final val spacing: SeparatorSpacingSize
   public open val type: Int

   init {
      r.h(var2, "id");
      r.h(var4, "spacing");
      super(null);
      this.type = var1;
      this.id = var2;
      this.divider = var3;
      this.spacing = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: SeparatorDisplayComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getType());
      var1.z(var2, 1, var0.getId());
      var1.x(var2, 2, var0.divider);
      var1.y(var2, 3, SeparatorSpacingSize.Serializer.INSTANCE, var0.spacing);
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): Boolean {
      return this.divider;
   }

   public operator fun component4(): SeparatorSpacingSize {
      return this.spacing;
   }

   public fun copy(type: Int = var0.getType(), id: String = var0.getId(), divider: Boolean = var0.divider, spacing: SeparatorSpacingSize = var0.spacing): SeparatorDisplayComponent {
      r.h(var2, "id");
      r.h(var4, "spacing");
      return new SeparatorDisplayComponent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (this.divider != var1.divider) {
            return false;
         } else {
            return this.spacing === var1.spacing;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.getType());
      val var4: Int = this.getId().hashCode();
      var var1: Byte = this.divider;
      if (this.divider != 0) {
         var1 = 1;
      }

      return ((var3 * 31 + var4) * 31 + var1) * 31 + this.spacing.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var4: java.lang.String = this.getId();
      val var2: Boolean = this.divider;
      val var3: SeparatorSpacingSize = this.spacing;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SeparatorDisplayComponent(type=");
      var5.append(var1);
      var5.append(", id=");
      var5.append(var4);
      var5.append(", divider=");
      var5.append(var2);
      var5.append(", spacing=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<SeparatorDisplayComponent> {
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
         return new KSerializer[]{m0.a, a2.a, h.a, SeparatorSpacingSize.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): SeparatorDisplayComponent {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: Any;
         val var11: java.lang.String;
         if (var10.p()) {
            var4 = var10.i(var9, 0);
            var11 = var10.m(var9, 1);
            var2 = var10.C(var9, 2);
            var7 = var10.y(var9, 3, SeparatorSpacingSize.Serializer.INSTANCE, null);
            var3 = 15;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var7 = null;
            var var12: Any = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var10.o(var9);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var12 = var10.y(var9, 3, SeparatorSpacingSize.Serializer.INSTANCE, var12);
                           var2 |= 8;
                        } else {
                           var3 = var10.C(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var4 = var10.i(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }

            var3 = var2;
            var2 = var3;
            var11 = (java.lang.String)var7;
            var7 = var12;
         }

         var10.c(var9);
         return new SeparatorDisplayComponent(var3, var4, var11, (boolean)var2, var7 as SeparatorSpacingSize, null);
      }

      public open fun serialize(encoder: Encoder, value: SeparatorDisplayComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SeparatorDisplayComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorDisplayComponent> {
         return SeparatorDisplayComponent.$serializer.INSTANCE;
      }
   }
}
