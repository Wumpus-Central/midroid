package com.discord.emoji_picker.react_events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class OnPressEmojiEvent(emojiName: String, emojiId: String? = null) : ReactEvent {
   public final val emojiName: String
   public final val emojiId: String?

   init {
      r.h(var1, "emojiName");
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

   public fun copy(emojiName: String = var0.emojiName, emojiId: String? = var0.emojiId): OnPressEmojiEvent {
      r.h(var1, "emojiName");
      return new OnPressEmojiEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPressEmojiEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.emojiName, var1.emojiName)) {
            return false;
         } else {
            return r.c(this.emojiId, var1.emojiId);
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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.emojiName;
      val var1: java.lang.String = this.emojiId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnPressEmojiEvent(emojiName=");
      var2.append(var3);
      var2.append(", emojiId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnPressEmojiEvent> {
         return OnPressEmojiEvent.$serializer.INSTANCE;
      }
   }
}
