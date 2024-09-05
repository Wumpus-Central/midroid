package com.discord.serialization

import java.util.LinkedHashMap
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.b
import pk.c

public object SerializerUtils {
   public fun findErroringFields(jsonString: String, deserializerClass: KClass<*>): com.discord.serialization.SerializerUtils.SerializerError {
      q.h(var1, "jsonString");
      q.h(var2, "deserializerClass");
      val var3: JsonElement = b.b(null, <unrepresentable>.INSTANCE, 1, null).g(var1);
      if (var3 !is JsonObject) {
         return SerializerUtils.SerializerError.EMPTY.INSTANCE;
      } else {
         val var6: LinkedHashMap = new LinkedHashMap();

         for (KProperty1 var4 : c.a(var2)) {
            val var5: JsonElement = (var3 as JsonObject).get(var4.getName()) as JsonElement;
            if (var5 == null) {
               if (!var4.getReturnType().k()) {
                  var6.put(var4.getName(), "null");
               }
            } else if (!SerializerUtilsKt.access$parseProperty(var4, var5)) {
               var6.put(var4.getName(), var5.toString());
            }
         }

         return new SerializerUtils.SerializerError.Data(var6);
      }
   }

   public sealed class SerializerError protected constructor() {
      public data class Data(data: Map<String, String>) : SerializerUtils.SerializerError {
         public final val data: Map<String, String>

         init {
            q.h(var1, "data");
            super(null);
            this.data = var1;
         }

         public operator fun component1(): Map<String, String> {
            return this.data;
         }

         public fun copy(data: Map<String, String> = var0.data): com.discord.serialization.SerializerUtils.SerializerError.Data {
            q.h(var1, "data");
            return new SerializerUtils.SerializerError.Data(var1);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is SerializerUtils.SerializerError.Data) {
               return false;
            } else {
               return q.c(this.data, (var1 as SerializerUtils.SerializerError.Data).data);
            }
         }

         public override fun hashCode(): Int {
            return this.data.hashCode();
         }

         public override fun toString(): String {
            val var1: java.util.Map = this.data;
            val var2: StringBuilder = new StringBuilder();
            var2.append("Data(data=");
            var2.append(var1);
            var2.append(")");
            return var2.toString();
         }
      }

      public object EMPTY : SerializerUtils.SerializerError()
   }
}
