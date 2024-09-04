package com.discord.chat.input.events

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
import xk.f0
import xk.m0
import xk.f0.a

@f
internal data class OnContentSizeChangeEvent(width: Int, height: Int) : ReactEvent {
   public final val height: Int
   public final val width: Int

   init {
      this.width = var1;
      this.height = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: OnContentSizeChangeEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.width);
      var1.w(var2, 1, var0.height);
   }

   public operator fun component1(): Int {
      return this.width;
   }

   public operator fun component2(): Int {
      return this.height;
   }

   public fun copy(width: Int = var0.width, height: Int = var0.height): OnContentSizeChangeEvent {
      return new OnContentSizeChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnContentSizeChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.width != var1.width) {
            return false;
         } else {
            return this.height == var1.height;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.width;
      val var2: Int = this.height;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnContentSizeChangeEvent(width=");
      var3.append(var1);
      var3.append(", height=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<OnContentSizeChangeEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnContentSizeChangeEvent.$serializer = new OnContentSizeChangeEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnContentSizeChangeEvent", var0, 2);
         var1.l("width", false);
         var1.l("height", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): OnContentSizeChangeEvent {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         if (var8.p()) {
            var3 = var8.i(var7, 0);
            var4 = var8.i(var7, 1);
            var2 = 3;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var4 = 0;
            var2 = 0;

            while (var5) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var4 = var8.i(var7, 1);
                     var2 |= 2;
                  } else {
                     var3 = var8.i(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var8.c(var7);
         return new OnContentSizeChangeEvent(var2, var3, var4, null);
      }

      public open fun serialize(encoder: Encoder, value: OnContentSizeChangeEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnContentSizeChangeEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnContentSizeChangeEvent> {
         return OnContentSizeChangeEvent.$serializer.INSTANCE;
      }
   }
}
