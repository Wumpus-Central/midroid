package com.discord.modules.keycommands

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.KeyCommandsViewManagerDelegate
import com.facebook.react.viewmanagers.KeyCommandsViewManagerInterface
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.q
import vj.w
import wj.r

public class KeyCommandsViewManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, Any?> {
      return r.m(
         new Pair[]{
            w.a("keyModifierAlphaShift", 65536),
            w.a("keyModifierShift", 131072),
            w.a("keyModifierControl", 262144),
            w.a("keyModifierAlternate", 524288),
            w.a("keyModifierCommand", 1048576),
            w.a("keyModifierNumericPad", 2097152)
         }
      );
   }

   public open fun getName(): String {
      return "KeyCommandsView";
   }

   private companion object {
      private const val MODULE_NAME: String
   }

   @ReactModule(name = "KeyCommandsView")
   public class KeyCommandsView : ViewGroupManager<ReactViewGroup>, KeyCommandsViewManagerInterface<ReactViewGroup> {
      private final val delegate: KeyCommandsViewManagerDelegate<ReactViewGroup, com.discord.modules.keycommands.KeyCommandsViewManagerModule.KeyCommandsView> =
         new KeyCommandsViewManagerDelegate(this)

      protected open fun createViewInstance(reactContext: ThemedReactContext): ReactViewGroup {
         q.h(var1, "reactContext");
         return new ReactViewGroup(var1);
      }

      protected open fun getDelegate(): KeyCommandsViewManagerDelegate<
            ReactViewGroup,
            com.discord.modules.keycommands.KeyCommandsViewManagerModule.KeyCommandsView
         > {
         return this.delegate;
      }

      public open fun getName(): String {
         return "KeyCommandsView";
      }
   }
}
