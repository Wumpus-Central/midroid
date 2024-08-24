package com.discord.chat.presentation.root

import android.content.Context
import com.discord.chat.presentation.events.CreateChatReactEventsKt
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.reactevents.ReactEvents
import com.discord.recycler_view.scroller.Scroller.TargetAlignment.Anywhere
import com.discord.recycler_view.scroller.Scroller.TargetAlignment.Top
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDChatManagerDelegate
import com.facebook.react.viewmanagers.DCDChatManagerInterface
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

@ReactModule(name = "DCDChat")
public class ChatViewManager : ViewGroupManager<ChatView>, DCDChatManagerInterface<ChatView> {
   private final val delegate: DCDChatManagerDelegate<ChatView, ChatViewManager> = new DCDChatManagerDelegate(this)
   private final val reactEvents: ReactEvents = CreateChatReactEventsKt.createChatReactEvents()

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChatView {
      r.h(var1, "reactContext");
      val var2: ChatView = new ChatView(var1);
      val var3: Context = var2.getContext();
      r.g(var3, "chatView.context");
      var2.setEventHandler(new ChatViewEventHandler(var3, this.reactEvents, new Function0<Integer>(var2) {
         final ChatView $chatView;

         {
            super(0);
            this.$chatView = var1;
         }

         public final Integer invoke() {
            return this.$chatView.getId();
         }
      }));
      return var2;
   }

   protected open fun getDelegate(): DCDChatManagerDelegate<ChatView, ChatViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDChat";
   }

   public open fun receiveCommand(view: ChatView, commandId: String, args: ReadableArray?) {
      r.h(var1, "view");
      r.h(var2, "commandId");
      val var4: Int = var2.hashCode();
      if (var4 != -938100109) {
         if (var4 != -402165208) {
            if (var4 == 1908871954 && var2.equals("scrollIntoView")) {
               if (var3 == null) {
                  return;
               }

               this.scrollIntoView(var1, var3.getInt(0), var3.getBoolean(1));
            }
         } else if (var2.equals("scrollTo")) {
            if (var3 == null) {
               return;
            }

            this.scrollTo(var1, var3.getInt(0), var3.getBoolean(1));
         }
      } else if (var2.equals("scrollToBottom")) {
         if (var3 == null) {
            return;
         }

         this.scrollToBottom(var1, var3.getBoolean(0));
      }
   }

   public open fun scrollIntoView(view: ChatView, index: Int, animated: Boolean) {
      r.h(var1, "view");
      var1.scrollTo(var2, Anywhere.INSTANCE, var3, false);
   }

   public open fun scrollTo(view: ChatView, index: Int, animated: Boolean) {
      r.h(var1, "view");
      var1.scrollTo(var2, new Top(SizeUtilsKt.getDpToPx(4)), var3, false);
   }

   public open fun scrollToBottom(view: ChatView, animated: Boolean) {
      r.h(var1, "view");
      var1.scrollTo(0, Anywhere.INSTANCE, var2, false);
   }

   @ReactProp(name = "adjustContentOffsetWithBounds")
   public open fun setAdjustContentOffsetWithBounds(view: ChatView, value: Boolean) {
      r.h(var1, "view");
   }

   @ReactProp(name = "alwaysRespectKeyboard")
   public open fun setAlwaysRespectKeyboard(view: ChatView, value: Boolean) {
      r.h(var1, "view");
   }

   @ReactProp(name = "animateEmoji")
   public open fun setAnimateEmoji(view: ChatView, value: Boolean) {
      r.h(var1, "view");
   }

   @ReactProp(name = "animatedCustomKeyboardHeight")
   public open fun setAnimatedCustomKeyboardHeight(view: ChatView, value: Float) {
      r.h(var1, "view");
      var1.setAnimatedCustomKeyboardHeight(var2);
   }

   @ReactProp(name = "HACK_fixModalInteraction")
   public open fun setHACK_fixModalInteraction(view: ChatView, value: Boolean) {
      r.h(var1, "view");
   }

   @ReactProp(name = "inverted")
   public open fun setInverted(view: ChatView, inverted: Boolean) {
      r.h(var1, "view");
      var1.setInverted(var2);
   }

   @ReactProp(name = "keyboardBackgroundRgba")
   public open fun setKeyboardBackgroundRgba(view: ChatView, value: String?) {
      r.h(var1, "view");
   }

   @ReactProp(name = "keyboardResponderProxyTag")
   public open fun setKeyboardResponderProxyTag(view: ChatView, value: Int) {
      r.h(var1, "view");
   }

   @ReactProp(name = "roleStyle")
   public open fun setRoleStyle(view: ChatView, value: String?) {
      r.h(var1, "view");
   }

   @ReactProp(name = "scrollEnabled")
   public open fun setScrollEnabled(view: ChatView, value: Boolean) {
      r.h(var1, "view");
   }

   @ReactProp(name = "shouldAnimateAndroid")
   public open fun setShouldAnimateAndroid(view: ChatView, value: Boolean) {
      r.h(var1, "view");
      var1.setAnimated(var2);
   }

   public companion object {
      private const val COMMAND_SCROLL_INTO_VIEW: String
      private const val COMMAND_SCROLL_TO: String
      private const val COMMAND_SCROLL_TO_BOTTOM: String
      public const val NAME: String
   }
}
