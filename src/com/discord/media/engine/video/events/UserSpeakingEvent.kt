package com.discord.media.engine.video.events

import bl.b2
import bl.g0
import bl.n0
import bl.g0.a
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n

@f
internal data class UserSpeakingEvent(connectionId: Int, userId: String, isSpeaking: Int) : ReactEvent {
   public final val connectionId: Int
   public final val isSpeaking: Int
   public final val userId: String

   init {
      q.h(var2, "userId");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.isSpeaking = var3;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.userId;
   }

   public operator fun component3(): Int {
      return this.isSpeaking;
   }

   public fun copy(connectionId: Int = var0.connectionId, userId: String = var0.userId, isSpeaking: Int = var0.isSpeaking): UserSpeakingEvent {
      q.h(var2, "userId");
      return new UserSpeakingEvent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSpeakingEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!q.c(this.userId, var1.userId)) {
            return false;
         } else {
            return this.isSpeaking == var1.isSpeaking;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.connectionId) * 31 + this.userId.hashCode()) * 31 + Integer.hashCode(this.isSpeaking);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.connectionId;
      val var3: java.lang.String = this.userId;
      val var1: Int = this.isSpeaking;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UserSpeakingEvent(connectionId=");
      var4.append(var2);
      var4.append(", userId=");
      var4.append(var3);
      var4.append(", isSpeaking=");
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
         val var0: UserSpeakingEvent.$serializer = new UserSpeakingEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.UserSpeakingEvent", var0, 3);
         var1.l("connectionId", false);
         var1.l("userId", false);
         var1.l("isSpeaking", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): UserSpeakingEvent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var9: java.lang.String;
         if (var8.y()) {
            var4 = var8.k(var7, 0);
            var9 = var8.t(var7, 1);
            val var2: Int = var8.k(var7, 2);
            var3 = 7;
            var5 = var2;
         } else {
            var9 = null;
            var var12: Boolean = true;
            var4 = 0;
            var3 = 0;
            var var10: Int = 0;

            while (var12) {
               val var6: Int = var8.x(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           throw new n(var6);
                        }

                        var3 = var8.k(var7, 2);
                        var10 |= 4;
                     } else {
                        var9 = var8.t(var7, 1);
                        var10 |= 2;
                     }
                  } else {
                     var4 = var8.k(var7, 0);
                     var10 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var5 = var3;
            var3 = var10;
         }

         var8.b(var7);
         return new UserSpeakingEvent(var3, var4, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSpeakingEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UserSpeakingEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSpeakingEvent> {
         return UserSpeakingEvent.$serializer.INSTANCE;
      }
   }
}
