package com.discord.chat.messagemanager

import android.content.Context
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameType
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.row.Row
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.events.CreateChatReactEventsKt
import com.discord.chat.presentation.message.DecoratedMessageView
import com.discord.chat.presentation.message.system.AutomodSystemMessageWrapperView
import com.discord.chat.presentation.message.system.SystemMessageWrapperView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.root.MessageContextKt
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.reactevents.ReactEvents
import com.discord.theme.ThemeManager
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDAutoModerationSystemMessageViewManagerInterface
import com.facebook.react.viewmanagers.DCDMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDMessageViewManagerInterface
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerDelegate
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder

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
            val var5: Message = var10 as Message;
            val var6: MessageContext = MessageContextKt.getMessageContext(var4);
            val var7: MessageFrame = var4.getMessageFrame();
            val var11: Context = var1.getContext();
            r.g(var11, "getContext(...)");
            DecoratedMessageView.setMessage$default(
               var1, var5, var6, var7, MessageViewManagers.access$getEventHandler(var3, var4, var11), this.componentProvider, null, false, false, 224, null
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
}
