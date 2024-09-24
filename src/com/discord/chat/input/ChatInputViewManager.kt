package com.discord.chat.input

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.net.Uri
import android.view.Window
import com.discord.chat.input.bridge.ChatInputNode
import com.discord.chat.input.events.OnContentSizeChangeEvent
import com.discord.chat.input.events.OnEndBlurEvent
import com.discord.chat.input.events.OnFocusEvent
import com.discord.chat.input.events.OnPasteCommandEvent
import com.discord.chat.input.events.OnPasteImageEvent
import com.discord.chat.input.events.OnRequestSendEvent
import com.discord.chat.input.events.OnSelectionOrTextChangeEvent
import com.discord.chat.input.views.ChatInputRootView
import com.discord.keyboard.KeyboardManager
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDChatInputManagerDelegate
import com.facebook.react.viewmanagers.DCDChatInputManagerInterface
import fl.f
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.b

@ReactModule(name = "DCDChatInput")
public class ChatInputViewManager : ViewGroupManager<ChatInputRootView>, DCDChatInputManagerInterface<ChatInputRootView> {
   private final val delegate: DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager>
   private final val json: Json = b.b(null, <unrepresentable>.INSTANCE, 1, null)
   internal final val reactEvents: ReactEvents

   private fun decodeStyleBlocks(blocks: String): List<ChatInputNode> {
      val var2: Json = this.json;
      this.json.a();
      return var2.b(new f(ChatInputNode.Companion.serializer()), var1) as MutableList<ChatInputNode>;
   }

   public open fun backspace(view: ChatInputRootView) {
      q.h(var1, "view");
      var1.backspace();
   }

   public open fun blur(view: ChatInputRootView) {
      q.h(var1, "view");
      var1.clearInputFocus();
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChatInputRootView {
      q.h(var1, "reactContext");
      val var2: ChatInputRootView = new ChatInputRootView(var1, null, 0, 6, null);
      var2.setListener(new ChatInputRootView.ChatInputListener(this, var1, var2) {
         final ThemedReactContext $reactContext;
         final ChatInputRootView $view;
         final ChatInputViewManager this$0;

         {
            this.this$0 = var1;
            this.$reactContext = var2;
            this.$view = var3;
         }

         @Override
         public void onCommandInserted(java.lang.String var1) {
            q.h(var1, "data");
            this.this$0.getReactEvents$chat_input_release().emitEvent(this.$reactContext, this.$view, new OnPasteCommandEvent(var1));
         }

         @Override
         public void onContentSizeChange(int var1, int var2) {
            this.this$0.getReactEvents$chat_input_release().emitEvent(this.$reactContext, this.$view, new OnContentSizeChangeEvent(var1, var2));
         }

         @Override
         public void onEndBlur(java.lang.String var1) {
            q.h(var1, "text");
            this.this$0.getReactEvents$chat_input_release().emitEvent(this.$reactContext, this.$view, new OnEndBlurEvent(var1));
         }

         @Override
         public void onFocus(int var1, int var2) {
            this.this$0.getReactEvents$chat_input_release().emitEvent(this.$reactContext, this.$view, new OnFocusEvent(var1, var2, 0, 4, null));
         }

         @Override
         public void onImageInserted(Uri var1) {
            q.h(var1, "uri");
            val var4: ReactEvents = this.this$0.getReactEvents$chat_input_release();
            val var5: ThemedReactContext = this.$reactContext;
            val var2: ChatInputRootView = this.$view;
            val var3: java.lang.String = var1.toString();
            q.g(var3, "toString(...)");
            var4.emitEvent(var5, var2, new OnPasteImageEvent(var3, this.$reactContext.getContentResolver().getType(var1)));
         }

         @Override
         public void onRequestSend() {
            this.this$0.getReactEvents$chat_input_release().emitEvent(this.$reactContext, this.$view, new OnRequestSendEvent());
         }

         @Override
         public void onTextOrSelectionChanged(int var1, int var2, java.lang.String var3, java.lang.String var4) {
            q.h(var3, "text");
            q.h(var4, "editId");
            this.this$0.getReactEvents$chat_input_release().emitEvent(this.$reactContext, this.$view, new OnSelectionOrTextChangeEvent(var1, var2, var3, var4));
         }
      });
      KeyboardManager.INSTANCE.addKeyboardListener(var2);
      return var2;
   }

   public open fun focus(view: ChatInputRootView) {
      q.h(var1, "view");
      var1.requestInputFocus();
   }

   protected open fun getDelegate(): DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDChatInput";
   }

   public open fun onDropViewInstance(view: ChatInputRootView) {
      q.h(var1, "view");
      KeyboardManager.INSTANCE.removeKeyboardListener(var1);
   }

