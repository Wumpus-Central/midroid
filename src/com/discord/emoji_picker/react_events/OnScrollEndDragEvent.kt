package com.discord.emoji_picker.react_events

import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import kotlin.jvm.internal.r

internal class OnScrollEndDragEvent(data: ScrollEvent) : OnScrollEvent {
   init {
      r.h(var1, "data");
      super(var1);
   }
}
