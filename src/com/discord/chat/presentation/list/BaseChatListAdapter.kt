package com.discord.chat.presentation.list

import S9.K
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate
import com.discord.chat.presentation.list.delegate.SeparatorDelegate
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.MessageAccessoriesAdapter
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_strings.I18nCache
import com.discord.react_strings.I18nMessage
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager
import j8.s
import j8.w
import java.util.Map.Entry
import k8.q
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope

public open class BaseChatListAdapter(eventHandlerProvider: () -> ChatEventHandler, messageComponentProvider: () -> ComponentProvider)
   : com.hannesdorfmann.adapterdelegates4.c,
   ChatListAdapter {
   internal final var chatListItems: List<ChatListItem>
   public final val delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>

   @JvmStatic
   fun {
      val var1: Pair = w.a(RegularMessageDelegate.class, 50);
      val var0: Int = 25;
      recycledViewPoolSizes = q.l(new Pair[]{var1, w.a(SystemMessageDelegate.class, var0), w.a(SeparatorDelegate.class, var0)});
   }

   init {
      kotlin.jvm.internal.q.h(var1, "eventHandlerProvider");
      kotlin.jvm.internal.q.h(var2, "messageComponentProvider");
      super();
      this.chatListItems = i.k();
      val var3: AdapterDelegatesManager = this.delegatesManager;
      kotlin.jvm.internal.q.g(this.delegatesManager, "delegatesManager");
      this.delegateViewTypes = ChatListAdapterConfiguratorKt.chatListAdapterConfigurator(var3, var1, var2, messageAccessoriesRecycledViewPool);
      this.setHasStableIds(true);
   }

   public fun configureRecycledViewPoolSizes() {
      for (Entry var4 : recycledViewPoolSizes.entrySet()) {
         val var3: Class = var4.getKey() as Class;
         val var1: Int = (var4.getValue() as java.lang.Number).intValue();
         val var5: Int = this.delegateViewTypes.get(var3);
         if (var5 != null) {
            ChatListView.Companion.getSharedPool().setMaxRecycledViews(var5, var1);
         }
      }
   }

   public fun fillAdapter(recyclerView: RecyclerView) {
      kotlin.jvm.internal.q.h(var1, "recyclerView");
      this.configureRecycledViewPoolSizes();
      val var2: java.util.Map = this.delegateViewTypes;
      val var3: RecyclerView.RecycledViewPool = var1.getRecycledViewPool();
      kotlin.jvm.internal.q.g(var3, "getRecycledViewPool(...)");
      ChatListViewFactoryKt.fillChatList(var1, this, var2, var3);
      ChatListViewFactoryKt.fillAccessories(var1, new MessageAccessoriesAdapter(null, 1, null), messageAccessoriesRecycledViewPool);
   }

   public override fun getChatListItem(position: Int): ChatListItem? {
      return i.i0(this.chatListItems, var1) as ChatListItem;
   }

   public override fun getChatListItems(): List<ChatListItem> {
      val var1: Any = this.items;
      kotlin.jvm.internal.q.g(this.items, "items");
      return var1 as MutableList<ChatListItem>;
   }

   public open fun getItemId(position: Int): Long {
      return ((this.items as java.util.List).get(var1) as ChatListItem).getRecyclerItemId();
   }

   public companion object {
      public final val messageAccessoriesRecycledViewPool: AccessoriesViewPool
      public final val recycledViewPoolSizes: Map<out Class<out BaseChatListItemDelegate<out ChatListItem, *>>, Int>

      public fun prefill(context: Context) {
         kotlin.jvm.internal.q.h(var1, "context");
         S9.f.d(kotlinx.coroutines.g.a(K.a()), null, null, new Function2(var1, null) {
            final Context $context;
            int label;

            {
               super(2, var2x);
               this.$context = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$context, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               p8.b.e();
               if (this.label == 0) {
                  s.b(var1);
                  if (ReactAsset.Launch.wasSet(this.$context) && I18nCache.INSTANCE.wasSet(this.$context, I18nMessage.HIGHLIGHT)) {
                     new BaseChatListAdapter(<unrepresentable>.INSTANCE, new Function0(new ComponentProvider(this.$context, true)) {
                        final ComponentProvider $dummyComponentProvider;

                        {
                           super(0);
                           this.$dummyComponentProvider = var1;
                        }

                        public final ComponentProvider invoke() {
                           return this.$dummyComponentProvider;
                        }
                     }).fillAdapter(new RecyclerView(this.$context) {
                        {
                           super(var1);
                           this.setRecycledViewPool(ChatListView.Companion.getSharedPool());
                        }
                     });
                     return Unit.a;
                  } else {
                     return Unit.a;
                  }
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         }, 3, null);
      }
   }
}
