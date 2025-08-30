package com.discord.recycler_view.scroll

import com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt
import db.K
import db.f
import gb.e
import gb.t
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.FunctionAdapter
import kotlin.jvm.internal.FunctionReferenceImpl
import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.g
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableSharedFlow

internal class DebouncedFlow<T>(timeoutMillis: Long, onEvent: (Any) -> Unit, collectWithLeadingDebounce: Boolean = true) {
   private final val eventCoroutineScope: CoroutineScope
   private final var eventDetectorJob: Job?
   private final var eventDetectorActive: Boolean
   private final val events: MutableSharedFlow<Any>

   init {
      val var5: CoroutineScope = g.a(K.c());
      this.eventCoroutineScope = var5;
      this.eventDetectorActive = true;
      this.events = t.b(0, 1, null, 4, null);
      this.eventDetectorJob = f.d(
         var5,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(var4, this, var1, var3, null) {
            final boolean $collectWithLeadingDebounce;
            final Function1<T, Unit> $onEvent;
            final long $timeoutMillis;
            int label;
            final DebouncedFlow<T> this$0;

            {
               super(2, var6);
               this.$collectWithLeadingDebounce = var1;
               this.this$0 = var2x;
               this.$timeoutMillis = var3;
               this.$onEvent = var5;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$collectWithLeadingDebounce, this.this$0, this.$timeoutMillis, this.$onEvent, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var5: Any = G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1 && this.label != 2) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  if (this.$collectWithLeadingDebounce) {
                     var1 = DebouncedFlow.access$getEvents$p(this.this$0);
                     val var3: Long = this.$timeoutMillis;
                     val var6: FlowCollector = new FlowCollector(this.$onEvent) {
                        final Function1<T, Unit> $tmp0;

                        {
                           this.$tmp0 = var1;
                        }

                        public final Object emit(T var1, Continuation var2x) {
                           var1 = <unrepresentable>.access$invokeSuspend$suspendConversion0(this.$tmp0, var1, var2x);
                           return if (var1 === G9.b.e()) var1 else Unit.a;
                        }

                        @Override
                        public final boolean equals(Object var1) {
                           val var4: Boolean = var1 is FlowCollector;
                           var var2x: Boolean = false;
                           if (var4) {
                              var2x = false;
                              if (var1 is FunctionAdapter) {
                                 var2x = this.getFunctionDelegate() == (var1 as FunctionAdapter).getFunctionDelegate();
                              }
                           }

                           return var2x;
                        }

                        public final Function getFunctionDelegate() {
                           return new FunctionReferenceImpl(
                              2,
                              this.$tmp0,
                              Kotlin::class.java,
                              "suspendConversion0",
                              "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
                              0
                           );
                        }

                        @Override
                        public final int hashCode() {
                           return this.getFunctionDelegate().hashCode();
                        }
                     };
                     this.label = 1;
                     if (CollectWithLeadingDebounceKt.collectWithLeadingDebounce(var1, var3, var6, this) === var5) {
                        return var5;
                     }
                  } else {
                     val var9: Flow = e.f(DebouncedFlow.access$getEvents$p(this.this$0), this.$timeoutMillis);
                     val var8: FlowCollector = new FlowCollector(this.$onEvent) {
                        final Function1<T, Unit> $tmp0;

                        {
                           this.$tmp0 = var1;
                        }

                        public final Object emit(T var1, Continuation var2) {
                           var1 = <unrepresentable>.access$invokeSuspend$suspendConversion1(this.$tmp0, var1, var2);
                           return if (var1 === G9.b.e()) var1 else Unit.a;
                        }

                        @Override
                        public final boolean equals(Object var1) {
                           val var4: Boolean = var1 is FlowCollector;
                           var var2: Boolean = false;
                           if (var4) {
                              var2 = false;
                              if (var1 is FunctionAdapter) {
                                 var2 = this.getFunctionDelegate() == (var1 as FunctionAdapter).getFunctionDelegate();
                              }
                           }

                           return var2;
                        }

                        public final Function getFunctionDelegate() {
                           return new FunctionReferenceImpl(
                              2,
                              this.$tmp0,
                              Kotlin::class.java,
                              "suspendConversion1",
                              "invokeSuspend$suspendConversion1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
                              0
                           );
                        }

                        @Override
                        public final int hashCode() {
                           return this.getFunctionDelegate().hashCode();
                        }
                     };
                     this.label = 2;
                     if (var9.collect(var8, this) === var5) {
                        return var5;
                     }
                  }
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }

   public fun cancel() {
      if (this.eventDetectorJob != null) {
         kotlinx.coroutines.Job.a.a(this.eventDetectorJob, null, 1, null);
      }

      this.eventDetectorActive = false;
   }

   public fun tryEmit(event: Any) {
      this.events.b(var1);
   }
}