   public open fun openCustomKeyboard(view: ChatInputRootView) {
      q.h(var1, "view");
      val var2: Context = var1.getContext();
      q.f(var2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
      val var3: Activity = (var2 as ReactContext).getCurrentActivity();
      if (var3 != null) {
         val var4: Window = var3.getWindow();
         if (var4 != null) {
            KeyboardExtensionsKt.hideKeyboard(var1, var4);
         }
      }
   }

   public open fun openSystemKeyboard(view: ChatInputRootView) {
      q.h(var1, "view");
      val var2: Context = var1.getContext();
      q.f(var2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
      val var3: Activity = (var2 as ReactContext).getCurrentActivity();
      if (var3 != null) {
         val var4: Window = var3.getWindow();
         if (var4 != null) {
            var1.showKeyboard(var4);
         }
      }
   }

   public open fun receiveCommand(view: ChatInputRootView, commandId: String, args: ReadableArray?) {
      q.h(var1, "view");
      q.h(var2, "commandId");
      switch (var2.hashCode()) {
         case -1505238496:
            if (var2.equals("setSelectedRange")) {
               if (var3 == null) {
                  return;
               }

               this.setSelectedRange(var1, var3.getInt(0), var3.getInt(1));
            }
            break;
         case -1482107872:
            if (var2.equals("openSystemKeyboard")) {
               this.openSystemKeyboard(var1);
            }
            break;
         case 3027047:
            if (var2.equals("blur")) {
               this.blur(var1);
            }
            break;
         case 73995964:
            if (var2.equals("updateTextBlocks")) {
               if (var3 == null) {
                  return;
               }

               var2 = var3.getString(0);
               q.g(var2, "getString(...)");
               this.updateTextBlocks(var1, var2, var3.getString(1));
            }
            break;
         case 97604824:
            if (var2.equals("focus")) {
               this.focus(var1);
            }
            break;
         case 448538345:
            if (var2.equals("replaceRange")) {
               if (var3 == null) {
                  return;
               }

               val var4: Int = var3.getInt(0);
               val var5: Int = var3.getInt(1);
               val var6: java.lang.String = var3.getString(2);
               q.g(var6, "getString(...)");
               var2 = var3.getString(3);
               q.g(var2, "getString(...)");
               this.replaceRange(var1, var4, var5, var6, var2, var3.getBoolean(4), var3.getString(5));
            }
            break;
         case 1353507967:
            if (var2.equals("backspace")) {
               this.backspace(var1);
            }
            break;
         case 1520339810:
            if (var2.equals("openCustomKeyboard")) {
               this.openCustomKeyboard(var1);
            }
            break;
         case 1984984239:
            if (var2.equals("setText")) {
               if (var3 == null) {
                  return;
               }

               this.setText(var1, var3.getString(0));
            }
         default:
      }
   }

   public open fun replaceRange(
      view: ChatInputRootView,
      location: Int,
      length: Int,
      text: String,
      styleBlocks: String,
      keepCursorPosition: Boolean,
      editId: String?
   ) {
      q.h(var1, "view");
      q.h(var4, "text");
      q.h(var5, "styleBlocks");
      var1.replaceRange(var2, var3, var4, this.decodeStyleBlocks(var5), var6, var7);
   }

   @ReactProp(name = "editable")
   public open fun setEditable(view: ChatInputRootView, editable: Boolean) {
      q.h(var1, "view");
      var1.setEditTextEnabled(var2);
   }

   @ReactProp(name = "keyboardAppearance")
   public open fun setKeyboardAppearance(view: ChatInputRootView, keyboardAppearance: Int) {
      q.h(var1, "view");
   }

   @ReactProp(name = "keyboardType")
   public open fun setKeyboardType(view: ChatInputRootView, keyboardType: String?) {
      q.h(var1, "view");
   }

   @ReactProp(name = "markAsSpoilerTitle")
   public open fun setMarkAsSpoilerTitle(view: ChatInputRootView, spoilerTitle: String?) {
      q.h(var1, "view");
   }

   @ReactProp(name = "placeholder")
   public open fun setPlaceholder(view: ChatInputRootView, placeholder: String?) {
      q.h(var1, "view");
      var1.setHint(var2);
   }

   @ReactProp(name = "placeholderColor")
   public open fun setPlaceholderColor(view: ChatInputRootView, placeholderColor: String?) {
      q.h(var1, "view");
      var1.setHintTextColor(Color.parseColor(var2));
   }

   public open fun setSelectedRange(view: ChatInputRootView, location: Int, length: Int) {
      q.h(var1, "view");
      var1.setSelection(var2, var3 + var2);
   }

   @ReactProp(name = "selectionColor")
   public open fun setSelectionColor(view: ChatInputRootView, selectionColor: String?) {
      q.h(var1, "view");
   }

   @ReactProp(name = "shouldShowCursor")
   public open fun setShouldShowCursor(view: ChatInputRootView, shouldShowCursor: Boolean) {
      q.h(var1, "view");
      var1.setCursorVisible(var2);
   }

   public open fun setText(view: ChatInputRootView, text: String?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setText(var2);
         ChatInputRootView.setSelection$default(var1, var2.length(), 0, 2, null);
      }
   }

   @ReactProp(name = "textColor")
   public open fun setTextColor(view: ChatInputRootView, textColor: String?) {
      q.h(var1, "view");
      var1.setTextColor(Color.parseColor(var2));
   }

   public open fun updateTextBlocks(view: ChatInputRootView, blocks: String, editId: String?) {
      q.h(var1, "view");
      q.h(var2, "blocks");
      var var4: java.lang.String = var3;
      if (var3 == null) {
         var4 = "";
      }

      var1.clearAndApplyChatNodes(var4, this.decodeStyleBlocks(var2));
   }

   public companion object {
      private const val COMMAND_BACKSPACE: String
      private const val COMMAND_BLUR: String
      private const val COMMAND_FOCUS: String
      private const val COMMAND_OPEN_CUSTOM_KEYBOARD: String
      private const val COMMAND_OPEN_SYSTEM_KEYBOARD: String
      private const val COMMAND_REPLACE_RANGE: String
      private const val COMMAND_SET_SELECTED_RANGE: String
      private const val COMMAND_SET_TEXT: String
      private const val COMMAND_UPDATE_TEXT_BLOCKS: String
      public const val NAME: String
   }
}
