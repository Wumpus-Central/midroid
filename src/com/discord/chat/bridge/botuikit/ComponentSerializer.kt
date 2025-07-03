package com.discord.chat.bridge.botuikit

import java.util.ArrayList
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import wb.d
import wb.g

public object ComponentSerializer : d(H.b(Component.class)) {
   private final val knownTypes: List<Int>
   private final val componentClassSerializer: SealedClassSerializer<Component>

   @JvmStatic
   fun {
      val var2: Array<ComponentType> = ComponentType.values();
      val var3: ArrayList = new ArrayList(var2.length);
      val var1: Int = var2.length;

      for (int var0 = 0; var0 < var1; var0++) {
         var3.add(var2[var0].getSerialNumber());
      }

      knownTypes = var3;
      componentClassSerializer = new SealedClassSerializer(
         "Component",
         H.b(Component.class),
         new KClass[]{
            H.b(UnknownComponent.class),
            H.b(ActionRowComponent.class),
            H.b(ButtonComponent.class),
            H.b(StringSelectComponent.class),
            H.b(UserSelectComponent.class),
            H.b(RoleSelectComponent.class),
            H.b(MentionableSelectComponent.class),
            H.b(ChannelSelectComponent.class),
            H.b(SectionComponent.class),
            H.b(TextDisplayComponent.class),
            H.b(ThumbnailDisplayComponent.class),
            H.b(MediaGalleryDisplayComponent.class),
            H.b(FileDisplayComponent.class),
            H.b(SeparatorDisplayComponent.class),
            H.b(ContentInventoryEntryComponent.class),
            H.b(ContainerComponent.class)
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
            SectionComponent.Companion.serializer(),
            TextDisplayComponent.Companion.serializer(),
            ThumbnailDisplayComponent.Companion.serializer(),
            MediaGalleryDisplayComponent.Companion.serializer(),
            FileDisplayComponent.Companion.serializer(),
            SeparatorDisplayComponent.Companion.serializer(),
            ContentInventoryEntryComponent.Companion.serializer(),
            ContainerComponent.Companion.serializer()
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
      if (i.X(var2, var5)) {
         var6 = componentClassSerializer;
      } else {
         var6 = UnknownComponent.Companion.serializer();
      }

      return (DeserializationStrategy)var6;
   }
}
