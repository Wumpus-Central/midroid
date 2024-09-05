package com.discord.react

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.jakewharton.processphoenix.ProcessPhoenix
import kotlin.jvm.internal.q

public class FontModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   @ReactMethod
   public fun getFontScale(callback: Callback) {
      q.h(var1, "callback");
      val var2: FontManager = FontManager.INSTANCE;
      var1.invoke(FontManager.INSTANCE.getFontScale(this.reactContext), var2.getIsClassicChatFontScaleEnabled(this.reactContext));
   }

   public override fun getName(): String {
      return "FontModule";
   }

   @ReactMethod
   public fun setFontScale(fontScale: Double, isClassicChatFontScaleEnabled: Boolean) {
      FontManager.INSTANCE.setFontSize(this.reactContext, (float)var1, var3);
      ProcessPhoenix.b(this.reactContext);
   }
}
