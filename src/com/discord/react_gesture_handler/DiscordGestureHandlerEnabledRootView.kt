package com.discord.react_gesture_handler

import android.app.Activity
import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.core.view.n0
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchListener
import com.discord.theme.ThemeManager
import com.facebook.react.bridge.ReactContext
import com.swmansion.gesturehandler.react.RNGestureHandlerRootView
import java.lang.ref.WeakReference
import java.util.LinkedHashMap
import java.util.WeakHashMap
import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

internal class DiscordGestureHandlerEnabledRootView(context: Context) : RNGestureHandlerRootView(var1) {
   private final val supplementalMotionEventReceivedCallbacks: MutableMap<(MotionEvent) -> Unit, Boolean> = new LinkedHashMap()

   @JvmStatic
   fun {
      val var0: DiscordGestureHandlerEnabledRootView.Companion = new DiscordGestureHandlerEnabledRootView.Companion(null);
      Companion = var0;
      DiscordGestureHandlerEnabledRootView.Companion.access$initNestedScrollOnTouchListeners(var0);
   }

   public open fun dispatchTouchEvent(ev: MotionEvent): Boolean {
      val var5: java.util.Iterator = this.supplementalMotionEventReceivedCallbacks.entrySet().iterator();

      while (var5.hasNext()) {
         val var4: Entry = var5.next() as Entry;
         val var3: Function1 = var4.getKey() as Function1;
         if (var4.getValue() as java.lang.Boolean) {
            var3.invoke(var1);
         } else {
            var5.remove();
         }
      }

      try {
         return super.dispatchTouchEvent(var1);
      } catch (var6: IllegalArgumentException) {
         return false;
      }
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      val var1: ThemeManager = ThemeManager.INSTANCE;
      ThemeManager.INSTANCE.updateSystemUi(this);
      if (Companion.getNullable$react_gesture_handler_release(this) == this) {
         val var2: Context = this.getContext();
         var1.updateWindowBackground(var2, false);
      }
   }

   @SourceDebugExtension(["SMAP\nDiscordGestureHandlerEnabledRootView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordGestureHandlerEnabledRootView.kt\ncom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,127:1\n1317#2,2:128\n*S KotlinDebug\n*F\n+ 1 DiscordGestureHandlerEnabledRootView.kt\ncom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion\n*L\n115#1:128,2\n*E\n"])
   public companion object {
      private final val gestureHandlersToRootView: WeakHashMap<View, WeakReference<DiscordGestureHandlerEnabledRootView?>>

      private fun find(view: View): DiscordGestureHandlerEnabledRootView? {
         if (var1 is DiscordGestureHandlerEnabledRootView) {
            return var1 as DiscordGestureHandlerEnabledRootView;
         } else {
            if (var1 is ViewGroup) {
               for (View var2 : n0.a((ViewGroup)var1)) {
                  val var4: DiscordGestureHandlerEnabledRootView = DiscordGestureHandlerEnabledRootView.Companion.find(var2);
                  if (var4 != null) {
                     return var4;
                  }
               }
            }

            return null;
         }
      }

      private fun initNestedScrollOnTouchListeners() {
         val var1: NestedScrollOnTouchListener.Companion = NestedScrollOnTouchListener.Companion;
         NestedScrollOnTouchListener.Companion.setOnAddNativeEventListener(new a());
         var1.setOnRemoveNativeEventListener(new b());
      }

      @JvmStatic
      fun `initNestedScrollOnTouchListeners$lambda$0`(var0: View, var1: Function1): Unit {
         val var2: DiscordGestureHandlerEnabledRootView = DiscordGestureHandlerEnabledRootView.Companion.getNullable$react_gesture_handler_release(var0);
         if (var2 != null) {
            val var3: java.util.Map = DiscordGestureHandlerEnabledRootView.access$getSupplementalMotionEventReceivedCallbacks$p(var2);
            if (var3 != null) {
               var3.put(var1, java.lang.Boolean.TRUE);
            }
         }

         return Unit.a;
      }

      @JvmStatic
      fun `initNestedScrollOnTouchListeners$lambda$1`(var0: View, var1: Function1): Unit {
         val var2: DiscordGestureHandlerEnabledRootView = DiscordGestureHandlerEnabledRootView.Companion.getNullable$react_gesture_handler_release(var0);
         if (var2 != null) {
            val var3: java.util.Map = DiscordGestureHandlerEnabledRootView.access$getSupplementalMotionEventReceivedCallbacks$p(var2);
            if (var3 != null) {
               var3.put(var1, java.lang.Boolean.FALSE);
            }
         }

         return Unit.a;
      }

      internal fun getNullable(view: View): DiscordGestureHandlerEnabledRootView? {
         val var3: Context = var1.getContext();
         val var2: Boolean = var3 is ReactContext;
         var var4: DiscordGestureHandlerEnabledRootView = null;
         val var9: ReactContext;
         if (var2) {
            var9 = var3 as ReactContext;
         } else {
            var9 = null;
         }

         label37: {
            if (var9 != null) {
               val var10: Activity = var9.getCurrentActivity();
               if (var10 != null) {
                  val var5: View = ActivityExtensionsKt.getRootView(var10);
                  var11 = var5;
                  if (var5 != null) {
                     break label37;
                  }
               }
            }

            var11 = var1.getRootView();
         }

         val var6: WeakReference = DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp().get(var11) as WeakReference;
         val var7: DiscordGestureHandlerEnabledRootView;
         if (var6 != null) {
            var7 = var6.get() as DiscordGestureHandlerEnabledRootView;
         } else {
            var7 = null;
         }

         if (var7 != null) {
            if (var7.isAttachedToWindow()) {
               var4 = var7;
            }

            if (var4 != null) {
               return var4;
            }
         }

         DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp().remove(var7);
         val var8: DiscordGestureHandlerEnabledRootView = this.find(var11);
         if (var8 != null) {
            DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp().put(var11, new WeakReference<>(var8));
         }

         return var8;
      }
   }
}
