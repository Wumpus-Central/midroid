package com.discord.chat.bridge.voiceinviteembed

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import lb.f

@f
public data class VoiceInviteEmbed(guildId: String,
   channelId: String,
   titleText: String,
   bodyText: String,
   joinText: String,
   joinIcon: String?,
   joinDisabled: Boolean,
   isInactive: Boolean
) {
   public final val guildId: String
   public final val channelId: String
   public final val titleText: String
   public final val bodyText: String
   public final val joinText: String
   public final val joinIcon: String?
   public final val joinDisabled: Boolean
   public final val isInactive: Boolean

   init {
      q.h(var1, "guildId");
      q.h(var2, "channelId");
      q.h(var3, "titleText");
      q.h(var4, "bodyText");
      q.h(var5, "joinText");
      super();
      this.guildId = var1;
      this.channelId = var2;
      this.titleText = var3;
      this.bodyText = var4;
      this.joinText = var5;
      this.joinIcon = var6;
      this.joinDisabled = var7;
      this.isInactive = var8;
   }

   public operator fun component1(): String {
      return this.guildId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.titleText;
   }

   public operator fun component4(): String {
      return this.bodyText;
   }

   public operator fun component5(): String {
      return this.joinText;
   }

   public operator fun component6(): String? {
      return this.joinIcon;
   }

   public operator fun component7(): Boolean {
      return this.joinDisabled;
   }

   public operator fun component8(): Boolean {
      return this.isInactive;
   }

   public fun copy(
      guildId: String = var0.guildId,
      channelId: String = var0.channelId,
      titleText: String = var0.titleText,
      bodyText: String = var0.bodyText,
      joinText: String = var0.joinText,
      joinIcon: String? = var0.joinIcon,
      joinDisabled: Boolean = var0.joinDisabled,
      isInactive: Boolean = var0.isInactive
   ): VoiceInviteEmbed {
      q.h(var1, "guildId");
      q.h(var2, "channelId");
      q.h(var3, "titleText");
      q.h(var4, "bodyText");
      q.h(var5, "joinText");
      return new VoiceInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!q.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!q.c(this.joinText, var1.joinText)) {
            return false;
         } else if (!q.c(this.joinIcon, var1.joinIcon)) {
            return false;
         } else if (this.joinDisabled != var1.joinDisabled) {
            return false;
         } else {
            return this.isInactive == var1.isInactive;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.guildId.hashCode();
      val var2: Int = this.channelId.hashCode();
      val var6: Int = this.titleText.hashCode();
      val var4: Int = this.bodyText.hashCode();
      val var5: Int = this.joinText.hashCode();
      val var1: Int;
      if (this.joinIcon == null) {
         var1 = 0;
      } else {
         var1 = this.joinIcon.hashCode();
      }

      return ((((((var3 * 31 + var2) * 31 + var6) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.joinDisabled)) * 31
         + java.lang.Boolean.hashCode(this.isInactive);
   }

   public override fun toString(): String {
      val var8: java.lang.String = this.guildId;
      val var3: java.lang.String = this.channelId;
      val var5: java.lang.String = this.titleText;
      val var9: java.lang.String = this.bodyText;
      val var7: java.lang.String = this.joinText;
      val var6: java.lang.String = this.joinIcon;
      val var1: Boolean = this.joinDisabled;
      val var2: Boolean = this.isInactive;
      val var4: StringBuilder = new StringBuilder();
      var4.append("VoiceInviteEmbed(guildId=");
      var4.append(var8);
      var4.append(", channelId=");
      var4.append(var3);
      var4.append(", titleText=");
      var4.append(var5);
      var4.append(", bodyText=");
      var4.append(var9);
      var4.append(", joinText=");
      var4.append(var7);
      var4.append(", joinIcon=");
      var4.append(var6);
      var4.append(", joinDisabled=");
      var4.append(var1);
      var4.append(", isInactive=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<VoiceInviteEmbed> {
         return VoiceInviteEmbed.$serializer.INSTANCE;
      }
   }
}
