package com.discord.chat.input.events

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.g0
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
internal data class OnContentSizeChangeEvent(width: Int, height: Int) : ReactEvent {
   public final val height: Int
   public final val width: Int

   init {
      this.width = var1;
      this.height = var2;
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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
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

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): OnContentSizeChangeEvent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         if (var8.y()) {
            var3 = var8.k(var7, 0);
            var2 = var8.k(var7, 1);
            var4 = 3;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var4 = 0;
            var2 = 0;

            while (var5) {
               val var6: Int = var8.x(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var4 = var8.k(var7, 1);
                     var2 |= 2;
                  } else {
                     var3 = var8.k(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }

            var4 = var2;
            var2 = var4;
         }

         var8.b(var7);
         return new OnContentSizeChangeEvent(var4, var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: OnContentSizeChangeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnContentSizeChangeEvent.write$Self$chat_input_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnContentSizeChangeEvent> {
         return OnContentSizeChangeEvent.$serializer.INSTANCE;
      }
   }
}
