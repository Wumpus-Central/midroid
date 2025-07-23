package com.discord.push_notification_monitor

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class PushNotificationMeta(receivedTimestamp: Long,
   silent: Boolean,
   type: String,
   title: String,
   content: String?,
   channelId: String? = null,
   messageId: String? = null
) {
   public final val receivedTimestamp: Long
   public final val silent: Boolean
   public final val type: String
   public final val title: String
   public final val content: String?
   public final val channelId: String?
   public final val messageId: String?

   init {
      r.h(var4, "type");
      r.h(var5, "title");
      super();
      this.receivedTimestamp = var1;
      this.silent = var3;
      this.type = var4;
      this.title = var5;
      this.content = var6;
      this.channelId = var7;
      this.messageId = var8;
   }

   public operator fun component1(): Long {
      return this.receivedTimestamp;
   }

   public operator fun component2(): Boolean {
      return this.silent;
   }

   public operator fun component3(): String {
      return this.type;
   }

   public operator fun component4(): String {
      return this.title;
   }

   public operator fun component5(): String? {
      return this.content;
   }

   public operator fun component6(): String? {
      return this.channelId;
   }

   public operator fun component7(): String? {
      return this.messageId;
   }

   public fun copy(
      receivedTimestamp: Long = var0.receivedTimestamp,
      silent: Boolean = var0.silent,
      type: String = var0.type,
      title: String = var0.title,
      content: String? = var0.content,
      channelId: String? = var0.channelId,
      messageId: String? = var0.messageId
   ): PushNotificationMeta {
      r.h(var4, "type");
      r.h(var5, "title");
      return new PushNotificationMeta(var1, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PushNotificationMeta) {
         return false;
      } else {
         var1 = var1;
         if (this.receivedTimestamp != var1.receivedTimestamp) {
            return false;
         } else if (this.silent != var1.silent) {
            return false;
         } else if (!r.c(this.type, var1.type)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = java.lang.Long.hashCode(this.receivedTimestamp);
      val var6: Int = java.lang.Boolean.hashCode(this.silent);
      val var7: Int = this.type.hashCode();
      val var5: Int = this.title.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var2: Int;
      if (this.channelId == null) {
         var2 = 0;
      } else {
         var2 = this.channelId.hashCode();
      }

      if (this.messageId != null) {
         var3 = this.messageId.hashCode();
      }

      return (((((var4 * 31 + var6) * 31 + var7) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: Long = this.receivedTimestamp;
      val var3: Boolean = this.silent;
      val var4: java.lang.String = this.type;
      val var6: java.lang.String = this.title;
      val var7: java.lang.String = this.content;
      val var8: java.lang.String = this.channelId;
      val var9: java.lang.String = this.messageId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("PushNotificationMeta(receivedTimestamp=");
      var5.append(var1);
      var5.append(", silent=");
      var5.append(var3);
      var5.append(", type=");
      var5.append(var4);
      var5.append(", title=");
      var5.append(var6);
      var5.append(", content=");
      var5.append(var7);
      var5.append(", channelId=");
      var5.append(var8);
      var5.append(", messageId=");
      var5.append(var9);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationMeta> {
         return PushNotificationMeta.$serializer.INSTANCE;
      }
   }
}
