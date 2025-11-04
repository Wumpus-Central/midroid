package com.discord.misc.utilities.coroutines

import gu.i0
import kotlin.coroutines.Continuation
import kotlin.jvm.internal.Ref.LongRef
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableSharedFlow
import org.jetbrains.annotations.NotNull
import ot.b

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

      var9 = new kotlin.coroutines.jvm.internal.d(var4) {
         int label;
         Object result;

         {
            super(var1);
         }

         public final Object invokeSuspend(@NotNull Object var1) {
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

      kotlin.c.b(var7);
   } else {
      kotlin.c.b(var7);
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

         public final Object emit(T var1, Continuation<? super Unit> var2) {
            label41: {
               if (var2 is <unrepresentable>) {
                  val var10: <unrepresentable> = var2 as <unrepresentable>;
                  if (((var2 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                     var10.label = (var2 as <unrepresentable>).label + Integer.MIN_VALUE;
                     var12 = var10;
                     break label41;
                  }
               }

               var12 = new kotlin.coroutines.jvm.internal.d(this, var2) {
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

            var var15: Any = ((<unrepresentable>)var12).result;
            val var11: Any = b.f();
            val var13: <unrepresentable>;
            if (((<unrepresentable>)var12).label != 0) {
               if (((<unrepresentable>)var12).label == 1) {
                  kotlin.c.b(var15);
                  return Unit.a;
               }

               if (((<unrepresentable>)var12).label != 2) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var1 = ((<unrepresentable>)var12).L$1;
               var13 = ((<unrepresentable>)var12).L$0 as <unrepresentable>;
               kotlin.c.b(var15);
            } else {
               kotlin.c.b(var15);
               val var4: Long = System.currentTimeMillis();
               val var6: Long = var4 - this.$timeLastEmitted.element;
               val var8: Long = this.$timeoutMillis;
               if (var6 > this.$timeoutMillis) {
                  this.$timeLastEmitted.element = var4;
                  var15 = this.$collector;
                  ((<unrepresentable>)var12).label = 1;
                  if (var15.emit(var1, (Continuation)var12) != var11) {
                     return Unit.a;
                  }

                  return var11;
               }

               ((<unrepresentable>)var12).L$0 = this;
               ((<unrepresentable>)var12).L$1 = var1;
               ((<unrepresentable>)var12).label = 2;
               if (i0.a(var8 - var6, (Continuation)var12) === var11) {
                  return var11;
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

   throw new ht.h();
}
