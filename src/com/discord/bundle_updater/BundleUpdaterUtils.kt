package com.discord.bundle_updater

import cm.m
import eh.w
import java.io.File
import java.util.ArrayList
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import oh.j
import okio.BufferedSource

public object BundleUpdaterUtils {
   public fun compareJSONData(apkManifest: AppManifest, oldManifest: AppManifest?, newManifest: AppManifest): List<Pair<String, AssetStatus>> {
      r.h(var1, "apkManifest");
      r.h(var3, "newManifest");
      val var4: java.util.Set = var3.getHashes().keySet();
      val var5: ArrayList = new ArrayList();

      for (java.lang.String var7 : var4) {
         val var8: java.lang.String = var3.getHashes().get(var7);
         val var9: Pair;
         if (r.c(var8, var1.getHashes().get(var7))) {
            var9 = null;
         } else {
            val var10: AssetStatus;
            if (var2 != null && r.c(var8, var2.getHashes().get(var7))) {
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

      return h.M0(var5);
   }

   public fun getManifestFromFile(file: File): AppManifest {
      r.h(var1, "file");
      val var2: Json = BundleUpdaterUtilsKt.getJson();
      val var3: java.lang.String = j.d(var1, null, 1, null);
      var2.a();
      return var2.b(AppManifest.Companion.serializer(), var3) as AppManifest;
   }

   public fun md5(file: File): String {
      label18: {
         r.h(var1, "file");
         val var10: BufferedSource = m.d(m.k(var1));

         var var12: java.lang.String;
         try {
            val var11: cm.j = cm.j.m.a(m.b());
            var10.T0(var11);
            var12 = var11.a().r();
         } catch (var5: java.lang.Throwable) {
            val var2: java.lang.Throwable = var5;

            try {
               throw var2;
            } catch (var4: java.lang.Throwable) {
               oh.c.a(var10, var5);
            }
         }

         oh.c.a(var10, null);
         return var12;
      }
   }
}
