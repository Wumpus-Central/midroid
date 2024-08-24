package com.discord.react.utilities

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.ReadableMapKeySetIterator
import com.facebook.react.bridge.ReadableType
import com.facebook.react.bridge.WritableNativeMap
import java.util.HashMap
import java.util.Map.Entry
import kotlin.jvm.internal.r
import kotlin.jvm.internal.v
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.l
import org.json.JSONObject
import uk.j
import zk.c

public final val json: Json = l.b(null, <unrepresentable>.INSTANCE, 1, null)

public fun ReadableMap?.getBoolean(key: String, default: Boolean = false): Boolean {
   r.h(var1, "key");
   var var3: Boolean = false;
   if (var0 != null) {
      var3 = false;
      if (var0.hasKey(var1)) {
         var3 = true;
      }
   }

   if (var3) {
      var2 = var0.getBoolean(var1);
   }

   return var2;
}

@JvmSynthetic
fun `getBoolean$default`(var0: ReadableMap, var1: java.lang.String, var2: Boolean, var3: Int, var4: Any): Boolean {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   return getBoolean(var0, var1, var2);
}

public fun ReadableMap?.getDouble(key: String, default: Double): Double {
   r.h(var1, "key");
   val var4: java.lang.Double = getNullableDouble(var0, var1, var2);
   r.e(var4);
   return var4;
}

public fun ReadableMap?.getInt(key: String, default: Int): Int {
   r.h(var1, "key");
   val var3: Int = getNullableInt(var0, var1, var2);
   r.e(var3);
   return var3;
}

public fun ReadableMap.getNonNullArray(key: String): ReadableArray {
   r.h(var0, "<this>");
   r.h(var1, "key");
   val var2: ReadableArray = var0.getArray(var1);
   r.e(var2);
   return var2;
}

public fun ReadableMap.getNonNullMap(key: String): ReadableMap {
   r.h(var0, "<this>");
   r.h(var1, "key");
   var0 = var0.getMap(var1);
   r.e(var0);
   return var0;
}

public fun ReadableMap.getNonNullString(key: String): String {
   r.h(var0, "<this>");
   r.h(var1, "key");
   val var2: java.lang.String = var0.getString(var1);
   r.e(var2);
   return var2;
}

public fun ReadableMap.getNonNullString(key: String, default: String): String {
   r.h(var0, "<this>");
   r.h(var1, "key");
   r.h(var2, "default");
   if (var0.hasKey(var1)) {
      var2 = getNonNullString(var0, var1);
   }

   return var2;
}

public fun ReadableMap?.getNullableDouble(key: String, default: Double? = null): Double? {
   r.h(var1, "key");
   var var3: Boolean = false;
   if (var0 != null) {
      var3 = false;
      if (var0.hasKey(var1)) {
         var3 = true;
      }
   }

   if (var3) {
      var2 = var0.getDouble(var1);
   }

   return var2;
}

@JvmSynthetic
fun `getNullableDouble$default`(var0: ReadableMap, var1: java.lang.String, var2: java.lang.Double, var3: Int, var4: Any): java.lang.Double {
   if ((var3 and 2) != 0) {
      var2 = null;
   }

   return getNullableDouble(var0, var1, var2);
}

public fun ReadableMap?.getNullableInt(key: String, default: Int? = null): Int? {
   r.h(var1, "key");
   var var3: Boolean = false;
   if (var0 != null) {
      var3 = false;
      if (var0.hasKey(var1)) {
         var3 = true;
      }
   }

   if (var3) {
      var2 = var0.getInt(var1);
   }

   return var2;
}

@JvmSynthetic
fun `getNullableInt$default`(var0: ReadableMap, var1: java.lang.String, var2: Int, var3: Int, var4: Any): Int {
   if ((var3 and 2) != 0) {
      var2 = null;
   }

   return getNullableInt(var0, var1, var2);
}

public fun ReadableMap.getStringOrEmpty(name: String): String {
   r.h(var0, "<this>");
   r.h(var1, "name");
   return getNonNullString(var0, var1, "");
}

public fun nativeMapOf(vararg pairs: Pair<String, *>): WritableNativeMap {
   r.h(var0, "pairs");
   val var3: WritableNativeMap = new WritableNativeMap();
   val var2: Int = var0.length;

   for (int var1 = 0; var1 < var2; var1++) {
      put(var3, var0[var1].a() as java.lang.String, var0[var1].b());
   }

   return var3;
}

public fun <V> WritableNativeMap.put(key: String, value: V) {
   r.h(var0, "<this>");
   r.h(var1, "key");
   if (var2 is java.lang.String) {
      var0.putString(var1, var2 as java.lang.String);
   } else if (var2 is Integer) {
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
   } else if (var2 is int[]) {
      var0.putArray(var1, NativeArrayExtensionsKt.toNativeArray(var2 as int[]));
   } else if (var2 is java.lang.Long) {
      var0.putDouble(var1, (double)(var2 as java.lang.Number).longValue());
   } else {
      val var3: Boolean;
      if (var2 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (!var3) {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }

      var0.putNull(var1);
   }
}

public fun ReadableMap.toJson(): JSONObject {
   r.h(var0, "<this>");
   val var2: JSONObject = new JSONObject();
   val var1: ReadableMapKeySetIterator = var0.keySetIterator();
   r.g(var1, "keySetIterator()");

   while (var1.hasNextKey()) {
      val var3: java.lang.String = var1.nextKey();
      switch (NativeMapExtensionsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType(var3).ordinal()]) {
         case 1:
            var2.put(var3, JSONObject.NULL);
            break;
         case 2:
            var2.put(var3, var0.getBoolean(var3));
            break;
         case 3:
            var2.put(var3, var0.getDouble(var3));
            break;
         case 4:
            var2.put(var3, var0.getString(var3));
            break;
         case 5:
            val var6: ReadableMap = var0.getMap(var3);
            r.e(var6);
            var2.put(var3, toJson(var6));
            break;
         case 6:
            val var5: ReadableArray = var0.getArray(var3);
            r.e(var5);
            var2.put(var3, NativeArrayExtensionsKt.toJson(var5));
         default:
      }
   }

   return var2;
}

public fun ReadableMap.toJsonString(): String {
   r.h(var0, "<this>");
   val var1: java.lang.String = toJson(var0).toString();
   r.g(var1, "toJson().toString()");
   return var1;
}

@JvmSynthetic
public inline fun <reified T> ReadableMap.toKotlinObject(): T {
   r.h(var0, "<this>");
   val var1: Json = getJson();
   val var3: java.lang.String = toJsonString(var0);
   val var2: c = var1.a();
   r.m(6, "T");
   v.a("kotlinx.serialization.serializer.withModule");
   return (T)var1.b(j.d(var2, null), var3);
}

public fun <V> Map<String, V>.toNativeMap(): WritableNativeMap {
   r.h(var0, "<this>");
   val var1: WritableNativeMap = new WritableNativeMap();

   for (Entry var3 : var0.entrySet()) {
      put(var1, var3.getKey() as java.lang.String, var3.getValue());
   }

   return var1;
}

public fun ReadableMap.toStringMap(): Map<String, String> {
   r.h(var0, "<this>");
   val var1: HashMap = var0.toHashMap();
   r.f(var1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
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
