package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import wc.m

@m
internal data class LongPressMessageEvent(messageId: String,
      channelId: String,
      mediaIndex: Int,
      mediaType: String,
      componentId: String?,
      componentMediaIndex: Int?
   ) :
   ReactEvent {
   public final val messageId: String
   public final val channelId: String
   public final val mediaIndex: Int
   public final val mediaType: String
   public final val componentId: String?
   public final val componentMediaIndex: Int?

   init {
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.mediaIndex = var3;
      this.mediaType = var4;
      this.componentId = var5;
      this.componentMediaIndex = var6;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): Int {
      return this.mediaIndex;
   }

   public operator fun component4(): String {
      return this.mediaType;
   }

   public operator fun component5(): String? {
      return this.componentId;
   }

   public operator fun component6(): Int? {
      return this.componentMediaIndex;
   }

   public fun copy(
      messageId: String = var0.messageId,
      channelId: String = var0.channelId,
      mediaIndex: Int = var0.mediaIndex,
      mediaType: String = var0.mediaType,
      componentId: String? = var0.componentId,
      componentMediaIndex: Int? = var0.componentMediaIndex
   ): LongPressMessageEvent {
      return new LongPressMessageEvent(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressMessageEvent) {
         return false;
      } else {
         var1 = var1;
         if (!(this.messageId == var1.messageId)) {
            return false;
         } else if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (this.mediaIndex != var1.mediaIndex) {
            return false;
         } else if (!(this.mediaType == var1.mediaType)) {
            return false;
         } else if (!(this.componentId == var1.componentId)) {
            return false;
         } else {
            return this.componentMediaIndex == var1.componentMediaIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.messageId.hashCode();
      val var4: Int = this.channelId.hashCode();
      val var5: Int = Integer.hashCode(this.mediaIndex);
      val var3: Int = this.mediaType.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.componentId == null) {
         var1 = 0;
      } else {
         var1 = this.componentId.hashCode();
      }

      if (this.componentMediaIndex != null) {
         var2 = this.componentMediaIndex.hashCode();
      }

      return ((((var6 * 31 + var4) * 31 + var5) * 31 + var3) * 31 + var1) * 31 + var2;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var7: java.lang.String = this.messageId;
      val var4: java.lang.String = this.channelId;
      val var1: Int = this.mediaIndex;
      val var2: java.lang.String = this.mediaType;
      val var3: java.lang.String = this.componentId;
      val var5: Int = this.componentMediaIndex;
      val var6: StringBuilder = new StringBuilder();
      var6.append("LongPressMessageEvent(messageId=");
      var6.append(var7);
      var6.append(", channelId=");
      var6.append(var4);
      var6.append(", mediaIndex=");
      var6.append(var1);
      var6.append(", mediaType=");
      var6.append(var2);
      var6.append(", componentId=");
      var6.append(var3);
      var6.append(", componentMediaIndex=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressMessageEvent> {
         return LongPressMessageEvent.$serializer.INSTANCE;
      }
   }
}
