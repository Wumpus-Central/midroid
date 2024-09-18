package com.discord.chat.bridge.contentnode

import cl.f
import el.g
import el.e.i
import kh.l
import kh.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import rh.a

@f(with = StaticChannelMentionType.Serializer::class)
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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public StaticChannelMentionType.Companion Companion = new StaticChannelMentionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<StaticChannelMentionType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.id = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun fromValue(id: String): StaticChannelMentionType {
         q.h(var1, "id");
         val var5: Array<StaticChannelMentionType> = StaticChannelMentionType.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         while (true) {
            if (var2 >= var3) {
               var6 = null;
               break;
            }

            val var4: StaticChannelMentionType = var5[var2];
            if (q.c(var5[var2].getId(), var1)) {
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : KSerializer {
      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("StaticChannelMentionType", i.a);
         }


      public open fun deserialize(decoder: Decoder): StaticChannelMentionType {
         q.h(var1, "decoder");
         return StaticChannelMentionType.Companion.fromValue(var1.n());
      }

      public open fun serialize(encoder: Encoder, value: StaticChannelMentionType) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         var1.F(var2.getId());
      }
   }
}
