package com.discord.chat.bridge.contentnode

import com.discord.emoji.RenderableEmoji

public fun SoundmojiContentNode.toRenderableEmoji(): RenderableEmoji? {
   if (var0.getEmojiId() != null) {
      return RenderableEmoji.Companion.customWithEmojiId(java.lang.Long.parseLong(var0.getEmojiId()), false, "");
   } else {
      return if (var0.getEmojiName() != null) RenderableEmoji.Companion.unicode(var0.getEmojiName()) else null;
   }
}
