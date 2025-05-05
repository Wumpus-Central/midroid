package com.discord.safearea.react.events

import aa.f
import aa.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import da.F
import da.G
import da.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class OnSafeAreaInsetsDidChangeData(top: Float, bottom: Float, left: Float, right: Float) : ReactEvent {
   public final val bottom: Float
   public final val left: Float
   public final val right: Float
   public final val top: Float

   init {
      this.top = var1;
      this.bottom = var2;
      this.left = var3;
      this.right = var4;
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

   public fun copy(top: Float = var0.top, bottom: Float = var0.bottom, left: Float = var0.left, right: Float = var0.right): OnSafeAreaInsetsDidChangeData {
      return new OnSafeAreaInsetsDidChangeData(var1, var2, var3, var4);
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
         } else {
            return java.lang.Float.compare(this.right, var1.right) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.top) * 31 + java.lang.Float.hashCode(this.bottom)) * 31 + java.lang.Float.hashCode(this.left)) * 31
         + java.lang.Float.hashCode(this.right);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Float = this.top;
      val var4: Float = this.bottom;
      val var2: Float = this.left;
      val var3: Float = this.right;
      val var5: StringBuilder = new StringBuilder();
      var5.append("OnSafeAreaInsetsDidChangeData(top=");
      var5.append(var1);
      var5.append(", bottom=");
      var5.append(var4);
      var5.append(", left=");
      var5.append(var2);
      var5.append(", right=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnSafeAreaInsetsDidChangeData.$serializer = new OnSafeAreaInsetsDidChangeData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.safearea.react.events.OnSafeAreaInsetsDidChangeData", var0, 4
         );
         var1.l("top", false);
         var1.l("bottom", false);
         var1.l("left", false);
         var1.l("right", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{F.a, F.a, F.a, F.a};
      }

      public open fun deserialize(decoder: Decoder): OnSafeAreaInsetsDidChangeData {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var2: Float;
         var var3: Float;
         var var4: Float;
         val var6: Float;
         var var8: Int;
         if (var12.y()) {
            var3 = var12.G(var11, 0);
            var4 = var12.G(var11, 1);
            var6 = var12.G(var11, 2);
            var2 = var12.G(var11, 3);
            var8 = 15;
         } else {
            var var5: Float = 0.0F;
            var4 = 0.0F;
            var3 = 0.0F;
            var2 = 0.0F;
            var var9: Boolean = true;
            var8 = 0;

            while (var9) {
               val var10: Int = var12.x(var11);
               if (var10 != -1) {
                  if (var10 != 0) {
                     if (var10 != 1) {
                        if (var10 != 2) {
                           if (var10 != 3) {
                              throw new n(var10);
                           }

                           var4 = var12.G(var11, 3);
                           var8 |= 8;
                        } else {
                           var3 = var12.G(var11, 2);
                           var8 |= 4;
                        }
                     } else {
                        var2 = var12.G(var11, 1);
                        var8 |= 2;
                     }
                  } else {
                     var5 = var12.G(var11, 0);
                     var8 |= 1;
                  }
               } else {
                  var9 = false;
               }
            }

            var2 = var4;
            var6 = var3;
            var4 = var2;
            var3 = var5;
         }

         var12.b(var11);
         return new OnSafeAreaInsetsDidChangeData(var8, var3, var4, var6, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: OnSafeAreaInsetsDidChangeData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnSafeAreaInsetsDidChangeData.write$Self$safe_area_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnSafeAreaInsetsDidChangeData> {
         return OnSafeAreaInsetsDidChangeData.$serializer.INSTANCE;
      }
   }
}
