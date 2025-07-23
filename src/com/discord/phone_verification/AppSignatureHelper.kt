package com.discord.phone_verification

import Z1.a
import Z1.c
import android.annotation.SuppressLint
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.content.pm.PackageManager.NameNotFoundException
import android.os.Build.VERSION
import android.util.Base64
import com.discord.intents.b
import com.discord.logging.Log
import dc.f
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.ArrayList
import kotlin.jvm.internal.r
import z9.j

@SuppressLint(["PackageManagerGetSignatures"])
public class AppSignatureHelper(context: Context?) : ContextWrapper(var1) {
   public final val appSignatures: MutableList<String> by j.a(new c(this))
      public final get() {
         return this.appSignatures$delegate.getValue() as MutableList<java.lang.String>;
      }


   @JvmStatic
   fun {
      val var0: java.lang.String = AppSignatureHelper.class.getSimpleName();
      r.g(var0, "getSimpleName(...)");
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
         i.k();
         return var3;
      }

      var var18: Array<Signature> = null;
      if (var1 >= 33) {
         try {
            var20 = a.a(b.a(var5, var4, com.discord.intents.a.a((long)134217728)));
         } catch (var16: NameNotFoundException) {
            Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var16);
            i.k();
            return var3;
         }

         if (var20 != null) {
            try {
               var18 = Z1.b.a(var20);
            } catch (var15: NameNotFoundException) {
               Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var15);
               i.k();
               return var3;
            }
         }
      } else {
         try {
            var21 = a.a(var5.getPackageInfo(var4, 134217728));
         } catch (var14: NameNotFoundException) {
            Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var14);
            i.k();
            return var3;
         }

         if (var21 != null) {
            try {
               var18 = Z1.b.a(var21);
            } catch (var13: NameNotFoundException) {
               Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var13);
               i.k();
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
            i.k();
            return var3;
         }

         for (int var19 = 0; var19 < var2; var19++) {
            val var7: Signature = var18[var19];

            var var23: java.lang.String;
            try {
               val var6: AppSignatureHelper.Companion = Companion;
               r.e(var4);
               val var24: java.lang.String = var7.toCharsString();
               r.g(var24, "toCharsString(...)");
               var23 = AppSignatureHelper.Companion.access$hash(var6, var4, var24);
               val var25: Log = Log.INSTANCE;
               val var8: java.lang.String = TAG;
               val var9: StringBuilder = new StringBuilder();
               var9.append("Hash ");
               var9.append(var23);
               Log.i$default(var25, var8, var9.toString(), null, 4, null);
            } catch (var11: NameNotFoundException) {
               Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var11);
               i.k();
               break;
            }

            if (var23 != null) {
               try {
                  var22.add(var23);
               } catch (var10: NameNotFoundException) {
                  Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", var10);
                  i.k();
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
            r.g(var12, "getInstance(...)");
            var12.update(f.a(var8));
            val var9: ByteArray = var12.digest();
            r.g(var9, "digest(...)");
            val var10: java.lang.String = Base64.encodeToString(kotlin.collections.c.n(var9, 0, 9), 3);
            r.g(var10, "encodeToString(...)");
            var2 = var10.substring(0, 11);
            r.g(var2, "substring(...)");
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
