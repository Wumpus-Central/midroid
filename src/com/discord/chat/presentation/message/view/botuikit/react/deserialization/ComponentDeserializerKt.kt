package com.discord.chat.presentation.message.view.botuikit.react.deserialization

import C1.a
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ComponentSerializer
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.json.b
import org.json.JSONObject

public final val json: Json = b.b(null, new a(), 1, null)

@JvmSynthetic
fun a(var0: JsonBuilder): Unit {
   return json$lambda$0(var0);
}

@JvmSynthetic
internal inline fun <reified T : Component> deserializeComponentModel(model: ReadableMap): T {
   r.h(var0, "model");

   var var12: Component;
   try {
      val var16: Json = getJson();
      val var11: ComponentSerializer = ComponentSerializer.INSTANCE;
      val var7: java.lang.String = new JSONObject(var0.toHashMap()).toString();
      r.g(var7, "toString(...)");
      var12 = var16.b(var11, var7) as Component;
      r.m(3, "T");
   } catch (var5: Exception) {
      r.m(4, "T");
      val var6: java.lang.String = H.b(Component.class).b();
      val var1: java.lang.String = var5.getMessage();
      val var2: StringBuilder = new StringBuilder();
      var2.append("Error while deserializing ");
      var2.append(var6);
      var2.append(": ");
      var2.append(var1);
      throw new IllegalStateException(var2.toString().toString());
   }

   if (var12 != null) {
      return (T)var12;
   } else {
      try {
         r.m(4, "T");
         val var9: java.lang.String = H.b(Component.class).b();
         val var18: java.lang.String = H.b(var12.getClass()).b();
         val var14: StringBuilder = new StringBuilder();
         var14.append("Expected ");
         var14.append(var9);
         var14.append(" but got ");
         var14.append(var18);
         throw new IllegalStateException(var14.toString().toString());
      } catch (var4: Exception) {
         r.m(4, "T");
         val var8: java.lang.String = H.b(Component.class).b();
         val var13: java.lang.String = var4.getMessage();
         val var17: StringBuilder = new StringBuilder();
         var17.append("Error while deserializing ");
         var17.append(var8);
         var17.append(": ");
         var17.append(var13);
         throw new IllegalStateException(var17.toString().toString());
      }
   }
}

fun `json$lambda$0`(var0: JsonBuilder): Unit {
   r.h(var0, "$this$Json");
   var0.c(true);
   return Unit.a;
}
