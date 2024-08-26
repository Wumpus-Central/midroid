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
         var var4: java.lang.String = var1.nextName();
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
                  var4 = var1.nextString();
                  val var5: Log = Log.INSTANCE;
                  val var6: StringBuilder = new StringBuilder();
                  var6.append("... appid extension: `");
                  var6.append(var4);
                  var6.append("`");
                  Log.i$default(var5, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var6.toString(), null, 4, null);
                  var3.b(new k(var4));
                  continue;
               }
            } else if (var4.equals("uvm")) {
               val var9: t = new t(var1.nextBoolean());
               val var11: Log = Log.INSTANCE;
               val var13: StringBuilder = new StringBuilder();
               var13.append("... uvm extension: `");
               var13.append(var9);
               var13.append("`");
               Log.i$default(var11, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var13.toString(), null, 4, null);
               var3.d(var9);
               continue;
            }
         }

         val var12: Log = Log.INSTANCE;
         val var10: StringBuilder = new StringBuilder();
         var10.append("Found unrecognized extension: `");
         var10.append(var4);
         var10.append("`");
         Log.w$default(var12, "DCDSecurityKeyManager.WebAuthn parseAuthenticationExtensions", var10.toString(), null, 4, null);
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
                     val var10: com.google.android.gms.fido.fido2.api.common.c = com.google.android.gms.fido.fido2.api.common.c.b(var1.nextString());
                     r.g(var10, "fromString(reader.nextString())");
                     val var9: Log = Log.INSTANCE;
                     val var14: StringBuilder = new StringBuilder();
                     var14.append("... ResidentKeyRequirement: `");
                     var14.append(var10);
                     var14.append("`");
                     Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var14.toString(), null, 4, null);
                     var3.d(var10);
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var4.equals("userVerification")) {
                     val var6: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("... ");
                     var5.append(var4);
                     var5.append(": unsupported, skipping");
                     Log.w$default(var6, "DCDSecurityKeyManager.WebAuthn parseAuthenticatorSelection", var5.toString(), null, 4, null);
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
      r.g(var8, "builder.build()");
      return var8;
   }

   private fun parseCreationOptions(reader: JsonReader, builder: Builder) {
      var1.beginObject();
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", "Processing creation options...", null, 4, null);

      while (var1.hasNext()) {
         val var7: java.lang.String = var1.nextName();
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
                     val var9: Log = Log.INSTANCE;
                     val var12: StringBuilder = new StringBuilder();
                     var12.append("timeout: `");
                     var12.append(var3);
                     var12.append("`");
                     Log.i$default(var9, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var12.toString(), null, 4, null);
                     var2.i(var3 / (double)1000);
                     continue;
                  }
                  break;
               case -709624112:
                  if (var7.equals("attestation")) {
                     val var15: com.google.android.gms.fido.fido2.api.common.b = com.google.android.gms.fido.fido2.api.common.b.b(var1.nextString());
                     r.g(var15, "fromString(reader.nextString())");
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
                     val var5: java.lang.String = var1.nextString();
                     val var14: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("challenge: `");
                     var6.append(var5);
                     var6.append("`");
                     Log.i$default(var14, "DCDSecurityKeyManager.WebAuthn parseCreationOptions", var6.toString(), null, 4, null);
                     r.g(var5, "encodedChallenge");
                     var2.e(this.decodeBase64(var5));
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
                     val var5: java.lang.String = var1.nextString();
                     val var10: Log = Log.INSTANCE;
                     val var6: StringBuilder = new StringBuilder();
                     var6.append("... id: `");
                     var6.append(var5);
                     var6.append("`");
                     Log.i$default(var10, "DCDSecurityKeyManager.WebAuthn parseCredentialDescriptors", var6.toString(), null, 4, null);
                     r.g(var5, "encodedId");
                     var3 = this.decodeBase64(var5);
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
               val var5: Log = Log.INSTANCE;
               val var6: StringBuilder = new StringBuilder();
               var6.append("... found unrecognized parameter: `");
               var6.append(var7);
               var6.append("`, skipping");
               Log.w$default(var5, "DCDSecurityKeyManager.WebAuthn parsePKCParameters", var6.toString(), null, 4, null);
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
      // 20: ifeq 77
      // 23: aload 1
      // 24: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 27: astore 4
      // 29: aload 4
      // 2b: ldc_w "publicKey"
      // 2e: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 31: ifeq 3d
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: invokespecial com/discord/security_key/WebAuthn.parseCreationOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V
      // 3a: goto 1c
      // 3d: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 40: astore 5
      // 42: new java/lang/StringBuilder
      // 45: astore 3
      // 46: aload 3
      // 47: invokespecial java/lang/StringBuilder.<init> ()V
      // 4a: aload 3
      // 4b: ldc_w "Found unexpected key in object: `"
      // 4e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51: pop
      // 52: aload 3
      // 53: aload 4
      // 55: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58: pop
      // 59: aload 3
      // 5a: ldc_w "`, skipping"
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: pop
      // 61: aload 5
      // 63: ldc_w "DCDSecurityKeyManager.WebAuthn parsePublicKeyCredentialCreationOptions"
      // 66: aload 3
      // 67: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6a: aconst_null
      // 6b: bipush 4
      // 6c: aconst_null
      // 6d: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 70: aload 1
      // 71: invokevirtual android/util/JsonReader.skipValue ()V
      // 74: goto 1c
      // 77: aload 1
      // 78: invokevirtual android/util/JsonReader.endObject ()V
      // 7b: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 7e: astore 3
      // 7f: aload 1
      // 80: aconst_null
      // 81: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 84: aload 2
      // 85: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
      // 88: astore 1
      // 89: aload 1
      // 8a: ldc_w "builder.build()"
      // 8d: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 90: aload 1
      // 91: areturn
      // 92: astore 3
      // 93: aload 3
      // 94: athrow
      // 95: astore 2
      // 96: aload 1
      // 97: aload 3
      // 98: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 9b: aload 2
      // 9c: athrow
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
      // 2d: ifeq 83
      // 30: aload 1
      // 31: invokevirtual android/util/JsonReader.nextName ()Ljava/lang/String;
      // 34: astore 5
      // 36: aload 5
      // 38: ldc_w "publicKey"
      // 3b: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3e: ifeq 4a
      // 41: aload 0
      // 42: aload 1
      // 43: aload 2
      // 44: invokespecial com/discord/security_key/WebAuthn.parseRequestOptions (Landroid/util/JsonReader;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder;)V
      // 47: goto 29
      // 4a: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 4d: astore 4
      // 4f: new java/lang/StringBuilder
      // 52: astore 3
      // 53: aload 3
      // 54: invokespecial java/lang/StringBuilder.<init> ()V
      // 57: aload 3
      // 58: ldc_w "Found unexpected key in request options: `"
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: pop
      // 5f: aload 3
      // 60: aload 5
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: pop
      // 66: aload 3
      // 67: ldc_w "`, skipping"
      // 6a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d: pop
      // 6e: aload 4
      // 70: ldc "DCDSecurityKeyManager.WebAuthn"
      // 72: aload 3
      // 73: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 76: aconst_null
      // 77: bipush 4
      // 78: aconst_null
      // 79: invokestatic com/discord/logging/Log.w$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 7c: aload 1
      // 7d: invokevirtual android/util/JsonReader.skipValue ()V
      // 80: goto 29
      // 83: aload 1
      // 84: invokevirtual android/util/JsonReader.endObject ()V
      // 87: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 8a: astore 3
      // 8b: aload 1
      // 8c: aconst_null
      // 8d: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 90: aload 2
      // 91: invokevirtual com/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions$Builder.a ()Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRequestOptions;
      // 94: astore 1
      // 95: aload 1
      // 96: ldc_w "builder.build()"
      // 99: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 9c: aload 1
      // 9d: areturn
      // 9e: astore 3
      // 9f: aload 3
      // a0: athrow
      // a1: astore 2
      // a2: aload 1
      // a3: aload 3
      // a4: invokestatic oh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // a7: aload 2
      // a8: athrow
   }

   private fun parseRP(reader: JsonReader): PublicKeyCredentialRpEntity {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn", "Processing rp...", null, 4, null);
      var1.beginObject();
      var var3: java.lang.String = null;
      var var2: java.lang.String = null;

      while (var1.hasNext()) {
         val var6: java.lang.String = var1.nextName();
         if (r.c(var6, "id")) {
            var3 = var1.nextString();
         } else if (r.c(var6, "name")) {
            var2 = var1.nextString();
         } else {
            val var4: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("... found unrecognized attribute: `");
            var5.append(var6);
            var5.append("`, skipping");
            Log.w$default(var4, "DCDSecurityKeyManager.WebAuthn parseRP", var5.toString(), null, 4, null);
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
      r.e(var3);
      r.e(var2);
      return new PublicKeyCredentialRpEntity(var3, var2, null);
   }

   private fun parseRegistrationExtensions(reader: JsonReader): AuthenticationExtensions {
      Log.i$default(Log.INSTANCE, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", "Parsing registration extensions...", null, 4, null);
      val var2: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a();
      var1.beginObject();

      while (var1.hasNext()) {
         val var5: java.lang.String = var1.nextName();
         if (r.c(var5, "uvm")) {
            val var4: t = new t(var1.nextBoolean());
            val var3: Log = Log.INSTANCE;
            val var9: StringBuilder = new StringBuilder();
            var9.append("... uvm extension: `");
            var9.append(var4);
            var9.append("`");
            Log.i$default(var3, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", var9.toString(), null, 4, null);
            var2.d(var4);
         } else {
            val var8: Log = Log.INSTANCE;
            val var7: StringBuilder = new StringBuilder();
            var7.append("... found unsupported extension: `");
            var7.append(var5);
            var7.append("`, skipping");
            Log.w$default(var8, "DCDSecurityKeyManager.WebAuthn parseRegisterExtensions", var7.toString(), null, 4, null);
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
                     val var14: Log = Log.INSTANCE;
                     val var10: StringBuilder = new StringBuilder();
                     var10.append("timeout: `");
                     var10.append(var3);
                     var10.append("`");
                     Log.i$default(var14, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var10.toString(), null, 4, null);
                     var2.f(var3 / (double)1000);
                     continue;
                  }
                  break;
               case 3506169:
                  if (var7.equals("rpId")) {
                     val var9: java.lang.String = var1.nextString();
                     val var18: Log = Log.INSTANCE;
                     val var13: StringBuilder = new StringBuilder();
                     var13.append("rpId: `");
                     var13.append(var9);
                     var13.append("`");
                     Log.i$default(var18, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var13.toString(), null, 4, null);
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
                     val var12: java.lang.String = var1.nextString();
                     val var17: Log = Log.INSTANCE;
                     val var8: StringBuilder = new StringBuilder();
                     var8.append("challenge: `");
                     var8.append(var12);
                     var8.append("`");
                     Log.i$default(var17, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var8.toString(), null, 4, null);
                     r.g(var12, "challenge");
                     var2.d(this.decodeBase64(var12));
                     continue;
                  }
                  break;
               case 2036710790:
                  if (var7.equals("userVerification")) {
                     val var6: java.lang.String = var1.nextString();
                     val var16: Log = Log.INSTANCE;
                     val var5: StringBuilder = new StringBuilder();
                     var5.append("userVerification: `");
                     var5.append(var6);
                     var5.append("`, skipping");
                     Log.w$default(var16, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var5.toString(), null, 4, null);
                     continue;
                  }
               default:
            }
         }

         val var11: Log = Log.INSTANCE;
         val var15: StringBuilder = new StringBuilder();
         var15.append("Found unrecognized option: `");
         var15.append(var7);
         var15.append("`, skipping");
         Log.w$default(var11, "DCDSecurityKeyManager.WebAuthn parseRequestOptions", var15.toString(), null, 4, null);
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
