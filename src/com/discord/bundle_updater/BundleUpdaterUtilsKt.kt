package com.discord.bundle_updater

import android.content.res.AssetManager
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder

public final val json: Json = kotlinx.serialization.json.b.b(null, new m(), 1, null)

@JvmSynthetic
fun a(var0: JsonBuilder): Unit {
   return json$lambda$0(var0);
}

internal fun AssetManager.getManifestFromAsset(asset: String): AppManifest {
   label18: {
      q.h(var0, "<this>");
      q.h(var1, "asset");
      val var9: InputStream = var0.open(var1);
      q.g(var9, "open(...)");
      val var10: BufferedReader = new BufferedReader(new InputStreamReader(var9, Na.a.b), 8192);

      try {
         val var2: Json = json;
         var1 = s9.q.e(var10);
         var2.a();
         var13 = var2.b(AppManifest.Companion.serializer(), var1) as AppManifest;
      } catch (var4: java.lang.Throwable) {
         val var11: java.lang.Throwable = var4;

         try {
            throw var11;
         } catch (var3: java.lang.Throwable) {
            s9.c.a(var10, var4);
         }
      }

      s9.c.a(var10, null);
      return var13;
   }
}

fun `json$lambda$0`(var0: JsonBuilder): Unit {
   q.h(var0, "$this$Json");
   var0.c(true);
   return Unit.a;
}
