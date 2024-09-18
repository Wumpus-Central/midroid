package com.discord.chat.presentation.message.view

public class UploadItemProps(uploadProgress: Int, uploadContext: UploadContext, uploadOpacity: Float, onCancelUploadItem: () -> Unit) {
   public final val onCancelUploadItem: () -> Unit
   public final val uploadContext: UploadContext
   public final val uploadOpacity: Float
   public final val uploadProgress: Int

   init {
      kotlin.jvm.internal.q.h(var2, "uploadContext");
      kotlin.jvm.internal.q.h(var4, "onCancelUploadItem");
      super();
      this.uploadProgress = var1;
      this.uploadContext = var2;
      this.uploadOpacity = var3;
      this.onCancelUploadItem = var4;
   }
}
