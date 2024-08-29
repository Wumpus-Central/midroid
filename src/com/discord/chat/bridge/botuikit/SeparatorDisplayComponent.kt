package com.discord.chat.bridge.botuikit

import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.h
import gn.n0
import gn.g0.a
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
      val var5: java.lang.String = this.id;
      val var2: Boolean = this.divider;
      val var4: SeparatorSpacingSize = this.spacing;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SeparatorDisplayComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var5);
      var3.append(", divider=");
      var3.append(var2);
      var3.append(", spacing=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
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
         val var9: c = var1.b(var8);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: java.lang.String;
         var var10: SeparatorSpacingSize;
         if (var9.p()) {
            val var2: Int = var9.i(var8, 0);
            var7 = var9.m(var8, 1);
            var5 = var9.C(var8, 2);
            var10 = var9.y(var8, 3, SeparatorSpacingSize.Serializer.INSTANCE, null) as SeparatorSpacingSize;
            var3 = 15;
            var4 = var2;
         } else {
            var var13: Boolean = true;
            var4 = 0;
            var var11: Int = 0;
            var7 = null;
            var10 = null;
            var3 = 0;

            while (var13) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var10 = var9.y(var8, 3, SeparatorSpacingSize.Serializer.INSTANCE, var10) as SeparatorSpacingSize;
                           var11 |= 8;
                        } else {
                           var3 = var9.C(var8, 2);
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.m(var8, 1);
                        var11 |= 2;
                     }
                  } else {
                     var4 = var9.i(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var5 = var3;
            var3 = var11;
         }

         var9.c(var8);
         return new SeparatorDisplayComponent(var3, var4, var7, (boolean)var5, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: SeparatorDisplayComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SeparatorDisplayComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
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
