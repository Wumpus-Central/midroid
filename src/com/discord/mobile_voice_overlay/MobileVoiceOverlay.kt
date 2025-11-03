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
import ht.v
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMobileVoiceOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileVoiceOverlay.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlay\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,242:1\n14#2,5:243\n14#2,5:248\n14#2,5:253\n1#3:258\n339#4,28:259\n29#5:287\n85#5,18:288\n*S KotlinDebug\n*F\n+ 1 MobileVoiceOverlay.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlay\n*L\n134#1:243,5\n148#1:248,5\n159#1:253,5\n45#1:259,28\n172#1:287\n172#1:288,18\n*E\n"])
internal class MobileVoiceOverlay(context: ReactApplicationContext, emitOnLayoutTrashed: () -> Unit, emitOnChannelQueryUpdate: (String) -> Unit) {
   private final val context: ReactApplicationContext
   private final val emitOnLayoutTrashed: () -> Unit
   private final val emitOnChannelQueryUpdate: (String) -> Unit
   private final val voiceBubbleProvider: OverlayViewProvider<OverlayVoiceBubble>
   private final val trashWrapProvider: OverlayViewProvider<OverlayTrashWrap>
   private final val menuDialogProvider: OverlayViewProvider<OverlayMenuBubbleDialog>
   private final val selectorDialogProvider: OverlayViewProvider<OverlayVoiceSelectorBubbleDialog>

   init {
      this.context = var1;
      this.emitOnLayoutTrashed = var2;
      this.emitOnChannelQueryUpdate = var3;
      this.voiceBubbleProvider = new OverlayViewProvider<>(new e(this));
      this.trashWrapProvider = new OverlayViewProvider<>(new f(this));
      this.menuDialogProvider = new OverlayViewProvider<>(new g(this));
      this.selectorDialogProvider = new OverlayViewProvider<>(new h(this));
   }

   private fun closeMenuDialog() {
      this.menuDialogProvider.removeViewFromOverlay();
   }

   private fun emitOnChannelQueryUpdateEvent(query: String) {
      this.emitOnChannelQueryUpdate.invoke(var1);
   }

   private fun emitOnLayoutTrashedEvent() {
      this.emitOnLayoutTrashed.invoke();
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
      return this.trashWrapProvider.isInOverlay() && this.voiceBubbleProvider.isInOverlay();
   }

   @JvmStatic
   fun `menuDialogProvider$lambda$14`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayMenuBubbleDialog {
      val var2: OverlayMenuBubbleDialog = new OverlayMenuBubbleDialog(var0.context);
      var2.getInsetMargins().top = var2.getResources().getDimensionPixelOffset(R.dimen.vertical_safe_margin);
      var2.setOnDialogClosed(new i(var0));
      var2.setOnShowSelectorDialog(new j(var0));
      return var2;
   }

