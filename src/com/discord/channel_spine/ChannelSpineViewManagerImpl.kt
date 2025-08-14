package com.discord.channel_spine

import com.facebook.react.uimanager.ThemedReactContext

public object ChannelSpineViewManagerImpl {
   public const val NAME: String = "ChannelSpine"

   public fun createViewInstance(reactContext: ThemedReactContext): ChannelSpineView {
      return new ChannelSpineView(var1, null, 2, null);
   }

   public fun numRows(view: ChannelSpineView, numRows: Int) {
      var1.setNumRows(var2);
   }

   public fun rowHeight(view: ChannelSpineView, height: Float) {
      var1.setRowHeight(var2);
   }
}
