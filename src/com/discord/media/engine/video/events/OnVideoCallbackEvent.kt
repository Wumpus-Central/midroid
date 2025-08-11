package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class OnVideoCallbackEvent(connectionId: Int, userId: String, ssrc: Long, streamId: String, videoStreamParametersJSON: String) : ReactEvent {
   public final val connectionId: Int
   public final val userId: String
   public final val ssrc: Long
   public final val streamId: String
   public final val videoStreamParametersJSON: String

   init {
      r.h(var2, "userId");
      r.h(var5, "streamId");
      r.h(var6, "videoStreamParametersJSON");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.ssrc = var3;
      this.streamId = var5;
      this.videoStreamParametersJSON = var6;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.userId;
   }

   public operator fun component3(): Long {
      return this.ssrc;
   }

   public operator fun component4(): String {
      return this.streamId;
   }

   public operator fun component5(): String {
      return this.videoStreamParametersJSON;
   }

   public fun copy(
      connectionId: Int = var0.connectionId,
      userId: String = var0.userId,
      ssrc: Long = var0.ssrc,
      streamId: String = var0.streamId,
      videoStreamParametersJSON: String = var0.videoStreamParametersJSON
   ): OnVideoCallbackEvent {
      r.h(var2, "userId");
      r.h(var5, "streamId");
      r.h(var6, "videoStreamParametersJSON");
      return new OnVideoCallbackEvent(var1, var2, var3, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnVideoCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!r.c(this.userId, var1.userId)) {
            return false;
         } else if (this.ssrc != var1.ssrc) {
            return false;
         } else if (!r.c(this.streamId, var1.streamId)) {
            return false;
         } else {
            return r.c(this.videoStreamParametersJSON, var1.videoStreamParametersJSON);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((Integer.hashCode(this.connectionId) * 31 + this.userId.hashCode()) * 31 + java.lang.Long.hashCode(this.ssrc)) * 31 + this.streamId.hashCode())
            * 31
         + this.videoStreamParametersJSON.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var4: java.lang.String = this.userId;
      val var2: Long = this.ssrc;
      val var5: java.lang.String = this.streamId;
      val var7: java.lang.String = this.videoStreamParametersJSON;
      val var6: StringBuilder = new StringBuilder();
      var6.append("OnVideoCallbackEvent(connectionId=");
      var6.append(var1);
      var6.append(", userId=");
      var6.append(var4);
      var6.append(", ssrc=");
      var6.append(var2);
      var6.append(", streamId=");
      var6.append(var5);
      var6.append(", videoStreamParametersJSON=");
      var6.append(var7);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnVideoCallbackEvent> {
         return OnVideoCallbackEvent.$serializer.INSTANCE;
      }
   }
}
