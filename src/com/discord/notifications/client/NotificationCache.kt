package com.discord.notifications.client

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.q

internal class NotificationCache {
   private final lateinit var cache: SharedPreferences

   private final val cache: SharedPreferences
      private final get() {
         if (this.cache == null) {
            val var3: SharedPreferences = var1.getSharedPreferences("DiscordNotificationClient", 0);
            q.g(var3, "getSharedPreferences(...)");
            this.cache = var3;
         }

         var var4: SharedPreferences = this.cache;
         if (this.cache == null) {
            q.y("cache");
            var4 = null;
         }

         return var4;
      }


   public fun getBackgroundSyncRan(context: Context): Long {
      q.h(var1, "context");
      return this.getCache(var1).getLong("CACHE_KEY_LAST_BACKGROUND_SYNC_RAN", 0L);
   }

   public fun getCurrentUserId(context: Context): String? {
      q.h(var1, "context");
      return this.getCache(var1).getString("CACHE_KEY_CURRENT_USER_ID", null);
   }

   public fun getCurrentUsername(context: Context): String? {
      q.h(var1, "context");
      return this.getCache(var1).getString("CACHE_KEY_CURRENT_USERNAME", null);
   }

   public fun isAuthed(context: Context): Boolean {
      q.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_AUTHED", false);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      q.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_LIGHTS_ENABLED", true);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      q.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_SOUNDS_ENABLED", true);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      q.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_VIBRATIONS_ENABLED", true);
   }

   public fun setBackgroundSyncRan(context: Context) {
      q.h(var1, "context");
      val var2: Editor = this.getCache(var1).edit();
      var2.putLong("CACHE_KEY_LAST_BACKGROUND_SYNC_RAN", System.currentTimeMillis());
      var2.apply();
   }

   public fun setCurrentUserId(context: Context, userId: String?) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putString("CACHE_KEY_CURRENT_USER_ID", var2);
      var3.apply();
   }

   public fun setCurrentUsername(context: Context, username: String?) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putString("CACHE_KEY_CURRENT_USERNAME", var2);
      var3.apply();
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_AUTHED", var2);
      var3.apply();
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_LIGHTS_ENABLED", var2);
      var3.apply();
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_NOTIFY_EVERY_TIME", var2);
      var3.apply();
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_SOUNDS_ENABLED", var2);
      var3.apply();
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      q.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_VIBRATIONS_ENABLED", var2);
      var3.apply();
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      q.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_NOTIFY_EVERY_TIME", false);
   }

   public companion object {
      private const val CACHE_KEY: String
      private const val CACHE_KEY_AUTHED: String
      private const val CACHE_KEY_CURRENT_USERNAME: String
      private const val CACHE_KEY_CURRENT_USER_ID: String
      private const val CACHE_KEY_LAST_BACKGROUND_SYNC_RAN: String
      private const val CACHE_KEY_LIGHTS_ENABLED: String
      private const val CACHE_KEY_NOTIFY_EVERY_TIME: String
      private const val CACHE_KEY_SOUNDS_ENABLED: String
      private const val CACHE_KEY_VIBRATIONS_ENABLED: String
   }
}
