package com.discord.react.utilities

import android.view.View
import com.facebook.react.R.id

public fun View.getNativeId(): String {
   val var1: Any = var0.getTag(id.view_tag_native_id);
   return var1 as java.lang.String;
}
