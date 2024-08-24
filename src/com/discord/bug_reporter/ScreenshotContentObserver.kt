package com.discord.bug_reporter

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.database.ContentObserver
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Media
import com.discord.logging.Log
import java.util.Locale
import kotlin.jvm.internal.r

internal class ScreenshotContentObserver(contentResolver: ContentResolver, onScreenshot: () -> Unit) : ContentObserver {
   private final val contentResolver: ContentResolver
   private final var lastProcessedPath: String?
   private final val onScreenshot: () -> Unit

   init {
      r.h(var1, "contentResolver");
      r.h(var2, "onScreenshot");
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

      return b.q(b.q(new java.lang.String[]{"_display_name", "date_added", "_id"}, var2), var3) as java.lang.String[];
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:562)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 010: astore 8
      // 012: aload 8
      // 014: ifnull 131
      // 017: aload 8
      // 019: invokeinterface android/database/Cursor.moveToFirst ()Z 1
      // 01e: ifeq 028
      // 021: aload 8
      // 023: astore 7
      // 025: goto 02b
      // 028: aconst_null
      // 029: astore 7
      // 02b: aload 7
      // 02d: ifnonnull 033
      // 030: goto 131
      // 033: getstatic android/os/Build$VERSION.SDK_INT I
      // 036: istore 3
      // 037: iload 3
      // 038: bipush 29
      // 03a: if_icmplt 086
      // 03d: aload 8
      // 03f: aload 8
      // 041: ldc "is_pending"
      // 043: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 048: invokeinterface android/database/Cursor.getInt (I)I 2
      // 04d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 050: astore 7
      // 052: aload 7
      // 054: invokevirtual java/lang/Number.intValue ()I
      // 057: istore 4
      // 059: bipush 1
      // 05a: istore 2
      // 05b: iload 4
      // 05d: bipush 1
      // 05e: if_icmpne 064
      // 061: goto 066
      // 064: bipush 0
      // 065: istore 2
      // 066: iload 2
      // 067: ifeq 06d
      // 06a: goto 070
      // 06d: aconst_null
      // 06e: astore 7
      // 070: aload 7
      // 072: ifnull 07e
      // 075: aload 7
      // 077: invokevirtual java/lang/Integer.intValue ()I
      // 07a: pop
      // 07b: goto 086
      // 07e: aload 8
      // 080: aconst_null
      // 081: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 084: aconst_null
      // 085: areturn
      // 086: iload 3
      // 087: bipush 29
      // 089: if_icmplt 0a1
      // 08c: aload 8
      // 08e: aload 8
      // 090: ldc "relative_path"
      // 092: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 097: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 09c: astore 7
      // 09e: goto 0c9
      // 0a1: aload 8
      // 0a3: aload 8
      // 0a5: ldc "_data"
      // 0a7: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0ac: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0b1: astore 7
      // 0b3: aload 7
      // 0b5: ldc "cursor.getString(cursor.…mages.ImageColumns.DATA))"
      // 0b7: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ba: aload 7
      // 0bc: bipush 47
      // 0be: aconst_null
      // 0bf: bipush 2
      // 0c0: aconst_null
      // 0c1: invokestatic kotlin/text/f.U0 (Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
      // 0c4: astore 7
      // 0c6: goto 09e
      // 0c9: aload 8
      // 0cb: aload 8
      // 0cd: ldc "_id"
      // 0cf: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0d4: invokeinterface android/database/Cursor.getLong (I)J 2
      // 0d9: lstore 5
      // 0db: aload 8
      // 0dd: aload 8
      // 0df: ldc "_display_name"
      // 0e1: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0e6: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0eb: astore 9
      // 0ed: aload 9
      // 0ef: ldc "cursor.getString(cursor.…ages.Media.DISPLAY_NAME))"
      // 0f1: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f4: aload 7
      // 0f6: ldc "relativePath"
      // 0f8: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0fb: new com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData
      // 0fe: dup
      // 0ff: lload 5
      // 101: aload 9
      // 103: aload 7
      // 105: aload 1
      // 106: aload 8
      // 108: aload 8
      // 10a: ldc "date_added"
      // 10c: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 111: invokeinterface android/database/Cursor.getLong (I)J 2
      // 116: invokespecial com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData.<init> (JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V
      // 119: astore 1
      // 11a: aload 8
      // 11c: aconst_null
      // 11d: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 120: aload 1
      // 121: areturn
      // 122: astore 7
      // 124: aload 7
      // 126: athrow
      // 127: astore 1
      // 128: aload 8
      // 12a: aload 7
      // 12c: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 12f: aload 1
      // 130: athrow
      // 131: aload 8
      // 133: aconst_null
      // 134: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 137: aconst_null
      // 138: areturn
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
      val var3: ScreenshotContentObserver.ScreenshotData = this.getScreenshotData(var1);
      if (var3 != null) {
         if (this.lastProcessedPath == null || !f.v(this.lastProcessedPath, var3.getPath(), false, 2, null)) {
            if (ScreenshotContentObserver.Companion.access$isScreenshotPath(Companion, var3.getPath())
               && this.isWithinCurrentTimeWindow(var3.getDateAdded(), 10L)) {
               this.lastProcessedPath = var3.getPath();
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
         r.g(var3, "uri.toString()");
         val var4: java.lang.String = Media.EXTERNAL_CONTENT_URI.toString();
         r.g(var4, "EXTERNAL_CONTENT_URI.toString()");
         if (f.I(var3, var4, false, 2, null)) {
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
         r.g(var2, "getDefault()");
         var1 = var1.toLowerCase(var2);
         r.g(var1, "this as java.lang.String).toLowerCase(locale)");
         return f.N(var1, "screenshots/", false, 2, null);
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
         r.h(var3, "fileName");
         r.h(var4, "relativePath");
         r.h(var5, "uri");
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
         r.h(var3, "fileName");
         r.h(var4, "relativePath");
         r.h(var5, "uri");
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
            } else if (!r.c(this.fileName, var1.fileName)) {
               return false;
            } else if (!r.c(this.relativePath, var1.relativePath)) {
               return false;
            } else if (!r.c(this.uri, var1.uri)) {
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
         val var3: Long = this.id;
         val var6: java.lang.String = this.fileName;
         val var7: java.lang.String = this.relativePath;
         val var8: Uri = this.uri;
         val var1: Long = this.dateAdded;
         val var5: StringBuilder = new StringBuilder();
         var5.append("ScreenshotData(id=");
         var5.append(var3);
         var5.append(", fileName=");
         var5.append(var6);
         var5.append(", relativePath=");
         var5.append(var7);
         var5.append(", uri=");
         var5.append(var8);
         var5.append(", dateAdded=");
         var5.append(var1);
         var5.append(")");
         return var5.toString();
      }
   }
}
