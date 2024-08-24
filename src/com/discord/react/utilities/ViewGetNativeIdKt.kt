package com.discord.react.utilities

import android.view.View
import com.facebook.react.R.id
import kotlin.jvm.internal.r

public fun View.getNativeId(): String {
   r.h(var0, "<this>");
   val var1: Any = var0.getTag(id.view_tag_native_id);
   r.f(var1, "null cannot be cast to non-null type kotlin.String");
   return var1 as java.lang.String;
}
