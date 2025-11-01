package com.discord.file_downloader.utils

import android.webkit.MimeTypeMap
import ht.v
import java.io.UnsupportedEncodingException
import java.net.URLDecoder
import java.util.Locale

private final val EXTENSION_TO_MIME_TYPE: Map<String, String> =
   s0.m(
      new Pair[]{
         v.a("avif", "image/avif"),
         v.a("gif", "image/gif"),
         v.a("heic", "image/heic"),
         v.a("jpeg", "image/jpeg"),
         v.a("jpg", "image/jpeg"),
         v.a("mov", "video/quicktime"),
         v.a("mp3", "audio/mpeg"),
         v.a("mp4", "video/mp4"),
         v.a("pdf", "application/pdf"),
         v.a("png", "image/png"),
         v.a("txt", "text/plain"),
         v.a("wav", "audio/wav"),
         v.a("webm", "video/webm"),
         v.a("webp", "image/webp"),
         v.a("zip", "application/zip")
      }
   )

private fun decodeUrlSafely(filename: String): String {
   var0 = URLDecoder.decode(var0, "UTF-8");
   return var0;
}

public fun CharSequence.filenameSanitized(): String {
   var0 = var0.toString();

   try {
      return processFilename(decodeUrlSafely(var0), false);
   } catch (var2: IllegalArgumentException) {
      var0 = processFilename(var0, true);
   } catch (var3: UnsupportedEncodingException) {
      var0 = processFilename(var0, true);
   }

   return var0;
}

private fun fixAtSeparatorExtensions(filename: String, useUrlEncoded: Boolean): String {
   val var2: java.lang.String;
   if (var1) {
      var2 = "%40";
   } else {
      var2 = "@";
   }

   val var4: FilenamePatterns = FilenamePatterns.INSTANCE;
   val var3: java.lang.String = FilenamePatterns.INSTANCE.binExtensionFixPattern(var2).replace(var0, "$1.$2");
   return if (var3 == var0) var4.atSeparatorPattern(var2).replace(var0, "$1.$2") else var3;
}

public fun String.getMimeTypeFromFilename(): String? {
   val var2: java.lang.String = StringsKt.V0(var0, '.', "").toLowerCase(Locale.ROOT);
   if (var2.length() == 0) {
      return null;
   } else {
      var var1: java.lang.String;
      try {
         var1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(var2);
      } catch (var4: RuntimeException) {
         return EXTENSION_TO_MIME_TYPE.get(var2);
      }

      var0 = var1;
      if (var1 == null) {
         try {
            var0 = EXTENSION_TO_MIME_TYPE.get(var2);
         } catch (var3: RuntimeException) {
            return EXTENSION_TO_MIME_TYPE.get(var2);
         }
      }

      return var0;
   }
}

private fun processFilename(filename: String, useUrlEncoded: Boolean): String {
   return sanitizeInvalidCharacters(fixAtSeparatorExtensions(removeFileSizeModifiers(var0, var1), var1));
}

private fun removeFileSizeModifiers(filename: String, useUrlEncoded: Boolean): String {
   val var2: java.lang.String;
   if (var1) {
      var2 = "%3A";
   } else {
      var2 = ":";
   }

   return FilenamePatterns.INSTANCE.sizeModifierPattern(var2).replace(var0, "$1");
}

private fun sanitizeInvalidCharacters(filename: String): String {
   return FilenamePatterns.INSTANCE.getINVALID_FILENAME_CHARS().replace(var0, "_");
}
