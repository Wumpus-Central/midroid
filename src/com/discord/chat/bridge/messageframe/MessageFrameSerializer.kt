package com.discord.chat.bridge.messageframe

import java.util.ArrayList
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import wb.d
import wb.g

public object MessageFrameSerializer : d(G.b(MessageFrame.class)) {
   private final val knownTypes: List<Int>
   private final val messageFrameClassSerializer: SealedClassSerializer<MessageFrame>

   @JvmStatic
   fun {
      val var3: Array<MessageFrameType> = MessageFrameType.values();
      val var2: ArrayList = new ArrayList(var3.length);
      val var1: Int = var3.length;

      for (int var0 = 0; var0 < var1; var0++) {
         var2.add(var3[var0].getSerialNumber());
      }

      knownTypes = var2;
      messageFrameClassSerializer = new SealedClassSerializer(
         "MessageFrame",
         G.b(MessageFrame.class),
         new KClass[]{G.b(UnknownMessageFrame.class), G.b(MessageFrameJump.class), G.b(MessageFrameMediaViewer.class)},
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
      if (i.X(var2, var5)) {
         var6 = messageFrameClassSerializer;
      } else {
         var6 = UnknownMessageFrame.Companion.serializer();
      }

      return (DeserializationStrategy)var6;
   }
}
