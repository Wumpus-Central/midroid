package com.discord.tti_manager

import android.app.Application

public abstract class TTILoggingApplication : Application {
   open fun TTILoggingApplication() {
      TTILoggingApplication.Companion.access$setApplicationStartedTimestamp(Companion, System.currentTimeMillis());
   }

   public abstract fun initialize() {
   }

   public open fun onCreate() {
      super.onCreate();
      this.initialize();
      TTILoggingApplication.Companion.access$setApplicationInitializeTimestamp(Companion, System.currentTimeMillis());
   }

   public companion object {
      private final var applicationInitializeTimestamp: Long
         private final get() {
            return (TTILoggingApplication.access$getApplicationInitializeTimestamp$delegate$cp().getValue(this, $$delegatedProperties[2]) as java.lang.Number)
               .longValue();
         }

         private final set(<set-?>) {
            TTILoggingApplication.access$getApplicationInitializeTimestamp$delegate$cp().setValue(this, $$delegatedProperties[2], var1);
         }


      private final var applicationOpenedTimestampExcludingActivityLaunchGap: Long
         private final get() {
            return (TTILoggingApplication.access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp().getValue(this, $$delegatedProperties[0]) as java.lang.Number)
               .longValue();
         }

         private final set(<set-?>) {
            TTILoggingApplication.access$getApplicationOpenedTimestampExcludingActivityLaunchGap$delegate$cp().setValue(this, $$delegatedProperties[0], var1);
         }


      private final var applicationStartedTimestamp: Long
         private final get() {
            return (TTILoggingApplication.access$getApplicationStartedTimestamp$delegate$cp().getValue(this, $$delegatedProperties[1]) as java.lang.Number)
               .longValue();
         }

         private final set(<set-?>) {
            TTILoggingApplication.access$getApplicationStartedTimestamp$delegate$cp().setValue(this, $$delegatedProperties[1], var1);
         }


      internal fun getAppOpenedTimestamp(): Long {
         return this.getApplicationOpenedTimestampExcludingActivityLaunchGap();
      }

      public fun trackActivityDelegateInitialized() {
         this.setApplicationOpenedTimestampExcludingActivityLaunchGap(
            System.currentTimeMillis() - (this.getApplicationInitializeTimestamp() - this.getApplicationStartedTimestamp())
         );
      }
   }
}
