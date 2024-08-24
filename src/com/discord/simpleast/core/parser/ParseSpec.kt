package com.discord.simpleast.core.parser

import com.discord.simpleast.core.node.Node
import kotlin.jvm.internal.r

public class ParseSpec<R, S> {
   public final var endIndex: Int
      internal set

   public final val isTerminal: Boolean
   public final val root: Node<Any>

   public final var startIndex: Int
      internal set

   public final val state: Any

   public constructor(root: Node<Any>, state: Any) : r.h(var1, "root") {
      super();
      this.root = var1;
      this.state = (S)var2;
      this.isTerminal = true;
   }

   public constructor(root: Node<Any>, state: Any, startIndex: Int, endIndex: Int) : r.h(var1, "root") {
      super();
      this.root = var1;
      this.state = (S)var2;
      this.isTerminal = false;
      this.startIndex = var3;
      this.endIndex = var4;
   }

   public fun applyOffset(offset: Int) {
      this.startIndex += var1;
      this.endIndex += var1;
   }

   public companion object {
      public fun <R, S> createNonterminal(node: Node<R>, state: S, startIndex: Int, endIndex: Int): ParseSpec<R, S> {
         r.h(var1, "node");
         return new ParseSpec<>(var1, (S)var2, var3, var4);
      }

      public fun <R, S> createTerminal(node: Node<R>, state: S): ParseSpec<R, S> {
         r.h(var1, "node");
         return new ParseSpec<>(var1, (S)var2);
      }
   }
}
