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
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import na.f
import na.g
import na.k
import na.m
import na.n
import na.o
import na.p
import na.t

public class WebAuthn(resolve: (String) -> Unit, reject: (String) -> Unit) {
   public final val resolve: (String) -> Unit
   public final val reject: (String) -> Unit

   init {
      r.h(var1, "resolve");
      r.h(var2, "reject");
      super();
      this.resolve = var1;
      this.reject = var2;
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$3`(var0: Function1, var1: Any) {
      r.h(var0, "$tmp0");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `authenticateSecurityKey$lambda$4`(var0: WebAuthn, var1: Exception) {
      r.h(var0, "this$0");
      r.h(var1, "it");
      var0.reject.invoke("task failed");
   }

   private fun String.decodeBase64(): ByteArray {
      val var2: ByteArray = Base64.decode(var1, 11);
      r.g(var2, "decode(this, BASE64_FLAG)");
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
                  val var4: java.lang.String = var1.nextString();
                  val var10: Log = Log.INSTANCE;
                  val var6: StringBuilder = new StringBuilder();
                  var6.append("... appid extension: `");
                  var6.append(var4);
                  var6.append("`");
                  Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var6.toString(), null, 4, null);
                  var3.b(new k(var4));
                  continue;
               }
            } else if (var5.equals("uvm")) {
               val var13: t = new t(var1.nextBoolean());
               val var11: Log = Log.INSTANCE;
               val var9: StringBuilder = new StringBuilder();
               var9.append("... uvm extension: `");
               var9.append(var13);
               var9.append("`");
               Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var9.toString(), null, 4, null);
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
      r.g(var7, "builder.build()");
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
                     var13.append("... ");
                     var13.append(var4);
                     var13.append(": `");
                     var13.append(var2);
                     var13.append("`");
                     Log.i$default(var17, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var13.toString(), null, 4, null);
                     var3.c(var2);
                     continue;
                  }
                  break;
               case 563476214:
                  if (var4.equals("authenticatorAttachment")) {
                     val var11: com.google.android.gms.fido.fido2.api.common.a = com.google.android.gms.fido.fido2.api.common.a.b(var1.nextString());
                     r.g(var11, "fromString(reader.nextString())");
                     val var7: Log = Log.INSTANCE;
                     val var15: StringBuilder = new StringBuilder();
                     var15.append("... ");
                     var15.append(var4);
                     var15.append(": `");
                     var15.append(var11);
                     var15.append("`");
                     Log.i$default(var7, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var15.toString(), null, 4, null);
                     var3.b(var11);
                     continue;
                  }
                  break;
               case 1098323695:
                  if (var4.equals("residentKey")) {
                     val var9: com.google.android.gms.fido.fido2.api.common.c = com.google.android.gms.fido.fido2.api.common.c.b(var1.nextString());
                     r.g(var9, "fromString(reader.nextString())");
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
      r.g(var8, "builder.build()");
      return var8;
   }

   private fun parseCreationOptions(reader: JsonReader, builder: Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", "Processing creation options...", null, 4, null);

      while (var1.hasNext()) {
         var var6: java.lang.String = var1.nextName();
         if (var6 != null) {
            switch (var6.hashCode()) {
               case -1809421292:
                  if (var6.equals("extensions")) {
                     var2.c(this.parseRegistrationExtensions(var1));
                     continue;
                  }
                  break;
               case -1424409546:
                  if (var6.equals("pubKeyCredParams")) {
                     var2.g(this.parsePKCParameters(var1));
                     continue;
                  }
                  break;
               case -1313911455:
                  if (var6.equals("timeout")) {
                     val var3: Double = var1.nextDouble();
                     val var13: Log = Log.INSTANCE;
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("timeout: `");
                     var9.append(var3);
                     var9.append("`");
                     Log.i$default(var13, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var9.toString(), null, 4, null);
                     var2.i(var3 / (double)1000);
                     continue;
                  }
                  break;
               case -709624112:
                  if (var6.equals("attestation")) {
                     val var12: com.google.android.gms.fido.fido2.api.common.b = com.google.android.gms.fido.fido2.api.common.b.b(var1.nextString());
                     r.g(var12, "fromString(reader.nextString())");
                     val var14: Log = Log.INSTANCE;
                     val var8: StringBuilder = new StringBuilder();
                     var8.append("attestation preference: `");
                     var8.append(var12);
                     var8.append("`");
                     Log.i$default(var14, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var8.toString(), null, 4, null);
                     var2.b(var12);
                     continue;
                  }
                  break;
               case 3646:
                  if (var6.equals("rp")) {
                     var2.h(this.parseRP(var1));
                     continue;
                  }
                  break;
               case 3599307:
                  if (var6.equals("user")) {
                     var2.j(this.parsePKCUser(var1));
                     continue;
                  }
                  break;
               case 582307161:
                  if (var6.equals("authenticatorSelection")) {
                     var2.d(this.parseAuthenticatorSelection(var1));
                     continue;
                  }
                  break;
               case 1402633315:
                  if (var6.equals("challenge")) {
                     var6 = var1.nextString();
                     val var5: Log = Log.INSTANCE;
                     val var7: StringBuilder = new StringBuilder();
                     var7.append("challenge: `");
                     var7.append(var6);
                     var7.append("`");
                     Log.i$default(var5, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var7.toString(), null, 4, null);
                     r.g(var6, "encodedChallenge");
                     var2.e(this.decodeBase64(var6));
                     continue;
                  }
                  break;
               case 1684840642:
                  if (var6.equals("excludeCredentials")) {
                     var2.f(this.parseCredentialDescriptors(var1));
                     continue;
                  }
               default:
            }
         }

         val var15: Log = Log.INSTANCE;
         val var10: StringBuilder = new StringBuilder();
         var10.append("Found unexpected key in creation options: `");
         var10.append(var6);
         var10.append("`, skipping");
         Log.w$default(var15, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var10.toString(), null, 4, null);
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
                     r.g(var6, "encodedId");
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

            val var12: Log = Log.INSTANCE;
            val var7: StringBuilder = new StringBuilder();
            var7.append("... skipping unrecognized field `");
            var7.append(var6);
            var7.append("`");
            Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var7.toString(), null, 4, null);
            var1.skipValue();
         }

         var1.endObject();
         val var13: java.lang.String = p.k.toString();
         r.e(var3);
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
            val var7: java.lang.String = var1.nextName();
            if (r.c(var7, "type")) {
               var3 = var1.nextString();
            } else if (r.c(var7, "alg")) {
               var2 = var1.nextInt();
            } else {
               val var6: Log = Log.INSTANCE;
               val var5: StringBuilder = new StringBuilder();
               var5.append("... found unrecognized parameter: `");
               var5.append(var7);
               var5.append("`, skipping");
               Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn parsePKCParameters", var5.toString(), null, 4, null);
               var1.skipValue();
            }
         }

         var1.endObject();
         r.e(var3);
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
                     r.g(var3, "reader.nextString()");
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
      r.e(var5);
      val var10: ByteArray = this.decodeBase64(var5);
      r.e(var4);
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:562)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 2e: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 31: ifeq 3d
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: invokespecial com/discord/security_key/WebAuthn.parseCreationOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V
      // 3a: goto 1c
      // 3d: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 40: astore 3
      // 41: new java/lang/StringBuilder
      // 44: astore 4
      // 46: aload 4
      // 48: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b: aload 4
      // 4d: ldc_w "Found unexpected key in object: `"
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: pop
      // 54: aload 4
      // 56: aload 5
      // 58: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5b: pop
      // 5c: aload 4
      // 5e: ldc_w "`, skipping"
      // 61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 64: pop
      // 65: aload 3
      // 66: ldc_w "DCDSecurityKeyManager.WebAuthn parsePublicKeyCredentialCreationOptions"
      // 69: aload 4
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
      // 85: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 88: aload 2
      // 89: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
      // 8c: astore 1
      // 8d: aload 1
      // 8e: ldc_w "builder.build()"
      // 91: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 94: aload 1
      // 95: areturn
      // 96: astore 3
      // 97: aload 3
      // 98: athrow
      // 99: astore 2
      // 9a: aload 1
      // 9b: aload 3
      // 9c: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 9f: aload 2
      // a0: athrow
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:562)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 2d: ifeq 86
      // 30: aload 1
      // 31: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 34: astore 3
      // 35: aload 3
      // 36: ldc_w "publicKey"
      // 39: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3c: ifeq 48
      // 3f: aload 0
      // 40: aload 1
      // 41: aload 2
      // 42: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 45: goto 29
      // 48: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 4b: astore 4
      // 4d: new java/lang/StringBuilder
      // 50: astore 5
      // 52: aload 5
      // 54: invokespecial java/lang/StringBuilder.<init> ()V
      // 57: aload 5
      // 59: ldc_w "Found unexpected key in request options: `"
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: pop
      // 60: aload 5
      // 62: aload 3
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: pop
      // 67: aload 5
      // 69: ldc_w "`, skipping"
      // 6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f: pop
      // 70: aload 4
      // 72: ldc "DCDSecurityKeyManager.WebAuthn"
      // 74: aload 5
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: aconst_null
      // 7a: bipush 4
      // 7b: aconst_null
      // 7c: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 7f: aload 1
      // 80: invokevirtual android/util/JsonReader.skipValue ()V
      // 83: goto 29
      // 86: aload 1
      // 87: invokevirtual android/util/JsonReader.endObject ()V
      // 8a: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 8d: astore 3
      // 8e: aload 1
      // 8f: aconst_null
      // 90: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 93: aload 2
      // 94: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // 97: astore 1
      // 98: aload 1
      // 99: ldc_w "builder.build()"
      // 9c: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 9f: aload 1
      // a0: areturn
      // a1: astore 2
      // a2: aload 2
      // a3: athrow
      // a4: astore 3
      // a5: aload 1
      // a6: aload 2
      // a7: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // aa: aload 3
      // ab: athrow
   }

   private fun parseRP(reader: JsonReader): PublicKeyCredentialRpEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing rp...", null, 4, null);
      var1.beginObject();
      var var3: java.lang.String = null;
      var var2: java.lang.String = null;

      while (var1.hasNext()) {
         val var5: java.lang.String = var1.nextName();
         if (r.c(var5, "id")) {
            var3 = var1.nextString();
         } else if (r.c(var5, "name")) {
            var2 = var1.nextString();
         } else {
            val var4: Log = Log.INSTANCE;
            val var6: StringBuilder = new StringBuilder();
            var6.append("... found unrecognized attribute: `");
            var6.append(var5);
            var6.append("`, skipping");
            Log.w$default(var4, "DCDSecurityKeyManager.WebAuthn parseRP", var6.toString(), null, 4, null);
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
      r.e(var3);
      r.e(var2);
      return new PublicKeyCredentialRpEntity(var3, var2, null);
   }

   private fun parseRegistrationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", "Parsing registration extensions...", null, 4, null);
      val var2: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var3: java.lang.String = var1.nextName();
         if (r.c(var3, "uvm")) {
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
      r.g(var6, "builder.build()");
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
                     val var10: Log = Log.INSTANCE;
                     val var15: StringBuilder = new StringBuilder();
                     var15.append("timeout: `");
                     var15.append(var3);
                     var15.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var15.toString(), null, 4, null);
                     var2.f(var3 / (double)1000);
                     continue;
                  }
                  break;
               case 3506169:
                  if (var6.equals("rpId")) {
                     val var9: java.lang.String = var1.nextString();
                     val var14: Log = Log.INSTANCE;
                     val var17: StringBuilder = new StringBuilder();
                     var17.append("rpId: `");
                     var17.append(var9);
                     var17.append("`");
                     Log.i$default(var14, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var17.toString(), null, 4, null);
                     var2.e(var9);
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
                     val var8: java.lang.String = var1.nextString();
                     val var13: Log = Log.INSTANCE;
                     val var16: StringBuilder = new StringBuilder();
                     var16.append("challenge: `");
                     var16.append(var8);
                     var16.append("`");
                     Log.i$default(var13, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var16.toString(), null, 4, null);
                     r.g(var8, "challenge");
                     var2.d(this.decodeBase64(var8));
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
      r.h(var0, "$tmp0");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `registerSecurityKey$lambda$1`(var0: WebAuthn, var1: Exception) {
      r.h(var0, "this$0");
      r.h(var1, "it");
      var0.reject.invoke("task failed");
   }

   public fun authenticateSecurityKey(requestOptions: String, currentActivity: Activity?) {
      r.h(var1, "requestOptions");
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: ma.a = la.a.a(var2);
         r.g(var3, "getFido2ApiClient(currentActivity)");
         val var4: Task = var3.I(this.parsePublicKeyCredentialRequestOptions(var1));
         r.g(var4, "client.getSignPendingInt…equestOptions),\n        )");
         var4.g(new a(new Function1<PendingIntent, Unit>(var2) {
            final Activity $currentActivity;

            {
               super(1);
               this.$currentActivity = var1;
            }

            public final void invoke(PendingIntent var1) {
               this.$currentActivity.startIntentSenderForResult(var1.getIntentSender(), 4002, null, 0, 0, 0);
            }
         }));
         var4.e(new b(this));
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
               val var7: m = m.r(var6);
               r.g(var7, "deserializeFromBytes(bytes)");
               if (var7.D() is f) {
                  val var5: Function1 = this.reject;
                  val var10: g = var7.D();
                  r.f(var10, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
                  val var13: java.lang.String = (var10 as f).t();
                  var var11: java.lang.String = var13;
                  if (var13 == null) {
                     var11 = "Unknown error";
                  }

                  var5.invoke(var11);
               } else {
                  if (var1 != 4001) {
                     if (var1 == 4002) {
                        val var4: Function1 = this.resolve;
                        val var8: java.lang.String = var7.K();
                        r.g(var8, "credential.toJson()");
                        var4.invoke(var8);
                     }
                  } else {
                     val var12: Function1 = this.resolve;
                     val var9: java.lang.String = var7.K();
                     r.g(var9, "credential.toJson()");
                     var12.invoke(var9);
                  }
               }
            }
         }
      }
   }

   public fun registerSecurityKey(creationOptions: String, currentActivity: Activity?) {
      r.h(var1, "creationOptions");
      if (var2 == null) {
         this.reject.invoke("no activity");
      } else {
         val var3: ma.a = la.a.a(var2);
         r.g(var3, "getFido2ApiClient(currentActivity)");
         val var4: Task = var3.H(this.parsePublicKeyCredentialCreationOptions(var1));
         r.g(var4, "client.getRegisterPendin…eationOptions),\n        )");
         var4.g(new c(new Function1<PendingIntent, Unit>(var2) {
            final Activity $currentActivity;

            {
               super(1);
               this.$currentActivity = var1;
            }

            public final void invoke(PendingIntent var1) {
               this.$currentActivity.startIntentSenderForResult(var1.getIntentSender(), 4001, null, 0, 0, 0);
            }
         }));
         var4.e(new d(this));
      }
   }

   public companion object {
      private const val BASE64_FLAG: Int
      private const val NAME: String
      private const val REQUEST_CODE_AUTHENTICATE_SK: Int
      private const val REQUEST_CODE_REGISTER_SK: Int
   }
}
