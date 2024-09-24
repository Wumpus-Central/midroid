package com.discord.serialization

import ei.c
import java.util.LinkedHashMap
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.b

public object SerializerUtils {
   public fun findErroringFields(jsonString: String, deserializerClass: KClass<*>): com.discord.serialization.SerializerUtils.SerializerError {
      q.h(var1, "jsonString");
      q.h(var2, "deserializerClass");
      val var6: JsonElement = b.b(null, <unrepresentable>.INSTANCE, 1, null).g(var1);
      if (var6 !is JsonObject) {
         return SerializerUtils.SerializerError.EMPTY.INSTANCE;
      } else {
         val var3: LinkedHashMap = new LinkedHashMap();

         for (KProperty1 var7 : c.a(var2)) {
            val var4: JsonElement = (var6 as JsonObject).get(var7.getName()) as JsonElement;
            if (var4 == null) {
               if (!var7.getReturnType().c()) {
                  var3.put(var7.getName(), "null");
               }
            } else if (!SerializerUtilsKt.access$parseProperty(var7, var4)) {
               var3.put(var7.getName(), var4.toString());
            }
         }

         return new SerializerUtils.SerializerError.Data(var3);
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
