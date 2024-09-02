package com.discord.sticker.react

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import kotlin.jvm.internal.q

public class StickerPackage : ReactPackage {
   public override fun createNativeModules(reactContext: ReactApplicationContext): MutableList<NativeModule> {
      q.h(var1, "reactContext");
      return new ArrayList<>();
   }

   public override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, LayoutShadowNode>> {
      q.h(var1, "reactContext");
      return i.p(new ViewManager[]{new StickerViewManagerAPNG(), new StickerViewManagerLottie()});
   }
}
