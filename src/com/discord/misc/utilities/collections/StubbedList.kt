package com.discord.misc.utilities.collections

import java.util.Comparator
import java.util.function.UnaryOperator
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.i
import kotlin.jvm.internal.q
import yh.a

public open class StubbedList<T> : java.util.List<T>, a {
   public open val size: Int
      public open get() {
         throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "size"));
      }


   override fun add(var1: Int, var2: T) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun add(var1: T): Boolean {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun addAll(var1: Int, var2: MutableCollection<T>): Boolean {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun addAll(var1: MutableCollection<T>): Boolean {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public override operator fun contains(element: Any): Boolean {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "contains"));
   }

   public override fun containsAll(elements: Collection<Any>): Boolean {
      q.h(var1, "elements");
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "containsAll"));
   }

   public override operator fun get(index: Int): Any {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "get"));
   }

   public override fun indexOf(element: Any): Int {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "indexOf"));
   }

   public override fun isEmpty(): Boolean {
      val var1: Boolean;
      if (this.size() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public override operator fun iterator(): Iterator<Any> {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "iterator"));
   }

   public override fun lastIndexOf(element: Any): Int {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "lastIndexOf"));
   }

   public override fun listIterator(): ListIterator<Any> {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "listIterator"));
   }

   public override fun listIterator(index: Int): ListIterator<Any> {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "listIterator"));
   }

   override fun remove(var1: Int): T {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun remove(var1: Any): Boolean {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun removeAll(var1: MutableCollection<Any>): Boolean {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun replaceAll(var1: UnaryOperator<T>) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun retainAll(var1: MutableCollection<Any>): Boolean {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun set(var1: Int, var2: T): T {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   override fun sort(var1: Comparator<? super T>) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public override fun subList(fromIndex: Int, toIndex: Int): List<Any> {
      throw new UnsupportedOperationException(StubbedList.Companion.access$unsupported(Companion, "subList"));
   }

   override fun toArray(): Array<Any> {
      return i.a(this);
   }

   override fun <T> toArray(var1: Array<T>): Array<T> {
      q.h(var1, "array");
      return (T[])i.b(this, var1);
   }

   public companion object {
      private fun unsupported(methodName: String): String {
         val var3: java.lang.String = g0.b(StubbedList.class).i();
         val var2: StringBuilder = new StringBuilder();
         var2.append(var3);
         var2.append(" did not implement ");
         var2.append(var1);
         return var2.toString();
      }
   }
}
