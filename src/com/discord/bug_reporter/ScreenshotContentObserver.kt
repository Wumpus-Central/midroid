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
   private final val onScreenshot: () -> Unit
   private final var lastProcessedPath: String?

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

      return c.w(c.w(new java.lang.String[]{"_display_name", "date_added", "_id"}, var2), var3) as Array<java.lang.String>;
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
      // 010: astore 7
      // 012: aload 7
      // 014: ifnull 11e
      // 017: aload 7
      // 019: invokeinterface android/database/Cursor.moveToFirst ()Z 1
      // 01e: ifeq 028
      // 021: aload 7
      // 023: astore 6
      // 025: goto 02b
      // 028: aconst_null
      // 029: astore 6
      // 02b: aload 6
      // 02d: ifnonnull 033
      // 030: goto 11e
      // 033: getstatic android/os/Build$VERSION.SDK_INT I
      // 036: istore 2
      // 037: iload 2
      // 038: bipush 29
      // 03a: if_icmplt 077
      // 03d: aload 7
      // 03f: aload 7
      // 041: ldc "is_pending"
      // 043: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 048: invokeinterface android/database/Cursor.getInt (I)I 2
      // 04d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 050: astore 6
      // 052: aload 6
      // 054: invokevirtual java/lang/Number.intValue ()I
      // 057: istore 3
      // 058: iload 3
      // 059: bipush 1
      // 05a: if_icmpne 060
      // 05d: goto 063
      // 060: aconst_null
      // 061: astore 6
      // 063: aload 6
      // 065: ifnull 06b
      // 068: goto 077
      // 06b: aload 7
      // 06d: aconst_null
      // 06e: invokestatic M9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 071: aconst_null
      // 072: areturn
      // 073: astore 1
      // 074: goto 111
      // 077: iload 2
      // 078: bipush 29
      // 07a: if_icmplt 092
      // 07d: aload 7
      // 07f: aload 7
      // 081: ldc "relative_path"
      // 083: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 088: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 08d: astore 6
      // 08f: goto 0ba
      // 092: aload 7
      // 094: aload 7
      // 096: ldc "_data"
      // 098: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 09d: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0a2: astore 6
      // 0a4: aload 6
      // 0a6: ldc "getString(...)"
      // 0a8: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ab: aload 6
      // 0ad: bipush 47
      // 0af: aconst_null
      // 0b0: bipush 2
      // 0b1: aconst_null
      // 0b2: invokestatic kotlin/text/h.X0 (Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
      // 0b5: astore 6
      // 0b7: goto 08f
      // 0ba: aload 7
      // 0bc: aload 7
      // 0be: ldc "_id"
      // 0c0: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0c5: invokeinterface android/database/Cursor.getLong (I)J 2
      // 0ca: lstore 4
      // 0cc: aload 7
      // 0ce: aload 7
      // 0d0: ldc "_display_name"
      // 0d2: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0d7: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0dc: astore 8
      // 0de: aload 8
      // 0e0: ldc "getString(...)"
      // 0e2: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e5: aload 6
      // 0e7: invokestatic kotlin/jvm/internal/r.e (Ljava/lang/Object;)V
      // 0ea: new com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData
      // 0ed: dup
      // 0ee: lload 4
      // 0f0: aload 8
      // 0f2: aload 6
      // 0f4: aload 1
      // 0f5: aload 7
      // 0f7: aload 7
      // 0f9: ldc "date_added"
      // 0fb: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 100: invokeinterface android/database/Cursor.getLong (I)J 2
      // 105: invokespecial com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData.<init> (JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V
      // 108: astore 1
      // 109: aload 7
      // 10b: aconst_null
      // 10c: invokestatic M9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 10f: aload 1
      // 110: areturn
      // 111: aload 1
      // 112: athrow
      // 113: astore 6
      // 115: aload 7
      // 117: aload 1
      // 118: invokestatic M9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 11b: aload 6
      // 11d: athrow
      // 11e: aload 7
      // 120: aconst_null
      // 121: invokestatic M9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 124: aconst_null
      // 125: areturn
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
         if (this.lastProcessedPath == null || !h.v(this.lastProcessedPath, var3.getPath(), false, 2, null)) {
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
         r.g(var3, "toString(...)");
         val var4: java.lang.String = Media.EXTERNAL_CONTENT_URI.toString();
         r.g(var4, "toString(...)");
         if (h.I(var3, var4, false, 2, null)) {
            try {
               this.process(var2);
            } catch (var5: Exception) {
               Log.INSTANCE.e("ScreenshotObserver", "Screenshot error", var5);
            }
         }
      }
   }

   public companion object {
      public const val IS_PENDING_TRUE: Int
      private const val DEFAULT_DETECT_WINDOW_SECONDS: Long
      private const val SORT_ORDER: String

      private fun String.isScreenshotPath(): Boolean {
         val var2: Locale = Locale.getDefault();
         r.g(var2, "getDefault(...)");
         var1 = var1.toLowerCase(var2);
         r.g(var1, "toLowerCase(...)");
         return h.N(var1, "screenshots/", false, 2, null);
      }
   }

   public data class ScreenshotData(id: Long, fileName: String, relativePath: String, uri: Uri, dateAdded: Long) {
      public final val id: Long
      public final val fileName: String
      public final val relativePath: String
      public final val uri: Uri
      public final val dateAdded: Long
      public final val path: String

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
         val var1: Long = this.id;
         val var5: java.lang.String = this.fileName;
         val var7: java.lang.String = this.relativePath;
         val var6: Uri = this.uri;
         val var3: Long = this.dateAdded;
         val var8: StringBuilder = new StringBuilder();
         var8.append("ScreenshotData(id=");
         var8.append(var1);
         var8.append(", fileName=");
         var8.append(var5);
         var8.append(", relativePath=");
         var8.append(var7);
         var8.append(", uri=");
         var8.append(var6);
         var8.append(", dateAdded=");
         var8.append(var3);
         var8.append(")");
         return var8.toString();
      }
   }
}
