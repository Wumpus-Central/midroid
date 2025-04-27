package com.discord.chat.bridge.botuikit

import ga.d
import ga.g
import java.util.ArrayList
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object ComponentSerializer : d(E.b(Component.class)) {
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
         E.b(Component.class),
         new KClass[]{
            E.b(UnknownComponent.class),
            E.b(ActionRowComponent.class),
            E.b(ButtonComponent.class),
            E.b(StringSelectComponent.class),
            E.b(UserSelectComponent.class),
            E.b(RoleSelectComponent.class),
            E.b(MentionableSelectComponent.class),
            E.b(ChannelSelectComponent.class),
            E.b(SectionComponent.class),
            E.b(TextDisplayComponent.class),
            E.b(ThumbnailDisplayComponent.class),
            E.b(MediaGalleryDisplayComponent.class),
            E.b(FileDisplayComponent.class),
            E.b(SeparatorDisplayComponent.class),
            E.b(ContentInventoryEntryComponent.class),
            E.b(ContainerComponent.class)
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
      if (i.V(var2, var5)) {
         var6 = componentClassSerializer;
      } else {
         var6 = UnknownComponent.Companion.serializer();
      }

      return (DeserializationStrategy)var6;
   }
}
