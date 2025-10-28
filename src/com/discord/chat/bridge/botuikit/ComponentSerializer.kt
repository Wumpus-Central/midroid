package com.discord.chat.bridge.botuikit

import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import rb.d
import rb.g

@SourceDebugExtension(["SMAP\nComponentSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentSerializer.kt\ncom/discord/chat/bridge/botuikit/ComponentSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n11165#2:135\n11500#2,3:136\n*S KotlinDebug\n*F\n+ 1 ComponentSerializer.kt\ncom/discord/chat/bridge/botuikit/ComponentSerializer\n*L\n21#1:135\n21#1:136,3\n*E\n"])
public object ComponentSerializer : d(Component::class) {
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
      var var2: java.util.List;
      label17: {
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
      if (CollectionsKt.X(var2, var5)) {
         var6 = componentClassSerializer;
      } else {
         var6 = UnknownComponent.Companion.serializer();
      }

      return (DeserializationStrategy)var6;
   }
}
