package com.discord.chat.reactevents

import Ca.v
import com.discord.primitives.MessageId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.reactions.ReactionView.Reaction
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap

internal data class TapReactionData(messageId: MessageId, reaction: Reaction?, isBurst: Boolean? = ..., location: String?) : TapReactionData(
         var1, var2, var3, var4
      ),
   ReactEvent {
   public final val messageId: MessageId
   public final val reaction: Reaction?
   public final val isBurst: Boolean?
   public final val location: String?

   fun TapReactionData(var1: java.lang.String, var2: Reaction, var3: java.lang.Boolean, var4: java.lang.String) {
      this.messageId = var1;
      this.reaction = var2;
      this.isBurst = var3;
      this.location = var4;
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

   public operator fun component4(): String? {
      return this.location;
   }

   public fun copy(messageId: MessageId = ..., reaction: Reaction? = ..., isBurst: Boolean? = ..., location: String? = ...): TapReactionData {
      return new TapReactionData(var1, var2, var3, var4, null);
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
         } else if (!(this.reaction == var1.reaction)) {
            return false;
         } else if (!(this.isBurst == var1.isBurst)) {
            return false;
         } else {
            return this.location == var1.location;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = MessageId.hashCode-impl(this.messageId);
      var var3: Int = 0;
      val var1: Int;
      if (this.reaction == null) {
         var1 = 0;
      } else {
         var1 = this.reaction.hashCode();
      }

      val var2: Int;
      if (this.isBurst == null) {
         var2 = 0;
      } else {
         var2 = this.isBurst.hashCode();
      }

      if (this.location != null) {
         var3 = this.location.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public open fun serialize(): WritableMap {
      val var4: WritableNativeMap;
      if (this.reaction != null) {
         var4 = NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{
               v.a(
                  "emoji",
                  NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("name", this.reaction.getEmoji().getName()), v.a("id", this.reaction.getEmoji().getId())})
               ),
               v.a("me", this.reaction.isMe()),
               v.a("me_burst", this.reaction.isMeBurst())
            }
         );
      } else {
         var4 = null;
      }

      val var2: Pair = v.a("messageId", this.messageId);
      val var3: Pair = v.a("reaction", var4);
      val var6: java.lang.Boolean;
      if (this.reaction != null) {
         var6 = this.reaction.isBurstReaction();
      } else {
         var6 = this.isBurst;
      }

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{var2, var3, v.a("isBurst", var6), v.a("location", this.location)});
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: Reaction = this.reaction;
      val var4: java.lang.Boolean = this.isBurst;
      val var3: java.lang.String = this.location;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapReactionData(messageId=");
      var5.append(var1);
      var5.append(", reaction=");
      var5.append(var2);
      var5.append(", isBurst=");
      var5.append(var4);
      var5.append(", location=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }
}
