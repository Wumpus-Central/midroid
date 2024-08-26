package com.discord.simpleast.core.parser

import android.util.Log
import com.discord.simpleast.core.node.Node
import eh.w
import java.util.ArrayList
import java.util.Stack
import java.util.regex.Matcher
import kotlin.jvm.internal.n0
import kotlin.jvm.internal.r

public open class Parser<R, T extends Node<R>, S>  public constructor(enableDebugging: Boolean = false) {
   private final val enableDebugging: Boolean
   private final val rules: ArrayList<Rule<Any, out Any, Any>>

   open fun Parser() {
      this(false, 1, null);
   }

   init {
      this.enableDebugging = var1;
      this.rules = new ArrayList<>();
   }

   private fun <R, T : Node<R>, S> logMatch(rule: Rule<R, T, S>, source: CharSequence) {
      if (this.enableDebugging) {
         val var3: StringBuilder = new StringBuilder();
         var3.append("MATCH: with rule with pattern: ");
         var3.append(var1.getMatcher().pattern().toString());
         var3.append(" to source: ");
         var3.append(var2);
         Log.i("Parser", var3.toString());
      }
   }

   private fun <R, T : Node<R>, S> logMiss(rule: Rule<R, T, S>, source: CharSequence) {
      if (this.enableDebugging) {
         val var3: StringBuilder = new StringBuilder();
         var3.append("MISS: with rule with pattern: ");
         var3.append(var1.getMatcher().pattern().toString());
         var3.append(" to source: ");
         var3.append(var2);
         Log.i("Parser", var3.toString());
      }
   }

   public fun addRule(rule: Rule<Any, out Any, Any>): Parser<Any, Any, Any> {
      r.h(var1, "rule");
      this.rules.add(var1);
      return this;
   }

   public fun addRules(newRules: Collection<Rule<Any, out Any, Any>>): Parser<Any, Any, Any> {
      r.h(var1, "newRules");
      this.rules.addAll(var1);
      return this;
   }

   public fun addRules(vararg newRules: Rule<Any, out Any, Any>): Parser<Any, Any, Any> {
      r.h(var1, "newRules");
      return this.addRules(b.d(var1));
   }

   fun parse(var1: java.lang.CharSequence, var2: S): MutableList<T> {
      return parse$default(this, var1, var2, null, 4, null);
   }

   public fun parse(source: CharSequence, initialState: Any, rules: List<Rule<Any, out Any, Any>> = var0.rules): MutableList<Any> {
      r.h(var1, "source");
      r.h(var3, "rules");
      val var9: Stack = new Stack();
      var var4: Int = 1;
      val var8: Node = new Node(null, 1, null);
      if (var1.length() <= 0) {
         var4 = 0;
      }

      if (var4) {
         var9.add(new ParseSpec<>(var8, var2, 0, var1.length()));
      }

      var var6: java.lang.String = null;

      while (!var9.isEmpty()) {
         val var10: ParseSpec = var9.pop() as ParseSpec;
         if (var10.getStartIndex() >= var10.getEndIndex()) {
            break;
         }

         val var11: java.lang.CharSequence = var1.subSequence(var10.getStartIndex(), var10.getEndIndex());
         val var5: Int = var10.getStartIndex();
         val var12: java.util.Iterator = var3.iterator();

         while (true) {
            if (var12.hasNext()) {
               val var18: Rule = var12.next() as Rule;
               val var13: Matcher = var18.match(var11, var6, var10.getState());
               if (var13 == null) {
                  this.logMiss(var18, var11);
                  var2 = null;
               } else {
                  this.logMatch(var18, var11);
                  var2 = w.a(var18, var13);
               }

               if (var2 == null) {
                  continue;
               }
            } else {
               var2 = null;
            }

            if (var2 == null) {
               throw new Parser.ParseException("failed to find rule to match source", var1, null, 4, null);
            }

            val var22: Rule = var2.a() as Rule;
            val var20: Matcher = var2.b() as Matcher;
            var4 = var20.end() + var5;
            val var23: ParseSpec = var22.parse(var20, this, (S)var10.getState());
            val var24: Node = var10.getRoot();
            var24.addChild(var23.getRoot());
            if (var4 != var10.getEndIndex()) {
               var9.push(ParseSpec.Companion.createNonterminal(var24, var10.getState(), var4, var10.getEndIndex()));
            }

            if (!var23.isTerminal()) {
               var23.applyOffset(var5);
               var9.push(var23);
            }

            try {
               var6 = var20.group(0);
               break;
            } catch (var14: java.lang.Throwable) {
               throw new Parser.ParseException("matcher found no matches", var1, var14);
            }
         }
      }

      val var16: java.util.Collection = var8.getChildren();
      var var17: Any;
      if (var16 != null) {
         var17 = h.P0(var16);
      } else {
         var17 = null;
      }

      if (!n0.l(var17)) {
         var17 = null;
      }

      if (var17 == null) {
         var17 = new ArrayList();
      }

      return (java.util.List<T>)var17;
   }

   public companion object {
      private const val TAG: String
   }

   public class ParseException(message: String, source: CharSequence?, cause: Throwable? = null) : RuntimeException {
      init {
         r.h(var1, "message");
         val var4: StringBuilder = new StringBuilder();
         var4.append("Error while parsing: ");
         var4.append(var1);
         var4.append(" \n Source: ");
         var4.append(var2);
         super(var4.toString(), var3);
      }
   }
}
