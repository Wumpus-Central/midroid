package com.discord.chat.presentation.message.view.botuikit.react.deserialization

import B2.a
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ComponentSerializer
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.Intrinsics
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
   var var12: Component;
   try {
      val var11: Json = getJson();
      val var16: ComponentSerializer = ComponentSerializer.INSTANCE;
      val var7: java.lang.String = new JSONObject(var0.toHashMap()).toString();
      var12 = var11.b(var16, var7) as Component;
      Intrinsics.reifiedOperationMarker(3, "T");
   } catch (var5: Exception) {
      Intrinsics.reifiedOperationMarker(4, "T");
      val var6: java.lang.String = (Component::class).getSimpleName();
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
         Intrinsics.reifiedOperationMarker(4, "T");
         val var9: java.lang.String = (Component::class).getSimpleName();
         val var14: java.lang.String = (var12.getClass()::class).getSimpleName();
         val var18: StringBuilder = new StringBuilder();
         var18.append("Expected ");
         var18.append(var9);
         var18.append(" but got ");
         var18.append(var14);
         throw new IllegalStateException(var18.toString().toString());
      } catch (var4: Exception) {
         Intrinsics.reifiedOperationMarker(4, "T");
         val var8: java.lang.String = (Component::class).getSimpleName();
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
   var0.c(true);
   return Unit.a;
}
