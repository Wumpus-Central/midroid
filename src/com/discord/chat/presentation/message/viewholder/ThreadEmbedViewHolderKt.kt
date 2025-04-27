package com.discord.chat.presentation.message.viewholder

import android.content.Context
import com.discord.chat.bridge.Message
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt

@JvmSynthetic
fun `access$getContentlessPreviewText`(var0: Context, var1: Message): java.lang.CharSequence {
   return getContentlessPreviewText(var0, var1);
}

private fun getContentlessPreviewText(context: Context, message: Message): CharSequence? {
   var var4: java.util.List = var1.getStickers();
   var var3: Int = 0;
   var var2: Int;
   if (var4 != null) {
      var2 = var4.size();
   } else {
      var2 = 0;
   }

   if (var2 > 0) {
      return I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_STICKER_MOBILE, null, 2, null);
   } else if (MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
      return I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_VOICE_MESSAGE_MOBILE, null, 2, null);
   } else {
      var4 = var1.getAttachments();
      if (var4 != null) {
         var2 = var4.size();
      } else {
         var2 = 0;
      }

      val var5: java.util.List = var1.getEmbeds();
      if (var5 != null) {
         var3 = var5.size();
      }

      return if (var2 <= 0 && var3 <= 0) null else I18nUtilsKt.i18nFormat$default(var0, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null);
   }
}
