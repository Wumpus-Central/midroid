package com.discord.minibsdiff

import java.io.InputStream
import java.io.RandomAccessFile
import kotlin.jvm.internal.r

internal fun RandomAccessFile.inputStream(): InputStream {
   r.h(var0, "<this>");
   return new RandomFileAccessInputStream(var0);
}
