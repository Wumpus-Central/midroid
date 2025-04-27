package com.discord.image.fresco.listeners

import android.graphics.drawable.Animatable

public open class ControllerListener : com.facebook.drawee.controller.ControllerListener {
   public override fun onFailure(id: String?, throwable: Throwable?) {
   }

   public override fun onFinalImageSet(id: String?, imageInfo: Any?, animatable: Animatable?) {
   }

   public override fun onIntermediateImageFailed(id: String?, throwable: Throwable?) {
   }

   public override fun onIntermediateImageSet(id: String?, imageInfo: Any?) {
   }

   public override fun onRelease(id: String?) {
   }

   public override fun onSubmit(id: String?, callerContext: Any?) {
   }
}
