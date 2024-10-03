package com.discord.fastest_list.react_events

import cl.f
import cl.n
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f0
import fl.g0
import fl.g0.a
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class OnLayoutEvent(x: Float, y: Float, width: Float, height: Float) : ReactEvent {
   public final val height: Float
   public final val width: Float
   public final val x: Float
   public final val y: Float

   init {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
   }

   public operator fun component1(): Float {
      return this.x;
   }

   public operator fun component2(): Float {
      return this.y;
   }

   public operator fun component3(): Float {
      return this.width;
   }

   public operator fun component4(): Float {
      return this.height;
   }

   public fun copy(x: Float = var0.x, y: Float = var0.y, width: Float = var0.width, height: Float = var0.height): OnLayoutEvent {
      return new OnLayoutEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnLayoutEvent) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.x, var1.x) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.y, var1.y) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.width, var1.width) != 0) {
            return false;
         } else {
            return java.lang.Float.compare(this.height, var1.height) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height);
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("layout", NativeMapExtensionsKt.nativeMapOf(w.a("x", this.x), w.a("y", this.y), w.a("width", this.width), w.a("height", this.height)))
      );
   }

   public override fun toString(): String {
      val var3: Float = this.x;
      val var1: Float = this.y;
      val var4: Float = this.width;
      val var2: Float = this.height;
      val var5: StringBuilder = new StringBuilder();
      var5.append("OnLayoutEvent(x=");
      var5.append(var3);
      var5.append(", y=");
      var5.append(var1);
      var5.append(", width=");
      var5.append(var4);
      var5.append(", height=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnLayoutEvent.$serializer = new OnLayoutEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.fastest_list.react_events.OnLayoutEvent", var0, 4);
         var1.l("x", false);
         var1.l("y", false);
         var1.l("width", false);
         var1.l("height", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{f0.a, f0.a, f0.a, f0.a};
      }

      public open fun deserialize(decoder: Decoder): OnLayoutEvent {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var2: Float;
         var var3: Float;
         var var4: Float;
         var var5: Float;
         var var7: Int;
         if (var11.y()) {
            var5 = var11.G(var10, 0);
            var4 = var11.G(var10, 1);
            var3 = var11.G(var10, 2);
            var2 = var11.G(var10, 3);
            var7 = 15;
         } else {
            var5 = 0.0F;
            var4 = 0.0F;
            var3 = 0.0F;
            var2 = 0.0F;
            var var8: Boolean = true;
            var7 = 0;

            while (var8) {
               val var9: Int = var11.x(var10);
               if (var9 != -1) {
                  if (var9 != 0) {
                     if (var9 != 1) {
                        if (var9 != 2) {
                           if (var9 != 3) {
                              throw new n(var9);
                           }

                           var4 = var11.G(var10, 3);
                           var7 |= 8;
                        } else {
                           var3 = var11.G(var10, 2);
                           var7 |= 4;
                        }
                     } else {
                        var2 = var11.G(var10, 1);
                        var7 |= 2;
                     }
                  } else {
                     var5 = var11.G(var10, 0);
                     var7 |= 1;
                  }
               } else {
                  var8 = false;
               }
            }

            var4 = var2;
            var2 = var4;
         }

         var11.b(var10);
         return new OnLayoutEvent(var7, var5, var4, var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: OnLayoutEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnLayoutEvent.write$Self$fastest_list_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnLayoutEvent> {
         return OnLayoutEvent.$serializer.INSTANCE;
      }
   }
}
