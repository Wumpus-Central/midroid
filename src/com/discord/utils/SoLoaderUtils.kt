package com.discord.utils

import android.content.Context
import com.facebook.react.soloader.OpenSourceMergedSoMapping
import com.facebook.soloader.SoLoader

public object SoLoaderUtils {
   public fun init(context: Context) {
      SoLoader.l(var1, OpenSourceMergedSoMapping.INSTANCE);
   }
}
