package com.discord.chat.bridge.botuikit

import java.util.ArrayList
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import qb.d
import qb.g

public object ComponentSerializer : d(G.b(Component.class)) {
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
         G.b(Component.class),
         new KClass[]{
            G.b(UnknownComponent.class),
            G.b(ActionRowComponent.class),
            G.b(ButtonComponent.class),
            G.b(StringSelectComponent.class),
            G.b(UserSelectComponent.class),
            G.b(RoleSelectComponent.class),
            G.b(MentionableSelectComponent.class),
            G.b(ChannelSelectComponent.class),
            G.b(SectionComponent.class),
            G.b(TextDisplayComponent.class),
            G.b(ThumbnailDisplayComponent.class),
            G.b(MediaGalleryDisplayComponent.class),
            G.b(FileDisplayComponent.class),
            G.b(SeparatorDisplayComponent.class),
            G.b(ContentInventoryEntryComponent.class),
            G.b(ContainerComponent.class)
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
