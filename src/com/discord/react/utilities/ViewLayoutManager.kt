package com.discord.react.utilities

import android.view.View
import android.view.Choreographer.FrameCallback
import com.discord.logging.Log
import com.facebook.react.modules.core.ReactChoreographer
import com.facebook.react.modules.core.ReactChoreographer.CallbackType
import java.util.Collections
import java.util.WeakHashMap

private object ViewLayoutManager : FrameCallback {
   private final val TAG: String = ViewLayoutManager.class.getSimpleName()
   private final val viewSet: MutableSet<View> = Collections.newSetFromMap(new WeakHashMap())
   private final var layoutQueued: Boolean

   public open fun doFrame(p0: Long) {
      val var5: java.util.Set = viewSet;
      val var4: java.util.List = CollectionsKt.T0(var5);
      val var3: Int = var5.size();

      try {
         var5.clear();
         layoutQueued = false;
         var12 = var4.iterator();
      } catch (var8: Exception) {
         val var11: Log = Log.INSTANCE;
         val var7: java.lang.String = TAG;
         val var6: StringBuilder = new StringBuilder();
         var6.append("About to crash because of measureAndLayout, views being measured: ");
         var6.append(var3);
         Log.e$default(var11, var7, var6.toString(), null, 4, null);
         throw var8;
      }

      while (true) {
         try {
            if (!var12.hasNext()) {
               return;
            }

            val var10: View = var12.next() as View;
            ReactViewExtensionsKt.access$measureAndLayoutInternal(var10);
         } catch (var9: Exception) {
            val var13: Log = Log.INSTANCE;
            val var15: java.lang.String = TAG;
            val var14: StringBuilder = new StringBuilder();
            var14.append("About to crash because of measureAndLayout, views being measured: ");
            var14.append(var3);
            Log.e$default(var13, var15, var14.toString(), null, 4, null);
            throw var9;
         }
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
