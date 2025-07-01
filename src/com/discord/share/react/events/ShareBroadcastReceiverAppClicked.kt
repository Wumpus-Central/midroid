package com.discord.share.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import tb.f

@f
internal data class ShareBroadcastReceiverAppClicked(app: String, location: String?) : ReactEvent {
   public final val app: String
   public final val location: String?

   init {
      q.h(var1, "app");
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
      q.h(var1, "app");
      return new ShareBroadcastReceiverAppClicked(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShareBroadcastReceiverAppClicked) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.app, var1.app)) {
            return false;
         } else {
            return q.c(this.location, var1.location);
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
      val var1: java.lang.String = this.app;
      val var2: java.lang.String = this.location;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ShareBroadcastReceiverAppClicked(app=");
      var3.append(var1);
      var3.append(", location=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ShareBroadcastReceiverAppClicked> {
         return ShareBroadcastReceiverAppClicked.$serializer.INSTANCE;
      }
   }
}
