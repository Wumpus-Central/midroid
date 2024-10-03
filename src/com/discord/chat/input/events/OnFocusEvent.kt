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
internal data class OnFocusEvent(start: Int, end: Int, target: Int = 0) : ReactEvent {
   public final val end: Int
   public final val start: Int
   public final val target: Int

   init {
      this.start = var1;
      this.end = var2;
      this.target = var3;
   }

   public operator fun component1(): Int {
      return this.start;
   }

   public operator fun component2(): Int {
      return this.end;
   }

   public operator fun component3(): Int {
      return this.target;
   }

   public fun copy(start: Int = var0.start, end: Int = var0.end, target: Int = var0.target): OnFocusEvent {
      return new OnFocusEvent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnFocusEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.start != var1.start) {
            return false;
         } else if (this.end != var1.end) {
            return false;
         } else {
            return this.target == var1.target;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.start) * 31 + Integer.hashCode(this.end)) * 31 + Integer.hashCode(this.target);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: Int = this.start;
      val var2: Int = this.end;
      val var1: Int = this.target;
      val var4: StringBuilder = new StringBuilder();
      var4.append("OnFocusEvent(start=");
      var4.append(var3);
      var4.append(", end=");
      var4.append(var2);
      var4.append(", target=");
      var4.append(var1);
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
         val var0: OnFocusEvent.$serializer = new OnFocusEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnFocusEvent", var0, 3);
         var1.l("start", false);
         var1.l("end", false);
         var1.l("target", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): OnFocusEvent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         var var4: Int;
         val var6: Int;
         var var7: Int;
         if (var9.y()) {
            var3 = var9.k(var8, 0);
            var6 = var9.k(var8, 1);
            val var2: Int = var9.k(var8, 2);
            var4 = 7;
            var7 = var2;
         } else {
            var var13: Boolean = true;
            var var5: Int = 0;
            var4 = 0;
            var3 = 0;
            var var10: Int = 0;

            while (var13) {
               var7 = var9.x(var8);
               if (var7 != -1) {
                  if (var7 != 0) {
                     if (var7 != 1) {
                        if (var7 != 2) {
                           throw new n(var7);
                        }

                        var4 = var9.k(var8, 2);
                        var10 |= 4;
                     } else {
                        var3 = var9.k(var8, 1);
                        var10 |= 2;
                     }
                  } else {
                     var5 = var9.k(var8, 0);
                     var10 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var7 = var4;
            var6 = var3;
            var3 = var5;
            var4 = var10;
         }

         var9.b(var8);
         return new OnFocusEvent(var4, var3, var6, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: OnFocusEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnFocusEvent.write$Self$chat_input_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnFocusEvent> {
         return OnFocusEvent.$serializer.INSTANCE;
      }
   }
}
