package com.discord.serialization

import U9.c
import f2.a
import java.util.LinkedHashMap
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.b

public object SerializerUtils {
   @JvmStatic
   fun `findErroringFields$lambda$0`(var0: JsonBuilder): Unit {
      r.h(var0, "$this$Json");
      var0.c(true);
      return Unit.a;
   }

   public fun findErroringFields(jsonString: String, deserializerClass: KClass<*>): com.discord.serialization.SerializerUtils.SerializerError {
      r.h(var1, "jsonString");
      r.h(var2, "deserializerClass");
      val var6: JsonElement = b.b(null, new a(), 1, null).g(var1);
      if (var6 !is JsonObject) {
         return SerializerUtils.SerializerError.EMPTY.INSTANCE;
      } else {
         val var3: LinkedHashMap = new LinkedHashMap();

         for (KProperty1 var7 : c.a(var2)) {
            val var4: JsonElement = (var6 as JsonObject).get(var7.getName()) as JsonElement;
            if (var4 == null) {
               if (!var7.getReturnType().j()) {
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
            r.h(var1, "data");
            super(null);
            this.data = var1;
         }

         public operator fun component1(): Map<String, String> {
            return this.data;
         }

         public fun copy(data: Map<String, String> = var0.data): com.discord.serialization.SerializerUtils.SerializerError.Data {
            r.h(var1, "data");
            return new SerializerUtils.SerializerError.Data(var1);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is SerializerUtils.SerializerError.Data) {
               return false;
            } else {
               return r.c(this.data, (var1 as SerializerUtils.SerializerError.Data).data);
            }
         }

         public override fun hashCode(): Int {
            return this.data.hashCode();
         }

         public override fun toString(): String {
            val var2: java.util.Map = this.data;
            val var1: StringBuilder = new StringBuilder();
            var1.append("Data(data=");
            var1.append(var2);
            var1.append(")");
            return var1.toString();
         }
      }

      public data object EMPTY : SerializerUtils.SerializerError() {
         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else {
               return var1 is SerializerUtils.SerializerError.EMPTY;
            }
         }

         public override fun hashCode(): Int {
            return 939262969;
         }

         public override fun toString(): String {
            return "EMPTY";
         }
      }
   }
}
