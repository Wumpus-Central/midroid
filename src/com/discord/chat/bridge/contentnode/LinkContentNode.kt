package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.rolecolors.RoleColors
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class LinkContentNode(content: List<ContentNode>, target: LinkContextData?) : ContentNode {
   public final val content: List<ContentNode>
   public final val target: LinkContextData?
   public final val linkColor: Int?
   public final val roleColors: RoleColors?
   public final val shouldShowRoleDot: Boolean?
   public final val url: String?
   public final val isUrl: Boolean
   public final val textContent: String?

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
      val var1: java.util.List = this.content;
      val var3: LinkContextData = this.target;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LinkContentNode(content=");
      var2.append(var1);
      var2.append(", target=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContentNode> {
         return LinkContentNode.$serializer.INSTANCE;
      }
   }
}
