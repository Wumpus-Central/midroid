package com.discord.chat.bridge.row

import bv.e
import bv.h
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

public object RowSerializer : e(Row::class) {
   private const val CHANGE_TYPE_DELETE: String = "3"
   private final val rowSealedClassSerializer: SealedClassSerializer<Row> =
      new SealedClassSerializer(
         "Row",
         Row::class,
         new KClass[]{LoadingRow::class, MessageRow::class, SeparatorRow::class, BlockedGroupRow::class},
         new KSerializer[]{
            LoadingRow.Companion.serializer(), MessageRow.Companion.serializer(), SeparatorRow.Companion.serializer(), BlockedGroupRow.Companion.serializer()
         }
      )

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<Row> {
      val var2: JsonObject = h.n(var1);
      if (var2.containsKey("type")) {
         return rowSealedClassSerializer;
      } else {
         label19: {
            val var3: JsonElement = var2.get("changeType") as JsonElement;
            if (var3 != null) {
               val var4: JsonPrimitive = h.o(var3);
               if (var4 != null) {
                  var5 = var4.b();
                  break label19;
               }
            }

            var5 = null;
         }

         if (var5 == "3") {
            return DeleteRow.Companion.serializer();
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append("unsupported row json: ");
            var6.append(var1);
            throw new IllegalArgumentException(var6.toString());
         }
      }
   }
}
