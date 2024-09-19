package com.discord.misc.utilities.coroutines

import fh.h
import fh.s
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.internal.Ref.LongRef
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableSharedFlow
import lh.b
import nk.i0

public suspend fun <T> MutableSharedFlow<T>.collectWithLeadingDebounce(timeoutMillis: Long, collector: FlowCollector<T>) {
   label23: {
      if (var4 is <unrepresentable>) {
         val var6: <unrepresentable> = var4 as <unrepresentable>;
         if (((var4 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
            var6.label = (var4 as <unrepresentable>).label + Integer.MIN_VALUE;
            var9 = var6;
            break label23;
         }
      }

      var9 = new d(var4) {
         int label;
         Object result;

         {
            super(var1);
         }

         public final Object invokeSuspend(Object var1) {
            this.result = var1;
            this.label |= Integer.MIN_VALUE;
            return CollectWithLeadingDebounceKt.collectWithLeadingDebounce(null, 0L, null, this);
         }
      };
   }

   val var7: Any = ((<unrepresentable>)var9).result;
   val var11: Any = b.e();
   if (((<unrepresentable>)var9).label != 0) {
      if (((<unrepresentable>)var9).label != 1) {
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      s.b(var7);
   } else {
      s.b(var7);
      var3 = new FlowCollector(new LongRef(), var1, var3, var0) {
         final FlowCollector $collector;
         final MutableSharedFlow $this_collectWithLeadingDebounce;
         final LongRef $timeLastEmitted;
         final long $timeoutMillis;

         {
            this.$timeLastEmitted = var1;
            this.$timeoutMillis = var2;
            this.$collector = var4;
            this.$this_collectWithLeadingDebounce = var5;
         }

         public final Object emit(T var1, Continuation var2) {
            label39: {
               if (var2 is <unrepresentable>) {
                  val var10: <unrepresentable> = var2 as <unrepresentable>;
                  if (((var2 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                     var10.label = (var2 as <unrepresentable>).label + Integer.MIN_VALUE;
                     var12 = var10;
                     break label39;
                  }
               }

               var12 = new d(this, var2) {
                  Object L$0;
                  Object L$1;
                  int label;
                  Object result;
                  final <unrepresentable><T> this$0;

                  {
                     super(var2x);
                     this.this$0 = var1;
                  }

                  public final Object invokeSuspend(Object var1) {
                     this.result = var1;
                     this.label |= Integer.MIN_VALUE;
                     return this.this$0.emit(null, this);
                  }
               };
            }

            var var11: Any = ((<unrepresentable>)var12).result;
            val var15: Any = b.e();
            val var13: <unrepresentable>;
            if (((<unrepresentable>)var12).label != 0) {
               if (((<unrepresentable>)var12).label == 1) {
                  s.b(var11);
                  return Unit.a;
               }

               if (((<unrepresentable>)var12).label != 2) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var1 = ((<unrepresentable>)var12).L$1;
               var13 = ((<unrepresentable>)var12).L$0 as <unrepresentable>;
               s.b(var11);
            } else {
               s.b(var11);
               val var6: Long = System.currentTimeMillis();
               val var8: Long = var6 - this.$timeLastEmitted.j;
               val var4: Long = this.$timeoutMillis;
               if (var8 > this.$timeoutMillis) {
                  this.$timeLastEmitted.j = var6;
                  var11 = this.$collector;
                  ((<unrepresentable>)var12).label = 1;
                  if (var11.emit(var1, (Continuation)var12) === var15) {
                     return var15;
                  }

                  return Unit.a;
               }

               ((<unrepresentable>)var12).L$0 = this;
               ((<unrepresentable>)var12).L$1 = var1;
               ((<unrepresentable>)var12).label = 2;
               if (i0.a(var4 - var8, (Continuation)var12) === var15) {
                  return var15;
               }

               var13 = this;
            }

            var13.$this_collectWithLeadingDebounce.a(var1);
            return Unit.a;
         }
      };
      ((<unrepresentable>)var9).label = 1;
      if (var0.collect(var3, (Continuation)var9) === var11) {
         return var11;
      }
   }

   throw new h();
}
