package com.discord.react_gesture_handler.nested_touch

import android.content.Context
import android.text.Spannable
import android.view.MotionEvent
import android.view.View
import android.view.ViewConfiguration
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.TextView
import cb.I
import cb.f
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

@SourceDebugExtension(["SMAP\nNestedScrollOnTouchTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollOnTouchTracker.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n+ 3 TextViewTouchUtils.kt\ncom/discord/misc/utilities/touch/TextViewTouchUtilsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n8#2:215\n12#3,27:216\n13996#4,14:243\n*S KotlinDebug\n*F\n+ 1 NestedScrollOnTouchTracker.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker\n*L\n52#1:215\n54#1:216,27\n60#1:243,14\n*E\n"])
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
         var var14: View;
         if (var1 !is TextView) {
            var14 = null;
         } else {
            var14 = var1;
         }

         val var20: TextView = var14 as TextView;
         if (var14 as TextView != null) {
            val var16: Array<NestedClickableSpan>;
            if (var2.getAction() == 0) {
               val var30: java.lang.CharSequence = var20.getText();
               val var31: Spannable;
               if (var30 is Spannable) {
                  var31 = var30 as Spannable;
               } else {
                  var31 = null;
               }

               if (var31 == null) {
                  var14 = new NestedClickableSpan[0];
               } else {
                  var var7: Int = (int)var2.getX() - var20.getTotalPaddingLeft() + var20.getScrollX();
                  val var28: Int = var20.getLayout().getLineForVertical((int)var2.getY() - var20.getTotalPaddingTop() + var20.getScrollY());
                  val var5: Float = var20.getLayout().getLineRight(var28);
                  val var6: Float = var20.getLayout().getLineLeft(var28);
                  val var4: Float = var7;
                  if (var7 > var5 || var7 >= 0 && var7 < var6) {
                     var14 = new NestedClickableSpan[0];
                  } else {
                     var7 = var20.getLayout().getOffsetForHorizontal(var28, var4);
                     var14 = var31.getSpans(var7, var7, NestedClickableSpan.class);
                  }
               }

               var16 = var14 as Array<NestedClickableSpan>;
            } else {
               var16 = null;
            }

            if (var16 != null && var16.length != 0) {
               var var15: Any;
               if (var16.length == 0) {
                  var15 = null;
               } else {
                  var var33: Any = var16[0];
                  val var29: Int = h.Q(var16);
                  if (var29 == 0) {
                     var15 = var33;
                  } else {
                     var var17: NestedClickableSpan.TouchPriority = ((NestedClickableSpan)var33).getTouchPriority();
                     var15 = var33;
                     if (1 <= var29) {
                        var var26: Int = 1;
                        var var36: NestedClickableSpan.TouchPriority = var17;

                        while (true) {
                           val var19: NestedClickableSpan = var16[var26];
                           val var18: NestedClickableSpan.TouchPriority = var16[var26].getTouchPriority();
                           var17 = var36;
                           if (var36.compareTo(var18) < 0) {
                              var33 = var19;
                              var17 = var18;
                           }

                           var15 = var33;
                           if (var26 == var29) {
                              break;
                           }

                           var26++;
                           var36 = var17;
                        }
                     }
                  }
               }

               this.spanBeingTouched = (NestedClickableSpan)var15;
               if (var15 != null) {
                  ((NestedClickableSpan)var15).enableHighlight(var20);
               }
            }
         }

         val var27: Int = var2.getAction();
         if (var27 != 0) {
            if (var27 != 1) {
               if (var27 != 2) {
                  if (var27 != 3) {
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

               this.longPressJob = f.d(
                  CoroutineViewUtilsKt.attachedScope(var1, true),
                  null,
                  null,
                  new Function2<CoroutineScope, Continuation, Object>(this, var1, null) {
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
                           val var7: Any = F9.b.e();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 if (this.label != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                 }

                                 kotlin.c.b(var1);
                                 break label46;
                              }

                              kotlin.c.b(var1);
                           } else {
                              kotlin.c.b(var1);
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

                        if (var9 == kotlin.coroutines.jvm.internal.b.a(true)) {
                           NestedScrollOnTouchTracker.access$setActiveClick$p(this.this$0, false);
                        } else {
                           val var10: OnLongClickListener = NestedScrollOnTouchTracker.access$getOnLongClickListener$p(this.this$0);
                           if (var10 != null && var10.onLongClick(this.$view)) {
                              NestedScrollOnTouchTracker.access$setActiveClick$p(this.this$0, false);
                           }
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
                     this.doubleClickJob = f.d(
                        CoroutineViewUtilsKt.attachedScope(var1, true), null, null, new Function2<CoroutineScope, Continuation, Object>(this, var1, null) {
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
                              label37: {
                                 val var7: Any = F9.b.e();
                                 if (this.label != 0) {
                                    if (this.label != 1) {
                                       if (this.label != 2) {
                                          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                       }

                                       kotlin.c.b(var1);
                                       break label37;
                                    }

                                    kotlin.c.b(var1);
                                 } else {
                                    kotlin.c.b(var1);
                                    val var3: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getDOUBLE_CLICK_MIN_TIME();
                                    this.label = 1;
                                    if (I.a(var3, this) === var7) {
                                       return var7;
                                    }
                                 }

                                 NestedScrollOnTouchTracker.access$setConsideringDoubleClick$p(this.this$0, true);
                                 val var9: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getDOUBLE_CLICK_TIME();
                                 val var5: Long = NestedScrollOnTouchTracker.access$getCompanion$p().getDOUBLE_CLICK_MIN_TIME();
                                 this.label = 2;
                                 if (I.a(var9 - var5, this) === var7) {
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
                        }, 3, null
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
