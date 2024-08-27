package com.discord.chat.bridge.row

import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.d
import kotlinx.serialization.json.g

public object RowSerializer : d(h0.b(Row.class)) {
   private const val CHANGE_TYPE_DELETE: String = "3"
   private final val rowSealedClassSerializer: SealedClassSerializer<Row> =
      new SealedClassSerializer(
         "Row",
         h0.b(Row.class),
         new KClass[]{h0.b(LoadingRow.class), h0.b(MessageRow.class), h0.b(SeparatorRow.class), h0.b(BlockedGroupRow.class), h0.b(UploadProgressRow.class)},
         new KSerializer[]{
            LoadingRow.Companion.serializer(),
            MessageRow.Companion.serializer(),
            SeparatorRow.Companion.serializer(),
            BlockedGroupRow.Companion.serializer(),
            UploadProgressRow.Companion.serializer()
         }
      )

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<Row> {
      r.h(var1, "element");
      val var2: JsonObject = g.o(var1);
      val var3: Any;
      if (var2.containsKey("type")) {
         var3 = rowSealedClassSerializer;
      } else {
         label19: {
            val var4: JsonElement = var2.get("changeType") as JsonElement;
            if (var4 != null) {
               val var5: JsonPrimitive = g.p(var4);
               if (var5 != null) {
                  var6 = var5.e();
                  break label19;
               }
            }

            var6 = null;
         }

         if (!r.c(var6, "3")) {
            val var7: StringBuilder = new StringBuilder();
            var7.append("unsupported row json: ");
            var7.append(var1);
            throw new IllegalArgumentException(var7.toString());
         }

         var3 = DeleteRow.Companion.serializer();
      }

      return (DeserializationStrategy<Row>)var3;
   }
}
