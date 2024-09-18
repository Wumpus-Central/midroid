package com.discord.chat.bridge

import android.content.Context
import com.discord.react.utilities.ReactColorToAndroidColorKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.q

public fun Message.avatarUrl(context: Context): String? {
   q.h(var0, "<this>");
   q.h(var1, "context");
   return ReactAssetUtilsKt.inflateUrl(var1, var0.getAvatarURL$chat_release());
}

public fun Message.isAutomodSystemMessage(): Boolean {
   q.h(var0, "<this>");
   return var0.getType().isAutomodSystem();
}

public fun Message.isCallMessage(): Boolean {
   q.h(var0, "<this>");
   return var0.getType().isCall();
}

public fun Message.isEphemeral(): Boolean {
   q.h(var0, "<this>");
   val var1: Boolean;
   if (var0.getEphemeralIndication() != null) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

public fun Message.isSurvey(): Boolean {
   q.h(var0, "<this>");
   val var1: Boolean;
   if (var0.getSurveyIndication() != null) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

public fun Message.isSystemMessage(): Boolean {
   q.h(var0, "<this>");
   return var0.getType().isSystem();
}

public fun Message.roleDotColor(defaultColor: Int = ThemeManagerKt.getTheme().getInteractiveActive()): Int {
   q.h(var0, "<this>");
   val var2: Int = var0.getRoleColor();
   if (var2 != null) {
      var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(var2.intValue());
   }

   return var1;
}

@JvmSynthetic
fun `roleDotColor$default`(var0: Message, var1: Int, var2: Int, var3: Any): Int {
   if ((var2 and 1) != 0) {
      var1 = ThemeManagerKt.getTheme().getInteractiveActive();
   }

   return roleDotColor(var0, var1);
}

public fun Message.shouldAnimateEmoji(): Boolean {
   q.h(var0, "<this>");
   val var2: java.lang.Boolean = var0.getAnimateEmoji();
   val var1: Boolean;
   if (var2 != null) {
      var1 = var2;
   } else {
      var1 = false;
   }

   return var1;
}

public fun Message.shouldAutoPlayGifs(): Boolean {
   q.h(var0, "<this>");
   val var2: java.lang.Boolean = var0.getGifAutoPlay();
   val var1: Boolean;
   if (var2 != null) {
      var1 = var2;
   } else {
      var1 = false;
   }

   return var1;
}

public fun Message.shouldShowLinkDecorations(): Boolean {
   q.h(var0, "<this>");
   val var2: java.lang.Boolean = var0.getShowLinkDecorations();
   val var1: Boolean;
   if (var2 != null) {
      var1 = var2;
   } else {
      var1 = false;
   }

   return var1;
}

public fun Message.usernameColor(defaultColor: Int = ThemeManagerKt.getTheme().getTextNormal()): Int {
   q.h(var0, "<this>");
   val var2: Int = var0.getUsernameColor();
   if (var2 != null) {
      var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(var2.intValue());
   }

   return var1;
}

@JvmSynthetic
fun `usernameColor$default`(var0: Message, var1: Int, var2: Int, var3: Any): Int {
   if ((var2 and 1) != 0) {
      var1 = ThemeManagerKt.getTheme().getTextNormal();
   }

   return usernameColor(var0, var1);
}
