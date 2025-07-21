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
import com.discord.chat.presentation.message.system.AutomodSystemMessageWrapperView
import com.discord.chat.presentation.message.system.SystemMessageWrapperView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
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
import com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerInterface
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerDelegate
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerInterface
import com.facebook.react.viewmanagers.DCDMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDMessageViewManagerInterface
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import z9.s

public object MessageViewManagers {
   private final val json: Json = kotlinx.serialization.json.b.b(null, new b(), 1, null)
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
      r.f(var3, "null cannot be cast to non-null type com.discord.chat.bridge.row.MessageRow");
      return var3 as MessageRow;
   }

   private fun MessageRow.getEventHandler(context: Context): ChatEventHandler {
      val var3: Any;
      if (var1.getReactTag() != null) {
         var3 = new ChatViewEventHandler(var2, reactEvents, new a(var1));
      } else {
         var3 = ChatEventHandler.Empty.INSTANCE;
      }

      return (ChatEventHandler)var3;
   }

   @JvmStatic
   fun `getEventHandler$lambda$2`(var0: MessageRow): Int {
      return var0.getReactTag();
   }

   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      r.h(var0, "$this$Json");
      var0.c(true);
      return Unit.a;
   }

   @ReactModule(name = "DCDAutoModerationSystemMessageView")
   public class AutoModerationSystemMessageViewManager
      : ViewGroupManager<AutomodSystemMessageWrapperView>,
      DCDAutoModerationSystemMessageViewManagerInterface<AutomodSystemMessageWrapperView> {
      private final val delegate: DCDAutoModerationSystemMessageViewManagerDelegate<
         AutomodSystemMessageWrapperView,
         com.discord.chat.messagemanager.MessageViewManagers.AutoModerationSystemMessageViewManager
      > = new DCDAutoModerationSystemMessageViewManagerDelegate(this)

      protected open fun createViewInstance(reactContext: ThemedReactContext): AutomodSystemMessageWrapperView {
         r.h(var1, "reactContext");
         return new AutomodSystemMessageWrapperView(var1, null, 2, null);
      }

      protected open fun getDelegate(): DCDAutoModerationSystemMessageViewManagerDelegate<
            AutomodSystemMessageWrapperView,
            com.discord.chat.messagemanager.MessageViewManagers.AutoModerationSystemMessageViewManager
         > {
         return this.delegate;
      }

      public open fun getName(): String {
         return "DCDAutoModerationSystemMessageView";
      }

      @ReactProp(name = "row")
      public open fun setRow(view: AutomodSystemMessageWrapperView, value: String?) {
         r.h(var1, "view");
         if (var2 != null) {
            val var3: MessageViewManagers = MessageViewManagers.INSTANCE;
            val var7: MessageRow = MessageViewManagers.access$convertRowJsonToMessageRow(MessageViewManagers.INSTANCE, var2);
            val var4: MessageBase = var7.getMessage();
            r.f(var4, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            val var8: Message = var4 as Message;
            val var6: MessageContext = MessageContextKt.getMessageContext(var7);
            val var5: Context = var1.getContext();
            r.g(var5, "getContext(...)");
            var1.setMessage(var8, var6, MessageViewManagers.access$getEventHandler(var3, var7, var5));
         }
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
      private final val reactEvents: ReactEvents =
         new ReactEvents(
            s.a("onTapItem", H.b(OnTapMessageBundleItemData.class)),
            s.a("onLongPressItem", H.b(OnLongPressMessageBundleItemData.class)),
            s.a("onTruncateMessage", H.b(OnTruncateMessageData.class)),
            s.a("onTapReplyItem", H.b(OnTapReplyItemData.class)),
            s.a("onTapViewMoreText", H.b(OnTapViewMoreTextData.class))
         )
         private final val messageRowViewPool: RecycledViewPool
      private final val messageAccessoriesViewPool: AccessoriesViewPool

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
         var0.emitOnTapItem(var1);
      }

      @JvmStatic
      fun `setData$lambda$6$lambda$4`(var0: MessageViewManagers.MessageBundleViewManager, var1: MessageBundleView, var2: View): Boolean {
         return var0.emitOnLongPressItem(var1);
      }

      @JvmStatic
      fun `setData$lambda$6$lambda$5`(var0: MessageViewManagers.MessageBundleViewManager, var1: MessageBundleView, var2: View) {
         var0.emitOnTapViewMoreText(var1);
      }

      protected open fun createViewInstance(reactContext: ThemedReactContext): MessageBundleView {
         r.h(var1, "reactContext");
         val var2: MessageBundleView = new MessageBundleView(var1, null, 0, 6, null);
         var2.setMessageRowViewPool(this.messageRowViewPool);
         var2.setMessageAccessoriesViewPool(this.messageAccessoriesViewPool);
         var2.setOnTruncateMessage(new Function1(this, var2) {
            final MessageBundleView $view;
            final MessageViewManagers.MessageBundleViewManager this$0;

            {
               this.this$0 = var1;
               this.$view = var2;
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               r.h(var1, "messageId");
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
         r.h(var1, "view");
         if (var2 != null) {
            val var3: Json = MessageViewManagers.access$getJson$p();
            var3.a();
            var1.setBundle(
               var3.b(MessageBundleView.MessageBundle.Companion.serializer(), var2) as MessageBundleView.MessageBundle,
               new c(this, var1),
               new d(this, var1),
               new Function1(this, var1) {
                  final MessageBundleView $view;
                  final MessageViewManagers.MessageBundleViewManager this$0;

                  {
                     this.this$0 = var1;
                     this.$view = var2;
                  }

                  public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                     r.h(var1, "messageId");
                     MessageViewManagers.MessageBundleViewManager.access$emitOnTapReply-Ayv7vGE(this.this$0, this.$view, var1);
                  }
               },
               new e(this, var1)
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
         private final var componentProvider: ComponentProvider?

      protected open fun createViewInstance(reactContext: ThemedReactContext): DecoratedMessageView {
         r.h(var1, "reactContext");
         if (this.componentProvider != null) {
            val var3: Context;
            if (this.componentProvider != null) {
               var3 = this.componentProvider.getContext();
            } else {
               var3 = null;
            }

            if (r.c(var3, var1)) {
               return new DecoratedMessageView(var1, null, 2, null);
            }
         }

         this.componentProvider = new ComponentProvider(var1, false);
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
         r.h(var1, "view");
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
            r.f(var10, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            val var11: Message = var10 as Message;
            val var6: MessageContext = MessageContextKt.getMessageContext(var4);
            val var5: MessageFrame = var4.getMessageFrame();
            val var7: Context = var1.getContext();
            r.g(var7, "getContext(...)");
            DecoratedMessageView.setMessage$default(
               var1, var11, var6, var5, MessageViewManagers.access$getEventHandler(var3, var4, var7), this.componentProvider, null, false, false, 224, null
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
         r.h(var1, "reactContext");
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
         r.h(var1, "view");
         if (var2 != null) {
            val var3: MessageViewManagers = MessageViewManagers.INSTANCE;
            val var7: MessageRow = MessageViewManagers.access$convertRowJsonToMessageRow(MessageViewManagers.INSTANCE, var2);
            val var4: MessageBase = var7.getMessage();
            r.f(var4, "null cannot be cast to non-null type com.discord.chat.bridge.Message");
            val var6: Message = var4 as Message;
            val var8: MessageContext = MessageContextKt.getMessageContext(var7);
            val var5: Context = var1.getContext();
            r.g(var5, "getContext(...)");
            var1.setMessage(var6, var8, MessageViewManagers.access$getEventHandler(var3, var7, var5));
         }
      }

      public companion object {
         public const val NAME: String
      }
   }
}
