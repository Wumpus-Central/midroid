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
public data class AttachmentLinkContentNode(attachmentUrl: String, attachmentName: String, content: List<ContentNode>?) : MentionContentNode {
   public final val attachmentName: String
   public final val attachmentUrl: String
   public open val content: List<ContentNode>?

   init {
      r.h(var1, "attachmentUrl");
      r.h(var2, "attachmentName");
      super(null);
      this.attachmentUrl = var1;
      this.attachmentName = var2;
      this.content = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: AttachmentLinkContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      MentionContentNode.write$Self(var0, var1, var2);
      var1.z(var2, 0, var0.attachmentUrl);
      var1.z(var2, 1, var0.attachmentName);
      var1.m(var2, 2, new xk.f(ContentNodeSerializer.INSTANCE), var0.getContent());
   }

   public operator fun component1(): String {
      return this.attachmentUrl;
   }

   public operator fun component2(): String {
      return this.attachmentName;
   }

   public operator fun component3(): List<ContentNode>? {
      return this.getContent();
   }

   public fun copy(attachmentUrl: String = var0.attachmentUrl, attachmentName: String = var0.attachmentName, content: List<ContentNode>? = var0.getContent()): AttachmentLinkContentNode {
      r.h(var1, "attachmentUrl");
      r.h(var2, "attachmentName");
      return new AttachmentLinkContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AttachmentLinkContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.attachmentUrl, var1.attachmentUrl)) {
            return false;
         } else if (!r.c(this.attachmentName, var1.attachmentName)) {
            return false;
         } else {
            return r.c(this.getContent(), var1.getContent());
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.attachmentUrl.hashCode();
      val var3: Int = this.attachmentName.hashCode();
      val var1: Int;
      if (this.getContent() == null) {
         var1 = 0;
      } else {
         var1 = this.getContent().hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.attachmentUrl;
      val var1: java.lang.String = this.attachmentName;
      val var4: java.util.List = this.getContent();
      val var2: StringBuilder = new StringBuilder();
      var2.append("AttachmentLinkContentNode(attachmentUrl=");
      var2.append(var3);
      var2.append(", attachmentName=");
      var2.append(var1);
      var2.append(", content=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<AttachmentLinkContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AttachmentLinkContentNode.$serializer = new AttachmentLinkContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("attachmentLink", var0, 3);
         var1.l("attachmentUrl", false);
         var1.l("attachmentName", false);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a.u(new xk.f(ContentNodeSerializer.INSTANCE))};
      }

      public open fun deserialize(decoder: Decoder): AttachmentLinkContentNode {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var7: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var10: Any;
         if (var5) {
            var7 = var9.m(var8, 0);
            var6 = var9.m(var8, 1);
            var10 = var9.n(var8, 2, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var9.n(var8, 2, new xk.f(ContentNodeSerializer.INSTANCE), var10);
                        var2 |= 4;
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new AttachmentLinkContentNode(var2, var7, var6, var10 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: AttachmentLinkContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AttachmentLinkContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AttachmentLinkContentNode> {
         return AttachmentLinkContentNode.$serializer.INSTANCE;
      }
   }
}
