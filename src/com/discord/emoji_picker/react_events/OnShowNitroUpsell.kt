package com.discord.emoji_picker.react_events

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
import xk.h

@f
internal data class OnShowNitroUpsell(showNitroUpsell: Boolean) : ReactEvent {
   public final val showNitroUpsell: Boolean

   init {
      super();
      this.showNitroUpsell = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: OnShowNitroUpsell, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.x(var2, 0, var0.showNitroUpsell);
   }

   public operator fun component1(): Boolean {
      return this.showNitroUpsell;
   }

   public fun copy(showNitroUpsell: Boolean = var0.showNitroUpsell): OnShowNitroUpsell {
      return new OnShowNitroUpsell(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnShowNitroUpsell) {
         return false;
      } else {
         return this.showNitroUpsell == (var1 as OnShowNitroUpsell).showNitroUpsell;
      }
   }

   public override fun hashCode(): Int {
      var var1: Byte = this.showNitroUpsell;
      if (this.showNitroUpsell != 0) {
         var1 = 1;
      }

      return var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.showNitroUpsell;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnShowNitroUpsell(showNitroUpsell=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<OnShowNitroUpsell> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnShowNitroUpsell.$serializer = new OnShowNitroUpsell.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.emoji_picker.react_events.OnShowNitroUpsell", var0, 1);
         var1.l("showNitroUpsell", false);
         descriptor = var1;
      }

      public override fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{h.a};
      }

      public open fun deserialize(decoder: Decoder): OnShowNitroUpsell {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         if (var5) {
            var5 = var7.C(var6, 0);
         } else {
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var5 = var7.C(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new OnShowNitroUpsell(var2, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: OnShowNitroUpsell) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnShowNitroUpsell.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnShowNitroUpsell> {
         return OnShowNitroUpsell.$serializer.INSTANCE;
      }
   }
}
