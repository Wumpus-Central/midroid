package com.discord.security_key

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
import db.f
import db.g
import db.k
import db.m
import db.n
import db.o
import db.p
import db.t
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
   fun `authenticateSecurityKey$lambda$3`(var0: Function1, var1: Any) {
      q.h(var0, "$tmp0");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$4`(var0: WebAuthn, var1: Exception) {
      q.h(var0, "this$0");
      q.h(var1, "it");
      var0.reject.invoke("task failed");
   }

   private fun String.decodeBase64(): ByteArray {
      val var2: ByteArray = Base64.decode(var1, 11);
      q.g(var2, "decode(...)");
      return var2;
   }

   private fun parseAuthenticationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", "Parsing authentication extensions...", null, 4, null);
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
                        "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions",
                        "... largeBlob extension: unsupported, skipping",
                        null,
                        4,
                        null
                     );
                     var1.skipValue();
                     continue;
                  }
               } else if (var5.equals("appid")) {
                  val var6: java.lang.String = var1.nextString();
                  val var4: Log = Log.INSTANCE;
                  val var10: StringBuilder = new StringBuilder();
                  var10.append("... appid extension: `");
                  var10.append(var6);
                  var10.append("`");
                  Log.i$default(var4, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var10.toString(), null, 4, null);
                  var3.b(new k(var6));
                  continue;
               }
            } else if (var5.equals("uvm")) {
               val var13: t = new t(var1.nextBoolean());
               val var9: Log = Log.INSTANCE;
               val var11: StringBuilder = new StringBuilder();
               var11.append("... uvm extension: `");
               var11.append(var13);
               var11.append("`");
               Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var11.toString(), null, 4, null);
               var3.d(var13);
               continue;
            }
         }

         val var8: Log = Log.INSTANCE;
         val var12: StringBuilder = new StringBuilder();
         var12.append("Found unrecognized extension: `");
         var12.append(var5);
         var12.append("`");
         Log.w$default(var8, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var12.toString(), null, 4, null);
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
                     var17.append("... ");
                     var17.append(var4);
                     var17.append(": `");
                     var17.append(var2);
                     var17.append("`");
                     Log.i$default(var13, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var17.toString(), null, 4, null);
                     var3.c(var2);
                     continue;
                  }
                  break;
               case 563476214:
                  if (var4.equals("authenticatorAttachment")) {
                     val var11: com.google.android.gms.fido.fido2.api.common.a = com.google.android.gms.fido.fido2.api.common.a.b(var1.nextString());
                     q.g(var11, "fromString(...)");
                     val var15: Log = Log.INSTANCE;
                     val var7: StringBuilder = new StringBuilder();
                     var7.append("... ");
                     var7.append(var4);
                     var7.append(": `");
                     var7.append(var11);
                     var7.append("`");
                     Log.i$default(var15, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var7.toString(), null, 4, null);
                     var3.b(var11);
                     continue;
                  }
                  break;
               case 1098323695:
                  if (var4.equals("residentKey")) {
                     val var9: com.google.android.gms.fido.fido2.api.common.c = com.google.android.gms.fido.fido2.api.common.c.b(var1.nextString());
                     q.g(var9, "fromString(...)");
                     val var10: Log = Log.INSTANCE;
                     val var14: StringBuilder = new StringBuilder();
                     var14.append("... ResidentKeyRequirement: `");
                     var14.append(var9);
                     var14.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var14.toString(), null, 4, null);
                     var3.d(var9);
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var4.equals("userVerification")) {
                     val var5: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("... ");
                     var6.append(var4);
                     var6.append(": unsupported, skipping");
                     Log.w$default(var5, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var6.toString(), null, 4, null);
                     var1.skipValue();
                     continue;
                  }
               default:
            }
         }

         val var12: Log = Log.INSTANCE;
         val var16: StringBuilder = new StringBuilder();
         var16.append("... found unrecognized criteria: `");
         var16.append(var4);
         var16.append("`, skipping");
         Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var16.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var8: AuthenticatorSelectionCriteria = var3.a();
      q.g(var8, "build(...)");
      return var8;
   }

   private fun parseCreationOptions(reader: JsonReader, builder: Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", "Processing creation options...", null, 4, null);

      while (var1.hasNext()) {
         var var7: java.lang.String = var1.nextName();
         if (var7 != null) {
            switch (var7.hashCode()) {
               case -1809421292:
                  if (var7.equals("extensions")) {
                     var2.c(this.parseRegistrationExtensions(var1));
                     continue;
                  }
                  break;
               case -1424409546:
                  if (var7.equals("pubKeyCredParams")) {
                     var2.g(this.parsePKCParameters(var1));
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var7.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var12: Log = Log.INSTANCE;
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("timeout: `");
                     var9.append(var3);
                     var9.append("`");
                     Log.i$default(var12, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var9.toString(), null, 4, null);
                     var2.i(var3 / (double)1000);
                     continue;
                  }
                  break;
               case -709624112:
                  if (var7.equals("attestation")) {
                     val var8: com.google.android.gms.fido.fido2.api.common.b = com.google.android.gms.fido.fido2.api.common.b.b(var1.nextString());
                     q.g(var8, "fromString(...)");
                     val var15: Log = Log.INSTANCE;
                     val var11: StringBuilder = new StringBuilder();
                     var11.append("attestation preference: `");
                     var11.append(var8);
                     var11.append("`");
                     Log.i$default(var15, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var11.toString(), null, 4, null);
                     var2.b(var8);
                     continue;
                  }
                  break;
               case 3646:
                  if (var7.equals("rp")) {
                     var2.h(this.parseRP(var1));
                     continue;
                  }
                  break;
               case 3599307:
                  if (var7.equals("user")) {
                     var2.j(this.parsePKCUser(var1));
                     continue;
                  }
                  break;
               case 582307161:
                  if (var7.equals("authenticatorSelection")) {
                     var2.d(this.parseAuthenticatorSelection(var1));
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var7.equals("challenge")) {
                     var7 = var1.nextString();
                     val var6: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("challenge: `");
                     var5.append(var7);
                     var5.append("`");
                     Log.i$default(var6, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var5.toString(), null, 4, null);
                     q.e(var7);
                     var2.e(this.decodeBase64(var7));
                     continue;
                  }
                  break;
               case 1684840642:
                  if (var7.equals("excludeCredentials")) {
                     var2.f(this.parseCredentialDescriptors(var1));
                     continue;
                  }
               default:
            }
         }

         val var10: Log = Log.INSTANCE;
         val var13: StringBuilder = new StringBuilder();
         var13.append("Found unexpected key in creation options: `");
         var13.append(var7);
         var13.append("`, skipping");
         Log.w$default(var10, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var13.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
   }

   private fun parseCredentialDescriptors(reader: JsonReader): List<n> {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", "Processing credential descriptors...", null, 4, null);
      val var4: ArrayList = new ArrayList();
      var1.beginArray();

      while (var1.hasNext()) {
         Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", "Found new descriptor", null, 4, null);
         var1.beginObject();
         var var3: ByteArray = null;

         while (var1.hasNext()) {
            var var6: java.lang.String = var1.nextName();
            if (var6 != null) {
               val var2: Int = var6.hashCode();
               if (var2 != -1717834134) {
                  if (var2 != 3355) {
                     if (var2 == 3575610 && var6.equals("type")) {
                        Log.w$default(
                           Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", "... skipping unsupported field `type`", null, 4, null
                        );
                        var1.skipValue();
                        continue;
                     }
                  } else if (var6.equals("id")) {
                     var6 = var1.nextString();
                     val var5: Log = Log.INSTANCE;
                     val var10: StringBuilder = new StringBuilder();
                     var10.append("... id: `");
                     var10.append(var6);
                     var10.append("`");
                     Log.i$default(var5, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var10.toString(), null, 4, null);
                     q.e(var6);
                     var3 = this.decodeBase64(var6);
                     continue;
                  }
               } else if (var6.equals("transports")) {
                  Log.w$default(
                     Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", "... skipping unsupported field `transports`", null, 4, null
                  );
                  var1.skipValue();
                  continue;
               }
            }

            val var7: Log = Log.INSTANCE;
            val var12: StringBuilder = new StringBuilder();
            var12.append("... skipping unrecognized field `");
            var12.append(var6);
            var12.append("`");
            Log.w$default(var7, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var12.toString(), null, 4, null);
            var1.skipValue();
         }

         var1.endObject();
         val var13: java.lang.String = p.k.toString();
         q.e(var3);
         var4.add(new n(var13, var3, null));
      }

      var1.endArray();
      val var11: Log = Log.INSTANCE;
      val var9: Int = var4.size();
      val var8: StringBuilder = new StringBuilder();
      var8.append("Processed ");
      var8.append(var9);
      var8.append(" descriptors");
      Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var8.toString(), null, 4, null);
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
            val var5: java.lang.String = var1.nextName();
            if (q.c(var5, "type")) {
               var3 = var1.nextString();
            } else if (q.c(var5, "alg")) {
               var2 = var1.nextInt();
            } else {
               val var6: Log = Log.INSTANCE;
               val var7: StringBuilder = new StringBuilder();
               var7.append("... found unrecognized parameter: `");
               var7.append(var5);
               var7.append("`, skipping");
               Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn parsePKCParameters", var7.toString(), null, 4, null);
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
      var8.append("Processed ");
      var8.append(var9);
      var8.append(" parameters");
      Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn parsePKCParameters", var8.toString(), null, 4, null);
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
                     q.g(var3, "nextString(...)");
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
         var6.append("... found unrecognized member: `");
         var6.append(var7);
         var6.append("`, skipping");
         Log.w$default(var8, "DCDSecurityKeyManager.WebAuthn parsePKCUser", var6.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var11: Log = Log.INSTANCE;
      val var9: StringBuilder = new StringBuilder();
      var9.append("PublicKeyCredentialUserEntity(id=`");
      var9.append(var5);
      var9.append("`, name=`");
      var9.append(var4);
      var9.append("`, icon=null, displayName=`");
      var9.append(var3);
      var9.append("`)");
      Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn parsePKCUser", var9.toString(), null, 4, null);
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
      // 20: ifeq 7f
      // 23: aload 1
      // 24: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 27: astore 5
      // 29: aload 5
      // 2b: ldc_w "publicKey"
      // 2e: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 31: ifeq 41
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: invokespecial com/discord/security_key/WebAuthn.parseCreationOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V
      // 3a: goto 1c
      // 3d: astore 2
      // 3e: goto 9a
      // 41: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 44: astore 3
      // 45: new java/lang/StringBuilder
      // 48: astore 4
      // 4a: aload 4
      // 4c: invokespecial java/lang/StringBuilder.<init> ()V
      // 4f: aload 4
      // 51: ldc_w "Found unexpected key in object: `"
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: pop
      // 58: aload 4
      // 5a: aload 5
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: pop
      // 60: aload 4
      // 62: ldc_w "`, skipping"
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: pop
      // 69: aload 3
      // 6a: ldc_w "DCDSecurityKeyManager.WebAuthn parsePublicKeyCredentialCreationOptions"
      // 6d: aload 4
      // 6f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 72: aconst_null
      // 73: bipush 4
      // 74: aconst_null
      // 75: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 78: aload 1
      // 79: invokevirtual android/util/JsonReader.skipValue ()V
      // 7c: goto 1c
      // 7f: aload 1
      // 80: invokevirtual android/util/JsonReader.endObject ()V
      // 83: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 86: astore 3
      // 87: aload 1
      // 88: aconst_null
      // 89: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 8c: aload 2
      // 8d: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
      // 90: astore 1
      // 91: aload 1
      // 92: ldc_w "build(...)"
      // 95: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 98: aload 1
      // 99: areturn
      // 9a: aload 2
      // 9b: athrow
      // 9c: astore 3
      // 9d: aload 1
      // 9e: aload 2
      // 9f: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // a2: aload 3
      // a3: athrow
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
      // 03: ldc_w "DCDSecurityKeyManager.WebAuthn parsePublicKeyCredentialRequestOptions"
      // 06: aload 1
      // 07: aconst_null
      // 08: bipush 4
      // 09: aconst_null
      // 0a: invokestatic com/discord/logging/Log.i$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0d: new com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder
      // 10: dup
      // 11: invokespecial com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.<init> ()V
      // 14: astore 2
      // 15: new android/util/JsonReader
      // 18: dup
      // 19: new java/io/StringReader
      // 1c: dup
      // 1d: aload 1
      // 1e: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 21: invokespecial android/util/JsonReader.<init> (Ljava/io/Reader;)V
      // 24: astore 1
      // 25: aload 1
      // 26: invokevirtual android/util/JsonReader.beginObject ()V
      // 29: aload 1
      // 2a: invokevirtual android/util/JsonReader.hasNext ()Z
      // 2d: ifeq 8b
      // 30: aload 1
      // 31: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 34: astore 4
      // 36: aload 4
      // 38: ldc_w "publicKey"
      // 3b: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3e: ifeq 4e
      // 41: aload 0
      // 42: aload 1
      // 43: aload 2
      // 44: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 47: goto 29
      // 4a: astore 3
      // 4b: goto a6
      // 4e: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 51: astore 3
      // 52: new java/lang/StringBuilder
      // 55: astore 5
      // 57: aload 5
      // 59: invokespecial java/lang/StringBuilder.<init> ()V
      // 5c: aload 5
      // 5e: ldc_w "Found unexpected key in request options: `"
      // 61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 64: pop
      // 65: aload 5
      // 67: aload 4
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: pop
      // 6d: aload 5
      // 6f: ldc_w "`, skipping"
      // 72: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75: pop
      // 76: aload 3
      // 77: ldc "DCDSecurityKeyManager.WebAuthn"
      // 79: aload 5
      // 7b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e: aconst_null
      // 7f: bipush 4
      // 80: aconst_null
      // 81: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 84: aload 1
      // 85: invokevirtual android/util/JsonReader.skipValue ()V
      // 88: goto 29
      // 8b: aload 1
      // 8c: invokevirtual android/util/JsonReader.endObject ()V
      // 8f: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 92: astore 3
      // 93: aload 1
      // 94: aconst_null
      // 95: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 98: aload 2
      // 99: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // 9c: astore 1
      // 9d: aload 1
      // 9e: ldc_w "build(...)"
      // a1: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // a4: aload 1
      // a5: areturn
      // a6: aload 3
      // a7: athrow
      // a8: astore 2
      // a9: aload 1
      // aa: aload 3
      // ab: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // ae: aload 2
      // af: athrow
   }

   private fun parseRP(reader: JsonReader): PublicKeyCredentialRpEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing rp...", null, 4, null);
      var1.beginObject();
      var var3: java.lang.String = null;
      var var2: java.lang.String = null;

      while (var1.hasNext()) {
         val var4: java.lang.String = var1.nextName();
         if (q.c(var4, "id")) {
            var3 = var1.nextString();
         } else if (q.c(var4, "name")) {
            var2 = var1.nextString();
         } else {
            val var5: Log = Log.INSTANCE;
            val var6: StringBuilder = new StringBuilder();
            var6.append("... found unrecognized attribute: `");
            var6.append(var4);
            var6.append("`, skipping");
            Log.w$default(var5, "DCDSecurityKeyManager.WebAuthn parseRP", var6.toString(), null, 4, null);
            var1.skipValue();
         }
      }

      var1.endObject();
      val var8: Log = Log.INSTANCE;
      val var7: StringBuilder = new StringBuilder();
      var7.append("PublicKeyCredentialRpEntity(id=`");
      var7.append(var3);
      var7.append("`, name=`");
      var7.append(var2);
      var7.append("`)");
      Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn parseRP", var7.toString(), null, 4, null);
      q.e(var3);
      q.e(var2);
      return new PublicKeyCredentialRpEntity(var3, var2, null);
   }

   private fun parseRegistrationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", "Parsing registration extensions...", null, 4, null);
      val var2: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var3: java.lang.String = var1.nextName();
         if (q.c(var3, "uvm")) {
            val var7: t = new t(var1.nextBoolean());
            val var5: Log = Log.INSTANCE;
            val var4: StringBuilder = new StringBuilder();
            var4.append("... uvm extension: `");
            var4.append(var7);
            var4.append("`");
            Log.i$default(var5, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", var4.toString(), null, 4, null);
            var2.d(var7);
         } else {
            val var9: Log = Log.INSTANCE;
            val var8: StringBuilder = new StringBuilder();
            var8.append("... found unsupported extension: `");
            var8.append(var3);
            var8.append("`, skipping");
            Log.w$default(var9, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", var8.toString(), null, 4, null);
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
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", "Processing request options...", null, 4, null);

      while (var1.hasNext()) {
         val var6: java.lang.String = var1.nextName();
         if (var6 != null) {
            switch (var6.hashCode()) {
               case -1809421292:
                  if (var6.equals("extensions")) {
                     var2.c(this.parseAuthenticationExtensions(var1));
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var6.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var15: Log = Log.INSTANCE;
                     val var10: StringBuilder = new StringBuilder();
                     var10.append("timeout: `");
                     var10.append(var3);
                     var10.append("`");
                     Log.i$default(var15, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var10.toString(), null, 4, null);
                     var2.f(var3 / (double)1000);
                     continue;
                  }
                  break;
               case 3506169:
                  if (var6.equals("rpId")) {
                     val var17: java.lang.String = var1.nextString();
                     val var14: Log = Log.INSTANCE;
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("rpId: `");
                     var9.append(var17);
                     var9.append("`");
                     Log.i$default(var14, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var9.toString(), null, 4, null);
                     var2.e(var17);
                     continue;
                  }
                  break;
               case 493711347:
                  if (var6.equals("allowCredentials")) {
                     var2.b(this.parseCredentialDescriptors(var1));
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var6.equals("challenge")) {
                     val var16: java.lang.String = var1.nextString();
                     val var8: Log = Log.INSTANCE;
                     val var13: StringBuilder = new StringBuilder();
                     var13.append("challenge: `");
                     var13.append(var16);
                     var13.append("`");
                     Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var13.toString(), null, 4, null);
                     q.e(var16);
                     var2.d(this.decodeBase64(var16));
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var6.equals("userVerification")) {
                     val var5: java.lang.String = var1.nextString();
                     val var12: Log = Log.INSTANCE;
                     val var7: StringBuilder = new StringBuilder();
                     var7.append("userVerification: `");
                     var7.append(var5);
                     var7.append("`, skipping");
                     Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var7.toString(), null, 4, null);
                     continue;
                  }
               default:
            }
         }

         val var18: Log = Log.INSTANCE;
         val var11: StringBuilder = new StringBuilder();
         var11.append("Found unrecognized option: `");
         var11.append(var6);
         var11.append("`, skipping");
         Log.w$default(var18, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var11.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
   }

   @JvmStatic
   fun `registerSecurityKey$lambda$0`(var0: Function1, var1: Any) {
      q.h(var0, "$tmp0");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `registerSecurityKey$lambda$1`(var0: WebAuthn, var1: Exception) {
      q.h(var0, "this$0");
      q.h(var1, "it");
      var0.reject.invoke("task failed");
   }

   public fun authenticateSecurityKey(requestOptions: String, currentActivity: Activity?) {
      q.h(var1, "requestOptions");
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: cb.a = bb.a.a(var2);
         q.g(var3, "getFido2ApiClient(...)");
         val var4: Task = var3.J(this.parsePublicKeyCredentialRequestOptions(var1));
         q.g(var4, "getSignPendingIntent(...)");
         var4.h(new a(new Function1(var2) {
            final Activity $currentActivity;

            {
               super(1);
               this.$currentActivity = var1;
            }

            public final void invoke(PendingIntent var1) {
               this.$currentActivity.startIntentSenderForResult(var1.getIntentSender(), 4002, null, 0, 0, 0);
            }
         }));
         var4.f(new b(this));
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
               if (var7.x() is f) {
                  val var5: Function1 = this.reject;
                  val var10: g = var7.x();
                  q.f(var10, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
                  val var13: java.lang.String = (var10 as f).s();
                  var var11: java.lang.String = var13;
                  if (var13 == null) {
                     var11 = "Unknown error";
                  }

                  var5.invoke(var11);
               } else {
                  if (var1 != 4001) {
                     if (var1 == 4002) {
                        val var4: Function1 = this.resolve;
                        val var8: java.lang.String = var7.A();
                        q.g(var8, "toJson(...)");
                        var4.invoke(var8);
                     }
                  } else {
                     val var12: Function1 = this.resolve;
                     val var9: java.lang.String = var7.A();
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
         val var3: cb.a = bb.a.a(var2);
         q.g(var3, "getFido2ApiClient(...)");
         val var4: Task = var3.I(this.parsePublicKeyCredentialCreationOptions(var1));
         q.g(var4, "getRegisterPendingIntent(...)");
         var4.h(new c(new Function1(var2) {
            final Activity $currentActivity;

            {
               super(1);
               this.$currentActivity = var1;
            }

            public final void invoke(PendingIntent var1) {
               this.$currentActivity.startIntentSenderForResult(var1.getIntentSender(), 4001, null, 0, 0, 0);
            }
         }));
         var4.f(new d(this));
      }
   }

   public companion object {
      private const val BASE64_FLAG: Int
      private const val NAME: String
      private const val REQUEST_CODE_AUTHENTICATE_SK: Int
      private const val REQUEST_CODE_REGISTER_SK: Int
   }
}
