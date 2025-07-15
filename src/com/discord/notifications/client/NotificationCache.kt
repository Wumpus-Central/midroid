package com.discord.notifications.client

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.r

internal class NotificationCache {
   private final lateinit var cache: SharedPreferences

   private final val cache: SharedPreferences
      private final get() {
         if (this.cache == null) {
            this.cache = var1.getSharedPreferences("DiscordNotificationClient", 0);
         }

         var var3: SharedPreferences = this.cache;
         if (this.cache == null) {
            r.y("cache");
            var3 = null;
         }

         return var3;
      }


   public fun getBackgroundSyncRan(context: Context): Long {
      r.h(var1, "context");
      return this.getCache(var1).getLong("CACHE_KEY_LAST_BACKGROUND_SYNC_RAN", 0L);
   }

   public fun getCurrentUserId(context: Context): String? {
      r.h(var1, "context");
      return this.getCache(var1).getString("CACHE_KEY_CURRENT_USER_ID", null);
   }

   public fun getCurrentUsername(context: Context): String? {
      r.h(var1, "context");
      return this.getCache(var1).getString("CACHE_KEY_CURRENT_USERNAME", null);
   }

   public fun isAuthed(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_AUTHED", false);
   }

   public fun isFullscreenCallUIEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_FULLSCREEN_CALL_UI_ENABLED", false);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_LIGHTS_ENABLED", true);
   }

   public fun isMissedCallNotificationsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_MISSED_CALL_NOTIFICATIONS_ENABLED", false);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_SOUNDS_ENABLED", true);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_VIBRATIONS_ENABLED", true);
   }

   public fun setBackgroundSyncRan(context: Context) {
      r.h(var1, "context");
      val var2: Editor = this.getCache(var1).edit();
      var2.putLong("CACHE_KEY_LAST_BACKGROUND_SYNC_RAN", System.currentTimeMillis());
      var2.apply();
   }

   public fun setCurrentUserId(context: Context, userId: String?) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putString("CACHE_KEY_CURRENT_USER_ID", var2);
      var3.apply();
   }

   public fun setCurrentUsername(context: Context, username: String?) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putString("CACHE_KEY_CURRENT_USERNAME", var2);
      var3.apply();
   }

   public fun setFullscreenCallUIEnabled(context: Context, enabled: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_FULLSCREEN_CALL_UI_ENABLED", var2);
      var3.apply();
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_AUTHED", var2);
      var3.apply();
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_LIGHTS_ENABLED", var2);
      var3.apply();
   }

   public fun setMissedCallNotificationsEnabled(context: Context, enabled: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_MISSED_CALL_NOTIFICATIONS_ENABLED", var2);
      var3.apply();
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_NOTIFY_EVERY_TIME", var2);
      var3.apply();
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_SOUNDS_ENABLED", var2);
      var3.apply();
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_VIBRATIONS_ENABLED", var2);
      var3.apply();
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_NOTIFY_EVERY_TIME", false);
   }

   public companion object {
      private const val CACHE_KEY: String
      private const val CACHE_KEY_AUTHED: String
      private const val CACHE_KEY_SOUNDS_ENABLED: String
      private const val CACHE_KEY_VIBRATIONS_ENABLED: String
      private const val CACHE_KEY_LIGHTS_ENABLED: String
      private const val CACHE_KEY_CURRENT_USERNAME: String
      private const val CACHE_KEY_CURRENT_USER_ID: String
      private const val CACHE_KEY_NOTIFY_EVERY_TIME: String
      private const val CACHE_KEY_LAST_BACKGROUND_SYNC_RAN: String
      private const val CACHE_KEY_MISSED_CALL_NOTIFICATIONS_ENABLED: String
      private const val CACHE_KEY_FULLSCREEN_CALL_UI_ENABLED: String
   }
}
