package com.discord.phone_verification

import B9.j
import Y1.a
import Y1.b
import Y1.c
import Yb.f
import android.annotation.SuppressLint
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.content.pm.PackageManager.NameNotFoundException
import android.os.Build.VERSION
import android.util.Base64
import com.appsflyer.internal.p
import com.appsflyer.internal.q
import com.discord.logging.Log
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SuppressLint(["PackageManagerGetSignatures"])
@SourceDebugExtension(["SMAP\nAppSignatureHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSignatureHelper.kt\ncom/discord/phone_verification/AppSignatureHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n11483#2,9:115\n13409#2:124\n13410#2:126\n11492#2:127\n1#3:125\n*S KotlinDebug\n*F\n+ 1 AppSignatureHelper.kt\ncom/discord/phone_verification/AppSignatureHelper\n*L\n74#1:115,9\n74#1:124\n74#1:126\n74#1:127\n74#1:125\n*E\n"])
public class AppSignatureHelper(context: Context?) : ContextWrapper(var1) {
   public final val appSignatures: MutableList<String> by j.b(new c(this))
      public final get() {
         return this.appSignatures$delegate.getValue() as MutableList<java.lang.String>;
      }


   @JvmStatic
   fun {
      val var0: java.lang.String = AppSignatureHelper.class.getSimpleName();
      TAG = var0;
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmStatic
   fun `appSignatures_delegate$lambda$2`(var0: AppSignatureHelper): java.util.List {
      val var3: ArrayList = new ArrayList();

      var var1: Int;
      var var4: java.lang.String;
      var var5: PackageManager;
      try {
         var4 = var0.getPackageName();
         var5 = var0.getPackageManager();
         var1 = VERSION.SDK_INT;
      } catch (var17: NameNotFoundException) {
         Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var17);
         CollectionsKt.k();
         return var3;
      }

      var var18: Array<Signature> = null;
      if (var1 >= 33) {
         try {
            var20 = a.a(q.a(var5, var4, p.a((long)134217728)));
         } catch (var16: NameNotFoundException) {
            Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var16);
            CollectionsKt.k();
            return var3;
         }

         if (var20 != null) {
            try {
               var18 = b.a(var20);
            } catch (var15: NameNotFoundException) {
               Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var15);
               CollectionsKt.k();
               return var3;
            }
         }
      } else {
         try {
            var21 = a.a(var5.getPackageInfo(var4, 134217728));
         } catch (var14: NameNotFoundException) {
            Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var14);
            CollectionsKt.k();
            return var3;
         }

         if (var21 != null) {
            try {
               var18 = b.a(var21);
            } catch (var13: NameNotFoundException) {
               Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var13);
               CollectionsKt.k();
               return var3;
            }
         }
      }

      if (var18 != null) {
         var var2: Int;
         try {
            var22 = new ArrayList();
            var2 = var18.length;
         } catch (var12: NameNotFoundException) {
            Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var12);
            CollectionsKt.k();
            return var3;
         }

         for (int var19 = 0; var19 < var2; var19++) {
            val var7: Signature = var18[var19];

            var var8: java.lang.String;
            try {
               val var6: AppSignatureHelper.Companion = Companion;
               val var24: java.lang.String = var7.toCharsString();
               var8 = AppSignatureHelper.Companion.access$hash(var6, var4, var24);
               val var9: Log = Log.INSTANCE;
               val var25: java.lang.String = TAG;
               val var23: StringBuilder = new StringBuilder();
               var23.append("Hash ");
               var23.append(var8);
               Log.i$default(var9, var25, var23.toString(), null, 4, null);
            } catch (var11: NameNotFoundException) {
               Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var11);
               CollectionsKt.k();
               break;
            }

            if (var8 != null) {
               try {
                  var22.add(var8);
               } catch (var10: NameNotFoundException) {
                  Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var10);
                  CollectionsKt.k();
                  break;
               }
            }
         }
      }

      return var3;
   }

   public companion object {
      public final val TAG: String
      private const val HASH_TYPE: String
      private const val NUM_HASHED_BYTES: Int
      private const val NUM_BASE64_CHAR: Int

      private fun hash(packageName: String, signature: String): String? {
         try {
            var var3: StringBuilder = new StringBuilder();
            var3.append(var1);
            var3.append(" ");
            var3.append(var2);
            val var8: java.lang.String = var3.toString();
            val var12: MessageDigest = MessageDigest.getInstance("SHA-256");
            var12.update(f.a(var8));
            val var9: ByteArray = var12.digest();
            val var10: java.lang.String = Base64.encodeToString(h.n(var9, 0, 9), 3);
            var2 = var10.substring(0, 11);
            val var4: Log = Log.INSTANCE;
            val var5: java.lang.String = this.getTAG();
            var3 = new StringBuilder();
            var3.append("pkg: ");
            var3.append(var1);
            var3.append(" -- hash: ");
            var3.append(var2);
            Log.i$default(var4, var5, var3.toString(), null, 4, null);
         } catch (var6: NoSuchAlgorithmException) {
            Log.INSTANCE.e(this.getTAG(), "hash:NoSuchAlgorithm", var6);
            return null;
         }

         return var2;
      }
   }
}
