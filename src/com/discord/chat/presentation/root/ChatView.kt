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
import com.discord.crash_reporting.CrashReporting
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import com.facebook.react.views.view.ReactViewGroup
import ht.v
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.flow.Flow

@SourceDebugExtension(["SMAP\nChatView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatView.kt\ncom/discord/chat/presentation/root/ChatView\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,154:1\n14#2,5:155\n14#2,5:160\n14#2,5:165\n*S KotlinDebug\n*F\n+ 1 ChatView.kt\ncom/discord/chat/presentation/root/ChatView\n*L\n50#1:155,5\n55#1:160,5\n65#1:165,5\n*E\n"])
public class ChatView(context: Context) : ReactViewGroup(var1) {
   private final lateinit var chatList: ChatListView
   private final lateinit var eventHandler: ChatEventHandler
   private final var inverted: Boolean

   private fun attachPortalViewToChatList(portalView: View) {
      var1.addOnLayoutChangeListener(new b(var1, this));
      var1.setVisibility(4);
   }

   @JvmStatic
   fun `attachPortalViewToChatList$lambda$5`(
      var0: View, var1: ChatView, var2: View, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int, var10: Int
   ) {
      var var11: Boolean;
      if (var0.getMeasuredHeight() > 0 && var0.getMeasuredWidth() > 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      var var13: java.lang.String = null;
      if (var11) {
         var var18: ChatListView = var1.chatList;
         if (var1.chatList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatList");
            var18 = null;
         }

         if (!var18.isComputingLayout()) {
            label35: {
               if (var0.getMeasuredWidth() == var0.getLayoutParams().width) {
                  var11 = false;
                  if (var0.getMeasuredHeight() == var0.getLayoutParams().height) {
                     break label35;
                  }
               }

               var11 = true;
            }

            val var20: Pair;
            if (var11) {
               var20 = v.a(var0.getMeasuredWidth(), var0.getMeasuredHeight());
            } else {
               var20 = null;
            }

            val var28: CrashReporting = CrashReporting.INSTANCE;
            var4 = var0.getMeasuredWidth();
            var3 = var0.getMeasuredHeight();
            val var29: ViewParent = var0.getParent();
            if (var29 != null) {
               var13 = var29.getClass().getSimpleName();
            }

            val var30: StringBuilder = new StringBuilder();
            var30.append("PortalView will detach from ChatView and portal into ChatListView; measured=");
            var30.append(var4);
            var30.append("x");
            var30.append(var3);
            var30.append(", hasDimChanged=");
            var30.append(var11);
            var30.append(", parent=");
            var30.append(var13);
            CrashReporting.addBreadcrumb$default(var28, var30.toString(), null, null, null, 14, null);
            var1.post(new a(var0, var1, var20));
            return;
         }
      }

      val var19: CrashReporting = CrashReporting.INSTANCE;
      var var17: ChatListView = var1.chatList;
      if (var1.chatList == null) {
         Intrinsics.throwUninitializedPropertyAccessException("chatList");
         var17 = null;
      }

      val var27: Boolean = var17.isComputingLayout();
      var4 = var0.getMeasuredWidth();
      var3 = var0.getMeasuredHeight();
      val var16: StringBuilder = new StringBuilder();
      var16.append("PortalView layout change skipped; valid=");
      var16.append(var11);
      var16.append(", computingLayout=");
      var16.append(var27);
      var16.append(", measured=");
      var16.append(var4);
      var16.append("x");
      var16.append(var3);
      CrashReporting.addBreadcrumb$default(var19, var16.toString(), null, null, null, 14, null);
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmStatic
   fun `attachPortalViewToChatList$lambda$5$lambda$4`(var0: View, var1: ChatView, var2: Pair) {
      var var3: CrashReporting;
      var var5: Pair;
      label46: {
         label50: {
            try {
               if (var0.getParent() is ChatView) {
                  val var12: ViewParent = var0.getParent();
                  (var12 as ViewGroup).removeView(var0);
               }
            } catch (var9: Exception) {
               var3 = CrashReporting.INSTANCE;
               var2 = v.a("portalView", var0.toString());
               var5 = v.a("parent", var0.getParent().toString());
               var10 = var1.chatList;
               if (var1.chatList != null) {
                  break label46;
               }
               break label50;
            }

            try {
               var15 = var1.chatList;
            } catch (var8: Exception) {
               var3 = CrashReporting.INSTANCE;
               var2 = v.a("portalView", var0.toString());
               var5 = v.a("parent", var0.getParent().toString());
               var10 = var1.chatList;
               if (var1.chatList != null) {
                  break label46;
               }
               break label50;
            }

            var var13: ChatListView = var15;
            if (var15 == null) {
               try {
                  Intrinsics.throwUninitializedPropertyAccessException("chatList");
               } catch (var7: Exception) {
                  var3 = CrashReporting.INSTANCE;
                  var2 = v.a("portalView", var0.toString());
                  var5 = v.a("parent", var0.getParent().toString());
                  var10 = var1.chatList;
                  if (var1.chatList != null) {
                     break label46;
                  }
                  break label50;
               }

               var13 = null;
            }

            try {
               var13.setPortalView(var0, var2);
               val var16: CrashReporting = CrashReporting.INSTANCE;
               val var14: StringBuilder = new StringBuilder();
               var14.append("PortalView portaled into ChatListView; measuredDims=");
               var14.append(var2);
               CrashReporting.addBreadcrumb$default(var16, var14.toString(), null, null, null, 14, null);
               return;
            } catch (var6: Exception) {
               var3 = CrashReporting.INSTANCE;
               var2 = v.a("portalView", var0.toString());
               var5 = v.a("parent", var0.getParent().toString());
               var10 = var1.chatList;
               if (var1.chatList != null) {
                  break label46;
               }
            }
         }

         Intrinsics.throwUninitializedPropertyAccessException("chatList");
         var10 = null;
      }

      CrashReporting.addBreadcrumb$default(
         var3,
         "ChatList exception: failed to reparent portalView to ChatListView",
         s0.m(new Pair[]{var2, var5, v.a("chatListView", var10.toString())}),
         null,
         null,
         12,
         null
      );
   }

   public open fun addView(child: View, index: Int, params: LayoutParams?) {
      super.addView(var1, var2, var3);
      if (var2 != 0) {
         if (var2 == 2) {
            this.attachPortalViewToChatList(var1);
         }
      } else if (var1 is ChatListView) {
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
      } else {
         throw new IllegalArgumentException("Failed requirement.");
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
         val var2: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected to be on android main thread. Current: ");
         var3.append(var2);
         throw new IllegalStateException(var3.toString().toString());
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