   @JvmStatic
   fun `menuDialogProvider$lambda$14$lambda$13$lambda$11`(var0: MobileVoiceOverlay, var1: OverlayDialog): Unit {
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
      var1.moveToAnchorPoint();
      val var2: Animator = AnimatorInflater.loadAnimator(var1.getContext(), R.animator.fade_out);
      var2.setTarget(var1);
      var2.addListener(new AnimatorListener(var0) {
         final MobileVoiceOverlay this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            if (ThreadUtilsKt.isOnMainThread()) {
               MobileVoiceOverlay.access$emitOnLayoutTrashedEvent(this.this$0);
            } else {
               ThreadUtilsKt.getUiHandler().post(new Runnable(this.this$0) {
                  final MobileVoiceOverlay this$0;

                  {
                     this.this$0 = var1;
                  }

                  @Override
                  public final void run() {
                     MobileVoiceOverlay.access$emitOnLayoutTrashedEvent(this.this$0);
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
      val var2: OverlayVoiceSelectorBubbleDialog = new OverlayVoiceSelectorBubbleDialog(var0.context);
      var2.setOnDialogClosed(new o(var1));
      var2.setOnTextChanged(new p(var0));
      var2.setOnChannelSelected(new q(var2));
      return var2;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19$lambda$18$lambda$15`(var0: OverlayViewProvider, var1: OverlayDialog): Unit {
      var0.removeViewFromOverlay();
      return Unit.a;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19$lambda$18$lambda$16`(var0: MobileVoiceOverlay, var1: java.lang.String): Unit {
      var0.emitOnChannelQueryUpdateEvent(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `selectorDialogProvider$lambda$19$lambda$18$lambda$17`(var0: OverlayVoiceSelectorBubbleDialog, var1: ChannelId): Unit {
      val var2: MobileVoiceOverlay.Companion = Companion;
      val var3: Context = var0.getContext();
      var2.startHeadlessTask(
         var3,
         "SelectChannel",
         c3.c.a(new Pair[]{v.a("channelId", java.lang.String.valueOf(var1.unbox-impl())), v.a("connectToVoice", java.lang.Boolean.TRUE)})
      );
      return Unit.a;
   }

   @JvmStatic
   fun `trashWrapProvider$lambda$10`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayTrashWrap {
      return new OverlayTrashWrap(var0.context);
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9`(var0: MobileVoiceOverlay, var1: OverlayViewProvider): OverlayVoiceBubble {
      val var2: Int = var0.context.getResources().getDimensionPixelOffset(R.dimen.overlay_safe_margin);
      val var4: OverlayVoiceBubble = new OverlayVoiceBubble(var0.context);
      var4.getInsetMargins().set(-var2, var2, -var2, var2);
      var4.setOnClickListener(new l(var4, var0));
      var4.setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(new m(var0, var4));
      var4.setOnMovingStateChanged(new n(var0, var4));
      return var4;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$4`(var0: OverlayVoiceBubble, var1: MobileVoiceOverlay, var2: View) {
      val var9: SimpleDraweeView = var0.getImageView$mobile_voice_overlay_release();
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

      var1.menuDialogProvider.withView(new d(var0, new Rect(var3, var4, var5, var6)));
      var0.setBubbleTouchable(false);
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$4$lambda$3`(var0: OverlayVoiceBubble, var1: Rect, var2: OverlayMenuBubbleDialog): Unit {
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
            val var2: OverlayVoiceBubble = this.$voiceBubble;
            if (var1.isLaidOut() && !var1.isLayoutRequested()) {
               var1 = var1.findViewWithTag("Active Voice Bubble");
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
                     this.$voiceBubble$inlined.anchorOn(var1);
                  }
               });
            }
         }

         public void onViewDetachedFromWindow(View var1) {
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
      var0.trashWrapProvider.withView(new k(var1, var2, var0));
      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$6$lambda$5`(var0: OverlayVoiceBubble, var1: MotionEvent, var2: MobileVoiceOverlay, var3: OverlayTrashWrap): Unit {
      if (var3.processMotionEvent(var0, var1)) {
         var2.onTrashVoiceBubble();
      }

      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$8`(var0: MobileVoiceOverlay, var1: OverlayVoiceBubble, var2: Boolean): Unit {
      var0.trashWrapProvider.withView(new c(var2, var0, var1));
      return Unit.a;
   }

   @JvmStatic
   fun `voiceBubbleProvider$lambda$9$lambda$8$lambda$7`(var0: Boolean, var1: MobileVoiceOverlay, var2: OverlayVoiceBubble, var3: OverlayTrashWrap): Unit {
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
         val var1: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var1);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   internal fun setData(data: MobileVoiceOverlayData) {
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
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getSelectorDialogProvider$p(this).setAssets(var1);
         access$getMenuDialogProvider$p(this).setAssets(var1);
         access$getVoiceBubbleProvider$p(this).setAssets(var1);
         access$getTrashWrapProvider$p(this).setAssets(var1);
         if (!access$isOverlayShowing(this)) {
            access$getVoiceBubbleProvider$p(this).withView(new Function1<OverlayVoiceBubble, Unit>(this) {
               final MobileVoiceOverlay this$0;

               {
                  this.this$0 = var1;
               }

               public final void invoke(OverlayVoiceBubble var1) {
                  MobileVoiceOverlay.access$floatBubbleToHorizontalEdge(this.this$0, var1);
               }
            });
         }
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public companion object {
      private const val ANCHOR_TAG: String
      private const val JS_INTERFACE_NAME: String

      public fun startHeadlessTask(context: Context, taskName: String, taskParams: Bundle = Bundle.EMPTY) {
         HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, var2, 0L, false, var3, false, 12, null);
      }
   }
}
