package com.discord.media.engine.video.events

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
internal data class SecureFramesStateUpdateCallbackEvent(connectionId: Int, stateUpdateJSON: String) : ReactEvent {
   public final val connectionId: Int
   public final val stateUpdateJSON: String

   init {
      r.h(var2, "stateUpdateJSON");
      super();
      this.connectionId = var1;
      this.stateUpdateJSON = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: SecureFramesStateUpdateCallbackEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.connectionId);
      var1.z(var2, 1, var0.stateUpdateJSON);
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.stateUpdateJSON;
   }

   public fun copy(connectionId: Int = var0.connectionId, stateUpdateJSON: String = var0.stateUpdateJSON): SecureFramesStateUpdateCallbackEvent {
      r.h(var2, "stateUpdateJSON");
      return new SecureFramesStateUpdateCallbackEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SecureFramesStateUpdateCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else {
            return r.c(this.stateUpdateJSON, var1.stateUpdateJSON);
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.connectionId) * 31 + this.stateUpdateJSON.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var2: java.lang.String = this.stateUpdateJSON;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SecureFramesStateUpdateCallbackEvent(connectionId=");
      var3.append(var1);
      var3.append(", stateUpdateJSON=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<SecureFramesStateUpdateCallbackEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SecureFramesStateUpdateCallbackEvent.$serializer = new SecureFramesStateUpdateCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media.engine.video.events.SecureFramesStateUpdateCallbackEvent", var0, 2
         );
         var1.l("connectionId", false);
         var1.l("stateUpdateJSON", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): SecureFramesStateUpdateCallbackEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         if (var7.p()) {
            var3 = var7.i(var6, 0);
            var8 = var7.m(var6, 1);
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

                     var8 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var3 = var7.i(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.c(var6);
         return new SecureFramesStateUpdateCallbackEvent(var2, var3, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: SecureFramesStateUpdateCallbackEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SecureFramesStateUpdateCallbackEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SecureFramesStateUpdateCallbackEvent> {
         return SecureFramesStateUpdateCallbackEvent.$serializer.INSTANCE;
      }
   }
}
