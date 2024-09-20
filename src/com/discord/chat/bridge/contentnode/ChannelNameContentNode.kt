package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.ChannelType
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ChannelNameContentNode(channelType: ChannelType? = null, iconType: String, icon: String? = null, content: List<ContentNode>) : ContentNode {
   public final val channelType: ChannelType?
   public final val content: List<ContentNode>
   public final val icon: String?
   public final val iconType: String

   init {
      q.h(var2, "iconType");
      q.h(var4, "content");
      super(null);
      this.channelType = var1;
      this.iconType = var2;
      this.icon = var3;
      this.content = var4;
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
      q.h(var2, "iconType");
      q.h(var4, "content");
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
         } else if (!q.c(this.iconType, var1.iconType)) {
            return false;
         } else if (!q.c(this.icon, var1.icon)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
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
      val var5: ChannelType = this.channelType;
      val var3: java.lang.String = this.iconType;
      val var4: java.lang.String = this.icon;
      val var2: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ChannelNameContentNode(channelType=");
      var1.append(var5);
      var1.append(", iconType=");
      var1.append(var3);
      var1.append(", icon=");
      var1.append(var4);
      var1.append(", content=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{a.u(ChannelType.Serializer.INSTANCE), b2.a, a.u(b2.a), ChannelNameContentNode.access$get$childSerializers$cp()[3]};
      }

      public open fun deserialize(decoder: Decoder): ChannelNameContentNode {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var11: Array<KSerializer> = ChannelNameContentNode.access$get$childSerializers$cp();
         val var5: Boolean = var10.y();
         var var8: ChannelType = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var12: Any;
         if (var5) {
            var8 = var10.v(var9, 0, ChannelType.Serializer.INSTANCE, null) as ChannelType;
            var7 = var10.t(var9, 1);
            var6 = var10.v(var9, 2, b2.a, null) as java.lang.String;
            var12 = var10.m(var9, 3, var11[3], null) as java.util.List;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var10.m(var9, 3, var11[3], var12) as java.util.List;
                           var2 |= 8;
                        } else {
                           var6 = var10.v(var9, 2, b2.a, var6) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.v(var9, 0, ChannelType.Serializer.INSTANCE, var8) as ChannelType;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new ChannelNameContentNode(var2, var8, var7, var6, (java.util.List)var12, null);
      }

      public open fun serialize(encoder: Encoder, value: ChannelNameContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChannelNameContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelNameContentNode> {
         return ChannelNameContentNode.$serializer.INSTANCE;
      }
   }
}
