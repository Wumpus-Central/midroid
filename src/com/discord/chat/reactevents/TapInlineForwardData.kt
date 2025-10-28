package com.discord.chat.reactevents

import Ja.v
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlinx.serialization.KSerializer
import wc.m

@m
public class TapInlineForwardData(channelId: String, messageId: String, targetKind: String, embedIndex: Int?, triggerHaptic: Boolean?, location: String?) :
   ReactEvent {
   private final val channelId: String
   private final val messageId: String
   private final val targetKind: String
   private final val embedIndex: Int?
   private final val triggerHaptic: Boolean?
   private final val location: String?

   init {
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.targetKind = var3;
      this.embedIndex = var4;
      this.triggerHaptic = var5;
      this.location = var6;
   }

   public open fun serialize(): WritableMap {
      val var2: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            v.a("channelId", this.channelId),
            v.a("messageId", this.messageId),
            v.a("targetKind", this.targetKind),
            v.a("triggerHaptic", this.triggerHaptic),
            v.a("location", this.location)
         }
      );
      if (this.embedIndex != null) {
         NativeMapExtensionsKt.put(var2, "embedIndex", this.embedIndex);
      }

      return var2;
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineForwardData> {
         return TapInlineForwardData.$serializer.INSTANCE;
      }
   }
}
