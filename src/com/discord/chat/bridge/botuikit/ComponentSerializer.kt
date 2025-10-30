package com.discord.chat.bridge.botuikit

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

@SourceDebugExtension(["SMAP\nComponentSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentSerializer.kt\ncom/discord/chat/bridge/botuikit/ComponentSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n11165#2:135\n11500#2,3:136\n*S KotlinDebug\n*F\n+ 1 ComponentSerializer.kt\ncom/discord/chat/bridge/botuikit/ComponentSerializer\n*L\n21#1:135\n21#1:136,3\n*E\n"])
public object ComponentSerializer : e(Component::class) {
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
         Component::class,
         new KClass[]{
            UnknownComponent::class,
            ActionRowComponent::class,
            ButtonComponent::class,
            StringSelectComponent::class,
            UserSelectComponent::class,
            RoleSelectComponent::class,
            MentionableSelectComponent::class,
            ChannelSelectComponent::class,
            SectionComponent::class,
            TextDisplayComponent::class,
            ThumbnailDisplayComponent::class,
            MediaGalleryDisplayComponent::class,
            FileDisplayComponent::class,
            SeparatorDisplayComponent::class,
            ContentInventoryEntryComponent::class,
            ContainerComponent::class
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
      val var2: java.util.List = knownTypes;
      var1 = h.n(var1).get("type") as JsonElement;
      if (var1 != null) {
         val var4: JsonPrimitive = h.o(var1);
         if (var4 != null) {
            return (DeserializationStrategy)(if (CollectionsKt.Z(var2, h.k(var4))) componentClassSerializer else UnknownComponent.Companion.serializer());
         }
      }

      return (DeserializationStrategy)(if (CollectionsKt.Z(var2, null)) componentClassSerializer else UnknownComponent.Companion.serializer());
   }
}
