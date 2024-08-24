package com.discord.chat.bridge.gift

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.g

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
      val var5: JsonPrimitive = g.p(var4);
      var2 = false;
      if (var5 != null) {
         val var6: java.lang.String = var5.e();
         var2 = false;
         if (var6 != null) {
            var2 = false;
            if (f.x(var6) xor true) {
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
