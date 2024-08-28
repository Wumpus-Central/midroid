package com.discord.minibsdiff

import java.io.InputStream
import java.io.RandomAccessFile
import kotlin.jvm.internal.q

internal fun RandomAccessFile.inputStream(): InputStream {
   q.h(var0, "<this>");
   return new RandomFileAccessInputStream(var0);
}
