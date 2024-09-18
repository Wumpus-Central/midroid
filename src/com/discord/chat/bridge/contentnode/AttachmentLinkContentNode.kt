package com.discord.chat.bridge.contentnode

import bl.b2
import bl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

@f
public data class AttachmentLinkContentNode(attachmentUrl: String, attachmentName: String, content: List<ContentNode>?) : MentionContentNode {
   public final val attachmentName: String
   public final val attachmentUrl: String
   public open val content: List<ContentNode>?

   init {
      q.h(var1, "attachmentUrl");
      q.h(var2, "attachmentName");
      super(null);
      this.attachmentUrl = var1;
      this.attachmentName = var2;
      this.content = var3;
   }

   public operator fun component1(): String {
      return this.attachmentUrl;
   }

   public operator fun component2(): String {
      return this.attachmentName;
   }

   public operator fun component3(): List<ContentNode>? {
      return this.content;
   }

   public fun copy(attachmentUrl: String = var0.attachmentUrl, attachmentName: String = var0.attachmentName, content: List<ContentNode>? = var0.content): AttachmentLinkContentNode {
      q.h(var1, "attachmentUrl");
      q.h(var2, "attachmentName");
      return new AttachmentLinkContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AttachmentLinkContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.attachmentUrl, var1.attachmentUrl)) {
            return false;
         } else if (!q.c(this.attachmentName, var1.attachmentName)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.attachmentUrl.hashCode();
      val var2: Int = this.attachmentName.hashCode();
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.attachmentUrl;
      val var4: java.lang.String = this.attachmentName;
      val var2: java.util.List = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AttachmentLinkContentNode(attachmentUrl=");
      var1.append(var3);
      var1.append(", attachmentName=");
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
         val var0: AttachmentLinkContentNode.$serializer = new AttachmentLinkContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("attachmentLink", var0, 3);
         var1.l("attachmentUrl", false);
         var1.l("attachmentName", false);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, a.u(AttachmentLinkContentNode.access$get$childSerializers$cp()[2])};
      }

      public open fun deserialize(decoder: Decoder): AttachmentLinkContentNode {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var10: Array<KSerializer> = AttachmentLinkContentNode.access$get$childSerializers$cp();
         val var5: Boolean = var9.y();
         var var7: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var11: java.util.List;
         if (var5) {
            var7 = var9.t(var8, 0);
            var6 = var9.t(var8, 1);
            var11 = var9.v(var8, 2, var10[2], null) as java.util.List;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var9.v(var8, 2, var10[2], var11) as java.util.List;
                        var2 |= 4;
                     } else {
                        var6 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.t(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.b(var8);
         return new AttachmentLinkContentNode(var2, var7, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: AttachmentLinkContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AttachmentLinkContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AttachmentLinkContentNode> {
         return AttachmentLinkContentNode.$serializer.INSTANCE;
      }
   }
}
