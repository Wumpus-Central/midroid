package com.discord.media.engine.video.events

import Ja.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class UserSpeakingEvent(connectionId: Int, userId: String, isSpeaking: Int) : ReactEvent {
   public final val connectionId: Int
   public final val userId: String
   public final val isSpeaking: Int

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

   public companion object {
      public fun serializer(): KSerializer<UserSpeakingEvent> {
         return UserSpeakingEvent.$serializer.INSTANCE;
      }
   }
}
