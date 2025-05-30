package com.discord.media.react.events

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class CompressionProgressEvent(uri: String, progress: Int) : ReactEvent {
   public final val uri: String
   public final val progress: Int

   init {
      q.h(var1, "uri");
      super();
      this.uri = var1;
      this.progress = var2;
   }

   public operator fun component1(): String {
      return this.uri;
   }

   public operator fun component2(): Int {
      return this.progress;
   }

   public fun copy(uri: String = var0.uri, progress: Int = var0.progress): CompressionProgressEvent {
      q.h(var1, "uri");
      return new CompressionProgressEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CompressionProgressEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.uri, var1.uri)) {
            return false;
         } else {
            return this.progress == var1.progress;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uri.hashCode() * 31 + Integer.hashCode(this.progress);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.uri;
      val var1: Int = this.progress;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CompressionProgressEvent(uri=");
      var2.append(var3);
      var2.append(", progress=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CompressionProgressEvent> {
         return CompressionProgressEvent.$serializer.INSTANCE;
      }
   }
}
