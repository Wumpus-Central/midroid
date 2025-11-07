package com.discord.chat.listmanager

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
import gu.g
import gu.m0
import java.util.ArrayList
import ju.c0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.i
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

@SourceDebugExtension(["SMAP\nChatListManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListManager.kt\ncom/discord/chat/listmanager/ChatListManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1557#2:247\n1628#2,3:248\n1755#2,3:251\n774#2:254\n865#2,2:255\n1863#2,2:257\n774#2:259\n865#2,2:260\n1863#2,2:262\n1557#2:264\n1628#2,3:265\n*S KotlinDebug\n*F\n+ 1 ChatListManager.kt\ncom/discord/chat/listmanager/ChatListManager\n*L\n65#1:247\n65#1:248,3\n82#1:251,3\n103#1:254\n103#1:255,2\n104#1:257,2\n112#1:259\n112#1:260,2\n114#1:262,2\n211#1:264\n211#1:265,3\n*E\n"])
public class ChatListManager(coroutineScope: CoroutineScope) {
   private final val updatesFlow: MutableSharedFlow<ChatListUpdate> = c0.a(1, 3, iu.a.d)
   private final var rows: MutableList<Row>?
   private final var isDisabled: Boolean
   private final val publishScope: CoroutineScope

   init {
      this.publishScope = i.j(var1, m0.a());
   }

