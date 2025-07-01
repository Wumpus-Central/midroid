package com.discord.channel_spine

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.ChannelSpineManagerDelegate
import com.facebook.react.viewmanagers.ChannelSpineManagerInterface
import kotlin.jvm.internal.q

@ReactModule(name = "ChannelSpine")
public class ChannelSpineViewManager : SimpleViewManager<ChannelSpineView>, ChannelSpineManagerInterface<ChannelSpineView> {
   private final val mDelegate: ChannelSpineManagerDelegate<ChannelSpineView, ChannelSpineViewManager> = new ChannelSpineManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChannelSpineView {
      q.h(var1, "reactContext");
      return ChannelSpineViewManagerImpl.INSTANCE.createViewInstance(var1);
   }

   protected open fun getDelegate(): ChannelSpineManagerDelegate<ChannelSpineView, ChannelSpineViewManager> {
      return this.mDelegate;
   }

   public open fun getName(): String {
      return "ChannelSpine";
   }

   @ReactProp(name = "numRows")
   public open fun setNumRows(view: ChannelSpineView, numRows: Int) {
      q.h(var1, "view");
      ChannelSpineViewManagerImpl.INSTANCE.numRows(var1, var2);
   }

   @ReactProp(name = "rowHeight")
   public open fun setRowHeight(view: ChannelSpineView, height: Float) {
      q.h(var1, "view");
      ChannelSpineViewManagerImpl.INSTANCE.rowHeight(var1, var2);
   }
}
