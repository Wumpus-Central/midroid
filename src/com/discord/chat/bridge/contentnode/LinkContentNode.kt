package com.discord.chat.bridge.contentnode

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.h
import com.discord.chat.bridge.rolecolors.RoleColors
import kotlin.jvm.internal.q
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
   public final val roleColors: RoleColors?
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
      val var9: RoleColors;
      if (var2 is LinkContextData.BindUserMenu) {
         var9 = (var2 as LinkContextData.BindUserMenu).getRoleColors();
      } else {
         var9 = null;
      }

      this.roleColors = var9;
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
      val var10: ContentNode = i.h0(var1) as ContentNode;
      var var6: java.lang.String = var8;
      if (var10 != null) {
         val var7: ContentNode;
         if (var10 !is TextContentNode) {
            var7 = null;
         } else {
            var7 = var10;
         }

         val var11: TextContentNode = var7 as TextContentNode;
         var6 = var8;
         if (var11 != null) {
            var6 = var11.getContent();
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
      val var2: java.util.List = this.content;
      val var1: LinkContextData = this.target;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LinkContentNode(content=");
      var3.append(var2);
      var3.append(", target=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", var0, 7);
         var1.l("content", false);
         var1.l("target", false);
         var1.l("linkColor", true);
         var1.l("roleColors", true);
         var1.l("url", true);
         var1.l("isUrl", true);
         var1.l("textContent", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: KSerializer = LinkContentNode.access$get$childSerializers$cp()[0];
         val var4: KSerializer = a.u(LinkContextDataSerializer.INSTANCE);
         val var3: KSerializer = a.u(N.a);
         val var5: KSerializer = a.u(RoleColors.$serializer.INSTANCE);
         val var6: C0 = C0.a;
         return new KSerializer[]{var2, var4, var3, var5, a.u(C0.a), h.a, a.u(var6)};
      }

      public open fun deserialize(decoder: Decoder): LinkContentNode {
         q.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: c = var1.c(var14);
         var var12: Array<KSerializer> = LinkContentNode.access$get$childSerializers$cp();
         var var6: Boolean = var15.y();
         var var3: Byte = 6;
         var var2: Int;
         var var7: java.util.List;
         var var8: Any;
         var var10: Any;
         var var11: Any;
         var var21: java.lang.String;
         if (var6) {
            var7 = var15.m(var14, 0, var12[0], null) as java.util.List;
            var8 = var15.v(var14, 1, LinkContextDataSerializer.INSTANCE, null) as LinkContextData;
            var11 = var15.v(var14, 2, N.a, null) as Int;
            val var9: RoleColors = var15.v(var14, 3, RoleColors.$serializer.INSTANCE, null) as RoleColors;
            val var16: C0 = C0.a;
            var10 = var15.v(var14, 4, C0.a, null) as java.lang.String;
            var6 = var15.s(var14, 5);
            val var17: java.lang.String = var15.v(var14, 6, var16, null) as java.lang.String;
            var2 = 127;
            var12 = var9;
            var21 = var17;
         } else {
            var var4: Boolean = true;
            var6 = false;
            var11 = null;
            var7 = null;
            var var18: Any = null;
            var21 = null;
            var8 = null;
            var10 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var15.x(var14);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var7 = var15.m(var14, 0, var12[0], var7) as java.util.List;
                     var2 |= 1;
                     break;
                  case 1:
                     var18 = var15.v(var14, 1, LinkContextDataSerializer.INSTANCE, var18) as LinkContextData;
                     var2 |= 2;
                     break;
                  case 2:
                     var21 = var15.v(var14, 2, N.a, var21) as Int;
                     var2 |= 4;
                     var3 = 6;
                     continue;
                  case 3:
                     var8 = var15.v(var14, 3, RoleColors.$serializer.INSTANCE, var8) as RoleColors;
                     var2 |= 8;
                     continue;
                  case 4:
                     var10 = var15.v(var14, 4, C0.a, var10) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var6 = var15.s(var14, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var11 = var15.v(var14, var3, C0.a, var11) as java.lang.String;
                     var2 |= 64;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 6;
            }

            var21 = (java.lang.String)var11;
            var12 = (KSerializer[])var8;
            var11 = var21;
            var8 = var18;
         }

         var15.b(var14);
         return new LinkContentNode(var2, var7, (LinkContextData)var8, (Integer)var11, var12, (java.lang.String)var10, var6, var21, null);
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContentNode> {
         return LinkContentNode.$serializer.INSTANCE;
      }
   }
}
