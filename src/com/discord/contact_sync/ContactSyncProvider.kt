package com.discord.contact_sync

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract.Data
import android.provider.ContactsContract.CommonDataKinds.Phone
import java.util.LinkedHashMap
import kotlin.jvm.internal.q

public object ContactSyncProvider {
   private fun Uri.asBase64BitmapString(context: Context, quality: Int = 100): String? {
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
      // 00: aload 2
      // 01: invokevirtual android/content/Context.getContentResolver ()Landroid/content/ContentResolver;
      // 04: aload 1
      // 05: ldc "r"
      // 07: invokevirtual android/content/ContentResolver.openAssetFileDescriptor (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
      // 0a: astore 2
      // 0b: aconst_null
      // 0c: astore 1
      // 0d: aload 2
      // 0e: ifnull 5a
      // 11: aload 2
      // 12: invokevirtual android/content/res/AssetFileDescriptor.getFileDescriptor ()Ljava/io/FileDescriptor;
      // 15: astore 1
      // 16: aload 1
      // 17: ifnull 44
      // 1a: aload 1
      // 1b: invokestatic android/graphics/BitmapFactory.decodeFileDescriptor (Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
      // 1e: astore 4
      // 20: new java/io/ByteArrayOutputStream
      // 23: astore 1
      // 24: aload 1
      // 25: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 28: aload 4
      // 2a: getstatic android/graphics/Bitmap$CompressFormat.JPEG Landroid/graphics/Bitmap$CompressFormat;
      // 2d: iload 3
      // 2e: aload 1
      // 2f: invokevirtual android/graphics/Bitmap.compress (Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      // 32: pop
      // 33: aload 1
      // 34: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 37: bipush 0
      // 38: invokestatic android/util/Base64.encodeToString ([BI)Ljava/lang/String;
      // 3b: astore 1
      // 3c: goto 46
      // 3f: astore 4
      // 41: goto 4e
      // 44: aconst_null
      // 45: astore 1
      // 46: aload 2
      // 47: aconst_null
      // 48: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 4b: goto 5a
      // 4e: aload 4
      // 50: athrow
      // 51: astore 1
      // 52: aload 2
      // 53: aload 4
      // 55: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 58: aload 1
      // 59: athrow
      // 5a: aload 1
      // 5b: areturn
   }

   private fun Cursor.getColumnString(columnName: String): String? {
      return var1.getString(var1.getColumnIndexOrThrow(var2));
   }

   private fun getContactName(context: Context, contactId: String): ContactNameEntry? {
      val var3: StringBuilder = new StringBuilder();
      var3.append("mimetype = ? AND contact_id = ");
      var3.append(var2);
      val var7: Cursor = var1.getContentResolver().query(Data.CONTENT_URI, null, var3.toString(), new java.lang.String[]{"vnd.android.cursor.item/name"}, null);
      var2 = null;
      if (var7 == null) {
         return null;
      } else {
         var var10: java.lang.String = null;

         var var5: java.lang.String;
         var var6: java.lang.String;
         while (true) {
            var5 = var10;
            var6 = var2;
            if (!var7.moveToNext()) {
               break;
            }

            try {
               var13 = this.getColumnString(var7, "data2");
            } catch (var9: Exception) {
               var13 = var2;
            }

            var var4: java.lang.String;
            try {
               var4 = this.getColumnString(var7, "data3");
            } catch (var8: Exception) {
               var4 = var10;
            }

            if (var13 != null) {
               var5 = var4;
               var6 = var13;
               if (var13.length() != 0) {
                  break;
               }
            }

            var10 = var4;
            var2 = var13;
            if (var4 != null) {
               var5 = var4;
               var6 = var13;
               if (var4.length() != 0) {
                  break;
               }

               var10 = var4;
               var2 = var13;
            }
         }

         var7.close();
         return new ContactNameEntry(var6, var5);
      }
   }

