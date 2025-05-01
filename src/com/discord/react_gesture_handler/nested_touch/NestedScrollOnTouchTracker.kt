package com.discord.react_gesture_handler.nested_touch

import Q9.I
import Q9.f
import android.content.Context
import android.text.Spannable
import android.view.MotionEvent
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.TextView
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import h8.s
import i8.n
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import n8.b

public class NestedScrollOnTouchTracker internal constructor(context: Context,
   onClickListener: OnClickListener?,
   onLongClickListener: OnLongClickListener?,
   onTrackingStart: ((View) -> Unit)? = null,
   onTrackingFinish: ((View) -> Unit)? = null
) {
   private final val onClickListener: OnClickListener?
   private final val onLongClickListener: OnLongClickListener?
   private final val onTrackingStart: ((View) -> Unit)?
   private final val onTrackingFinish: ((View) -> Unit)?
   private final var job: Job?
   private final var doClickOnUp: Boolean
   private final val originTracker: OriginTracker
   private final var spanBeingTouched: NestedClickableSpan?

   init {
      q.h(var1, "context");
      super();
      this.onClickListener = var2;
      this.onLongClickListener = var3;
      this.onTrackingStart = var4;
      this.onTrackingFinish = var5;
      this.originTracker = new OriginTracker(var1);
   }

   private fun cleanUp(view: View) {
      this.originTracker.cleanUp();
      if (this.job != null) {
         kotlinx.coroutines.Job.a.a(this.job, null, 1, null);
      }

      var1.setPressed(false);
      this.spanBeingTouched = null;
      if (this.onTrackingFinish != null) {
         this.onTrackingFinish.invoke(var1);
      }
   }

   internal fun handleTouch(view: View, event: MotionEvent, isSupplementalEvent: Boolean): Boolean {
      q.h(var1, "view");
      q.h(var2, "event");
      if (!var1.isAttachedToWindow()) {
         return false;
      } else {
         var var14: View;
         if (var1 !is TextView) {
            var14 = null;
         } else {
            var14 = var1;
         }

         val var19: TextView = var14 as TextView;
         if (var14 as TextView != null) {
            val var16: Array<NestedClickableSpan>;
            if (var2.getAction() == 0) {
               val var31: java.lang.CharSequence = var19.getText();
               val var32: Spannable;
               if (var31 is Spannable) {
                  var32 = var31 as Spannable;
               } else {
                  var32 = null;
               }

               label157: {
                  if (var32 != null) {
                     var var7: Int = (int)var2.getX() - var19.getTotalPaddingLeft() + var19.getScrollX();
                     val var30: Int = var19.getLayout().getLineForVertical((int)var2.getY() - var19.getTotalPaddingTop() + var19.getScrollY());
                     val var6: Float = var19.getLayout().getLineRight(var30);
                     val var4: Float = var19.getLayout().getLineLeft(var30);
                     val var5: Float = var7;
                     if (!(var7 > var6) && (var7 < 0 || !(var7 < var4))) {
                        var7 = var19.getLayout().getOffsetForHorizontal(var30, var5);
                        var14 = var32.getSpans(var7, var7, NestedClickableSpan.class);
                        q.g(var14, "getSpans(...)");
                        break label157;
                     }
                  }

                  var14 = new NestedClickableSpan[0];
               }

               var16 = var14 as Array<NestedClickableSpan>;
            } else {
               var16 = null;
            }

            if (var16 != null && var16.length != 0) {
               val var15: Any;
               if (var16.length == 0) {
                  var15 = null;
               } else {
                  var var34: Any = var16[0];
                  val var28: Int = c.L(var16);
                  if (var28 == 0) {
                     var15 = var34;
                  } else {
                     var var17: NestedClickableSpan.TouchPriority = ((NestedClickableSpan)var34).getTouchPriority();
                     val var20: n = new IntRange(1, var28).o();

                     while (true) {
                        var15 = var34;
                        if (!var20.hasNext()) {
                           break;
                        }

                        val var18: NestedClickableSpan = var16[var20.a()];
                        val var35: NestedClickableSpan.TouchPriority = var18.getTouchPriority();
                        if (var17.compareTo(var35) < 0) {
                           var34 = var18;
                           var17 = var35;
                        }
                     }
                  }
               }

               q.e(var15);
               this.spanBeingTouched = (NestedClickableSpan)var15;
               if (var15 != null) {
                  ((NestedClickableSpan)var15).enableHighlight(var19);
               }
            }
         }

         val var29: Int = var2.getAction();
         if (var29 != 0) {
            if (var29 != 1) {
               if (var29 != 2) {
                  if (var29 != 3) {
                     return false;
                  } else {
                     this.cleanUp(var1);
                     return true;
                  }
               } else if (!this.originTracker.hasOriginMoved(var3, var2)) {
                  return false;
               } else {
                  this.cleanUp(var1);
                  this.doClickOnUp = false;
                  return false;
               }
            } else {
               if (this.spanBeingTouched == null && this.doClickOnUp && this.onClickListener != null) {
                  var1.setPressed(true);
               }

               if (this.doClickOnUp) {
                  this.doClickOnUp = false;
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
            this.originTracker.hasOriginMoved(var3, var2);
            if (var3) {
               return false;
            } else {
               if (this.onTrackingStart != null) {
                  this.onTrackingStart.invoke(var1);
               }

               this.doClickOnUp = true;
               if (this.job != null) {
                  kotlinx.coroutines.Job.a.a(this.job, null, 1, null);
               }

               this.job = f.d(
                  CoroutineViewUtilsKt.attachedScope(var1, true),
                  null,
                  null,
                  new Function2(this, var1, null) {
                     final View $view;
                     int label;
                     final NestedScrollOnTouchTracker this$0;

                     {
                        super(2, var3);
                        this.this$0 = var1;
                        this.$view = var2x;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(this.this$0, this.$view, var2);
                     }

                     public final Object invoke(CoroutineScope var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        label46: {
                           val var7: Any = b.e();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 if (this.label != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                 }

                                 s.b(var1);
                                 break label46;
                              }

                              s.b(var1);
                           } else {
                              s.b(var1);
                              val var3: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getCLICK_MAX_DOWN_TIME();
                              this.label = 1;
                              if (I.a(var3, this) === var7) {
                                 return var7;
                              }
                           }

                           if (NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(this.this$0) == null
                              && NestedScrollOnTouchTracker.access$getOnLongClickListener$p(this.this$0) != null) {
                              this.$view.setPressed(true);
                           }

                           val var11: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getLONG_PRESS_DOWN_TIME();
                           val var5: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getCLICK_MAX_DOWN_TIME();
                           this.label = 2;
                           if (I.a(var11 - var5, this) === var7) {
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

                        if (q.c(var9, kotlin.coroutines.jvm.internal.b.a(true))) {
                           NestedScrollOnTouchTracker.access$setDoClickOnUp$p(this.this$0, false);
                        } else {
                           val var10: OnLongClickListener = NestedScrollOnTouchTracker.access$getOnLongClickListener$p(this.this$0);
                           if (var10 != null && var10.onLongClick(this.$view)) {
                              NestedScrollOnTouchTracker.access$setDoClickOnUp$p(this.this$0, false);
                           }
                        }

                        NestedScrollOnTouchTracker.access$cleanUp(this.this$0, this.$view);
                        return Unit.a;
                     }
                  },
                  3,
                  null
               );
               return this.spanBeingTouched != null || this.onLongClickListener != null;
            }
         }
      }
   }

   private companion object {
      public final val CLICK_MAX_DOWN_TIME: Long
      public final val LONG_PRESS_DOWN_TIME: Long
   }
}
