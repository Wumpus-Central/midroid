package com.discord.segmented.control.events

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
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
internal data class ValueChangeEvent(value: String, selectedSegmentIndex: Int) : ReactEvent {
   public final val selectedSegmentIndex: Int
   public final val value: String

   init {
      r.h(var1, "value");
      super();
      this.value = var1;
      this.selectedSegmentIndex = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: ValueChangeEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.value);
      var1.w(var2, 1, var0.selectedSegmentIndex);
   }

   public operator fun component1(): String {
      return this.value;
   }

   public operator fun component2(): Int {
      return this.selectedSegmentIndex;
   }

   public fun copy(value: String = var0.value, selectedSegmentIndex: Int = var0.selectedSegmentIndex): ValueChangeEvent {
      r.h(var1, "value");
      return new ValueChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ValueChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.value, var1.value)) {
            return false;
         } else {
            return this.selectedSegmentIndex == var1.selectedSegmentIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.value.hashCode() * 31 + Integer.hashCode(this.selectedSegmentIndex);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.value;
      val var1: Int = this.selectedSegmentIndex;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ValueChangeEvent(value=");
      var3.append(var2);
      var3.append(", selectedSegmentIndex=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ValueChangeEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ValueChangeEvent.$serializer = new ValueChangeEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.segmented.control.events.ValueChangeEvent", var0, 2);
         var1.l("value", false);
         var1.l("selectedSegmentIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): ValueChangeEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var3 = var7.i(var6, 1);
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.o(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var3 = var7.i(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.c(var6);
         return new ValueChangeEvent(var2, var8, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: ValueChangeEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ValueChangeEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ValueChangeEvent> {
         return ValueChangeEvent.$serializer.INSTANCE;
      }
   }
}
