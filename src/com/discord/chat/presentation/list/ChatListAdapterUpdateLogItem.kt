package com.discord.chat.presentation.list

import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ListOperation
import com.discord.chat.presentation.list.ChannelChatListAdapter.PortalViewUpdateType
import kh.p
import kotlin.jvm.internal.q

private sealed class ChatListAdapterUpdateLogItem protected constructor() {
   public class ChatList(chatListItemUpdate: ChatListItemUpdate) : ChatListAdapterUpdateLogItem {
      public final val chatListItemUpdate: ChatListItemUpdate

      init {
         q.h(var1, "chatListItemUpdate");
         super(null);
         this.chatListItemUpdate = var1;
      }

      public override fun toString(): String {
         var var13: java.lang.String;
         label37: {
            val var5: java.util.List = this.chatListItemUpdate.getListOperations();
            if (var5 != null) {
               val var4: java.util.Iterator = var5.iterator();
               var var1: Int = 0;

               var var2: java.lang.String;
               for (var2 = ""; var4.hasNext(); var1++) {
                  var13 = (java.lang.String)var4.next();
                  if (var1 < 0) {
                     i.u();
                  }

                  val var6: java.lang.String = ChatListAdapterUpdateLogKt.access$label(var13 as ListOperation);
                  if (var1 != var5.size() - 1) {
                     var13 = "-";
                  } else {
                     var13 = "";
                  }

                  val var7: StringBuilder = new StringBuilder();
                  var7.append(var2);
                  var7.append(var6);
                  var7.append(var13);
                  var2 = var7.toString();
               }

               var13 = var2;
               if (var2 != null) {
                  break label37;
               }
            }

            var13 = "EMPTY";
         }

         var var10: java.lang.String;
         label26: {
            val var9: ChatListAction = this.chatListItemUpdate.getChatListAction();
            if (var9 != null) {
               val var15: java.lang.String = ChatListAdapterUpdateLogKt.access$label(var9);
               var10 = var15;
               if (var15 != null) {
                  break label26;
               }
            }

            var10 = "NoAction";
         }

         var var16: StringBuilder = new StringBuilder();
         var16.append("Actions: ");
         var16.append(var10);
         var10 = var16.toString();
         val var8: Int = this.chatListItemUpdate.getItems().size();
         var16 = new StringBuilder();
         var16.append("Items: ");
         var16.append(var8);
         val var18: java.lang.String = var16.toString();
         var var19: StringBuilder = new StringBuilder();
         var19.append("Operations: ");
         var19.append(var13);
         var13 = var19.toString();
         var19 = new StringBuilder();
         var19.append("ChatList - ");
         var19.append(var10);
         var19.append(", ");
         var19.append(var18);
         var19.append(", ");
         var19.append(var13);
         var19.append(", \n");
         return var19.toString();
      }
   }

   public object NoOpDataSetChanged : ChatListAdapterUpdateLogItem() {
      public override fun toString(): String {
         return "NoOpDataSetChanged";
      }
   }

   public class PortalView(updateType: PortalViewUpdateType) : ChatListAdapterUpdateLogItem {
      public final val updateType: PortalViewUpdateType

      init {
         q.h(var1, "updateType");
         super(null);
         this.updateType = var1;
      }

      public override fun toString(): String {
         val var1: Int = ChatListAdapterUpdateLogItem.PortalView.WhenMappings.$EnumSwitchMapping$0[this.updateType.ordinal()];
         val var4: java.lang.String;
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new p();
               }

               var4 = "PortalViewUpdateType.REMOVE";
            } else {
               var4 = "PortalViewUpdateType.CHANGE";
            }
         } else {
            var4 = "PortalViewUpdateType.ADD";
         }

         val var3: StringBuilder = new StringBuilder();
         var3.append("PortalView - ");
         var3.append(var4);
         return var3.toString();
      }
   }

   public object PortalViewRemovalFromChatListItemUpdate : ChatListAdapterUpdateLogItem() {
      public override fun toString(): String {
         return "PortalViewRemovalFromChatListItemUpdate";
      }
   }
}
