package com.discord.simpleast.core.node

import android.text.SpannableStringBuilder
import java.util.ArrayList
import kotlin.jvm.internal.r

public open class Node<R>(children: MutableCollection<Node<Any>>? = null) {
   private final var children: MutableCollection<Node<Any>>?

   open fun Node() {
      this(null, 1, null);
   }

   init {
      this.children = var1;
   }

   public fun addChild(child: Node<Any>) {
      r.h(var1, "child");
      var var2: Any = this.children;
      if (this.children == null) {
         var2 = new ArrayList();
      }

      var2.add(var1);
      this.children = (java.util.Collection<Node<R>>)var2;
   }

   public fun getChildren(): Collection<Node<Any>>? {
      return this.children;
   }

   public fun hasChildren(): Boolean {
      return this.children != null && this.children.isEmpty() xor true;
   }

   public open fun render(builder: SpannableStringBuilder, renderContext: Any) {
      r.h(var1, "builder");
   }

   public open class Parent<R>(vararg children: Node<Any>?) : Node<R> {
      init {
         r.h(var1, "children");
         val var4: ArrayList = new ArrayList();
         val var3: Int = var1.length;

         for (int var2 = 0; var2 < var3; var2++) {
            val var5: Node = var1[var2];
            if (var1[var2] != null) {
               var4.add(var5);
            }
         }

         super(h.O0(var4));
      }

      public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
         r.h(var1, "builder");
         val var3: java.util.Collection = this.getChildren();
         if (var3 != null) {
            val var4: java.util.Iterator = var3.iterator();

            while (var4.hasNext()) {
               (var4.next() as Node).render(var1, var2);
            }
         }
      }

      public override fun toString(): String {
         val var2: StringBuilder = new StringBuilder();
         var2.append(this.getClass().getSimpleName());
         var2.append(" >\n");
         val var1: java.util.Collection = this.getChildren();
         val var3: java.lang.String;
         if (var1 != null) {
            var3 = h.j0(var1, "\n->", ">>", "\n>|", 0, null, <unrepresentable>.INSTANCE, 24, null);
         } else {
            var3 = null;
         }

         var2.append(var3);
         return var2.toString();
      }
   }
}
