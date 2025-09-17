package com.discord.chat.listmanager

import F9.b
import cb.K
import cb.f
import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.row.BlockedGroupContent
import com.discord.chat.bridge.row.BlockedGroupRow
import com.discord.chat.bridge.row.DeleteRow
import com.discord.chat.bridge.row.LoadingActionType
import com.discord.chat.bridge.row.LoadingRow
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.row.MessageRowKt
import com.discord.chat.bridge.row.Row
import com.discord.chat.bridge.row.SeparatorRow
import com.discord.chat.bridge.row.SeparatorRowKt
import com.discord.chat.bridge.scroll.ChatScrollData
import com.discord.chat.bridge.scroll.ChatScrollType
import com.discord.chat.bridge.spoiler.SpoilerManager
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem
import com.discord.chat.presentation.list.item.LoadingChatListItem
import com.discord.chat.presentation.root.MessageContext
import eb.a
import fb.t
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

@SourceDebugExtension(["SMAP\nChatListManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListManager.kt\ncom/discord/chat/listmanager/ChatListManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1557#2:247\n1628#2,3:248\n1755#2,3:251\n774#2:254\n865#2,2:255\n1863#2,2:257\n774#2:259\n865#2,2:260\n1863#2,2:262\n1557#2:264\n1628#2,3:265\n*S KotlinDebug\n*F\n+ 1 ChatListManager.kt\ncom/discord/chat/listmanager/ChatListManager\n*L\n65#1:247\n65#1:248,3\n82#1:251,3\n103#1:254\n103#1:255,2\n104#1:257,2\n112#1:259\n112#1:260,2\n114#1:262,2\n211#1:264\n211#1:265,3\n*E\n"])
public class ChatListManager(coroutineScope: CoroutineScope) {
   private final val updatesFlow: MutableSharedFlow<ChatListUpdate> = t.a(1, 3, a.d)
   private final var rows: MutableList<Row>?
   private final var isDisabled: Boolean
   private final val publishScope: CoroutineScope

   init {
      this.publishScope = g.j(var1, K.a());
   }

   private fun createNewRows(updates: List<Row>): com.discord.chat.listmanager.ChatListManager.RowsModificationResult {
      val var3: Boolean = false;
      var var2: Boolean;
      if (var1 != null && var1.isEmpty()) {
         var2 = false;
      } else {
         val var4: java.util.Iterator = var1.iterator();

         while (true) {
            var2 = var3;
            if (!var4.hasNext()) {
               break;
            }

            if ((var4.next() as Row).getChangeType() === ChangeType.DELETE) {
               var2 = true;
               break;
            }
         }
      }

      if (!var2) {
         this.rows = CollectionsKt.V0(var1);
         return new ChatListManager.RowsModificationResult(var1, true, null);
      } else {
         throw new IllegalArgumentException("Deletes are not expected or allowed during syncs.");
      }
   }

   private fun MutableList<Row>.insert(row: Row) {
      if (var2 !is DeleteRow) {
         var1.add(var2.getIndex(), var2);
      } else {
         throw new IllegalStateException("Unexpected delete during insert.");
      }
   }

