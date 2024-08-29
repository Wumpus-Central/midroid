package com.discord.misc.utilities.coroutines

import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.internal.Ref.LongRef
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableSharedFlow
import lj.h
import lj.s
import rj.b
import tm.g0

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
   val var11: Any = b.f();
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
                     var13 = var10;
                     break label39;
                  }
               }

               var13 = new d(this, var2) {
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

            var var11: Any = ((<unrepresentable>)var13).result;
            var var15: Any = b.f();
            if (((<unrepresentable>)var13).label != 0) {
               if (((<unrepresentable>)var13).label == 1) {
                  s.b(var11);
                  return Unit.a;
               }

               if (((<unrepresentable>)var13).label != 2) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var15 = ((<unrepresentable>)var13).L$1;
               var1 = ((<unrepresentable>)var13).L$0 as <unrepresentable>;
               s.b(var11);
            } else {
               s.b(var11);
               val var8: Long = System.currentTimeMillis();
               val var6: Long = var8 - this.$timeLastEmitted.j;
               val var4: Long = this.$timeoutMillis;
               if (var6 > this.$timeoutMillis) {
                  this.$timeLastEmitted.j = var8;
                  var11 = this.$collector;
                  ((<unrepresentable>)var13).label = 1;
                  if (var11.emit(var1, (Continuation)var13) === var15) {
                     return var15;
                  }

                  return Unit.a;
               }

               ((<unrepresentable>)var13).L$0 = this;
               ((<unrepresentable>)var13).L$1 = var1;
               ((<unrepresentable>)var13).label = 2;
               if (g0.a(var4 - var6, (Continuation)var13) === var15) {
                  return var15;
               }

               var15 = var1;
               var1 = this;
            }

            var1.$this_collectWithLeadingDebounce.a(var15);
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
