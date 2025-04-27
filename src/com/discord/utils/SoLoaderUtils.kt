package com.discord.utils

import android.content.Context
import com.facebook.react.soloader.OpenSourceMergedSoMapping
import com.facebook.soloader.SoLoader
import kotlin.jvm.internal.q

public object SoLoaderUtils {
   public fun init(context: Context) {
      q.h(var1, "context");
      SoLoader.l(var1, OpenSourceMergedSoMapping.INSTANCE);
   }
}
