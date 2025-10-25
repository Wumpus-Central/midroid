@file:SourceDebugExtension(["SMAP\nGiftEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftEmbed.kt\ncom/discord/chat/bridge/gift/GiftEmbedKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n12371#2,2:95\n*S KotlinDebug\n*F\n+ 1 GiftEmbed.kt\ncom/discord/chat/bridge/gift/GiftEmbedKt\n*L\n93#1:95,2\n*E\n"])

package com.discord.chat.bridge.gift

import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import oc.h

@JvmSynthetic
fun `access$hasPrimitive`(var0: JsonObject, var1: java.lang.String): Boolean {
   return hasPrimitive(var0, var1);
}

@JvmSynthetic
fun `access$hasPrimitives`(var0: JsonObject, vararg var1: java.lang.String): Boolean {
   return hasPrimitives(var0, var1);
}

private fun JsonObject.hasPrimitive(key: String): Boolean {
   val var4: JsonElement = var0.get(var1) as JsonElement;
   var var2: Boolean = false;
   if (var4 != null) {
      val var5: JsonPrimitive = h.o(var4);
      var2 = false;
      if (var5 != null) {
         val var6: java.lang.String = var5.c();
         var2 = false;
         if (var6 != null) {
            var2 = false;
            if (StringsKt.c0(var6) xor true) {
               var2 = true;
            }
         }
      }
   }

   return var2;
}

private fun JsonObject.hasPrimitives(vararg keys: String): Boolean {
   val var3: Int = var1.length;
   var var4: Boolean = false;
   var var2: Int = 0;

   while (true) {
      if (var2 >= var3) {
         var4 = true;
         break;
      }

      if (!hasPrimitive(var0, var1[var2])) {
         break;
      }

      var2++;
   }

   return var4;
}
