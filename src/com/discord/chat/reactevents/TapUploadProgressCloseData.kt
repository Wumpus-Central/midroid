package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class TapUploadProgressCloseData(fileId: String) : ReactEvent {
   public final val fileId: String

   init {
      q.h(var1, "fileId");
      super();
      this.fileId = var1;
   }

   public operator fun component1(): String {
      return this.fileId;
   }

   public fun copy(fileId: String = var0.fileId): TapUploadProgressCloseData {
      q.h(var1, "fileId");
      return new TapUploadProgressCloseData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapUploadProgressCloseData) {
         return false;
      } else {
         return q.c(this.fileId, (var1 as TapUploadProgressCloseData).fileId);
      }
   }

   public override fun hashCode(): Int {
      return this.fileId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.fileId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapUploadProgressCloseData(fileId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapUploadProgressCloseData> {
         return TapUploadProgressCloseData.$serializer.INSTANCE;
      }
   }
}
