package com.discord.chatreplay.logger

import java.io.File
import java.io.FileOutputStream
import kotlin.jvm.internal.q

public fun File.outputStream(append: Boolean): FileOutputStream {
   q.h(var0, "<this>");
   return new FileOutputStream(var0, var1);
}
