@file:SourceDebugExtension(["SMAP\nButtonBackgroundUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonBackgroundUtils.kt\ncom/discord/misc/utilities/view/ButtonBackgroundUtilsKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,29:1\n37#2,2:30\n*S KotlinDebug\n*F\n+ 1 ButtonBackgroundUtils.kt\ncom/discord/misc/utilities/view/ButtonBackgroundUtilsKt\n*L\n25#1:30,2\n*E\n"])

package com.discord.misc.utilities.view

import android.content.res.ColorStateList
import android.widget.Button
import androidx.core.view.Z
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

public fun Button.setBackgroundColors(color: Int, disabledColor: Int? = null) {
   val var3: ArrayList = new ArrayList(2);
   val var4: ArrayList = new ArrayList(2);
   if (var2 != null) {
      var3.add(new int[]{-16842910});
      var4.add(var2);
   }

   var3.add(new int[0]);
   var4.add(var1);
   Z.t0(var0, new ColorStateList(var3.toArray(new int[0][]), CollectionsKt.V0(var4)));
}

@JvmSynthetic
fun `setBackgroundColors$default`(var0: Button, var1: Int, var2: Int, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = null;
   }

   setBackgroundColors(var0, var1, var2);
}
