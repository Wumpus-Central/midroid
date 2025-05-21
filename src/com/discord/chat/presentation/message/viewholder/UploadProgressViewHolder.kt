package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.UploadProgress
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.uploadprogress.UploadProgressView

public class UploadProgressViewHolder(uploadProgressView: UploadProgressView) : MessagePartViewHolder {
   private final val uploadProgressView: UploadProgressView

   init {
      kotlin.jvm.internal.q.h(var1, "uploadProgressView");
      super(var1, null);
      this.uploadProgressView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: ChatEventHandler, var1: UploadProgress): Unit {
      var0.onTapUploadProgressClose(var1.getFileId());
      return Unit.a;
   }

   public fun bind(uploadProgress: UploadProgress, eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.q.h(var1, "uploadProgress");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      this.uploadProgressView
         .set(
            var1.getHeaderText(),
            var1.getHeaderColor(),
            var1.getBackgroundColor(),
            (int)(var1.getProgress() * (float)100),
            var1.getProgressStartColor(),
            var1.getProgressTrackColor(),
            var1.getIconTintColor(),
            new P(var2, var1)
         );
   }
}
