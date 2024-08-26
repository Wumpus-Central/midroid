package com.discord.safearea.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
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
import xk.e0
import xk.f0
import xk.f0.a

@f
internal data class OnSafeAreaInsetsDidChangeData(top: Float, bottom: Float, left: Float, right: Float, imeInsetsBottom: Float) : ReactEvent {
   public final val bottom: Float
   public final val imeInsetsBottom: Float
   public final val left: Float
   public final val right: Float
   public final val top: Float

   init {
      this.top = var1;
      this.bottom = var2;
      this.left = var3;
      this.right = var4;
      this.imeInsetsBottom = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: OnSafeAreaInsetsDidChangeData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.r(var2, 0, var0.top);
      var1.r(var2, 1, var0.bottom);
      var1.r(var2, 2, var0.left);
      var1.r(var2, 3, var0.right);
      var1.r(var2, 4, var0.imeInsetsBottom);
   }

   public operator fun component1(): Float {
      return this.top;
   }

   public operator fun component2(): Float {
      return this.bottom;
   }

   public operator fun component3(): Float {
      return this.left;
   }

   public operator fun component4(): Float {
      return this.right;
   }

   public operator fun component5(): Float {
      return this.imeInsetsBottom;
   }

   public fun copy(
      top: Float = var0.top,
      bottom: Float = var0.bottom,
      left: Float = var0.left,
      right: Float = var0.right,
      imeInsetsBottom: Float = var0.imeInsetsBottom
   ): OnSafeAreaInsetsDidChangeData {
      return new OnSafeAreaInsetsDidChangeData(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnSafeAreaInsetsDidChangeData) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.top, var1.top) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.bottom, var1.bottom) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.left, var1.left) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.right, var1.right) != 0) {
            return false;
         } else {
            return java.lang.Float.compare(this.imeInsetsBottom, var1.imeInsetsBottom) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               ((java.lang.Float.hashCode(this.top) * 31 + java.lang.Float.hashCode(this.bottom)) * 31 + java.lang.Float.hashCode(this.left)) * 31
                  + java.lang.Float.hashCode(this.right)
            )
            * 31
         + java.lang.Float.hashCode(this.imeInsetsBottom);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: Float = this.top;
      val var1: Float = this.bottom;
      val var5: Float = this.left;
      val var2: Float = this.right;
      val var4: Float = this.imeInsetsBottom;
      val var6: StringBuilder = new StringBuilder();
      var6.append("OnSafeAreaInsetsDidChangeData(top=");
      var6.append(var3);
      var6.append(", bottom=");
      var6.append(var1);
      var6.append(", left=");
      var6.append(var5);
      var6.append(", right=");
      var6.append(var2);
      var6.append(", imeInsetsBottom=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<OnSafeAreaInsetsDidChangeData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnSafeAreaInsetsDidChangeData.$serializer = new OnSafeAreaInsetsDidChangeData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.safearea.react.events.OnSafeAreaInsetsDidChangeData", var0, 5
         );
         var1.l("top", false);
         var1.l("bottom", false);
         var1.l("left", false);
         var1.l("right", false);
         var1.l("imeInsetsBottom", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{e0.a, e0.a, e0.a, e0.a, e0.a};
      }

      public open fun deserialize(decoder: Decoder): OnSafeAreaInsetsDidChangeData {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Float;
         var var3: Float;
         var var5: Float;
         var var6: Float;
         var var9: Int;
         var var16: Float;
         if (var13.p()) {
            var16 = var13.u(var12, 0);
            var5 = var13.u(var12, 1);
            val var7: Float = var13.u(var12, 2);
            var2 = var13.u(var12, 3);
            var3 = var13.u(var12, 4);
            var9 = 31;
            var6 = var16;
            var16 = var7;
         } else {
            var6 = 0.0F;
            var5 = 0.0F;
            var16 = 0.0F;
            var3 = 0.0F;
            var2 = 0.0F;
            var var10: Boolean = true;
            var9 = 0;

            while (var10) {
               val var11: Int = var13.o(var12);
               if (var11 != -1) {
                  if (var11 != 0) {
                     if (var11 != 1) {
                        if (var11 != 2) {
                           if (var11 != 3) {
                              if (var11 != 4) {
                                 throw new n(var11);
                              }

                              var16 = var13.u(var12, 4);
                              var9 |= 16;
                           } else {
                              var5 = var13.u(var12, 3);
                              var9 |= 8;
                           }
                        } else {
                           var3 = var13.u(var12, 2);
                           var9 |= 4;
                        }
                     } else {
                        var2 = var13.u(var12, 1);
                        var9 |= 2;
                     }
                  } else {
                     var6 = var13.u(var12, 0);
                     var9 |= 1;
                  }
               } else {
                  var10 = false;
               }
            }

            var16 = var3;
            var3 = var16;
            var2 = var5;
            var5 = var2;
         }

         var13.c(var12);
         return new OnSafeAreaInsetsDidChangeData(var9, var6, var5, var16, var2, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: OnSafeAreaInsetsDidChangeData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnSafeAreaInsetsDidChangeData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnSafeAreaInsetsDidChangeData> {
         return OnSafeAreaInsetsDidChangeData.$serializer.INSTANCE;
      }
   }
}
