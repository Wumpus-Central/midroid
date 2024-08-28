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
internal data class UserSpeakingEvent(connectionId: Int, userId: String, isSpeaking: Int) : ReactEvent {
   public final val connectionId: Int
   public final val isSpeaking: Int
   public final val userId: String

   init {
      r.h(var2, "userId");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.isSpeaking = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: UserSpeakingEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.connectionId);
      var1.z(var2, 1, var0.userId);
      var1.w(var2, 2, var0.isSpeaking);
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
      r.h(var2, "userId");
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
         } else if (!r.c(this.userId, var1.userId)) {
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
      val var4: java.lang.String = this.userId;
      val var2: Int = this.isSpeaking;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UserSpeakingEvent(connectionId=");
      var3.append(var1);
      var3.append(", userId=");
      var3.append(var4);
      var3.append(", isSpeaking=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<UserSpeakingEvent> {
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
         return new KSerializer[]{m0.a, a2.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): UserSpeakingEvent {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var9: java.lang.String;
         if (var8.p()) {
            var3 = var8.i(var7, 0);
            var9 = var8.m(var7, 1);
            var2 = var8.i(var7, 2);
            var4 = 7;
         } else {
            var9 = null;
            var var5: Boolean = true;
            var4 = 0;
            var3 = 0;
            var2 = 0;

            while (var5) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           throw new n(var6);
                        }

                        var3 = var8.i(var7, 2);
                        var2 |= 4;
                     } else {
                        var9 = var8.m(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var4 = var8.i(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }

            var2 = var3;
            var3 = var4;
            var4 = var2;
         }

         var8.c(var7);
         return new UserSpeakingEvent(var4, var3, var9, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSpeakingEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSpeakingEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSpeakingEvent> {
         return UserSpeakingEvent.$serializer.INSTANCE;
      }
   }
}
