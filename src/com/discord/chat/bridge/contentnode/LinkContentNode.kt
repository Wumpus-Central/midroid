package com.discord.chat.bridge.contentnode

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
public data class LinkContentNode(content: List<ContentNode>, target: String, context: LinkContext? = null) : ContentNode {
   public final val content: List<ContentNode>
   public final val context: LinkContext?
   public final val isUrl: Boolean
   public final val target: String
   public final val textContent: String

   init {
      r.h(var1, "content");
      r.h(var2, "target");
      super(null);
      this.content = var1;
      this.target = var2;
      this.context = var3;
      val var6: ContentNode = h.b0(var1) as ContentNode;
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

   @JvmStatic
   public fun `write$Self`(self: LinkContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new xk.f(ContentNodeSerializer.INSTANCE), var0.content);
      var1.z(var2, 1, var0.target);
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.context == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, LinkContext.$serializer.INSTANCE, var0.context);
      }

      label57: {
         if (!var1.A(var2, 3)) {
            var var9: java.lang.String;
            var var14: java.lang.String;
            label54: {
               var9 = var0.textContent;
               val var15: ContentNode = h.b0(var0.content) as ContentNode;
               if (var15 != null) {
                  var var12: ContentNode = var15;
                  if (var15 !is TextContentNode) {
                     var12 = null;
                  }

                  val var13: TextContentNode = var12 as TextContentNode;
                  if (var12 as TextContentNode != null) {
                     val var16: java.lang.String = var13.getContent();
                     var14 = var16;
                     if (var16 != null) {
                        break label54;
                     }
                  }
               }

               var14 = var0.target;
            }

            if (r.c(var9, var14)) {
               var3 = false;
               break label57;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 3, var0.textContent);
      }

      label44: {
         if (!var1.A(var2, 4)) {
            val var5: Boolean;
            if (var0.context == null) {
               var5 = true;
            } else {
               var5 = false;
            }

            var3 = false;
            if (var0.isUrl == var5) {
               break label44;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.x(var2, 4, var0.isUrl);
      }
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
      r.h(var1, "content");
      r.h(var2, "target");
      return new LinkContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LinkContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.target, var1.target)) {
            return false;
         } else {
            return r.c(this.context, var1.context);
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
      val var2: java.util.List = this.content;
      val var1: java.lang.String = this.target;
      val var3: LinkContext = this.context;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LinkContentNode(content=");
      var4.append(var2);
      var4.append(", target=");
      var4.append(var1);
      var4.append(", context=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<LinkContentNode> {
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
         val var2: xk.f = new xk.f(ContentNodeSerializer.INSTANCE);
         val var1: a2 = a2.a;
         return new KSerializer[]{var2, a2.a, a.u(LinkContext.$serializer.INSTANCE), var1, xk.h.a};
      }

      public open fun deserialize(decoder: Decoder): LinkContentNode {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: Boolean;
         var var6: Any;
         var var7: Any;
         var var8: java.lang.String;
         var var11: java.lang.String;
         if (var10.p()) {
            var6 = var10.y(var9, 0, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var8 = var10.m(var9, 1);
            var7 = var10.n(var9, 2, LinkContext.$serializer.INSTANCE, null);
            var11 = var10.m(var9, 3);
            var5 = var10.C(var9, 4);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var6 = null;
            var8 = null;
            var7 = null;
            var11 = null;
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
                              var11 = var10.m(var9, 3);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var10.n(var9, 2, LinkContext.$serializer.INSTANCE, var7);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var10.y(var9, 0, new xk.f(ContentNodeSerializer.INSTANCE), var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new LinkContentNode(var2, var6 as java.util.List, var8, var7 as LinkContext, var11, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: LinkContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LinkContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContentNode> {
         return LinkContentNode.$serializer.INSTANCE;
      }
   }
}