   private fun modifyExistingRows(updates: List<Row>): com.discord.chat.listmanager.ChatListManager.RowsModificationResult {
      val var6: java.util.List = this.rows;
      val var5: ListOperationsBuilder = new ListOperationsBuilder();
      var var7: ArrayList = new ArrayList();

      for (Object var9 : var1) {
         if ((var9 as Row).getChangeType() === ChangeType.INSERT) {
            var7.add(var9);
         }
      }

      val var16: java.util.Iterator = var7.iterator();

      label75:
      while (true) {
         var var4: Boolean;
         for (var4 = false; var16.hasNext(); var4 = true) {
            val var12: Row = var16.next() as Row;
            this.insert(var6, var12);
            var5.add(new ListOperation.Insert(var12.getIndex()));
            if (!var4 && var12.getIndex() != 0) {
               continue label75;
            }
         }

         var7 = new ArrayList();

         for (Object var10 : var1) {
            if ((var10 as Row).getChangeType() === ChangeType.DELETE || (var10 as Row).getChangeType() === ChangeType.UPDATE) {
               var7.add(var10);
            }
         }

         for (Row var14 : CollectionsKt.O(var7)) {
            if (var14 is DeleteRow) {
               val var15: DeleteRow = var14 as DeleteRow;
               var6.remove((var14 as DeleteRow).getIndex());
               var5.add(new ListOperation.Remove(var15.getIndex()));
            } else {
               var var2: Boolean;
               label52:
               if (var14 is LoadingRow
                  && (var14 as LoadingRow).getButton().getAction().getType() === LoadingActionType.LOAD_MORE_AFTER
                  && (var14 as LoadingRow).getIndex() == 0) {
                  var2 = true;
                  break label52;
               } else {
                  var2 = false;
               }

               val var19: Row = CollectionsKt.h0(var6) as Row;
               val var3: Boolean;
               if (var19 is LoadingRow && (var19 as LoadingRow).isLoading()) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               if (var2 && var3) {
                  var6.add(1, var14);
                  var6.remove(0);
                  var5.add(new ListOperation.Insert(1));
                  var5.add(new ListOperation.Remove(0));
               } else {
                  var6.set(var14.getIndex(), var14);
                  var5.add(new ListOperation.Change(var14.getIndex()));
               }
            }
         }

         return new ChatListManager.RowsModificationResult(var6, var4, var5.build());
      }
   }

