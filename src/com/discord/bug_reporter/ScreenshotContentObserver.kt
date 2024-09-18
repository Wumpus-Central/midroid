package com.discord.bug_reporter

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.database.ContentObserver
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Media
import com.discord.logging.Log
import java.util.Locale
import kotlin.jvm.internal.q

internal class ScreenshotContentObserver(contentResolver: ContentResolver, onScreenshot: () -> Unit) : ContentObserver {
   private final val contentResolver: ContentResolver
   private final var lastProcessedPath: String?
   private final val onScreenshot: () -> Unit

   init {
      q.h(var1, "contentResolver");
      q.h(var2, "onScreenshot");
      super(null);
      this.contentResolver = var1;
      this.onScreenshot = var2;
   }

   private fun getProjection(): Array<String> {
      val var1: Int = VERSION.SDK_INT;
      val var2: Array<java.lang.String>;
      if (VERSION.SDK_INT >= 29) {
         var2 = new java.lang.String[]{"is_pending", "relative_path"};
      } else {
         var2 = new java.lang.String[0];
      }

      val var3: Array<java.lang.String>;
      if (var1 >= 29) {
         var3 = new java.lang.String[]{"relative_path"};
      } else {
         var3 = new java.lang.String[]{"_data"};
      }

      return c.q(c.q(new java.lang.String[]{"_display_name", "date_added", "_id"}, var2), var3) as Array<java.lang.String>;
   }

