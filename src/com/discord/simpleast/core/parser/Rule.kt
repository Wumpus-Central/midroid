package com.discord.simpleast.core.parser

import com.discord.simpleast.core.node.Node
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.internal.r

public abstract class Rule<R, T extends Node<R>, S> {
   public final val matcher: Matcher

   open fun Rule(var1: Matcher) {
      r.h(var1, "matcher");
      super();
      this.matcher = var1;
   }

   open fun Rule(var1: Pattern) {
      r.h(var1, "pattern");
      val var2: Matcher = var1.matcher("");
      r.g(var2, "pattern.matcher(\"\")");
      this(var2);
   }

   public open fun match(inspectionSource: CharSequence, lastCapture: String?, state: Any): Matcher? {
      r.h(var1, "inspectionSource");
      this.matcher.reset(var1);
      val var4: Matcher;
      if (this.matcher.find()) {
         var4 = this.matcher;
      } else {
         var4 = null;
      }

      return var4;
   }

   public abstract fun parse(matcher: Matcher, parser: Parser<Any, in Any, Any>, state: Any): ParseSpec<Any, Any> {
   }

   public abstract class BlockRule<R, T extends Node<R>, S> : Rule<R, T, S> {
      open fun BlockRule(var1: Pattern) {
         r.h(var1, "pattern");
         super(var1);
      }

      public override fun match(inspectionSource: CharSequence, lastCapture: String?, state: Any): Matcher? {
         r.h(var1, "inspectionSource");
         return if (var2 != null && !f.Q(var2, '\n', false, 2, null)) null else super.match(var1, var2, (S)var3);
      }
   }
}
