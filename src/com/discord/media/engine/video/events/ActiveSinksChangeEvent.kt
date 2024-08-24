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
import xk.h
import xk.f0.a

@f
internal data class ActiveSinksChangeEvent(streamId: String, active: Boolean) : ReactEvent {
   public final val active: Boolean
   public final val streamId: String

   init {
      r.h(var1, "streamId");
      super();
      this.streamId = var1;
      this.active = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: ActiveSinksChangeEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.streamId);
      var1.x(var2, 1, var0.active);
   }

   public operator fun component1(): String {
      return this.streamId;
   }

   public operator fun component2(): Boolean {
      return this.active;
   }

   public fun copy(streamId: String = var0.streamId, active: Boolean = var0.active): ActiveSinksChangeEvent {
      r.h(var1, "streamId");
      return new ActiveSinksChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActiveSinksChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.streamId, var1.streamId)) {
            return false;
         } else {
            return this.active == var1.active;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.streamId.hashCode();
      var var1: Byte = this.active;
      if (this.active != 0) {
         var1 = 1;
      }

      return var3 * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.streamId;
      val var1: Boolean = this.active;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActiveSinksChangeEvent(streamId=");
      var2.append(var3);
      var2.append(", active=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<ActiveSinksChangeEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActiveSinksChangeEvent.$serializer = new ActiveSinksChangeEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media.engine.video.events.ActiveSinksChangeEvent", var0, 2
         );
         var1.l("streamId", false);
         var1.l("active", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): ActiveSinksChangeEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Boolean;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.C(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.C(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new ActiveSinksChangeEvent(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: ActiveSinksChangeEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActiveSinksChangeEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActiveSinksChangeEvent> {
         return ActiveSinksChangeEvent.$serializer.INSTANCE;
      }
   }
}
