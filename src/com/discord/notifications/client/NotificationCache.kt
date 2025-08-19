package com.discord.notifications.client

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nNotificationCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCache.kt\ncom/discord/notifications/client/NotificationCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,88:1\n41#2,12:89\n41#2,12:101\n41#2,12:113\n41#2,12:125\n41#2,12:137\n41#2,12:149\n41#2,12:161\n41#2,12:173\n*S KotlinDebug\n*F\n+ 1 NotificationCache.kt\ncom/discord/notifications/client/NotificationCache\n*L\n20#1:89,12\n27#1:101,12\n31#1:113,12\n41#1:125,12\n47#1:137,12\n56#1:149,12\n65#1:161,12\n72#1:173,12\n*E\n"])
internal class NotificationCache {
   private final lateinit var cache: SharedPreferences

   private final val cache: SharedPreferences
      private final get() {
         if (this.cache == null) {
            this.cache = var1.getSharedPreferences("DiscordNotificationClient", 0);
         }

         var var3: SharedPreferences = this.cache;
         if (this.cache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cache");
            var3 = null;
         }

         return var3;
      }


   public fun getBackgroundSyncRan(context: Context): Long {
      return this.getCache(var1).getLong("CACHE_KEY_LAST_BACKGROUND_SYNC_RAN", 0L);
   }

   public fun getCurrentUserId(context: Context): String? {
      return this.getCache(var1).getString("CACHE_KEY_CURRENT_USER_ID", null);
   }

   public fun getCurrentUsername(context: Context): String? {
      return this.getCache(var1).getString("CACHE_KEY_CURRENT_USERNAME", null);
   }

   public fun isAuthed(context: Context): Boolean {
      return this.getCache(var1).getBoolean("CACHE_KEY_AUTHED", false);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      return this.getCache(var1).getBoolean("CACHE_KEY_LIGHTS_ENABLED", true);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      return this.getCache(var1).getBoolean("CACHE_KEY_SOUNDS_ENABLED", true);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      return this.getCache(var1).getBoolean("CACHE_KEY_VIBRATIONS_ENABLED", true);
   }

   public fun setBackgroundSyncRan(context: Context) {
      val var2: Editor = this.getCache(var1).edit();
      var2.putLong("CACHE_KEY_LAST_BACKGROUND_SYNC_RAN", System.currentTimeMillis());
      var2.apply();
   }

   public fun setCurrentUserId(context: Context, userId: String?) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putString("CACHE_KEY_CURRENT_USER_ID", var2);
      var3.apply();
   }

   public fun setCurrentUsername(context: Context, username: String?) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putString("CACHE_KEY_CURRENT_USERNAME", var2);
      var3.apply();
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_AUTHED", var2);
      var3.apply();
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_LIGHTS_ENABLED", var2);
      var3.apply();
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_NOTIFY_EVERY_TIME", var2);
      var3.apply();
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_SOUNDS_ENABLED", var2);
      var3.apply();
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_VIBRATIONS_ENABLED", var2);
      var3.apply();
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
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
   }
}
