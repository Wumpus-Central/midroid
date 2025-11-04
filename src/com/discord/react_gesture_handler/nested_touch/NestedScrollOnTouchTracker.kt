package com.discord.react_gesture_handler.nested_touch

import android.content.Context
import android.text.Spannable
import android.view.MotionEvent
import android.view.View
import android.view.ViewConfiguration
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.TextView
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import gu.i0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

@SourceDebugExtension(["SMAP\nNestedScrollOnTouchTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollOnTouchTracker.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n+ 3 TextViewTouchUtils.kt\ncom/discord/misc/utilities/touch/TextViewTouchUtilsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,215:1\n8#2:216\n12#3,27:217\n13996#4,14:244\n*S KotlinDebug\n*F\n+ 1 NestedScrollOnTouchTracker.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker\n*L\n52#1:216\n54#1:217,27\n60#1:244,14\n*E\n"])
public class NestedScrollOnTouchTracker internal constructor(context: Context,
   onClickListener: OnClickListener?,
   onLongClickListener: OnLongClickListener?,
   onDoubleClickListener: OnClickListener?,
   onTrackingStart: ((View) -> Unit)? = null,
   onTrackingFinish: ((View) -> Unit)? = null
) {
   private final val onClickListener: OnClickListener?
   private final val onLongClickListener: OnLongClickListener?
   private final val onDoubleClickListener: OnClickListener?
   private final val onTrackingStart: ((View) -> Unit)?
   private final val onTrackingFinish: ((View) -> Unit)?
   private final var longPressJob: Job?
   private final var doubleClickJob: Job?
   private final var runningDoubleClickJob: Boolean
   private final var activeClick: Boolean
   private final var consideringDoubleClick: Boolean
   private final var doubleTapOriginTracker: OriginTracker
   private final val scrollOriginTracker: OriginTracker
   private final var spanBeingTouched: NestedClickableSpan?

   @JvmStatic
   fun {
      val var2: Long = ViewConfiguration.getDoubleTapTimeout();
      DOUBLE_CLICK_TIME = var2;
      var var0: Long = 40L;
      if (var2 <= 40L) {
         var0 = 1L;
      }

      DOUBLE_CLICK_MIN_TIME = var0;
   }

   init {
      this.onClickListener = var2;
      this.onLongClickListener = var3;
      this.onDoubleClickListener = var4;
      this.onTrackingStart = var5;
      this.onTrackingFinish = var6;
      this.doubleTapOriginTracker = new OriginTracker(ViewConfiguration.get(var1).getScaledDoubleTapSlop());
      this.scrollOriginTracker = new OriginTracker(ViewConfiguration.get(var1).getScaledTouchSlop());
   }

   private fun cleanUp(view: View) {
      this.scrollOriginTracker.cleanUp();
      if (this.longPressJob != null) {
         kotlinx.coroutines.Job.a.a(this.longPressJob, null, 1, null);
      }

      var1.setPressed(false);
      this.spanBeingTouched = null;
      if (this.onTrackingFinish != null) {
         this.onTrackingFinish.invoke(var1);
      }

      this.cleanupDoubleClickJob();
   }

   private fun cleanupDoubleClickJob() {
      if (this.doubleClickJob != null) {
         kotlinx.coroutines.Job.a.a(this.doubleClickJob, null, 1, null);
      }

      this.runningDoubleClickJob = false;
      this.consideringDoubleClick = false;
      this.doubleTapOriginTracker.cleanUp();
   }

   internal fun handleTouch(view: View, event: MotionEvent, isSupplementalEvent: Boolean): Boolean {
      if (!var1.isAttachedToWindow()) {
         return false;
      } else {
         var var11: View;
         if (var1 !is TextView) {
            var11 = null;
         } else {
            var11 = var1;
         }

         val var17: TextView = var11 as TextView;
         if (var11 as TextView != null) {
            val var13: Array<NestedClickableSpan>;
            if (var2.getAction() == 0) {
               val var25: java.lang.CharSequence = var17.getText();
               val var26: Spannable;
               if (var25 is Spannable) {
                  var26 = var25 as Spannable;
               } else {
                  var26 = null;
               }

               if (var26 == null) {
                  var11 = new NestedClickableSpan[0];
               } else {
                  var var7: Int = (int)var2.getX() - var17.getTotalPaddingLeft() + var17.getScrollX();
                  val var23: Int = var17.getLayout().getLineForVertical((int)var2.getY() - var17.getTotalPaddingTop() + var17.getScrollY());
                  val var5: Float = var17.getLayout().getLineRight(var23);
                  val var4: Float = var17.getLayout().getLineLeft(var23);
                  val var6: Float = var7;
                  if (var7 > var5 || var7 >= 0 && var7 < var4) {
                     var11 = new NestedClickableSpan[0];
                  } else {
                     var7 = var17.getLayout().getOffsetForHorizontal(var23, var6);
                     var11 = var26.getSpans(var7, var7, NestedClickableSpan.class);
                  }
               }

               var13 = var11 as Array<NestedClickableSpan>;
            } else {
               var13 = null;
            }

            if (var13 != null && var13.length != 0) {
               var var12: Any;
               if (var13.length == 0) {
                  var12 = null;
               } else {
                  var var28: Any = var13[0];
                  val var24: Int = m.d0(var13);
                  if (var24 == 0) {
                     var12 = var28;
                  } else {
                     var var14: NestedClickableSpan.TouchPriority = ((NestedClickableSpan)var28).getTouchPriority();
                     var12 = var28;
                     if (1 <= var24) {
                        var var21: Int = 1;
                        var var31: NestedClickableSpan.TouchPriority = var14;

                        while (true) {
                           val var16: NestedClickableSpan = var13[var21];
                           val var15: NestedClickableSpan.TouchPriority = var13[var21].getTouchPriority();
                           var14 = var31;
                           if (var31.compareTo(var15) < 0) {
                              var28 = var16;
                              var14 = var15;
                           }

                           var12 = var28;
                           if (var21 == var24) {
                              break;
                           }

                           var21++;
                           var31 = var14;
                        }
                     }
                  }
               }

               this.spanBeingTouched = (NestedClickableSpan)var12;
               if (var12 != null) {
                  ((NestedClickableSpan)var12).enableHighlight(var17);
               }
            }
         }

         val var22: Int = var2.getAction();
         if (var22 != 0) {
            if (var22 != 1) {
               if (var22 != 2) {
                  if (var22 != 3) {
                     return false;
                  } else {
                     this.cleanUp(var1);
                     return true;
                  }
               } else if (!this.scrollOriginTracker.hasOriginMoved(var3, var2)) {
                  return false;
               } else {
                  this.cleanUp(var1);
                  this.activeClick = false;
                  return false;
               }
            } else if (this.onDoubleClickListener != null && this.runningDoubleClickJob) {
               this.activeClick = false;
               return true;
            } else {
               if (this.spanBeingTouched == null && this.activeClick && this.onClickListener != null) {
                  var1.setPressed(true);
               }

               if (this.activeClick) {
                  this.activeClick = false;
                  if (this.spanBeingTouched != null) {
                     if (this.spanBeingTouched != null) {
                        this.spanBeingTouched.onClick(var1);
                     }
                  } else if (this.onClickListener != null) {
                     this.onClickListener.onClick(var1);
                  }
               }

               this.cleanUp(var1);
               return this.spanBeingTouched != null || this.onClickListener != null;
            }
         } else {
            this.scrollOriginTracker.hasOriginMoved(var3, var2);
            if (var3) {
               return false;
            } else {
               if (this.onTrackingStart != null) {
                  this.onTrackingStart.invoke(var1);
               }

               this.activeClick = true;
               if (this.longPressJob != null) {
                  kotlinx.coroutines.Job.a.a(this.longPressJob, null, 1, null);
               }

               this.longPressJob = gu.g.d(
                  CoroutineViewUtilsKt.attachedScope(var1, true),
                  null,
                  null,
                  new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, null) {
                     final View $view;
                     int label;
                     final NestedScrollOnTouchTracker this$0;

                     {
                        super(2, var3);
                        this.this$0 = var1;
                        this.$view = var2x;
                     }

                     public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                        return new <anonymous constructor>(this.this$0, this.$view, var2);
                     }

                     public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        label55: {
                           val var7: Any = ot.b.f();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 if (this.label != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                 }

                                 kotlin.c.b(var1);
                                 break label55;
                              }

                              kotlin.c.b(var1);
                           } else {
                              kotlin.c.b(var1);
                              val var3: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getCLICK_MAX_DOWN_TIME();
                              this.label = 1;
                              if (i0.a(var3, this) === var7) {
                                 return var7;
                              }
                           }

                           if (NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(this.this$0) == null
                              && NestedScrollOnTouchTracker.access$getOnLongClickListener$p(this.this$0) != null) {
                              this.$view.setPressed(true);
                           }

                           val var5: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getLONG_PRESS_DOWN_TIME();
                           val var12: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getCLICK_MAX_DOWN_TIME();
                           this.label = 2;
                           if (i0.a(var5 - var12, this) === var7) {
                              return var7;
                           }
                        }

                        var1 = NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(this.this$0);
                        val var9: java.lang.Boolean;
                        if (var1 != null) {
                           var9 = kotlin.coroutines.jvm.internal.b.a(var1.onLongClick(this.$view));
                        } else {
                           var9 = null;
                        }

                        if (var9 == kotlin.coroutines.jvm.internal.b.a(true)) {
                           NestedScrollOnTouchTracker.access$setActiveClick$p(this.this$0, false);
                        } else {
                           val var10: OnLongClickListener = NestedScrollOnTouchTracker.access$getOnLongClickListener$p(this.this$0);
                           if (var10 == null || !var10.onLongClick(this.$view)) {
                              var1 = NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(this.this$0);
                              if (var1 != null) {
                                 var1.onClick(this.$view);
                              }
                           }

                           NestedScrollOnTouchTracker.access$setActiveClick$p(this.this$0, false);
                        }

                        NestedScrollOnTouchTracker.access$cleanUp(this.this$0, this.$view);
                        return Unit.a;
                     }
                  },
                  3,
                  null
               );
               if (this.onDoubleClickListener != null) {
                  if (this.consideringDoubleClick && !this.doubleTapOriginTracker.hasOriginMoved(false, var2)) {
                     this.activeClick = false;
                     this.onDoubleClickListener.onClick(var1);
                     this.cleanUp(var1);
                  } else if (!this.runningDoubleClickJob) {
                     this.doubleTapOriginTracker.cleanUp();
                     this.doubleTapOriginTracker.hasOriginMoved(false, var2);
                     this.runningDoubleClickJob = true;
                     this.doubleClickJob = gu.g.d(
                        CoroutineViewUtilsKt.attachedScope(var1, true),
                        null,
                        null,
                        new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, null) {
                           final View $view;
                           int label;
                           final NestedScrollOnTouchTracker this$0;

                           {
                              super(2, var3);
                              this.this$0 = var1;
                              this.$view = var2x;
                           }

                           public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                              return new <anonymous constructor>(this.this$0, this.$view, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              label38: {
                                 val var7: Any = ot.b.f();
                                 if (this.label != 0) {
                                    if (this.label != 1) {
                                       if (this.label != 2) {
                                          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                       }

                                       kotlin.c.b(var1);
                                       break label38;
                                    }

                                    kotlin.c.b(var1);
                                 } else {
                                    kotlin.c.b(var1);
                                    val var3: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getDOUBLE_CLICK_MIN_TIME();
                                    this.label = 1;
                                    if (i0.a(var3, this) === var7) {
                                       return var7;
                                    }
                                 }

                                 NestedScrollOnTouchTracker.access$setConsideringDoubleClick$p(this.this$0, true);
                                 val var9: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getDOUBLE_CLICK_TIME();
                                 val var5: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getDOUBLE_CLICK_MIN_TIME();
                                 this.label = 2;
                                 if (i0.a(var9 - var5, this) === var7) {
                                    return var7;
                                 }
                              }

                              NestedScrollOnTouchTracker.access$setConsideringDoubleClick$p(this.this$0, false);
                              if (!NestedScrollOnTouchTracker.access$getActiveClick$p(this.this$0)) {
                                 if (NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(this.this$0) != null) {
                                    var1 = NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(this.this$0);
                                    if (var1 != null) {
                                       var1.onClick(this.$view);
                                    }
                                 } else if (NestedScrollOnTouchTracker.access$getOnClickListener$p(this.this$0) != null) {
                                    this.$view.setPressed(true);
                                    NestedScrollOnTouchTracker.access$getOnClickListener$p(this.this$0).onClick(this.$view);
                                 }

                                 NestedScrollOnTouchTracker.access$cleanUp(this.this$0, this.$view);
                              } else {
                                 NestedScrollOnTouchTracker.access$cleanupDoubleClickJob(this.this$0);
                              }

                              return Unit.a;
                           }
                        },
                        3,
                        null
                     );
                  }
               }

               return this.spanBeingTouched != null || this.onLongClickListener != null || this.onDoubleClickListener != null;
            }
         }
      }
   }

   private companion object {
      public final val CLICK_MAX_DOWN_TIME: Long
      public final val LONG_PRESS_DOWN_TIME: Long
      public final val DOUBLE_CLICK_TIME: Long
      public final val DOUBLE_CLICK_MIN_TIME: Long
   }
}
