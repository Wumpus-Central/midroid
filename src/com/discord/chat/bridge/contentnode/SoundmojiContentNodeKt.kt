package com.discord.chat.bridge.contentnode

import com.discord.emoji.RenderableEmoji

public fun SoundmojiContentNode.toRenderableEmoji(): RenderableEmoji? {
   val var1: Any;
   if (var0.getEmojiId() != null) {
      var1 = RenderableEmoji.Companion.customWithEmojiId(java.lang.Long.parseLong(var0.getEmojiId()), false, "");
   } else if (var0.getEmojiName() != null) {
      var1 = RenderableEmoji.Companion.unicode(var0.getEmojiName());
   } else {
      var1 = null;
   }

   return (RenderableEmoji)var1;
}
