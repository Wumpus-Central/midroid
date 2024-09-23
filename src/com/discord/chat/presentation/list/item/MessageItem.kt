package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.presentation.root.MessageContext
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class MessageItem(message: Message,
      messageFrame: MessageFrame? = null,
      messageContext: MessageContext = new MessageContext(
            false, false, null, null, null, null, false, null, false, false, false, false, false, null, null, 32767, null
         ),
      allowChildGestures: Boolean = true,
      isHighlight: Boolean = false,
      backgroundHighlight: BackgroundHighlight? = null,
      reactTag: Int? = null,
      renderContentOnly: Boolean = false
   )
   : ChatListItem {
   public final val allowChildGestures: Boolean
   public final val backgroundHighlight: BackgroundHighlight?
   public final val isHighlight: Boolean
   public final val message: Message
   public final val messageContext: MessageContext
   public final val messageFrame: MessageFrame?
   public final val reactTag: Int?
   public final val renderContentOnly: Boolean

   init {
      q.h(var1, "message");
      q.h(var3, "messageContext");
      super(MessageId.toString-impl(var1.getId-3Eiw7ao()), null);
      this.message = var1;
      this.messageFrame = var2;
      this.messageContext = var3;
      this.allowChildGestures = var4;
      this.isHighlight = var5;
      this.backgroundHighlight = var6;
      this.reactTag = var7;
      this.renderContentOnly = var8;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public operator fun component2(): MessageFrame? {
      return this.messageFrame;
   }

   public operator fun component3(): MessageContext {
      return this.messageContext;
   }

   public operator fun component4(): Boolean {
      return this.allowChildGestures;
   }

   public operator fun component5(): Boolean {
      return this.isHighlight;
   }

   public operator fun component6(): BackgroundHighlight? {
      return this.backgroundHighlight;
   }

   public operator fun component7(): Int? {
      return this.reactTag;
   }

   public operator fun component8(): Boolean {
      return this.renderContentOnly;
   }

   public fun copy(
      message: Message = var0.message,
      messageFrame: MessageFrame? = var0.messageFrame,
      messageContext: MessageContext = var0.messageContext,
      allowChildGestures: Boolean = var0.allowChildGestures,
      isHighlight: Boolean = var0.isHighlight,
      backgroundHighlight: BackgroundHighlight? = var0.backgroundHighlight,
      reactTag: Int? = var0.reactTag,
      renderContentOnly: Boolean = var0.renderContentOnly
   ): MessageItem {
      q.h(var1, "message");
      q.h(var3, "messageContext");
      return new MessageItem(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.message, var1.message)) {
            return false;
         } else if (!q.c(this.messageFrame, var1.messageFrame)) {
            return false;
         } else if (!q.c(this.messageContext, var1.messageContext)) {
            return false;
         } else if (this.allowChildGestures != var1.allowChildGestures) {
            return false;
         } else if (this.isHighlight != var1.isHighlight) {
            return false;
         } else if (!q.c(this.backgroundHighlight, var1.backgroundHighlight)) {
            return false;
         } else if (!q.c(this.reactTag, var1.reactTag)) {
            return false;
         } else {
            return this.renderContentOnly == var1.renderContentOnly;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.message.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.messageFrame == null) {
         var1 = 0;
      } else {
         var1 = this.messageFrame.hashCode();
      }

      val var5: Int = this.messageContext.hashCode();
      val var6: Int = java.lang.Boolean.hashCode(this.allowChildGestures);
      val var7: Int = java.lang.Boolean.hashCode(this.isHighlight);
      val var2: Int;
      if (this.backgroundHighlight == null) {
         var2 = 0;
      } else {
         var2 = this.backgroundHighlight.hashCode();
      }

      if (this.reactTag != null) {
         var3 = this.reactTag.hashCode();
      }

      return ((((((var4 * 31 + var1) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var2) * 31 + var3) * 31 + java.lang.Boolean.hashCode(this.renderContentOnly);
   }

   public override fun toString(): String {
      val var6: Message = this.message;
      val var8: MessageFrame = this.messageFrame;
      val var7: MessageContext = this.messageContext;
      val var3: Boolean = this.allowChildGestures;
      val var2: Boolean = this.isHighlight;
      val var9: BackgroundHighlight = this.backgroundHighlight;
      val var5: Int = this.reactTag;
      val var1: Boolean = this.renderContentOnly;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MessageItem(message=");
      var4.append(var6);
      var4.append(", messageFrame=");
      var4.append(var8);
      var4.append(", messageContext=");
      var4.append(var7);
      var4.append(", allowChildGestures=");
      var4.append(var3);
      var4.append(", isHighlight=");
      var4.append(var2);
      var4.append(", backgroundHighlight=");
      var4.append(var9);
      var4.append(", reactTag=");
      var4.append(var5);
      var4.append(", renderContentOnly=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
