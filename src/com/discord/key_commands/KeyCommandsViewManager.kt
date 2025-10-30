package com.discord.key_commands

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.KeyCommandsViewManagerDelegate
import com.facebook.react.viewmanagers.KeyCommandsViewManagerInterface
import com.facebook.react.views.view.ReactViewGroup

@ReactModule(name = "KeyCommandsView")
public class KeyCommandsViewManager : ViewGroupManager<ReactViewGroup>, KeyCommandsViewManagerInterface<ReactViewGroup> {
   private final val delegate: KeyCommandsViewManagerDelegate<ReactViewGroup, KeyCommandsViewManager> = new KeyCommandsViewManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): ReactViewGroup {
      return new ReactViewGroup(var1);
   }

   protected open fun getDelegate(): KeyCommandsViewManagerDelegate<ReactViewGroup, KeyCommandsViewManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "KeyCommandsView";
   }

   public companion object {
      public const val NAME: String
   }
}
