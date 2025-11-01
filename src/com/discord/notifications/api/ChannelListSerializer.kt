package com.discord.notifications.api

import com.discord.primitives.ChannelId
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import yu.a

@SourceDebugExtension(["SMAP\nNotificationDataDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDataDeserializer.kt\ncom/discord/notifications/api/ChannelListSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1611#2,9:62\n1863#2:71\n1864#2:74\n1620#2:75\n1#3:72\n1#3:73\n*S KotlinDebug\n*F\n+ 1 NotificationDataDeserializer.kt\ncom/discord/notifications/api/ChannelListSerializer\n*L\n16#1:62,9\n16#1:71\n16#1:74\n16#1:75\n16#1:73\n*E\n"])
public object ChannelListSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.h(ChannelId.Companion.serializer()).getDescriptor();
      }


   private fun deserializeForCalls(channelIds: String): String {
      var var2: java.lang.String = var1;
      if (StringsKt.N(var1, "[", false, 2, null)) {
         var2 = var1;
         if (StringsKt.y(var1, "]", false, 2, null)) {
            var2 = StringsKt.B0(StringsKt.z0(var1, "["), "]");
         }
      }

      return var2;
   }

   public open fun deserialize(decoder: Decoder): List<ChannelId> {
      val var6: java.lang.Iterable = StringsKt.split$default(this.deserializeForCalls(var1.z()), new java.lang.String[]{","}, false, 0, 6, null);
      val var4: ArrayList = new ArrayList();

      for (java.lang.String var3 : var6) {
         var var7: java.lang.String = var3;
         if (StringsKt.N(var3, "\"", false, 2, null)) {
            var7 = var3;
            if (StringsKt.y(var3, "\"", false, 2, null)) {
               var7 = StringsKt.z0(StringsKt.B0(var3, "\""), "\"");
            }
         }

         val var9: java.lang.Long = StringsKt.s(var7);
         var var8: ChannelId = null;
         if (var9 != null) {
            var8 = ChannelId.box-impl(ChannelId.constructor-impl(var9.longValue()));
         }

         if (var8 != null) {
            var4.add(var8);
         }
      }

      return var4;
   }

   public open fun serialize(encoder: Encoder, value: List<ChannelId>) {
      throw new UnsupportedOperationException();
   }
}
