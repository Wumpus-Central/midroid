package com.discord.file_downloader.utils

import kotlin.jvm.internal.q

public fun CharSequence.filenameSanitized(): String {
   q.h(var0, "<this>");
   return new Regex("[/\\\\]").h(var0, "_");
}
