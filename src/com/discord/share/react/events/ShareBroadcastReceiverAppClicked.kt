package com.discord.share.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
internal data class ShareBroadcastReceiverAppClicked(app: String, location: String?) : ReactEvent {
   public final val app: String
   public final val location: String?

   init {
      r.h(var1, "app");
      super();
      this.app = var1;
      this.location = var2;
   }

   public operator fun component1(): String {
      return this.app;
   }

   public operator fun component2(): String? {
      return this.location;
   }

   public fun copy(app: String = var0.app, location: String? = var0.location): ShareBroadcastReceiverAppClicked {
      r.h(var1, "app");
      return new ShareBroadcastReceiverAppClicked(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShareBroadcastReceiverAppClicked) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.app, var1.app)) {
            return false;
         } else {
            return r.c(this.location, var1.location);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.app.hashCode();
      val var1: Int;
      if (this.location == null) {
         var1 = 0;
      } else {
         var1 = this.location.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.app;
      val var3: java.lang.String = this.location;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ShareBroadcastReceiverAppClicked(app=");
      var1.append(var2);
      var1.append(", location=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ShareBroadcastReceiverAppClicked> {
         return ShareBroadcastReceiverAppClicked.$serializer.INSTANCE;
      }
   }
}
