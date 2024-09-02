package com.discord.shortcuts

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build.VERSION
import androidx.core.app.Person
import androidx.core.app.NotificationCompat.Builder
import androidx.core.content.c
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.b
import androidx.core.graphics.drawable.IconCompat
import kotlin.jvm.internal.q

public fun Builder.addShortcut(context: Context, shortcutInfo: ShortcutInfoCompat): Builder {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "shortcutInfo");
   var0.Q(var2.g());
   var0.I(new c(var2.g()));
   b.g(var1, var2);
   return var0;
}

public fun Context.createShortcut(id: String, label: CharSequence, longLabel: CharSequence, icon: Bitmap?, persons: List<Person>, intent: Intent, rank: Int = 0): ShortcutInfoCompat {
   q.h(var0, "<this>");
   q.h(var1, "id");
   q.h(var2, "label");
   q.h(var3, "longLabel");
   q.h(var5, "persons");
   q.h(var6, "intent");
   val var10: androidx.core.content.pm.ShortcutInfoCompat.b = new androidx.core.content.pm.ShortcutInfoCompat.b(var0, var1).h(new c(var1)).m(var2).i(var3);
   val var8: IconCompat;
   if (var4 != null) {
      var8 = IconCompat.h(var4);
   } else {
      var8 = null;
   }

   val var9: ShortcutInfoCompat = var10.e(var8).f(var6).l(var7).j(true).c(getShareCategories()).k(var5.toArray(new Person[0])).a();
   q.g(var9, "build(...)");
   return var9;
}

@JvmSynthetic
fun `createShortcut$default`(
   var0: Context,
   var1: java.lang.String,
   var2: java.lang.CharSequence,
   var3: java.lang.CharSequence,
   var4: Bitmap,
   var5: java.util.List,
   var6: Intent,
   var7: Int,
   var8: Int,
   var9: Any
): ShortcutInfoCompat {
   if ((var8 and 64) != 0) {
      var7 = 0;
   }

   return createShortcut(var0, var1, var2, var3, var4, var5, var6, var7);
}

private fun getShareCategories(): Set<String> {
   val var0: java.util.Set;
   if (VERSION.SDK_INT < 25) {
      var0 = w.c("com.discord.intent.category.DIRECT_SHARE_TARGET");
   } else {
      var0 = w.i(new java.lang.String[]{"com.discord.intent.category.DIRECT_SHARE_TARGET", "android.shortcut.conversation"});
   }

   return var0;
}
