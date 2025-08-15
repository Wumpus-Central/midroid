package com.discord.security_key

import X5.g
import X5.m
import X5.n
import X5.o
import X5.p
import X5.t
import android.app.Activity
import android.app.PendingIntent
import android.content.Intent
import android.util.Base64
import android.util.JsonReader
import com.discord.logging.Log
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.Builder
import com.google.android.gms.tasks.Task
import java.util.ArrayList
import kotlin.jvm.functions.Function1

public class WebAuthn(resolve: (String) -> Unit, reject: (String) -> Unit) {
   public final val resolve: (String) -> Unit
   public final val reject: (String) -> Unit

   init {
      this.resolve = var1;
      this.reject = var2;
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$4`(var0: Activity, var1: PendingIntent): Unit {
      var0.startIntentSenderForResult(var1.getIntentSender(), 4002, null, 0, 0, 0);
      return Unit.a;
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$5`(var0: Function1, var1: Any) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$6`(var0: WebAuthn, var1: Exception) {
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
         val var5: java.lang.String = var1.nextName();
         if (var5 != null) {
            val var2: Int = var5.hashCode();
            if (var2 != 116204) {
               if (var2 != 93029116) {
                  if (var2 == 757680504 && var5.equals("largeBlob")) {
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
               } else if (var5.equals("appid")) {
                  val var4: java.lang.String = var1.nextString();
                  val var6: Log = Log.INSTANCE;
                  val var10: StringBuilder = new StringBuilder();
                  var10.append("parseAuthenticationExtensions: ... appid extension: `");
                  var10.append(var4);
                  var10.append("`");
                  Log.i$default(var6, "DCDSecurityKeyManager.WebAuthn", var10.toString(), null, 4, null);
                  continue;
               }
            } else if (var5.equals("uvm")) {
               val var11: t = new t(var1.nextBoolean());
               val var13: Log = Log.INSTANCE;
               val var9: StringBuilder = new StringBuilder();
               var9.append("parseAuthenticationExtensions: ... uvm extension: `");
               var9.append(var11);
               var9.append("`");
               Log.i$default(var13, "DCDSecurityKeyManager.WebAuthn", var9.toString(), null, 4, null);
               continue;
            }
         }

         val var12: Log = Log.INSTANCE;
         val var8: StringBuilder = new StringBuilder();
         var8.append("parseAuthenticationExtensions: Found unrecognized extension: `");
         var8.append(var5);
         var8.append("`");
         Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn", var8.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var7: AuthenticationExtensions = var3.a();
      return var7;
   }

   private fun parseAuthenticatorSelection(reader: JsonReader): AuthenticatorSelectionCriteria {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Parsing authenticatorSelection...", null, 4, null);
      val var3: com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.a = new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var4: java.lang.String = var1.nextName();
         if (var4 != null) {
            switch (var4.hashCode()) {
               case -2031264694:
                  if (var4.equals("requireResidentKey")) {
                     val var2: Boolean = var1.nextBoolean();
                     val var17: Log = Log.INSTANCE;
                     val var13: StringBuilder = new StringBuilder();
                     var13.append("parseAuthenticatorSelection: ... ");
                     var13.append(var4);
                     var13.append(": `");
                     var13.append(var2);
                     var13.append("`");
                     Log.i$default(var17, "DCDSecurityKeyManager.WebAuthn", var13.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 563476214:
                  if (var4.equals("authenticatorAttachment")) {
                     val var15: com.google.android.gms.fido.fido2.api.common.a = com.google.android.gms.fido.fido2.api.common.a.b(var1.nextString());
                     val var7: Log = Log.INSTANCE;
                     val var11: StringBuilder = new StringBuilder();
                     var11.append("parseAuthenticatorSelection: ... ");
                     var11.append(var4);
                     var11.append(": `");
                     var11.append(var15);
                     var11.append("`");
                     Log.i$default(var7, "DCDSecurityKeyManager.WebAuthn", var11.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 1098323695:
                  if (var4.equals("residentKey")) {
                     val var10: com.google.android.gms.fido.fido2.api.common.c = com.google.android.gms.fido.fido2.api.common.c.b(var1.nextString());
                     val var9: Log = Log.INSTANCE;
                     val var14: StringBuilder = new StringBuilder();
                     var14.append("parseAuthenticatorSelection: ... ResidentKeyRequirement: `");
                     var14.append(var10);
                     var14.append("`");
                     Log.w$default(var9, "DCDSecurityKeyManager.WebAuthn", var14.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var4.equals("userVerification")) {
                     val var5: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("parseAuthenticatorSelection: ... ");
                     var6.append(var4);
                     var6.append(": unsupported, skipping");
                     Log.w$default(var5, "DCDSecurityKeyManager.WebAuthn", var6.toString(), null, 4, null);
                     var1.skipValue();
                     continue;
                  }
               default:
            }
         }

         val var12: Log = Log.INSTANCE;
         val var16: StringBuilder = new StringBuilder();
         var16.append("parseAuthenticatorSelection: ... found unrecognized criteria: `");
         var16.append(var4);
         var16.append("`, skipping");
         Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn", var16.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var8: AuthenticatorSelectionCriteria = var3.a();
      return var8;
   }

   private fun parseCreationOptions(reader: JsonReader, builder: Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing creation options...", null, 4, null);

      while (var1.hasNext()) {
         var var5: java.lang.String = var1.nextName();
         if (var5 != null) {
            switch (var5.hashCode()) {
               case -1809421292:
                  if (var5.equals("extensions")) {
                     continue;
                  }
                  break;
               case -1424409546:
                  if (var5.equals("pubKeyCredParams")) {
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var5.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var10: Log = Log.INSTANCE;
                     val var13: StringBuilder = new StringBuilder();
                     var13.append("parseCreationOptions: timeout: `");
                     var13.append(var3);
                     var13.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn", var13.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case -709624112:
                  if (var5.equals("attestation")) {
                     val var12: com.google.android.gms.fido.fido2.api.common.b = com.google.android.gms.fido.fido2.api.common.b.b(var1.nextString());
                     val var15: Log = Log.INSTANCE;
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("parseCreationOptions: attestation preference: `");
                     var9.append(var12);
                     var9.append("`");
                     Log.i$default(var15, "DCDSecurityKeyManager.WebAuthn", var9.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 3646:
                  if (var5.equals("rp")) {
                     continue;
                  }
                  break;
               case 3599307:
                  if (var5.equals("user")) {
                     continue;
                  }
                  break;
               case 582307161:
                  if (var5.equals("authenticatorSelection")) {
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var5.equals("challenge")) {
                     var5 = var1.nextString();
                     val var7: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("parseCreationOptions: challenge: `");
                     var6.append(var5);
                     var6.append("`");
                     Log.i$default(var7, "DCDSecurityKeyManager.WebAuthn", var6.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 1684840642:
                  if (var5.equals("excludeCredentials")) {
                     continue;
                  }
               default:
            }
         }

         val var14: Log = Log.INSTANCE;
         val var16: StringBuilder = new StringBuilder();
         var16.append("parseCreationOptions: Found unexpected key in creation options: `");
         var16.append(var5);
         var16.append("`, skipping");
         Log.w$default(var14, "DCDSecurityKeyManager.WebAuthn", var16.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
   }

   private fun parseCredentialDescriptors(reader: JsonReader): List<n> {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: Processing credential descriptors...", null, 4, null);
      val var4: ArrayList = new ArrayList();
      var1.beginArray();

      while (var1.hasNext()) {
         Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: Found new descriptor", null, 4, null);
         var1.beginObject();
         var var3: ByteArray = null;

         while (var1.hasNext()) {
            var var5: java.lang.String = var1.nextName();
            if (var5 != null) {
               val var2: Int = var5.hashCode();
               if (var2 != -1717834134) {
                  if (var2 != 3355) {
                     if (var2 == 3575610 && var5.equals("type")) {
                        Log.w$default(
                           Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: ... skipping unsupported field `type`", null, 4, null
                        );
                        var1.skipValue();
                        continue;
                     }
                  } else if (var5.equals("id")) {
                     var5 = var1.nextString();
                     val var10: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("parseCredentialDescriptors: ... id: `");
                     var6.append(var5);
                     var6.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn", var6.toString(), null, 4, null);
                     var3 = this.decodeBase64(var5);
                     continue;
                  }
               } else if (var5.equals("transports")) {
                  Log.w$default(
                     Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseCredentialDescriptors: ... skipping unsupported field `transports`", null, 4, null
                  );
                  var1.skipValue();
                  continue;
               }
            }

            val var14: Log = Log.INSTANCE;
            val var7: StringBuilder = new StringBuilder();
            var7.append("parseCredentialDescriptors: ... skipping unrecognized field `");
            var7.append(var5);
            var7.append("`");
            Log.w$default(var14, "DCDSecurityKeyManager.WebAuthn", var7.toString(), null, 4, null);
            var1.skipValue();
         }

         var1.endObject();
         val var13: java.lang.String = p.e.toString();
         var4.add(new n(var13, var3, null));
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

   private fun parsePKCParameters(reader: JsonReader): List<o> {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing pubKeyCredParams...", null, 4, null);
      val var4: ArrayList = new ArrayList();
      var1.beginArray();

      while (var1.hasNext()) {
         var1.beginObject();
         var var3: java.lang.String = null;
         var var2: Int = 0;

         while (var1.hasNext()) {
            val var6: java.lang.String = var1.nextName();
            if (var6 == "type") {
               var3 = var1.nextString();
            } else if (var6 == "alg") {
               var2 = var1.nextInt();
            } else {
               val var5: Log = Log.INSTANCE;
               val var7: StringBuilder = new StringBuilder();
               var7.append("parsePKCParameters: ... found unrecognized parameter: `");
               var7.append(var6);
               var7.append("`, skipping");
               Log.w$default(var5, "DCDSecurityKeyManager.WebAuthn", var7.toString(), null, 4, null);
               var1.skipValue();
            }
         }

         var1.endObject();
         var4.add(new o(var3, var2));
      }

      var1.endArray();
      val var8: Log = Log.INSTANCE;
      val var9: Int = var4.size();
      val var10: StringBuilder = new StringBuilder();
      var10.append("parsePKCParameters: Processed ");
      var10.append(var9);
      var10.append(" parameters");
      Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn", var10.toString(), null, 4, null);
      return var4;
   }

   private fun parsePKCUser(reader: JsonReader): PublicKeyCredentialUserEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing user...", null, 4, null);
      var1.beginObject();
      var var5: java.lang.String = null;
      var var4: java.lang.String = null;
      var var3: java.lang.String = "";

      while (var1.hasNext()) {
         val var7: java.lang.String = var1.nextName();
         if (var7 != null) {
            val var2: Int = var7.hashCode();
            if (var2 != 3355) {
               if (var2 != 3373707) {
                  if (var2 == 1714148973 && var7.equals("displayName")) {
                     var3 = var1.nextString();
                     continue;
                  }
               } else if (var7.equals("name")) {
                  var4 = var1.nextString();
                  continue;
               }
            } else if (var7.equals("id")) {
               var5 = var1.nextString();
               continue;
            }
         }

         val var8: Log = Log.INSTANCE;
         val var6: StringBuilder = new StringBuilder();
         var6.append("parsePKCUser: ... found unrecognized member: `");
         var6.append(var7);
         var6.append("`, skipping");
         Log.w$default(var8, "DCDSecurityKeyManager.WebAuthn", var6.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var9: Log = Log.INSTANCE;
      val var11: StringBuilder = new StringBuilder();
      var11.append("parsePKCUser: PublicKeyCredentialUserEntity(id=`");
      var11.append(var5);
      var11.append("`, name=`");
      var11.append(var4);
      var11.append("`, icon=null, displayName=`");
      var11.append(var3);
      var11.append("`)");
      Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn", var11.toString(), null, 4, null);
      val var10: ByteArray = this.decodeBase64(var5);
      return new PublicKeyCredentialUserEntity(var10, var4, "", var3);
   }

   private fun parsePublicKeyCredentialCreationOptions(creationOptions: String): PublicKeyCredentialCreationOptions {
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
      // 00: new com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder
      // 03: dup
      // 04: invokespecial com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.<init> ()V
      // 07: astore 2
      // 08: new android/util/JsonReader
      // 0b: dup
      // 0c: new java/io/StringReader
      // 0f: dup
      // 10: aload 1
      // 11: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 14: invokespecial android/util/JsonReader.<init> (Ljava/io/Reader;)V
      // 17: astore 1
      // 18: aload 1
      // 19: invokevirtual android/util/JsonReader.beginObject ()V
      // 1c: aload 1
      // 1d: invokevirtual android/util/JsonReader.hasNext ()Z
      // 20: ifeq 7d
      // 23: aload 1
      // 24: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 27: astore 3
      // 28: aload 3
      // 29: ldc_w "publicKey"
      // 2c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 2f: ifeq 3f
      // 32: aload 0
      // 33: aload 1
      // 34: aload 2
      // 35: invokespecial com/discord/security_key/WebAuthn.parseCreationOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V
      // 38: goto 1c
      // 3b: astore 3
      // 3c: goto 98
      // 3f: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 42: astore 4
      // 44: new java/lang/StringBuilder
      // 47: astore 5
      // 49: aload 5
      // 4b: invokespecial java/lang/StringBuilder.<init> ()V
      // 4e: aload 5
      // 50: ldc_w "parsePublicKeyCredentialCreationOptions: Found unexpected key in object: `"
      // 53: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56: pop
      // 57: aload 5
      // 59: aload 3
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: pop
      // 5e: aload 5
      // 60: ldc_w "`, skipping"
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: pop
      // 67: aload 4
      // 69: ldc "DCDSecurityKeyManager.WebAuthn"
      // 6b: aload 5
      // 6d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 70: aconst_null
      // 71: bipush 4
      // 72: aconst_null
      // 73: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 76: aload 1
      // 77: invokevirtual android/util/JsonReader.skipValue ()V
      // 7a: goto 1c
      // 7d: aload 1
      // 7e: invokevirtual android/util/JsonReader.endObject ()V
      // 81: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 84: astore 3
      // 85: aload 1
      // 86: aconst_null
      // 87: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 8a: aload 2
      // 8b: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
      // 8e: astore 1
      // 8f: aload 1
      // 90: ldc_w "build(...)"
      // 93: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 96: aload 1
      // 97: areturn
      // 98: aload 3
      // 99: athrow
      // 9a: astore 2
      // 9b: aload 1
      // 9c: aload 3
      // 9d: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // a0: aload 2
      // a1: athrow
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
      // 47: ifeq a5
      // 4a: aload 1
      // 4b: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 4e: astore 4
      // 50: aload 4
      // 52: ldc_w "publicKey"
      // 55: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 58: ifeq 68
      // 5b: aload 0
      // 5c: aload 1
      // 5d: aload 2
      // 5e: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 61: goto 43
      // 64: astore 2
      // 65: goto c0
      // 68: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 6b: astore 3
      // 6c: new java/lang/StringBuilder
      // 6f: astore 5
      // 71: aload 5
      // 73: invokespecial java/lang/StringBuilder.<init> ()V
      // 76: aload 5
      // 78: ldc_w "parsePublicKeyCredentialRequestOptions: Found unexpected key in request options: `"
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: pop
      // 7f: aload 5
      // 81: aload 4
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: pop
      // 87: aload 5
      // 89: ldc_w "`, skipping"
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f: pop
      // 90: aload 3
      // 91: ldc "DCDSecurityKeyManager.WebAuthn"
      // 93: aload 5
      // 95: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 98: aconst_null
      // 99: bipush 4
      // 9a: aconst_null
      // 9b: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 9e: aload 1
      // 9f: invokevirtual android/util/JsonReader.skipValue ()V
      // a2: goto 43
      // a5: aload 1
      // a6: invokevirtual android/util/JsonReader.endObject ()V
      // a9: getstatic kotlin/Unit.a Lkotlin/Unit;
      // ac: astore 3
      // ad: aload 1
      // ae: aconst_null
      // af: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // b2: aload 2
      // b3: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // b6: astore 1
      // b7: aload 1
      // b8: ldc_w "build(...)"
      // bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // be: aload 1
      // bf: areturn
      // c0: aload 2
      // c1: athrow
      // c2: astore 3
      // c3: aload 1
      // c4: aload 2
      // c5: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // c8: aload 3
      // c9: athrow
   }

   private fun parseRP(reader: JsonReader): PublicKeyCredentialRpEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing rp...", null, 4, null);
      var1.beginObject();
      var var3: java.lang.String = null;
      var var2: java.lang.String = null;

      while (var1.hasNext()) {
         val var6: java.lang.String = var1.nextName();
         if (var6 == "id") {
            var3 = var1.nextString();
         } else if (var6 == "name") {
            var2 = var1.nextString();
         } else {
            val var4: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("parseRP: ... found unrecognized attribute: `");
            var5.append(var6);
            var5.append("`, skipping");
            Log.w$default(var4, "DCDSecurityKeyManager.WebAuthn", var5.toString(), null, 4, null);
            var1.skipValue();
         }
      }

      var1.endObject();
      val var7: Log = Log.INSTANCE;
      val var8: StringBuilder = new StringBuilder();
      var8.append("parseRP: PublicKeyCredentialRpEntity(id=`");
      var8.append(var3);
      var8.append("`, name=`");
      var8.append(var2);
      var8.append("`)");
      Log.i$default(var7, "DCDSecurityKeyManager.WebAuthn", var8.toString(), null, 4, null);
      return new PublicKeyCredentialRpEntity(var3, var2, null);
   }

   private fun parseRegistrationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Parsing registration extensions...", null, 4, null);
      val var2: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var4: java.lang.String = var1.nextName();
         if (var4 == "uvm") {
            val var8: t = new t(var1.nextBoolean());
            val var3: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("parseRegisterExtensions: ... uvm extension: `");
            var5.append(var8);
            var5.append("`");
            Log.i$default(var3, "DCDSecurityKeyManager.WebAuthn", var5.toString(), null, 4, null);
         } else {
            val var7: Log = Log.INSTANCE;
            val var9: StringBuilder = new StringBuilder();
            var9.append("parseRegisterExtensions: ... found unsupported extension: `");
            var9.append(var4);
            var9.append("`, skipping");
            Log.w$default(var7, "DCDSecurityKeyManager.WebAuthn", var9.toString(), null, 4, null);
            var1.skipValue();
         }
      }

      var1.endObject();
      val var6: AuthenticationExtensions = var2.a();
      return var6;
   }

   private fun parseRequestOptions(reader: JsonReader, builder: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing request options...", null, 4, null);

      while (var1.hasNext()) {
         var var7: java.lang.String = var1.nextName();
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
                     var7 = var1.nextString();
                     val var10: Log = Log.INSTANCE;
                     val var15: StringBuilder = new StringBuilder();
                     var15.append("parseRequestOptions: rpId: `");
                     var15.append(var7);
                     var15.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn", var15.toString(), null, 4, null);
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
                     var7 = var1.nextString();
                     val var14: Log = Log.INSTANCE;
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("parseRequestOptions: challenge: `");
                     var9.append(var7);
                     var9.append("`");
                     Log.i$default(var14, "DCDSecurityKeyManager.WebAuthn", var9.toString(), null, 4, null);
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var7.equals("userVerification")) {
                     var7 = var1.nextString();
                     val var5: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("parseRequestOptions: userVerification: `");
                     var6.append(var7);
                     var6.append("`, skipping");
                     Log.w$default(var5, "DCDSecurityKeyManager.WebAuthn", var6.toString(), null, 4, null);
                     continue;
                  }
               default:
            }
         }

         val var17: Log = Log.INSTANCE;
         val var12: StringBuilder = new StringBuilder();
         var12.append("parseRequestOptions: Found unrecognized option: `");
         var12.append(var7);
         var12.append("`, skipping");
         Log.w$default(var17, "DCDSecurityKeyManager.WebAuthn", var12.toString(), null, 4, null);
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
         val var3: W5.a = V5.a.a(var2);
         val var4: Task = var3.J(this.parsePublicKeyCredentialRequestOptions(var1));
         var4.g(new b(new a(var2)));
         var4.e(new c(this));
      }
   }

   public fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
      if (var1 == 4001 || var1 == 4002) {
         if (var2 != -1) {
            this.reject.invoke("activity failed");
         } else {
            val var6: ByteArray;
            if (var3 != null) {
               var6 = var3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
            } else {
               var6 = null;
            }

            if (var6 == null) {
               this.reject.invoke("credential data missing");
            } else {
               val var7: m = m.p(var6);
               if (var7.x() is X5.f) {
                  val var5: Function1 = this.reject;
                  val var10: g = var7.x();
                  val var13: java.lang.String = (var10 as X5.f).s();
                  var var11: java.lang.String = var13;
                  if (var13 == null) {
                     var11 = "Unknown error";
                  }

                  var5.invoke(var11);
               } else {
                  if (var1 != 4001) {
                     if (var1 == 4002) {
                        val var4: Function1 = this.resolve;
                        val var8: java.lang.String = var7.F();
                        var4.invoke(var8);
                     }
                  } else {
                     val var12: Function1 = this.resolve;
                     val var9: java.lang.String = var7.F();
                     var12.invoke(var9);
                  }
               }
            }
         }
      }
   }

   public fun registerSecurityKey(creationOptions: String, currentActivity: Activity?) {
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: W5.a = V5.a.a(var2);
         val var4: Task = var3.I(this.parsePublicKeyCredentialCreationOptions(var1));
         var4.g(new e(new d(var2)));
         var4.e(new f(this));
      }
   }

   public companion object {
      private const val REQUEST_CODE_REGISTER_SK: Int
      private const val REQUEST_CODE_AUTHENTICATE_SK: Int
      private const val BASE64_FLAG: Int
      private const val TAG: String
   }
}
