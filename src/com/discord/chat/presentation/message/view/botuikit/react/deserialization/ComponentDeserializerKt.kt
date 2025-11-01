package com.discord.chat.presentation.message.view.botuikit.react.deserialization

import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ComponentSerializer
import com.facebook.react.bridge.ReadableMap
import g8.a
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
      val var16: Json = getJson();
      val var11: ComponentSerializer = ComponentSerializer.INSTANCE;
      val var7: java.lang.String = new JSONObject(var0.toHashMap()).toString();
      var12 = var16.b(var11, var7) as Component;
      Intrinsics.reifiedOperationMarker(3, "T");
   } catch (var5: Exception) {
      Intrinsics.reifiedOperationMarker(4, "T");
      val var6: java.lang.String = (Component::class).getSimpleName();
      val var2: java.lang.String = var5.getMessage();
      val var1: StringBuilder = new StringBuilder();
      var1.append("Error while deserializing ");
      var1.append(var6);
      var1.append(": ");
      var1.append(var2);
      throw new IllegalStateException(var1.toString().toString());
   }

   if (var12 != null) {
      return (T)var12;
   } else {
      try {
         Intrinsics.reifiedOperationMarker(4, "T");
         val var9: java.lang.String = (Component::class).getSimpleName();
         val var18: java.lang.String = (var12.getClass()::class).getSimpleName();
         val var14: StringBuilder = new StringBuilder();
         var14.append("Expected ");
         var14.append(var9);
         var14.append(" but got ");
         var14.append(var18);
         throw new IllegalStateException(var14.toString().toString());
      } catch (var4: Exception) {
         Intrinsics.reifiedOperationMarker(4, "T");
         val var8: java.lang.String = (Component::class).getSimpleName();
         val var17: java.lang.String = var4.getMessage();
         val var13: StringBuilder = new StringBuilder();
         var13.append("Error while deserializing ");
         var13.append(var8);
         var13.append(": ");
         var13.append(var17);
         throw new IllegalStateException(var13.toString().toString());
      }
   }
}

fun `json$lambda$0`(var0: JsonBuilder): Unit {
   var0.c(true);
   return Unit.a;
}
