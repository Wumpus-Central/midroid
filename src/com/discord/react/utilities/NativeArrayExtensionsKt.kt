package com.discord.react.utilities

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.ReadableType
import com.facebook.react.bridge.WritableNativeArray
import fh.p
import java.util.ArrayList
import kotlin.jvm.internal.r
import org.json.JSONArray

public inline fun ReadableArray.forEach(action: (Int) -> Unit) {
   r.h(var0, "<this>");
   r.h(var1, "action");
   val var2: java.util.Iterator = sizeRange(var0).iterator();

   while (var2.hasNext()) {
      var1.invoke(var2.next());
   }
}

public inline fun ReadableArray.forEach(action: (Int, ReadableArray) -> Unit) {
   r.h(var0, "<this>");
   r.h(var1, "action");
   val var2: java.util.Iterator = sizeRange(var0).iterator();

   while (var2.hasNext()) {
      var1.invoke((var2 as p).nextInt(), var0);
   }
}

public inline fun <T> ReadableArray.map(transform: (Int) -> Any): List<Any> {
   r.h(var0, "<this>");
   r.h(var1, "transform");
   val var2: IntRange = sizeRange(var0);
   val var3: ArrayList = new ArrayList(h.t(var2, 10));
   val var4: java.util.Iterator = var2.iterator();

   while (var4.hasNext()) {
      var3.add(var1.invoke(var4.next()));
   }

   return var3;
}

public inline fun <T> ReadableArray.map(transform: (Int, ReadableArray) -> Any): List<Any> {
   r.h(var0, "<this>");
   r.h(var1, "transform");
   val var3: IntRange = sizeRange(var0);
   val var2: ArrayList = new ArrayList(h.t(var3, 10));
   val var4: java.util.Iterator = var3.iterator();

   while (var4.hasNext()) {
      var2.add(var1.invoke((var4 as p).nextInt(), var0));
   }

   return var2;
}

public inline fun <T, C : MutableCollection<in Any>> ReadableArray.mapTo(destination: Any, transform: (Int) -> Any): Any {
   r.h(var0, "<this>");
   r.h(var1, "destination");
   r.h(var2, "transform");
   val var3: java.util.Iterator = sizeRange(var0).iterator();

   while (var3.hasNext()) {
      var1.add(var2.invoke(var3.next()));
   }

   return (C)var1;
}

public inline fun <T, C : MutableCollection<in Any>> ReadableArray.mapTo(destination: Any, transform: (Int, ReadableArray) -> Any): Any {
   r.h(var0, "<this>");
   r.h(var1, "destination");
   r.h(var2, "transform");
   val var3: java.util.Iterator = sizeRange(var0).iterator();

   while (var3.hasNext()) {
      var1.add(var2.invoke((var3 as p).nextInt(), var0));
   }

   return (C)var1;
}

public fun nativeArrayOf(vararg elements: Any?): ReadableNativeArray {
   r.h(var0, "elements");
   val var3: WritableNativeArray = new WritableNativeArray();
   val var2: Int = var0.length;

   for (int var1 = 0; var1 < var2; var1++) {
      push(var3, var0[var1]);
   }

   return var3;
}

