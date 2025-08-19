package com.discord.minibsdiff

import java.io.InputStream
import java.io.RandomAccessFile

internal fun RandomAccessFile.inputStream(): InputStream {
   return new RandomFileAccessInputStream(var0);
}
