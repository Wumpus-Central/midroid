package com.discord.misc.utilities.time

import ib.I
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.time.Duration
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import lb.e

public fun intervalFlow(periodMs: Long, initialDelayMs: Long = var0): Flow<Unit> {
   return e.m(new Function2(var2, var0, null) {
      final long $initialDelayMs;
      final long $periodMs;
      private Object L$0;
      int label;

      {
         super(2, var5);
         this.$initialDelayMs = var1;
         this.$periodMs = var3x;
      }

      public final Continuation create(Object var1, Continuation var2) {
         val var3: Function2 = new <anonymous constructor>(this.$initialDelayMs, this.$periodMs, var2);
         var3.L$0 = var1;
         return var3;
      }

      public final Object invoke(FlowCollector var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      public final Object invokeSuspend(Object var1) {
         val var6: Any = G9.b.e();
         if (this.label != 0) {
            if (this.label != 1) {
               if (this.label != 2) {
                  if (this.label != 3) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  val var5: FlowCollector = this.L$0 as FlowCollector;
                  c.b(var1);
                  var1 = var5;
               } else {
                  val var11: FlowCollector = this.L$0 as FlowCollector;
                  c.b(var1);
                  val var3x: Long = this.$periodMs;
                  this.L$0 = var11;
                  this.label = 3;
                  var1 = var11;
                  if (I.a(var3x, this) === var6) {
                     return var6;
                  }
               }
            } else {
               val var12: FlowCollector = this.L$0 as FlowCollector;
               c.b(var1);
               var1 = var12;
            }
         } else {
            c.b(var1);
            var1 = this.L$0 as FlowCollector;
            val var9: Long = this.$initialDelayMs;
            this.L$0 = var1;
            this.label = 1;
            if (I.a(var9, this) === var6) {
               return var6;
            }
         }

         val var10: Long;
         do {
            val var7: Unit = Unit.a;
            this.L$0 = var1;
            this.label = 2;
            if (var1.emit(var7, this) === var6) {
               return var6;
            }

            var10 = this.$periodMs;
            this.L$0 = var1;
            this.label = 3;
            var1 = var1;
         } while (I.a(var10, this) != var6);

         return var6;
      }
   });
}

@JvmSynthetic
fun `intervalFlow$default`(var0: Long, var2: Long, var4: Int, var5: Any): Flow {
   if ((var4 and 2) != 0) {
      var2 = var0;
   }

   return intervalFlow(var0, var2);
}

public fun intervalFlow(period: Duration, initialDelay: Duration = ...): Flow<Unit> {
   return e.m(new Function2(var2, var0, null) {
      final long $initialDelay;
      final long $period;
      private Object L$0;
      int label;

      {
         super(2, var5);
         this.$initialDelay = var1;
         this.$period = var3x;
      }

      public final Continuation create(Object var1, Continuation var2) {
         val var3: Function2 = new <anonymous constructor>(this.$initialDelay, this.$period, var2);
         var3.L$0 = var1;
         return var3;
      }

      public final Object invoke(FlowCollector var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      public final Object invokeSuspend(Object var1) {
         val var6: Any = G9.b.e();
         if (this.label != 0) {
            if (this.label != 1) {
               if (this.label != 2) {
                  if (this.label != 3) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  val var5: FlowCollector = this.L$0 as FlowCollector;
                  c.b(var1);
                  var1 = var5;
               } else {
                  val var11: FlowCollector = this.L$0 as FlowCollector;
                  c.b(var1);
                  val var3x: Long = this.$period;
                  this.L$0 = var11;
                  this.label = 3;
                  var1 = var11;
                  if (I.b(var3x, this) === var6) {
                     return var6;
                  }
               }
            } else {
               val var12: FlowCollector = this.L$0 as FlowCollector;
               c.b(var1);
               var1 = var12;
            }
         } else {
            c.b(var1);
            var1 = this.L$0 as FlowCollector;
            val var9: Long = this.$initialDelay;
            this.L$0 = var1;
            this.label = 1;
            if (I.b(var9, this) === var6) {
               return var6;
            }
         }

         val var10: Long;
         do {
            val var7: Unit = Unit.a;
            this.L$0 = var1;
            this.label = 2;
            if (var1.emit(var7, this) === var6) {
               return var6;
            }

            var10 = this.$period;
            this.L$0 = var1;
            this.label = 3;
            var1 = var1;
         } while (I.b(var10, this) != var6);

         return var6;
      }
   });
}

@JvmSynthetic
fun `intervalFlow-QTBD994$default`(var0: Long, var2: Long, var4: Int, var5: Any): Flow {
   if ((var4 and 2) != 0) {
      var2 = var0;
   }

   return intervalFlow-QTBD994(var0, var2);
}
