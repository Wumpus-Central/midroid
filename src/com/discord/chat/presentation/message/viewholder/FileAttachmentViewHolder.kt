package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.FileAttachmentView
import kotlin.jvm.functions.Function2

public class FileAttachmentViewHolder(view: FileAttachmentView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val view: FileAttachmentView
   private final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.q.h(var1, "view");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.view = var1;
      this.eventHandler = var2;
   }

   public fun bind(fileAttachmentItem: FileAttachmentMessageAccessory, onClick: (String, String) -> Unit, spoilerConfig: SpoilerConfig?) {
      kotlin.jvm.internal.q.h(var1, "fileAttachmentItem");
      kotlin.jvm.internal.q.h(var2, "onClick");
      val var4: Attachment = var1.getAttachment();
      this.view
         .setContent(
            var4.getFilename(), var4.getSize(), var4.getUrl(), var2, var4.isSpoiler(), var3, var1.getUploadItemProps(new Function2(this.eventHandler) {
               {
                  super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
               }

               public final void invoke(java.lang.String var1, java.lang.String var2) {
                  kotlin.jvm.internal.q.h(var1, "p0");
                  kotlin.jvm.internal.q.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
               }
            }), var4.getBackgroundColor()
         );
   }
}
