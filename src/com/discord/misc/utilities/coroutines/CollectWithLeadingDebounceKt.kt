package com.discord.misc.utilities.coroutines

import kh.h
import kh.s
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.internal.Ref.LongRef
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableSharedFlow
import qh.b
import sk.i0

public suspend fun <T> MutableSharedFlow<T>.collectWithLeadingDebounce(timeoutMillis: Long, collector: FlowCollector<T>) {
   label23: {
      if (var4 is <unrepresentable>) {
         val var6: <unrepresentable> = var4 as <unrepresentable>;
         if ((var4.label and Integer.MIN_VALUE) != 0) {
            var6.label = var4.label + Integer.MIN_VALUE;
            var4 = var6;
            break label23;
         }
      }

      var4 = new d(var4) {
         int label;
         Object result;

         {
            super(var1);
         }

         @Override
         public final Object invokeSuspend(Object var1) {
            this.result = var1;
            this.label |= Integer.MIN_VALUE;
            return CollectWithLeadingDebounceKt.collectWithLeadingDebounce(null, 0L, null, this);
         }
      };
   }

   val var7: Any = var4.result;
   val var11: Any = b.e();
   if (var4.label != 0) {
      if (var4.label != 1) {
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
                  if ((var2.label and Integer.MIN_VALUE) != 0) {
                     var10.label = var2.label + Integer.MIN_VALUE;
                     var2 = var10;
                     break label39;
                  }
               }

               var2 = new d(this, var2) {
                  Object L$0;
                  Object L$1;
                  int label;
                  Object result;
                  final <unrepresentable><T> this$0;

                  {
                     super(var2x);
                     this.this$0 = var1;
                  }

                  @Override
                  public final Object invokeSuspend(Object var1) {
                     this.result = var1;
                     this.label |= Integer.MIN_VALUE;
                     return this.this$0.emit(null, this);
                  }
               };
            }

            var var15: Any = var2.result;
            val var11: Any = b.e();
            val var13: <unrepresentable>;
            if (var2.label != 0) {
               if (var2.label == 1) {
                  s.b(var15);
                  return Unit.a;
               }

               if (var2.label != 2) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var1 = var2.L$1;
               var13 = var2.L$0 as <unrepresentable>;
               s.b(var15);
            } else {
               s.b(var15);
               val var8: Long = System.currentTimeMillis();
               val var6: Long = var8 - this.$timeLastEmitted.j;
               val var4: Long = this.$timeoutMillis;
               if (var6 > this.$timeoutMillis) {
                  this.$timeLastEmitted.j = var8;
                  var15 = this.$collector;
                  var2.label = 1;
                  if (var15.emit(var1, var2) === var11) {
                     return var11;
                  }

                  return Unit.a;
               }

               var2.L$0 = this;
               var2.L$1 = var1;
               var2.label = 2;
               if (i0.a(var4 - var6, var2) === var11) {
                  return var11;
               }

               var13 = this;
            }

            var13.$this_collectWithLeadingDebounce.f(var1);
            return Unit.a;
         }
      };
      var4.label = 1;
      if (var0.collect(var3, var4) === var11) {
         return var11;
      }
   }

   throw new h();
}
