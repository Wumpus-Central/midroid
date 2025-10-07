package com.discord.chat.presentation.list

import android.view.View
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate
import com.discord.chat.presentation.list.delegate.SeparatorDelegate
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate
import com.discord.chat.presentation.list.item.ChatListItem
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSharedRecycledViewPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedRecycledViewPools.kt\ncom/discord/chat/presentation/list/SharedRecycledViewPools\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,34:1\n216#2,2:35\n*S KotlinDebug\n*F\n+ 1 SharedRecycledViewPools.kt\ncom/discord/chat/presentation/list/SharedRecycledViewPools\n*L\n24#1:35,2\n*E\n"])
public object SharedRecycledViewPools {
   private final val recycledViewPoolSizes: Map<out Class<out BaseChatListItemDelegate<out ChatListItem, *>>, Int>

   public final val chatListViewPool: NoneClearingRecycledViewPool by B9.j.b(new A())
      public final get() {
         return chatListViewPool$delegate.getValue() as NoneClearingRecycledViewPool;
      }


   public final val accessoriesViewPool: AccessoriesViewPool by B9.j.b(new B())
      public final get() {
         return accessoriesViewPool$delegate.getValue() as AccessoriesViewPool;
      }


   @JvmStatic
   fun {
      val var1: Pair = B9.s.a(RegularMessageDelegate.class, 50);
      val var0: Int = 25;
      recycledViewPoolSizes = L.l(new Pair[]{var1, B9.s.a(SystemMessageDelegate.class, var0), B9.s.a(SeparatorDelegate.class, var0)});
   }

   @JvmStatic
   fun `accessoriesViewPool_delegate$lambda$2`(): AccessoriesViewPool {
      return new AccessoriesViewPool();
   }

   @JvmStatic
   fun `chatListViewPool_delegate$lambda$0`(): NoneClearingRecycledViewPool {
      return new NoneClearingRecycledViewPool();
   }

   public fun configureChatListViewPoolSizes(delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>) {
      for (Entry var6 : recycledViewPoolSizes.entrySet()) {
         var var5: Class = var6.getKey() as Class;
         val var2: Int = (var6.getValue() as java.lang.Number).intValue();
         var5 = (Class)var1.get(var5);
         INSTANCE.getChatListViewPool().setMaxRecycledViews((var5 as java.lang.Number).intValue(), var2);
      }
   }
}
