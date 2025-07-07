package com.discord.react_strings

import a2.g
import java.util.HashMap
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.r

public class RenderContext {
   public final val args: MutableMap<String, String?> = new HashMap()
   public final val argHooks: MutableMap<String, String?>

   internal object Argument {
      private final val argumentRegex: Regex = new Regex("(\\[)?(!!)?\\{(\\S+?)\\}(!!)?(\\])?(\\((\\S+?)\\))?")
      private const val GROUP_ESCAPE_L: Int = 2
      private const val GROUP_ESCAPE_R: Int = 4
      private const val GROUP_ARG_NAME: Int = 3
      private const val GROUP_HOOK_MARKER_L: Int = 1
      private const val GROUP_HOOK_MARKER_R: Int = 5
      private const val GROUP_HOOK: Int = 7

      private fun MatchResult.contains(group: Int): Boolean {
         val var3: Boolean;
         if (this.get(var1, var2).length() > 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         return var3;
      }

      private fun MatchResult.get(group: Int): String {
         return var1.b().get(var2) as java.lang.String;
      }

      @JvmStatic
      fun `replace$lambda$0`(var0: Function3, var1: MatchResult): java.lang.CharSequence {
         r.h(var1, "match");
         val var4: RenderContext.Argument = INSTANCE;
         val var3: java.lang.String = INSTANCE.get(var1, 3);
         val var2: Boolean;
         if (var4.contains(var1, 2) && var4.contains(var1, 4)) {
            var2 = true;
         } else {
            var2 = false;
         }

         val var5: java.lang.String;
         if (var4.contains(var1, 1) && var4.contains(var1, 5)) {
            var5 = var1.b().get(7) as java.lang.String;
         } else {
            var5 = null;
         }

         return var0.invoke(var3, var5, var2) as java.lang.CharSequence;
      }

      public fun replace(input: CharSequence, onMatch: (String, String?, Boolean) -> CharSequence): String {
         r.h(var1, "input");
         r.h(var2, "onMatch");
         return argumentRegex.i(var1, new g(var2));
      }
   }
}
