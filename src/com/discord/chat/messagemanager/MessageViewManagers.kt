package com.discord.chat.messagemanager

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameType
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.row.Row
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.events.CreateChatReactEventsKt
import com.discord.chat.presentation.list.AccessoriesViewPool
import com.discord.chat.presentation.list.messagebundling.MessageBundleView
import com.discord.chat.presentation.message.DecoratedMessageView
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.message.system.SystemMessageWrapperView
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.root.MessageContextKt
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.chat.reactevents.OnLongPressMessageBundleItemData
import com.discord.chat.reactevents.OnTapMessageBundleItemData
import com.discord.chat.reactevents.OnTapReplyItemData
import com.discord.chat.reactevents.OnTapViewMoreTextData
import com.discord.chat.reactevents.OnTruncateMessageData
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvents
import com.discord.theme.ThemeManager
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerDelegate
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerInterface
import com.facebook.react.viewmanagers.DCDGuildMultilineSystemMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDGuildMultilineSystemMessageViewManagerInterface
import com.facebook.react.viewmanagers.DCDMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDMessageViewManagerInterface
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface
import kh.w
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json

public object MessageViewManagers {
   private final val json: Json = kotlinx.serialization.json.b.b(null, <unrepresentable>.INSTANCE, 1, null)
   private final val reactEvents: ReactEvents

   @JvmStatic
   fun {
      val var0: ReactEvents = CreateChatReactEventsKt.createChatReactEvents();
      var0.exportEventConstants();
      reactEvents = var0;
   }

   private fun convertRowJsonToMessageRow(rowJson: String): MessageRow {
      val var2: Json = json;
      json.a();
      val var3: Any = var2.b(Row.Companion.serializer(), var1);
      q.f(var3, "null cannot be cast to non-null type com.discord.chat.bridge.row.MessageRow");
      return var3 as MessageRow;
   }

   private fun MessageRow.getEventHandler(context: Context): ChatEventHandler {
      val var3: Any;
      if (var1.getReactTag() != null) {
         var3 = new ChatViewEventHandler(var2, reactEvents, new Function0(var1) {
            final MessageRow $this_getEventHandler;

            {
               super(0);
               this.$this_getEventHandler = var1;
            }

            public final Integer invoke() {
               return this.$this_getEventHandler.getReactTag();
            }
         });
      } else {
         var3 = ChatEventHandler.Empty.INSTANCE;
      }

      return (ChatEventHandler)var3;
   }

   @ReactModule(name = "DCDGuildMultilineSystemMessageView")
   public class GuildMultilineSystemMessageViewManager : ViewGroupManager<MessageView>, DCDGuildMultilineSystemMessageViewManagerInterface<MessageView> {
      private final val delegate: DCDGuildMultilineSystemMessageViewManagerDelegate<
         MessageView,
         com.discord.chat.messagemanager.MessageViewManagers.GuildMultilineSystemMessageViewManager
      > = new DCDGuildMultilineSystemMessageViewManagerDelegate(this)

      protected open fun createViewInstance(reactContext: ThemedReactContext): Nothing {
         q.h(var1, "reactContext");
         throw new UnsupportedOperationException("multiline system messages are not supported.");
      }

      protected open fun getDelegate(): DCDGuildMultilineSystemMessageViewManagerDelegate<
            MessageView,
            com.discord.chat.messagemanager.MessageViewManagers.GuildMultilineSystemMessageViewManager
         > {
         return this.delegate;
      }

      public open fun getName(): String {
         return "DCDGuildMultilineSystemMessageView";
      }

      @ReactProp(name = "row")
      public open fun setRow(view: MessageView, value: String?) {
         q.h(var1, "view");
         throw new UnsupportedOperationException("multiline system messages are not supported.");
      }

      public companion object {
         public const val NAME: String
      }
   }

