package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public class TapForwardFooterData(snapshotIndex: Int, channelId: String, messageId: String) : ReactEvent {
   public final val snapshotIndex: Int
   public final val channelId: String
   public final val messageId: String

   init {
      r.h(var2, "channelId");
      r.h(var3, "messageId");
      super();
      this.snapshotIndex = var1;
      this.channelId = var2;
      this.messageId = var3;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public companion object {
      public fun serializer(): KSerializer<TapForwardFooterData> {
         return TapForwardFooterData.$serializer.INSTANCE;
      }
   }
}
