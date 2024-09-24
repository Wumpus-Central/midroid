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
         val var4: java.lang.String = var1.nextName();
         if (var4 != null) {
            val var2: Int = var4.hashCode();
            if (var2 != 116204) {
               if (var2 != 93029116) {
                  if (var2 == 757680504 && var4.equals("largeBlob")) {
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
               } else if (var4.equals("appid")) {
                  val var6: java.lang.String = var1.nextString();
                  val var8: Log = Log.INSTANCE;
                  val var5: StringBuilder = new StringBuilder();
                  var5.append("... appid extension: `");
                  var5.append(var6);
                  var5.append("`");
                  Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var5.toString(), null, 4, null);
                  var3.b(new k(var6));
                  continue;
               }
            } else if (var4.equals("uvm")) {
               val var11: t = new t(var1.nextBoolean());
               val var9: Log = Log.INSTANCE;
               val var13: StringBuilder = new StringBuilder();
               var13.append("... uvm extension: `");
               var13.append(var11);
               var13.append("`");
               Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var13.toString(), null, 4, null);
               var3.d(var11);
               continue;
            }
         }

         val var10: Log = Log.INSTANCE;
         val var12: StringBuilder = new StringBuilder();
         var12.append("Found unrecognized extension: `");
         var12.append(var4);
         var12.append("`");
         Log.w$default(var10, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var12.toString(), null, 4, null);
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
                     val var15: com.google.android.gms.fido.fido2.api.common.a = com.google.android.gms.fido.fido2.api.common.a.d(var1.nextString());
                     q.g(var15, "fromString(...)");
                     val var11: Log = Log.INSTANCE;
                     val var7: StringBuilder = new StringBuilder();
                     var7.append("... ");
                     var7.append(var4);
                     var7.append(": `");
                     var7.append(var15);
                     var7.append("`");
                     Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var7.toString(), null, 4, null);
                     var3.b(var15);
                     continue;
                  }
                  break;
               case 1098323695:
                  if (var4.equals("residentKey")) {
                     val var9: com.google.android.gms.fido.fido2.api.common.c = com.google.android.gms.fido.fido2.api.common.c.d(var1.nextString());
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

         val var16: Log = Log.INSTANCE;
         val var12: StringBuilder = new StringBuilder();
         var12.append("... found unrecognized criteria: `");
         var12.append(var4);
         var12.append("`, skipping");
         Log.w$default(var16, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var12.toString(), null, 4, null);
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
                     val var15: com.google.android.gms.fido.fido2.api.common.b = com.google.android.gms.fido.fido2.api.common.b.d(var1.nextString());
                     q.g(var15, "fromString(...)");
                     val var8: Log = Log.INSTANCE;
                     val var11: StringBuilder = new StringBuilder();
                     var11.append("attestation preference: `");
                     var11.append(var15);
                     var11.append("`");
                     Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var11.toString(), null, 4, null);
                     var2.b(var15);
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
                     val var5: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("challenge: `");
                     var6.append(var7);
                     var6.append("`");
                     Log.i$default(var5, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var6.toString(), null, 4, null);
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
            val var7: java.lang.String = var1.nextName();
            if (var7 != null) {
               val var2: Int = var7.hashCode();
               if (var2 != -1717834134) {
                  if (var2 != 3355) {
                     if (var2 == 3575610 && var7.equals("type")) {
                        Log.w$default(
                           Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", "... skipping unsupported field `type`", null, 4, null
                        );
                        var1.skipValue();
                        continue;
                     }
                  } else if (var7.equals("id")) {
                     val var10: java.lang.String = var1.nextString();
                     val var6: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("... id: `");
                     var5.append(var10);
                     var5.append("`");
                     Log.i$default(var6, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var5.toString(), null, 4, null);
                     q.e(var10);
                     var3 = this.decodeBase64(var10);
                     continue;
                  }
               } else if (var7.equals("transports")) {
                  Log.w$default(
                     Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", "... skipping unsupported field `transports`", null, 4, null
                  );
                  var1.skipValue();
                  continue;
               }
            }

            val var12: Log = Log.INSTANCE;
            val var14: StringBuilder = new StringBuilder();
            var14.append("... skipping unrecognized field `");
            var14.append(var7);
            var14.append("`");
            Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var14.toString(), null, 4, null);
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
      val var8: Log = Log.INSTANCE;
      val var9: Int = var4.size();
      val var10: StringBuilder = new StringBuilder();
      var10.append("Processed ");
      var10.append(var9);
      var10.append(" parameters");
      Log.i$default(var8, "DCDSecurityKeyManager.WebAuthn parsePKCParameters", var10.toString(), null, 4, null);
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

         val var6: Log = Log.INSTANCE;
         val var8: StringBuilder = new StringBuilder();
         var8.append("... found unrecognized member: `");
         var8.append(var7);
         var8.append("`, skipping");
         Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn parsePKCUser", var8.toString(), null, 4, null);
         var1.skipValue();
      }

      var1.endObject();
      val var9: Log = Log.INSTANCE;
      val var11: StringBuilder = new StringBuilder();
      var11.append("PublicKeyCredentialUserEntity(id=`");
      var11.append(var5);
      var11.append("`, name=`");
      var11.append(var4);
      var11.append("`, icon=null, displayName=`");
      var11.append(var3);
      var11.append("`)");
      Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn parsePKCUser", var11.toString(), null, 4, null);
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
      // 20: ifeq 7b
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
      // 3d: astore 3
      // 3e: goto 96
      // 41: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 44: astore 4
      // 46: new java/lang/StringBuilder
      // 49: astore 3
      // 4a: aload 3
      // 4b: invokespecial java/lang/StringBuilder.<init> ()V
      // 4e: aload 3
      // 4f: ldc_w "Found unexpected key in object: `"
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: pop
      // 56: aload 3
      // 57: aload 5
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: pop
      // 5d: aload 3
      // 5e: ldc_w "`, skipping"
      // 61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 64: pop
      // 65: aload 4
      // 67: ldc_w "DCDSecurityKeyManager.WebAuthn parsePublicKeyCredentialCreationOptions"
      // 6a: aload 3
      // 6b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6e: aconst_null
      // 6f: bipush 4
      // 70: aconst_null
      // 71: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 74: aload 1
      // 75: invokevirtual android/util/JsonReader.skipValue ()V
      // 78: goto 1c
      // 7b: aload 1
      // 7c: invokevirtual android/util/JsonReader.endObject ()V
      // 7f: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 82: astore 3
      // 83: aload 1
      // 84: aconst_null
      // 85: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 88: aload 2
      // 89: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
      // 8c: astore 1
      // 8d: aload 1
      // 8e: ldc_w "build(...)"
      // 91: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 94: aload 1
      // 95: areturn
      // 96: aload 3
      // 97: athrow
      // 98: astore 2
      // 99: aload 1
      // 9a: aload 3
      // 9b: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 9e: aload 2
      // 9f: athrow
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
      // 2d: ifeq 8a
      // 30: aload 1
      // 31: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 34: astore 3
      // 35: aload 3
      // 36: ldc_w "publicKey"
      // 39: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3c: ifeq 4c
      // 3f: aload 0
      // 40: aload 1
      // 41: aload 2
      // 42: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 45: goto 29
      // 48: astore 2
      // 49: goto a5
      // 4c: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 4f: astore 4
      // 51: new java/lang/StringBuilder
      // 54: astore 5
      // 56: aload 5
      // 58: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b: aload 5
      // 5d: ldc_w "Found unexpected key in request options: `"
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 63: pop
      // 64: aload 5
      // 66: aload 3
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: pop
      // 6b: aload 5
      // 6d: ldc_w "`, skipping"
      // 70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 73: pop
      // 74: aload 4
      // 76: ldc "DCDSecurityKeyManager.WebAuthn"
      // 78: aload 5
      // 7a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d: aconst_null
      // 7e: bipush 4
      // 7f: aconst_null
      // 80: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 83: aload 1
      // 84: invokevirtual android/util/JsonReader.skipValue ()V
      // 87: goto 29
      // 8a: aload 1
      // 8b: invokevirtual android/util/JsonReader.endObject ()V
      // 8e: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 91: astore 3
      // 92: aload 1
      // 93: aconst_null
      // 94: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 97: aload 2
      // 98: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // 9b: astore 1
      // 9c: aload 1
      // 9d: ldc_w "build(...)"
      // a0: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // a3: aload 1
      // a4: areturn
      // a5: aload 2
      // a6: athrow
      // a7: astore 3
      // a8: aload 1
      // a9: aload 2
      // aa: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // ad: aload 3
      // ae: athrow
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
            val var6: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("... found unrecognized attribute: `");
            var5.append(var4);
            var5.append("`, skipping");
            Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn parseRP", var5.toString(), null, 4, null);
            var1.skipValue();
         }
      }

      var1.endObject();
      val var7: Log = Log.INSTANCE;
      val var8: StringBuilder = new StringBuilder();
      var8.append("PublicKeyCredentialRpEntity(id=`");
      var8.append(var3);
      var8.append("`, name=`");
      var8.append(var2);
      var8.append("`)");
      Log.i$default(var7, "DCDSecurityKeyManager.WebAuthn parseRP", var8.toString(), null, 4, null);
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
            val var4: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("... uvm extension: `");
            var5.append(var7);
            var5.append("`");
            Log.i$default(var4, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", var5.toString(), null, 4, null);
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
         val var7: java.lang.String = var1.nextName();
         if (var7 != null) {
            switch (var7.hashCode()) {
               case -1809421292:
                  if (var7.equals("extensions")) {
                     var2.c(this.parseAuthenticationExtensions(var1));
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var7.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var10: Log = Log.INSTANCE;
                     val var14: StringBuilder = new StringBuilder();
                     var14.append("timeout: `");
                     var14.append(var3);
                     var14.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var14.toString(), null, 4, null);
                     var2.f(var3 / (double)1000);
                     continue;
                  }
                  break;
               case 3506169:
                  if (var7.equals("rpId")) {
                     val var9: java.lang.String = var1.nextString();
                     val var13: Log = Log.INSTANCE;
                     val var18: StringBuilder = new StringBuilder();
                     var18.append("rpId: `");
                     var18.append(var9);
                     var18.append("`");
                     Log.i$default(var13, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var18.toString(), null, 4, null);
                     var2.e(var9);
                     continue;
                  }
                  break;
               case 493711347:
                  if (var7.equals("allowCredentials")) {
                     var2.b(this.parseCredentialDescriptors(var1));
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var7.equals("challenge")) {
                     val var8: java.lang.String = var1.nextString();
                     val var12: Log = Log.INSTANCE;
                     val var17: StringBuilder = new StringBuilder();
                     var17.append("challenge: `");
                     var17.append(var8);
                     var17.append("`");
                     Log.i$default(var12, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var17.toString(), null, 4, null);
                     q.e(var8);
                     var2.d(this.decodeBase64(var8));
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var7.equals("userVerification")) {
                     val var5: java.lang.String = var1.nextString();
                     val var6: Log = Log.INSTANCE;
                     val var16: StringBuilder = new StringBuilder();
                     var16.append("userVerification: `");
                     var16.append(var5);
                     var16.append("`, skipping");
                     Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var16.toString(), null, 4, null);
                     continue;
                  }
               default:
            }
         }

         val var15: Log = Log.INSTANCE;
         val var11: StringBuilder = new StringBuilder();
         var11.append("Found unrecognized option: `");
         var11.append(var7);
         var11.append("`, skipping");
         Log.w$default(var15, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var11.toString(), null, 4, null);
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
         val var4: Task = var3.I(this.parsePublicKeyCredentialRequestOptions(var1));
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
               val var7: m = m.o(var6);
               q.g(var7, "deserializeFromBytes(...)");
               if (var7.w() is f) {
                  val var5: Function1 = this.reject;
                  val var10: g = var7.w();
                  q.f(var10, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
                  val var13: java.lang.String = (var10 as f).r();
                  var var11: java.lang.String = var13;
                  if (var13 == null) {
                     var11 = "Unknown error";
                  }

                  var5.invoke(var11);
               } else {
                  if (var1 != 4001) {
                     if (var1 == 4002) {
                        val var4: Function1 = this.resolve;
                        val var8: java.lang.String = var7.z();
                        q.g(var8, "toJson(...)");
                        var4.invoke(var8);
                     }
                  } else {
                     val var12: Function1 = this.resolve;
                     val var9: java.lang.String = var7.z();
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
         val var4: Task = var3.H(this.parsePublicKeyCredentialCreationOptions(var1));
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
