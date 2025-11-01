package com.discord.chat.input.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.widget.AppCompatEditText
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt
import kotlin.jvm.internal.Ref
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDCDChatInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DCDChatInput.kt\ncom/discord/chat/input/views/DCDChatInput\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"])
public class DCDChatInput  public constructor(context: Context, attrs: AttributeSet? = null) : AppCompatEditText(var1, var2) {
   private final var onRequestSend: (() -> Unit)?
   private final var onSelectionChanged: ((Int, Int) -> Unit)?
   private final val measureAndLayoutRunnable: Runnable = new k(this)

   fun DCDChatInput(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      this.setupExternalKeyboardSendRequests();
   }

   @JvmStatic
   fun `measureAndLayoutRunnable$lambda$0`(var0: DCDChatInput) {
      ViewMeasureExtensionsKt.measureAndLayout(var0);
   }

   private fun setupExternalKeyboardSendRequests() {
      this.setOnKeyListener(new com.discord.chat.input.views.j(new Ref.BooleanRef(), this));
   }

   @JvmStatic
   fun `setupExternalKeyboardSendRequests$lambda$2`(var0: Ref.BooleanRef, var1: DCDChatInput, var2: View, var3: Int, var4: KeyEvent): Boolean {
      if ((var4.getFlags() and 2) == 2) {
         return false;
      } else {
         if (var3 == 66) {
            val var5: Boolean = var0.element;
            if (var4.getAction() == 0) {
               var0.element = true;
               if (var4.hasModifiers(1)) {
                  return false;
               }

               if (!var5 && var1.onRequestSend != null) {
                  var1.onRequestSend.invoke();
               }

               return true;
            }

            if (var4.getAction() == 1) {
               var0.element = false;
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
      if (!var1) {
         this.post(this.measureAndLayoutRunnable);
      }
   }

   protected override fun onDetachedFromWindow() {
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
      if (var1.getAction() == 0) {
         val var2: ViewGroup = GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this);
         if (var2 != null) {
            var2.requestDisallowInterceptTouchEvent(true);
         }
      }

      return super.onTouchEvent(var1);
   }

   public open fun requestLayout() {
      val var1: Boolean = this.isLayoutRequested();
      super.requestLayout();
      if (!var1) {
         this.post(this.measureAndLayoutRunnable);
      }
   }

   public fun setNoExtractUI(enabled: Boolean) {
      val var2: Int;
      if (var1) {
         var2 = this.getImeOptions() or 268435456;
      } else {
         var2 = this.getImeOptions() and -268435457;
      }

      this.setImeOptions(var2);
   }

   public fun setOnRequestSend(onRequestSend: () -> Unit) {
      this.onRequestSend = var1;
   }

   public fun setOnSelectionChanged(onSelectionChanged: (Int, Int) -> Unit) {
      this.onSelectionChanged = var1;
   }
}
