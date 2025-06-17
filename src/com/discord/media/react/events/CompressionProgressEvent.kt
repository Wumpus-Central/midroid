package com.discord.media.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

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
      val var2: java.lang.String = this.uri;
      val var1: Int = this.progress;
      val var3: StringBuilder = new StringBuilder();
      var3.append("CompressionProgressEvent(uri=");
      var3.append(var2);
      var3.append(", progress=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CompressionProgressEvent> {
         return CompressionProgressEvent.$serializer.INSTANCE;
      }
   }
}
