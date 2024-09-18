package com.discord.react.utilities

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.UIImplementation
import com.facebook.react.uimanager.UIManagerModule
import com.facebook.react.uimanager.UIViewOperationQueue
import gh.l
import java.lang.reflect.Method
import kotlin.jvm.internal.q

private final val viewLayoutQueued: MutableSet<Int>

private final val viewOperationQueueMethod: Method by l.b(<unrepresentable>.INSTANCE)
   private final get() {
      return viewOperationQueueMethod$delegate.getValue() as Method;
   }


@JvmSynthetic
fun a(var0: ReactContext, var1: Int) {
   queueManualLayout$lambda$1(var0, var1);
}

private fun ReactContext.getUIImplementation(): UIImplementation {
   val var1: NativeModule = var0.getNativeModule(UIManagerModule.class);
   q.e(var1);
   return (var1 as UIManagerModule).getUIImplementation();
}

private fun UIImplementation.getUIViewOperationQueue(): UIViewOperationQueue? {
   var var1: UIViewOperationQueue = (UIViewOperationQueue)getViewOperationQueueMethod().invoke(var0);
   if (var1 is UIViewOperationQueue) {
      var1 = var1;
   } else {
      var1 = null;
   }

   return var1;
}

public fun ReactContext.queueManualLayout(viewId: Int) {
   q.h(var0, "<this>");
   if (!viewLayoutQueued.contains(var1)) {
      var0.runOnNativeModulesQueueThread(new a(var0, var1));
   }
}

fun `queueManualLayout$lambda$1`(var0: ReactContext, var1: Int) {
   q.h(var0, "$this_queueManualLayout");
   val var2: UIImplementation = getUIImplementation(var0);
   val var4: ReactShadowNode = var2.resolveShadowNode(var1);
   if (var4 != null) {
      q.e(var2);
      val var3: UIViewOperationQueue = getUIViewOperationQueue(var2);
      if (var3 != null) {
         val var5: ReactShadowNode = var4.getParent();
         q.e(var5);
         var3.enqueueUpdateLayout(var5.getReactTag(), var4.getReactTag(), var4.getScreenX(), var4.getScreenY(), var4.getScreenWidth(), var4.getScreenHeight());
      }
   }

   viewLayoutQueued.remove(var1);
}
