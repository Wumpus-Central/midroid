package com.discord.chat.presentation.message.viewholder

import android.content.Context
import com.discord.chat.bridge.Message
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt

@JvmSynthetic
fun `access$getContentlessPreviewText`(var0: Context, var1: Message): java.lang.CharSequence {
   return getContentlessPreviewText(var0, var1);
}

private fun getContentlessPreviewText(context: Context, message: Message): CharSequence? {
   if (var1.hasStickers()) {
      return I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_STICKER_MOBILE, null, 2, null);
   } else if (var1.hasCommand()) {
      return I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_COMMAND_MOBILE, null, 2, null);
   } else if (var1.isVoiceMessage()) {
      return I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_VOICE_MESSAGE_MOBILE, null, 2, null);
   } else if (var1.isComponentsV2()) {
      return I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_COMPONENTS_V2_MOBILE, null, 2, null);
   } else {
      return if (var1.hasAttachmentsOrEmbeds()) I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null) else null;
   }
}
