package com.discord.misc.utilities.coroutines

import android.content.Context
import android.content.ContextWrapper
import android.view.View
import androidx.core.view.f1
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.RepeatOnLifecycleKt
import androidx.lifecycle.Lifecycle.State
import com.discord.misc.utilities.R
import kh.b
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineScope

public final val attachedScope: AttachedViewCoroutineScope
   public final get() {
      r.h(var0, "<this>");
      return attachedScope(var0, false);
   }


public fun View.attachedScope(verifyAttached: Boolean): AttachedViewCoroutineScope {
   r.h(var0, "<this>");
   if (var1 && !f1.T(var0)) {
      val var6: StringBuilder = new StringBuilder();
      var6.append("View not attached to window: ");
      var6.append(var0);
      throw new IllegalStateException(var6.toString().toString());
   } else {
      val var2: Int = R.id.view_coroutine_scope;
      var var3: AttachedViewCoroutineScope = (AttachedViewCoroutineScope)var0.getTag(R.id.view_coroutine_scope);
      if (var3 is AttachedViewCoroutineScope) {
         var3 = var3;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         return var3;
      } else {
         var3 = new AttachedViewCoroutineScope(var0);
         var0.setTag(var2, var3);
         return var3;
      }
   }
}

public suspend fun View.repeatOnLifecycleOwner(state: State, block: (CoroutineScope, Continuation<Unit>) -> Any?) {
   val var4: Any = RepeatOnLifecycleKt.b(requireLifecycleOwner(var0), var1, var2, var3);
   return if (var4 === b.c()) var4 else Unit.a;
}

public fun View.requireLifecycleOwner(): LifecycleOwner {
   r.h(var0, "<this>");

   for (Context var1 = var0.getContext(); var1 != null; var1 = ((ContextWrapper)var1).getBaseContext()) {
      if (var1 is LifecycleOwner) {
         return var1 as LifecycleOwner;
      }

      if (var1 !is ContextWrapper) {
         break;
      }
   }

   val var2: StringBuilder = new StringBuilder();
   var2.append("Failed to find LifecycleOwner for ");
   var2.append(var0);
   throw new IllegalArgumentException(var2.toString());
}
