package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.presentation.message.view.UploadContext
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public sealed class MessageAttachmentAccessory protected constructor(messageId: MessageId,
   attachment: Attachment,
   attachmentIndex: Int,
   attachmentsOpacity: Float?
) : MessageAccessory(var1, MessageAttachmentAccessory.Companion.access$createAccessoryDescription(Companion, var2, var3), false, 4) {
   public open val messageId: MessageId
   public open val attachment: Attachment
   public open val attachmentIndex: Int
   public open val attachmentsOpacity: Float?

   init {
      this.messageId = var1;
      this.attachment = var2;
      this.attachmentIndex = var3;
      this.attachmentsOpacity = var4;
   }

   public fun getUploadItemProps(onCancelUploadItem: (String, String) -> Unit): UploadItemProps? {
      r.h(var1, "onCancelUploadItem");
      val var5: java.lang.String = this.getAttachment().getUploaderId();
      val var4: java.lang.String = this.getAttachment().getUploaderItemId();
      val var3: Int = this.getAttachment().getProgress();
      val var2: java.lang.Float = this.getAttachmentsOpacity();
      if (var5 != null && var4 != null && var3 != null && var2 != null) {
         val var6: UploadContext = new UploadContext(var5, var4);
         return new UploadItemProps(var3, var6, var2, new Function0<Unit>(var1, var6) {
            final Function2<java.lang.String, java.lang.String, Unit> $onCancelUploadItem;
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
            var3 = var1.getUploaderId();
            val var5: java.lang.String = var1.getUploaderItemId();
            val var4: StringBuilder = new StringBuilder();
            var4.append(var3);
            var4.append(" ");
            var4.append(var5);
            var3 = var4.toString();
         } else {
            var3 = java.lang.String.valueOf(var2);
         }

         val var6: java.lang.String = var1.type().getIndexLabel();
         val var8: StringBuilder = new StringBuilder();
         var8.append(var6);
         var8.append(" ");
         var8.append(var3);
         return var8.toString();
      }
   }
}
