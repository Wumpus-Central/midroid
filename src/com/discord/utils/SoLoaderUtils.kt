package com.discord.utils

import android.content.Context
import com.facebook.soloader.SoLoader
import kotlin.jvm.internal.r

public object SoLoaderUtils {
   public fun init(context: Context, nativeExoPackage: Boolean = false) {
      r.h(var1, "context");
      SoLoader.l(var1, var2);
   }
}
