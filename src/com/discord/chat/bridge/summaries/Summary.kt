package com.discord.chat.bridge.summaries

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class Summary(id: String,
   topic: String,
   summShort: String,
   people: List<UserId>,
   startId: MessageId,
   endId: MessageId,
   count: Int,
   channelId: ChannelId
) : Summary(var1, var2, var3, var4, var5, var6, var7, var8) {
   public final val id: String
   public final val topic: String
   public final val summShort: String
   public final val people: List<UserId>
   public final val startId: MessageId
   public final val endId: MessageId
   public final val count: Int
   public final val channelId: ChannelId

   fun Summary(
      var1: java.lang.String,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: MutableList<UserId>,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: Int,
      var8: Long
   ) {
      r.h(var1, "id");
      r.h(var2, "topic");
      r.h(var3, "summShort");
      r.h(var4, "people");
      r.h(var5, "startId");
      r.h(var6, "endId");
      super();
      this.id = var1;
      this.topic = var2;
      this.summShort = var3;
      this.people = var4;
      this.startId = var5;
      this.endId = var6;
      this.count = var7;
      this.channelId = var8;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.topic;
   }

   public operator fun component3(): String {
      return this.summShort;
   }

   public operator fun component4(): List<UserId> {
      return this.people;
   }

   public operator fun component5(): MessageId {
      return this.startId;
   }

   public operator fun component6(): MessageId {
      return this.endId;
   }

   public operator fun component7(): Int {
      return this.count;
   }

   public operator fun component8(): ChannelId {
      return this.channelId;
   }

   public fun copy(
      id: String = ...,
      topic: String = ...,
      summShort: String = ...,
      people: List<UserId> = ...,
      startId: MessageId = ...,
      endId: MessageId = ...,
      count: Int = ...,
      channelId: ChannelId = ...
   ): Summary {
      r.h(var1, "id");
      r.h(var2, "topic");
      r.h(var3, "summShort");
      r.h(var4, "people");
      r.h(var5, "startId");
      r.h(var6, "endId");
      return new Summary(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Summary) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.topic, var1.topic)) {
            return false;
         } else if (!r.c(this.summShort, var1.summShort)) {
            return false;
         } else if (!r.c(this.people, var1.people)) {
            return false;
         } else if (!MessageId.equals-impl0(this.startId, var1.startId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.endId, var1.endId)) {
            return false;
         } else if (this.count != var1.count) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (((this.id.hashCode() * 31 + this.topic.hashCode()) * 31 + this.summShort.hashCode()) * 31 + this.people.hashCode()) * 31
                                    + MessageId.hashCode-impl(this.startId)
                              )
                              * 31
                           + MessageId.hashCode-impl(this.endId)
                     )
                     * 31
                  + Integer.hashCode(this.count)
            )
            * 31
         + ChannelId.hashCode-impl(this.channelId);
   }

   public override fun toString(): String {
      val var8: java.lang.String = this.id;
      val var4: java.lang.String = this.topic;
      val var3: java.lang.String = this.summShort;
      val var9: java.util.List = this.people;
      val var2: java.lang.String = MessageId.toString-impl(this.startId);
      val var7: java.lang.String = MessageId.toString-impl(this.endId);
      val var1: Int = this.count;
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var6: StringBuilder = new StringBuilder();
      var6.append("Summary(id=");
      var6.append(var8);
      var6.append(", topic=");
      var6.append(var4);
      var6.append(", summShort=");
      var6.append(var3);
      var6.append(", people=");
      var6.append(var9);
      var6.append(", startId=");
      var6.append(var2);
      var6.append(", endId=");
      var6.append(var7);
      var6.append(", count=");
      var6.append(var1);
      var6.append(", channelId=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Summary> {
         return Summary.$serializer.INSTANCE;
      }
   }
}
