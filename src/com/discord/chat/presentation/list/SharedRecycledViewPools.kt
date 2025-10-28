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

   public final val chatListViewPool: NoneClearingRecycledViewPool by Ja.l.b(new A())
      public final get() {
         return chatListViewPool$delegate.getValue() as NoneClearingRecycledViewPool;
      }


   public final val accessoriesViewPool: AccessoriesViewPool by Ja.l.b(new B())
      public final get() {
         return accessoriesViewPool$delegate.getValue() as AccessoriesViewPool;
      }


   @JvmStatic
   fun {
      val var0: Pair = Ja.v.a(RegularMessageDelegate.class, 50);
      val var1: Int = 25;
      recycledViewPoolSizes = O.m(new Pair[]{var0, Ja.v.a(SystemMessageDelegate.class, var1), Ja.v.a(SeparatorDelegate.class, var1)});
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
