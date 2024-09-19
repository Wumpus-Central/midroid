package com.discord.mobile_voice_overlay

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnAttachStateChangeListener
import android.view.View.OnLayoutChangeListener
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import androidx.core.os.e
import androidx.core.view.r0
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap
import com.discord.mobile_voice_overlay.views.OverlayDialog
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog
import com.discord.react.headless_tasks.api.HeadlessTasks
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.react.bridge.CatalystInstance
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableNativeArray
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import nh.w

internal class MobileVoiceOverlay(context: ReactApplicationContext) {
   private final val context: ReactApplicationContext
   private final val menuDialogProvider: OverlayViewProvider<OverlayMenuBubbleDialog>
   private final val selectorDialogProvider: OverlayViewProvider<OverlayVoiceSelectorBubbleDialog>
   private final val trashWrapProvider: OverlayViewProvider<OverlayTrashWrap>
   private final val voiceBubbleProvider: OverlayViewProvider<OverlayVoiceBubble>

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.voiceBubbleProvider = new OverlayViewProvider<>(new Function1(this) {
         final MobileVoiceOverlay this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         private static final void invoke$lambda$2(OverlayVoiceBubble var0, MobileVoiceOverlay var1, View var2) {
            q.h(var0, "$voiceBubble");
            q.h(var1, "this$0");
            val var9: SimpleDraweeView = var0.getImageView$mobile_voice_overlay_release();
            q.f(var9, "null cannot be cast to non-null type android.view.View");
            val var10: LayoutParams = var9.getLayoutParams();
            val var11: MarginLayoutParams;
            if (var10 is MarginLayoutParams) {
               var11 = var10 as MarginLayoutParams;
            } else {
               var11 = null;
            }

            val var3: Int;
            if (var11 != null) {
               var3 = var11.leftMargin;
            } else {
               var3 = 0;
            }

            val var12: LayoutParams = var9.getLayoutParams();
            val var13: MarginLayoutParams;
            if (var12 is MarginLayoutParams) {
               var13 = var12 as MarginLayoutParams;
            } else {
               var13 = null;
            }

            val var4: Int;
            if (var13 != null) {
               var4 = var13.topMargin;
            } else {
               var4 = 0;
            }

            val var14: LayoutParams = var9.getLayoutParams();
            val var15: MarginLayoutParams;
            if (var14 is MarginLayoutParams) {
               var15 = var14 as MarginLayoutParams;
            } else {
               var15 = null;
            }

            val var5: Int;
            if (var15 != null) {
               var5 = var15.rightMargin;
            } else {
               var5 = 0;
            }

            val var18: LayoutParams = var9.getLayoutParams();
            var var16: MarginLayoutParams = null;
            if (var18 is MarginLayoutParams) {
               var16 = var18 as MarginLayoutParams;
            }

            val var6: Int;
            if (var16 != null) {
               var6 = var16.bottomMargin;
            } else {
               var6 = 0;
            }

            MobileVoiceOverlay.access$getMenuDialogProvider$p(var1).withView(new Function1(var0, new Rect(var3, var4, var5, var6)) {
               final Rect $marginRect;
               final OverlayVoiceBubble $voiceBubble;

               {
                  super(1);
                  this.$voiceBubble = var1;
                  this.$marginRect = var2x;
               }

               public final void invoke(OverlayMenuBubbleDialog var1) {
                  q.h(var1, "menuDialog");
                  val var4x: LayoutParams = var1.getLinkedAnchorView().getLayoutParams();
                  val var2x: OverlayVoiceBubble = this.$voiceBubble;
                  val var3x: Rect = this.$marginRect;
                  var4x.width = this.$voiceBubble.getWidth() - var3x.left - var3x.right;
                  var4x.height = var2x.getHeight();
                  var1.getLinkedAnchorView().requestLayout();
                  var1.getLinkedAnchorView().setTag("Active Voice Bubble");
                  var1.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this.$voiceBubble) {
                     final OverlayVoiceBubble $voiceBubble;

                     {
                        this.$voiceBubble = var1;
                     }

                     public void onViewAttachedToWindow(View var1) {
                        q.h(var1, "v");
                        val var2x: OverlayVoiceBubble = this.$voiceBubble;
                        if (r0.U(var1) && !var1.isLayoutRequested()) {
                           var1 = var1.findViewWithTag("Active Voice Bubble");
                           q.g(var1, "findViewWithTag(...)");
                           var2x.anchorOn(var1);
                        } else {
                           var1.addOnLayoutChangeListener(new OnLayoutChangeListener(var1, var2x) {
                              final View $v$inlined;
                              final OverlayVoiceBubble $voiceBubble$inlined;

                              {
                                 this.$v$inlined = var1;
                                 this.$voiceBubble$inlined = var2x;
                              }

                              public void onLayoutChange(View var1, int var2x, int var3x, int var4x, int var5x, int var6x, int var7, int var8, int var9x) {
                                 var1.removeOnLayoutChangeListener(this);
                                 var1 = this.$v$inlined.findViewWithTag("Active Voice Bubble");
                                 q.g(var1, "findViewWithTag(...)");
                                 this.$voiceBubble$inlined.anchorOn(var1);
                              }
                           });
                        }
                     }

                     public void onViewDetachedFromWindow(View var1) {
                        q.h(var1, "v");
                        if (this.$voiceBubble.isAttachedToWindow()) {
                           this.$voiceBubble.setBubbleTouchable(true);
                           this.$voiceBubble.anchorOff(true);
                        }
                     }
                  });
               }
            });
            var0.setBubbleTouchable(false);
         }

