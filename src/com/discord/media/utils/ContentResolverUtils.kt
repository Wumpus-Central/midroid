package com.discord.media.utils

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.net.Uri.Builder
import android.os.Bundle
import android.os.Build.VERSION
import android.webkit.MimeTypeMap
import java.io.File

internal object ContentResolverUtils {
   public fun ContentResolver.createTempFile(uri: Uri, prefix: String = "temp_", extension: String? = null): File {
      var var5: java.lang.String = var4;
      if (var4 == null) {
         var5 = MimeTypeMap.getSingleton().getExtensionFromMimeType(var1.getType(var2));
      }

      val var6: StringBuilder = new StringBuilder();
      var6.append(".");
      var6.append(var5);
      val var7: File = File.createTempFile(var3, var6.toString());
      var7.deleteOnExit();
      return var7;
   }

   public fun ContentResolver.isHeif(uri: Uri): Boolean {
      return var1.getType(var2) == "image/heif" || var1.getType(var2) == "image/heic";
   }

   public fun ContentResolver.isImage(uri: Uri): Boolean {
      val var3: java.lang.String = var1.getType(var2);
      return var3 != null && StringsKt.N(var3, "image", false, 2, null);
   }

   public fun ContentResolver.isJpeg(uri: Uri): Boolean {
      return var1.getType(var2) == "image/jpeg" || var1.getType(var2) == "image/jpg";
   }

   public fun ContentResolver.isPng(uri: Uri): Boolean {
      return var1.getType(var2) == "image/png";
   }

   public fun ContentResolver.isVideo(uri: Uri): Boolean {
      val var3: java.lang.String = var1.getType(var2);
      return var3 != null && StringsKt.N(var3, "video", false, 2, null);
   }

   public fun ContentResolver.queryCompat(
      queryUri: Uri,
      queryProjection: Array<String>,
      queryLimit: Int,
      querySort: String,
      querySelection: String? = null,
      queryOffset: Int? = null
   ): Cursor? {
      if (VERSION.SDK_INT > 29) {
         val var15: Bundle = new Bundle();
         var15.putInt("android:query-arg-limit", var4);
         var15.putString("android:query-arg-sql-sort-order", var5);
         if (var6 != null) {
            var15.putString("android:query-arg-sql-selection", var6);
         }

         if (var7 != null) {
            var15.putInt("android:query-arg-offset", var7.intValue());
         }

         return var1.query(var2, var3, var15, null);
      } else if (VERSION.SDK_INT >= 26) {
         val var14: Int;
         if (var7 != null) {
            var14 = var7;
         } else {
            var14 = 0;
         }

         val var13: StringBuilder = new StringBuilder();
         var13.append(var5);
         var13.append(" LIMIT ");
         var13.append(var4);
         var13.append(" OFFSET ");
         var13.append(var14);
         return var1.query(var2, var3, var6, null, var13.toString(), null);
      } else {
         val var9: Builder = var2.buildUpon();
         val var10: StringBuilder = new StringBuilder();
         var10.append("limit=");
         var10.append(var4);
         val var11: Builder = var9.encodedQuery(var10.toString());
         if (var7 != null) {
            var11.appendQueryParameter("offset", java.lang.String.valueOf(var7.intValue()));
         }

         return var1.query(var11.build(), var3, var6, null, var5);
      }
   }
}
