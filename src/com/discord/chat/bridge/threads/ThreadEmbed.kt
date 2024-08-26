package com.discord.chat.bridge.threads

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
import xk.h

@f
public data class ThreadEmbed(title: String,
   messageCountLabel: String,
   messagePreviewString: String? = null,
   archived: Boolean? = null,
   archivedIconUrl: String? = null,
   referencedMessage: ThreadEmbedMessage? = null
) {
   public final val archived: Boolean?
   public final val archivedIconUrl: String?
   public final val messageCountLabel: String
   public final val messagePreviewString: String?
   public final val referencedMessage: ThreadEmbedMessage?
   public final val title: String

   init {
      r.h(var1, "title");
      r.h(var2, "messageCountLabel");
      super();
      this.title = var1;
      this.messageCountLabel = var2;
      this.messagePreviewString = var3;
      this.archived = var4;
      this.archivedIconUrl = var5;
      this.referencedMessage = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: ThreadEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.title);
      var1.z(var2, 1, var0.messageCountLabel);
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.messagePreviewString == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.messagePreviewString);
      }

      if (!var1.A(var2, 3) && var0.archived == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, h.a, var0.archived);
      }

      if (!var1.A(var2, 4) && var0.archivedIconUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.archivedIconUrl);
      }

      label40: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (var0.referencedMessage == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, ThreadEmbedMessage.$serializer.INSTANCE, var0.referencedMessage);
      }
   }

   public operator fun component1(): String {
      return this.title;
   }

   public operator fun component2(): String {
      return this.messageCountLabel;
   }

   public operator fun component3(): String? {
      return this.messagePreviewString;
   }

   public operator fun component4(): Boolean? {
      return this.archived;
   }

   public operator fun component5(): String? {
      return this.archivedIconUrl;
   }

   public operator fun component6(): ThreadEmbedMessage? {
      return this.referencedMessage;
   }

   public fun copy(
      title: String = var0.title,
      messageCountLabel: String = var0.messageCountLabel,
      messagePreviewString: String? = var0.messagePreviewString,
      archived: Boolean? = var0.archived,
      archivedIconUrl: String? = var0.archivedIconUrl,
      referencedMessage: ThreadEmbedMessage? = var0.referencedMessage
   ): ThreadEmbed {
      r.h(var1, "title");
      r.h(var2, "messageCountLabel");
      return new ThreadEmbed(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThreadEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.messageCountLabel, var1.messageCountLabel)) {
            return false;
         } else if (!r.c(this.messagePreviewString, var1.messagePreviewString)) {
            return false;
         } else if (!r.c(this.archived, var1.archived)) {
            return false;
         } else if (!r.c(this.archivedIconUrl, var1.archivedIconUrl)) {
            return false;
         } else {
            return r.c(this.referencedMessage, var1.referencedMessage);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.title.hashCode();
      val var5: Int = this.messageCountLabel.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.messagePreviewString == null) {
         var1 = 0;
      } else {
         var1 = this.messagePreviewString.hashCode();
      }

      val var2: Int;
      if (this.archived == null) {
         var2 = 0;
      } else {
         var2 = this.archived.hashCode();
      }

      val var3: Int;
      if (this.archivedIconUrl == null) {
         var3 = 0;
      } else {
         var3 = this.archivedIconUrl.hashCode();
      }

      if (this.referencedMessage != null) {
         var4 = this.referencedMessage.hashCode();
      }

      return ((((var6 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.title;
      val var2: java.lang.String = this.messageCountLabel;
      val var1: java.lang.String = this.messagePreviewString;
      val var3: java.lang.Boolean = this.archived;
      val var5: java.lang.String = this.archivedIconUrl;
      val var7: ThreadEmbedMessage = this.referencedMessage;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ThreadEmbed(title=");
      var4.append(var6);
      var4.append(", messageCountLabel=");
      var4.append(var2);
      var4.append(", messagePreviewString=");
      var4.append(var1);
      var4.append(", archived=");
      var4.append(var3);
      var4.append(", archivedIconUrl=");
      var4.append(var5);
      var4.append(", referencedMessage=");
      var4.append(var7);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<ThreadEmbed> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ThreadEmbed.$serializer = new ThreadEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.threads.ThreadEmbed", var0, 6);
         var1.l("title", false);
         var1.l("messageCountLabel", false);
         var1.l("messagePreviewString", true);
         var1.l("archived", true);
         var1.l("archivedIconUrl", true);
         var1.l("referencedMessage", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, a2.a, a.u(a2.a), a.u(h.a), a.u(var1), a.u(ThreadEmbedMessage.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ThreadEmbed {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var9: Any;
         var var10: Any;
         val var11: java.lang.String;
         var var15: Any;
         var var17: java.lang.String;
         if (var5) {
            var17 = var13.m(var12, 0);
            val var6: java.lang.String = var13.m(var12, 1);
            var15 = a2.a;
            var10 = var13.n(var12, 2, a2.a, null);
            var9 = var13.n(var12, 3, h.a, null);
            var8 = (java.lang.String)var13.n(var12, 4, (DeserializationStrategy)var15, null);
            var15 = var13.n(var12, 5, ThreadEmbedMessage.$serializer.INSTANCE, null);
            var2 = 63;
            var11 = var17;
            var17 = var6;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var17 = null;
            var10 = null;
            var9 = null;
            var var16: Any = null;
            var15 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var8 = var13.m(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var17 = var13.m(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var10 = var13.n(var12, 2, a2.a, var10);
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var13.n(var12, 3, h.a, var9);
                     var2 |= 8;
                     break;
                  case 4:
                     var16 = var13.n(var12, 4, a2.a, var16);
                     var2 |= 16;
                     break;
                  case 5:
                     var15 = var13.n(var12, 5, ThreadEmbedMessage.$serializer.INSTANCE, var15);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var11 = var8;
            var8 = (java.lang.String)var16;
         }

         var13.c(var12);
         return new ThreadEmbed(var2, var11, var17, var10 as java.lang.String, var9 as java.lang.Boolean, var8, var15 as ThreadEmbedMessage, null);
      }

      public open fun serialize(encoder: Encoder, value: ThreadEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ThreadEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ThreadEmbed> {
         return ThreadEmbed.$serializer.INSTANCE;
      }
   }
}
