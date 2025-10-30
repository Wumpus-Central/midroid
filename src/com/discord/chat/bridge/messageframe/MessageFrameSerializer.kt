package com.discord.chat.bridge.messageframe

import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import xp.e
import xp.h

@SourceDebugExtension(["SMAP\nMessageFrameSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageFrameSerializer.kt\ncom/discord/chat/bridge/messageframe/MessageFrameSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,41:1\n11165#2:42\n11500#2,3:43\n*S KotlinDebug\n*F\n+ 1 MessageFrameSerializer.kt\ncom/discord/chat/bridge/messageframe/MessageFrameSerializer\n*L\n13#1:42\n13#1:43,3\n*E\n"])
public object MessageFrameSerializer : e(MessageFrame::class) {
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
         MessageFrame::class,
         new KClass[]{UnknownMessageFrame::class, MessageFrameJump::class, MessageFrameMediaViewer::class},
         new KSerializer[]{UnknownMessageFrame.Companion.serializer(), MessageFrameJump.Companion.serializer(), MessageFrameMediaViewer.Companion.serializer()}
      );
   }

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<MessageFrame> {
      val var2: java.util.List = knownTypes;
      var1 = h.n(var1).get("type") as JsonElement;
      if (var1 != null) {
         val var4: JsonPrimitive = h.o(var1);
         if (var4 != null) {
            return (DeserializationStrategy)(if (CollectionsKt.Z(var2, h.k(var4))) messageFrameClassSerializer else UnknownMessageFrame.Companion.serializer());
         }
      }

      return (DeserializationStrategy)(if (CollectionsKt.Z(var2, null)) messageFrameClassSerializer else UnknownMessageFrame.Companion.serializer());
   }
}
