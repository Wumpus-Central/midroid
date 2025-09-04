package com.discord.chat.presentation.root

import B9.s
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.ChatModule
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListView
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.flow.Flow

@SourceDebugExtension(["SMAP\nChatView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatView.kt\ncom/discord/chat/presentation/root/ChatView\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,129:1\n14#2,5:130\n14#2,5:135\n14#2,5:140\n*S KotlinDebug\n*F\n+ 1 ChatView.kt\ncom/discord/chat/presentation/root/ChatView\n*L\n49#1:130,5\n54#1:135,5\n64#1:140,5\n*E\n"])
public class ChatView(context: Context) : ReactViewGroup(var1) {
   private final lateinit var chatList: ChatListView
   private final lateinit var eventHandler: ChatEventHandler
   private final var inverted: Boolean

   private fun attachPortalViewToChatList(portalView: View) {
      var1.addOnLayoutChangeListener(new a(var1, this));
      var1.setVisibility(4);
   }

   @JvmStatic
   fun `attachPortalViewToChatList$lambda$4`(
      var0: View, var1: ChatView, var2: View, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int, var10: Int
   ) {
      if (var0.getMeasuredHeight() > 0 && var0.getMeasuredWidth() > 0) {
         var var14: ChatListView = var1.chatList;
         if (var1.chatList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatList");
            var14 = null;
         }

         if (!var14.isComputingLayout()) {
            val var15: Pair;
            if (var0.getMeasuredWidth() == var0.getLayoutParams().width && var0.getMeasuredHeight() == var0.getLayoutParams().height) {
               var15 = null;
            } else {
               var15 = s.a(var0.getMeasuredWidth(), var0.getMeasuredHeight());
            }

            if (var0.getParent() is ChatView) {
               val var16: ViewParent = var0.getParent();
               (var16 as ViewGroup).removeView(var0);
            }

            var var13: ChatListView = var1.chatList;
            if (var1.chatList == null) {
               Intrinsics.throwUninitializedPropertyAccessException("chatList");
               var13 = null;
            }

            var13.setPortalView(var0, var15);
         }
      }
   }

   public open fun addView(child: View, index: Int, params: LayoutParams?) {
      super.addView(var1, var2, var3);
      if (var2 != 0) {
         if (var2 == 2) {
            this.attachPortalViewToChatList(var1);
         }
      } else {
         if (var1 !is ChatListView) {
            throw new IllegalArgumentException("Failed requirement.");
         }

         RecyclerViewExtensionsKt.setReactNativeClipToPadding(var1 as RecyclerView);
         val var4: ChatListView = var1 as ChatListView;
         var var5: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var5 = null;
         }

         var4.setEventHandler(var5);
         var4.setInverted(this.inverted);
         var4.setDataSource(new ChatListView.DataSource(this) {
            final ChatView this$0;

            {
               this.this$0 = var1;
            }

            @Override
            public Flow getUpdatesFlow() {
               return ChatModule.Companion.getChatListManager(this.this$0.getId()).observeUpdates();
            }
         });
         this.chatList = var4;
      }
   }

   public fun scrollTo(index: Int, targetScreenLocation: TargetAlignment, animated: Boolean, highlight: Boolean) {
      if (ThreadUtilsKt.isOnMainThread()) {
         val var6: ChatListView = access$getChatList$p(this);
         var var8: ChatListView = var6;
         if (var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatList");
            var8 = null;
         }

         var8.scrollToPosition(var1, var2, var3, var4);
      } else {
         val var5: Thread = Thread.currentThread();
         val var7: StringBuilder = new StringBuilder();
         var7.append("Expected to be on android main thread. Current: ");
         var7.append(var5);
         throw new IllegalStateException(var7.toString().toString());
      }
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setEventHandler$p(this, var1);
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun setInverted(inverted: Boolean) {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setInverted$p(this, var1);
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public companion object {
      private const val INDEX_CHAT_LIST: Int
      private const val INDEX_PORTAL_VIEW: Int
   }
}
