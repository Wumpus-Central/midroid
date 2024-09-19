package com.discord.segmented.control.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import il.b2
import il.g0
import il.n0
import il.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class ValueChangeEvent(value: String, selectedSegmentIndex: Int) : ReactEvent {
   public final val selectedSegmentIndex: Int
   public final val value: String

   init {
      q.h(var1, "value");
      super();
      this.value = var1;
      this.selectedSegmentIndex = var2;
   }

   public operator fun component1(): String {
      return this.value;
   }

   public operator fun component2(): Int {
      return this.selectedSegmentIndex;
   }

   public fun copy(value: String = var0.value, selectedSegmentIndex: Int = var0.selectedSegmentIndex): ValueChangeEvent {
      q.h(var1, "value");
      return new ValueChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ValueChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.value, var1.value)) {
            return false;
         } else {
            return this.selectedSegmentIndex == var1.selectedSegmentIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.value.hashCode() * 31 + Integer.hashCode(this.selectedSegmentIndex);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
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

   public object `$serializer` : g0 {
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
         return new KSerializer[]{b2.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): ValueChangeEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var3 = var7.k(var6, 1);
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.x(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var3 = var7.k(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.b(var6);
         return new ValueChangeEvent(var2, var8, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: ValueChangeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ValueChangeEvent.write$Self$segmented_control_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ValueChangeEvent> {
         return ValueChangeEvent.$serializer.INSTANCE;
      }
   }
}
