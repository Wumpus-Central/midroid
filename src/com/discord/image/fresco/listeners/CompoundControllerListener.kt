package com.discord.image.fresco.listeners

import android.graphics.drawable.Animatable
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCompoundControllerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundControllerListener.kt\ncom/discord/image/fresco/listeners/CompoundControllerListener\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n13409#2,2:36\n13409#2,2:38\n13409#2,2:40\n13409#2,2:42\n13409#2,2:44\n13409#2,2:46\n*S KotlinDebug\n*F\n+ 1 CompoundControllerListener.kt\ncom/discord/image/fresco/listeners/CompoundControllerListener\n*L\n12#1:36,2\n16#1:38,2\n20#1:40,2\n24#1:42,2\n28#1:44,2\n32#1:46,2\n*E\n"])
public class CompoundControllerListener(vararg listeners: com.facebook.drawee.controller.ControllerListener<Any?>) :
   com.facebook.drawee.controller.ControllerListener {
   private final val internalListeners: Array<out com.facebook.drawee.controller.ControllerListener<Any?>>

   init {
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
