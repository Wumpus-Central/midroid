package com.discord.react_strings

import java.util.HashMap
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.q

public class RenderContext {
   public final val argHooks: MutableMap<String, String?>
   public final val args: MutableMap<String, String?> = new HashMap()

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

      public fun replace(input: CharSequence, onMatch: (String, String?, Boolean) -> CharSequence): String {
         q.h(var1, "input");
         q.h(var2, "onMatch");
         return argumentRegex.i(var1, new Function1(var2) {
            final Function3 $onMatch;

            {
               super(1);
               this.$onMatch = var1;
            }

            public final java.lang.CharSequence invoke(MatchResult var1) {
               q.h(var1, "match");
               val var4: RenderContext.Argument = RenderContext.Argument.INSTANCE;
               val var3: java.lang.String = RenderContext.Argument.access$get(RenderContext.Argument.INSTANCE, var1, 3);
               val var2: Boolean;
               if (RenderContext.Argument.access$contains(var4, var1, 2) && RenderContext.Argument.access$contains(var4, var1, 4)) {
                  var2 = true;
               } else {
                  var2 = false;
               }

               val var5: java.lang.String;
               if (RenderContext.Argument.access$contains(var4, var1, 1) && RenderContext.Argument.access$contains(var4, var1, 5)) {
                  var5 = var1.b().get(7) as java.lang.String;
               } else {
                  var5 = null;
               }

               return this.$onMatch.invoke(var3, var5, var2) as java.lang.CharSequence;
            }
         });
      }
   }
}
