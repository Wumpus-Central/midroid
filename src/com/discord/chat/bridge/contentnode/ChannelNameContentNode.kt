package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.ChannelType
import kotlin.jvm.internal.r
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
public data class ChannelNameContentNode(channelType: ChannelType? = null, iconType: String, icon: String? = null, content: List<ContentNode>) : ContentNode {
   public final val channelType: ChannelType?
   public final val content: List<ContentNode>
   public final val icon: String?
   public final val iconType: String

   init {
      r.h(var2, "iconType");
      r.h(var4, "content");
      super(null);
      this.channelType = var1;
      this.iconType = var2;
      this.icon = var3;
      this.content = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: ChannelNameContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.channelType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, ChannelType.Serializer.INSTANCE, var0.channelType);
      }

      label24: {
         var1.z(var2, 1, var0.iconType);
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

      var1.y(var2, 3, new xk.f(ContentNodeSerializer.INSTANCE), var0.content);
   }

   public operator fun component1(): ChannelType? {
      return this.channelType;
   }

   public operator fun component2(): String {
      return this.iconType;
   }

   public operator fun component3(): String? {
      return this.icon;
   }

   public operator fun component4(): List<ContentNode> {
      return this.content;
   }

   public fun copy(
      channelType: ChannelType? = var0.channelType,
      iconType: String = var0.iconType,
      icon: String? = var0.icon,
      content: List<ContentNode> = var0.content
   ): ChannelNameContentNode {
      r.h(var2, "iconType");
      r.h(var4, "content");
      return new ChannelNameContentNode(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.channelType != var1.channelType) {
            return false;
         } else if (!r.c(this.iconType, var1.iconType)) {
            return false;
         } else if (!r.c(this.icon, var1.icon)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.channelType == null) {
         var1 = 0;
      } else {
         var1 = this.channelType.hashCode();
      }

      val var3: Int = this.iconType.hashCode();
      if (this.icon != null) {
         var2 = this.icon.hashCode();
      }

      return ((var1 * 31 + var3) * 31 + var2) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var2: ChannelType = this.channelType;
      val var4: java.lang.String = this.iconType;
      val var3: java.lang.String = this.icon;
      val var1: java.util.List = this.content;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ChannelNameContentNode(channelType=");
      var5.append(var2);
      var5.append(", iconType=");
      var5.append(var4);
      var5.append(", icon=");
      var5.append(var3);
      var5.append(", content=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<ChannelNameContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChannelNameContentNode.$serializer = new ChannelNameContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("channel", var0, 4);
         var1.l("channelType", true);
         var1.l("iconType", false);
         var1.l("icon", true);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(ChannelType.Serializer.INSTANCE), a2.a, a.u(a2.a), new xk.f(ContentNodeSerializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ChannelNameContentNode {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var8: Any = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: Any;
         var var11: Any;
         if (var5) {
            var8 = var10.n(var9, 0, ChannelType.Serializer.INSTANCE, null);
            var6 = var10.m(var9, 1);
            var7 = var10.n(var9, 2, a2.a, null);
            var11 = var10.y(var9, 3, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var7 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var11 = var10.y(var9, 3, new xk.f(ContentNodeSerializer.INSTANCE), var11);
                           var2 |= 8;
                        } else {
                           var7 = var10.n(var9, 2, a2.a, var7);
                           var2 |= 4;
                        }
                     } else {
                        var6 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.n(var9, 0, ChannelType.Serializer.INSTANCE, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new ChannelNameContentNode(var2, var8 as ChannelType, var6, var7 as java.lang.String, var11 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: ChannelNameContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChannelNameContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelNameContentNode> {
         return ChannelNameContentNode.$serializer.INSTANCE;
      }
   }
}
