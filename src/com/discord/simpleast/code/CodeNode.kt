package com.discord.simpleast.code

import android.text.SpannableStringBuilder
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.node.TextNode
import com.discord.simpleast.core.node.StyleNode.SpanProvider

public open class CodeNode<RC>(content: com.discord.simpleast.code.CodeNode.Content, language: String?, stylesProvider: SpanProvider<Any>) : TextNode(
      var1.getBody()
   ) {
   private final val language: String?
   private final val stylesProvider: SpanProvider<Any>

   init {
      this.language = var2;
      this.stylesProvider = var3;
      if (var1 is CodeNode.Content.Parsed) {
         for (Node var4 : ((CodeNode.Content.Parsed)var1).getChildren()) {
            if (var4 == null) {
               throw new NullPointerException("null cannot be cast to non-null type com.discord.simpleast.core.node.Node<RC>");
            }

            this.addChild(var4);
         }
      }
   }

   public override operator fun equals(other: Any?): Boolean {
      return var1 is CodeNode && (var1 as CodeNode).language == this.language && (var1 as CodeNode).getContent() == this.getContent();
   }

   public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
      val var5: java.lang.Iterable = this.stylesProvider.get((RC)var2);
      if (this.hasChildren()) {
         val var4: SpannableStringBuilder = new SpannableStringBuilder();
         val var7: java.util.Iterator = var5.iterator();

         while (var7.hasNext()) {
            var4.setSpan(var7.next(), 0, 0, 18);
         }

         val var8: java.util.Collection = this.getChildren();
         if (var8 != null) {
            val var9: java.util.Iterator = var8.iterator();

            while (var9.hasNext()) {
               (var9.next() as Node).render(var4, var2);
            }
         }

         var1.append(' ');
         var1.insert(var1.length() - 1, var4);
      } else {
         val var3: Int = var1.length();
         var1.append(this.getContent());
         var2 = var5.iterator();

         while (var2.hasNext()) {
            var1.setSpan(var2.next(), var3, var1.length(), 17);
         }
      }
   }

   public sealed class Content private constructor(body: String) {
      public final val body: String

      init {
         this.body = var1;
      }

      public class Parsed<RC>(raw: String, children: List<Node<Any>>) : CodeNode.Content(var1) {
         public final val children: List<Node<Any>>

         init {
            this.children = var2;
         }
      }

      public class Raw(body: String) : CodeNode.Content(var1)
   }

   public class DefinitionNode<RC>(pre: String, name: String, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent(
         new StyleNode.TextStyledNode(var1, var3.getKeywordStyleProvider()), new StyleNode.TextStyledNode(var2, var3.getTypesStyleProvider())
      )
}
