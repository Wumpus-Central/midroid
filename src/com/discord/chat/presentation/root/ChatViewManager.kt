package com.discord.chat.presentation.root

import android.content.Context
import com.discord.chat.presentation.events.CreateChatReactEventsKt
import com.discord.chat.presentation.list.ChatListView
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.reactevents.ReactEvents
import com.discord.recycler_view.scroller.Scroller
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDChatManagerDelegate
import com.facebook.react.viewmanagers.DCDChatManagerInterface

@ReactModule(name = "DCDChat")
public class ChatViewManager : ViewGroupManager<ChatView>, DCDChatManagerInterface<ChatView> {
   private final val delegate: DCDChatManagerDelegate<ChatView, ChatViewManager> = new DCDChatManagerDelegate(this)
   private final val reactEvents: ReactEvents = CreateChatReactEventsKt.createChatReactEvents()

   @JvmStatic
   fun `createViewInstance$lambda$1$lambda$0`(var0: ChatView): Int {
      return var0.getId();
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChatView {
      val var3: ChatView = new ChatView(var1);
      val var2: Context = var3.getContext();
      var3.setEventHandler(new ChatViewEventHandler(var2, this.reactEvents, new com.discord.chat.presentation.root.c(var3)));
      return var3;
   }

   protected open fun getDelegate(): DCDChatManagerDelegate<ChatView, ChatViewManager> {
      return this.delegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "DCDChat";
   }

   public open fun receiveCommand(view: ChatView, commandId: String, args: ReadableArray?) {
      val var4: Int = var2.hashCode();
      if (var4 != -938100109) {
         if (var4 != -402165208) {
            if (var4 == 1908871954 && var2.equals("scrollIntoView") && var3 != null) {
               this.scrollIntoView(var1, var3.getInt(0), var3.getBoolean(1), var3.getBoolean(2));
               return;
            }
         } else if (var2.equals("scrollTo") && var3 != null) {
            this.scrollTo(var1, var3.getInt(0), var3.getBoolean(1), var3.getBoolean(2), var3.getInt(3));
            return;
         }
      } else if (var2.equals("scrollToBottom") && var3 != null) {
         this.scrollToBottom(var1, var3.getBoolean(0));
         return;
      }
   }

   public open fun scrollIntoView(view: ChatView, index: Int, animated: Boolean, highlight: Boolean) {
      var1.scrollTo(var2, Scroller.TargetAlignment.Anywhere.INSTANCE, var3, var4);
   }

   public open fun scrollTo(view: ChatView, index: Int, animated: Boolean, highlight: Boolean, position: Int) {
      var1.scrollTo(var2, new Scroller.TargetAlignment.Top(ChatListView.Companion.getMESSAGE_TOP_SCROLL_OFFSET_PX()), var3, var4);
   }

   public open fun scrollToBottom(view: ChatView, animated: Boolean) {
      var1.scrollTo(0, Scroller.TargetAlignment.Anywhere.INSTANCE, var2, false);
   }

   @ReactProp(name = "adjustContentOffsetWithBounds")
   public open fun setAdjustContentOffsetWithBounds(view: ChatView, value: Boolean) {
   }

   @ReactProp(name = "alwaysRespectKeyboard")
   public open fun setAlwaysRespectKeyboard(view: ChatView, value: Boolean) {
   }

   @ReactProp(name = "animateEmoji")
   public open fun setAnimateEmoji(view: ChatView, value: Boolean) {
   }

   @ReactProp(name = "HACK_fixModalInteraction")
   public open fun setHACK_fixModalInteraction(view: ChatView, value: Boolean) {
   }

   @ReactProp(name = "inverted")
   public open fun setInverted(view: ChatView, inverted: Boolean) {
      var1.setInverted(var2);
   }

   @ReactProp(name = "keyboardBackgroundRgba")
   public open fun setKeyboardBackgroundRgba(view: ChatView, value: String?) {
   }

   @ReactProp(name = "roleStyle")
   public open fun setRoleStyle(view: ChatView, value: String?) {
   }

   public companion object {
      public const val NAME: String
      private const val COMMAND_SCROLL_TO: String
      private const val COMMAND_SCROLL_TO_BOTTOM: String
      private const val COMMAND_SCROLL_INTO_VIEW: String
   }
}
