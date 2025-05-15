package com.discord.phone_verification

import Sa.d
import android.annotation.SuppressLint
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.content.pm.PackageManager.NameNotFoundException
import android.os.Build.VERSION
import android.util.Base64
import com.discord.logging.Log
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import o8.l

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

         var var1: Int;
         var var5: java.lang.String;
         var var6: PackageManager;
         try {
            var5 = this.this$0.getPackageName();
            var6 = this.this$0.getPackageManager();
            var1 = VERSION.SDK_INT;
         } catch (var18: NameNotFoundException) {
            Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var18);
            i.k();
            return var4;
         }

         var var3: Array<Signature> = null;
         if (var1 >= 33) {
            try {
               var20 = a.a(com.discord.intents.b.a(var6, var5, com.discord.intents.a.a((long)134217728)));
            } catch (var17: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var17);
               i.k();
               return var4;
            }

            if (var20 != null) {
               try {
                  var3 = b.a(var20);
               } catch (var16: NameNotFoundException) {
                  Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var16);
                  i.k();
                  return var4;
               }
            }
         } else {
            try {
               var21 = a.a(var6.getPackageInfo(var5, 134217728));
            } catch (var15: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var15);
               i.k();
               return var4;
            }

            if (var21 != null) {
               try {
                  var3 = b.a(var21);
               } catch (var14: NameNotFoundException) {
                  Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var14);
                  i.k();
                  return var4;
               }
            }
         }

         if (var3 != null) {
            var var2: Int;
            try {
               var22 = new ArrayList();
               var2 = var3.length;
            } catch (var13: NameNotFoundException) {
               Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var13);
               i.k();
               return var4;
            }

            for (int var19 = 0; var19 < var2; var19++) {
               val var7: Signature = var3[var19];

               var var9: java.lang.String;
               try {
                  val var8: AppSignatureHelper.Companion = AppSignatureHelper.Companion;
                  q.e(var5);
                  val var23: java.lang.String = var7.toCharsString();
                  q.g(var23, "toCharsString(...)");
                  var9 = AppSignatureHelper.Companion.access$hash(var8, var5, var23);
                  val var24: Log = Log.INSTANCE;
                  val var25: java.lang.String = var8.getTAG();
                  val var10: StringBuilder = new StringBuilder();
                  var10.append("Hash ");
                  var10.append(var9);
                  Log.i$default(var24, var25, var10.toString(), null, 4, null);
               } catch (var12: NameNotFoundException) {
                  Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var12);
                  i.k();
                  break;
               }

               if (var9 != null) {
                  try {
                     var22.add(var9);
                  } catch (var11: NameNotFoundException) {
                     Log.INSTANCE.e(AppSignatureHelper.Companion.getTAG(), "Unable to find package to obtain hash.", var11);
                     i.k();
                     break;
                  }
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
            val var8: java.lang.String = var3.toString();
            val var12: MessageDigest = MessageDigest.getInstance("SHA-256");
            q.g(var12, "getInstance(...)");
            var12.update(d.a(var8));
            val var9: ByteArray = var12.digest();
            q.g(var9, "digest(...)");
            val var10: java.lang.String = Base64.encodeToString(c.k(var9, 0, 9), 3);
            q.g(var10, "encodeToString(...)");
            var2 = var10.substring(0, 11);
            q.g(var2, "substring(...)");
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