public fun <V> WritableNativeArray.push(value: Any) {
   r.h(var0, "<this>");
   if (var1 is java.lang.String) {
      var0.pushString(var1 as java.lang.String);
   } else if (var1 is Int) {
      var0.pushInt((var1 as java.lang.Number).intValue());
   } else if (var1 is java.lang.Double) {
      var0.pushDouble((var1 as java.lang.Number).doubleValue());
   } else if (var1 is java.lang.Boolean) {
      var0.pushBoolean(var1 as java.lang.Boolean);
   } else if (var1 is ReadableArray) {
      var0.pushArray(var1 as ReadableArray);
   } else if (var1 is ReadableMap) {
      var0.pushMap(var1 as ReadableMap);
   } else if (var1 is java.lang.Long) {
      var0.pushDouble((double)(var1 as java.lang.Number).longValue());
   } else {
      val var2: Boolean;
      if (var1 == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (!var2) {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }

      var0.pushNull();
   }
}

public fun ReadableArray.sizeRange(): IntRange {
   r.h(var0, "<this>");
   return vh.h.r(0, var0.size());
}

public fun ReadableArray.toBooleanList(): List<Boolean> {
   r.h(var0, "<this>");
   val var2: IntRange = sizeRange(var0);
   val var1: ArrayList = new ArrayList(h.t(var2, 10));
   val var3: java.util.Iterator = var2.iterator();

   while (var3.hasNext()) {
      var1.add(var0.getBoolean((var3 as p).nextInt()));
   }

   return var1;
}

public fun ReadableArray.toDoubleList(): List<Double> {
   r.h(var0, "<this>");
   val var2: IntRange = sizeRange(var0);
   val var1: ArrayList = new ArrayList(h.t(var2, 10));
   val var3: java.util.Iterator = var2.iterator();

   while (var3.hasNext()) {
      var1.add(var0.getDouble((var3 as p).nextInt()));
   }

   return var1;
}

public fun ReadableArray.toIntList(): List<Int> {
   r.h(var0, "<this>");
   val var2: IntRange = sizeRange(var0);
   val var1: ArrayList = new ArrayList(h.t(var2, 10));
   val var3: java.util.Iterator = var2.iterator();

   while (var3.hasNext()) {
      var1.add(var0.getInt((var3 as p).nextInt()));
   }

   return var1;
}

public fun ReadableArray.toJson(): JSONArray {
   r.h(var0, "<this>");
   val var4: JSONArray = new JSONArray();
   val var2: Int = var0.size();

   for (int var1 = 0; var1 < var2; var1++) {
      val var3: Int = NativeArrayExtensionsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType(var1).ordinal()];
      if (var3 != 2) {
         if (var3 != 3) {
            if (var3 != 4) {
               if (var3 != 5) {
                  if (var3 == 6) {
                     val var6: ReadableArray = var0.getArray(var1);
                     r.g(var6, "getArray(i)");
                     var4.put(toJson(var6));
                  }
               } else {
                  val var7: ReadableMap = var0.getMap(var1);
                  r.g(var7, "getMap(i)");
                  var4.put(NativeMapExtensionsKt.toJson(var7));
               }
            } else {
               var4.put(var0.getString(var1));
            }
         } else {
            var4.put(var0.getDouble(var1));
         }
      } else {
         var4.put(var0.getBoolean(var1));
      }
   }

   return var4;
}

public fun ReadableArray.toJsonString(): String {
   r.h(var0, "<this>");
   val var1: java.lang.String = toJson(var0).toString();
   r.g(var1, "toJson().toString()");
   return var1;
}

public fun <T> Collection<Any>.toNativeArray(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var1: WritableNativeArray = new WritableNativeArray();
   val var2: java.util.Iterator = var0.iterator();

   while (var2.hasNext()) {
      push(var1, var2.next());
   }

   return var1;
}

public fun IntArray.toNativeArray(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var3: WritableNativeArray = new WritableNativeArray();
   val var2: Int = var0.length;

   for (int var1 = 0; var1 < var2; var1++) {
      push(var3, var0[var1]);
   }

   return var3;
}

public fun <T> Array<Any>.toNativeArray(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var3: WritableNativeArray = new WritableNativeArray();
   val var2: Int = var0.length;

   for (int var1 = 0; var1 < var2; var1++) {
      push(var3, var0[var1]);
   }

   return var3;
}

public fun <V> Collection<Map<String, Any>>.toNativeArrayOfMaps(): ReadableNativeArray {
   r.h(var0, "<this>");
   val var1: ArrayList = new ArrayList(h.t(var0, 10));
   val var2: java.util.Iterator = var0.iterator();

   while (var2.hasNext()) {
      var1.add(NativeMapExtensionsKt.toNativeMap(var2.next() as java.util.Map));
   }

   return toNativeArray(var1);
}

public fun ReadableArray.toStringList(): List<String> {
   r.h(var0, "<this>");
   val var2: IntRange = sizeRange(var0);
   val var1: ArrayList = new ArrayList(h.t(var2, 10));
   val var3: java.util.Iterator = var2.iterator();

   while (var3.hasNext()) {
      var1.add(var0.getString((var3 as p).nextInt()));
   }

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
