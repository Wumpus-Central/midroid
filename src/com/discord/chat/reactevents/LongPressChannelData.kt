package com.discord.chat.reactevents

import B9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
internal data class LongPressChannelData(guildId: String? = null, channelId: String? = null, messageId: String? = null, originalLink: String? = null) :
   ReactEvent {
   public final val guildId: String?
   public final val channelId: String?
   public final val messageId: String?
   public final val originalLink: String?

   fun LongPressChannelData() {
      this(null, null, null, null, 15, null);
   }

   init {
      this.guildId = var1;
      this.channelId = var2;
      this.messageId = var3;
      this.originalLink = var4;
   }

   public operator fun component1(): String? {
      return this.guildId;
   }

   public operator fun component2(): String? {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.originalLink;
   }

   public fun copy(
      guildId: String? = var0.guildId,
      channelId: String? = var0.channelId,
      messageId: String? = var0.messageId,
      originalLink: String? = var0.originalLink
   ): LongPressChannelData {
      return new LongPressChannelData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressChannelData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.guildId == var1.guildId)) {
            return false;
         } else if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.messageId == var1.messageId)) {
            return false;
         } else {
            return this.originalLink == var1.originalLink;
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var2: Int;
      if (this.channelId == null) {
         var2 = 0;
      } else {
         var2 = this.channelId.hashCode();
      }

      val var3: Int;
      if (this.messageId == null) {
         var3 = 0;
      } else {
         var3 = this.messageId.hashCode();
      }

      if (this.originalLink != null) {
         var4 = this.originalLink.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a(
            "data",
            NativeMapExtensionsKt.nativeMapOf(
               s.a("guildId", this.guildId), s.a("channelId", this.channelId), s.a("messageId", this.messageId), s.a("originalLink", this.originalLink)
            )
         )
      );
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.guildId;
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var4: java.lang.String = this.originalLink;
      val var5: StringBuilder = new StringBuilder();
      var5.append("LongPressChannelData(guildId=");
      var5.append(var2);
      var5.append(", channelId=");
      var5.append(var3);
      var5.append(", messageId=");
      var5.append(var1);
      var5.append(", originalLink=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressChannelData> {
         return LongPressChannelData.$serializer.INSTANCE;
      }
   }
}
