package com.discord.mobile_voice_overlay

import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer

@mb.g
public data class MobileVoiceOverlayDataUser(userId: UserId, avatar: String?, speaking: Boolean, discriminator: Int) : MobileVoiceOverlayDataUser(
      var1, var3, var4, var5
   ) {
   public final val userId: UserId
   public final val avatar: String?
   public final val speaking: Boolean
   public final val discriminator: Int

   fun MobileVoiceOverlayDataUser(var1: Long, var3: java.lang.String, var4: Boolean, var5: Int) {
      super();
      this.userId = var1;
      this.avatar = var3;
      this.speaking = var4;
      this.discriminator = var5;
   }

   public operator fun component1(): UserId {
      return this.userId;
   }

   public operator fun component2(): String? {
      return this.avatar;
   }

   public operator fun component3(): Boolean {
      return this.speaking;
   }

   public operator fun component4(): Int {
      return this.discriminator;
   }

   public fun copy(userId: UserId = ..., avatar: String? = ..., speaking: Boolean = ..., discriminator: Int = ...): MobileVoiceOverlayDataUser {
      return new MobileVoiceOverlayDataUser(var1, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayDataUser) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.userId, var1.userId)) {
            return false;
         } else if (!(this.avatar == var1.avatar)) {
            return false;
         } else if (this.speaking != var1.speaking) {
            return false;
         } else {
            return this.discriminator == var1.discriminator;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = UserId.hashCode-impl(this.userId);
      val var1: Int;
      if (this.avatar == null) {
         var1 = 0;
      } else {
         var1 = this.avatar.hashCode();
      }

      return ((var2 * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.speaking)) * 31 + Integer.hashCode(this.discriminator);
   }

   public override fun toString(): String {
      val var3: java.lang.String = UserId.toString-impl(this.userId);
      val var5: java.lang.String = this.avatar;
      val var2: Boolean = this.speaking;
      val var1: Int = this.discriminator;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MobileVoiceOverlayDataUser(userId=");
      var4.append(var3);
      var4.append(", avatar=");
      var4.append(var5);
      var4.append(", speaking=");
      var4.append(var2);
      var4.append(", discriminator=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayDataUser> {
         return MobileVoiceOverlayDataUser.$serializer.INSTANCE;
      }
   }
}
