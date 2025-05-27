package com.discord.bundle_updater.react.events

import Za.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal data class BundleDownloadedEvent(versionRequired: Boolean) : ReactEvent {
   public final val versionRequired: Boolean

   init {
      super();
      this.versionRequired = var1;
   }

   public operator fun component1(): Boolean {
      return this.versionRequired;
   }

   public fun copy(versionRequired: Boolean = var0.versionRequired): BundleDownloadedEvent {
      return new BundleDownloadedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BundleDownloadedEvent) {
         return false;
      } else {
         return this.versionRequired == (var1 as BundleDownloadedEvent).versionRequired;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.versionRequired);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.versionRequired;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BundleDownloadedEvent(versionRequired=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BundleDownloadedEvent> {
         return BundleDownloadedEvent.$serializer.INSTANCE;
      }
   }
}
