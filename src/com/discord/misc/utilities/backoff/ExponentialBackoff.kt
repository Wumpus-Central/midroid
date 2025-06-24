package com.discord.misc.utilities.backoff

import ab.I
import ab.f
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.Job.a
import y9.b

public class ExponentialBackoff(scope: CoroutineScope, initialDelay: Long = 1000L, maxDelay: Long = 300000L, maxAttempts: Int = 10) {
   private final val scope: CoroutineScope
   private final val initialDelay: Long
   private final val maxDelay: Long
   private final val maxAttempts: Int
   private final var currentDelay: Long
   private final var currentAttempt: Int
   private final var job: Job?

   init {
      q.h(var1, "scope");
      super();
      this.scope = var1;
      this.initialDelay = var2;
      this.maxDelay = var4;
      this.maxAttempts = var6;
      this.currentAttempt = 1;
   }

   private fun cancelCurrentJob() {
      if (this.job != null) {
         a.a(this.job, null, 1, null);
      }
   }

   private fun reset() {
      this.cancelCurrentJob();
      this.currentDelay = 0L;
      this.currentAttempt = 1;
   }

   public fun cancel() {
      this.reset();
   }

   public fun fail(action: (Continuation<Unit>) -> Any?) {
      q.h(var1, "action");
      this.cancelCurrentJob();
      if (this.currentAttempt <= this.maxAttempts) {
         val var4: Long;
         if (this.currentDelay == 0L) {
            var4 = d.e(this.initialDelay, 1L);
         } else {
            var4 = this.currentDelay * 2;
         }

         this.currentDelay = d.i(var4, this.maxDelay);
         this.currentAttempt++;
         this.job = f.d(this.scope, null, null, new Function2(this, var1, null) {
            final Function1 $action;
            int label;
            final ExponentialBackoff this$0;

            {
               super(2, var3);
               this.this$0 = var1;
               this.$action = var2x;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, this.$action, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var5: Any = b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     if (this.label != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     c.b(var1);
                     return Unit.a;
                  }

                  c.b(var1);
               } else {
                  c.b(var1);
                  val var3: Long = ExponentialBackoff.access$getCurrentDelay$p(this.this$0);
                  this.label = 1;
                  if (I.a(var3, this) === var5) {
                     return var5;
                  }
               }

               var1 = this.$action;
               this.label = 2;
               return if (var1.invoke(this) === var5) var5 else Unit.a;
            }
         }, 3, null);
      } else {
         throw new MaxAttemptsExceededException();
      }
   }

   public suspend fun <T> performBackoff(networkRequest: (Continuation<T>) -> Any?, shouldRetry: (T, Continuation<Boolean>) -> Any?): T {
      label53: {
         if (var3 is <unrepresentable>) {
            val var7: <unrepresentable> = var3 as <unrepresentable>;
            if (((var3 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
               var7.label = (var3 as <unrepresentable>).label + Integer.MIN_VALUE;
               var18 = var7;
               break label53;
            }
         }

         var18 = new kotlin.coroutines.jvm.internal.d(this, var3) {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            Object result;
            final ExponentialBackoff this$0;

            {
               super(var2);
               this.this$0 = var1;
            }

            public final Object invokeSuspend(Object var1) {
               this.result = var1;
               this.label |= Integer.MIN_VALUE;
               return this.this$0.performBackoff(null, null, this);
            }
         };
      }

      var var22: Any = ((<unrepresentable>)var18).result;
      val var11: Any = b.e();
      val var8: ExponentialBackoff;
      var var28: Any;
      if (((<unrepresentable>)var18).label != 0) {
         if (((<unrepresentable>)var18).label != 1) {
            if (((<unrepresentable>)var18).label != 2) {
               if (((<unrepresentable>)var18).label != 3) {
                  if (((<unrepresentable>)var18).label != 4) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  val var12: Function2 = ((<unrepresentable>)var18).L$2 as Function2;
                  val var15: Function1 = ((<unrepresentable>)var18).L$1 as Function1;
                  var8 = ((<unrepresentable>)var18).L$0 as ExponentialBackoff;
                  c.b(var22);
                  var2 = var12;
                  var1 = var15;
               } else {
                  val var13: Function2 = ((<unrepresentable>)var18).L$2 as Function2;
                  val var16: Function1 = ((<unrepresentable>)var18).L$1 as Function1;
                  var8 = ((<unrepresentable>)var18).L$0 as ExponentialBackoff;
                  c.b(var22);
                  ((<unrepresentable>)var18).L$0 = var8;
                  ((<unrepresentable>)var18).L$1 = var16;
                  ((<unrepresentable>)var18).L$2 = var13;
                  ((<unrepresentable>)var18).label = 4;
                  var28 = var16.invoke(var18);
                  var22 = var28;
                  if (var28 === var11) {
                     return var11;
                  }

                  var2 = var13;
                  var1 = var16;
               }

               ((<unrepresentable>)var18).L$0 = var8;
               ((<unrepresentable>)var18).L$1 = var1;
               ((<unrepresentable>)var18).L$2 = var2;
               ((<unrepresentable>)var18).L$3 = var22;
               ((<unrepresentable>)var18).label = 2;
               val var10: Any = var2.invoke(var22, var18);
               var28 = var22;
               var22 = var10;
               if (var10 === var11) {
                  return var11;
               }
            } else {
               var28 = ((<unrepresentable>)var18).L$3;
               var2 = ((<unrepresentable>)var18).L$2 as Function2;
               var1 = ((<unrepresentable>)var18).L$1 as Function1;
               var8 = ((<unrepresentable>)var18).L$0 as ExponentialBackoff;
               c.b(var22);
            }
         } else {
            var2 = ((<unrepresentable>)var18).L$2 as Function2;
            var1 = ((<unrepresentable>)var18).L$1 as Function1;
            var8 = ((<unrepresentable>)var18).L$0 as ExponentialBackoff;
            c.b(var22);
            ((<unrepresentable>)var18).L$0 = var8;
            ((<unrepresentable>)var18).L$1 = var1;
            ((<unrepresentable>)var18).L$2 = var2;
            ((<unrepresentable>)var18).L$3 = var22;
            ((<unrepresentable>)var18).label = 2;
            val var31: Any = var2.invoke(var22, var18);
            var28 = var22;
            var22 = var31;
            if (var31 === var11) {
               return var11;
            }
         }
      } else {
         c.b(var22);
         ((<unrepresentable>)var18).L$0 = this;
         ((<unrepresentable>)var18).L$1 = var1;
         ((<unrepresentable>)var18).L$2 = var2;
         ((<unrepresentable>)var18).label = 1;
         var22 = var1.invoke(var18);
         if (var22 === var11) {
            return var11;
         }

         var8 = this;
         ((<unrepresentable>)var18).L$0 = this;
         ((<unrepresentable>)var18).L$1 = var1;
         ((<unrepresentable>)var18).L$2 = var2;
         ((<unrepresentable>)var18).L$3 = var22;
         ((<unrepresentable>)var18).label = 2;
         val var32: Any = var2.invoke(var22, var18);
         var28 = var22;
         var22 = var32;
         if (var32 === var11) {
            return var11;
         }
      }

      while ((java.lang.Boolean)var22) {
         if (var8.currentAttempt > var8.maxAttempts) {
            throw new MaxAttemptsExceededException();
         }

         var var20: Long;
         if (var8.currentDelay == 0L) {
            var20 = var8.initialDelay;
         } else {
            var20 = var8.currentDelay * 2;
         }

         var20 = d.i(var20, var8.maxDelay);
         var8.currentDelay = var20;
         var8.currentAttempt++;
         ((<unrepresentable>)var18).L$0 = var8;
         ((<unrepresentable>)var18).L$1 = var1;
         ((<unrepresentable>)var18).L$2 = var2;
         ((<unrepresentable>)var18).L$3 = null;
         ((<unrepresentable>)var18).label = 3;
         if (I.a(var20, (Continuation)var18) === var11) {
            return var11;
         }

         ((<unrepresentable>)var18).L$0 = var8;
         ((<unrepresentable>)var18).L$1 = var1;
         ((<unrepresentable>)var18).L$2 = var2;
         ((<unrepresentable>)var18).label = 4;
         var28 = var1.invoke(var18);
         if (var28 === var11) {
            return var11;
         }

         val var30: Function1 = var1;
         var2 = var2;
         var1 = var1;
         ((<unrepresentable>)var18).L$0 = var8;
         ((<unrepresentable>)var18).L$1 = var30;
         ((<unrepresentable>)var18).L$2 = var2;
         ((<unrepresentable>)var18).L$3 = var28;
         ((<unrepresentable>)var18).label = 2;
         val var33: Any = var2.invoke(var28, var18);
         var28 = var28;
         var22 = var33;
         if (var33 === var11) {
            return var11;
         }
      }

      return var28;
   }

   public fun succeed() {
      this.reset();
   }
}
