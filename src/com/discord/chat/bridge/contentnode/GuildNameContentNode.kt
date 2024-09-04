package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0

@f
public data class GuildNameContentNode(guildId: String? = null, content: String, icon: String? = null) : ContentNode {
   public final val content: String
   public final val guildId: String?
   public final val icon: String?

   init {
      r.h(var2, "content");
      super(null);
      this.guildId = var1;
      this.content = var2;
      this.icon = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: GuildNameContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.guildId);
      }

      label24: {
         var1.z(var2, 1, var0.content);
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (var0.icon == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.icon);
      }
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
      r.h(var2, "content");
      return new GuildNameContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else {
            return r.c(this.icon, var1.icon);
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
      val var3: java.lang.String = this.guildId;
      val var4: java.lang.String = this.content;
      val var1: java.lang.String = this.icon;
      val var2: StringBuilder = new StringBuilder();
      var2.append("GuildNameContentNode(guildId=");
      var2.append(var3);
      var2.append(", content=");
      var2.append(var4);
      var2.append(", icon=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<GuildNameContentNode> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), var1, a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): GuildNameContentNode {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var7: Any = null;
         var var2: Int;
         var var6: java.lang.String;
         var var11: Any;
         if (var5) {
            var11 = a2.a;
            var7 = var9.n(var8, 0, a2.a, null);
            var6 = var9.m(var8, 1);
            var11 = var9.n(var8, 2, (DeserializationStrategy)var11, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var9.n(var8, 2, a2.a, var11);
                        var2 |= 4;
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.n(var8, 0, a2.a, var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new GuildNameContentNode(var2, var7 as java.lang.String, var6, var11 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: GuildNameContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildNameContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildNameContentNode> {
         return GuildNameContentNode.$serializer.INSTANCE;
      }
   }
}
