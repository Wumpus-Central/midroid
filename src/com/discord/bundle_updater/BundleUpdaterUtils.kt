package com.discord.bundle_updater

import Pa.g
import java.io.File
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import m8.w
import okio.BufferedSource
import y8.j

public object BundleUpdaterUtils {
   public fun compareJSONData(apkManifest: AppManifest, oldManifest: AppManifest?, newManifest: AppManifest): List<Pair<String, AssetStatus>> {
      q.h(var1, "apkManifest");
      q.h(var3, "newManifest");
      val var4: java.util.Set = var3.getHashes().keySet();
      val var5: ArrayList = new ArrayList();

      for (java.lang.String var7 : var4) {
         val var8: java.lang.String = var3.getHashes().get(var7);
         val var9: Pair;
         if (q.c(var8, var1.getHashes().get(var7))) {
            var9 = null;
         } else {
            val var10: AssetStatus;
            if (var2 != null && q.c(var8, var2.getHashes().get(var7))) {
               var10 = AssetStatus.CopyFromPrevious;
            } else {
               var10 = AssetStatus.Download;
            }

            var9 = w.a(var7, var10);
         }

         if (var9 != null) {
            var5.add(var9);
         }
      }

      return i.R0(var5);
   }

   public fun getManifestFromFile(file: File): AppManifest {
      q.h(var1, "file");
      val var2: Json = BundleUpdaterUtilsKt.getJson();
      val var3: java.lang.String = j.f(var1, null, 1, null);
      var2.a();
      return var2.b(AppManifest.Companion.serializer(), var3) as AppManifest;
   }

   public fun md5(file: File): String {
      label18: {
         q.h(var1, "file");
         val var10: BufferedSource = Pa.j.d(Pa.j.k(var1));

         var var11: java.lang.String;
         try {
            val var2: g = g.m.a(Pa.j.b());
            var10.G1(var2);
            var11 = var2.a().s();
         } catch (var5: java.lang.Throwable) {
            val var3: java.lang.Throwable = var5;

            try {
               throw var3;
            } catch (var4: java.lang.Throwable) {
               y8.c.a(var10, var5);
            }
         }

         y8.c.a(var10, null);
         return var11;
      }
   }
}
