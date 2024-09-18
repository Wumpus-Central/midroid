package com.discord.react.utilities

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.ReadableMapKeySetIterator
import com.facebook.react.bridge.ReadableType
import com.facebook.react.bridge.WritableNativeMap
import java.util.HashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q
import kotlin.jvm.internal.u
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.b
import org.json.JSONObject
import vk.j

public final val json: Json = b.b(null, <unrepresentable>.INSTANCE, 1, null)

public fun ReadableMap?.getBoolean(key: String, default: Boolean = false): Boolean {
   q.h(var1, "key");
   var var3: Boolean = var2;
   if (var0 != null) {
      var3 = var2;
      if (var0.hasKey(var1)) {
         var3 = var0.getBoolean(var1);
      }
   }

   return var3;
}

@JvmSynthetic
fun `getBoolean$default`(var0: ReadableMap, var1: java.lang.String, var2: Boolean, var3: Int, var4: Any): Boolean {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   return getBoolean(var0, var1, var2);
}

public fun ReadableMap?.getDouble(key: String, default: Double): Double {
   q.h(var1, "key");
   val var4: java.lang.Double = getNullableDouble(var0, var1, var2);
   q.e(var4);
   return var4;
}

public fun ReadableMap?.getInt(key: String, default: Int): Int {
   q.h(var1, "key");
   val var3: Int = getNullableInt(var0, var1, var2);
   q.e(var3);
   return var3;
}

public fun ReadableMap.getNonNullArray(key: String): ReadableArray {
   q.h(var0, "<this>");
   q.h(var1, "key");
   val var2: ReadableArray = var0.getArray(var1);
   q.e(var2);
   return var2;
}

public fun ReadableMap.getNonNullMap(key: String): ReadableMap {
   q.h(var0, "<this>");
   q.h(var1, "key");
   var0 = var0.getMap(var1);
   q.e(var0);
   return var0;
}

public fun ReadableMap.getNonNullString(key: String): String {
   q.h(var0, "<this>");
   q.h(var1, "key");
   val var2: java.lang.String = var0.getString(var1);
   q.e(var2);
   return var2;
}

public fun ReadableMap.getNonNullString(key: String, default: String): String {
   q.h(var0, "<this>");
   q.h(var1, "key");
   q.h(var2, "default");
   if (var0.hasKey(var1)) {
      var2 = getNonNullString(var0, var1);
   }

   return var2;
}

public fun ReadableMap?.getNullableDouble(key: String, default: Double? = null): Double? {
   q.h(var1, "key");
   var var3: java.lang.Double = var2;
   if (var0 != null) {
      var3 = var2;
      if (var0.hasKey(var1)) {
         var3 = var0.getDouble(var1);
      }
   }

   return var3;
}

@JvmSynthetic
fun `getNullableDouble$default`(var0: ReadableMap, var1: java.lang.String, var2: java.lang.Double, var3: Int, var4: Any): java.lang.Double {
   if ((var3 and 2) != 0) {
      var2 = null;
   }

   return getNullableDouble(var0, var1, var2);
}

public fun ReadableMap?.getNullableInt(key: String, default: Int? = null): Int? {
   q.h(var1, "key");
   var var3: Int = var2;
   if (var0 != null) {
      var3 = var2;
      if (var0.hasKey(var1)) {
         var3 = var0.getInt(var1);
      }
   }

   return var3;
}

@JvmSynthetic
fun `getNullableInt$default`(var0: ReadableMap, var1: java.lang.String, var2: Int, var3: Int, var4: Any): Int {
   if ((var3 and 2) != 0) {
      var2 = null;
   }

   return getNullableInt(var0, var1, var2);
}

public fun ReadableMap.getStringOrEmpty(name: String): String {
   q.h(var0, "<this>");
   q.h(var1, "name");
   return getNonNullString(var0, var1, "");
}

public fun nativeMapOf(vararg pairs: Pair<String, *>): WritableNativeMap {
   q.h(var0, "pairs");
   val var3: WritableNativeMap = new WritableNativeMap();
   val var2: Int = var0.length;

   for (int var1 = 0; var1 < var2; var1++) {
      put(var3, var0[var1].a() as java.lang.String, var0[var1].b());
   }

   return var3;
}

