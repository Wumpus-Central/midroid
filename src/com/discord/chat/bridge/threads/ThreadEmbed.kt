package com.discord.chat.bridge.threads

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
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
      q.h(var1, "title");
      q.h(var2, "messageCountLabel");
      super();
      this.title = var1;
      this.messageCountLabel = var2;
      this.messagePreviewString = var3;
      this.archived = var4;
      this.archivedIconUrl = var5;
      this.referencedMessage = var6;
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
      q.h(var1, "title");
      q.h(var2, "messageCountLabel");
      return new ThreadEmbed(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThreadEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.messageCountLabel, var1.messageCountLabel)) {
            return false;
         } else if (!q.c(this.messagePreviewString, var1.messagePreviewString)) {
            return false;
         } else if (!q.c(this.archived, var1.archived)) {
            return false;
         } else if (!q.c(this.archivedIconUrl, var1.archivedIconUrl)) {
            return false;
         } else {
            return q.c(this.referencedMessage, var1.referencedMessage);
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
      val var3: java.lang.String = this.title;
      val var4: java.lang.String = this.messageCountLabel;
      val var6: java.lang.String = this.messagePreviewString;
      val var1: java.lang.Boolean = this.archived;
      val var5: java.lang.String = this.archivedIconUrl;
      val var7: ThreadEmbedMessage = this.referencedMessage;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ThreadEmbed(title=");
      var2.append(var3);
      var2.append(", messageCountLabel=");
      var2.append(var4);
      var2.append(", messagePreviewString=");
      var2.append(var6);
      var2.append(", archived=");
      var2.append(var1);
      var2.append(", archivedIconUrl=");
      var2.append(var5);
      var2.append(", referencedMessage=");
      var2.append(var7);
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
         val var1: b2 = b2.a;
         return new KSerializer[]{b2.a, b2.a, a.u(b2.a), a.u(h.a), a.u(var1), a.u(ThreadEmbedMessage.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ThreadEmbed {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.c(var12);
         val var5: Boolean = var13.y();
         var var10: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: java.lang.String;
         var var9: java.lang.String;
         var var15: Any;
         var var18: java.lang.String;
         if (var5) {
            var18 = var13.t(var12, 0);
            var9 = var13.t(var12, 1);
            var15 = b2.a;
            val var11: java.lang.String = var13.v(var12, 2, b2.a, null) as java.lang.String;
            var6 = var13.v(var12, 3, h.a, null) as java.lang.Boolean;
            var7 = var13.v(var12, 4, (DeserializationStrategy)var15, null) as java.lang.String;
            var15 = var13.v(var12, 5, ThreadEmbedMessage.$serializer.INSTANCE, null) as ThreadEmbedMessage;
            var2 = 63;
            var10 = var18;
            var18 = var11;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var18 = null;
            var7 = null;
            var6 = null;
            var15 = null;

            while (var3) {
               val var4: Int = var13.x(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.t(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.t(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var18 = var13.v(var12, 2, b2.a, var18) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var13.v(var12, 3, h.a, var7) as java.lang.Boolean;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.v(var12, 4, b2.a, var6) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var15 = var13.v(var12, 5, ThreadEmbedMessage.$serializer.INSTANCE, var15) as ThreadEmbedMessage;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var7 = (java.lang.String)var6;
            var6 = var7;
         }

         var13.b(var12);
         return new ThreadEmbed(var2, var10, var9, var18, (java.lang.Boolean)var6, var7, (ThreadEmbedMessage)var15, null);
      }

      public open fun serialize(encoder: Encoder, value: ThreadEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ThreadEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ThreadEmbed> {
         return ThreadEmbed.$serializer.INSTANCE;
      }
   }
}
