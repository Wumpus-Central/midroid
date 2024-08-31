package com.discord.chat.bridge.contentnode

import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class LinkContentNode(content: List<ContentNode>, target: String, context: LinkContext? = null) : ContentNode {
   public final val content: List<ContentNode>
   public final val context: LinkContext?
   public final val isUrl: Boolean
   public final val target: String
   public final val textContent: String

   init {
      q.h(var1, "content");
      q.h(var2, "target");
      super(null);
      this.content = var1;
      this.target = var2;
      this.context = var3;
      val var6: ContentNode = i.f0(var1) as ContentNode;
      var var7: java.lang.String = var2;
      if (var6 != null) {
         val var8: ContentNode;
         if (var6 !is TextContentNode) {
            var8 = null;
         } else {
            var8 = var6;
         }

         val var9: TextContentNode = var8 as TextContentNode;
         var7 = var2;
         if (var9 != null) {
            var7 = var9.getContent();
            if (var7 == null) {
               var7 = var2;
            }
         }
      }

      this.textContent = var7;
      val var4: Boolean;
      if (var3 == null) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.isUrl = var4;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public operator fun component2(): String {
      return this.target;
   }

   public operator fun component3(): LinkContext? {
      return this.context;
   }

   public fun copy(content: List<ContentNode> = var0.content, target: String = var0.target, context: LinkContext? = var0.context): LinkContentNode {
      q.h(var1, "content");
      q.h(var2, "target");
      return new LinkContentNode(var1, var2, var3);
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
         } else if (!q.c(this.target, var1.target)) {
            return false;
         } else {
            return q.c(this.context, var1.context);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.content.hashCode();
      val var2: Int = this.target.hashCode();
      val var1: Int;
      if (this.context == null) {
         var1 = 0;
      } else {
         var1 = this.context.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var3: java.lang.String = this.target;
      val var4: LinkContext = this.context;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LinkContentNode(content=");
      var2.append(var1);
      var2.append(", target=");
      var2.append(var3);
      var2.append(", context=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LinkContentNode.$serializer = new LinkContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", var0, 5);
         var1.l("content", false);
         var1.l("target", false);
         var1.l("context", true);
         var1.l("textContent", true);
         var1.l("isUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: KSerializer = LinkContentNode.access$get$childSerializers$cp()[0];
         val var2: b2 = b2.a;
         return new KSerializer[]{var1, b2.a, a.u(LinkContext.$serializer.INSTANCE), var2, h.a};
      }

      public open fun deserialize(decoder: Decoder): LinkContentNode {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var11: Array<KSerializer> = LinkContentNode.access$get$childSerializers$cp();
         var var2: Int;
         var var5: Boolean;
         var var6: Any;
         var var7: java.lang.String;
         var var8: java.util.List;
         var var12: java.lang.String;
         if (var10.p()) {
            var8 = var10.y(var9, 0, var11[0], null) as java.util.List;
            var7 = var10.m(var9, 1);
            var6 = var10.n(var9, 2, LinkContext.$serializer.INSTANCE, null) as LinkContext;
            var12 = var10.m(var9, 3);
            var5 = var10.C(var9, 4);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var8 = null;
            var7 = null;
            var6 = null;
            var12 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var5 = var10.C(var9, 4);
                              var2 |= 16;
                           } else {
                              var12 = var10.m(var9, 3);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var10.n(var9, 2, LinkContext.$serializer.INSTANCE, var6) as LinkContext;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.y(var9, 0, var11[0], var8) as java.util.List;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new LinkContentNode(var2, var8, var7, (LinkContext)var6, var12, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: LinkContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LinkContentNode.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContentNode> {
         return LinkContentNode.$serializer.INSTANCE;
      }
   }
}