public fun <V> WritableNativeMap.put(key: String, value: V) {
   q.h(var0, "<this>");
   q.h(var1, "key");
   if (var2 is java.lang.String) {
      var0.putString(var1, var2 as java.lang.String);
   } else if (var2 is Int) {
      var0.putInt(var1, (var2 as java.lang.Number).intValue());
   } else if (var2 is java.lang.Double) {
      var0.putDouble(var1, (var2 as java.lang.Number).doubleValue());
   } else if (var2 is java.lang.Float) {
      var0.putDouble(var1, (double)(var2 as java.lang.Number).floatValue());
   } else if (var2 is java.lang.Boolean) {
      var0.putBoolean(var1, var2 as java.lang.Boolean);
   } else if (var2 is ReadableArray) {
      var0.putArray(var1, var2 as ReadableArray);
   } else if (var2 is ReadableMap) {
      var0.putMap(var1, var2 as ReadableMap);
   } else if (var2 is IntArray) {
      var0.putArray(var1, NativeArrayExtensionsKt.toNativeArray(var2 as IntArray));
   } else if (var2 is java.lang.Long) {
      var0.putDouble(var1, (double)(var2 as java.lang.Number).longValue());
   } else {
      if (var2 != null) {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }

      var0.putNull(var1);
   }
}

public fun ReadableMap.toJson(): JSONObject {
   q.h(var0, "<this>");
   val var1: JSONObject = new JSONObject();
   val var3: ReadableMapKeySetIterator = var0.keySetIterator();
   q.g(var3, "keySetIterator(...)");

   while (var3.hasNextKey()) {
      val var2: java.lang.String = var3.nextKey();
      switch (NativeMapExtensionsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType(var2).ordinal()]) {
         case 1:
            var1.put(var2, JSONObject.NULL);
            break;
         case 2:
            var1.put(var2, var0.getBoolean(var2));
            break;
         case 3:
            var1.put(var2, var0.getDouble(var2));
            break;
         case 4:
            var1.put(var2, var0.getString(var2));
            break;
         case 5:
            val var6: ReadableMap = var0.getMap(var2);
            q.e(var6);
            var1.put(var2, toJson(var6));
            break;
         case 6:
            val var5: ReadableArray = var0.getArray(var2);
            q.e(var5);
            var1.put(var2, NativeArrayExtensionsKt.toJson(var5));
         default:
      }
   }

   return var1;
}

public fun ReadableMap.toJsonString(): String {
   q.h(var0, "<this>");
   val var1: java.lang.String = toJson(var0).toString();
   q.g(var1, "toString(...)");
   return var1;
}

@JvmSynthetic
public inline fun <reified T> ReadableMap.toKotlinObject(): T {
   q.h(var0, "<this>");
   val var1: Json = getJson();
   val var2: java.lang.String = toJsonString(var0);
   val var3: bl.b = var1.a();
   q.m(6, "T");
   u.a("kotlinx.serialization.serializer.withModule");
   return (T)var1.b(j.c(var3, null), var2);
}

public fun <V> Map<String, V>.toNativeMap(): WritableNativeMap {
   q.h(var0, "<this>");
   val var1: WritableNativeMap = new WritableNativeMap();

   for (Entry var3 : var0.entrySet()) {
      put(var1, var3.getKey() as java.lang.String, var3.getValue());
   }

   return var1;
}

public fun ReadableMap.toStringMap(): Map<String, String> {
   q.h(var0, "<this>");
   val var1: HashMap = var0.toHashMap();
   q.f(var1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
   return var1;
}
// $VF: Class flags could not be determined
@JvmSynthetic
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var0: IntArray = new int[ReadableType.values().length];

      try {
         var0[ReadableType.Null.ordinal()] = 1;
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[ReadableType.Boolean.ordinal()] = 2;
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[ReadableType.Number.ordinal()] = 3;
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[ReadableType.String.ordinal()] = 4;
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[ReadableType.Map.ordinal()] = 5;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[ReadableType.Array.ordinal()] = 6;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}
