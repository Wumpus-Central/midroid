package com.discord.simpleast.core.utils;

import android.text.style.CharacterStyle;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeMatcher {
   private Map<Class, TreeMatcher.NodeMatcher> matchers = new HashMap<>();

   public boolean matches(List<? extends Node> var1, List<? extends Node> var2) {
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      ASTUtils.traversePostOrder(var1, new NodeProcessor(this, var4) {
         final TreeMatcher this$0;
         final List val$tree1PostOrder;

         {
            this.this$0 = var1;
            this.val$tree1PostOrder = var2x;
         }

         @Override
         public void processNode(Node var1) {
            this.val$tree1PostOrder.add(var1);
         }
      });
      ASTUtils.traversePostOrder(var2, new NodeProcessor(this, var5) {
         final TreeMatcher this$0;
         final List val$tree2PostOrder;

         {
            this.this$0 = var1;
            this.val$tree2PostOrder = var2x;
         }

         @Override
         public void processNode(Node var1) {
            this.val$tree2PostOrder.add(var1);
         }
      });
      if (var4.size() != var5.size()) {
         return false;
      } else {
         for (int var3 = 0; var3 < var4.size(); var3++) {
            Node var7 = (Node)var4.get(var3);
            Node var8 = (Node)var5.get(var3);
            if (var7.getClass() != var8.getClass()) {
               return false;
            }

            Class var6 = var7.getClass();
            if (this.matchers.containsKey(var6) && !this.matchers.get(var6).matches(var7, var8)) {
               return false;
            }
         }

         return true;
      }
   }

   public void registerDefaultMatchers() {
      this.registerMatcher(TextNode.class, new TreeMatcher.NodeMatcher(this) {
         final TreeMatcher this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public boolean matches(Node var1, Node var2) {
            TextNode var3 = (TextNode)var1;
            TextNode var4 = (TextNode)var2;
            return var3.getContent().equals(var4.getContent());
         }
      });
      this.registerMatcher(StyleNode.class, new TreeMatcher.NodeMatcher(this) {
         final TreeMatcher this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public boolean matches(Node var1, Node var2) {
            StyleNode var6 = (StyleNode)var1;
            StyleNode var8 = (StyleNode)var2;
            List var7 = var6.getStyles();
            List var5 = var8.getStyles();
            if (var7.size() != var5.size()) {
               return false;
            } else {
               for (int var3 = 0; var3 < var7.size(); var3++) {
                  CharacterStyle var9 = (CharacterStyle)var7.get(var3);
                  CharacterStyle var4 = (CharacterStyle)var5.get(var3);
                  if (var9.getClass() != var4.getClass()) {
                     return false;
                  }
               }

               return true;
            }
         }
      });
   }

   public void registerMatcher(Class var1, TreeMatcher.NodeMatcher var2) {
      this.matchers.put(var1, var2);
   }

   public interface NodeMatcher {
      boolean matches(Node var1, Node var2);
   }
}
