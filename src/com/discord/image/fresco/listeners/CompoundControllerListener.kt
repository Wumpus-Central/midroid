package com.discord.image.fresco.listeners

import android.graphics.drawable.Animatable
import kotlin.jvm.internal.q

public class CompoundControllerListener(vararg listeners: com.facebook.drawee.controller.ControllerListener<Any?>) :
   com.facebook.drawee.controller.ControllerListener {
   private final val internalListeners: Array<out com.facebook.drawee.controller.ControllerListener<Any?>>

   init {
      q.h(var1, "listeners");
      super();
      this.internalListeners = var1;
   }

   public open fun onFailure(id: String?, throwable: Throwable?) {
      val var5: Array<com.facebook.drawee.controller.ControllerListener> = this.internalListeners;
      val var4: Int = this.internalListeners.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var5[var3].onFailure(var1, var2);
      }
   }

   public open fun onFinalImageSet(id: String?, imageInfo: Any?, animatable: Animatable?) {
      val var6: Array<com.facebook.drawee.controller.ControllerListener> = this.internalListeners;
      val var5: Int = this.internalListeners.length;

      for (int var4 = 0; var4 < var5; var4++) {
         var6[var4].onFinalImageSet(var1, var2, var3);
      }
   }

   public open fun onIntermediateImageFailed(id: String?, throwable: Throwable?) {
      val var5: Array<com.facebook.drawee.controller.ControllerListener> = this.internalListeners;
      val var4: Int = this.internalListeners.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var5[var3].onIntermediateImageFailed(var1, var2);
      }
   }

   public open fun onIntermediateImageSet(id: String?, imageInfo: Any?) {
      val var5: Array<com.facebook.drawee.controller.ControllerListener> = this.internalListeners;
      val var4: Int = this.internalListeners.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var5[var3].onIntermediateImageSet(var1, var2);
      }
   }

   public open fun onRelease(id: String?) {
      val var4: Array<com.facebook.drawee.controller.ControllerListener> = this.internalListeners;
      val var3: Int = this.internalListeners.length;

      for (int var2 = 0; var2 < var3; var2++) {
         var4[var2].onRelease(var1);
      }
   }

   public open fun onSubmit(id: String?, callerContext: Any?) {
      val var5: Array<com.facebook.drawee.controller.ControllerListener> = this.internalListeners;
      val var4: Int = this.internalListeners.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var5[var3].onSubmit(var1, var2);
      }
   }
}