   public fun getContactsMap(context: Context): Map<String, ContactSyncBlobEntry> {
      q.h(var1, "context");
      val var7: LinkedHashMap = new LinkedHashMap();
      val var8: Cursor = var1.getContentResolver()
         .query(Phone.CONTENT_URI, new java.lang.String[]{"_id", "data4", "display_name", "photo_file_id", "contact_id"}, null, null, null);
      if (var8 == null) {
         return var7;
      } else {
         while (var8.moveToNext()) {
            val var6: java.lang.String = this.getColumnString(var8, "display_name");
            val var10: java.lang.String = this.getColumnString(var8, "data4");
            val var9: java.lang.String = this.getColumnString(var8, "_id");
            var var3: java.lang.String = this.getColumnString(var8, "contact_id");
            if (var9 != null && var3 != null) {
               var var4: ContactNameEntry;
               label46: {
                  var4 = this.getContactName(var1, var3);
                  if (var4 != null) {
                     var3 = var4.getGivenName();
                     if (var3 != null) {
                        break label46;
                     }
                  }

                  var3 = "";
               }

               label41: {
                  if (var4 != null) {
                     var13 = var4.getFamilyName();
                     if (var13 != null) {
                        break label41;
                     }
                  }

                  var13 = "";
               }

               val var2: Boolean;
               if (this.getColumnString(var8, "photo_file_id") != null) {
                  var2 = true;
               } else {
                  var2 = false;
               }

               if (var10 != null) {
                  var var5: java.lang.String = var6;
                  if (var6 == null) {
                     var5 = "";
                  }

                  val var12: ContactSyncBlobEntry = var7.put(var10, new ContactSyncBlobEntry(var10, var5, var2, var9, var3, var13));
               }
            }
         }

         var8.close();
         return var7;
      }
   }

   public fun getImageForContactId(context: Context, deviceContactId: String): String? {
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
      // 00: aload 1
      // 01: ldc "context"
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "deviceContactId"
      // 09: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 1
      // 0d: invokevirtual android/content/Context.getContentResolver ()Landroid/content/ContentResolver;
      // 10: getstatic android/provider/ContactsContract$CommonDataKinds$Phone.CONTENT_URI Landroid/net/Uri;
      // 13: bipush 2
      // 14: anewarray 139
      // 17: dup
      // 18: bipush 0
      // 19: ldc "_id"
      // 1b: aastore
      // 1c: dup
      // 1d: bipush 1
      // 1e: ldc "photo_thumb_uri"
      // 20: aastore
      // 21: ldc "_id = ?"
      // 23: bipush 1
      // 24: anewarray 139
      // 27: dup
      // 28: bipush 0
      // 29: aload 2
      // 2a: aastore
      // 2b: aconst_null
      // 2c: invokevirtual android/content/ContentResolver.query (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      // 2f: astore 3
      // 30: aconst_null
      // 31: astore 2
      // 32: aload 3
      // 33: ifnull 91
      // 36: aload 3
      // 37: invokeinterface android/database/Cursor.getCount ()I 1
      // 3c: ifle 7b
      // 3f: aload 3
      // 40: invokeinterface android/database/Cursor.moveToFirst ()Z 1
      // 45: pop
      // 46: getstatic com/discord/contact_sync/ContactSyncProvider.INSTANCE Lcom/discord/contact_sync/ContactSyncProvider;
      // 49: astore 2
      // 4a: aload 2
      // 4b: aload 3
      // 4c: ldc "photo_thumb_uri"
      // 4e: invokespecial com/discord/contact_sync/ContactSyncProvider.getColumnString (Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
      // 51: astore 4
      // 53: aload 4
      // 55: ifnull 7b
      // 58: aload 4
      // 5a: invokestatic android/net/Uri.parse (Ljava/lang/String;)Landroid/net/Uri;
      // 5d: astore 4
      // 5f: aload 4
      // 61: ifnull 7b
      // 64: aload 4
      // 66: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 69: aload 2
      // 6a: aload 4
      // 6c: aload 1
      // 6d: bipush 0
      // 6e: bipush 2
      // 6f: aconst_null
      // 70: invokestatic com/discord/contact_sync/ContactSyncProvider.asBase64BitmapString$default (Lcom/discord/contact_sync/ContactSyncProvider;Landroid/net/Uri;Landroid/content/Context;IILjava/lang/Object;)Ljava/lang/String;
      // 73: astore 1
      // 74: goto 7d
      // 77: astore 1
      // 78: goto 87
      // 7b: aconst_null
      // 7c: astore 1
      // 7d: aload 3
      // 7e: aconst_null
      // 7f: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 82: aload 1
      // 83: astore 2
      // 84: goto 91
      // 87: aload 1
      // 88: athrow
      // 89: astore 2
      // 8a: aload 3
      // 8b: aload 1
      // 8c: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 8f: aload 2
      // 90: athrow
      // 91: aload 2
      // 92: areturn
   }
}
