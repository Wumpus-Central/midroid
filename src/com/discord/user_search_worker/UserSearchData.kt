package com.discord.user_search_worker

import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import uk.f
import yk.d
import yk.g

@f(with = UserSearchData.Serializer::class)
internal sealed class UserSearchData protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<UserSearchData> {
         return UserSearchData.Serializer.INSTANCE;
      }
   }

   internal object Serializer : d(g0.b(UserSearchData.class)) {
      protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<UserSearchData> {
         var var6: java.lang.String;
         label34: {
            q.h(var1, "element");
            val var3: JsonElement = g.o(var1).get("type") as JsonElement;
            if (var3 != null) {
               val var5: JsonPrimitive = g.p(var3);
               if (var5 != null) {
                  var6 = var5.a();
                  break label34;
               }
            }

            var6 = null;
         }

         if (var6 != null) {
            val var2: Int = var6.hashCode();
            if (var2 != -1657296142) {
               if (var2 != 981007403) {
                  if (var2 == 2135696342 && var6.equals("QUERY_CLEAR")) {
                     return UserSearchQueryClearData.Companion.serializer();
                  }
               } else if (var6.equals("QUERY_SET")) {
                  return UserSearchQuerySetData.Companion.serializer();
               }
            } else if (var6.equals("UPDATE_USERS")) {
               return UserSearchUpdateUsersData.Companion.serializer();
            }
         }

         val var7: StringBuilder = new StringBuilder();
         var7.append("unable to find deserializer for json: ");
         var7.append(var1);
         throw new IllegalArgumentException(var7.toString());
      }
   }
}
