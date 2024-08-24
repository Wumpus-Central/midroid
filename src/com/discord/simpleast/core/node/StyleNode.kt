package com.discord.simpleast.core.node

import android.text.SpannableStringBuilder
import kotlin.jvm.internal.r

public open class StyleNode<RC, T>(styles: List<Any>) : Node.Parent<RC> {
   public final val styles: List<Any>

   init {
      r.h(var1, "styles");
      super();
      this.styles = var1;
   }

   public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
      r.h(var1, "builder");
      val var3: Int = var1.length();
      super.render(var1, var2);
      var2 = this.styles.iterator();

      while (var2.hasNext()) {
         var1.setSpan(var2.next(), var3, var1.length(), 33);
      }
   }

   public companion object {
      public fun <RC, T> wrapText(content: String, styles: List<T>): StyleNode<RC, T> {
         r.h(var1, "content");
         r.h(var2, "styles");
         val var3: StyleNode = new StyleNode(var2);
         var3.addChild(new TextNode(var1));
         return var3;
      }
   }

   public fun interface SpanProvider<RC> {
      public abstract fun get(renderContext: Any): Iterable<*> {
      }
   }

   public class TextStyledNode<RC>(content: String, stylesProvider: com.discord.simpleast.core.node.StyleNode.SpanProvider<Any>) : TextNode<RC> {
      public final val stylesProvider: com.discord.simpleast.core.node.StyleNode.SpanProvider<Any>

      init {
         r.h(var1, "content");
         r.h(var2, "stylesProvider");
         super(var1);
         this.stylesProvider = var2;
      }

      public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
         r.h(var1, "builder");
         val var3: Int = var1.length();
         super.render(var1, var2);
         var2 = this.stylesProvider.get((RC)var2).iterator();

         while (var2.hasNext()) {
            var1.setSpan(var2.next(), var3, var1.length(), 33);
         }
      }
   }
}
