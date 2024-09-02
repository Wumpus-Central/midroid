package com.discord.react_gesture_handler

import android.app.Activity
import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.core.view.v0
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
import kotlin.jvm.internal.q

internal class DiscordGestureHandlerEnabledRootView(context: Context) : RNGestureHandlerRootView {
   private final val supplementalMotionEventReceivedCallbacks: MutableMap<(MotionEvent) -> Unit, Boolean>

   @JvmStatic
   fun {
      val var0: DiscordGestureHandlerEnabledRootView.Companion = new DiscordGestureHandlerEnabledRootView.Companion(null);
      Companion = var0;
      DiscordGestureHandlerEnabledRootView.Companion.access$initNestedScrollOnTouchListeners(var0);
   }

   init {
      q.h(var1, "context");
      super(var1);
      this.supplementalMotionEventReceivedCallbacks = new LinkedHashMap<>();
   }

   public open fun dispatchTouchEvent(ev: MotionEvent): Boolean {
      q.h(var1, "ev");
      val var3: java.util.Iterator = this.supplementalMotionEventReceivedCallbacks.entrySet().iterator();

      while (var3.hasNext()) {
         val var4: Entry = var3.next() as Entry;
         val var5: Function1 = var4.getKey() as Function1;
         if (var4.getValue() as java.lang.Boolean) {
            var5.invoke(var1);
         } else {
            var3.remove();
         }
      }

      var var2: Boolean;
      try {
         var2 = super.dispatchTouchEvent(var1);
      } catch (var6: IllegalArgumentException) {
         var2 = false;
      }

      return var2;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      val var1: ThemeManager = ThemeManager.INSTANCE;
      ThemeManager.INSTANCE.updateSystemUi(this);
      if (q.c(DiscordGestureHandlerEnabledRootView.Companion.access$getNullable(Companion, this), this)) {
         val var2: Context = this.getContext();
         q.g(var2, "getContext(...)");
         var1.updateWindowBackground(var2, false);
      }
   }

   public companion object {
      private final val gestureHandlersToRootView: WeakHashMap<View, WeakReference<DiscordGestureHandlerEnabledRootView?>>

      private fun find(view: View): DiscordGestureHandlerEnabledRootView? {
         if (var1 is DiscordGestureHandlerEnabledRootView) {
            return var1 as DiscordGestureHandlerEnabledRootView;
         } else {
            if (var1 is ViewGroup) {
               for (View var2 : v0.a((ViewGroup)var1)) {
                  val var4: DiscordGestureHandlerEnabledRootView = DiscordGestureHandlerEnabledRootView.Companion.find(var2);
                  if (var4 != null) {
                     return var4;
                  }
               }
            }

            return null;
         }
      }

      private fun getNullable(view: View): DiscordGestureHandlerEnabledRootView? {
         val var3: Context = var1.getContext();
         val var9: ReactContext;
         if (var3 is ReactContext) {
            var9 = var3 as ReactContext;
         } else {
            var9 = null;
         }

         var var4: View;
         label36: {
            if (var9 != null) {
               val var10: Activity = var9.getCurrentActivity();
               if (var10 != null) {
                  val var11: View = ActivityExtensionsKt.getRootView(var10);
                  var4 = var11;
                  if (var11 != null) {
                     break label36;
                  }
               }
            }

            var4 = var1.getRootView();
         }

         val var6: WeakReference = DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp().get(var4) as WeakReference;
         val var7: DiscordGestureHandlerEnabledRootView;
         if (var6 != null) {
            var7 = var6.get() as DiscordGestureHandlerEnabledRootView;
         } else {
            var7 = null;
         }

         if (var7 != null) {
            var var12: DiscordGestureHandlerEnabledRootView = null;
            if (var7.isAttachedToWindow()) {
               var12 = var7;
            }

            if (var12 != null) {
               return var12;
            }
         }

         DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp().remove(var7);
         q.e(var4);
         val var8: DiscordGestureHandlerEnabledRootView = this.find(var4);
         var var13: DiscordGestureHandlerEnabledRootView = var8;
         if (var8 != null) {
            DiscordGestureHandlerEnabledRootView.access$getGestureHandlersToRootView$cp().put(var4, new WeakReference<>(var8));
            var13 = var8;
         }

         return var13;
      }

      private fun initNestedScrollOnTouchListeners() {
         val var1: NestedScrollOnTouchListener.Companion = NestedScrollOnTouchListener.Companion;
         NestedScrollOnTouchListener.Companion.setOnAddNativeEventListener(<unrepresentable>.INSTANCE);
         var1.setOnRemoveNativeEventListener(<unrepresentable>.INSTANCE);
      }

      internal fun get(view: View): DiscordGestureHandlerEnabledRootView {
         q.h(var1, "view");
         val var2: DiscordGestureHandlerEnabledRootView = this.getNullable(var1);
         q.e(var2);
         return var2;
      }
   }
}
