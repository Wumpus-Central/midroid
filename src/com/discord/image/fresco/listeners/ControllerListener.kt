package com.discord.image.fresco.listeners

import android.graphics.drawable.Animatable

public open class ControllerListener : com.facebook.drawee.controller.ControllerListener {
   public open fun onFailure(id: String?, throwable: Throwable?) {
   }

   public open fun onFinalImageSet(id: String?, imageInfo: Any?, animatable: Animatable?) {
   }

   public open fun onIntermediateImageFailed(id: String?, throwable: Throwable?) {
   }

   public open fun onIntermediateImageSet(id: String?, imageInfo: Any?) {
   }

   public open fun onRelease(id: String?) {
   }

   public open fun onSubmit(id: String?, callerContext: Any?) {
   }
}
