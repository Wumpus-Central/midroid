@file:SourceDebugExtension(["SMAP\nReactViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewExtensions.kt\ncom/discord/react/utilities/ReactViewExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"])

package com.discord.react.utilities

import Ca.l
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.UIImplementation
import com.facebook.react.uimanager.UIManagerModule
import com.facebook.react.uimanager.UIViewOperationQueue
import com.facebook.yoga.YogaDirection
import java.lang.reflect.Method
import kotlin.jvm.internal.SourceDebugExtension

private final val viewLayoutQueued: MutableSet<Int>

private final val viewOperationQueueMethod: Method by l.b(new e())
   private final get() {
      return viewOperationQueueMethod$delegate.getValue() as Method;
   }


@JvmSynthetic
fun a(): Method {
   return viewOperationQueueMethod_delegate$lambda$1();
}

@JvmSynthetic
fun b(var0: ReactContext, var1: Int) {
   queueManualLayout$lambda$3(var0, var1);
}

private fun ReactContext.getUIImplementation(): UIImplementation {
   val var1: NativeModule = var0.getNativeModule(UIManagerModule.class);
   return (var1 as UIManagerModule).getUIImplementation();
}

private fun UIImplementation.getUIViewOperationQueue(): UIViewOperationQueue? {
   val var4: Any = getViewOperationQueueMethod().invoke(var0, null);
   var var3: UIViewOperationQueue = null;
   if (var4 is UIViewOperationQueue) {
      var3 = var4 as UIViewOperationQueue;
   }

   return var3;
}

public fun ReactContext.queueManualLayout(viewId: Int) {
   if (!viewLayoutQueued.contains(var1)) {
      var0.runOnNativeModulesQueueThread(new f(var0, var1));
   }
}

fun `queueManualLayout$lambda$3`(var0: ReactContext, var1: Int) {
   val var2: UIImplementation = getUIImplementation(var0);
   val var4: ReactShadowNode = var2.resolveShadowNode(var1);
   if (var4 != null) {
      val var5: UIViewOperationQueue = getUIViewOperationQueue(var2);
      if (var5 != null) {
         val var3: ReactShadowNode = var4.getParent();
         var5.enqueueUpdateLayout(
            var3.getReactTag(), var4.getReactTag(), var4.getScreenX(), var4.getScreenY(), var4.getScreenWidth(), var4.getScreenHeight(), YogaDirection.e
         );
      }
   }

   viewLayoutQueued.remove(var1);
}

fun `viewOperationQueueMethod_delegate$lambda$1`(): Method {
   val var0: Method = UIImplementation.class.getDeclaredMethod("com.discord.react.utilities.getUIViewOperationQueue", null);
   var0.setAccessible(true);
   return var0;
}
