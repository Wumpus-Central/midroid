package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.UploadProgress
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class UploadProgressMessageAccessory(messageId: MessageId, index: Int, uploadProgress: UploadProgress) : UploadProgressMessageAccessory(
      var1, var2, var3
   ) {
   public final val index: Int
   public open val messageId: MessageId
   public final val uploadProgress: UploadProgress

   fun UploadProgressMessageAccessory(var1: java.lang.String, var2: Int, var3: UploadProgress) {
      val var4: StringBuilder = new StringBuilder();
      var4.append("upload ");
      var4.append(var2);
      super(var1, var4.toString(), false, 4, null);
      this.messageId = var1;
      this.index = var2;
      this.uploadProgress = var3;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): UploadProgress {
      return this.uploadProgress;
   }

   public fun copy(messageId: MessageId = ..., index: Int = ..., uploadProgress: UploadProgress = ...): UploadProgressMessageAccessory {
      r.h(var1, "messageId");
      r.h(var3, "uploadProgress");
      return new UploadProgressMessageAccessory(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UploadProgressMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else {
            return r.c(this.uploadProgress, var1.uploadProgress);
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + Integer.hashCode(this.index)) * 31 + this.uploadProgress.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var1: Int = this.index;
      val var2: UploadProgress = this.uploadProgress;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UploadProgressMessageAccessory(messageId=");
      var3.append(var4);
      var3.append(", index=");
      var3.append(var1);
      var3.append(", uploadProgress=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
