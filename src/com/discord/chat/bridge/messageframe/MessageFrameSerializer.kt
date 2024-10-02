package com.discord.chat.bridge.messageframe

import gl.d
import gl.g
import java.util.ArrayList
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object MessageFrameSerializer : d(g0.b(MessageFrame.class)) {
   private final val knownTypes: List<Int>
   private final val messageFrameClassSerializer: SealedClassSerializer<MessageFrame>

   @JvmStatic
   fun {
      val var2: Array<MessageFrameType> = MessageFrameType.values();
      val var3: ArrayList = new ArrayList(var2.length);
      val var1: Int = var2.length;

      for (int var0 = 0; var0 < var1; var0++) {
         var3.add(var2[var0].getSerialNumber());
      }

      knownTypes = var3;
      messageFrameClassSerializer = new SealedClassSerializer(
         "MessageFrame",
         g0.b(MessageFrame.class),
         new KClass[]{g0.b(UnknownMessageFrame.class), g0.b(MessageFrameJump.class), g0.b(MessageFrameMediaViewer.class)},
         new KSerializer[]{UnknownMessageFrame.Companion.serializer(), MessageFrameJump.Companion.serializer(), MessageFrameMediaViewer.Companion.serializer()}
      );
   }

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<MessageFrame> {
      var var2: java.util.List;
      label17: {
         q.h(var1, "element");
         var2 = knownTypes;
         var1 = g.o(var1).get("type") as JsonElement;
         if (var1 != null) {
            val var4: JsonPrimitive = g.p(var1);
            if (var4 != null) {
               var5 = g.l(var4);
               break label17;
            }
         }

         var5 = null;
      }

      val var6: Any;
      if (i.U(var2, var5)) {
         var6 = messageFrameClassSerializer;
      } else {
         var6 = UnknownMessageFrame.Companion.serializer();
      }

      return (DeserializationStrategy)var6;
   }
}
