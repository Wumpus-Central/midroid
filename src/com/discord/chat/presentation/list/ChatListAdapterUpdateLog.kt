package com.discord.chat.presentation.list

import com.discord.chat.presentation.list.ChannelChatListAdapter.PortalViewUpdateType
import java.util.ArrayList
import kotlin.jvm.internal.q

internal object ChatListAdapterUpdateLog {
   private const val MAX_SIZE: Int = 5
   private final val queue: MutableList<ChatListAdapterUpdateLogItem> = new ArrayList()

   private fun addInternal(item: ChatListAdapterUpdateLogItem) {
      val var2: java.util.List = queue;
      queue.add(var1);
      if (var2.size() > 5) {
         var2.remove(0);
      }
   }

   public fun addChatListItemUpdate(chatListItemUpdate: ChatListItemUpdate) {
      q.h(var1, "chatListItemUpdate");
      this.addInternal(new ChatListAdapterUpdateLogItem.ChatList(var1));
   }

   public fun addNoOpDataSetChanged() {
      this.addInternal(ChatListAdapterUpdateLogItem.NoOpDataSetChanged.INSTANCE);
   }

   public fun addPortalRemovalFromChatListItemUpdate() {
      this.addInternal(ChatListAdapterUpdateLogItem.PortalViewRemovalFromChatListItemUpdate.INSTANCE);
   }

   public fun addPortalUpdate(updateType: PortalViewUpdateType) {
      q.h(var1, "updateType");
      this.addInternal(new ChatListAdapterUpdateLogItem.PortalView(var1));
   }

   public override fun toString(): String {
      val var4: java.util.List = queue;
      if (queue.isEmpty()) {
         return "ChatListAdapterUpdateLog: No Chat Updates Processed";
      } else {
         val var1: Boolean = var4.isEmpty();
         var var2: java.lang.String = "";
         var var3: java.lang.String = "";
         if (!var1) {
            val var8: java.util.ListIterator = var4.listIterator(var4.size());

            while (true) {
               var3 = var2;
               if (!var8.hasPrevious()) {
                  break;
               }

               val var7: ChatListAdapterUpdateLogItem = var8.previous() as ChatListAdapterUpdateLogItem;
               val var5: StringBuilder = new StringBuilder();
               var5.append(var2);
               var5.append(var7);
               var5.append("\n");
               var2 = var5.toString();
            }
         }

         val var6: StringBuilder = new StringBuilder();
         var6.append("ChatListAdapterUpdateLog: Most Recent Updates (Most Recent at Top)\n");
         var6.append((Object)var3);
         return var6.toString();
      }
   }
}