   @ReactModule(name = "DCDGuildFeedMessageItemView")
   public class MessageBundleViewManager : ViewGroupManager<MessageBundleView>, DCDGuildFeedMessageItemViewManagerInterface<MessageBundleView> {
      private final val delegate: DCDGuildFeedMessageItemViewManagerDelegate<
         MessageBundleView,
         com.discord.chat.messagemanager.MessageViewManagers.MessageBundleViewManager
      > = new DCDGuildFeedMessageItemViewManagerDelegate(this)
      private final val messageAccessoriesViewPool: AccessoriesViewPool
      private final val messageRowViewPool: RecycledViewPool
      private final val reactEvents: ReactEvents =
         new ReactEvents(
            w.a("onTapItem", g0.b(OnTapMessageBundleItemData.class)),
            w.a("onLongPressItem", g0.b(OnLongPressMessageBundleItemData.class)),
            w.a("onTruncateMessage", g0.b(OnTruncateMessageData.class)),
            w.a("onTapReplyItem", g0.b(OnTapReplyItemData.class)),
            w.a("onTapViewMoreText", g0.b(OnTapViewMoreTextData.class))
         )

      private fun emitOnLongPressItem(view: View): Boolean {
         this.reactEvents.emitEvent(var1, new OnLongPressMessageBundleItemData());
         return true;
      }

      private fun emitOnTapItem(view: View) {
         this.reactEvents.emitEvent(var1, new OnTapMessageBundleItemData());
      }

      private fun emitOnTapReply(view: View, messageId: MessageId) {
         this.reactEvents.emitEvent(var1, new OnTapReplyItemData(var2, null));
      }

      private fun emitOnTapViewMoreText(view: View) {
         this.reactEvents.emitEvent(var1, new OnTapViewMoreTextData());
      }

      private fun emitOnTruncateMessage(view: View, messageId: MessageId) {
         this.reactEvents.emitEvent(var1, new OnTruncateMessageData(var2, null));
      }

      @JvmStatic
      fun `setData$lambda$6$lambda$3`(var0: MessageViewManagers.MessageBundleViewManager, var1: MessageBundleView, var2: View) {
         q.h(var0, "this$0");
         q.h(var1, "$view");
         var0.emitOnTapItem(var1);
      }

      @JvmStatic
      fun `setData$lambda$6$lambda$4`(var0: MessageViewManagers.MessageBundleViewManager, var1: MessageBundleView, var2: View): Boolean {
         q.h(var0, "this$0");
         q.h(var1, "$view");
         return var0.emitOnLongPressItem(var1);
      }

      @JvmStatic
      fun `setData$lambda$6$lambda$5`(var0: MessageViewManagers.MessageBundleViewManager, var1: MessageBundleView, var2: View) {
         q.h(var0, "this$0");
         q.h(var1, "$view");
         var0.emitOnTapViewMoreText(var1);
      }

      protected open fun createViewInstance(reactContext: ThemedReactContext): MessageBundleView {
         q.h(var1, "reactContext");
         val var2: MessageBundleView = new MessageBundleView(var1, null, 0, 6, null);
         var2.setMessageRowViewPool(this.messageRowViewPool);
         var2.setMessageAccessoriesViewPool(this.messageAccessoriesViewPool);
         var2.setOnTruncateMessage(new Function1(this, var2) {
            final MessageBundleView $view;
            final MessageViewManagers.MessageBundleViewManager this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$view = var2;
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               q.h(var1, "messageId");
               MessageViewManagers.MessageBundleViewManager.access$emitOnTruncateMessage-Ayv7vGE(this.this$0, this.$view, var1);
            }
         });
         return var2;
      }

      protected open fun getDelegate(): DCDGuildFeedMessageItemViewManagerDelegate<
            MessageBundleView,
            com.discord.chat.messagemanager.MessageViewManagers.MessageBundleViewManager
         > {
         return this.delegate;
      }

