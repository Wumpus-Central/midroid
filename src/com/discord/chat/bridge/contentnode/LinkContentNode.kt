package com.discord.chat.bridge.contentnode

import ca.f
import ca.n
import da.a
import fa.C0
import fa.G
import fa.N
import fa.h
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class LinkContentNode(content: List<ContentNode>, target: LinkContextData?) : ContentNode {
   public final val content: List<ContentNode>
   public final val isUrl: Boolean
   public final val linkColor: Int?
   public final val target: LinkContextData?
   public final val textContent: String?
   public final val url: String?

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
      this.target = var2;
      val var4: Int;
      if (var2 is LinkContextData.BindUserMenu) {
         var4 = (var2 as LinkContextData.BindUserMenu).getLinkColor();
      } else if (var2 is LinkContextData.BindOpenUrl) {
         var4 = (var2 as LinkContextData.BindOpenUrl).getLinkColor();
      } else if (var2 is LinkContextData.BindOpenGdmCustomizeActionSheet) {
         var4 = (var2 as LinkContextData.BindOpenGdmCustomizeActionSheet).getLinkColor();
      } else {
         var4 = null;
      }

      this.linkColor = var4;
      val var8: java.lang.String;
      if (var2 is LinkContextData.LinkUrl) {
         var8 = (var2 as LinkContextData.LinkUrl).getUrl();
      } else if (var2 is LinkContextData.BindOpenUrl) {
         var8 = (var2 as LinkContextData.BindOpenUrl).getUrl();
      } else {
         var8 = null;
      }

      this.url = var8;
      val var3: Boolean;
      if (var8 != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.isUrl = var3;
      val var9: ContentNode = i.h0(var1) as ContentNode;
      var var6: java.lang.String = var8;
      if (var9 != null) {
         val var7: ContentNode;
         if (var9 !is TextContentNode) {
            var7 = null;
         } else {
            var7 = var9;
         }

         val var10: TextContentNode = var7 as TextContentNode;
         var6 = var8;
         if (var10 != null) {
            var6 = var10.getContent();
            if (var6 == null) {
               var6 = var8;
            }
         }
      }

      this.textContent = var6;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public operator fun component2(): LinkContextData? {
      return this.target;
   }

   public fun copy(content: List<ContentNode> = var0.content, target: LinkContextData? = var0.target): LinkContentNode {
      q.h(var1, "content");
      return new LinkContentNode(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LinkContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.content, var1.content)) {
            return false;
         } else {
            return q.c(this.target, var1.target);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.content.hashCode();
      val var1: Int;
      if (this.target == null) {
         var1 = 0;
      } else {
         var1 = this.target.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var3: java.util.List = this.content;
      val var2: LinkContextData = this.target;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LinkContentNode(content=");
      var1.append(var3);
      var1.append(", target=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LinkContentNode.$serializer = new LinkContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", var0, 6);
         var1.l("content", false);
         var1.l("target", false);
         var1.l("linkColor", true);
         var1.l("url", true);
         var1.l("isUrl", true);
         var1.l("textContent", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: KSerializer = LinkContentNode.access$get$childSerializers$cp()[0];
         val var4: KSerializer = a.u(LinkContextDataSerializer.INSTANCE);
         val var3: KSerializer = a.u(N.a);
         val var5: C0 = C0.a;
         return new KSerializer[]{var1, var4, var3, a.u(C0.a), h.a, a.u(var5)};
      }

      public open fun deserialize(decoder: Decoder): LinkContentNode {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var10: Array<KSerializer> = LinkContentNode.access$get$childSerializers$cp();
         var var2: Int;
         var var5: Boolean;
         var var8: LinkContextData;
         var var9: java.util.List;
         var var14: Any;
         var var15: Any;
         if (var12.y()) {
            var15 = var12.m(var11, 0, var10[0], null) as java.util.List;
            var8 = var12.v(var11, 1, LinkContextDataSerializer.INSTANCE, null) as LinkContextData;
            var10 = var12.v(var11, 2, N.a, null) as Int;
            var14 = C0.a;
            val var7: java.lang.String = var12.v(var11, 3, C0.a, null) as java.lang.String;
            var5 = var12.s(var11, 4);
            var14 = var12.v(var11, 5, (DeserializationStrategy)var14, null) as java.lang.String;
            var2 = 63;
            var9 = (java.util.List)var15;
            var15 = var7;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var9 = null;
            var8 = null;
            var var16: Any = null;
            var15 = null;
            var14 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var12.x(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var9 = var12.m(var11, 0, var10[0], var9) as java.util.List;
                     var2 |= 1;
                     break;
                  case 1:
                     var8 = var12.v(var11, 1, LinkContextDataSerializer.INSTANCE, var8) as LinkContextData;
                     var2 |= 2;
                     break;
                  case 2:
                     var16 = var12.v(var11, 2, N.a, var16) as Int;
                     var2 |= 4;
                     break;
                  case 3:
                     var15 = var12.v(var11, 3, C0.a, var15) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var5 = var12.s(var11, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var12.v(var11, 5, C0.a, var14) as java.lang.String;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var10 = (KSerializer[])var16;
         }

         var12.b(var11);
         return new LinkContentNode(var2, var9, var8, var10, (java.lang.String)var15, var5, (java.lang.String)var14, null);
      }

      public open fun serialize(encoder: Encoder, value: LinkContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LinkContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContentNode> {
         return LinkContentNode.$serializer.INSTANCE;
      }
   }
}
