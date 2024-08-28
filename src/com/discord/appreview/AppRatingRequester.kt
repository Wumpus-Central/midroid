package com.discord.appreview

import android.app.Activity
import com.google.android.gms.tasks.Task
import com.google.android.play.core.review.ReviewManager
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class AppRatingRequester(activity: Activity, useFakeReviewManager: Boolean, onComplete: () -> Unit, onFailure: (Exception) -> Unit) {
   private final val activity: Activity
   private final val onComplete: () -> Unit
   private final val onFailure: (Exception) -> Unit
   private final val useFakeReviewManager: Boolean

   init {
      q.h(var1, "activity");
      q.h(var3, "onComplete");
      q.h(var4, "onFailure");
      super();
      this.activity = var1;
      this.useFakeReviewManager = var2;
      this.onComplete = var3;
      this.onFailure = var4;
   }

   private fun createReviewManager(fake: Boolean, activity: Activity): ReviewManager {
      val var3: Any;
      if (var1) {
         var3 = new ge.a(var2);
      } else {
         var3 = de.c.a(var2);
         q.g(var3, "create(...)");
      }

      return (ReviewManager)var3;
   }

   @JvmStatic
   fun `executeRequest$lambda$1`(var0: ReviewManager, var1: AppRatingRequester, var2: Task) {
      q.h(var0, "$reviewManager");
      q.h(var1, "this$0");
      q.h(var2, "task");
      if (var2.p()) {
         val var4: Task = var0.b(var1.activity, var2.l() as de.b);
         q.g(var4, "launchReviewFlow(...)");
         var4.c(new c(var1));
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
      q.h(var0, "this$0");
      q.h(var1, "it");
      var0.onComplete.invoke();
   }

   @JvmStatic
   fun `executeRequest$lambda$2`(var0: AppRatingRequester) {
      q.h(var0, "this$0");
      var0.onFailure.invoke(new Exception("Request was canceled"));
   }

   public fun executeRequest() {
      val var1: ReviewManager = this.createReviewManager(this.useFakeReviewManager, this.activity);
      val var2: Task = var1.a();
      q.g(var2, "requestReviewFlow(...)");
      var2.c(new a(var1, this));
      var2.a(new b(this));
   }
}