      public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
         return this.reactEvents.exportEventConstants();
      }

      public open fun getName(): String {
         return "DCDGuildFeedMessageItemView";
      }

      @ReactProp(name = "data")
      public open fun setData(view: MessageBundleView, value: String?) {
         q.h(var1, "view");
         if (var2 != null) {
            val var3: Json = MessageViewManagers.access$getJson$p();
            var3.a();
            var1.setBundle(
               var3.b(MessageBundleView.MessageBundle.Companion.serializer(), var2) as MessageBundleView.MessageBundle,
               new a(this, var1),
               new b(this, var1),
               new Function1(this, var1) {
                  final MessageBundleView $view;
                  final MessageViewManagers.MessageBundleViewManager this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                     this.$view = var2;
                  }

                  public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                     q.h(var1, "messageId");
                     MessageViewManagers.MessageBundleViewManager.access$emitOnTapReply-Ayv7vGE(this.this$0, this.$view, var1);
                  }
               },
               new c(this, var1)
            );
         }
      }

      public companion object {
         public const val NAME: String
      }
   }

   @ReactModule(name = "DCDMessageView")
   public class MessageViewManager : ViewGroupManager<DecoratedMessageView>, DCDMessageViewManagerInterface<DecoratedMessageView> {
      private final val delegate: DCDMessageViewManagerDelegate<DecoratedMessageView, com.discord.chat.messagemanager.MessageViewManagers.MessageViewManager> =
         new DCDMessageViewManagerDelegate(this)

      protected open fun createViewInstance(reactContext: ThemedReactContext): DecoratedMessageView {
         q.h(var1, "reactContext");
         return new DecoratedMessageView(var1, null, 2, null);
      }

      protected open fun getDelegate(): DCDMessageViewManagerDelegate<
            DecoratedMessageView,
            com.discord.chat.messagemanager.MessageViewManagers.MessageViewManager
         > {
         return this.delegate;
      }

      public open fun getName(): String {
         return "DCDMessageView";
      }

      @ReactProp(name = "row")
      public open fun setRow(view: DecoratedMessageView, value: String?) {
         q.h(var1, "view");
         if (var2 != null) {
            val var3: MessageViewManagers = MessageViewManagers.INSTANCE;
            val var4: MessageRow = MessageViewManagers.access$convertRowJsonToMessageRow(MessageViewManagers.INSTANCE, var2);
            val var8: MessageFrame = var4.getMessageFrame();
            val var9: MessageFrameType;
            if (var8 != null) {
               var9 = var8.getType();
            } else {
               var9 = null;
            }

            if (var9 === MessageFrameType.MEDIA_VIEWER_MESSAGE_FRAME) {
               ThemeManager.INSTANCE.setDarkThemeOverride();
            }

            val var10: MessageBase = var4.getMessage();
            q.f(var10, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            val var5: Message = var10 as Message;
            val var6: MessageContext = MessageContextKt.getMessageContext(var4);
            val var7: MessageFrame = var4.getMessageFrame();
            val var11: Context = var1.getContext();
            q.g(var11, "getContext(...)");
            DecoratedMessageView.setMessage$default(
               var1, var5, var6, var7, MessageViewManagers.access$getEventHandler(var3, var4, var11), null, null, false, var4.isHighlight(), false, 368, null
            );
            ThemeManager.INSTANCE.clearThemeOverride();
         }
      }

      public companion object {
         public const val NAME: String
      }
   }

   @ReactModule(name = "DCDSystemMessageView")
   public class SystemMessageViewManager : ViewGroupManager<SystemMessageWrapperView>, DCDSystemMessageViewManagerInterface<SystemMessageWrapperView> {
      private final val delegate: DCDSystemMessageViewManagerDelegate<
         SystemMessageWrapperView,
         com.discord.chat.messagemanager.MessageViewManagers.SystemMessageViewManager
      > = new DCDSystemMessageViewManagerDelegate(this)

      protected open fun createViewInstance(reactContext: ThemedReactContext): SystemMessageWrapperView {
         q.h(var1, "reactContext");
         return new SystemMessageWrapperView(var1, null, 2, null);
      }

      protected open fun getDelegate(): DCDSystemMessageViewManagerDelegate<
            SystemMessageWrapperView,
            com.discord.chat.messagemanager.MessageViewManagers.SystemMessageViewManager
         > {
         return this.delegate;
      }

      public open fun getName(): String {
         return "DCDSystemMessageView";
      }

      @ReactProp(name = "row")
      public open fun setRow(view: SystemMessageWrapperView, value: String?) {
         q.h(var1, "view");
         if (var2 != null) {
            val var3: MessageViewManagers = MessageViewManagers.INSTANCE;
            val var7: MessageRow = MessageViewManagers.access$convertRowJsonToMessageRow(MessageViewManagers.INSTANCE, var2);
            val var4: MessageBase = var7.getMessage();
            q.f(var4, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            val var8: Message = var4 as Message;
            val var6: MessageContext = MessageContextKt.getMessageContext(var7);
            val var5: Context = var1.getContext();
            q.g(var5, "getContext(...)");
            var1.setMessage(var8, var6, MessageViewManagers.access$getEventHandler(var3, var7, var5));
         }
      }

      public companion object {
         public const val NAME: String
      }
   }
}
