package com.discord.contact_sync

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract.Data
import android.provider.ContactsContract.CommonDataKinds.Phone
import java.util.LinkedHashMap
import kotlin.jvm.internal.r

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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:562)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 0e: ifnull 59
      // 11: aload 2
      // 12: invokevirtual android/content/res/AssetFileDescriptor.getFileDescriptor ()Ljava/io/FileDescriptor;
      // 15: astore 1
      // 16: aload 1
      // 17: ifnull 41
      // 1a: aload 1
      // 1b: invokestatic android/graphics/BitmapFactory.decodeFileDescriptor (Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
      // 1e: astore 1
      // 1f: new java/io/ByteArrayOutputStream
      // 22: astore 4
      // 24: aload 4
      // 26: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 29: aload 1
      // 2a: getstatic android/graphics/Bitmap$CompressFormat.JPEG Landroid/graphics/Bitmap$CompressFormat;
      // 2d: iload 3
      // 2e: aload 4
      // 30: invokevirtual android/graphics/Bitmap.compress (Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      // 33: pop
      // 34: aload 4
      // 36: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 39: bipush 0
      // 3a: invokestatic android/util/Base64.encodeToString ([BI)Ljava/lang/String;
      // 3d: astore 1
      // 3e: goto 43
      // 41: aconst_null
      // 42: astore 1
      // 43: aload 2
      // 44: aconst_null
      // 45: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 48: goto 59
      // 4b: astore 4
      // 4d: aload 4
      // 4f: athrow
      // 50: astore 1
      // 51: aload 2
      // 52: aload 4
      // 54: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 57: aload 1
      // 58: athrow
      // 59: aload 1
      // 5a: areturn
   }

   private fun Cursor.getColumnString(columnName: String): String? {
      return var1.getString(var1.getColumnIndexOrThrow(var2));
   }

   private fun getContactName(context: Context, contactId: String): ContactNameEntry? {
      val var5: StringBuilder = new StringBuilder();
      var5.append("mimetype = ? AND contact_id = ");
      var5.append(var2);
      val var9: Cursor = var1.getContentResolver().query(Data.CONTENT_URI, null, var5.toString(), new java.lang.String[]{"vnd.android.cursor.item/name"}, null);
      var2 = null;
      if (var9 == null) {
         return null;
      } else {
         var var12: java.lang.String = null;

         var var7: java.lang.String;
         var var8: java.lang.String;
         while (true) {
            var8 = var12;
            var7 = var2;
            if (!var9.moveToNext()) {
               break;
            }

            try {
               var16 = this.getColumnString(var9, "data2");
            } catch (var11: Exception) {
               var16 = var2;
            }

            var var6: java.lang.String;
            try {
               var6 = this.getColumnString(var9, "data3");
            } catch (var10: Exception) {
               var6 = var12;
            }

            var var3: Boolean;
            if (var16 != null && var16.length() != 0) {
               var3 = false;
            } else {
               var3 = true;
            }

            var8 = var6;
            var7 = var16;
            if (!var3) {
               break;
            }

            label41: {
               if (var6 != null) {
                  var3 = false;
                  if (var6.length() != 0) {
                     break label41;
                  }
               }

               var3 = true;
            }

            var12 = var6;
            var2 = var16;
            if (!var3) {
               var7 = var16;
               var8 = var6;
               break;
            }
         }

         var9.close();
         return new ContactNameEntry(var7, var8);
      }
   }

   public fun getContactsMap(context: Context): Map<String, ContactSyncBlobEntry> {
      r.h(var1, "context");
      val var7: LinkedHashMap = new LinkedHashMap();
      val var8: Cursor = var1.getContentResolver()
         .query(Phone.CONTENT_URI, new java.lang.String[]{"_id", "data4", "display_name", "photo_file_id", "contact_id"}, null, null, null);
      if (var8 == null) {
         return var7;
      } else {
         while (var8.moveToNext()) {
            val var6: java.lang.String = this.getColumnString(var8, "display_name");
            val var9: java.lang.String = this.getColumnString(var8, "data4");
            val var10: java.lang.String = this.getColumnString(var8, "_id");
            var var3: java.lang.String = this.getColumnString(var8, "contact_id");
            if (var10 != null && var3 != null) {
               var var4: ContactNameEntry;
               label45: {
                  var4 = this.getContactName(var1, var3);
                  if (var4 != null) {
                     var3 = var4.getGivenName();
                     if (var3 != null) {
                        break label45;
                     }
                  }

                  var3 = "";
               }

               label40: {
                  if (var4 != null) {
                     var13 = var4.getFamilyName();
                     if (var13 != null) {
                        break label40;
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

               if (var9 != null) {
                  var var5: java.lang.String = var6;
                  if (var6 == null) {
                     var5 = "";
                  }

                  val var12: ContactSyncBlobEntry = var7.put(var9, new ContactSyncBlobEntry(var9, var5, var2, var10, var3, var13));
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:562)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc "context"
      // 03: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "deviceContactId"
      // 09: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 33: ifnull 90
      // 36: aload 3
      // 37: invokeinterface android/database/Cursor.getCount ()I 1
      // 3c: ifle 79
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
      // 55: ifnull 79
      // 58: aload 4
      // 5a: invokestatic android/net/Uri.parse (Ljava/lang/String;)Landroid/net/Uri;
      // 5d: astore 4
      // 5f: aload 4
      // 61: ifnull 79
      // 64: aload 4
      // 66: ldc "parse(it)"
      // 68: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 6b: aload 2
      // 6c: aload 4
      // 6e: aload 1
      // 6f: bipush 0
      // 70: bipush 2
      // 71: aconst_null
      // 72: invokestatic com/discord/contact_sync/ContactSyncProvider.asBase64BitmapString$default (Lcom/discord/contact_sync/ContactSyncProvider;Landroid/net/Uri;Landroid/content/Context;IILjava/lang/Object;)Ljava/lang/String;
      // 75: astore 1
      // 76: goto 7b
      // 79: aconst_null
      // 7a: astore 1
      // 7b: aload 3
      // 7c: aconst_null
      // 7d: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 80: aload 1
      // 81: astore 2
      // 82: goto 90
      // 85: astore 1
      // 86: aload 1
      // 87: athrow
      // 88: astore 2
      // 89: aload 3
      // 8a: aload 1
      // 8b: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 8e: aload 2
      // 8f: athrow
      // 90: aload 2
      // 91: areturn
   }
}
