package com.discord.simpleast.core.simple

import android.text.SpannableStringBuilder
import android.widget.TextView
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import kotlin.jvm.internal.q

public object SimpleRenderer {
   @JvmStatic
   public fun <T : SpannableStringBuilder, R> render(builder: T, ast: Collection<Node<R>>, renderContext: R): T {
      q.h(var0, "builder");
      q.h(var1, "ast");
      val var3: java.util.Iterator = var1.iterator();

      while (var3.hasNext()) {
         (var3.next() as Node).render(var0, var2);
      }

      return (T)var0;
   }

   @JvmStatic
   public fun <R, S> render(source: CharSequence, parser: Parser<R, Node<R>, S>, renderContext: R, initialState: S): SpannableStringBuilder {
      q.h(var0, "source");
      q.h(var1, "parser");
      return render(new SpannableStringBuilder(), Parser.parse$default(var1, var0, var3, null, 4, null), var2);
   }

   @JvmStatic
   public fun <R, S> render(source: CharSequence, rules: Collection<Rule<R, Node<R>, S>>, initialState: S, renderContext: R): SpannableStringBuilder {
      q.h(var0, "source");
      q.h(var1, "rules");
      return render(new SpannableStringBuilder(), Parser.parse$default(new Parser(false, 1, null).addRules(var1), var0, var2, null, 4, null), var3);
   }

   @JvmStatic
   public fun renderBasicMarkdown(source: CharSequence): SpannableStringBuilder {
      q.h(var0, "source");
      return render(var0, SimpleMarkdownRules.createSimpleMarkdownRules$default(false, false, 3, null), null, null);
   }

   @JvmStatic
   public fun renderBasicMarkdown(sourceResId: Int, textView: TextView) {
      q.h(var1, "textView");
      val var2: java.lang.String = var1.getContext().getString(var0);
      q.g(var2, "textView.context.getString(sourceResId)");
      renderBasicMarkdown(var2, var1);
   }

   @JvmStatic
   public fun renderBasicMarkdown(source: CharSequence, textView: TextView) {
      q.h(var0, "source");
      q.h(var1, "textView");
      var1.setText(renderBasicMarkdown(var0));
   }
}
