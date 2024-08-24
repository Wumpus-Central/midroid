package com.discord.chat.bridge.botuikit

import java.util.ArrayList
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.d
import kotlinx.serialization.json.g

public object ComponentSerializer : d(h0.b(Component.class)) {
   private final val knownTypes: List<Int>
   private final val componentClassSerializer: SealedClassSerializer<Component>

   @JvmStatic
   fun {
      val var3: Array<ComponentType> = ComponentType.values();
      val var2: ArrayList = new ArrayList(var3.length);
      val var1: Int = var3.length;

      for (int var0 = 0; var0 < var1; var0++) {
         var2.add(var3[var0].getSerialNumber());
      }

      knownTypes = var2;
      componentClassSerializer = new SealedClassSerializer(
         "Component",
         h0.b(Component.class),
         new KClass[]{
            h0.b(UnknownComponent.class),
            h0.b(ActionRowComponent.class),
            h0.b(ButtonComponent.class),
            h0.b(StringSelectComponent.class),
            h0.b(UserSelectComponent.class),
            h0.b(RoleSelectComponent.class),
            h0.b(MentionableSelectComponent.class),
            h0.b(ChannelSelectComponent.class),
            h0.b(TextDisplayComponent.class),
            h0.b(MediaGalleryDisplayComponent.class),
            h0.b(SeparatorDisplayComponent.class),
            h0.b(ContentInventoryEntryComponent.class)
         },
         new KSerializer[]{
            UnknownComponent.Companion.serializer(),
            ActionRowComponent.Companion.serializer(),
            ButtonComponent.Companion.serializer(),
            StringSelectComponent.Companion.serializer(),
            UserSelectComponent.Companion.serializer(),
            RoleSelectComponent.Companion.serializer(),
            MentionableSelectComponent.Companion.serializer(),
            ChannelSelectComponent.Companion.serializer(),
            TextDisplayComponent.Companion.serializer(),
            MediaGalleryDisplayComponent.Companion.serializer(),
            SeparatorDisplayComponent.Companion.serializer(),
            ContentInventoryEntryComponent.Companion.serializer()
         }
      );
   }

   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<Component> {
      var var2: java.util.List;
      label17: {
         r.h(var1, "element");
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
      if (h.P(var2, var5)) {
         var6 = componentClassSerializer;
      } else {
         var6 = UnknownComponent.Companion.serializer();
      }

      return (DeserializationStrategy<Component>)var6;
   }
}
