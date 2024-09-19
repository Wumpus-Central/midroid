package com.discord.misc.utilities.coroutines

import android.content.Context
import android.content.ContextWrapper
import android.view.View
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.RepeatOnLifecycleKt
import androidx.lifecycle.Lifecycle.State
import com.discord.misc.utilities.R
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import lh.b

public final val attachedScope: AttachedViewCoroutineScope
   public final get() {
      q.h(var0, "<this>");
      return attachedScope(var0, false);
   }


public fun View.attachedScope(verifyAttached: Boolean): AttachedViewCoroutineScope {
   q.h(var0, "<this>");
   if (var1 && !var0.isAttachedToWindow()) {
      val var5: StringBuilder = new StringBuilder();
      var5.append("View not attached to window: ");
      var5.append(var0);
      throw new IllegalStateException(var5.toString().toString());
   } else {
      var var2: AttachedViewCoroutineScope = (AttachedViewCoroutineScope)var0.getTag(R.id.view_coroutine_scope);
      if (var2 is AttachedViewCoroutineScope) {
         var2 = var2;
      } else {
         var2 = null;
      }

      if (var2 != null) {
         return var2;
      } else {
         var2 = new AttachedViewCoroutineScope(var0);
         var0.setTag(R.id.view_coroutine_scope, var2);
         return var2;
      }
   }
}

public suspend fun View.repeatOnLifecycleOwner(state: State, block: (CoroutineScope, Continuation<Unit>) -> Any?) {
   val var4: Any = RepeatOnLifecycleKt.b(requireLifecycleOwner(var0), var1, var2, var3);
   return if (var4 === b.e()) var4 else Unit.a;
}

public fun View.requireLifecycleOwner(): LifecycleOwner {
   q.h(var0, "<this>");

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
