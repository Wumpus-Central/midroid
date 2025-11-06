package com.discord.appreview

import android.app.Activity
import com.google.android.gms.tasks.Task
import com.google.android.play.core.review.ReviewManager
import ij.c
import kotlin.jvm.functions.Function1
import q7.d
import q7.e

internal class AppRatingRequester(activity: Activity, useFakeReviewManager: Boolean, onComplete: () -> Unit, onFailure: (Exception) -> Unit) {
   private final val activity: Activity
   private final val useFakeReviewManager: Boolean
   private final val onComplete: () -> Unit
   private final val onFailure: (Exception) -> Unit

   init {
      this.activity = var1;
      this.useFakeReviewManager = var2;
      this.onComplete = var3;
      this.onFailure = var4;
   }

   private fun createReviewManager(fake: Boolean, activity: Activity): ReviewManager {
      if (var1) {
         return new lj.a(var2);
      } else {
         val var3: ReviewManager = c.a(var2);
         return var3;
      }
   }

   @JvmStatic
   fun `executeRequest$lambda$1`(var0: ReviewManager, var1: AppRatingRequester, var2: Task) {
      if (var2.p()) {
         val var5: Task = var0.a(var1.activity, var2.l() as ij.b);
         var5.addOnCompleteListener(new e(var1));
      } else {
         val var3: Function1 = var1.onFailure;
         val var6: Exception = var2.k();
         var var4: Exception = var6;
         if (var6 == null) {
            var4 = new Exception("Unknown error");
         }

         var3.invoke(var4);
      }
   }

   @JvmStatic
   fun `executeRequest$lambda$1$lambda$0`(var0: AppRatingRequester, var1: Task) {
      var0.onComplete.invoke();
   }

   @JvmStatic
   fun `executeRequest$lambda$2`(var0: AppRatingRequester) {
      var0.onFailure.invoke(new Exception("Request was canceled"));
   }

   public fun executeRequest() {
      val var1: ReviewManager = this.createReviewManager(this.useFakeReviewManager, this.activity);
      val var2: Task = var1.b();
      var2.addOnCompleteListener(new q7.c(var1, this));
      var2.a(new d(this));
   }
}
