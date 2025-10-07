package com.discord.chat.bridge.contentnode

import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import nb.g
import pb.e.i

@g(with = StaticChannelMentionType.Serializer::class)
public enum class StaticChannelMentionType(id: String) {
   Browse("browse"),
   Customize("customize"),
   Guide("guide"),
   Home("home"),
   LinkedRoles("linked-roles"),
   Unknown("")
   public final val id: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private StaticChannelMentionType[] $VALUES;
   @JvmStatic
   public StaticChannelMentionType.Companion Companion = new StaticChannelMentionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<StaticChannelMentionType> = $values();
      $VALUES = var0;
      $ENTRIES = H9.a.a(var0);
   }

   init {
      this.id = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   @SourceDebugExtension(["SMAP\nStaticChannelMentionContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticChannelMentionContentNode.kt\ncom/discord/chat/bridge/contentnode/StaticChannelMentionType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n1310#2,2:52\n*S KotlinDebug\n*F\n+ 1 StaticChannelMentionContentNode.kt\ncom/discord/chat/bridge/contentnode/StaticChannelMentionType$Companion\n*L\n37#1:52,2\n*E\n"])
   public companion object {
      public fun fromValue(id: String): StaticChannelMentionType {
         val var5: Array<StaticChannelMentionType> = StaticChannelMentionType.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         while (true) {
            if (var2 >= var3) {
               var6 = null;
               break;
            }

            val var4: StaticChannelMentionType = var5[var2];
            if (var5[var2].getId() == var1) {
               var6 = var4;
               break;
            }

            var2++;
         }

         var var7: StaticChannelMentionType = var6;
         if (var6 == null) {
            var7 = StaticChannelMentionType.Unknown;
         }

         return var7;
      }

      public fun serializer(): KSerializer<StaticChannelMentionType> {
         return StaticChannelMentionType.Serializer.INSTANCE;
      }
   }

   public object Serializer : KSerializer {
      public open val descriptor: SerialDescriptor
         public open get() {
            return pb.g.a("StaticChannelMentionType", i.a);
         }


      public open fun deserialize(decoder: Decoder): StaticChannelMentionType {
         return StaticChannelMentionType.Companion.fromValue(var1.z());
      }

      public open fun serialize(encoder: Encoder, value: StaticChannelMentionType) {
         var1.F(var2.getId());
      }
   }
}