   private fun publishUpdate(update: ChatListUpdate) {
      f.d(this.publishScope, null, null, new Function2<CoroutineScope, Continuation, Object>(this, var1, null) {
         final ChatListUpdate $update;
         int label;
         final ChatListManager this$0;

         {
            super(2, var3);
            this.this$0 = var1;
            this.$update = var2x;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, this.$update, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               c.b(var1);
            } else {
               c.b(var1);
               val var4: MutableSharedFlow = ChatListManager.access$getUpdatesFlow$p(this.this$0);
               var1 = this.$update;
               this.label = 1;
               if (var4.emit(var1, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 3, null);
   }

   private fun Row.toChatListItem(): ChatListItem {
      val var9: Any;
      if (var1 is MessageRow) {
         var9 = MessageRowKt.toChatListMessageItem(var1 as MessageRow);
      } else if (var1 is LoadingRow) {
         var9 = new LoadingChatListItem((var1 as LoadingRow).getButton(), (var1 as LoadingRow).isLoading());
      } else if (var1 is SeparatorRow) {
         var9 = SeparatorRowKt.toSeparatorChatListItem(var1 as SeparatorRow);
      } else {
         if (var1 !is BlockedGroupRow) {
            throw new IllegalStateException("Unknown row type.");
         }

         val var11: BlockedGroupRow = var1 as BlockedGroupRow;
         val var8: java.lang.String = (var1 as BlockedGroupRow).getText();
         val var7: java.lang.String = (var1 as BlockedGroupRow).getButton().getAction().getContext();
         val var2: Int = var11.getColor();
         val var4: Int = var11.getBackgroundColor();
         val var3: Int = var11.getBorderColor();
         val var5: Boolean = var11.getRevealed();
         val var6: java.util.List = var11.getContent();
         var var12: java.util.List = var6;
         if (var6 == null) {
            var12 = CollectionsKt.k();
         }

         val var14: ArrayList = new ArrayList(CollectionsKt.v(var12, 10));
         val var13: java.util.Iterator = var12.iterator();

         while (var13.hasNext()) {
            var14.add(
               MessageRowKt.toChatListMessageItem$default(
                  (var13.next() as BlockedGroupContent).getMessage(),
                  null,
                  new MessageContext(false, false, null, null, null, false, null, true, false, false, false, null, null, 8063, null),
                  false,
                  false,
                  null,
                  null,
                  61,
                  null
               )
            );
         }

         var9 = new BlockedGroupChatListItem(var8, var7, var2, var4, var3, var5, CollectionsKt.O(var14));
      }

      return (ChatListItem)var9;
   }

   public fun clearRows(changesetUpdateId: Int) {
      if (this.rows != null && !this.rows.isEmpty()) {
         SpoilerManager.INSTANCE.reset();
         this.publishUpdate(new ChatListUpdate(CollectionsKt.k(), ChatListAction.Clear.INSTANCE, null, var1));
      }

      this.rows = null;
   }

   public fun getRowCount(): Int {
      val var1: Int;
      if (this.rows != null) {
         var1 = this.rows.size();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public fun handleError(errorJson: String, causeMessage: String, changesetUpdateId: Int) {
      this.publishUpdate(
         new ChatListUpdate(
            CollectionsKt.q(new DeserializationErrorChatListItem[]{new DeserializationErrorChatListItem("error-id", var1, var2)}),
            ChatListAction.Noop.INSTANCE,
            null,
            var3
         )
      );
      this.isDisabled = true;
   }

   public fun observeUpdates(): Flow<ChatListUpdate> {
      return this.updatesFlow;
   }

   public fun updateRows(updates: List<Row>, scrollData: ChatScrollData?, changesetUpdateId: Int) {
      if (!this.isDisabled) {
         val var7: ChatListManager.RowsModificationResult;
         if (this.rows != null) {
            var7 = this.modifyExistingRows(var1);
         } else {
            var7 = this.createNewRows(var1);
         }

         val var6: java.util.List = var7.component1();
         val var4: Boolean = var7.component2();
         val var5: java.util.List = var7.component3();
         var var8: Any;
         if (var2 != null && var2.getType() === ChatScrollType.SCROLL) {
            var8 = new ChatListAction.ScrollTo(var2.getIndex(), var2.getAnimate(), var2.getHighlight());
         } else {
            var8 = null;
         }

         val var9: ArrayList = new ArrayList(CollectionsKt.v(var6, 10));
         val var10: java.util.Iterator = var6.iterator();

         while (var10.hasNext()) {
            var9.add(this.toChatListItem(var10.next() as Row));
         }

         if (var8 == null) {
            if (var4) {
               var8 = ChatListAction.StickToBottomIfAtBottom.INSTANCE;
            } else {
               var8 = ChatListAction.Noop.INSTANCE;
            }
         }

         this.publishUpdate(new ChatListUpdate(var9, (ChatListAction)var8, var5, var3));
      }
   }

   private data class RowsModificationResult(rows: List<Row>, didInsertAtBottom: Boolean, listOperations: List<ListOperation>?) {
      public final val rows: List<Row>
      public final val didInsertAtBottom: Boolean
      public final val listOperations: List<ListOperation>?

      init {
         this.rows = var1;
         this.didInsertAtBottom = var2;
         this.listOperations = var3;
      }

      public operator fun component1(): List<Row> {
         return this.rows;
      }

      public operator fun component2(): Boolean {
         return this.didInsertAtBottom;
      }

      public operator fun component3(): List<ListOperation>? {
         return this.listOperations;
      }

      public fun copy(
         rows: List<Row> = var0.rows,
         didInsertAtBottom: Boolean = var0.didInsertAtBottom,
         listOperations: List<ListOperation>? = var0.listOperations
      ): com.discord.chat.listmanager.ChatListManager.RowsModificationResult {
         return new ChatListManager.RowsModificationResult(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ChatListManager.RowsModificationResult) {
            return false;
         } else {
            var1 = var1;
            if (!(this.rows == var1.rows)) {
               return false;
            } else if (this.didInsertAtBottom != var1.didInsertAtBottom) {
               return false;
            } else {
               return this.listOperations == var1.listOperations;
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.rows.hashCode();
         val var3: Int = java.lang.Boolean.hashCode(this.didInsertAtBottom);
         val var1: Int;
         if (this.listOperations == null) {
            var1 = 0;
         } else {
            var1 = this.listOperations.hashCode();
         }

         return (var2 * 31 + var3) * 31 + var1;
      }

      public override fun toString(): String {
         val var4: java.util.List = this.rows;
         val var1: Boolean = this.didInsertAtBottom;
         val var2: java.util.List = this.listOperations;
         val var3: StringBuilder = new StringBuilder();
         var3.append("RowsModificationResult(rows=");
         var3.append(var4);
         var3.append(", didInsertAtBottom=");
         var3.append(var1);
         var3.append(", listOperations=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
