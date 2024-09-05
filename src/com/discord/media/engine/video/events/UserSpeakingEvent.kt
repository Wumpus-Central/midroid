package com.discord.media.engine.video.events

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
import qn.b2
import qn.g0
import qn.n0
import qn.g0.a

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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var3: java.lang.String = this.userId;
      val var2: Int = this.isSpeaking;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UserSpeakingEvent(connectionId=");
      var4.append(var1);
      var4.append(", userId=");
      var4.append(var3);
      var4.append(", isSpeaking=");
      var4.append(var2);
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
         var1.c("connectionId", false);
         var1.c("userId", false);
         var1.c("isSpeaking", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): UserSpeakingEvent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var3: Int;
         val var5: Int;
         var var9: java.lang.String;
         var var10: Int;
         if (var8.p()) {
            var10 = var8.i(var7, 0);
            var9 = var8.m(var7, 1);
            val var4: Int = var8.i(var7, 2);
            var3 = 7;
            var5 = var10;
            var10 = var4;
         } else {
            var9 = null;
            var var14: Boolean = true;
            var var13: Int = 0;
            var3 = 0;
            var10 = 0;

            while (var14) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           throw new n(var6);
                        }

                        var3 = var8.i(var7, 2);
                        var10 |= 4;
                     } else {
                        var9 = var8.m(var7, 1);
                        var10 |= 2;
                     }
                  } else {
                     var13 = var8.i(var7, 0);
                     var10 |= 1;
                  }
               } else {
                  var14 = false;
               }
            }

            var3 = var10;
            var10 = var3;
            var5 = var13;
         }

         var8.c(var7);
         return new UserSpeakingEvent(var3, var5, var9, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSpeakingEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSpeakingEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.c(var3);
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
