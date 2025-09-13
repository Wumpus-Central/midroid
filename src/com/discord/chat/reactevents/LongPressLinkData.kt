package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import pc.m

@m
public data class LongPressLinkData(url: String?) : ReactEvent {
   public final val url: String?

   init {
      super();
      this.url = var1;
   }

   public operator fun component1(): String? {
      return this.url;
   }

   public fun copy(url: String? = var0.url): LongPressLinkData {
      return new LongPressLinkData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressLinkData) {
         return false;
      } else {
         return this.url == (var1 as LongPressLinkData).url;
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.url == null) {
         var1 = 0;
      } else {
         var1 = this.url.hashCode();
      }

      return var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.url;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LongPressLinkData(url=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressLinkData> {
         return LongPressLinkData.$serializer.INSTANCE;
      }
   }
}
