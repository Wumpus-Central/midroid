package com.discord.channel_spine

import com.facebook.react.uimanager.ThemedReactContext
import kotlin.jvm.internal.q

public object ChannelSpineViewManagerImpl {
   public const val NAME: String = "ChannelSpine"

   public fun createViewInstance(reactContext: ThemedReactContext): ChannelSpineView {
      q.h(var1, "reactContext");
      return new ChannelSpineView(var1, null, 2, null);
   }

   public fun numRows(view: ChannelSpineView, numRows: Int) {
      q.h(var1, "view");
      var1.setNumRows(var2);
   }

   public fun rowHeight(view: ChannelSpineView, height: Float) {
      q.h(var1, "view");
      var1.setRowHeight(var2);
   }
}
