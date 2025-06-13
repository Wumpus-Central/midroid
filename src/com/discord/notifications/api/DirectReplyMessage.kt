package com.discord.notifications.api

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import mb.f

@f
public data class DirectReplyMessage(id: MessageId,
   channelId: ChannelId,
   author: DirectReplyUser,
   content: String? = ...,
   type: Int? = ...,
   channelType: Int? = ...,
   channelName: String? = ...,
   guildName: String? = ...
) : DirectReplyMessage(var1, var2, var4, var5, var6, var7, var8, var9) {
   public final val id: MessageId
   public final val channelId: ChannelId
   public final val author: DirectReplyUser
   public final val content: String?
   public final val type: Int?
   public final val channelType: Int?
   public final val channelName: String?
   public final val guildName: String?

   fun DirectReplyMessage(
      var1: java.lang.String, var2: Long, var4: DirectReplyUser, var5: java.lang.String, var6: Int, var7: Int, var8: java.lang.String, var9: java.lang.String
   ) {
      q.h(var1, "id");
      q.h(var4, "author");
      super();
      this.id = var1;
      this.channelId = var2;
      this.author = var4;
      this.content = var5;
      this.type = var6;
      this.channelType = var7;
      this.channelName = var8;
      this.guildName = var9;
   }

   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      q.h(var0, "$this$Json");
      var0.c(true);
      return Unit.a;
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): DirectReplyUser {
      return this.author;
   }

   public operator fun component4(): String? {
      return this.content;
   }

   public operator fun component5(): Int? {
      return this.type;
   }

   public operator fun component6(): Int? {
      return this.channelType;
   }

   public operator fun component7(): String? {
      return this.channelName;
   }

   public operator fun component8(): String? {
      return this.guildName;
   }

   public fun copy(
      id: MessageId = ...,
      channelId: ChannelId = ...,
      author: DirectReplyUser = ...,
      content: String? = ...,
      type: Int? = ...,
      channelType: Int? = ...,
      channelName: String? = ...,
      guildName: String? = ...
   ): DirectReplyMessage {
      q.h(var1, "id");
      q.h(var4, "author");
      return new DirectReplyMessage(var1, var2, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DirectReplyMessage) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.author, var1.author)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.type, var1.type)) {
            return false;
         } else if (!q.c(this.channelType, var1.channelType)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else {
            return q.c(this.guildName, var1.guildName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = MessageId.hashCode-impl(this.id);
      val var8: Int = ChannelId.hashCode-impl(this.channelId);
      val var6: Int = this.author.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var2: Int;
      if (this.type == null) {
         var2 = 0;
      } else {
         var2 = this.type.hashCode();
      }

      val var3: Int;
      if (this.channelType == null) {
         var3 = 0;
      } else {
         var3 = this.channelType.hashCode();
      }

      val var4: Int;
      if (this.channelName == null) {
         var4 = 0;
      } else {
         var4 = this.channelName.hashCode();
      }

      if (this.guildName != null) {
         var5 = this.guildName.hashCode();
      }

      return ((((((var7 * 31 + var8) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var9: java.lang.String = MessageId.toString-impl(this.id);
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: DirectReplyUser = this.author;
      val var7: java.lang.String = this.content;
      val var2: Int = this.type;
      val var8: Int = this.channelType;
      val var5: java.lang.String = this.channelName;
      val var1: java.lang.String = this.guildName;
      val var6: StringBuilder = new StringBuilder();
      var6.append("DirectReplyMessage(id=");
      var6.append(var9);
      var6.append(", channelId=");
      var6.append(var3);
      var6.append(", author=");
      var6.append(var4);
      var6.append(", content=");
      var6.append(var7);
      var6.append(", type=");
      var6.append(var2);
      var6.append(", channelType=");
      var6.append(var8);
      var6.append(", channelName=");
      var6.append(var5);
      var6.append(", guildName=");
      var6.append(var1);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      private final val json: Json

      public fun serializer(): KSerializer<DirectReplyMessage> {
         return DirectReplyMessage.$serializer.INSTANCE;
      }

      public fun toNotificationData(data: String): NotificationData {
         q.h(var1, "data");
         val var6: Json = DirectReplyMessage.access$getJson$cp();
         var6.a();
         val var12: DirectReplyMessage = var6.b(DirectReplyMessage.Companion.serializer(), var1) as DirectReplyMessage;
         val var7: java.lang.String = var12.getId-3Eiw7ao();
         val var9: Int = var12.getType();
         val var8: java.lang.String = var12.getContent();
         val var2: Long = var12.getChannelId-o4g7jtM();
         val var11: Int = var12.getChannelType();
         val var10: java.util.List = i.k();
         val var4: Long = var12.getAuthor().getId-re6GcUE();
         val var16: java.lang.String = var12.getAuthor().getUsername();
         var1 = var16;
         if (var16 == null) {
            var1 = "";
         }

         val var17: java.lang.String = var12.getAuthor().getDiscriminator();
         val var18: Int;
         if (var17 != null) {
            var18 = h.m(var17);
         } else {
            var18 = null;
         }

         return new NotificationData(
            "MESSAGE_CREATE",
            var7,
            null,
            null,
            var9,
            var8,
            null,
            var11,
            var12.getChannelName(),
            ChannelId.box-impl(var2),
            null,
            null,
            null,
            null,
            null,
            var10,
            UserId.box-impl(var4),
            var1,
            null,
            var18,
            var12.getAuthor().getAvatar(),
            null,
            null,
            null,
            null,
            var12.getGuildName(),
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            true,
            true,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            false,
            null,
            false,
            null,
            null,
            null,
            null,
            null,
            -35357620,
            16777167,
            null
         );
      }
   }
}
