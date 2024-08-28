package com.discord.media.utils

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.net.Uri.Builder
import android.os.Bundle
import android.os.Build.VERSION
import android.webkit.MimeTypeMap
import java.io.File
import kotlin.jvm.internal.q

internal object ContentResolverUtils {
   public fun ContentResolver.createTempFile(uri: Uri, prefix: String = "temp_", extension: String? = null): File {
      q.h(var1, "<this>");
      q.h(var2, "uri");
      q.h(var3, "prefix");
      var var5: java.lang.String = var4;
      if (var4 == null) {
         var5 = MimeTypeMap.getSingleton().getExtensionFromMimeType(var1.getType(var2));
      }

      val var6: StringBuilder = new StringBuilder();
      var6.append(".");
      var6.append(var5);
      val var7: File = File.createTempFile(var3, var6.toString());
      var7.deleteOnExit();
      q.g(var7, "also(...)");
      return var7;
   }

   public fun ContentResolver.isHeif(uri: Uri): Boolean {
      q.h(var1, "<this>");
      q.h(var2, "uri");
      val var3: Boolean;
      if (!q.c(var1.getType(var2), "image/heif") && !q.c(var1.getType(var2), "image/heic")) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public fun ContentResolver.isImage(uri: Uri): Boolean {
      q.h(var1, "<this>");
      q.h(var2, "uri");
      val var5: java.lang.String = var1.getType(var2);
      var var3: Boolean = false;
      if (var5 != null) {
         var3 = false;
         if (h.H(var5, "image", false, 2, null)) {
            var3 = true;
         }
      }

      return var3;
   }

   public fun ContentResolver.isJpeg(uri: Uri): Boolean {
      q.h(var1, "<this>");
      q.h(var2, "uri");
      val var3: Boolean;
      if (!q.c(var1.getType(var2), "image/jpeg") && !q.c(var1.getType(var2), "image/jpg")) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public fun ContentResolver.isPng(uri: Uri): Boolean {
      q.h(var1, "<this>");
      q.h(var2, "uri");
      return q.c(var1.getType(var2), "image/png");
   }

   public fun ContentResolver.isVideo(uri: Uri): Boolean {
      q.h(var1, "<this>");
      q.h(var2, "uri");
      val var5: java.lang.String = var1.getType(var2);
      var var3: Boolean = false;
      if (var5 != null) {
         var3 = false;
         if (h.H(var5, "video", false, 2, null)) {
            var3 = true;
         }
      }

      return var3;
   }

   public fun ContentResolver.queryCompat(
      queryUri: Uri,
      queryProjection: Array<String>,
      queryLimit: Int,
      querySort: String,
      querySelection: String? = null,
      queryOffset: Int? = null
   ): Cursor? {
      q.h(var1, "<this>");
      q.h(var2, "queryUri");
      q.h(var3, "queryProjection");
      q.h(var5, "querySort");
      val var10: Cursor;
      if (VERSION.SDK_INT > 29) {
         val var9: Bundle = new Bundle();
         var9.putInt("android:query-arg-limit", var4);
         var9.putString("android:query-arg-sql-sort-order", var5);
         if (var6 != null) {
            var9.putString("android:query-arg-sql-selection", var6);
         }

         if (var7 != null) {
            var9.putInt("android:query-arg-offset", var7.intValue());
         }

         var10 = a.a(var1, var2, var3, var9, null);
      } else if (VERSION.SDK_INT >= 26) {
         val var15: Int;
         if (var7 != null) {
            var15 = var7;
         } else {
            var15 = 0;
         }

         val var14: StringBuilder = new StringBuilder();
         var14.append(var5);
         var14.append(" LIMIT ");
         var14.append(var4);
         var14.append(" OFFSET ");
         var14.append(var15);
         var10 = var1.query(var2, var3, var6, null, var14.toString(), null);
      } else {
         val var16: Builder = var2.buildUpon();
         val var11: StringBuilder = new StringBuilder();
         var11.append("limit=");
         var11.append(var4);
         val var12: Builder = var16.encodedQuery(var11.toString());
         if (var7 != null) {
            var12.appendQueryParameter("offset", java.lang.String.valueOf(var7.intValue()));
         }

         var10 = var1.query(var12.build(), var3, var6, null, var5);
      }

      return var10;
   }
}
