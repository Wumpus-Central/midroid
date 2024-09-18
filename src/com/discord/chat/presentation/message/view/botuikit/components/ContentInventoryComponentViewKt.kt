package com.discord.chat.presentation.message.view.botuikit.components

import android.graphics.drawable.Animatable
import com.discord.misc.utilities.size.SizeUtilsKt
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.image.ImageInfo
import kotlin.jvm.internal.q

public fun getContentControllerListener(imageView: SimpleDraweeView): ControllerListener<ImageInfo> {
   q.h(var0, "imageView");
   return new ControllerListener(var0) {
      final SimpleDraweeView $imageView;

      {
         this.$imageView = var1;
      }

      public void onFailure(java.lang.String var1, java.lang.Throwable var2) {
      }

      public void onFinalImageSet(java.lang.String var1, ImageInfo var2, Animatable var3) {
         if (var2 != null) {
            this.$imageView.getLayoutParams().width = -2;
            this.$imageView.getLayoutParams().height = SizeUtilsKt.getDpToPx(64);
            this.$imageView.setAspectRatio((float)var2.getWidth() / (float)var2.getHeight());
         }
      }

      public void onIntermediateImageFailed(java.lang.String var1, java.lang.Throwable var2) {
      }

      public void onIntermediateImageSet(java.lang.String var1, ImageInfo var2) {
      }

      public void onRelease(java.lang.String var1) {
      }

      public void onSubmit(java.lang.String var1, Object var2) {
      }
   };
}
