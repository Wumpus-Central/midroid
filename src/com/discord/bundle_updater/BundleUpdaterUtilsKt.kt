package com.discord.bundle_updater

import android.content.res.AssetManager
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.l
import oh.q

public final val json: Json = l.b(null, <unrepresentable>.INSTANCE, 1, null)

internal fun AssetManager.getManifestFromAsset(asset: String): AppManifest {
   label21: {
      r.h(var0, "<this>");
      r.h(var1, "asset");
      val var9: InputStream = var0.open(var1);
      r.g(var9, "open(asset)");
      val var10: InputStreamReader = new InputStreamReader(var9, ik.a.b);
      val var11: BufferedReader;
      if (var10 is BufferedReader) {
         var11 = var10 as BufferedReader;
      } else {
         var11 = new BufferedReader(var10, 8192);
      }

      try {
         val var14: Json = json;
         var1 = q.e(var11);
         var14.a();
         var13 = var14.b(AppManifest.Companion.serializer(), var1) as AppManifest;
      } catch (var4: java.lang.Throwable) {
         val var2: java.lang.Throwable = var4;

         try {
            throw var2;
         } catch (var3: java.lang.Throwable) {
            oh.c.a(var11, var4);
         }
      }

      oh.c.a(var11, null);
      return var13;
   }
}
