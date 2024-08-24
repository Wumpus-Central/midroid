package com.discord.phone_verification

import android.annotation.SuppressLint
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.Signature
import android.content.pm.PackageManager.NameNotFoundException
import android.content.pm.PackageManager.PackageInfoFlags
import android.os.Build.VERSION
import android.util.Base64
import com.discord.logging.Log
import dm.f
import eh.l
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

@SuppressLint(["PackageManagerGetSignatures"])
public class AppSignatureHelper(context: Context?) : ContextWrapper(var1) {
   public final val appSignatures: MutableList<String> by l.b(new Function0<java.util.List<java.lang.String>>(this) {
      final AppSignatureHelper this$0;

      {
         super(0);
         this.this$0 = var1;
      }

      // $VF: Duplicated exception handlers to handle obfuscated exceptions
      public final java.util.List<java.lang.String> invoke() {
         val var4: ArrayList = new ArrayList();

         var var5: java.lang.String;
         var var16: Array<Signature>;
         label51: {
            try {
               var5 = this.this$0.getPackageName();
               var3 = this.this$0.getPackageManager();
               if (VERSION.SDK_INT >= 33) {
                  var16 = b.a(a.a(var3.getPackageInfo(var5, PackageInfoFlags.of((long)134217728))));
                  break label51;
               }
            } catch (var15: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var15);
               h.i();
               return var4;
            }

            try {
               var16 = b.a(a.a(var3.getPackageInfo(var5, 134217728)));
            } catch (var14: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var14);
               h.i();
               return var4;
            }
         }

         var var2: Int;
         var var6: ArrayList;
         try {
            r.g(var16, "packageInfos");
            var6 = new ArrayList();
            var2 = var16.length;
         } catch (var13: NameNotFoundException) {
            Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var13);
            h.i();
            return var4;
         }

         for (int var1 = 0; var1 < var2; var1++) {
            val var7: Signature = var16[var1];

            var var8: java.lang.String;
            try {
               val var9: AppSignatureHelper.Companion = AppSignatureHelper.Companion;
               r.g(var5, "packageName");
               val var17: java.lang.String = var7.toCharsString();
               r.g(var17, "signature.toCharsString()");
               var8 = AppSignatureHelper.Companion.access$hash(var9, var5, var17);
               val var18: Log = Log.INSTANCE;
               val var10: java.lang.String = var9.getTAG();
               val var19: StringBuilder = new StringBuilder();
               var19.append("Hash ");
               var19.append(var8);
               Log.i$default(var18, var10, var19.toString(), null, 4, null);
            } catch (var12: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var12);
               h.i();
               break;
            }

            if (var8 != null) {
               try {
                  var6.add(var8);
               } catch (var11: NameNotFoundException) {
                  Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var11);
                  h.i();
                  break;
               }
            }
         }

         return var4;
      }
   })
      public final get() {
         return this.appSignatures$delegate.getValue() as java.util.List<java.lang.String>;
      }


   @JvmStatic
   fun {
      val var0: java.lang.String = AppSignatureHelper.class.getSimpleName();
      r.g(var0, "AppSignatureHelper::class.java.simpleName");
      TAG = var0;
   }

   public companion object {
      private const val HASH_TYPE: String
      private const val NUM_BASE64_CHAR: Int
      private const val NUM_HASHED_BYTES: Int
      public final val TAG: String

      private fun hash(packageName: String, signature: String): String? {
         try {
            val var3: StringBuilder = new StringBuilder();
            var3.append(var1);
            var3.append(" ");
            var3.append(var2);
            val var8: java.lang.String = var3.toString();
            val var12: MessageDigest = MessageDigest.getInstance("SHA-256");
            r.g(var12, "getInstance(HASH_TYPE)");
            var12.update(f.a(var8));
            val var9: ByteArray = var12.digest();
            r.g(var9, "messageDigest.digest()");
            val var10: java.lang.String = Base64.encodeToString(kotlin.collections.b.j(var9, 0, 9), 3);
            r.g(var10, "encodeToString(hashSigna…ADDING or Base64.NO_WRAP)");
            var2 = var10.substring(0, 11);
            r.g(var2, "this as java.lang.String…ing(startIndex, endIndex)");
            val var13: Log = Log.INSTANCE;
            val var5: java.lang.String = this.getTAG();
            val var4: StringBuilder = new StringBuilder();
            var4.append("pkg: ");
            var4.append(var1);
            var4.append(" -- hash: ");
            var4.append(var2);
            Log.i$default(var13, var5, var4.toString(), null, 4, null);
         } catch (var6: NoSuchAlgorithmException) {
            Log.INSTANCE.e(this.getTAG(), "hash:NoSuchAlgorithm", var6);
            return null;
         }

         return var2;
      }
   }
}
