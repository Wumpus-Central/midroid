package com.discord.misc.utilities.coroutines

import android.view.View
import android.view.View.OnAttachStateChangeListener
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.v
import vk.r0

public class AttachedViewCoroutineScope(view: View) : CoroutineScope {
   public open val coroutineContext: CoroutineContext

   init {
      q.h(var1, "view");
      super();
      this.$$delegate_0 = MainImmediateScopeKt.MainImmediateScope();
      var1.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
         final AttachedViewCoroutineScope this$0;

         {
            this.this$0 = var1;
         }

         public void onViewAttachedToWindow(View var1) {
            q.h(var1, "view");
         }

         public void onViewDetachedFromWindow(View var1) {
            q.h(var1, "view");
            val var2: AttachedViewCoroutineScope = this.this$0;
            val var3: StringBuilder = new StringBuilder();
            var3.append(var1);
            var3.append(" detached from window");
            AttachedViewCoroutineScope.cancelAllWork$default(var2, var3.toString(), null, 2, null);
         }
      });
   }

   public fun cancelAllWork(message: String, cause: Throwable? = null) {
      q.h(var1, "message");
      v.g(this.getCoroutineContext(), r0.a(var1, var2));
   }
}
