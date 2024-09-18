package com.discord.chat.bridge.contentnode

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class GuildNameContentNode(guildId: String? = null, content: String, icon: String? = null) : ContentNode {
   public final val content: String
   public final val guildId: String?
   public final val icon: String?

   init {
      q.h(var2, "content");
      super(null);
      this.guildId = var1;
      this.content = var2;
      this.icon = var3;
   }

   public operator fun component1(): String? {
      return this.guildId;
   }

   public operator fun component2(): String {
      return this.content;
   }

   public operator fun component3(): String? {
      return this.icon;
   }

   public fun copy(guildId: String? = var0.guildId, content: String = var0.content, icon: String? = var0.icon): GuildNameContentNode {
      q.h(var2, "content");
      return new GuildNameContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else {
            return q.c(this.icon, var1.icon);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var3: Int = this.content.hashCode();
      if (this.icon != null) {
         var2 = this.icon.hashCode();
      }

      return (var1 * 31 + var3) * 31 + var2;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.guildId;
      val var2: java.lang.String = this.content;
      val var1: java.lang.String = this.icon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("GuildNameContentNode(guildId=");
      var3.append(var4);
      var3.append(", content=");
      var3.append(var2);
      var3.append(", icon=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildNameContentNode.$serializer = new GuildNameContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("guild", var0, 3);
         var1.l("guildId", true);
         var1.l("content", false);
         var1.l("icon", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), var1, a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): GuildNameContentNode {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var7: java.lang.String = null;
         var var2: Int;
         val var8: java.lang.String;
         val var11: java.lang.String;
         if (var5) {
            val var6: b2 = b2.a;
            var7 = var10.v(var9, 0, b2.a, null) as java.lang.String;
            var11 = var10.t(var9, 1);
            var8 = var10.v(var9, 2, var6, null) as java.lang.String;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var13: java.lang.String = null;
            var var12: java.lang.String = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.v(var9, 2, b2.a, var12) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var13 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.v(var9, 0, b2.a, var7) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var12;
            var11 = var13;
         }

         var10.b(var9);
         return new GuildNameContentNode(var2, var7, var11, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: GuildNameContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         GuildNameContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildNameContentNode> {
         return GuildNameContentNode.$serializer.INSTANCE;
      }
   }
}
