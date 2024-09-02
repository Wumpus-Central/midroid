package com.discord.bundle_updater

import java.io.File
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import lj.w
import no.m
import okio.BufferedSource
import wj.j

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

      return i.Q0(var5);
   }

   public fun getManifestFromFile(file: File): AppManifest {
      q.h(var1, "file");
      val var2: Json = BundleUpdaterUtilsKt.getJson();
      val var3: java.lang.String = j.d(var1, null, 1, null);
      var2.a();
      return var2.b(AppManifest.Companion.serializer(), var3) as AppManifest;
   }

   public fun md5(file: File): String {
      label18: {
         q.h(var1, "file");
         val var10: BufferedSource = m.d(m.k(var1));

         var var11: java.lang.String;
         try {
            val var2: no.j = no.j.m.a(m.b());
            var10.W1(var2);
            var11 = var2.a().o();
         } catch (var5: java.lang.Throwable) {
            val var3: java.lang.Throwable = var5;

            try {
               throw var3;
            } catch (var4: java.lang.Throwable) {
               wj.c.a(var10, var5);
            }
         }

         wj.c.a(var10, null);
         return var11;
      }
   }
}
