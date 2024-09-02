package com.discord.chat.presentation.message.view.botuikit

import com.discord.primitives.UserId
import kotlin.jvm.internal.q

public class ContentInventoryEventHandlers(onTapContentInventoryEntry: (UserId, String, String) -> Unit) {
   public final val onTapContentInventoryEntry: (UserId, String, String) -> Unit

   init {
      q.h(var1, "onTapContentInventoryEntry");
      super();
      this.onTapContentInventoryEntry = var1;
   }
}
