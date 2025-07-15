package com.discord.file_downloader.utils

import android.webkit.MimeTypeMap
import java.io.UnsupportedEncodingException
import java.net.URLDecoder
import java.util.Locale
import kotlin.jvm.internal.r
import r9.s
import s9.q

private final val EXTENSION_TO_MIME_TYPE: Map<String, String> =
   q.l(
      new Pair[]{
         s.a("avif", "image/avif"),
         s.a("gif", "image/gif"),
         s.a("heic", "image/heic"),
         s.a("jpeg", "image/jpeg"),
         s.a("jpg", "image/jpeg"),
         s.a("mov", "video/quicktime"),
         s.a("mp3", "audio/mpeg"),
         s.a("mp4", "video/mp4"),
         s.a("pdf", "application/pdf"),
         s.a("png", "image/png"),
         s.a("txt", "text/plain"),
         s.a("wav", "audio/wav"),
         s.a("webm", "video/webm"),
         s.a("webp", "image/webp"),
         s.a("zip", "application/zip")
      }
   )

private fun decodeUrlSafely(filename: String): String {
   var0 = URLDecoder.decode(var0, "UTF-8");
   r.g(var0, "decode(...)");
   return var0;
}

public fun CharSequence.filenameSanitized(): String {
   r.h(var0, "<this>");
   val var1: java.lang.String = var0.toString();

   try {
      var0 = processFilename(decodeUrlSafely(var1), false);
   } catch (var2: IllegalArgumentException) {
      var0 = processFilename(var1, true);
   } catch (var3: UnsupportedEncodingException) {
      var0 = processFilename(var1, true);
   }

   return var0;
}

private fun fixAtSeparatorExtensions(filename: String, useUrlEncoded: Boolean): String {
   val var3: java.lang.String;
   if (var1) {
      var3 = "%40";
   } else {
      var3 = "@";
   }

   val var5: FilenamePatterns = FilenamePatterns.INSTANCE;
   val var4: java.lang.String = FilenamePatterns.INSTANCE.binExtensionFixPattern(var3).h(var0, "$1.$2");
   var var2: java.lang.String = var4;
   if (r.c(var4, var0)) {
      var2 = var5.atSeparatorPattern(var3).h(var0, "$1.$2");
   }

   return var2;
}

public fun String.getMimeTypeFromFilename(): String? {
   r.h(var0, "<this>");
   val var2: java.lang.String = h.N0(var0, '.', "").toLowerCase(Locale.ROOT);
   r.g(var2, "toLowerCase(...)");
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
            var0 = EXTENSION_TO_MIME_TYPE.get(var2);
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

   return FilenamePatterns.INSTANCE.sizeModifierPattern(var2).h(var0, "$1");
}

private fun sanitizeInvalidCharacters(filename: String): String {
   return FilenamePatterns.INSTANCE.getINVALID_FILENAME_CHARS().h(var0, "_");
}
