package com.discord.bug_reporter

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.database.ContentObserver
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Media
import com.discord.logging.Log
import java.util.Locale
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nScreenshotContentObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotContentObserver.kt\ncom/discord/bug_reporter/ScreenshotContentObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"])
internal class ScreenshotContentObserver(contentResolver: ContentResolver, onScreenshot: () -> Unit) : ContentObserver(null) {
   private final val contentResolver: ContentResolver
   private final val onScreenshot: () -> Unit
   private final var lastProcessedPath: String?

   init {
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

      return m.F(m.F(new java.lang.String[]{"_display_name", "date_added", "_id"}, var2), var3) as Array<java.lang.String>;
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
      // 014: ifnull 11f
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
      // 030: goto 11f
      // 033: getstatic android/os/Build$VERSION.SDK_INT I
      // 036: istore 3
      // 037: iload 3
      // 038: bipush 29
      // 03a: if_icmplt 078
      // 03d: aload 7
      // 03f: aload 7
      // 041: ldc "is_pending"
      // 043: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 048: invokeinterface android/database/Cursor.getInt (I)I 2
      // 04d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 050: astore 6
      // 052: aload 6
      // 054: invokevirtual java/lang/Number.intValue ()I
      // 057: istore 2
      // 058: iload 2
      // 059: bipush 1
      // 05a: if_icmpne 060
      // 05d: goto 063
      // 060: aconst_null
      // 061: astore 6
      // 063: aload 6
      // 065: ifnull 06b
      // 068: goto 078
      // 06b: aload 7
      // 06d: aconst_null
      // 06e: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 071: aconst_null
      // 072: areturn
      // 073: astore 6
      // 075: goto 112
      // 078: iload 3
      // 079: bipush 29
      // 07b: if_icmplt 093
      // 07e: aload 7
      // 080: aload 7
      // 082: ldc "relative_path"
      // 084: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 089: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 08e: astore 6
      // 090: goto 0bb
      // 093: aload 7
      // 095: aload 7
      // 097: ldc "_data"
      // 099: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 09e: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0a3: astore 6
      // 0a5: aload 6
      // 0a7: ldc "getString(...)"
      // 0a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ac: aload 6
      // 0ae: bipush 47
      // 0b0: aconst_null
      // 0b1: bipush 2
      // 0b2: aconst_null
      // 0b3: invokestatic kotlin/text/StringsKt.f1 (Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
      // 0b6: astore 6
      // 0b8: goto 090
      // 0bb: aload 7
      // 0bd: aload 7
      // 0bf: ldc "_id"
      // 0c1: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0c6: invokeinterface android/database/Cursor.getLong (I)J 2
      // 0cb: lstore 4
      // 0cd: aload 7
      // 0cf: aload 7
      // 0d1: ldc "_display_name"
      // 0d3: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 0d8: invokeinterface android/database/Cursor.getString (I)Ljava/lang/String; 2
      // 0dd: astore 8
      // 0df: aload 8
      // 0e1: ldc "getString(...)"
      // 0e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e6: aload 6
      // 0e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0eb: new com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData
      // 0ee: dup
      // 0ef: lload 4
      // 0f1: aload 8
      // 0f3: aload 6
      // 0f5: aload 1
      // 0f6: aload 7
      // 0f8: aload 7
      // 0fa: ldc "date_added"
      // 0fc: invokeinterface android/database/Cursor.getColumnIndex (Ljava/lang/String;)I 2
      // 101: invokeinterface android/database/Cursor.getLong (I)J 2
      // 106: invokespecial com/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData.<init> (JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V
      // 109: astore 1
      // 10a: aload 7
      // 10c: aconst_null
      // 10d: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 110: aload 1
      // 111: areturn
      // 112: aload 6
      // 114: athrow
      // 115: astore 1
      // 116: aload 7
      // 118: aload 6
      // 11a: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 11d: aload 1
      // 11e: athrow
      // 11f: aload 7
      // 121: aconst_null
      // 122: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 125: aconst_null
      // 126: areturn
   }

   private fun Long.isWithinCurrentTimeWindow(window: Long): Boolean {
      return Math.abs(System.currentTimeMillis() / (long)1000 - var1) <= var3;
   }

   private fun process(uri: Uri) {
      val var2: ScreenshotContentObserver.ScreenshotData = this.getScreenshotData(var1);
      if (var2 != null
         && (this.lastProcessedPath == null || !StringsKt.A(this.lastProcessedPath, var2.getPath(), false, 2, null))
         && ScreenshotContentObserver.Companion.access$isScreenshotPath(Companion, var2.getPath())
         && this.isWithinCurrentTimeWindow(var2.getDateAdded(), 10L)) {
         this.lastProcessedPath = var2.getPath();
         this.onScreenshot.invoke();
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
         val var4: java.lang.String = Media.EXTERNAL_CONTENT_URI.toString();
         if (StringsKt.N(var3, var4, false, 2, null)) {
            try {
               this.process(var2);
               return;
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
         var1 = var1.toLowerCase(var2);
         return StringsKt.T(var1, "screenshots/", false, 2, null);
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
            } else if (!(this.fileName == var1.fileName)) {
               return false;
            } else if (!(this.relativePath == var1.relativePath)) {
               return false;
            } else if (!(this.uri == var1.uri)) {
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
         val var5: java.lang.String = this.fileName;
         val var7: java.lang.String = this.relativePath;
         val var8: Uri = this.uri;
         val var1: Long = this.dateAdded;
         val var6: StringBuilder = new StringBuilder();
         var6.append("ScreenshotData(id=");
         var6.append(var3);
         var6.append(", fileName=");
         var6.append(var5);
         var6.append(", relativePath=");
         var6.append(var7);
         var6.append(", uri=");
         var6.append(var8);
         var6.append(", dateAdded=");
         var6.append(var1);
         var6.append(")");
         return var6.toString();
      }
   }
}
