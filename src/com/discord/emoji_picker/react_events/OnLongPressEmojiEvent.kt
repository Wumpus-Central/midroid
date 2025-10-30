package com.discord.emoji_picker.react_events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
internal data class OnLongPressEmojiEvent(emojiName: String, emojiId: String? = null) : ReactEvent {
   public final val emojiName: String
   public final val emojiId: String?

   init {
      super();
      this.emojiName = var1;
      this.emojiId = var2;
   }

   public operator fun component1(): String {
      return this.emojiName;
   }

   public operator fun component2(): String? {
      return this.emojiId;
   }

   public fun copy(emojiName: String = var0.emojiName, emojiId: String? = var0.emojiId): OnLongPressEmojiEvent {
      return new OnLongPressEmojiEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnLongPressEmojiEvent) {
         return false;
      } else {
         var1 = var1;
         if (!(this.emojiName == var1.emojiName)) {
            return false;
         } else {
            return this.emojiId == var1.emojiId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.emojiName.hashCode();
      val var1: Int;
      if (this.emojiId == null) {
         var1 = 0;
      } else {
         var1 = this.emojiId.hashCode();
      }

      return var2 * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.emojiName;
      val var1: java.lang.String = this.emojiId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnLongPressEmojiEvent(emojiName=");
      var2.append(var3);
      var2.append(", emojiId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnLongPressEmojiEvent> {
         return OnLongPressEmojiEvent.$serializer.INSTANCE;
      }
   }
}
