package com.discord.chat.bridge.threads

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class ThreadEmbed(title: String,
   messageCountLabel: String,
   messagePreviewString: String? = null,
   archived: Boolean? = null,
   archivedIconUrl: String? = null,
   referencedMessage: ThreadEmbedMessage? = null
) {
   public final val title: String
   public final val messageCountLabel: String
   public final val messagePreviewString: String?
   public final val archived: Boolean?
   public final val archivedIconUrl: String?
   public final val referencedMessage: ThreadEmbedMessage?

   init {
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
      return new ThreadEmbed(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThreadEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.messageCountLabel == var1.messageCountLabel)) {
            return false;
         } else if (!(this.messagePreviewString == var1.messagePreviewString)) {
            return false;
         } else if (!(this.archived == var1.archived)) {
            return false;
         } else if (!(this.archivedIconUrl == var1.archivedIconUrl)) {
            return false;
         } else {
            return this.referencedMessage == var1.referencedMessage;
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
      val var4: java.lang.String = this.messageCountLabel;
      val var3: java.lang.String = this.messagePreviewString;
      val var2: java.lang.Boolean = this.archived;
      val var5: java.lang.String = this.archivedIconUrl;
      val var1: ThreadEmbedMessage = this.referencedMessage;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ThreadEmbed(title=");
      var7.append(var6);
      var7.append(", messageCountLabel=");
      var7.append(var4);
      var7.append(", messagePreviewString=");
      var7.append(var3);
      var7.append(", archived=");
      var7.append(var2);
      var7.append(", archivedIconUrl=");
      var7.append(var5);
      var7.append(", referencedMessage=");
      var7.append(var1);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ThreadEmbed> {
         return ThreadEmbed.$serializer.INSTANCE;
      }
   }
}
