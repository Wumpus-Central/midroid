package com.discord.misc.utilities.keyboard

import Oa.b
import android.app.Activity
import android.view.View
import android.view.Window
import android.widget.EditText
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.n0
import androidx.core.view.WindowInsetsCompat.n
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.misc.utilities.coroutines.MainImmediateScopeKt
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope
import mc.f

@JvmSynthetic
fun `access$getInsetsController`(var0: Window, var1: View): WindowInsetsControllerCompat {
   return getInsetsController(var0, var1);
}

private fun Window.getInsetsController(view: View): WindowInsetsControllerCompat {
   val var2: WindowInsetsControllerCompat = n0.a(var0, var1);
   return var2;
}

public fun Activity.hideKeyboard() {
   val var1: View = ActivityExtensionsKt.getContentView(var0);
   if (var1 != null) {
      val var2: Window = var0.getWindow();
      hideKeyboard(var1, var2);
   }
}

public fun View.hideKeyboard(window: Window) {
   f.d(MainImmediateScopeKt.MainImmediateScope(), null, null, new Function2<CoroutineScope, Continuation, Object>(var1, var0, null) {
      final View $self;
      final Window $window;
      int label;

      {
         super(2, var3);
         this.$window = var1;
         this.$self = var2x;
      }

      public final Continuation create(Object var1, Continuation var2) {
         return new <anonymous constructor>(this.$window, this.$self, var2);
      }

      public final Object invoke(CoroutineScope var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      public final Object invokeSuspend(Object var1) {
         b.e();
         if (this.label == 0) {
            c.b(var1);
            KeyboardExtensionsKt.access$getInsetsController(this.$window, this.$self).b(n.c());
            return Unit.a;
         } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }
      }
   }, 3, null);
}

public fun Activity.showKeyboard() {
   val var1: View = ActivityExtensionsKt.getContentView(var0);
   if (var1 != null) {
      val var2: Window = var0.getWindow();
      showKeyboard(var1, var2);
   }
}

public fun View.showKeyboard(window: Window) {
   f.d(MainImmediateScopeKt.MainImmediateScope(), null, null, new Function2<CoroutineScope, Continuation, Object>(var1, var0, null) {
      final View $self;
      final Window $window;
      int label;

      {
         super(2, var3);
         this.$window = var1;
         this.$self = var2x;
      }

      public final Continuation create(Object var1, Continuation var2) {
         return new <anonymous constructor>(this.$window, this.$self, var2);
      }

      public final Object invoke(CoroutineScope var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      public final Object invokeSuspend(Object var1) {
         b.e();
         if (this.label == 0) {
            c.b(var1);
            KeyboardExtensionsKt.access$getInsetsController(this.$window, this.$self).f(n.c());
            if (this.$self is EditText) {
               var1 = this.$self as EditText;
            } else {
               var1 = null;
            }

            if (var1 != null) {
               kotlin.coroutines.jvm.internal.b.a(var1.requestFocus());
            }

            return Unit.a;
         } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }
      }
   }, 3, null);
}
