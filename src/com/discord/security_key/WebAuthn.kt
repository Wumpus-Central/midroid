package com.discord.security_key

import android.app.Activity
import android.app.PendingIntent
import android.content.Intent
import android.util.Base64
import android.util.JsonReader
import com.discord.logging.Log
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder
import com.google.android.gms.tasks.Task
import gh.a0
import gh.q
import gh.r
import gh.s
import gh.v
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import org.json.JSONObject
import org.json.JSONTokener

public class WebAuthn(resolve: (String) -> Unit, reject: (String) -> Unit) {
   public final val resolve: (String) -> Unit
   public final val reject: (String) -> Unit

   init {
      this.resolve = var1;
      this.reject = var2;
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$3`(var0: Activity, var1: PendingIntent): Unit {
      var0.startIntentSenderForResult(var1.getIntentSender(), 4002, null, 0, 0, 0);
      return Unit.a;
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$4`(var0: Function1, var1: Any) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$5`(var0: WebAuthn, var1: Exception) {
      var0.reject.invoke("task failed");
   }

   private fun String.decodeBase64(): ByteArray {
      val var2: ByteArray = Base64.decode(var1, 11);
      return var2;
   }

   private fun parseAuthenticationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseAuthenticationExtensions: Parsing authentication extensions...", null, 4, null);
      val var3: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var6: java.lang.String = var1.nextName();
         if (var6 != null) {
            val var2: Int = var6.hashCode();
            if (var2 != 116204) {
               if (var2 != 93029116) {
                  if (var2 == 757680504 && var6.equals("largeBlob")) {
                     Log.w$default(
                        Log.INSTANCE,
                        "DCDSecurityKeyManager.WebAuthn",
                        "parseAuthenticationExtensions: ... largeBlob extension: unsupported, skipping",
                        null,
                        4,
                        null
                     );
                     var1.skipValue();
                     continue;
                  }
               } else if (var6.equals("appid")) {
                  val var5: java.lang.String = var1.nextString();
                  val var4: Log = Log.INSTANCE;
                  val var12: StringBuilder = new StringBuilder();
                  var12.append("parseAuthenticationExtensions: ... appid extension: `");
                  var12.append(var5);
                  var12.append("`");
                  Log.i$default(var4, "DCDSecurityKeyManager.WebAuthn", var12.toString(), null, 4, null);
                  continue;
               }
            } else if (var6.equals("uvm")) {
               val var11: a0 = new a0(var1.nextBoolean());
               val var9: Log = Log.INSTANCE;
               val var13: StringBuilder = new StringBuilder();
               var13.append("parseAuthenticationExtensions: ... uvm extension: `");
               var13.append(var11);
               var13.append("`");
               Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn", var13.toString(), null, 4, null);
               continue;
            }
         }

         val var8: Log = Log.INSTANCE;
         val var10: StringBuilder = new StringBuilder();
         var10.append("parseAuthenticationExtensions: Found unrecognized extension: `");
         var10.append(var6);
         var10.append("`");
         Log.w$default(var8, "DCDSecurityKeyManager.WebAuthn", var10.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var7: AuthenticationExtensions = var3.a();
      return var7;
   }

   private fun parseCredentialDescriptors(reader: JsonReader): List<s> {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: Processing credential descriptors...", null, 4, null);
      val var4: ArrayList = new ArrayList();
      var1.beginArray();

      while (var1.hasNext()) {
         Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: Found new descriptor", null, 4, null);
         var1.beginObject();
         var var3: ByteArray = null;

         while (var1.hasNext()) {
            val var6: java.lang.String = var1.nextName();
            if (var6 != null) {
               val var2: Int = var6.hashCode();
               if (var2 != -1717834134) {
                  if (var2 != 3355) {
                     if (var2 == 3575610 && var6.equals("type")) {
                        Log.w$default(
                           Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: ... skipping unsupported field `type`", null, 4, null
                        );
                        var1.skipValue();
                        continue;
                     }
                  } else if (var6.equals("id")) {
                     val var5: java.lang.String = var1.nextString();
                     val var10: Log = Log.INSTANCE;
                     val var14: StringBuilder = new StringBuilder();
                     var14.append("parseCredentialDescriptors: ... id: `");
                     var14.append(var5);
                     var14.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn", var14.toString(), null, 4, null);
                     var3 = this.decodeBase64(var5);
                     continue;
                  }
               } else if (var6.equals("transports")) {
                  Log.w$default(
                     Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: ... skipping unsupported field `transports`", null, 4, null
                  );
                  var1.skipValue();
                  continue;
               }
            }

            val var7: Log = Log.INSTANCE;
            val var12: StringBuilder = new StringBuilder();
            var12.append("parseCredentialDescriptors: ... skipping unrecognized field `");
            var12.append(var6);
            var12.append("`");
            Log.w$default(var7, "DCDSecurityKeyManager.WebAuthn", var12.toString(), null, 4, null);
            var1.skipValue();
         }

         var1.endObject();
         val var13: java.lang.String = v.e.toString();
         var4.add(new s(var13, var3, null));
      }

      var1.endArray();
      val var11: Log = Log.INSTANCE;
      val var9: Int = var4.size();
      val var8: StringBuilder = new StringBuilder();
      var8.append("parseCredentialDescriptors: Processed ");
      var8.append(var9);
      var8.append(" descriptors");
      Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn", var8.toString(), null, 4, null);
      return var4;
   }

   private fun parsePublicKeyCredentialRequestOptions(requestOptions: String): PublicKeyCredentialRequestOptions {
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
      // 00: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 03: astore 2
      // 04: new java/lang/StringBuilder
      // 07: dup
      // 08: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b: astore 3
      // 0c: aload 3
      // 0d: ldc_w "parsePublicKeyCredentialRequestOptions: "
      // 10: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13: pop
      // 14: aload 3
      // 15: aload 1
      // 16: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19: pop
      // 1a: aload 2
      // 1b: ldc "DCDSecurityKeyManager.WebAuthn"
      // 1d: aload 3
      // 1e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21: aconst_null
      // 22: bipush 4
      // 23: aconst_null
      // 24: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 27: new com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder
      // 2a: dup
      // 2b: invokespecial com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.<init> ()V
      // 2e: astore 2
      // 2f: new android/util/JsonReader
      // 32: dup
      // 33: new java/io/StringReader
      // 36: dup
      // 37: aload 1
      // 38: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 3b: invokespecial android/util/JsonReader.<init> (Ljava/io/Reader;)V
      // 3e: astore 1
      // 3f: aload 1
      // 40: invokevirtual android/util/JsonReader.beginObject ()V
      // 43: aload 1
      // 44: invokevirtual android/util/JsonReader.hasNext ()Z
      // 47: ifeq a4
      // 4a: aload 1
      // 4b: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 4e: astore 3
      // 4f: aload 3
      // 50: ldc_w "publicKey"
      // 53: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 56: ifeq 66
      // 59: aload 0
      // 5a: aload 1
      // 5b: aload 2
      // 5c: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 5f: goto 43
      // 62: astore 3
      // 63: goto bf
      // 66: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 69: astore 4
      // 6b: new java/lang/StringBuilder
      // 6e: astore 5
      // 70: aload 5
      // 72: invokespecial java/lang/StringBuilder.<init> ()V
      // 75: aload 5
      // 77: ldc_w "parsePublicKeyCredentialRequestOptions: Found unexpected key in request options: `"
      // 7a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d: pop
      // 7e: aload 5
      // 80: aload 3
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: pop
      // 85: aload 5
      // 87: ldc_w "`, skipping"
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: pop
      // 8e: aload 4
      // 90: ldc "DCDSecurityKeyManager.WebAuthn"
      // 92: aload 5
      // 94: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 97: aconst_null
      // 98: bipush 4
      // 99: aconst_null
      // 9a: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 9d: aload 1
      // 9e: invokevirtual android/util/JsonReader.skipValue ()V
      // a1: goto 43
      // a4: aload 1
      // a5: invokevirtual android/util/JsonReader.endObject ()V
      // a8: getstatic kotlin/Unit.a Lkotlin/Unit;
      // ab: astore 3
      // ac: aload 1
      // ad: aconst_null
      // ae: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // b1: aload 2
      // b2: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // b5: astore 1
      // b6: aload 1
      // b7: ldc_w "build(...)"
      // ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // bd: aload 1
      // be: areturn
      // bf: aload 3
      // c0: athrow
      // c1: astore 2
      // c2: aload 1
      // c3: aload 3
      // c4: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // c7: aload 2
      // c8: athrow
   }

   private fun parseRequestOptions(reader: JsonReader, builder: Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing request options...", null, 4, null);

      while (var1.hasNext()) {
         val var7: java.lang.String = var1.nextName();
         if (var7 != null) {
            switch (var7.hashCode()) {
               case -1809421292:
                  if (var7.equals("extensions")) {
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var7.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var11: Log = Log.INSTANCE;
                     val var16: StringBuilder = new StringBuilder();
                     var16.append("parseRequestOptions: timeout: `");
                     var16.append(var3);
                     var16.append("`");
                     Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn", var16.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 3506169:
                  if (var7.equals("rpId")) {
                     val var10: java.lang.String = var1.nextString();
                     val var15: Log = Log.INSTANCE;
                     val var20: StringBuilder = new StringBuilder();
                     var20.append("parseRequestOptions: rpId: `");
                     var20.append(var10);
                     var20.append("`");
                     Log.i$default(var15, "DCDSecurityKeyManager.WebAuthn", var20.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 493711347:
                  if (var7.equals("allowCredentials")) {
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var7.equals("challenge")) {
                     val var14: java.lang.String = var1.nextString();
                     val var9: Log = Log.INSTANCE;
                     val var19: StringBuilder = new StringBuilder();
                     var19.append("parseRequestOptions: challenge: `");
                     var19.append(var14);
                     var19.append("`");
                     Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn", var19.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var7.equals("userVerification")) {
                     val var6: java.lang.String = var1.nextString();
                     val var18: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("parseRequestOptions: userVerification: `");
                     var5.append(var6);
                     var5.append("`, skipping");
                     Log.w$default(var18, "DCDSecurityKeyManager.WebAuthn", var5.toString(), null, 4, null);
                     continue;
                  }
               default:
            }
         }

         val var12: Log = Log.INSTANCE;
         val var17: StringBuilder = new StringBuilder();
         var17.append("parseRequestOptions: Found unrecognized option: `");
         var17.append(var7);
         var17.append("`, skipping");
         Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn", var17.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
   }

   @JvmStatic
   fun `registerSecurityKey$lambda$0`(var0: Activity, var1: PendingIntent): Unit {
      var0.startIntentSenderForResult(var1.getIntentSender(), 4001, null, 0, 0, 0);
      return Unit.a;
   }

   @JvmStatic
   fun `registerSecurityKey$lambda$1`(var0: Function1, var1: Any) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `registerSecurityKey$lambda$2`(var0: WebAuthn, var1: Exception) {
      var0.reject.invoke("task failed");
   }

   public fun authenticateSecurityKey(requestOptions: String, currentActivity: Activity?) {
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: fh.a = eh.a.a(var2);
         val var4: Task = var3.D(this.parsePublicKeyCredentialRequestOptions(var1));
         var4.f(new b(new a(var2)));
         var4.d(new com.discord.security_key.c(this));
      }
   }

   public fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
      if (var1 == 4001 || var1 == 4002) {
         if (var2 != -1) {
            this.reject.invoke("activity failed");
            return;
         }

         val var6: ByteArray;
         if (var3 != null) {
            var6 = var3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
         } else {
            var6 = null;
         }

         if (var6 == null) {
            this.reject.invoke("credential data missing");
            return;
         }

         val var7: q = q.b(var6);
         if (var7.h() is gh.h) {
            val var5: Function1 = this.reject;
            val var10: gh.i = var7.h();
            val var13: java.lang.String = (var10 as gh.h).d();
            var var11: java.lang.String = var13;
            if (var13 == null) {
               var11 = "Unknown error";
            }

            var5.invoke(var11);
            return;
         }

         if (var1 == 4001) {
            val var12: Function1 = this.resolve;
            val var9: java.lang.String = var7.j();
            var12.invoke(var9);
            return;
         }

         if (var1 == 4002) {
            val var4: Function1 = this.resolve;
            val var8: java.lang.String = var7.j();
            var4.invoke(var8);
            return;
         }
      }
   }

   public fun registerSecurityKey(creationOptionsJSON: String, currentActivity: Activity?) {
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: fh.a = eh.a.a(var2);
         var1 = new JSONObject(new JSONTokener(var1)).getJSONObject("publicKey").toString();
         val var5: Task = var3.C(new r(var1));
         var5.f(new com.discord.security_key.e(new com.discord.security_key.d(var2)));
         var5.d(new com.discord.security_key.f(this));
      }
   }

   public companion object {
      private const val REQUEST_CODE_REGISTER_SK: Int
      private const val REQUEST_CODE_AUTHENTICATE_SK: Int
      private const val BASE64_FLAG: Int
      private const val TAG: String
   }
}
