package com.discord.chat.reactevents

import ch.w
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.reactions.ReactionView
import com.discord.reactions.ReactionView.Reaction
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q

internal data class LongPressReactionData(messageId: MessageId, channelId: ChannelId, reaction: Reaction?) : LongPressReactionData(var1, var2, var4), ReactEvent {
   public final val channelId: ChannelId
   public final val messageId: MessageId
   public final val reaction: Reaction?

   fun LongPressReactionData(var1: java.lang.String, var2: Long, var4: ReactionView.Reaction) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.reaction = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): Reaction? {
      return this.reaction;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ..., reaction: Reaction? = ...): LongPressReactionData {
      q.h(var1, "messageId");
      return new LongPressReactionData(var1, var2, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressReactionData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.reaction, var1.reaction);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.reaction == null) {
         var1 = 0;
      } else {
         var1 = this.reaction.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun serialize(): WritableMap {
      val var7: WritableNativeMap;
      if (this.reaction != null) {
         var7 = NativeMapExtensionsKt.nativeMapOf(
            w.a("emoji", NativeMapExtensionsKt.nativeMapOf(w.a("name", this.reaction.getEmoji().getName()), w.a("id", this.reaction.getEmoji().getId()))),
            w.a("me", this.reaction.isMe())
         );
      } else {
         var7 = null;
      }

      val var3: Pair = w.a("messageId", this.messageId);
      val var4: Pair = w.a("channelId", ChannelId.toString-impl(this.channelId));
      val var5: Pair = w.a("reaction", var7);
      var var8: java.lang.Boolean = null;
      if (this.reaction != null) {
         var8 = this.reaction.isBurstReaction();
      }

      return NativeMapExtensionsKt.nativeMapOf(var3, var4, var5, w.a("isBurst", var8));
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: ReactionView.Reaction = this.reaction;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LongPressReactionData(messageId=");
      var3.append(var1);
      var3.append(", channelId=");
      var3.append(var2);
      var3.append(", reaction=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }
}
