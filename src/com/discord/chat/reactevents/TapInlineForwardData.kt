package com.discord.chat.reactevents

import A9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public class TapInlineForwardData(channelId: String, messageId: String, targetKind: String, embedIndex: Int?, triggerHaptic: Boolean?, location: String?) :
   ReactEvent {
   private final val channelId: String
   private final val messageId: String
   private final val targetKind: String
   private final val embedIndex: Int?
   private final val triggerHaptic: Boolean?
   private final val location: String?

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "targetKind");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.targetKind = var3;
      this.embedIndex = var4;
      this.triggerHaptic = var5;
      this.location = var6;
   }

   public override fun serialize(): WritableMap {
      val var2: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(
         s.a("channelId", this.channelId),
         s.a("messageId", this.messageId),
         s.a("targetKind", this.targetKind),
         s.a("triggerHaptic", this.triggerHaptic),
         s.a("location", this.location)
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
