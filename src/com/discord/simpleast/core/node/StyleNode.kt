package com.discord.simpleast.core.node

import android.text.SpannableStringBuilder

public open class StyleNode<RC, T>(styles: List<Any>) : Node.Parent() {
   public final val styles: List<Any>

   init {
      this.styles = var1;
   }

   public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
      val var3: Int = var1.length();
      super.render(var1, var2);
      var2 = this.styles.iterator();

      while (var2.hasNext()) {
         var1.setSpan(var2.next(), var3, var1.length(), 33);
      }
   }

   public companion object {
      public fun <RC, T> wrapText(content: String, styles: List<T>): StyleNode<RC, T> {
         val var3: StyleNode = new StyleNode(var2);
         var3.addChild(new TextNode(var1));
         return var3;
      }
   }

   public fun interface SpanProvider<RC> {
      public abstract fun get(renderContext: Any): Iterable<*> {
      }
   }

   public class TextStyledNode<RC>(content: String, stylesProvider: com.discord.simpleast.core.node.StyleNode.SpanProvider<Any>) : TextNode(var1) {
      public final val stylesProvider: com.discord.simpleast.core.node.StyleNode.SpanProvider<Any>

      init {
         this.stylesProvider = var2;
      }

      public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
         val var3: Int = var1.length();
         super.render(var1, var2);
         var2 = this.stylesProvider.get((RC)var2).iterator();

         while (var2.hasNext()) {
            var1.setSpan(var2.next(), var3, var1.length(), 33);
         }
      }
   }
}
