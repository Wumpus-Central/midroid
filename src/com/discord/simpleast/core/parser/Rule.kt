package com.discord.simpleast.core.parser

import com.discord.simpleast.core.node.Node
import java.util.regex.Matcher
import java.util.regex.Pattern

public abstract class Rule<R, T extends Node<R>, S> {
   public final val matcher: Matcher

   open fun Rule(var1: Matcher) {
      this.matcher = var1;
   }

   open fun Rule(var1: Pattern) {
      val var2: Matcher = var1.matcher("");
      this(var2);
   }

   public open fun match(inspectionSource: CharSequence, lastCapture: String?, state: Any): Matcher? {
      this.matcher.reset(var1);
      return if (this.matcher.find()) this.matcher else null;
   }

   public abstract fun parse(matcher: Matcher, parser: Parser<Any, in Any, Any>, state: Any): ParseSpec<Any, Any> {
   }

   public abstract class BlockRule<R, T extends Node<R>, S> : Rule<R, T, S> {
      open fun BlockRule(var1: Pattern) {
         super(var1);
      }

      public override fun match(inspectionSource: CharSequence, lastCapture: String?, state: Any): Matcher? {
         return if (var2 != null && !StringsKt.Q(var2, '\n', false, 2, null)) null else super.match(var1, var2, (S)var3);
      }
   }
}
