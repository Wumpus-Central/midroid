package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.UploadProgress
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.uploadprogress.UploadProgressView
import kotlin.jvm.functions.Function0

public class UploadProgressViewHolder(uploadProgressView: UploadProgressView) : MessagePartViewHolder {
   private final val uploadProgressView: UploadProgressView

   init {
      kotlin.jvm.internal.q.h(var1, "uploadProgressView");
      super(var1, null);
      this.uploadProgressView = var1;
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
            new Function0(var2, var1) {
               final ChatEventHandler $eventHandler;
               final UploadProgress $uploadProgress;

               {
                  super(0);
                  this.$eventHandler = var1;
                  this.$uploadProgress = var2;
               }

               public final void invoke() {
                  this.$eventHandler.onTapUploadProgressClose(this.$uploadProgress.getFileId());
               }
            }
         );
   }
}
