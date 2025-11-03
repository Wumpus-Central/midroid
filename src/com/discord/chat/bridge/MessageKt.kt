@file:SourceDebugExtension(["SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\ncom/discord/chat/bridge/MessageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"])

package com.discord.chat.bridge

import android.content.Context
import com.discord.react.utilities.ReactColorToAndroidColorKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.SourceDebugExtension

public fun Message.avatarUrl(context: Context): String? {
   return ReactAssetUtilsKt.inflateUrl(var1, var0.getAvatarURL$chat_release());
}

public fun Message.isAutomodSystemMessage(): Boolean {
   return var0.getType().isAutomodSystem();
}

public fun Message.isCallMessage(): Boolean {
   return var0.getType().isCall();
}

public fun Message.isEphemeral(): Boolean {
   return var0.getEphemeralIndication() != null;
}

public fun Message.isSurvey(): Boolean {
   return var0.getSurveyIndication() != null;
}

public fun Message.isSystemMessage(): Boolean {
   return var0.getType().isSystem();
}

public fun Message.roleDotColor(defaultColor: Int = ThemeManagerKt.getTheme().getInteractiveActive()): Int {
   val var2: Int = var0.getRoleColor();
   return if (var2 != null) ReactColorToAndroidColorKt.reactColorToAndroidColor(var2.intValue()) else var1;
}

@JvmSynthetic
fun `roleDotColor$default`(var0: Message, var1: Int, var2: Int, var3: Any): Int {
   if ((var2 and 1) != 0) {
      var1 = ThemeManagerKt.getTheme().getInteractiveActive();
   }

   return roleDotColor(var0, var1);
}

public fun Message.shouldAnimateEmoji(): Boolean {
   val var1: java.lang.Boolean = var0.getAnimateEmoji();
   return var1 != null && var1;
}

public fun Message.shouldAutoPlayGifs(): Boolean {
   val var1: java.lang.Boolean = var0.getGifAutoPlay();
   return var1 != null && var1;
}

public fun Message.shouldShowLinkDecorations(): Boolean {
   val var1: java.lang.Boolean = var0.getShowLinkDecorations();
   return var1 != null && var1;
}

public fun Message.usernameColor(defaultColor: Int = ThemeManagerKt.getTheme().getTextNormal()): Int {
   val var2: Int = var0.getUsernameColor();
   return if (var2 != null) ReactColorToAndroidColorKt.reactColorToAndroidColor(var2.intValue()) else var1;
}

@JvmSynthetic
fun `usernameColor$default`(var0: Message, var1: Int, var2: Int, var3: Any): Int {
   if ((var2 and 1) != 0) {
      var1 = ThemeManagerKt.getTheme().getTextNormal();
   }

   return usernameColor(var0, var1);
}
