package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.reactions.ReactionView
import com.discord.reactions.ReactionView.Reaction
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import gh.w
import kotlin.jvm.internal.q

internal data class TapReactionData(messageId: MessageId, reaction: Reaction?, isBurst: Boolean? = ...) : TapReactionData(var1, var2, var3), ReactEvent {
   public final val isBurst: Boolean?
   public final val messageId: MessageId
   public final val reaction: Reaction?

   fun TapReactionData(var1: java.lang.String, var2: ReactionView.Reaction, var3: java.lang.Boolean) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.reaction = var2;
      this.isBurst = var3;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Reaction? {
      return this.reaction;
   }

   public operator fun component3(): Boolean? {
      return this.isBurst;
   }

   public fun copy(messageId: MessageId = ..., reaction: Reaction? = ..., isBurst: Boolean? = ...): TapReactionData {
      q.h(var1, "messageId");
      return new TapReactionData(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapReactionData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.reaction, var1.reaction)) {
            return false;
         } else {
            return q.c(this.isBurst, var1.isBurst);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      var var2: Int = 0;
      val var1: Int;
      if (this.reaction == null) {
         var1 = 0;
      } else {
         var1 = this.reaction.hashCode();
      }

      if (this.isBurst != null) {
         var2 = this.isBurst.hashCode();
      }

      return (var3 * 31 + var1) * 31 + var2;
   }

   public override fun serialize(): WritableMap {
      val var4: WritableNativeMap;
      if (this.reaction != null) {
         var4 = NativeMapExtensionsKt.nativeMapOf(
            w.a("emoji", NativeMapExtensionsKt.nativeMapOf(w.a("name", this.reaction.getEmoji().getName()), w.a("id", this.reaction.getEmoji().getId()))),
            w.a("me", this.reaction.isMe()),
            w.a("me_burst", this.reaction.isMeBurst())
         );
      } else {
         var4 = null;
      }

      val var2: Pair = w.a("messageId", this.messageId);
      val var3: Pair = w.a("reaction", var4);
      val var6: java.lang.Boolean;
      if (this.reaction != null) {
         var6 = this.reaction.isBurstReaction();
      } else {
         var6 = this.isBurst;
      }

      return NativeMapExtensionsKt.nativeMapOf(var2, var3, w.a("isBurst", var6));
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: ReactionView.Reaction = this.reaction;
      val var2: java.lang.Boolean = this.isBurst;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapReactionData(messageId=");
      var4.append(var1);
      var4.append(", reaction=");
      var4.append(var3);
      var4.append(", isBurst=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
