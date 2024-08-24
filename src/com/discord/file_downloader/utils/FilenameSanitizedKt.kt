package com.discord.file_downloader.utils

import kotlin.jvm.internal.r

public fun CharSequence.filenameSanitized(): String {
   r.h(var0, "<this>");
   return new Regex("[/\\\\]").h(var0, "_");
}
