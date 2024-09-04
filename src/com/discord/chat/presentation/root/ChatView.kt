package com.discord.chat.presentation.root

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.ChatModule
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListView
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactContext
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.q
import kotlinx.coroutines.flow.Flow
import lj.w

public class ChatView(context: Context) : ReactViewGroup {
   private final var animatedCustomKeyboardHeight: Int
   private final lateinit var chatList: ChatListView
   private final lateinit var eventHandler: ChatEventHandler
   private final var inverted: Boolean

   init {
      q.h(var1, "context");
      super(var1);
   }

   private fun attachPortalViewToChatList(portalView: View) {
      var1.addOnLayoutChangeListener(new a(var1, this));
      var1.setVisibility(4);
   }

   @JvmStatic
   fun `attachPortalViewToChatList$lambda$6`(
      var0: View, var1: ChatView, var2: View, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int, var10: Int
   ) {
      q.h(var0, "$portalView");
      q.h(var1, "this$0");
      if (var0.getMeasuredHeight() > 0 && var0.getMeasuredWidth() > 0) {
         var var14: ChatListView = var1.chatList;
         if (var1.chatList == null) {
            q.y("chatList");
            var14 = null;
         }

         if (!var14.isComputingLayout()) {
            val var15: Pair;
            if (var0.getMeasuredWidth() == var0.getLayoutParams().width && var0.getMeasuredHeight() == var0.getLayoutParams().height) {
               var15 = null;
            } else {
               var15 = w.a(var0.getMeasuredWidth(), var0.getMeasuredHeight());
            }

            if (var0.getParent() is ChatView) {
               val var16: ViewParent = var0.getParent();
               q.f(var16, "null cannot be cast to non-null type android.view.ViewGroup");
               (var16 as ViewGroup).removeView(var0);
            }

            var var13: ChatListView = var1.chatList;
            if (var1.chatList == null) {
               q.y("chatList");
               var13 = null;
            }

            var13.setPortalView(var0, var15);
         }
      }
   }

   public open fun addView(child: View, index: Int, params: LayoutParams?) {
      q.h(var1, "child");
      super.addView(var1, var2, var3);
      if (var2 != 0) {
         if (var2 == 2) {
            this.attachPortalViewToChatList(var1);
         }
      } else {
         if (var1 !is ChatListView) {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }

         RecyclerViewExtensionsKt.setReactNativeClipToPadding(var1 as RecyclerView);
         val var4: ChatListView = var1 as ChatListView;
         var var5: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            q.y("eventHandler");
            var5 = null;
         }

         var4.setEventHandler(var5);
         var4.setInverted(this.inverted);
         val var6: Context = this.getContext();
         q.f(var6, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
         val var7: NativeModule = (var6 as ReactContext).getNativeModule(ChatModule.class);
         q.e(var7);
         var4.setDataSource(new ChatListView.DataSource(var7 as ChatModule, this) {
            final ChatModule $chatModule;
            final ChatView this$0;

            {
               this.$chatModule = var1;
               this.this$0 = var2;
            }

            @Override
            public Flow getUpdatesFlow() {
               return this.$chatModule.getChatListManager(this.this$0.getId()).observeUpdates();
            }
         });
         this.chatList = var4;
      }
   }

   public fun scrollTo(index: Int, targetScreenLocation: TargetAlignment, animated: Boolean, isHighlight: Boolean) {
      q.h(var2, "targetScreenLocation");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var6: ChatListView = access$getChatList$p(this);
         var var8: ChatListView = var6;
         if (var6 == null) {
            q.y("chatList");
            var8 = null;
         }

         var8.scrollToPosition(var1, var2, var3, var4);
      } else {
         val var7: Thread = Thread.currentThread();
         val var5: StringBuilder = new StringBuilder();
         var5.append("Expected to be on android main thread. Current: ");
         var5.append(var7);
         throw new IllegalStateException(var5.toString().toString());
      }
   }

   public fun setAnimated(animated: Boolean) {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setAreChatAnimationsEnabled$cp(var1);
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun setAnimatedCustomKeyboardHeight(height: Float) {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setAnimatedCustomKeyboardHeight$p(this, SizeUtilsKt.getDpToPx(var1));
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      q.h(var1, "eventHandler");
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

      public final var areChatAnimationsEnabled: Boolean
         internal set
   }
}
