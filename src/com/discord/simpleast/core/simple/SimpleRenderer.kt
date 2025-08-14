package com.discord.simpleast.core.simple

import android.text.SpannableStringBuilder
import android.widget.TextView
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule

public object SimpleRenderer {
   @JvmStatic
   public fun <T : SpannableStringBuilder, R> render(builder: T, ast: Collection<Node<R>>, renderContext: R): T {
      val var3: java.util.Iterator = var1.iterator();

      while (var3.hasNext()) {
         (var3.next() as Node).render(var0, var2);
      }

      return (T)var0;
   }

   @JvmStatic
   public fun <R, S> render(source: CharSequence, parser: Parser<R, Node<R>, S>, renderContext: R, initialState: S): SpannableStringBuilder {
      return render(new SpannableStringBuilder(), Parser.parse$default(var1, var0, var3, null, 4, null), var2);
   }

   @JvmStatic
   public fun <R, S> render(source: CharSequence, rules: Collection<Rule<R, Node<R>, S>>, initialState: S, renderContext: R): SpannableStringBuilder {
      return render(new SpannableStringBuilder(), Parser.parse$default(new Parser(false, 1, null).addRules(var1), var0, var2, null, 4, null), var3);
   }

   @JvmStatic
   public fun renderBasicMarkdown(source: CharSequence): SpannableStringBuilder {
      return render(var0, SimpleMarkdownRules.createSimpleMarkdownRules$default(false, false, 3, null), null, null);
   }

   @JvmStatic
   public fun renderBasicMarkdown(sourceResId: Int, textView: TextView) {
      val var2: java.lang.String = var1.getContext().getString(var0);
      renderBasicMarkdown(var2, var1);
   }

   @JvmStatic
   public fun renderBasicMarkdown(source: CharSequence, textView: TextView) {
      var1.setText(renderBasicMarkdown(var0));
   }
}