   @SuppressLint(["Range"])
   private fun getScreenshotData(uri: Uri): com.discord.bug_reporter.ScreenshotContentObserver.ScreenshotData? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/discord/bug_reporter/ScreenshotContentObserver.contentResolver Landroid/content/ContentResolver;
      // 004: aload 1
      // 005: aload 0
      // 006: invokespecial com/discord/bug_reporter/ScreenshotContentObserver.getProjection ()[Ljava/lang/String;
      // 009: aconst_null
      // 00a: aconst_null
      // 00b: ldc "date_added DESC"
      // 00d: invokevirtual android/content/ContentResolver.query (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      // 010: astore 6
      // 012: aload 6
      // 014: ifnull 120
      // 017: aload 6
      // 019: invokeinterface android/database/Cursor.moveToFirst ()Z 1
      // 01e: ifeq 028
      // 021: aload 6
      // 023: astore 5
      // 025: goto 02b
      // 028: aconst_null
      // 029: astore 5
      // 02b: aload 5
      // 02d: ifnonnull 033
      // 030: goto 120
      // 033: getstatic android/os/Build$VERSION.SDK_INT I
      // 036: istore 2
      // 037: iload 2
      // 038: bipush 29
      // 03a: if_icmplt 07b
      // 03d: aload 6
      // 03f: aload 6
      // 041: ldc "is_pending"
      // 043: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 048: invokeinterface android/database/Cursor.getInt (I)I 2
      // 04d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 050: astore 5
      // 052: aload 5
      // 054: invokevirtual java/lang/Number.intValue ()I
      // 057: bipush 1
      // 058: if_icmpne 05e
      // 05b: goto 061
      // 05e: aconst_null
      // 05f: astore 5
      // 061: aload 5
      // 063: ifnull 073
      // 066: aload 5
      // 068: invokevirtual java/lang/Integer.intValue ()I
      // 06b: pop
      // 06c: goto 07b
      // 06f: astore 1
      // 070: goto 113
      // 073: aload 6
      // 075: aconst_null
      // 076: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 079: aconst_null
      // 07a: areturn
      // 07b: iload 2
      // 07c: bipush 29
      // 07e: if_icmplt 096
      // 081: aload 6
      // 083: aload 6
      // 085: ldc "relative_path"
      // 087: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 08c: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 091: astore 5
      // 093: goto 0be
      // 096: aload 6
      // 098: aload 6
      // 09a: ldc "_data"
      // 09c: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0a1: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0a6: astore 5
      // 0a8: aload 5
      // 0aa: ldc "getString(...)"
      // 0ac: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0af: aload 5
      // 0b1: bipush 47
      // 0b3: aconst_null
      // 0b4: bipush 2
      // 0b5: aconst_null
      // 0b6: invokestatic kotlin/text/h.V0 (Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
      // 0b9: astore 5
      // 0bb: goto 093
      // 0be: aload 6
      // 0c0: aload 6
      // 0c2: ldc "_id"
      // 0c4: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0c9: invokeinterface android/database/Cursor.getLong (I)J 2
      // 0ce: lstore 3
      // 0cf: aload 6
      // 0d1: aload 6
      // 0d3: ldc "_display_name"
      // 0d5: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0da: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0df: astore 7
      // 0e1: aload 7
      // 0e3: ldc "getString(...)"
      // 0e5: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e8: aload 5
      // 0ea: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 0ed: new com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData
      // 0f0: dup
      // 0f1: lload 3
      // 0f2: aload 7
      // 0f4: aload 5
      // 0f6: aload 1
      // 0f7: aload 6
      // 0f9: aload 6
      // 0fb: ldc "date_added"
      // 0fd: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 102: invokeinterface android/database/Cursor.getLong (I)J 2
      // 107: invokespecial com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData.<init> (JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V
      // 10a: astore 1
      // 10b: aload 6
      // 10d: aconst_null
      // 10e: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 111: aload 1
      // 112: areturn
      // 113: aload 1
      // 114: athrow
      // 115: astore 5
      // 117: aload 6
      // 119: aload 1
      // 11a: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 11d: aload 5
      // 11f: athrow
      // 120: aload 6
      // 122: aconst_null
      // 123: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 126: aconst_null
      // 127: areturn
   }

   private fun Long.isWithinCurrentTimeWindow(window: Long): Boolean {
      val var5: Boolean;
      if (Math.abs(System.currentTimeMillis() / (long)1000 - var1) <= var3) {
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   private fun process(uri: Uri) {
      val var2: ScreenshotContentObserver.ScreenshotData = this.getScreenshotData(var1);
      if (var2 != null) {
         if (this.lastProcessedPath == null || !h.v(this.lastProcessedPath, var2.getPath(), false, 2, null)) {
            if (ScreenshotContentObserver.Companion.access$isScreenshotPath(Companion, var2.getPath())
               && this.isWithinCurrentTimeWindow(var2.getDateAdded(), 10L)) {
               this.lastProcessedPath = var2.getPath();
               this.onScreenshot.invoke();
            }
         }
      }
   }

   public fun connect() {
      this.contentResolver.registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this);
   }

   public fun disconnect() {
      this.contentResolver.unregisterContentObserver(this);
   }

   public open fun onChange(selfChange: Boolean, uri: Uri?) {
      super.onChange(var1, var2);
      if (var2 != null) {
         val var3: java.lang.String = var2.toString();
         q.g(var3, "toString(...)");
         val var4: java.lang.String = Media.EXTERNAL_CONTENT_URI.toString();
         q.g(var4, "toString(...)");
         if (h.H(var3, var4, false, 2, null)) {
            try {
               this.process(var2);
            } catch (var5: Exception) {
               Log.INSTANCE.e("ScreenshotObserver", "Screenshot error", var5);
            }
         }
      }
   }

   public companion object {
      private const val DEFAULT_DETECT_WINDOW_SECONDS: Long
      public const val IS_PENDING_TRUE: Int
      private const val SORT_ORDER: String

      private fun String.isScreenshotPath(): Boolean {
         val var2: Locale = Locale.getDefault();
         q.g(var2, "getDefault(...)");
         var1 = var1.toLowerCase(var2);
         q.g(var1, "toLowerCase(...)");
         return h.M(var1, "screenshots/", false, 2, null);
      }
   }

   public data class ScreenshotData(id: Long, fileName: String, relativePath: String, uri: Uri, dateAdded: Long) {
      public final val dateAdded: Long
      public final val fileName: String
      public final val id: Long
      public final val path: String
      public final val relativePath: String
      public final val uri: Uri

      init {
         q.h(var3, "fileName");
         q.h(var4, "relativePath");
         q.h(var5, "uri");
         super();
         this.id = var1;
         this.fileName = var3;
         this.relativePath = var4;
         this.uri = var5;
         this.dateAdded = var6;
         val var8: StringBuilder = new StringBuilder();
         var8.append(var4);
         var8.append("/");
         var8.append(var3);
         this.path = var8.toString();
      }

      public operator fun component1(): Long {
         return this.id;
      }

      public operator fun component2(): String {
         return this.fileName;
      }

      public operator fun component3(): String {
         return this.relativePath;
      }

      public operator fun component4(): Uri {
         return this.uri;
      }

      public operator fun component5(): Long {
         return this.dateAdded;
      }

      public fun copy(
         id: Long = var0.id,
         fileName: String = var0.fileName,
         relativePath: String = var0.relativePath,
         uri: Uri = var0.uri,
         dateAdded: Long = var0.dateAdded
      ): com.discord.bug_reporter.ScreenshotContentObserver.ScreenshotData {
         q.h(var3, "fileName");
         q.h(var4, "relativePath");
         q.h(var5, "uri");
         return new ScreenshotContentObserver.ScreenshotData(var1, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ScreenshotContentObserver.ScreenshotData) {
            return false;
         } else {
            var1 = var1;
            if (this.id != var1.id) {
               return false;
            } else if (!q.c(this.fileName, var1.fileName)) {
               return false;
            } else if (!q.c(this.relativePath, var1.relativePath)) {
               return false;
            } else if (!q.c(this.uri, var1.uri)) {
               return false;
            } else {
               return this.dateAdded == var1.dateAdded;
            }
         }
      }

      public override fun hashCode(): Int {
         return (((java.lang.Long.hashCode(this.id) * 31 + this.fileName.hashCode()) * 31 + this.relativePath.hashCode()) * 31 + this.uri.hashCode()) * 31
            + java.lang.Long.hashCode(this.dateAdded);
      }

      public override fun toString(): String {
         val var1: Long = this.id;
         val var8: java.lang.String = this.fileName;
         val var6: java.lang.String = this.relativePath;
         val var5: Uri = this.uri;
         val var3: Long = this.dateAdded;
         val var7: StringBuilder = new StringBuilder();
         var7.append("ScreenshotData(id=");
         var7.append(var1);
         var7.append(", fileName=");
         var7.append(var8);
         var7.append(", relativePath=");
         var7.append(var6);
         var7.append(", uri=");
         var7.append(var5);
         var7.append(", dateAdded=");
         var7.append(var3);
         var7.append(")");
         return var7.toString();
      }
   }
}
