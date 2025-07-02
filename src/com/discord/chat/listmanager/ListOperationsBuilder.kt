package com.discord.chat.listmanager

import com.discord.chat.listmanager.ListOperation.Change
import com.discord.chat.listmanager.ListOperation.Insert
import com.discord.chat.listmanager.ListOperation.Remove
import java.util.ArrayList
import kotlin.jvm.internal.q

public class ListOperationsBuilder {
   private final val listOperations: MutableList<ListOperation> = new ArrayList()

   private fun addChange(changeOperation: Change) {
      val var3: ListOperation = i.q0(this.listOperations) as ListOperation;
      if (var3 is ListOperation.Change) {
         val var5: ListOperation.Change = var3 as ListOperation.Change;
         val var2: Int = (var3 as ListOperation.Change).getIndex();
         if (var2 == var1.getIndex() - 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.ChangeRange(new IntRange(var5.getIndex(), var1.getIndex())));
         } else if (var2 == var1.getIndex() + 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.ChangeRange(new IntRange(var1.getIndex(), var5.getIndex())));
         } else {
            this.listOperations.add(var1);
         }
      } else if (var3 is ListOperation.ChangeRange) {
         val var6: ListOperation.ChangeRange = var3 as ListOperation.ChangeRange;
         if ((var3 as ListOperation.ChangeRange).getLast() == var1.getIndex() - 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.ChangeRange(new IntRange(var6.getFirst(), var1.getIndex())));
         } else if (var6.getFirst() == var1.getIndex() + 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.ChangeRange(new IntRange(var1.getIndex(), var6.getLast())));
         } else {
            this.listOperations.add(var1);
         }
      } else {
         this.listOperations.add(var1);
      }
   }

   private fun addInsert(insertOperation: Insert) {
      val var3: ListOperation = i.q0(this.listOperations) as ListOperation;
      if (var3 is ListOperation.Insert) {
         val var5: ListOperation.Insert = var3 as ListOperation.Insert;
         val var2: Int = (var3 as ListOperation.Insert).getIndex();
         if (var2 == var1.getIndex() - 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.InsertRange(new IntRange(var5.getIndex(), var1.getIndex())));
         } else if (var2 == var1.getIndex() + 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.InsertRange(new IntRange(var1.getIndex(), var5.getIndex())));
         } else {
            this.listOperations.add(var1);
         }
      } else if (var3 is ListOperation.InsertRange) {
         val var6: ListOperation.InsertRange = var3 as ListOperation.InsertRange;
         if ((var3 as ListOperation.InsertRange).getLast() == var1.getIndex() - 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.InsertRange(new IntRange(var6.getFirst(), var1.getIndex())));
         } else if (var6.getFirst() == var1.getIndex() + 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.InsertRange(new IntRange(var1.getIndex(), var6.getLast())));
         } else {
            this.listOperations.add(var1);
         }
      } else {
         this.listOperations.add(var1);
      }
   }

   private fun addRemove(removeOperation: Remove) {
      val var3: ListOperation = i.q0(this.listOperations) as ListOperation;
      if (var3 is ListOperation.Remove) {
         val var5: ListOperation.Remove = var3 as ListOperation.Remove;
         val var2: Int = (var3 as ListOperation.Remove).getIndex();
         if (var2 == var1.getIndex() - 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.RemoveRange(new IntRange(var5.getIndex(), var1.getIndex())));
         } else if (var2 == var1.getIndex() + 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.RemoveRange(new IntRange(var1.getIndex(), var5.getIndex())));
         } else {
            this.listOperations.add(var1);
         }
      } else if (var3 is ListOperation.RemoveRange) {
         val var6: ListOperation.RemoveRange = var3 as ListOperation.RemoveRange;
         if ((var3 as ListOperation.RemoveRange).getLast() == var1.getIndex() - 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.RemoveRange(new IntRange(var6.getFirst(), var1.getIndex())));
         } else if (var6.getFirst() == var1.getIndex() + 1) {
            this.listOperations.set(i.m(this.listOperations), new ListOperation.RemoveRange(new IntRange(var1.getIndex(), var6.getLast())));
         } else {
            this.listOperations.add(var1);
         }
      } else {
         this.listOperations.add(var1);
      }
   }

   public fun add(newOperation: ListOperation) {
      q.h(var1, "newOperation");
      if (this.listOperations.isEmpty()) {
         this.listOperations.add(var1);
      } else {
         if (var1 is ListOperation.Insert) {
            this.addInsert(var1 as ListOperation.Insert);
         } else if (var1 is ListOperation.Remove) {
            this.addRemove(var1 as ListOperation.Remove);
         } else {
            if (var1 !is ListOperation.Change) {
               val var2: StringBuilder = new StringBuilder();
               var2.append("invalid new operation for add: ");
               var2.append(var1);
               throw new IllegalArgumentException(var2.toString());
            }

            this.addChange(var1 as ListOperation.Change);
         }
      }
   }

   public fun build(): List<ListOperation> {
      return this.listOperations;
   }
}
