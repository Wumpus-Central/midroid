package com.discord.sticker.react

import com.discord.sticker.StickerView
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.viewmanagers.NativeLottieNodeManagerDelegate
import com.facebook.react.viewmanagers.NativeLottieNodeManagerInterface
import kotlin.jvm.internal.q

@ReactModule(name = "NativeLottieNode")
internal class StickerViewManagerLottie : SimpleViewManager<StickerView>, NativeLottieNodeManagerInterface<StickerView> {
   private final val delegate: NativeLottieNodeManagerDelegate<StickerView, StickerViewManagerLottie> = new NativeLottieNodeManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): StickerView {
      q.h(var1, "reactContext");
      val var2: StickerView = new StickerView(var1, null, 0, 6, null);
      var2.inflateLottieView();
      return var2;
   }

   protected open fun getDelegate(): NativeLottieNodeManagerDelegate<StickerView, StickerViewManagerLottie> {
      return this.delegate;
   }

   public override fun getName(): String {
      return "NativeLottieNode";
   }

   public open fun onDropViewInstance(view: StickerView) {
      q.h(var1, "view");
      super.onDropViewInstance(var1);
      var1.recycle();
   }

   public open fun receiveCommand(node: StickerView, commandId: String, args: ReadableArray?) {
      q.h(var1, "node");
      q.h(var2, "commandId");
      if (q.c(var2, "setup")) {
         if (var3 == null) {
            return;
         }

         this.setup(var1, var3.getString(0), var3.getString(1), var3.getInt(2), var3.getInt(3), var3.getInt(4), var3.getBoolean(5));
      }
   }

   public open fun setup(view: StickerView, asset: String?, url: String?, width: Int, height: Int, renderMode: Int, animating: Boolean) {
      q.h(var1, "view");
      if (var2 != null && var3 != null) {
         var1.asLottie(var3, var4, var5, var7, var2, var6);
      }
   }

   public companion object {
      public const val NAME: String
      private const val SETUP_COMMAND_ID: String
   }
}
