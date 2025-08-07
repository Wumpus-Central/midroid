package com.discord.react

import A9.s
import com.discord.codegen.NativeFontModuleSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import com.jakewharton.processphoenix.ProcessPhoenix
import kotlin.jvm.internal.r

public class FontModule(reactContext: ReactApplicationContext) : NativeFontModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun getCustomFontScale(): WritableMap {
      val var1: FontManager = FontManager.INSTANCE;
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("fontScale", FontManager.INSTANCE.getFontScale(this.reactContext)),
         s.a("isClassicChatFontScaleEnabled", var1.getIsClassicChatFontScaleEnabled(this.reactContext))
      );
   }

   public override fun setCustomFontScale(fontScale: Double, isClassicChatFontScaleEnabled: Boolean) {
      FontManager.INSTANCE.setFontSize(this.reactContext, (float)var1, var3);
      ProcessPhoenix.b(this.reactContext);
   }
}
