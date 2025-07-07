package com.discord.appreview

import V6.b
import V6.c
import Y6.a
import android.app.Activity
import com.google.android.gms.tasks.Task
import com.google.android.play.core.review.ReviewManager
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import m1.d
import m1.e

internal class AppRatingRequester(activity: Activity, useFakeReviewManager: Boolean, onComplete: () -> Unit, onFailure: (Exception) -> Unit) {
   private final val activity: Activity
   private final val useFakeReviewManager: Boolean
   private final val onComplete: () -> Unit
   private final val onFailure: (Exception) -> Unit

   init {
      r.h(var1, "activity");
      r.h(var3, "onComplete");
      r.h(var4, "onFailure");
      super();
      this.activity = var1;
      this.useFakeReviewManager = var2;
      this.onComplete = var3;
      this.onFailure = var4;
   }

   private fun createReviewManager(fake: Boolean, activity: Activity): ReviewManager {
      val var3: Any;
      if (var1) {
         var3 = new a(var2);
      } else {
         var3 = c.a(var2);
         r.g(var3, "create(...)");
      }

      return (ReviewManager)var3;
   }

   @JvmStatic
   fun `executeRequest$lambda$1`(var0: ReviewManager, var1: AppRatingRequester, var2: Task) {
      r.h(var2, "task");
      if (var2.p()) {
         val var4: Task = var0.a(var1.activity, var2.l() as b);
         r.g(var4, "launchReviewFlow(...)");
         var4.d(new e(var1));
      } else {
         val var3: Function1 = var1.onFailure;
         val var6: Exception = var2.k();
         var var5: Exception = var6;
         if (var6 == null) {
            var5 = new Exception("Unknown error");
         }

         var3.invoke(var5);
      }
   }

   @JvmStatic
   fun `executeRequest$lambda$1$lambda$0`(var0: AppRatingRequester, var1: Task) {
      r.h(var1, "it");
      var0.onComplete.invoke();
   }

   @JvmStatic
   fun `executeRequest$lambda$2`(var0: AppRatingRequester) {
      var0.onFailure.invoke(new Exception("Request was canceled"));
   }

   public fun executeRequest() {
      val var2: ReviewManager = this.createReviewManager(this.useFakeReviewManager, this.activity);
      val var1: Task = var2.b();
      r.g(var1, "requestReviewFlow(...)");
      var1.d(new m1.c(var2, this));
      var1.b(new d(this));
   }
}
