package com.discord.channel_spine

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import kotlin.jvm.internal.r

public class ChannelSpineViewManager : SimpleViewManager<ChannelSpineView> {
   protected open fun createViewInstance(reactContext: ThemedReactContext): ChannelSpineView {
      r.h(var1, "reactContext");
      return ChannelSpineViewManagerImpl.INSTANCE.createViewInstance(var1);
   }

   public open fun getName(): String {
      return "ChannelSpine";
   }

   @ReactProp(name = "numRows")
   public fun numRows(view: ChannelSpineView, numRows: Int) {
      r.h(var1, "view");
      ChannelSpineViewManagerImpl.INSTANCE.numRows(var1, var2);
   }

   @ReactProp(name = "rowHeight")
   public fun rowHeight(view: ChannelSpineView, height: Float) {
      r.h(var1, "view");
      ChannelSpineViewManagerImpl.INSTANCE.rowHeight(var1, var2);
   }
}
