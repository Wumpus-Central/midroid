package com.discord.chat.presentation.message.view

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

public class AttachmentUploadOverlayViewManager {
   private final var attachmentUploadOverlayView: AttachmentUploadOverlayView?

   public fun configureAttachmentOverlay(rootView: View, containerView: ConstraintLayout, radiusPx: Int, uploadItemProps: UploadItemProps?) {
      kotlin.jvm.internal.q.h(var1, "rootView");
      kotlin.jvm.internal.q.h(var2, "containerView");
      if (var4 == null) {
         var1.setAlpha(1.0F);
         if (this.attachmentUploadOverlayView != null) {
            this.attachmentUploadOverlayView.setProgress(null);
         }

         if (this.attachmentUploadOverlayView != null) {
            this.attachmentUploadOverlayView.setUploadCancel(null);
         }
      } else {
         if (this.attachmentUploadOverlayView == null) {
            this.attachmentUploadOverlayView = AttachmentUploadOverlayView.Companion.createAndAttachUploadOverlayView(var2, var3);
         }

         val var7: AttachmentUploadOverlayView = this.attachmentUploadOverlayView;
         if (this.attachmentUploadOverlayView != null) {
            var1.setAlpha(var4.getUploadOpacity());
            var7.setProgress(var4);
            var7.setUploadCancel(var4);
         }
      }
   }
}