         public final OverlayVoiceBubble invoke(OverlayViewProvider<OverlayVoiceBubble> var1) {
            q.h(var1, "it");
            val var2: Int = MobileVoiceOverlay.access$getContext$p(this.this$0).getResources().getDimensionPixelOffset(R.dimen.overlay_safe_margin);
            val var4: OverlayVoiceBubble = new OverlayVoiceBubble(MobileVoiceOverlay.access$getContext$p(this.this$0));
            var4.getInsetMargins().set(-var2, var2, -var2, var2);
            var4.setOnClickListener(new a(var4, this.this$0));
            var4.setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(new Function1(this.this$0, var4) {
               final OverlayVoiceBubble $voiceBubble;
               final MobileVoiceOverlay this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$voiceBubble = var2x;
               }

               public final void invoke(MotionEvent var1) {
                  q.h(var1, "event");
                  MobileVoiceOverlay.access$getTrashWrapProvider$p(this.this$0).withView(new Function1(this.$voiceBubble, var1, this.this$0) {
                     final MotionEvent $event;
                     final OverlayVoiceBubble $voiceBubble;
                     final MobileVoiceOverlay this$0;

                     {
                        super(1);
                        this.$voiceBubble = var1;
                        this.$event = var2x;
                        this.this$0 = var3;
                     }

                     public final void invoke(OverlayTrashWrap var1) {
                        q.h(var1, "trashWrap");
                        if (var1.processMotionEvent(this.$voiceBubble, this.$event)) {
                           MobileVoiceOverlay.access$onTrashVoiceBubble(this.this$0);
                        }
                     }
                  });
               }
            });
            var4.setOnMovingStateChanged(new Function1(this.this$0, var4) {
               final OverlayVoiceBubble $voiceBubble;
               final MobileVoiceOverlay this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$voiceBubble = var2x;
               }

               public final void invoke(boolean var1) {
                  MobileVoiceOverlay.access$getTrashWrapProvider$p(this.this$0).withView(new Function1(var1, this.this$0, this.$voiceBubble) {
                     final boolean $isMoving;
                     final OverlayVoiceBubble $voiceBubble;
                     final MobileVoiceOverlay this$0;

                     {
                        super(1);
                        this.$isMoving = var1;
                        this.this$0 = var2x;
                        this.$voiceBubble = var3;
                     }

                     public final void invoke(OverlayTrashWrap var1) {
                        q.h(var1, "trashWrap");
                        if (this.$isMoving) {
                           var1.show();
                        } else {
                           var1.hide();
                           MobileVoiceOverlay.access$floatBubbleToHorizontalEdge(this.this$0, this.$voiceBubble);
                        }
                     }
                  });
               }
            });
            return var4;
         }
      });
      this.trashWrapProvider = new OverlayViewProvider<>(new Function1(this) {
         final MobileVoiceOverlay this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final OverlayTrashWrap invoke(OverlayViewProvider<OverlayTrashWrap> var1) {
            q.h(var1, "it");
            return new OverlayTrashWrap(MobileVoiceOverlay.access$getContext$p(this.this$0));
         }
      });
      this.menuDialogProvider = new OverlayViewProvider<>(new Function1(this) {
         final MobileVoiceOverlay this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final OverlayMenuBubbleDialog invoke(OverlayViewProvider<OverlayMenuBubbleDialog> var1) {
            q.h(var1, "it");
            val var2: OverlayMenuBubbleDialog = new OverlayMenuBubbleDialog(MobileVoiceOverlay.access$getContext$p(this.this$0));
            val var3: MobileVoiceOverlay = this.this$0;
            var2.getInsetMargins().top = var2.getResources().getDimensionPixelOffset(R.dimen.vertical_safe_margin);
            var2.setOnDialogClosed(new Function1(var3) {
               final MobileVoiceOverlay this$0;

               {
                  super(1);
                  this.this$0 = var1;
               }

               public final void invoke(OverlayDialog var1) {
                  q.h(var1, "it");
                  MobileVoiceOverlay.access$closeMenuDialog(this.this$0);
               }
            });
            var2.setOnShowSelectorDialog(new Function0(var3) {
               final MobileVoiceOverlay this$0;

               {
                  super(0);
                  this.this$0 = var1;
               }

               public final void invoke() {
                  MobileVoiceOverlay.access$getSelectorDialogProvider$p(this.this$0).showViewOnOverlay();
               }
            });
            return var2;
         }
      });
      this.selectorDialogProvider = new OverlayViewProvider<>(
         new Function1(this) {
            final MobileVoiceOverlay this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final OverlayVoiceSelectorBubbleDialog invoke(OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> var1) {
               q.h(var1, "provider");
               val var3: OverlayVoiceSelectorBubbleDialog = new OverlayVoiceSelectorBubbleDialog(MobileVoiceOverlay.access$getContext$p(this.this$0));
               val var2: MobileVoiceOverlay = this.this$0;
               var3.setOnDialogClosed(new Function1(var1) {
                  final OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> $provider;

                  {
                     super(1);
                     this.$provider = var1;
                  }

                  public final void invoke(OverlayDialog var1) {
                     q.h(var1, "it");
                     this.$provider.removeViewFromOverlay();
                  }
               });
               var3.setOnTextChanged(new Function1(var2) {
                  final MobileVoiceOverlay this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(java.lang.String var1) {
                     q.h(var1, "text");
                     MobileVoiceOverlay.access$invokeJs(this.this$0, "onChannelQueryUpdate", var1);
                  }
               });
               var3.setOnChannelSelected(
                  new Function1(var3) {
                     final OverlayVoiceSelectorBubbleDialog $this_apply;

                     {
                        super(1);
                        this.$this_apply = var1;
                     }

                     public final void invoke_R7gqayM/* $VF was: invoke-R7gqayM*/(long var1) {
                        val var4: MobileVoiceOverlay.Companion = MobileVoiceOverlay.Companion;
                        val var3x: Context = this.$this_apply.getContext();
                        q.g(var3x, "getContext(...)");
                        var4.startHeadlessTask(
                           var3x, "SelectChannel", e.a(w.a("channelId", java.lang.String.valueOf(var1)), w.a("connectToVoice", java.lang.Boolean.TRUE))
                        );
                     }
                  }
               );
               return var3;
            }
         }
      );
   }

   private fun closeMenuDialog() {
      this.menuDialogProvider.removeViewFromOverlay();
   }

   private fun floatBubbleToHorizontalEdge(bubble: OverlayBubbleWrap) {
      if (var1.getCenterX() > WindowUtils.INSTANCE.getScreenSize(this.context).centerX()) {
         OverlayBubbleWrap.animateToCoordinate$default(var1, Integer.MAX_VALUE, (int)var1.getY(), null, 4, null);
      } else {
         OverlayBubbleWrap.animateToCoordinate$default(var1, Integer.MIN_VALUE, (int)var1.getY(), null, 4, null);
      }
   }

   private fun invokeJs(methodName: String, query: String? = null) {
      val var3: WritableNativeArray = new WritableNativeArray();
      if (var2 != null) {
         var3.pushString(var2);
      }

      var var4: CatalystInstance = this.context.getCatalystInstance();
      if (var4 != null) {
         if (!(var4.isDestroyed() xor true)) {
            var4 = null;
         }

         if (var4 != null) {
            var4.callFunction("MobileVoiceOverlayManager", var1, var3);
         }
      }
   }

   private fun isOverlayShowing(): Boolean {
      val var1: Boolean;
      if (this.trashWrapProvider.isInOverlay() && this.voiceBubbleProvider.isInOverlay()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private fun onTrashVoiceBubble() {
      this.voiceBubbleProvider.withView(new Function1(this) {
         final MobileVoiceOverlay this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(OverlayVoiceBubble var1) {
            q.h(var1, "voiceBubble");
            var1.moveToAnchorPoint();
            val var2: Animator = AnimatorInflater.loadAnimator(var1.getContext(), R.animator.fade_out);
            val var3: MobileVoiceOverlay = this.this$0;
            var2.setTarget(var1);
            q.e(var2);
            var2.addListener(new AnimatorListener(var3) {
               final MobileVoiceOverlay this$0;

               {
                  this.this$0 = var1;
               }

               public void onAnimationCancel(Animator var1) {
               }

               public void onAnimationEnd(Animator var1) {
                  if (ThreadUtilsKt.isOnMainThread()) {
                     MobileVoiceOverlay.invokeJs$default(this.this$0, "onLayoutTrashed", null, 2, null);
                  } else {
                     ThreadUtilsKt.getUiHandler().post(new Runnable(this.this$0) {
                        final MobileVoiceOverlay this$0;

                        {
                           this.this$0 = var1;
                        }

                        @Override
                        public final void run() {
                           MobileVoiceOverlay.invokeJs$default(this.this$0, "onLayoutTrashed", null, 2, null);
                        }
                     });
                  }
               }

               public void onAnimationRepeat(Animator var1) {
               }

               public void onAnimationStart(Animator var1) {
               }
            });
            var2.start();
            OverlayBubbleWrap.animateToCoordinate$default(var1, (int)var1.getX(), (int)var1.getY() + var1.getHeight() / 2, null, 4, null);
         }
      });
   }

   internal fun hideOverlay() {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getSelectorDialogProvider$p(this).removeViewFromOverlay();
         access$getMenuDialogProvider$p(this).removeViewFromOverlay();
         access$getVoiceBubbleProvider$p(this).removeViewFromOverlay();
         access$getTrashWrapProvider$p(this).removeViewFromOverlay();
      } else {
         val var2: Thread = Thread.currentThread();
         val var1: StringBuilder = new StringBuilder();
         var1.append("Expected to be on android main thread. Current: ");
         var1.append(var2);
         throw new IllegalStateException(var1.toString().toString());
      }
   }

   internal fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getVoiceBubbleProvider$p(this).setData(var1);
         access$getMenuDialogProvider$p(this).setData(var1);
         access$getSelectorDialogProvider$p(this).setData(var1);
         access$getTrashWrapProvider$p(this).setData(var1);
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   internal fun showOverlay(assets: MobileVoiceOverlayAssets) {
      q.h(var1, "assets");
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getSelectorDialogProvider$p(this).setAssets(var1);
         access$getMenuDialogProvider$p(this).setAssets(var1);
         access$getVoiceBubbleProvider$p(this).setAssets(var1);
         access$getTrashWrapProvider$p(this).setAssets(var1);
         if (!access$isOverlayShowing(this)) {
            access$getVoiceBubbleProvider$p(this).withView(new Function1(this) {
               final MobileVoiceOverlay this$0;

               {
                  super(1);
                  this.this$0 = var1;
               }

               public final void invoke(OverlayVoiceBubble var1) {
                  q.h(var1, "it");
                  MobileVoiceOverlay.access$floatBubbleToHorizontalEdge(this.this$0, var1);
               }
            });
         }
      } else {
         val var2: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected to be on android main thread. Current: ");
         var3.append(var2);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   public companion object {
      private const val ANCHOR_TAG: String
      private const val JS_INTERFACE_NAME: String

      public fun startHeadlessTask(context: Context, taskName: String, taskParams: Bundle = Bundle.EMPTY) {
         q.h(var1, "context");
         q.h(var2, "taskName");
         q.h(var3, "taskParams");
         HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, var2, 0L, false, var3, false, 12, null);
      }
   }
}