   private fun createNewRows(updates: List<Row>): com.discord.chat.listmanager.ChatListManager.RowsModificationResult {
      val var5: java.lang.Iterable = var1;
      val var4: Boolean = var1 is java.util.Collection;
      val var3: Boolean = false;
      var var2: Boolean;
      if (var4 && (var5 as java.util.Collection).isEmpty()) {
         var2 = false;
      } else {
         val var6: java.util.Iterator = var5.iterator();

         while (true) {
            var2 = var3;
            if (!var6.hasNext()) {
               break;
            }

            if ((var6.next() as Row).getChangeType() === ChangeType.DELETE) {
               var2 = true;
               break;
            }
         }
      }

      if (!var2) {
         this.rows = CollectionsKt.k1(var1);
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
      val var10: java.lang.Iterable = var1;
      var var7: ArrayList = new ArrayList();

      for (Object var8 : var10) {
         if ((var8 as Row).getChangeType() === ChangeType.INSERT) {
            var7.add(var8);
         }
      }

      val var17: java.util.Iterator = var7.iterator();

      label75:
      while (true) {
         var var4: Boolean;
         for (var4 = false; var17.hasNext(); var4 = true) {
            val var13: Row = var17.next() as Row;
            this.insert(var6, var13);
            var5.add(new ListOperation.Insert(var13.getIndex()));
            if (!var4 && var13.getIndex() != 0) {
               continue label75;
            }
         }

         var7 = new ArrayList();

         for (Object var11 : var10) {
            if ((var11 as Row).getChangeType() === ChangeType.DELETE || (var11 as Row).getChangeType() === ChangeType.UPDATE) {
               var7.add(var11);
            }
         }

         for (Row var15 : CollectionsKt.S(var7)) {
            if (var15 is DeleteRow) {
               val var16: DeleteRow = var15 as DeleteRow;
               var6.remove((var15 as DeleteRow).getIndex());
               var5.add(new ListOperation.Remove(var16.getIndex()));
            } else {
               var var2: Boolean;
               label52:
               if (var15 is LoadingRow
                  && (var15 as LoadingRow).getButton().getAction().getType() === LoadingActionType.LOAD_MORE_AFTER
                  && (var15 as LoadingRow).getIndex() == 0) {
                  var2 = true;
                  break label52;
               } else {
                  var2 = false;
               }

               val var20: Row = CollectionsKt.o0(var6) as Row;
               val var3: Boolean;
               if (var20 is LoadingRow && (var20 as LoadingRow).isLoading()) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               if (var2 && var3) {
                  var6.add(1, var15);
                  var6.remove(0);
                  var5.add(new ListOperation.Insert(1));
                  var5.add(new ListOperation.Remove(0));
               } else {
                  var6.set(var15.getIndex(), var15);
                  var5.add(new ListOperation.Change(var15.getIndex()));
               }
            }
         }

         return new ChatListManager.RowsModificationResult(var6, var4, var5.build());
      }
   }

   private fun publishUpdate(update: ChatListUpdate) {
      g.d(this.publishScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, null) {
         final ChatListUpdate $update;
         int label;
         final ChatListManager this$0;

         {
            super(2, var3);
            this.this$0 = var1;
            this.$update = var2x;
         }

         @Override
         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.this$0, this.$update, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         @Override
         public final Object invokeSuspend(Object var1) {
            val var3: Any = ot.b.f();
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
      if (var1 is MessageRow) {
         return MessageRowKt.toChatListMessageItem(var1 as MessageRow);
      } else if (var1 is LoadingRow) {
         return new LoadingChatListItem((var1 as LoadingRow).getButton(), (var1 as LoadingRow).isLoading());
      } else if (var1 is SeparatorRow) {
         return SeparatorRowKt.toSeparatorChatListItem(var1 as SeparatorRow);
      } else if (var1 !is BlockedGroupRow) {
         throw new IllegalStateException("Unknown row type.");
      } else {
         val var9: BlockedGroupRow = var1 as BlockedGroupRow;
         val var8: java.lang.String = (var1 as BlockedGroupRow).getText();
         val var7: java.lang.String = (var1 as BlockedGroupRow).getButton().getAction().getContext();
         val var2: Int = var9.getColor();
         val var3: Int = var9.getBackgroundColor();
         val var4: Int = var9.getBorderColor();
         val var5: Boolean = var9.getRevealed();
         val var6: java.util.List = var9.getContent();
         var var10: java.util.List = var6;
         if (var6 == null) {
            var10 = CollectionsKt.l();
         }

         val var11: ArrayList = new ArrayList(CollectionsKt.w(var10, 10));
         val var14: java.util.Iterator = var10.iterator();

         while (var14.hasNext()) {
            var11.add(
               MessageRowKt.toChatListMessageItem$default(
                  (var14.next() as BlockedGroupContent).getMessage(),
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

         return new BlockedGroupChatListItem(var8, var7, var2, var3, var4, var5, CollectionsKt.S(var11));
      }
   }

   public fun clearRows(changesetUpdateId: Int) {
      if (this.rows as java.util.Collection != null && !this.rows.isEmpty()) {
         SpoilerManager.INSTANCE.reset();
         this.publishUpdate(new ChatListUpdate(CollectionsKt.l(), ChatListAction.Clear.INSTANCE, null, var1, null, 16, null));
      }

      this.rows = null;
   }

   public fun getRowCount(): Int {
      return if (this.rows != null) this.rows.size() else 0;
   }

   public fun handleError(errorJson: String, causeMessage: String, changesetUpdateId: Int) {
      this.publishUpdate(
         new ChatListUpdate(
            CollectionsKt.r(new DeserializationErrorChatListItem[]{new DeserializationErrorChatListItem("error-id", var1, var2)}),
            ChatListAction.Noop.INSTANCE,
            null,
            var3,
            null,
            16,
            null
         )
      );
      this.isDisabled = true;
   }

   public fun observeUpdates(): Flow<ChatListUpdate> {
      return this.updatesFlow;
   }

   public fun updateRows(updates: List<Row>, scrollData: ChatScrollData?, changesetUpdateId: Int, forceReload: Boolean) {
      if (!this.isDisabled) {
         val var8: ChatListManager.RowsModificationResult;
         if (this.rows != null) {
            var8 = this.modifyExistingRows(var1);
         } else {
            var8 = this.createNewRows(var1);
         }

         val var7: java.util.List = var8.component1();
         val var5: Boolean = var8.component2();
         val var6: java.util.List = var8.component3();
         var var9: Any;
         if (var2 != null && var2.getType() === ChatScrollType.SCROLL) {
            var9 = new ChatListAction.ScrollTo(var2.getIndex(), var2.getAnimate(), var2.getHighlight());
         } else {
            var9 = null;
         }

         val var10: ArrayList = new ArrayList(CollectionsKt.w(var7, 10));
         val var12: java.util.Iterator = var7.iterator();

         while (var12.hasNext()) {
            var10.add(this.toChatListItem(var12.next() as Row));
         }

         if (var9 == null) {
            if (var5) {
               var9 = ChatListAction.StickToBottomIfAtBottom.INSTANCE;
            } else {
               var9 = ChatListAction.Noop.INSTANCE;
            }
         }

         this.publishUpdate(new ChatListUpdate(var10, (ChatListAction)var9, var6, var3, var4));
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
         val var3: Int = this.rows.hashCode();
         val var2: Int = java.lang.Boolean.hashCode(this.didInsertAtBottom);
         val var1: Int;
         if (this.listOperations == null) {
            var1 = 0;
         } else {
            var1 = this.listOperations.hashCode();
         }

         return (var3 * 31 + var2) * 31 + var1;
      }

      public override fun toString(): String {
         val var2: java.util.List = this.rows;
         val var1: Boolean = this.didInsertAtBottom;
         val var3: java.util.List = this.listOperations;
         val var4: StringBuilder = new StringBuilder();
         var4.append("RowsModificationResult(rows=");
         var4.append(var2);
         var4.append(", didInsertAtBottom=");
         var4.append(var1);
         var4.append(", listOperations=");
         var4.append(var3);
         var4.append(")");
         return var4.toString();
      }
   }
}
