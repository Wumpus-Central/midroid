package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class TapMentionData(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) : ReactEvent {
   public final val userId: String?
   public final val channelId: String
   public final val roleName: String?
   public final val parsedUserId: String?

   init {
      r.h(var2, "channelId");
      super();
      this.userId = var1;
      this.channelId = var2;
      this.roleName = var3;
      this.parsedUserId = var4;
   }

   public operator fun component1(): String? {
      return this.userId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.roleName;
   }

   public operator fun component4(): String? {
      return this.parsedUserId;
   }

   public fun copy(
      userId: String? = var0.userId,
      channelId: String = var0.channelId,
      roleName: String? = var0.roleName,
      parsedUserId: String? = var0.parsedUserId
   ): TapMentionData {
      r.h(var2, "channelId");
      return new TapMentionData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapMentionData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.userId, var1.userId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.roleName, var1.roleName)) {
            return false;
         } else {
            return r.c(this.parsedUserId, var1.parsedUserId);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.userId == null) {
         var1 = 0;
      } else {
         var1 = this.userId.hashCode();
      }

      val var4: Int = this.channelId.hashCode();
      val var2: Int;
      if (this.roleName == null) {
         var2 = 0;
      } else {
         var2 = this.roleName.hashCode();
      }

      if (this.parsedUserId != null) {
         var3 = this.parsedUserId.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.userId;
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.roleName;
      val var4: java.lang.String = this.parsedUserId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapMentionData(userId=");
      var2.append(var5);
      var2.append(", channelId=");
      var2.append(var3);
      var2.append(", roleName=");
      var2.append(var1);
      var2.append(", parsedUserId=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapMentionData> {
         return TapMentionData.$serializer.INSTANCE;
      }
   }
}
