package com.discord.react.utilities

import android.view.View
import android.view.Choreographer.FrameCallback
import com.facebook.react.modules.core.ReactChoreographer
import com.facebook.react.modules.core.ReactChoreographer.CallbackType
import java.util.Collections
import java.util.WeakHashMap

private object ViewLayoutManager : FrameCallback {
   private final val viewSet: MutableSet<View> = Collections.newSetFromMap(new WeakHashMap())
   private final var layoutQueued: Boolean

   public open fun doFrame(p0: Long) {
      val var4: java.util.Set = viewSet;
      val var3: java.util.List = CollectionsKt.T0(var4);
      var4.clear();
      layoutQueued = false;

      for (View var5 : var3) {
         ReactViewExtensionsKt.access$measureAndLayoutInternal(var5);
      }
   }

   public fun queueMeasureAndLayout(view: View) {
      viewSet.add(var1);
      if (!layoutQueued) {
         ReactChoreographer.Companion.getInstance().postFrameCallback(CallbackType.DISPATCH_UI, this);
         layoutQueued = true;
      }
   }
}
