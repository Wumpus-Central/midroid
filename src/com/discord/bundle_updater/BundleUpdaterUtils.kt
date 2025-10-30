package com.discord.bundle_updater

import fm.v
import java.io.File
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import okio.BufferedSource

@SourceDebugExtension(["SMAP\nBundleUpdaterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdaterUtils.kt\ncom/discord/bundle_updater/BundleUpdaterUtils\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n123#2:82\n1611#3,9:83\n1863#3:92\n1864#3:94\n1620#3:95\n1#4:93\n*S KotlinDebug\n*F\n+ 1 BundleUpdaterUtils.kt\ncom/discord/bundle_updater/BundleUpdaterUtils\n*L\n52#1:82\n58#1:83,9\n58#1:92\n58#1:94\n58#1:95\n58#1:93\n*E\n"])
public object BundleUpdaterUtils {
   public fun compareJSONData(apkManifest: AppManifest, oldManifest: AppManifest?, newManifest: AppManifest): List<Pair<String, AssetStatus>> {
      val var4: java.lang.Iterable = var3.getHashes().keySet();
      val var5: ArrayList = new ArrayList();

      for (java.lang.String var7 : var4) {
         val var8: java.lang.String = var3.getHashes().get(var7);
         val var9: Pair;
         if (var8 == var1.getHashes().get(var7)) {
            var9 = null;
         } else {
            val var10: AssetStatus;
            if (var2 != null && var8 == var2.getHashes().get(var7)) {
               var10 = AssetStatus.CopyFromPrevious;
            } else {
               var10 = AssetStatus.Download;
            }

            var9 = v.a(var7, var10);
         }

         if (var9 != null) {
            var5.add(var9);
         }
      }

      return CollectionsKt.W0(var5);
   }

   public fun getManifestFromFile(file: File): AppManifest {
      val var2: Json = BundleUpdaterUtilsKt.getJson();
      val var3: java.lang.String = pm.j.g(var1, null, 1, null);
      var2.a();
      return var2.b(AppManifest.Companion.serializer(), var3) as AppManifest;
   }

   public fun md5(file: File): String {
      label18: {
         val var10: BufferedSource = dr.m.d(dr.m.k(var1));

         var var11: java.lang.String;
         try {
            val var2: dr.j = dr.j.s.a(dr.m.b());
            var10.F1(var2);
            var11 = var2.b().r();
         } catch (var5: java.lang.Throwable) {
            val var3: java.lang.Throwable = var5;

            try {
               throw var3;
            } catch (var4: java.lang.Throwable) {
               pm.c.a(var10, var5);
            }
         }

         pm.c.a(var10, null);
         return var11;
      }
   }
}
