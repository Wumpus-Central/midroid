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
      val var10: BufferedReader = new BufferedReader(new InputStreamReader(var9, La.a.b), 8192);

      try {
         val var11: Json = json;
         val var13: java.lang.String = q9.q.e(var10);
         var11.a();
         var12 = var11.b(AppManifest.Companion.serializer(), var13) as AppManifest;
      } catch (var4: java.lang.Throwable) {
         val var2: java.lang.Throwable = var4;

         try {
            throw var2;
         } catch (var3: java.lang.Throwable) {
            q9.c.a(var10, var4);
         }
      }

      q9.c.a(var10, null);
      return var12;
   }
}

fun `json$lambda$0`(var0: JsonBuilder): Unit {
   q.h(var0, "$this$Json");
   var0.c(true);
   return Unit.a;
}
