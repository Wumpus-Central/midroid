package com.discord.chat.presentation.list

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ListOperation
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.LoadingChatListItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.list.item.PortalViewChatListItem
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.logging.Log
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.tti_measurement_view.FirstDrawDoneListener
import java.util.LinkedList
import java.util.Queue
import java.util.UUID
import kotlin.coroutines.Continuation
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

@SourceDebugExtension(["SMAP\nChannelChatListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelChatListAdapter.kt\ncom/discord/chat/presentation/list/ChannelChatListAdapter\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n14#2,5:251\n14#2,5:264\n14#2,5:269\n14#2,5:274\n388#3,7:256\n1863#3,2:279\n1#4:263\n*S KotlinDebug\n*F\n+ 1 ChannelChatListAdapter.kt\ncom/discord/chat/presentation/list/ChannelChatListAdapter\n*L\n40#1:251,5\n97#1:264,5\n108#1:269,5\n129#1:274,5\n66#1:256,7\n165#1:279,2\n*E\n"])
public class ChannelChatListAdapter(doLayout: () -> Unit,
   eventHandlerProvider: () -> ChatEventHandler,
   messageComponentProvider: () -> ComponentProvider,
   onFirstDraw: () -> Unit = new b()
) : BaseChatListAdapter(var2, var3) {
   public final val doLayout: () -> Unit
   public final var onFirstDraw: () -> Unit
   private final var portalChatListItem: PortalViewChatListItem?
   private final var firstMessageItemPosition: Int
   private final val updateQueue: Queue<ChannelChatListAdapterUpdate>
   private final var isProcessingUpdate: Boolean
   private final var processNextUpdateJob: Job?
   private final var updateCount: Int
   private final var reportedFirstDrawYet: Boolean

   init {
      this.doLayout = var1;
      this.onFirstDraw = var4;
      this.firstMessageItemPosition = -1;
      this.updateQueue = new LinkedList<>();
   }

   @JvmStatic
   fun `_init_$lambda$0`(): Unit {
      return Unit.a;
   }

   private fun enqueueUpdate(update: ChannelChatListAdapterUpdate) {
      if (!ThreadUtilsKt.isOnMainThread()) {
         val var5: Thread = Thread.currentThread();
         val var4: StringBuilder = new StringBuilder();
         var4.append("Expected to be on android main thread. Current: ");
         var4.append(var5);
         throw new IllegalStateException(var4.toString().toString());
      } else {
         access$getUpdateQueue$p(this).add(var1);
         if (access$getUpdateQueue$p(this).size() == 1 && !access$isProcessingUpdate$p(this)) {
            access$processNextUpdate(this);
         } else if (!access$getUpdateQueue$p(this).isEmpty() && !access$isProcessingUpdate$p(this)) {
            val var2: Log = Log.INSTANCE;
            val var3: java.lang.String = access$getLOGGING_TAG$cp();
            Log.w$default(var2, var3, "Skipped a chat list update. adapter may be frozen.", null, 4, null);
         }
      }
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$11`(var0: ChannelChatListAdapter) {
      var0.onFirstDraw.invoke();
   }

   @SuppressLint(["NotifyDataSetChanged"])
   private fun processChatListItemUpdate(update: ChatListItemUpdate) {
      var var2: Boolean;
      var var6: java.util.List;
      label64: {
         var6 = var1.getItems();
         var var5: Any = this.items;
         if (this.items != null) {
            if (!(var5 as java.util.Collection).isEmpty()) {
               var5 = this.items;
               if (CollectionsKt.r0(var5 as java.util.List) is PortalViewChatListItem && this.portalChatListItem != null) {
                  var2 = true;
                  break label64;
               }
            }
         }

         var2 = false;
      }

      var var3: Boolean = false;
      if (var2) {
         var3 = false;
         if (CollectionsKt.t0(var6) !is LoadingChatListItem) {
            var3 = true;
         }
      }

      var var9: java.util.List = var6;
      if (var3) {
         val var10: PortalViewChatListItem = this.portalChatListItem;
         var9 = CollectionsKt.B0(var6, var10);
      }

      this.setChatListItems$chat_release(var9);
      super.setItems(this.getChatListItems$chat_release());
      if (var2 && !var3) {
         ChatListAdapterUpdateLog.INSTANCE.addPortalRemovalFromChatListItemUpdate();
         this.notifyDataSetChanged();
      } else if (var1.getListOperations() != null) {
         ChatListAdapterUpdateLog.INSTANCE.addChatListItemUpdate(var1);

         for (ListOperation var11 : var1.getListOperations()) {
            if (var11 is ListOperation.Change) {
               this.notifyItemChanged((var11 as ListOperation.Change).getIndex());
            } else if (var11 is ListOperation.Insert) {
               this.notifyItemInserted((var11 as ListOperation.Insert).getIndex());
            } else if (var11 is ListOperation.Remove) {
               this.notifyItemRemoved((var11 as ListOperation.Remove).getIndex());
            } else if (var11 is ListOperation.ChangeRange) {
               this.notifyItemRangeChanged((var11 as ListOperation.ChangeRange).getFirst(), (var11 as ListOperation.ChangeRange).getCount());
            } else if (var11 is ListOperation.InsertRange) {
               this.notifyItemRangeInserted((var11 as ListOperation.InsertRange).getFirst(), (var11 as ListOperation.InsertRange).getCount());
            } else {
               if (var11 !is ListOperation.RemoveRange) {
                  throw new B9.n();
               }

               this.notifyItemRangeRemoved((var11 as ListOperation.RemoveRange).getFirst(), (var11 as ListOperation.RemoveRange).getCount());
            }
         }
      } else {
         ChatListAdapterUpdateLog.INSTANCE.addNoOpDataSetChanged();
         this.notifyDataSetChanged();
      }
   }

   private fun processNextUpdate() {
      if (ThreadUtilsKt.isOnMainThread()) {
         if (!access$getUpdateQueue$p(this).isEmpty()) {
            val var3: Any = access$getUpdateQueue$p(this).remove();
            access$processUpdate(this, var3 as ChannelChatListAdapterUpdate);
         }
      } else {
         val var1: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var1);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   private fun processPortalViewUpdate(update: PortalViewUpdate) {
      val var3: Boolean = CollectionsKt.t0(this.getChatListItems$chat_release()) is PortalViewChatListItem;
      var var2: Boolean;
      if (var1.getPortalChatListItem() != null) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      val var4: ChannelChatListAdapter.PortalViewUpdateType;
      if (var2 && !var3) {
         var4 = ChannelChatListAdapter.PortalViewUpdateType.ADD;
      } else if (var2 && var3) {
         var4 = ChannelChatListAdapter.PortalViewUpdateType.CHANGE;
      } else {
         if (var2 || !var3) {
            return;
         }

         var4 = ChannelChatListAdapter.PortalViewUpdateType.REMOVE;
      }

      ChatListAdapterUpdateLog.INSTANCE.addPortalUpdate(var4);
      val var6: IntArray = ChannelChatListAdapter.WhenMappings.$EnumSwitchMapping$0;
      var2 = ChannelChatListAdapter.WhenMappings.$EnumSwitchMapping$0[var4.ordinal()];
      val var8: java.util.List;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               throw new B9.n();
            }

            val var5: java.util.List = CollectionsKt.V0(this.getChatListItems$chat_release());
            var2 = CollectionsKt.m(this.getChatListItems$chat_release());
            val var7: PortalViewChatListItem = var1.getPortalChatListItem();
            var5.set(var2, var7);
            var8 = var5;
         } else {
            var8 = CollectionsKt.a0(this.getChatListItems$chat_release(), 1);
         }
      } else {
         val var13: java.util.List = this.getChatListItems$chat_release();
         val var9: PortalViewChatListItem = var1.getPortalChatListItem();
         var8 = CollectionsKt.B0(var13, var9);
      }

      this.setChatListItems$chat_release(var8);
      super.setItems(this.getChatListItems$chat_release());
      var2 = var6[var4.ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               throw new B9.n();
            }

            this.notifyItemChanged(CollectionsKt.m(this.getChatListItems$chat_release()));
         } else {
            this.notifyItemRemoved(CollectionsKt.m(this.getChatListItems$chat_release()) + 1);
         }
      } else {
         this.notifyItemInserted(CollectionsKt.m(this.getChatListItems$chat_release()));
      }
   }

   @SuppressLint(["NotifyDataSetChanged"])
   private fun processUpdate(update: ChannelChatListAdapterUpdate) {
      if (ThreadUtilsKt.isOnMainThread()) {
         var var2: Boolean = true;
         access$setProcessingUpdate$p(this, true);
         val var5: Function1 = var1.getPreCommit();
         if (this.getItemCount() != 0) {
            var2 = false;
         }

         var5.invoke(var2);
         if (var1 is PortalViewUpdate) {
            access$processPortalViewUpdate(this, var1 as PortalViewUpdate);
         } else {
            if (var1 !is ChatListItemUpdate) {
               throw new B9.n();
            }

            access$processChatListItemUpdate(this, var1 as ChatListItemUpdate);
         }

         this.getDoLayout().invoke();
         access$syncFirstMessageItemPosition(this);
         var1.getPostCommit().invoke();
         access$setProcessNextUpdateJob$p(this, db.f.d(kotlinx.coroutines.g.b(), null, null, new Function2<CoroutineScope, Continuation, Object>(this, null) {
            int label;
            final ChannelChatListAdapter this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               G9.b.e();
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  ChannelChatListAdapter.access$setProcessingUpdate$p(this.this$0, false);
                  ChannelChatListAdapter.access$processNextUpdate(this.this$0);
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         }, 3, null));
      } else {
         val var4: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected to be on android main thread. Current: ");
         var3.append(var4);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   @JvmStatic
   fun `setItems$lambda$4`(var0: Boolean): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `setItems$lambda$5`(): Unit {
      return Unit.a;
   }

   private fun syncFirstMessageItemPosition() {
      val var4: java.util.List = this.getChatListItems$chat_release();
      val var5: java.util.ListIterator = var4.listIterator(var4.size());

      var var1: Int;
      while (true) {
         if (var5.hasPrevious()) {
            if ((var5.previous() as ChatListItem) !is MessageItem) {
               continue;
            }

            var1 = var5.nextIndex();
            break;
         }

         var1 = -1;
         break;
      }

      if (var1 == -1) {
         var1 = -1;
      }

      this.firstMessageItemPosition = var1;
   }

   public fun getFirstMessageItemPosition(): Int {
      return this.firstMessageItemPosition;
   }

   public open fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any?>) {
      super.onBindViewHolder(var1, var2, var3);
      if (!this.reportedFirstDrawYet && !(this.items as java.util.List).isEmpty()) {
         val var4: ChatListItem = (this.items as java.util.List).get(var2) as ChatListItem;
         if (var4 !is PortalViewChatListItem && var4 !is LoadingChatListItem) {
            this.reportedFirstDrawYet = true;
            FirstDrawDoneListener.registerForNextDraw(var1.itemView, new a(this));
         }
      }
   }

   public fun onHostDetached() {
      if (ThreadUtilsKt.isOnMainThread()) {
         val var3: Job = access$getProcessNextUpdateJob$p(this);
         if (var3 != null) {
            kotlinx.coroutines.Job.a.a(var3, null, 1, null);
         }

         access$setProcessNextUpdateJob$p(this, null);
         access$setProcessingUpdate$p(this, false);
         access$getUpdateQueue$p(this).clear();
      } else {
         val var2: Thread = Thread.currentThread();
         val var1: StringBuilder = new StringBuilder();
         var1.append("Expected to be on android main thread. Current: ");
         var1.append(var2);
         throw new IllegalStateException(var1.toString().toString());
      }
   }

   public open fun setItems(items: List<ChatListItem>) {
      setItems$default(this, var1, null, new c(), new d(), null, 16, null);
   }

   public fun setItems(
      items: List<ChatListItem>,
      listOperations: List<ListOperation>?,
      preCommit: (Boolean) -> Unit,
      postCommit: () -> Unit,
      chatListAction: ChatListAction? = null
   ) {
      val var6: Int = this.updateCount + 1;
      this.updateCount++;
      this.enqueueUpdate(new ChatListItemUpdate(var1, var2, var5, var6, var3, var4));
   }

   public fun setPortalView(portalView: View?, measuredDimensions: Pair<Int, Int>? = null) {
      val var5: PortalViewChatListItem;
      if (var1 != null) {
         val var4: java.lang.String = UUID.randomUUID().toString();
         var5 = new PortalViewChatListItem(var4, var1, var2);
      } else {
         var5 = null;
      }

      this.portalChatListItem = var5;
      val var3: Int = this.updateCount + 1;
      this.updateCount++;
      this.enqueueUpdate(new PortalViewUpdate(var5, var3));
   }

   public companion object {
      private final val LOGGING_TAG: String
   }

   internal enum class PortalViewUpdateType {
      ADD,
      CHANGE,
      REMOVE      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private ChannelChatListAdapter.PortalViewUpdateType[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<ChannelChatListAdapter.PortalViewUpdateType> = $values();
         $VALUES = var0;
         $ENTRIES = H9.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
