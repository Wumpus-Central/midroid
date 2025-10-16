package com.discord.tti_manager.react

import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReactMarker
import com.facebook.react.bridge.ReactMarkerConstants
import com.facebook.react.bridge.ReactMarker.MarkerListener
import kotlin.properties.a

public object ReactMarkerListener : MarkerListener {
   public final var bundleStartedTimestamp: Long by a.a.a()
      public final get() {
         return (bundleStartedTimestamp$delegate.getValue(this, $$delegatedProperties[0]) as java.lang.Number).longValue();
      }

      public final set(<set-?>) {
         bundleStartedTimestamp$delegate.setValue(this, $$delegatedProperties[0], var1);
      }


   public final var bundleLoadedTimestamp: Long
      public final get() {
         return (bundleLoadedTimestamp$delegate.getValue(this, $$delegatedProperties[1]) as java.lang.Number).longValue();
      }

      public final set(<set-?>) {
         bundleLoadedTimestamp$delegate.setValue(this, $$delegatedProperties[1], var1);
      }


   public final var bundleParsedTimestamp: Long
      public final get() {
         return (bundleParsedTimestamp$delegate.getValue(this, $$delegatedProperties[2]) as java.lang.Number).longValue();
      }

      public final set(<set-?>) {
         bundleParsedTimestamp$delegate.setValue(this, $$delegatedProperties[2], var1);
      }


   public final var stopped: Boolean = true
      internal set

   @JvmStatic
   fun {
      val var0: a = a.a;
      bundleLoadedTimestamp$delegate = var0.a();
      bundleParsedTimestamp$delegate = var0.a();
   }

   public open fun logMarker(marker: ReactMarkerConstants, tag: String?, instanceKey: Int) {
      val var4: Long = System.currentTimeMillis();
      val var6: java.lang.String = var1.name();
      TTIMetrics.INSTANCE.record(var6, var4, var2, true);
      switch (var6.hashCode()) {
         case -1775741598:
            if (!var6.equals("REACT_BRIDGELESS_LOADING_START")) {
               return;
            }
            break;
         case -1048597525:
            if (!var6.equals("PRE_RUN_JS_BUNDLE_START")) {
               return;
            }
            break;
         case -351240678:
            if (var6.equals("CONTENT_APPEARED")) {
               this.stop();
            }

            return;
         case 241900896:
            if (var6.equals("RUN_JS_BUNDLE_END")) {
               this.setBundleParsedTimestamp(var4);
            }

            return;
         case 551634855:
            if (var6.equals("RUN_JS_BUNDLE_START")) {
               this.setBundleLoadedTimestamp(var4);
            }

            return;
         default:
            return;
      }

      this.setBundleStartedTimestamp(var4);
      this.setBundleLoadedTimestamp(var4);
      this.setBundleParsedTimestamp(var4);
   }

   public fun start() {
      if (stopped) {
         ReactMarker.addListener(this);
         stopped = false;
      }
   }

   public fun stop() {
      if (!stopped) {
         ReactMarker.removeListener(this);
         stopped = true;
      }
   }
}
