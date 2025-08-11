package com.discord.portals.from_native

import android.annotation.SuppressLint
import android.view.View
import android.widget.FrameLayout
import com.facebook.react.uimanager.ThemedReactContext
import kotlin.jvm.internal.r

@SuppressLint(["ViewConstructor"])
public class PortalHolderViewGroup(reactContext: ThemedReactContext) : FrameLayout {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun endViewTransition(view: View?) {
   }

   public open fun startViewTransition(view: View?) {
   }
}
