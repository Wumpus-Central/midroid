package com.discord.react

import com.discord.codegen.NativeFontModuleSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import com.jakewharton.processphoenix.ProcessPhoenix
import ht.v

public class FontModule(reactContext: ReactApplicationContext) : NativeFontModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun getCustomFontScale(): WritableMap {
      val var1: FontManager = FontManager.INSTANCE;
      return NativeMapExtensionsKt.nativeMapOf(
         v.a("fontScale", FontManager.INSTANCE.getFontScale(this.reactContext)),
         v.a("isClassicChatFontScaleEnabled", var1.getIsClassicChatFontScaleEnabled(this.reactContext))
      );
   }

   public override fun setCustomFontScale(fontScale: Double, isClassicChatFontScaleEnabled: Boolean) {
      FontManager.INSTANCE.setFontSize(this.reactContext, (float)var1, var3);
      ProcessPhoenix.b(this.reactContext);
   }
}
