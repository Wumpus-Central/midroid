package com.discord.react.utilities

import android.view.View
import kotlin.jvm.internal.q

public fun View.getNativeId(): String {
   q.h(var0, "<this>");
   val var1: Any = var0.getTag(com.facebook.react.R.id.view_tag_native_id);
   q.f(var1, "null cannot be cast to non-null type kotlin.String");
   return var1 as java.lang.String;
}
