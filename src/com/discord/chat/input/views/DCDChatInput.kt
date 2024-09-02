package com.discord.chat.input.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.Window
import androidx.appcompat.widget.AppCompatEditText
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.BooleanRef

public class DCDChatInput  public constructor(context: Context, attrs: AttributeSet? = null) : AppCompatEditText {
   private final var onRequestSend: (() -> Unit)?
   private final var onSelectionChanged: ((Int, Int) -> Unit)?
   private final val measureAndLayoutRunnable: Runnable

   fun DCDChatInput(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.measureAndLayoutRunnable = new e(this);
      this.setupExternalKeyboardSendRequests();
   }

   @JvmStatic
   fun `measureAndLayoutRunnable$lambda$0`(var0: DCDChatInput) {
      q.h(var0, "this$0");
      ViewMeasureExtensionsKt.measureAndLayout(var0);
   }

   private fun setupExternalKeyboardSendRequests() {
      this.setOnKeyListener(new f(new BooleanRef(), this));
   }

   @JvmStatic
   fun `setupExternalKeyboardSendRequests$lambda$2`(var0: BooleanRef, var1: DCDChatInput, var2: View, var3: Int, var4: KeyEvent): Boolean {
      q.h(var0, "$isEnterHeldDown");
      q.h(var1, "this$0");
      q.h(var4, "event");
      if ((var4.getFlags() and 2) == 2) {
         return false;
      } else {
         if (var3 == 66) {
            val var5: Boolean = var0.j;
            if (var4.getAction() == 0) {
               var0.j = true;
               if (var4.hasModifiers(1)) {
                  return false;
               }

               if (!var5 && var1.onRequestSend != null) {
                  var1.onRequestSend.invoke();
               }

               return true;
            }

            if (var4.getAction() == 1) {
               var0.j = false;
            }
         }

         return false;
      }
   }

   public open fun clearFocus() {
      super.clearFocus();
      val var1: Window = ViewUtilsKt.getWindow(this.getContext());
      if (var1 != null) {
         KeyboardExtensionsKt.hideKeyboard(this, var1);
      }
   }

   public open fun forceLayout() {
      val var1: Boolean = this.isLayoutRequested();
      super.forceLayout();
      if (var1 xor true) {
         this.post(this.measureAndLayoutRunnable);
      }
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.removeCallbacks(this.measureAndLayoutRunnable);
   }

   protected open fun onSelectionChanged(selStart: Int, selEnd: Int) {
      super.onSelectionChanged(var1, var2);
      if (this.onSelectionChanged != null) {
         this.onSelectionChanged.invoke(var1, var2);
      }
   }

   public override fun onTextContextMenuItem(id: Int): Boolean {
      var var2: Int = var1;
      if (var1 == 16908322) {
         var2 = 16908337;
      }

      return super.onTextContextMenuItem(var2);
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public open fun onTouchEvent(event: MotionEvent): Boolean {
      q.h(var1, "event");
      if (var1.getAction() == 0) {
         GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
      }

      return super.onTouchEvent(var1);
   }

   public open fun requestLayout() {
      val var1: Boolean = this.isLayoutRequested();
      super.requestLayout();
      if (var1 xor true) {
         this.post(this.measureAndLayoutRunnable);
      }
   }

   public fun setOnRequestSend(onRequestSend: () -> Unit) {
      q.h(var1, "onRequestSend");
      this.onRequestSend = var1;
   }

   public fun setOnSelectionChanged(onSelectionChanged: (Int, Int) -> Unit) {
      q.h(var1, "onSelectionChanged");
      this.onSelectionChanged = var1;
   }
}
