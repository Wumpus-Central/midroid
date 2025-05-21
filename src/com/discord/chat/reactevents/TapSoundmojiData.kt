package com.discord.chat.reactevents

import Ja.f
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapSoundmojiData(soundId: String, channelId: String, guildId: String? = ..., messageId: MessageId? = ...) : TapSoundmojiData(
         var1, var2, var3, var4
      ),
   ReactEvent {
   public final val soundId: String
   public final val channelId: String
   public final val guildId: String?
   public final val messageId: MessageId?

   fun TapSoundmojiData(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String) {
      q.h(var1, "soundId");
      q.h(var2, "channelId");
      super();
      this.soundId = var1;
      this.channelId = var2;
      this.guildId = var3;
      this.messageId = var4;
   }

   public operator fun component1(): String {
      return this.soundId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.guildId;
   }

   public operator fun component4(): MessageId? {
      return this.messageId;
   }

   public fun copy(soundId: String = ..., channelId: String = ..., guildId: String? = ..., messageId: MessageId? = ...): TapSoundmojiData {
      q.h(var1, "soundId");
      q.h(var2, "channelId");
      return new TapSoundmojiData(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSoundmojiData) {
         return false;
      } else {
         val var3: TapSoundmojiData = var1 as TapSoundmojiData;
         if (!q.c(this.soundId, (var1 as TapSoundmojiData).soundId)) {
            return false;
         } else if (!q.c(this.channelId, var3.channelId)) {
            return false;
         } else if (!q.c(this.guildId, var3.guildId)) {
            return false;
         } else {
            if (this.messageId == null) {
               if (var3.messageId == null) {
                  return true;
               }
            } else if (var3.messageId != null) {
               return MessageId.equals-impl0(this.messageId, var3.messageId);
            }

            return false;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.soundId.hashCode();
      val var4: Int = this.channelId.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      if (this.messageId != null) {
         var2 = MessageId.hashCode-impl(this.messageId);
      }

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.soundId;
      val var4: java.lang.String = this.channelId;
      val var2: java.lang.String = this.guildId;
      val var6: java.lang.String;
      if (this.messageId == null) {
         var6 = "null";
      } else {
         var6 = MessageId.toString-impl(this.messageId);
      }

      val var5: StringBuilder = new StringBuilder();
      var5.append("TapSoundmojiData(soundId=");
      var5.append(var3);
      var5.append(", channelId=");
      var5.append(var4);
      var5.append(", guildId=");
      var5.append(var2);
      var5.append(", messageId=");
      var5.append(var6);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSoundmojiData> {
         return TapSoundmojiData.$serializer.INSTANCE;
      }
   }
}
