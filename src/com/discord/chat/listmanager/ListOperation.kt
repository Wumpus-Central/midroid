package com.discord.chat.listmanager

import kotlin.jvm.internal.q

public sealed class ListOperation protected constructor() {
   public data class Change(index: Int) : ListOperation() {
      public final val index: Int

      init {
         this.index = var1;
      }

      public operator fun component1(): Int {
         return this.index;
      }

      public fun copy(index: Int = var0.index): com.discord.chat.listmanager.ListOperation.Change {
         return new ListOperation.Change(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ListOperation.Change) {
            return false;
         } else {
            return this.index == (var1 as ListOperation.Change).index;
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.index);
      }

      public override fun toString(): String {
         val var1: Int = this.index;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Change(index=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public data class ChangeRange(range: IntRange) : ListOperation {
      public final val count: Int
      public final val first: Int
      public final val last: Int
      public final val range: IntRange

      init {
         q.h(var1, "range");
         super(null);
         this.range = var1;
         this.first = var1.a();
         this.last = var1.m();
         this.count = var1.m() - var1.a() + 1;
      }

      public operator fun component1(): IntRange {
         return this.range;
      }

      public fun copy(range: IntRange = var0.range): com.discord.chat.listmanager.ListOperation.ChangeRange {
         q.h(var1, "range");
         return new ListOperation.ChangeRange(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ListOperation.ChangeRange) {
            return false;
         } else {
            return q.c(this.range, (var1 as ListOperation.ChangeRange).range);
         }
      }

      public override fun hashCode(): Int {
         return this.range.hashCode();
      }

      public override fun toString(): String {
         val var2: IntRange = this.range;
         val var1: StringBuilder = new StringBuilder();
         var1.append("ChangeRange(range=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }

   public data class Insert(index: Int) : ListOperation() {
      public final val index: Int

      init {
         this.index = var1;
      }

      public operator fun component1(): Int {
         return this.index;
      }

      public fun copy(index: Int = var0.index): com.discord.chat.listmanager.ListOperation.Insert {
         return new ListOperation.Insert(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ListOperation.Insert) {
            return false;
         } else {
            return this.index == (var1 as ListOperation.Insert).index;
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.index);
      }

      public override fun toString(): String {
         val var1: Int = this.index;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Insert(index=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public data class InsertRange(range: IntRange) : ListOperation {
      public final val count: Int
      public final val first: Int
      public final val last: Int
      public final val range: IntRange

      init {
         q.h(var1, "range");
         super(null);
         this.range = var1;
         this.first = var1.a();
         this.last = var1.m();
         this.count = var1.m() - var1.a() + 1;
      }

      public operator fun component1(): IntRange {
         return this.range;
      }

      public fun copy(range: IntRange = var0.range): com.discord.chat.listmanager.ListOperation.InsertRange {
         q.h(var1, "range");
         return new ListOperation.InsertRange(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ListOperation.InsertRange) {
            return false;
         } else {
            return q.c(this.range, (var1 as ListOperation.InsertRange).range);
         }
      }

      public override fun hashCode(): Int {
         return this.range.hashCode();
      }

      public override fun toString(): String {
         val var2: IntRange = this.range;
         val var1: StringBuilder = new StringBuilder();
         var1.append("InsertRange(range=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }

   public data class Remove(index: Int) : ListOperation() {
      public final val index: Int

      init {
         this.index = var1;
      }

      public operator fun component1(): Int {
         return this.index;
      }

      public fun copy(index: Int = var0.index): com.discord.chat.listmanager.ListOperation.Remove {
         return new ListOperation.Remove(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ListOperation.Remove) {
            return false;
         } else {
            return this.index == (var1 as ListOperation.Remove).index;
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.index);
      }

      public override fun toString(): String {
         val var1: Int = this.index;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Remove(index=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public data class RemoveRange(range: IntRange) : ListOperation {
      public final val count: Int
      public final val first: Int
      public final val last: Int
      public final val range: IntRange

      init {
         q.h(var1, "range");
         super(null);
         this.range = var1;
         this.first = var1.a();
         this.last = var1.m();
         this.count = var1.m() - var1.a() + 1;
      }

      public operator fun component1(): IntRange {
         return this.range;
      }

      public fun copy(range: IntRange = var0.range): com.discord.chat.listmanager.ListOperation.RemoveRange {
         q.h(var1, "range");
         return new ListOperation.RemoveRange(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ListOperation.RemoveRange) {
            return false;
         } else {
            return q.c(this.range, (var1 as ListOperation.RemoveRange).range);
         }
      }

      public override fun hashCode(): Int {
         return this.range.hashCode();
      }

      public override fun toString(): String {
         val var1: IntRange = this.range;
         val var2: StringBuilder = new StringBuilder();
         var2.append("RemoveRange(range=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }
}
