package com.discord.security_key

import L5.g
import L5.k
import L5.m
import L5.n
import L5.o
import L5.p
import L5.t
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
import kotlin.jvm.internal.q

public class WebAuthn(resolve: (String) -> Unit, reject: (String) -> Unit) {
   public final val resolve: (String) -> Unit
   public final val reject: (String) -> Unit

   init {
      q.h(var1, "resolve");
      q.h(var2, "reject");
      super();
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
      q.h(var1, "it");
      var0.reject.invoke("task failed");
   }

   private fun String.decodeBase64(): ByteArray {
      val var2: ByteArray = Base64.decode(var1, 11);
      q.g(var2, "decode(...)");
      return var2;
   }

   private fun parseAuthenticationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "parseAuthenticationExtensions: Parsing authentication extensions...", null, 4, null);
      val var3: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         var var4: java.lang.String = var1.nextName();
         if (var4 != null) {
            val var2: Int = var4.hashCode();
            if (var2 != 116204) {
               if (var2 != 93029116) {
                  if (var2 == 757680504 && var4.equals("largeBlob")) {
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
               } else if (var4.equals("appid")) {
                  var4 = var1.nextString();
                  val var5: Log = Log.INSTANCE;
                  val var6: StringBuilder = new StringBuilder();
                  var6.append("parseAuthenticationExtensions: ... appid extension: `");
                  var6.append(var4);
                  var6.append("`");
                  Log.i$default(var5, "DCDSecurityKeyManager.WebAuthn", var6.toString(), null, 4, null);
                  q.e(var3.b(new k(var4)));
                  continue;
               }
            } else if (var4.equals("uvm")) {
               val var13: t = new t(var1.nextBoolean());
               val var9: Log = Log.INSTANCE;
               val var11: StringBuilder = new StringBuilder();
               var11.append("parseAuthenticationExtensions: ... uvm extension: `");
               var11.append(var13);
               var11.append("`");
               Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn", var11.toString(), null, 4, null);
               q.e(var3.d(var13));
               continue;
            }
         }

         val var10: Log = Log.INSTANCE;
         val var12: StringBuilder = new StringBuilder();
         var12.append("parseAuthenticationExtensions: Found unrecognized extension: `");
         var12.append(var4);
         var12.append("`");
         Log.w$default(var10, "DCDSecurityKeyManager.WebAuthn", var12.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var7: AuthenticationExtensions = var3.a();
      q.g(var7, "build(...)");
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
                     val var13: Log = Log.INSTANCE;
                     val var17: StringBuilder = new StringBuilder();
                     var17.append("parseAuthenticatorSelection: ... ");
                     var17.append(var4);
                     var17.append(": `");
                     var17.append(var2);
                     var17.append("`");
                     Log.i$default(var13, "DCDSecurityKeyManager.WebAuthn", var17.toString(), null, 4, null);
                     q.e(var3.c(var2));
                     continue;
                  }
                  break;
               case 563476214:
                  if (var4.equals("authenticatorAttachment")) {
                     val var7: com.google.android.gms.fido.fido2.api.common.a = com.google.android.gms.fido.fido2.api.common.a.f(var1.nextString());
                     q.g(var7, "fromString(...)");
                     val var15: Log = Log.INSTANCE;
                     val var11: StringBuilder = new StringBuilder();
                     var11.append("parseAuthenticatorSelection: ... ");
                     var11.append(var4);
                     var11.append(": `");
                     var11.append(var7);
                     var11.append("`");
                     Log.i$default(var15, "DCDSecurityKeyManager.WebAuthn", var11.toString(), null, 4, null);
                     q.e(var3.b(var7));
                     continue;
                  }
                  break;
               case 1098323695:
                  if (var4.equals("residentKey")) {
                     val var10: com.google.android.gms.fido.fido2.api.common.c = com.google.android.gms.fido.fido2.api.common.c.f(var1.nextString());
                     q.g(var10, "fromString(...)");
                     val var14: Log = Log.INSTANCE;
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("parseAuthenticatorSelection: ... ResidentKeyRequirement: `");
                     var9.append(var10);
                     var9.append("`");
                     Log.w$default(var14, "DCDSecurityKeyManager.WebAuthn", var9.toString(), null, 4, null);
                     q.e(var3.d(var10));
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var4.equals("userVerification")) {
                     val var6: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("parseAuthenticatorSelection: ... ");
                     var5.append(var4);
                     var5.append(": unsupported, skipping");
                     Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn", var5.toString(), null, 4, null);
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
      q.g(var8, "build(...)");
      return var8;
   }

   private fun parseCreationOptions(reader: JsonReader, builder: Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing creation options...", null, 4, null);

      while (var1.hasNext()) {
         var var7: java.lang.String = var1.nextName();
         if (var7 != null) {
            switch (var7.hashCode()) {
               case -1809421292:
                  if (var7.equals("extensions")) {
                     q.g(var2.c(this.parseRegistrationExtensions(var1)), "setAuthenticationExtensions(...)");
                     continue;
                  }
                  break;
               case -1424409546:
                  if (var7.equals("pubKeyCredParams")) {
                     q.g(var2.g(this.parsePKCParameters(var1)), "setParameters(...)");
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var7.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var9: Log = Log.INSTANCE;
                     val var13: StringBuilder = new StringBuilder();
                     var13.append("parseCreationOptions: timeout: `");
                     var13.append(var3);
                     var13.append("`");
                     Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn", var13.toString(), null, 4, null);
                     q.e(var2.i(var3 / (double)1000));
                     continue;
                  }
                  break;
               case -709624112:
                  if (var7.equals("attestation")) {
                     val var12: com.google.android.gms.fido.fido2.api.common.b = com.google.android.gms.fido.fido2.api.common.b.f(var1.nextString());
                     q.g(var12, "fromString(...)");
                     val var8: Log = Log.INSTANCE;
                     val var16: StringBuilder = new StringBuilder();
                     var16.append("parseCreationOptions: attestation preference: `");
                     var16.append(var12);
                     var16.append("`");
                     Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn", var16.toString(), null, 4, null);
                     q.e(var2.b(var12));
                     continue;
                  }
                  break;
               case 3646:
                  if (var7.equals("rp")) {
                     q.g(var2.h(this.parseRP(var1)), "setRp(...)");
                     continue;
                  }
                  break;
               case 3599307:
                  if (var7.equals("user")) {
                     q.g(var2.j(this.parsePKCUser(var1)), "setUser(...)");
                     continue;
                  }
                  break;
               case 582307161:
                  if (var7.equals("authenticatorSelection")) {
                     q.g(var2.d(this.parseAuthenticatorSelection(var1)), "setAuthenticatorSelection(...)");
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var7.equals("challenge")) {
                     var7 = var1.nextString();
                     val var6: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("parseCreationOptions: challenge: `");
                     var5.append(var7);
                     var5.append("`");
                     Log.i$default(var6, "DCDSecurityKeyManager.WebAuthn", var5.toString(), null, 4, null);
                     q.e(var7);
                     q.e(var2.e(this.decodeBase64(var7)));
                     continue;
                  }
                  break;
               case 1684840642:
                  if (var7.equals("excludeCredentials")) {
                     q.g(var2.f(this.parseCredentialDescriptors(var1)), "setExcludeList(...)");
                     continue;
                  }
               default:
            }
         }

         val var14: Log = Log.INSTANCE;
         val var10: StringBuilder = new StringBuilder();
         var10.append("parseCreationOptions: Found unexpected key in creation options: `");
         var10.append(var7);
         var10.append("`, skipping");
         Log.w$default(var14, "DCDSecurityKeyManager.WebAuthn", var10.toString(), null, 4, null);
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
                     q.e(var5);
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
         val var13: java.lang.String = p.k.toString();
         q.e(var3);
         var4.add(new n(var13, var3, null));
      }

      var1.endArray();
      val var8: Log = Log.INSTANCE;
      val var9: Int = var4.size();
      val var11: StringBuilder = new StringBuilder();
      var11.append("parseCredentialDescriptors: Processed ");
      var11.append(var9);
      var11.append(" descriptors");
      Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn", var11.toString(), null, 4, null);
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
            if (q.c(var6, "type")) {
               var3 = var1.nextString();
            } else if (q.c(var6, "alg")) {
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
         q.e(var3);
         var4.add(new o(var3, var2));
      }

      var1.endArray();
      val var10: Log = Log.INSTANCE;
      val var9: Int = var4.size();
      val var8: StringBuilder = new StringBuilder();
      var8.append("parsePKCParameters: Processed ");
      var8.append(var9);
      var8.append(" parameters");
      Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn", var8.toString(), null, 4, null);
      return var4;
   }

   private fun parsePKCUser(reader: JsonReader): PublicKeyCredentialUserEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing user...", null, 4, null);
      var1.beginObject();
      var var5: java.lang.String = null;
      var var4: java.lang.String = null;
      var var3: java.lang.String = "";

      while (var1.hasNext()) {
         val var8: java.lang.String = var1.nextName();
         if (var8 != null) {
            val var2: Int = var8.hashCode();
            if (var2 != 3355) {
               if (var2 != 3373707) {
                  if (var2 == 1714148973 && var8.equals("displayName")) {
                     var3 = var1.nextString();
                     continue;
                  }
               } else if (var8.equals("name")) {
                  var4 = var1.nextString();
                  continue;
               }
            } else if (var8.equals("id")) {
               var5 = var1.nextString();
               continue;
            }
         }

         val var6: Log = Log.INSTANCE;
         val var7: StringBuilder = new StringBuilder();
         var7.append("parsePKCUser: ... found unrecognized member: `");
         var7.append(var8);
         var7.append("`, skipping");
         Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn", var7.toString(), null, 4, null);
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
      q.e(var5);
      val var10: ByteArray = this.decodeBase64(var5);
      q.e(var4);
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
      // 2c: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 2f: ifeq 3f
      // 32: aload 0
      // 33: aload 1
      // 34: aload 2
      // 35: invokespecial com/discord/security_key/WebAuthn.parseCreationOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V
      // 38: goto 1c
      // 3b: astore 2
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
      // 87: invokestatic q9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 8a: aload 2
      // 8b: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
      // 8e: astore 1
      // 8f: aload 1
      // 90: ldc_w "build(...)"
      // 93: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 96: aload 1
      // 97: areturn
      // 98: aload 2
      // 99: athrow
      // 9a: astore 3
      // 9b: aload 1
      // 9c: aload 2
      // 9d: invokestatic q9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // a0: aload 3
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
      // 03: astore 3
      // 04: new java/lang/StringBuilder
      // 07: dup
      // 08: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b: astore 2
      // 0c: aload 2
      // 0d: ldc_w "parsePublicKeyCredentialRequestOptions: "
      // 10: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13: pop
      // 14: aload 2
      // 15: aload 1
      // 16: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19: pop
      // 1a: aload 3
      // 1b: ldc "DCDSecurityKeyManager.WebAuthn"
      // 1d: aload 2
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
      // 53: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 56: ifeq 66
      // 59: aload 0
      // 5a: aload 1
      // 5b: aload 2
      // 5c: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 5f: goto 43
      // 62: astore 2
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
      // ae: invokestatic q9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // b1: aload 2
      // b2: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // b5: astore 1
      // b6: aload 1
      // b7: ldc_w "build(...)"
      // ba: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // bd: aload 1
      // be: areturn
      // bf: aload 2
      // c0: athrow
      // c1: astore 3
      // c2: aload 1
      // c3: aload 2
      // c4: invokestatic q9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // c7: aload 3
      // c8: athrow
   }

   private fun parseRP(reader: JsonReader): PublicKeyCredentialRpEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing rp...", null, 4, null);
      var1.beginObject();
      var var3: java.lang.String = null;
      var var2: java.lang.String = null;

      while (var1.hasNext()) {
         val var5: java.lang.String = var1.nextName();
         if (q.c(var5, "id")) {
            var3 = var1.nextString();
         } else if (q.c(var5, "name")) {
            var2 = var1.nextString();
         } else {
            val var6: Log = Log.INSTANCE;
            val var4: StringBuilder = new StringBuilder();
            var4.append("parseRP: ... found unrecognized attribute: `");
            var4.append(var5);
            var4.append("`, skipping");
            Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn", var4.toString(), null, 4, null);
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
      q.e(var3);
      q.e(var2);
      return new PublicKeyCredentialRpEntity(var3, var2, null);
   }

   private fun parseRegistrationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Parsing registration extensions...", null, 4, null);
      val var2: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var3: java.lang.String = var1.nextName();
         if (q.c(var3, "uvm")) {
            val var5: t = new t(var1.nextBoolean());
            val var4: Log = Log.INSTANCE;
            val var7: StringBuilder = new StringBuilder();
            var7.append("parseRegisterExtensions: ... uvm extension: `");
            var7.append(var5);
            var7.append("`");
            Log.i$default(var4, "DCDSecurityKeyManager.WebAuthn", var7.toString(), null, 4, null);
            q.e(var2.d(var5));
         } else {
            val var9: Log = Log.INSTANCE;
            val var8: StringBuilder = new StringBuilder();
            var8.append("parseRegisterExtensions: ... found unsupported extension: `");
            var8.append(var3);
            var8.append("`, skipping");
            Log.w$default(var9, "DCDSecurityKeyManager.WebAuthn", var8.toString(), null, 4, null);
            var1.skipValue();
         }
      }

      var1.endObject();
      val var6: AuthenticationExtensions = var2.a();
      q.g(var6, "build(...)");
      return var6;
   }

   private fun parseRequestOptions(reader: JsonReader, builder: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing request options...", null, 4, null);

      while (var1.hasNext()) {
         val var5: java.lang.String = var1.nextName();
         if (var5 != null) {
            switch (var5.hashCode()) {
               case -1809421292:
                  if (var5.equals("extensions")) {
                     q.g(var2.c(this.parseAuthenticationExtensions(var1)), "setAuthenticationExtensions(...)");
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var5.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var16: Log = Log.INSTANCE;
                     val var12: StringBuilder = new StringBuilder();
                     var12.append("parseRequestOptions: timeout: `");
                     var12.append(var3);
                     var12.append("`");
                     Log.i$default(var16, "DCDSecurityKeyManager.WebAuthn", var12.toString(), null, 4, null);
                     q.e(var2.f(var3 / (double)1000));
                     continue;
                  }
                  break;
               case 3506169:
                  if (var5.equals("rpId")) {
                     val var15: java.lang.String = var1.nextString();
                     val var11: Log = Log.INSTANCE;
                     val var19: StringBuilder = new StringBuilder();
                     var19.append("parseRequestOptions: rpId: `");
                     var19.append(var15);
                     var19.append("`");
                     Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn", var19.toString(), null, 4, null);
                     q.e(var2.e(var15));
                     continue;
                  }
                  break;
               case 493711347:
                  if (var5.equals("allowCredentials")) {
                     q.g(var2.b(this.parseCredentialDescriptors(var1)), "setAllowList(...)");
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var5.equals("challenge")) {
                     val var14: java.lang.String = var1.nextString();
                     val var10: Log = Log.INSTANCE;
                     val var18: StringBuilder = new StringBuilder();
                     var18.append("parseRequestOptions: challenge: `");
                     var18.append(var14);
                     var18.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn", var18.toString(), null, 4, null);
                     q.e(var14);
                     q.e(var2.d(this.decodeBase64(var14)));
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var5.equals("userVerification")) {
                     val var6: java.lang.String = var1.nextString();
                     val var7: Log = Log.INSTANCE;
                     val var8: StringBuilder = new StringBuilder();
                     var8.append("parseRequestOptions: userVerification: `");
                     var8.append(var6);
                     var8.append("`, skipping");
                     Log.w$default(var7, "DCDSecurityKeyManager.WebAuthn", var8.toString(), null, 4, null);
                     continue;
                  }
               default:
            }
         }

         val var20: Log = Log.INSTANCE;
         val var17: StringBuilder = new StringBuilder();
         var17.append("parseRequestOptions: Found unrecognized option: `");
         var17.append(var5);
         var17.append("`, skipping");
         Log.w$default(var20, "DCDSecurityKeyManager.WebAuthn", var17.toString(), null, 4, null);
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
      q.h(var1, "it");
      var0.reject.invoke("task failed");
   }

   public fun authenticateSecurityKey(requestOptions: String, currentActivity: Activity?) {
      q.h(var1, "requestOptions");
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: K5.a = J5.a.a(var2);
         q.g(var3, "getFido2ApiClient(...)");
         val var4: Task = var3.J(this.parsePublicKeyCredentialRequestOptions(var1));
         q.g(var4, "getSignPendingIntent(...)");
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
               q.g(var7, "deserializeFromBytes(...)");
               if (var7.C() is L5.f) {
                  val var5: Function1 = this.reject;
                  val var10: g = var7.C();
                  q.f(var10, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
                  val var13: java.lang.String = (var10 as L5.f).s();
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
                        q.g(var8, "toJson(...)");
                        var4.invoke(var8);
                     }
                  } else {
                     val var12: Function1 = this.resolve;
                     val var9: java.lang.String = var7.F();
                     q.g(var9, "toJson(...)");
                     var12.invoke(var9);
                  }
               }
            }
         }
      }
   }

   public fun registerSecurityKey(creationOptions: String, currentActivity: Activity?) {
      q.h(var1, "creationOptions");
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: K5.a = J5.a.a(var2);
         q.g(var3, "getFido2ApiClient(...)");
         val var4: Task = var3.I(this.parsePublicKeyCredentialCreationOptions(var1));
         q.g(var4, "getRegisterPendingIntent(...)");
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
