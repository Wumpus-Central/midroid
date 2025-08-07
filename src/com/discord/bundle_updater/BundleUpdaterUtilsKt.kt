package com.discord.bundle_updater

import M9.q
import android.content.res.AssetManager
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder

public final val json: Json = kotlinx.serialization.json.b.b(null, new m(), 1, null)

@JvmSynthetic
fun a(var0: JsonBuilder): Unit {
   return json$lambda$0(var0);
}

internal fun AssetManager.getManifestFromAsset(asset: String): AppManifest {
   label18: {
      r.h(var0, "<this>");
      r.h(var1, "asset");
      val var9: InputStream = var0.open(var1);
      r.g(var9, "open(...)");
      val var10: BufferedReader = new BufferedReader(new InputStreamReader(var9, hb.a.b), 8192);

      try {
         val var12: Json = json;
         val var2: java.lang.String = q.e(var10);
         var12.a();
         var13 = var12.b(AppManifest.Companion.serializer(), var2) as AppManifest;
      } catch (var4: java.lang.Throwable) {
         val var11: java.lang.Throwable = var4;

         try {
            throw var11;
         } catch (var3: java.lang.Throwable) {
            M9.c.a(var10, var4);
         }
      }

      M9.c.a(var10, null);
      return var13;
   }
}

fun `json$lambda$0`(var0: JsonBuilder): Unit {
   r.h(var0, "$this$Json");
   var0.c(true);
   return Unit.a;
}
