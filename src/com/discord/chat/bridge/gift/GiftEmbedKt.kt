@file:SourceDebugExtension(["SMAP\nGiftEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftEmbed.kt\ncom/discord/chat/bridge/gift/GiftEmbedKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n12371#2,2:95\n*S KotlinDebug\n*F\n+ 1 GiftEmbed.kt\ncom/discord/chat/bridge/gift/GiftEmbedKt\n*L\n93#1:95,2\n*E\n"])

package com.discord.chat.bridge.gift

import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import xp.h

@JvmSynthetic
fun `access$hasPrimitive`(var0: JsonObject, var1: java.lang.String): Boolean {
   return hasPrimitive(var0, var1);
}

@JvmSynthetic
fun `access$hasPrimitives`(var0: JsonObject, vararg var1: java.lang.String): Boolean {
   return hasPrimitives(var0, var1);
}

private fun JsonObject.hasPrimitive(key: String): Boolean {
   val var2: JsonElement = var0.get(var1) as JsonElement;
   if (var2 != null) {
      val var3: JsonPrimitive = h.o(var2);
      if (var3 != null) {
         val var4: java.lang.String = var3.b();
         if (var4 != null && StringsKt.c0(var4) xor true) {
            return true;
         }
      }
   }

   return false;
}

private fun JsonObject.hasPrimitives(vararg keys: String): Boolean {
   val var3: Int = var1.length;

   for (int var2 = 0; var2 < var3; var2++) {
      if (!hasPrimitive(var0, var1[var2])) {
         return false;
      }
   }

   return true;
}
