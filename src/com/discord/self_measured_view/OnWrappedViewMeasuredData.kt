package com.discord.self_measured_view

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.f0
import xk.m0

@f
internal data class OnWrappedViewMeasuredData(measuredViewWidth: Int, measuredViewHeight: Int) : ReactEvent {
   public final val measuredViewHeight: Int
   public final val measuredViewWidth: Int

   init {
      this.measuredViewWidth = var1;
      this.measuredViewHeight = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: OnWrappedViewMeasuredData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.measuredViewWidth);
      var1.w(var2, 1, var0.measuredViewHeight);
   }

   public operator fun component1(): Int {
      return this.measuredViewWidth;
   }

   public operator fun component2(): Int {
      return this.measuredViewHeight;
   }

   public fun copy(measuredViewWidth: Int = var0.measuredViewWidth, measuredViewHeight: Int = var0.measuredViewHeight): OnWrappedViewMeasuredData {
      return new OnWrappedViewMeasuredData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnWrappedViewMeasuredData) {
         return false;
      } else {
         var1 = var1;
         if (this.measuredViewWidth != var1.measuredViewWidth) {
            return false;
         } else {
            return this.measuredViewHeight == var1.measuredViewHeight;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.measuredViewWidth) * 31 + Integer.hashCode(this.measuredViewHeight);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.measuredViewWidth;
      val var2: Int = this.measuredViewHeight;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnWrappedViewMeasuredData(measuredViewWidth=");
      var3.append(var1);
      var3.append(", measuredViewHeight=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<OnWrappedViewMeasuredData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnWrappedViewMeasuredData.$serializer = new OnWrappedViewMeasuredData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.self_measured_view.OnWrappedViewMeasuredData", var0, 2);
         var1.l("measuredViewWidth", false);
         var1.l("measuredViewHeight", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): OnWrappedViewMeasuredData {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: kotlinx.serialization.encoding.c = var1.b(var7);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         if (var8.p()) {
            var3 = var8.i(var7, 0);
            var2 = var8.i(var7, 1);
            var4 = 3;
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

            var4 = var2;
            var2 = var4;
         }

         var8.c(var7);
         return new OnWrappedViewMeasuredData(var4, var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: OnWrappedViewMeasuredData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnWrappedViewMeasuredData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnWrappedViewMeasuredData> {
         return OnWrappedViewMeasuredData.$serializer.INSTANCE;
      }
   }
}
