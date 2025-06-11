package com.discord.push_notification_monitor

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
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
      q.h(var4, "type");
      q.h(var5, "title");
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
      q.h(var4, "type");
      q.h(var5, "title");
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
         } else if (!q.c(this.type, var1.type)) {
            return false;
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = java.lang.Long.hashCode(this.receivedTimestamp);
      val var5: Int = java.lang.Boolean.hashCode(this.silent);
      val var7: Int = this.type.hashCode();
      val var6: Int = this.title.hashCode();
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

      return (((((var4 * 31 + var5) * 31 + var7) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: Long = this.receivedTimestamp;
      val var3: Boolean = this.silent;
      val var8: java.lang.String = this.type;
      val var5: java.lang.String = this.title;
      val var6: java.lang.String = this.content;
      val var4: java.lang.String = this.channelId;
      val var7: java.lang.String = this.messageId;
      val var9: StringBuilder = new StringBuilder();
      var9.append("PushNotificationMeta(receivedTimestamp=");
      var9.append(var1);
      var9.append(", silent=");
      var9.append(var3);
      var9.append(", type=");
      var9.append(var8);
      var9.append(", title=");
      var9.append(var5);
      var9.append(", content=");
      var9.append(var6);
      var9.append(", channelId=");
      var9.append(var4);
      var9.append(", messageId=");
      var9.append(var7);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationMeta> {
         return PushNotificationMeta.$serializer.INSTANCE;
      }
   }
}
