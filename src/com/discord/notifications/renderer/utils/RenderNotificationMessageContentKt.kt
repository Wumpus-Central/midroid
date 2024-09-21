package com.discord.notifications.renderer.utils

import android.text.format.DateUtils
import java.text.DateFormat
import java.util.Date
import kotlin.jvm.internal.q
import tk.b

public fun renderNotificationMessageContent(content: String): String {
   q.h(var0, "content");
   val var3: Regex = new Regex("(```(?:([a-z0-9_+\\-.]+?)\\n)?\\n*([^\\n].*?)\\n*```)");
   val var4: Regex = new Regex("((`+)([\\s\\S]*?[^`])\\2(?!`))");
   val var5: Regex = new Regex("<t:(-?\\d{1,17})(?::([tTdDfFR]))?>");
   var var13: java.lang.String = var4.i(var3.i(var0, <unrepresentable>.INSTANCE), <unrepresentable>.INSTANCE);
   var var14: java.lang.String = var0;

   while (true) {
      var0 = null;
      val var6: MatchResult = Regex.c(var5, var13, 0, 2, null);
      if (var6 == null) {
         return var14;
      }

      val var7: b = var6.c().get(1);
      q.e(var7);
      val var15: java.lang.String = var7.a();
      val var8: b = var6.c().get(2);
      if (var8 != null) {
         var0 = var8.a();
      }

      val var16: Date = new Date(java.lang.Long.parseLong(var15) * 1000);
      var var10: Any;
      if (q.c(var0, "R")) {
         var10 = DateUtils.getRelativeTimeSpanString(var16.getTime());
      } else {
         label58: {
            if (var0 != null) {
               val var1: Int = var0.hashCode();
               if (var1 != 68) {
                  if (var1 != 70) {
                     if (var1 != 84) {
                        if (var1 != 100) {
                           if (var1 != 102) {
                              if (var1 == 116 && var0.equals("t")) {
                                 var10 = DateFormat.getTimeInstance(3);
                                 break label58;
                              }
                           } else if (var0.equals("f")) {
                              var10 = DateFormat.getDateTimeInstance(1, 3);
                              break label58;
                           }
                        } else if (var0.equals("d")) {
                           var10 = DateFormat.getDateInstance(3);
                           break label58;
                        }
                     } else if (var0.equals("T")) {
                        var10 = DateFormat.getTimeInstance(2);
                        break label58;
                     }
                  } else if (var0.equals("F")) {
                     var10 = DateFormat.getDateTimeInstance(0, 3);
                     break label58;
                  }
               } else if (var0.equals("D")) {
                  var10 = DateFormat.getDateInstance(1);
                  break label58;
               }
            }

            var10 = DateFormat.getDateTimeInstance(1, 3);
         }

         var10 = var10.format(var16);
      }

      val var2: Int = var6.d().a();
      val var12: Int = var6.d().k();
      q.e(var10);
      var14 = h.t0(var14, var2, var12 + 1, var10).toString();
      var13 = h.t0(var13, var6.d().a(), var6.d().k() + 1, var10).toString();
   }
}
