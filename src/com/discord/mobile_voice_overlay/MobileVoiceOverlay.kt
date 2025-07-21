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
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap
import com.discord.mobile_voice_overlay.views.OverlayDialog
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog
import com.discord.primitives.ChannelId
import com.discord.react.headless_tasks.api.HeadlessTasks
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.react.bridge.CatalystInstance
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableNativeArray
import kotlin.jvm.functions.Function1
import z9.s

internal class MobileVoiceOverlay(context: ReactApplicationContext) {
   private final val context: ReactApplicationContext
   private final val voiceBubbleProvider: OverlayViewProvider<OverlayVoiceBubble>
   private final val trashWrapProvider: OverlayViewProvider<OverlayTrashWrap>
   private final val menuDialogProvider: OverlayViewProvider<OverlayMenuBubbleDialog>
   private final val selectorDialogProvider: OverlayViewProvider<OverlayVoiceSelectorBubbleDialog>

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super();
      this.context = var1;
      this.voiceBubbleProvider = new OverlayViewProvider<>(new c(this));
      this.trashWrapProvider = new OverlayViewProvider<>(new d(this));
      this.menuDialogProvider = new OverlayViewProvider<>(new e(this));
      this.selectorDialogProvider = new OverlayViewProvider<>(new f(this));
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
         if (var4.isDestroyed()) {
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

   @JvmStatic
   fun `menuDialogProvider$lambda$14`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayMenuBubbleDialog {
      kotlin.jvm.internal.r.h(var1, "it");
      val var2: OverlayMenuBubbleDialog = new OverlayMenuBubbleDialog(var0.context);
      var2.getInsetMargins().top = var2.getResources().getDimensionPixelOffset(R.dimen.vertical_safe_margin);
      var2.setOnDialogClosed(new i(var0));
      var2.setOnShowSelectorDialog(new j(var0));
      return var2;
   }

   @JvmStatic
   fun `menuDialogProvider$lambda$14$lambda$13$lambda$11`(var0: MobileVoiceOverlay, var1: OverlayDialog): Unit {
      kotlin.jvm.internal.r.h(var1, "it");
      var0.closeMenuDialog();
      return Unit.a;
   }

   @JvmStatic
   fun `menuDialogProvider$lambda$14$lambda$13$lambda$12`(var0: MobileVoiceOverlay): Unit {
      var0.selectorDialogProvider.showViewOnOverlay();
      return Unit.a;
   }

   private fun onTrashVoiceBubble() {
      this.voiceBubbleProvider.withView(new b(this));
   }

   @JvmStatic
   fun `onTrashVoiceBubble$lambda$26`(var0: MobileVoiceOverlay, var1: OverlayVoiceBubble): Unit {
      kotlin.jvm.internal.r.h(var1, "voiceBubble");
      var1.moveToAnchorPoint();
      val var2: Animator = AnimatorInflater.loadAnimator(var1.getContext(), R.animator.fade_out);
      var2.setTarget(var1);
      kotlin.jvm.internal.r.e(var2);
      var2.addListener(new AnimatorListener(var0) {
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
      return Unit.a;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayVoiceSelectorBubbleDialog {
      kotlin.jvm.internal.r.h(var1, "provider");
      val var2: OverlayVoiceSelectorBubbleDialog = new OverlayVoiceSelectorBubbleDialog(var0.context);
      var2.setOnDialogClosed(new o(var1));
      var2.setOnTextChanged(new p(var0));
      var2.setOnChannelSelected(new q(var2));
      return var2;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19$lambda$18$lambda$15`(var0: OverlayViewProvider, var1: OverlayDialog): Unit {
      kotlin.jvm.internal.r.h(var1, "it");
      var0.removeViewFromOverlay();
      return Unit.a;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19$lambda$18$lambda$16`(var0: MobileVoiceOverlay, var1: java.lang.String): Unit {
      kotlin.jvm.internal.r.h(var1, "text");
      var0.invokeJs("onChannelQueryUpdate", var1);
      return Unit.a;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19$lambda$18$lambda$17`(var0: OverlayVoiceSelectorBubbleDialog, var1: ChannelId): Unit {
      val var2: MobileVoiceOverlay.Companion = Companion;
      val var3: Context = var0.getContext();
      kotlin.jvm.internal.r.g(var3, "getContext(...)");
      var2.startHeadlessTask(
         var3, "SelectChannel", D.d.a(s.a("channelId", java.lang.String.valueOf(var1.unbox-impl())), s.a("connectToVoice", java.lang.Boolean.TRUE))
      );
      return Unit.a;
   }

   @JvmStatic
   fun `trashWrapProvider$lambda$10`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayTrashWrap {
      kotlin.jvm.internal.r.h(var1, "it");
      return new OverlayTrashWrap(var0.context);
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayVoiceBubble {
      kotlin.jvm.internal.r.h(var1, "it");
      val var3: Int = var0.context.getResources().getDimensionPixelOffset(R.dimen.overlay_safe_margin);
      val var5: OverlayVoiceBubble = new OverlayVoiceBubble(var0.context);
      var5.getInsetMargins().set(-var3, var3, -var3, var3);
      var5.setOnClickListener(new l(var5, var0));
      var5.setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(new m(var0, var5));
      var5.setOnMovingStateChanged(new n(var0, var5));
      return var5;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$4`(var0: OverlayVoiceBubble, var1: MobileVoiceOverlay, var2: View) {
      val var9: SimpleDraweeView = var0.getImageView$mobile_voice_overlay_release();
      kotlin.jvm.internal.r.f(var9, "null cannot be cast to non-null type android.view.View");
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

      var1.menuDialogProvider.withView(new h(var0, new Rect(var3, var4, var5, var6)));
      var0.setBubbleTouchable(false);
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$4$lambda$3`(var0: OverlayVoiceBubble, var1: Rect, var2: OverlayMenuBubbleDialog): Unit {
      kotlin.jvm.internal.r.h(var2, "menuDialog");
      val var3: LayoutParams = var2.getLinkedAnchorView().getLayoutParams();
      var3.width = var0.getWidth() - var1.left - var1.right;
      var3.height = var0.getHeight();
      var2.getLinkedAnchorView().requestLayout();
      var2.getLinkedAnchorView().setTag("Active Voice Bubble");
      var2.addOnAttachStateChangeListener(new OnAttachStateChangeListener(var0) {
         final OverlayVoiceBubble $voiceBubble;

         {
            this.$voiceBubble = var1;
         }

         public void onViewAttachedToWindow(View var1) {
            kotlin.jvm.internal.r.h(var1, "v");
            val var2: OverlayVoiceBubble = this.$voiceBubble;
            if (var1.isLaidOut() && !var1.isLayoutRequested()) {
               var1 = var1.findViewWithTag("Active Voice Bubble");
               kotlin.jvm.internal.r.g(var1, "findViewWithTag(...)");
               var2.anchorOn(var1);
            } else {
               var1.addOnLayoutChangeListener(new OnLayoutChangeListener(var1, var2) {
                  final View $v$inlined;
                  final OverlayVoiceBubble $voiceBubble$inlined;

                  {
                     this.$v$inlined = var1;
                     this.$voiceBubble$inlined = var2x;
                  }

                  public void onLayoutChange(View var1, int var2x, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
                     var1.removeOnLayoutChangeListener(this);
                     var1 = this.$v$inlined.findViewWithTag("Active Voice Bubble");
                     kotlin.jvm.internal.r.g(var1, "findViewWithTag(...)");
                     this.$voiceBubble$inlined.anchorOn(var1);
                  }
               });
            }
         }

         public void onViewDetachedFromWindow(View var1) {
            kotlin.jvm.internal.r.h(var1, "v");
            if (this.$voiceBubble.isAttachedToWindow()) {
               this.$voiceBubble.setBubbleTouchable(true);
               this.$voiceBubble.anchorOff(true);
            }
         }
      });
      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$6`(var0: MobileVoiceOverlay, var1: OverlayVoiceBubble, var2: MotionEvent): Unit {
      kotlin.jvm.internal.r.h(var2, "event");
      var0.trashWrapProvider.withView(new k(var1, var2, var0));
      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$6$lambda$5`(var0: OverlayVoiceBubble, var1: MotionEvent, var2: MobileVoiceOverlay, var3: OverlayTrashWrap): Unit {
      kotlin.jvm.internal.r.h(var3, "trashWrap");
      if (var3.processMotionEvent(var0, var1)) {
         var2.onTrashVoiceBubble();
      }

      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$8`(var0: MobileVoiceOverlay, var1: OverlayVoiceBubble, var2: Boolean): Unit {
      var0.trashWrapProvider.withView(new g(var2, var0, var1));
      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$8$lambda$7`(var0: Boolean, var1: MobileVoiceOverlay, var2: OverlayVoiceBubble, var3: OverlayTrashWrap): Unit {
      kotlin.jvm.internal.r.h(var3, "trashWrap");
      if (var0) {
         var3.show();
      } else {
         var3.hide();
         var1.floatBubbleToHorizontalEdge(var2);
      }

      return Unit.a;
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
      kotlin.jvm.internal.r.h(var1, "data");
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getVoiceBubbleProvider$p(this).setData(var1);
         access$getMenuDialogProvider$p(this).setData(var1);
         access$getSelectorDialogProvider$p(this).setData(var1);
         access$getTrashWrapProvider$p(this).setData(var1);
      } else {
         val var2: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected to be on android main thread. Current: ");
         var3.append(var2);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   internal fun showOverlay(assets: MobileVoiceOverlayAssets) {
      kotlin.jvm.internal.r.h(var1, "assets");
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getSelectorDialogProvider$p(this).setAssets(var1);
         access$getMenuDialogProvider$p(this).setAssets(var1);
         access$getVoiceBubbleProvider$p(this).setAssets(var1);
         access$getTrashWrapProvider$p(this).setAssets(var1);
         if (!access$isOverlayShowing(this)) {
            access$getVoiceBubbleProvider$p(this).withView(new Function1(this) {
               final MobileVoiceOverlay this$0;

               {
                  this.this$0 = var1;
               }

               public final void invoke(OverlayVoiceBubble var1) {
                  kotlin.jvm.internal.r.h(var1, "it");
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
         kotlin.jvm.internal.r.h(var1, "context");
         kotlin.jvm.internal.r.h(var2, "taskName");
         kotlin.jvm.internal.r.h(var3, "taskParams");
         HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, var2, 0L, false, var3, false, 12, null);
      }
   }
}
