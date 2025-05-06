package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.rolecolors.RoleColors
import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.h
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
   public final val shouldShowRoleDot: Boolean?
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
      val var10: java.lang.Boolean;
      if (var2 is LinkContextData.BindUserMenu) {
         var10 = (var2 as LinkContextData.BindUserMenu).getShouldShowRoleDot();
      } else {
         var10 = null;
      }

      this.shouldShowRoleDot = var10;
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
      val var11: ContentNode = i.h0(var1) as ContentNode;
      var var6: java.lang.String = var8;
      if (var11 != null) {
         val var7: ContentNode;
         if (var11 !is TextContentNode) {
            var7 = null;
         } else {
            var7 = var11;
         }

         val var12: TextContentNode = var7 as TextContentNode;
         var6 = var8;
         if (var12 != null) {
            var6 = var12.getContent();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", var0, 8);
         var1.l("content", false);
         var1.l("target", false);
         var1.l("linkColor", true);
         var1.l("roleColors", true);
         var1.l("shouldShowRoleDot", true);
         var1.l("url", true);
         var1.l("isUrl", true);
         var1.l("textContent", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var6: KSerializer = LinkContentNode.access$get$childSerializers$cp()[0];
         val var1: KSerializer = a.u(LinkContextDataSerializer.INSTANCE);
         val var3: KSerializer = a.u(N.a);
         val var5: KSerializer = a.u(RoleColors.$serializer.INSTANCE);
         val var7: h = h.a;
         val var2: KSerializer = a.u(h.a);
         val var4: C0 = C0.a;
         return new KSerializer[]{var6, var1, var3, var5, var2, a.u(C0.a), var7, a.u(var4)};
      }

      public open fun deserialize(decoder: Decoder): LinkContentNode {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.c(var15);
         var var13: Array<KSerializer> = LinkContentNode.access$get$childSerializers$cp();
         var var6: Boolean = var16.y();
         var var3: Byte = 7;
         var var2: Int;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var11: java.lang.String;
         var var12: Any;
         val var18: java.lang.String;
         if (var6) {
            var8 = var16.m(var15, 0, var13[0], null) as java.util.List;
            var12 = var16.v(var15, 1, LinkContextDataSerializer.INSTANCE, null) as LinkContextData;
            var9 = var16.v(var15, 2, N.a, null) as Int;
            var13 = var16.v(var15, 3, RoleColors.$serializer.INSTANCE, null) as RoleColors;
            var10 = var16.v(var15, 4, h.a, null) as java.lang.Boolean;
            val var17: C0 = C0.a;
            val var7: java.lang.String = var16.v(var15, 5, C0.a, null) as java.lang.String;
            var6 = var16.s(var15, 6);
            var18 = var16.v(var15, 7, var17, null) as java.lang.String;
            var2 = 255;
            var11 = var7;
         } else {
            var var4: Boolean = true;
            var6 = false;
            var12 = null;
            var11 = null;
            var10 = null;
            var8 = null;
            var var21: Any = null;
            var var19: Any = null;
            var9 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var16.x(var15);
               switch (var5) {
                  case -1:
                     var4 = false;
                     continue;
                  case 0:
                     var8 = var16.m(var15, 0, var13[0], var8) as java.util.List;
                     var2 |= 1;
                     break;
                  case 1:
                     var21 = var16.v(var15, 1, LinkContextDataSerializer.INSTANCE, var21) as LinkContextData;
                     var2 |= 2;
                     break;
                  case 2:
                     var19 = var16.v(var15, 2, N.a, var19) as Int;
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var16.v(var15, 3, RoleColors.$serializer.INSTANCE, var9) as RoleColors;
                     var2 |= 8;
                     break;
                  case 4:
                     var10 = var16.v(var15, 4, h.a, var10) as java.lang.Boolean;
                     var2 |= 16;
                     var3 = 7;
                     continue;
                  case 5:
                     var11 = var16.v(var15, 5, C0.a, var11) as java.lang.String;
                     var2 |= 32;
                     continue;
                  case 6:
                     var6 = var16.s(var15, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var12 = var16.v(var15, var3, C0.a, var12) as java.lang.String;
                     var2 |= 128;
                     continue;
                  default:
                     throw new n(var5);
               }

               var3 = 7;
            }

            var18 = (java.lang.String)var12;
            var13 = (KSerializer[])var9;
            var9 = var19;
            var12 = var21;
         }

         var16.b(var15);
         return new LinkContentNode(
            var2, (java.util.List)var8, (LinkContextData)var12, (Integer)var9, var13, (java.lang.Boolean)var10, var11, var6, var18, null
         );
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
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContentNode> {
         return LinkContentNode.$serializer.INSTANCE;
      }
   }
}
