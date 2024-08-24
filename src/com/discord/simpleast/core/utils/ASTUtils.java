package com.discord.simpleast.core.utils;

import com.discord.simpleast.core.node.Node;
import java.util.Collection;
import java.util.Iterator;

public class ASTUtils {
   public static void traversePostOrder(Collection<? extends Node> var0, NodeProcessor var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         traversePostOrderSubtree((Node)var2.next(), var1);
      }
   }

   private static void traversePostOrderSubtree(Node var0, NodeProcessor var1) {
      if (var0.hasChildren()) {
         Iterator var2 = var0.getChildren().iterator();

         while (var2.hasNext()) {
            traversePostOrderSubtree((Node)var2.next(), var1);
         }
      }

      var1.processNode(var0);
   }

   public static void traversePreOrder(Collection<? extends Node> var0, NodeProcessor var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         traversePreOrderSubtree((Node)var2.next(), var1);
      }
   }

   private static void traversePreOrderSubtree(Node var0, NodeProcessor var1) {
      var1.processNode(var0);
      if (var0.hasChildren()) {
         Iterator var2 = var0.getChildren().iterator();

         while (var2.hasNext()) {
            traversePreOrderSubtree((Node)var2.next(), var1);
         }
      }
   }
}
