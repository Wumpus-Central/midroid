package com.discord.user_search_worker

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import tp.m
import xp.e
import xp.h

@m(with = UserSearchData.Serializer::class)
internal sealed class UserSearchData protected constructor() {
   public companion object {
      public fun serializer(): KSerializer<UserSearchData> {
         return UserSearchData.Serializer.INSTANCE;
      }
   }

   internal object Serializer : e(UserSearchData::class) {
      protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<UserSearchData> {
         var var5: java.lang.String;
         label30: {
            val var3: JsonElement = h.n(var1).get("type") as JsonElement;
            if (var3 != null) {
               val var4: JsonPrimitive = h.o(var3);
               if (var4 != null) {
                  var5 = var4.b();
                  break label30;
               }
            }

            var5 = null;
         }

         if (var5 != null) {
            val var2: Int = var5.hashCode();
            if (var2 != -1657296142) {
               if (var2 != 981007403) {
                  if (var2 == 2135696342 && var5.equals("QUERY_CLEAR")) {
                     return UserSearchQueryClearData.Companion.serializer();
                  }
               } else if (var5.equals("QUERY_SET")) {
                  return UserSearchQuerySetData.Companion.serializer();
               }
            } else if (var5.equals("UPDATE_USERS")) {
               return UserSearchUpdateUsersData.Companion.serializer();
            }
         }

         val var6: StringBuilder = new StringBuilder();
         var6.append("unable to find deserializer for json: ");
         var6.append(var1);
         throw new IllegalArgumentException(var6.toString());
      }
   }
}
