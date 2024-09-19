package com.discord.phone_verification

import android.annotation.SuppressLint
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.Signature
import android.content.pm.PackageManager.NameNotFoundException
import android.os.Build.VERSION
import android.util.Base64
import com.discord.intents.a
import com.discord.intents.b
import com.discord.logging.Log
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.ArrayList
import k2.a0
import k2.z
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import nh.l
import qm.f

@SuppressLint(["PackageManagerGetSignatures"])
public class AppSignatureHelper(context: Context?) : ContextWrapper(var1) {
   public final val appSignatures: MutableList<String> by l.a(new Function0(this) {
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
         label52: {
            try {
               var5 = this.this$0.getPackageName();
               var3 = this.this$0.getPackageManager();
               if (VERSION.SDK_INT >= 33) {
                  var16 = a0.a(z.a(b.a(var3, var5, a.a((long)134217728))));
                  break label52;
               }
            } catch (var15: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var15);
               i.k();
               return var4;
            }

            try {
               var16 = a0.a(z.a(var3.getPackageInfo(var5, 134217728)));
            } catch (var14: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var14);
               i.k();
               return var4;
            }
         }

         var var2: Int;
         var var6: ArrayList;
         try {
            q.e(var16);
            var6 = new ArrayList();
            var2 = var16.length;
         } catch (var13: NameNotFoundException) {
            Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var13);
            i.k();
            return var4;
         }

         for (int var1 = 0; var1 < var2; var1++) {
            val var8: Signature = var16[var1];

            try {
               val var7: AppSignatureHelper.Companion = AppSignatureHelper.Companion;
               q.e(var5);
               val var18: java.lang.String = var8.toCharsString();
               q.g(var18, "toCharsString(...)");
               var19 = AppSignatureHelper.Companion.access$hash(var7, var5, var18);
               val var9: Log = Log.INSTANCE;
               val var17: java.lang.String = var7.getTAG();
               val var10: StringBuilder = new StringBuilder();
               var10.append("Hash ");
               var10.append(var19);
               Log.i$default(var9, var17, var10.toString(), null, 4, null);
            } catch (var12: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var12);
               i.k();
               break;
            }

            if (var19 != null) {
               try {
                  var6.add(var19);
               } catch (var11: NameNotFoundException) {
                  Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var11);
                  i.k();
                  break;
               }
            }
         }

         return var4;
      }
   })
      public final get() {
         return this.appSignatures$delegate.getValue() as MutableList<java.lang.String>;
      }


   @JvmStatic
   fun {
      val var0: java.lang.String = AppSignatureHelper.class.getSimpleName();
      q.g(var0, "getSimpleName(...)");
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
            val var12: java.lang.String = var3.toString();
            val var8: MessageDigest = MessageDigest.getInstance("SHA-256");
            q.g(var8, "getInstance(...)");
            var8.update(f.a(var12));
            val var9: ByteArray = var8.digest();
            q.g(var9, "digest(...)");
            val var10: java.lang.String = Base64.encodeToString(c.j(var9, 0, 9), 3);
            q.g(var10, "encodeToString(...)");
            var2 = var10.substring(0, 11);
            q.g(var2, "substring(...)");
            val var4: Log = Log.INSTANCE;
            val var13: java.lang.String = this.getTAG();
            val var5: StringBuilder = new StringBuilder();
            var5.append("pkg: ");
            var5.append(var1);
            var5.append(" -- hash: ");
            var5.append(var2);
            Log.i$default(var4, var13, var5.toString(), null, 4, null);
         } catch (var6: NoSuchAlgorithmException) {
            Log.INSTANCE.e(this.getTAG(), "hash:NoSuchAlgorithm", var6);
            return null;
         }

         return var2;
      }
   }
}
