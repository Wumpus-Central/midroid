@file:SourceDebugExtension(["SMAP\nBundleUpdaterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdaterUtils.kt\ncom/discord/bundle_updater/BundleUpdaterUtilsKt\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,81:1\n123#2:82\n*S KotlinDebug\n*F\n+ 1 BundleUpdaterUtils.kt\ncom/discord/bundle_updater/BundleUpdaterUtilsKt\n*L\n47#1:82\n*E\n"])

package com.discord.bundle_updater

import L9.p
import android.content.res.AssetManager
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder

public final val json: Json = kotlinx.serialization.json.b.b(null, new m(), 1, null)

@JvmSynthetic
fun a(var0: JsonBuilder): Unit {
   return json$lambda$0(var0);
}

internal fun AssetManager.getManifestFromAsset(asset: String): AppManifest {
   label18: {
      val var9: InputStream = var0.open(var1);
      val var10: BufferedReader = new BufferedReader(new InputStreamReader(var9, Charsets.UTF_8), 8192);

      try {
         val var2: Json = json;
         var1 = p.f(var10);
         var2.a();
         var13 = var2.b(AppManifest.Companion.serializer(), var1) as AppManifest;
      } catch (var4: java.lang.Throwable) {
         val var11: java.lang.Throwable = var4;

         try {
            throw var11;
         } catch (var3: java.lang.Throwable) {
            L9.c.a(var10, var4);
         }
      }

      L9.c.a(var10, null);
      return var13;
   }
}

fun `json$lambda$0`(var0: JsonBuilder): Unit {
   var0.c(true);
   return Unit.a;
}
