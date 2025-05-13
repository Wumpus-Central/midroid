package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.presentation.message.view.UploadContext
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

public sealed class MessageAttachmentAccessory protected constructor(messageId: MessageId,
      attachment: Attachment,
      attachmentIndex: Int,
      attachmentsOpacity: Float?
   )
   : MessageAccessory {
   public open val messageId: MessageId
   public open val attachment: Attachment
   public open val attachmentIndex: Int
   public open val attachmentsOpacity: Float?

   init {
      q.h(var1, "messageId");
      q.h(var2, "attachment");
      super(var1, MessageAttachmentAccessory.Companion.access$createAccessoryDescription(Companion, var2, var3), false, 4, null);
      this.messageId = var1;
      this.attachment = var2;
      this.attachmentIndex = var3;
      this.attachmentsOpacity = var4;
   }

   public fun getUploadItemProps(onCancelUploadItem: (String, String) -> Unit): UploadItemProps? {
      q.h(var1, "onCancelUploadItem");
      val var4: java.lang.String = this.getAttachment().getUploaderId();
      val var5: java.lang.String = this.getAttachment().getUploaderItemId();
      val var3: Int = this.getAttachment().getProgress();
      val var2: java.lang.Float = this.getAttachmentsOpacity();
      if (var4 != null && var5 != null && var3 != null && var2 != null) {
         val var6: UploadContext = new UploadContext(var4, var5);
         return new UploadItemProps(var3, var6, var2, new Function0(var1, var6) {
            final Function2 $onCancelUploadItem;
            final UploadContext $uploadContext;

            {
               super(0);
               this.$onCancelUploadItem = var1;
               this.$uploadContext = var2;
            }

            public final void invoke() {
               this.$onCancelUploadItem.invoke(this.$uploadContext.getUploaderId(), this.$uploadContext.getUploadItemId());
            }
         });
      } else {
         return null;
      }
   }

   public companion object {
      private fun createAccessoryDescription(attachment: Attachment, attachmentIndex: Int): String {
         var var3: java.lang.String;
         if (var1.getUploaderId() != null && var1.getUploaderItemId() != null) {
            val var4: java.lang.String = var1.getUploaderId();
            var3 = var1.getUploaderItemId();
            val var5: StringBuilder = new StringBuilder();
            var5.append(var4);
            var5.append(" ");
            var5.append(var3);
            var3 = var5.toString();
         } else {
            var3 = java.lang.String.valueOf(var2);
         }

         val var8: java.lang.String = var1.type().getIndexLabel();
         val var6: StringBuilder = new StringBuilder();
         var6.append(var8);
         var6.append(" ");
         var6.append(var3);
         return var6.toString();
      }
   }
}
