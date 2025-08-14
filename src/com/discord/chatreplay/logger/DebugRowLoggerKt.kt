package com.discord.chatreplay.logger

import java.io.File
import java.io.FileOutputStream

public fun File.outputStream(append: Boolean): FileOutputStream {
   return new FileOutputStream(var0, var1);
}
