package com.discord.bundle_updater

import android.content.res.AssetManager
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json

public final val json: Json = kotlinx.serialization.json.b.b(null, <unrepresentable>.INSTANCE, 1, null)

internal fun AssetManager.getManifestFromAsset(asset: String): AppManifest {
   label21: {
      q.h(var0, "<this>");
      q.h(var1, "asset");
      val var9: InputStream = var0.open(var1);
      q.g(var9, "open(...)");
      val var10: InputStreamReader = new InputStreamReader(var9, qk.a.b);
      val var11: BufferedReader;
      if (var10 is BufferedReader) {
         var11 = var10 as BufferedReader;
      } else {
         var11 = new BufferedReader(var10, 8192);
      }

      try {
         val var2: Json = json;
         var1 = vh.q.e(var11);
         var2.a();
         var14 = var2.b(AppManifest.Companion.serializer(), var1) as AppManifest;
      } catch (var4: java.lang.Throwable) {
         val var12: java.lang.Throwable = var4;

         try {
            throw var12;
         } catch (var3: java.lang.Throwable) {
            vh.c.a(var11, var4);
         }
      }

      vh.c.a(var11, null);
      return var14;
   }
}
