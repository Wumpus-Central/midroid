package com.discord.chat.reactevents

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
internal data class FirstLayoutData(firstVisibleMessageIndex: Int, lastVisibleMessageIndex: Int) : ReactEvent {
   public final val firstVisibleMessageIndex: Int
   public final val lastVisibleMessageIndex: Int

   init {
      this.firstVisibleMessageIndex = var1;
      this.lastVisibleMessageIndex = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: FirstLayoutData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.firstVisibleMessageIndex);
      var1.w(var2, 1, var0.lastVisibleMessageIndex);
   }

   public operator fun component1(): Int {
      return this.firstVisibleMessageIndex;
   }

   public operator fun component2(): Int {
      return this.lastVisibleMessageIndex;
   }

   public fun copy(firstVisibleMessageIndex: Int = var0.firstVisibleMessageIndex, lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex): FirstLayoutData {
      return new FirstLayoutData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FirstLayoutData) {
         return false;
      } else {
         var1 = var1;
         if (this.firstVisibleMessageIndex != var1.firstVisibleMessageIndex) {
            return false;
         } else {
            return this.lastVisibleMessageIndex == var1.lastVisibleMessageIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.firstVisibleMessageIndex) * 31 + Integer.hashCode(this.lastVisibleMessageIndex);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.firstVisibleMessageIndex;
      val var1: Int = this.lastVisibleMessageIndex;
      val var3: StringBuilder = new StringBuilder();
      var3.append("FirstLayoutData(firstVisibleMessageIndex=");
      var3.append(var2);
      var3.append(", lastVisibleMessageIndex=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<FirstLayoutData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: FirstLayoutData.$serializer = new FirstLayoutData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.FirstLayoutData", var0, 2);
         var1.l("firstVisibleMessageIndex", false);
         var1.l("lastVisibleMessageIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): FirstLayoutData {
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
         return new FirstLayoutData(var2, var3, var4, null);
      }

      public open fun serialize(encoder: Encoder, value: FirstLayoutData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         FirstLayoutData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FirstLayoutData> {
         return FirstLayoutData.$serializer.INSTANCE;
      }
   }
}
