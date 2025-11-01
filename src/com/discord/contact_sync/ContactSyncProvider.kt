package com.discord.contact_sync

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract.Data
import android.provider.ContactsContract.CommonDataKinds.Phone
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nContactSyncProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSyncProvider.kt\ncom/discord/contact_sync/ContactSyncProvider\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,169:1\n29#2:170\n*S KotlinDebug\n*F\n+ 1 ContactSyncProvider.kt\ncom/discord/contact_sync/ContactSyncProvider\n*L\n142#1:170\n*E\n"])
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
      // 0b: aload 2
      // 0c: ifnull 56
      // 0f: aload 2
      // 10: invokevirtual android/content/res/AssetFileDescriptor.getFileDescriptor ()Ljava/io/FileDescriptor;
      // 13: astore 1
      // 14: aload 1
      // 15: ifnull 41
      // 18: aload 1
      // 19: invokestatic android/graphics/BitmapFactory.decodeFileDescriptor (Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
      // 1c: astore 4
      // 1e: new java/io/ByteArrayOutputStream
      // 21: astore 1
      // 22: aload 1
      // 23: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 26: aload 4
      // 28: getstatic android/graphics/Bitmap$CompressFormat.JPEG Landroid/graphics/Bitmap$CompressFormat;
      // 2b: iload 3
      // 2c: aload 1
      // 2d: invokevirtual android/graphics/Bitmap.compress (Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      // 30: pop
      // 31: aload 1
      // 32: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 35: bipush 0
      // 36: invokestatic android/util/Base64.encodeToString ([BI)Ljava/lang/String;
      // 39: astore 1
      // 3a: goto 43
      // 3d: astore 1
      // 3e: goto 4a
      // 41: aconst_null
      // 42: astore 1
      // 43: aload 2
      // 44: aconst_null
      // 45: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 48: aload 1
      // 49: areturn
      // 4a: aload 1
      // 4b: athrow
      // 4c: astore 4
      // 4e: aload 2
      // 4f: aload 1
      // 50: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 53: aload 4
      // 55: athrow
      // 56: aconst_null
      // 57: areturn
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
      val var8: LinkedHashMap = new LinkedHashMap();
      val var7: Cursor = var1.getContentResolver()
         .query(Phone.CONTENT_URI, new java.lang.String[]{"_id", "data4", "display_name", "photo_file_id", "contact_id"}, null, null, null);
      if (var7 == null) {
         return var8;
      } else {
         while (var7.moveToNext()) {
            var var5: java.lang.String = this.getColumnString(var7, "display_name");
            val var10: java.lang.String = this.getColumnString(var7, "data4");
            val var9: java.lang.String = this.getColumnString(var7, "_id");
            var var3: java.lang.String = this.getColumnString(var7, "contact_id");
            if (var9 != null && var3 != null) {
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
               if (this.getColumnString(var7, "photo_file_id") != null) {
                  var2 = true;
               } else {
                  var2 = false;
               }

               if (var10 != null) {
                  if (var5 == null) {
                     var5 = "";
                  }

                  val var12: ContactSyncBlobEntry = var8.put(var10, new ContactSyncBlobEntry(var10, var5, var2, var9, var3, var13));
               }
            }
         }

         var7.close();
         return var8;
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
      // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "deviceContactId"
      // 09: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 1
      // 0d: invokevirtual android/content/Context.getContentResolver ()Landroid/content/ContentResolver;
      // 10: getstatic android/provider/ContactsContract$CommonDataKinds$Phone.CONTENT_URI Landroid/net/Uri;
      // 13: bipush 2
      // 14: anewarray 143
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
      // 24: anewarray 143
      // 27: dup
      // 28: bipush 0
      // 29: aload 2
      // 2a: aastore
      // 2b: aconst_null
      // 2c: invokevirtual android/content/ContentResolver.query (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      // 2f: astore 2
      // 30: aload 2
      // 31: ifnull 87
      // 34: aload 2
      // 35: invokeinterface android/database/Cursor.getCount ()I 1
      // 3a: ifle 74
      // 3d: aload 2
      // 3e: invokeinterface android/database/Cursor.moveToFirst ()Z 1
      // 43: pop
      // 44: getstatic com/discord/contact_sync/ContactSyncProvider.INSTANCE Lcom/discord/contact_sync/ContactSyncProvider;
      // 47: astore 3
      // 48: aload 3
      // 49: aload 2
      // 4a: ldc "photo_thumb_uri"
      // 4c: invokespecial com/discord/contact_sync/ContactSyncProvider.getColumnString (Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
      // 4f: astore 4
      // 51: aload 4
      // 53: ifnull 74
      // 56: aload 4
      // 58: invokestatic android/net/Uri.parse (Ljava/lang/String;)Landroid/net/Uri;
      // 5b: astore 4
      // 5d: aload 4
      // 5f: ifnull 74
      // 62: aload 3
      // 63: aload 4
      // 65: aload 1
      // 66: bipush 0
      // 67: bipush 2
      // 68: aconst_null
      // 69: invokestatic com/discord/contact_sync/ContactSyncProvider.asBase64BitmapString$default (Lcom/discord/contact_sync/ContactSyncProvider;Landroid/net/Uri;Landroid/content/Context;IILjava/lang/Object;)Ljava/lang/String;
      // 6c: astore 1
      // 6d: goto 76
      // 70: astore 3
      // 71: goto 7d
      // 74: aconst_null
      // 75: astore 1
      // 76: aload 2
      // 77: aconst_null
      // 78: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 7b: aload 1
      // 7c: areturn
      // 7d: aload 3
      // 7e: athrow
      // 7f: astore 1
      // 80: aload 2
      // 81: aload 3
      // 82: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 85: aload 1
      // 86: athrow
      // 87: aconst_null
      // 88: areturn
   }
}
