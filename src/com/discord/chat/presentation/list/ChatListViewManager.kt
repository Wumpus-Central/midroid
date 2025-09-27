package com.discord.chat.presentation.list

import android.view.View
import com.discord.tti_measurement_view.TTIMeasurementView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.DCDChatListManagerDelegate
import com.facebook.react.viewmanagers.DCDChatListManagerInterface
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "DCDChatList")
@SourceDebugExtension(["SMAP\nChatListViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListViewManager.kt\ncom/discord/chat/presentation/list/ChatListViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"])
public class ChatListViewManager : ViewGroupManager<ChatListView>, DCDChatListManagerInterface<ChatListView> {
   private final val mDelegate: DCDChatListManagerDelegate<ChatListView, ChatListViewManager> = new DCDChatListManagerDelegate(this)

   @JvmStatic
   fun `addView$lambda$3`(var0: TTIMeasurementView, var1: ChatListView): Unit {
      val var2: Function2 = var0.getMeasurementListener();
      if (var2 != null) {
         var2.invoke(var0, (double)System.currentTimeMillis());
      }

      var1.setOnFirstDrawDoneCallback(new w());
      return Unit.a;
   }

   @JvmStatic
   fun `addView$lambda$3$lambda$2`(): Unit {
      return Unit.a;
   }

   public open fun addView(parent: ChatListView, child: View, index: Int) {
      val var4: Boolean = var2 is TTIMeasurementView;
      val var5: TTIMeasurementView = var2 as TTIMeasurementView;
      (var2 as TTIMeasurementView).setMeasurementSent(true);
      var1.setOnFirstDrawDoneCallback(new v(var5, var1));
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChatListView {
      return new ChatListView(var1, null, 0, 6, null);
   }

   protected open fun getDelegate(): DCDChatListManagerDelegate<ChatListView, ChatListViewManager> {
      return this.mDelegate;
   }

   public open fun getName(): String {
      return "DCDChatList";
   }

   public open fun onDropViewInstance(view: ChatListView) {
      var1.cleanup();
      super.onDropViewInstance(var1);
   }

   public companion object {
      public const val NAME: String
   }
}
