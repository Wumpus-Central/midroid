package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import il.b2
import il.g0
import il.h
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
internal data class ActiveSinksChangeEvent(streamId: String, active: Boolean) : ReactEvent {
   public final val active: Boolean
   public final val streamId: String

   init {
      q.h(var1, "streamId");
      super();
      this.streamId = var1;
      this.active = var2;
   }

   public operator fun component1(): String {
      return this.streamId;
   }

   public operator fun component2(): Boolean {
      return this.active;
   }

   public fun copy(streamId: String = var0.streamId, active: Boolean = var0.active): ActiveSinksChangeEvent {
      q.h(var1, "streamId");
      return new ActiveSinksChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActiveSinksChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.streamId, var1.streamId)) {
            return false;
         } else {
            return this.active == var1.active;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.streamId.hashCode() * 31 + java.lang.Boolean.hashCode(this.active);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
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

   public object `$serializer` : g0 {
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
         return new KSerializer[]{b2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): ActiveSinksChangeEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: Boolean;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.s(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.s(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new ActiveSinksChangeEvent(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: ActiveSinksChangeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ActiveSinksChangeEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActiveSinksChangeEvent> {
         return ActiveSinksChangeEvent.$serializer.INSTANCE;
      }
   }
}
