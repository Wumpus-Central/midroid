package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.presentation.root.MessageContext
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

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
      r.h(var1, "message");
      r.h(var3, "messageContext");
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
      r.h(var1, "message");
      r.h(var3, "messageContext");
      return new MessageItem(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.message, var1.message)) {
            return false;
         } else if (!r.c(this.messageFrame, var1.messageFrame)) {
            return false;
         } else if (!r.c(this.messageContext, var1.messageContext)) {
            return false;
         } else if (this.allowChildGestures != var1.allowChildGestures) {
            return false;
         } else if (this.isHighlight != var1.isHighlight) {
            return false;
         } else if (!r.c(this.backgroundHighlight, var1.backgroundHighlight)) {
            return false;
         } else if (!r.c(this.reactTag, var1.reactTag)) {
            return false;
         } else {
            return this.renderContentOnly == var1.renderContentOnly;
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = this.message.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.messageFrame == null) {
         var1 = 0;
      } else {
         var1 = this.messageFrame.hashCode();
      }

      val var9: Int = this.messageContext.hashCode();
      var var6: Byte = 1;
      var var2: Byte = this.allowChildGestures;
      if (this.allowChildGestures != 0) {
         var2 = 1;
      }

      var var11: Byte = this.isHighlight;
      if (this.isHighlight != 0) {
         var11 = 1;
      }

      val var12: Int;
      if (this.backgroundHighlight == null) {
         var12 = 0;
      } else {
         var12 = this.backgroundHighlight.hashCode();
      }

      if (this.reactTag != null) {
         var5 = this.reactTag.hashCode();
      }

      if (this.renderContentOnly == 0) {
         var6 = this.renderContentOnly;
      }

      return ((((((var8 * 31 + var1) * 31 + var9) * 31 + var2) * 31 + var11) * 31 + var12) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var9: Message = this.message;
      val var7: MessageFrame = this.messageFrame;
      val var8: MessageContext = this.messageContext;
      val var3: Boolean = this.allowChildGestures;
      val var1: Boolean = this.isHighlight;
      val var4: BackgroundHighlight = this.backgroundHighlight;
      val var6: Int = this.reactTag;
      val var2: Boolean = this.renderContentOnly;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MessageItem(message=");
      var5.append(var9);
      var5.append(", messageFrame=");
      var5.append(var7);
      var5.append(", messageContext=");
      var5.append(var8);
      var5.append(", allowChildGestures=");
      var5.append(var3);
      var5.append(", isHighlight=");
      var5.append(var1);
      var5.append(", backgroundHighlight=");
      var5.append(var4);
      var5.append(", reactTag=");
      var5.append(var6);
      var5.append(", renderContentOnly=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }
}
