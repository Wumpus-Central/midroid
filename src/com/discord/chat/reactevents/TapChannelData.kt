package com.discord.chat.reactevents

import A9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class TapChannelData(guildId: String? = null, channelId: String? = null, messageId: String? = null) : ReactEvent {
   public final val guildId: String?
   public final val channelId: String?
   public final val messageId: String?

   fun TapChannelData() {
      this(null, null, null, 7, null);
   }

   init {
      this.guildId = var1;
      this.channelId = var2;
      this.messageId = var3;
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

   public fun copy(guildId: String? = var0.guildId, channelId: String? = var0.channelId, messageId: String? = var0.messageId): TapChannelData {
      return new TapChannelData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapChannelData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
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

      if (this.messageId != null) {
         var3 = this.messageId.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("data", NativeMapExtensionsKt.nativeMapOf(s.a("guildId", this.guildId), s.a("channelId", this.channelId), s.a("messageId", this.messageId)))
      );
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.guildId;
      val var4: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapChannelData(guildId=");
      var1.append(var3);
      var1.append(", channelId=");
      var1.append(var4);
      var1.append(", messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapChannelData> {
         return TapChannelData.$serializer.INSTANCE;
      }
   }
}
