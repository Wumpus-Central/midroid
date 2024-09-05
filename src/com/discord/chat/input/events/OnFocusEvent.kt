package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.n0
import qn.g0.a

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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.start;
      val var1: Int = this.end;
      val var3: Int = this.target;
      val var4: StringBuilder = new StringBuilder();
      var4.append("OnFocusEvent(start=");
      var4.append(var2);
      var4.append(", end=");
      var4.append(var1);
      var4.append(", target=");
      var4.append(var3);
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
         var1.c("start", false);
         var1.c("end", false);
         var1.c("target", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): OnFocusEvent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var5: Int;
         val var6: Int;
         var var11: Int;
         var var12: Int;
         if (var9.p()) {
            var11 = var9.i(var8, 0);
            var12 = var9.i(var8, 1);
            val var2: Int = var9.i(var8, 2);
            var5 = 7;
            var6 = var11;
            var11 = var12;
            var12 = var2;
         } else {
            var var14: Boolean = true;
            var5 = 0;
            var12 = 0;
            var11 = 0;
            var var10: Int = 0;

            while (var14) {
               val var7: Int = var9.o(var8);
               if (var7 != -1) {
                  if (var7 != 0) {
                     if (var7 != 1) {
                        if (var7 != 2) {
                           throw new n(var7);
                        }

                        var12 = var9.i(var8, 2);
                        var10 |= 4;
                     } else {
                        var11 = var9.i(var8, 1);
                        var10 |= 2;
                     }
                  } else {
                     var5 = var9.i(var8, 0);
                     var10 |= 1;
                  }
               } else {
                  var14 = false;
               }
            }

            var6 = var5;
            var5 = var10;
         }

         var9.c(var8);
         return new OnFocusEvent(var5, var6, var11, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: OnFocusEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnFocusEvent.write$Self$chat_input_release(var2, var4, var3);
         var4.c(var3);
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
