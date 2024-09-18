package com.discord.emoji_picker.react_events

import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import kotlin.jvm.internal.q

internal class OnScrollBeginDragEvent(data: ScrollEvent) : OnScrollEvent {
   init {
      q.h(var1, "data");
      super(var1);
   }
}
