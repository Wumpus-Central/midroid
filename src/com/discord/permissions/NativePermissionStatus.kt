package com.discord.permissions

import com.facebook.react.bridge.ReadableNativeMap
import java.util.Locale
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

public enum class NativePermissionStatus {
   AUTHORIZED,
   DENIED,
   RESTRICTED,
   UNDETERMINED   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private NativePermissionStatus[] $VALUES;
   @JvmStatic
   private java.lang.String ANDROID_PERMISSION_DENIED = "denied";
   @JvmStatic
   private java.lang.String ANDROID_PERMISSION_GRANTED = "granted";
   @JvmStatic
   private java.lang.String ANDROID_PERMISSION_NEVER_ASK_AGAIN = "never_ask_again";
   @JvmStatic
   public NativePermissionStatus.Companion Companion = new NativePermissionStatus.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<NativePermissionStatus> = $values();
      $VALUES = var0;
      $ENTRIES = rh.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      private const val ANDROID_PERMISSION_DENIED: String
      private const val ANDROID_PERMISSION_GRANTED: String
      private const val ANDROID_PERMISSION_NEVER_ASK_AGAIN: String

      public fun fromAndroidAuthorizationStatus(value: Any?): String {
         if (q.c(var1, java.lang.Boolean.TRUE)) {
            var1 = "AUTHORIZED".toLowerCase(Locale.ROOT);
            q.g(var1, "toLowerCase(...)");
         } else {
            if (!q.c(var1, java.lang.Boolean.FALSE)) {
               val var2: StringBuilder = new StringBuilder();
               var2.append("Unknown authorization result: ");
               var2.append((Object)var1);
               throw new IllegalStateException(var2.toString().toString());
            }

            var1 = "DENIED".toLowerCase(Locale.ROOT);
            q.g(var1, "toLowerCase(...)");
         }

         return var1;
      }

      public fun fromAndroidPermissionStatus(value: Any?): String {
         val var2: java.lang.String;
         if (var1 is java.lang.String) {
            var2 = var1;
         } else {
            if (var1 !is ReadableNativeMap) {
               val var5: StringBuilder = new StringBuilder();
               var5.append("Unknown authorization result: ");
               var5.append((Object)var1);
               throw new IllegalStateException(var5.toString().toString());
            }

            var2 = (var1 as ReadableNativeMap).toString();
         }

         if (h.M(var2, "granted", false, 2, null)) {
            var1 = "AUTHORIZED".toLowerCase(Locale.ROOT);
            q.g(var1, "toLowerCase(...)");
         } else if (h.M(var2, "denied", false, 2, null)) {
            var1 = "DENIED".toLowerCase(Locale.ROOT);
            q.g(var1, "toLowerCase(...)");
         } else {
            if (!h.M(var2, "never_ask_again", false, 2, null)) {
               val var4: StringBuilder = new StringBuilder();
               var4.append("Unknown authorization result: ");
               var4.append((Object)var1);
               throw new IllegalStateException(var4.toString().toString());
            }

            var1 = "DENIED".toLowerCase(Locale.ROOT);
            q.g(var1, "toLowerCase(...)");
         }

         return var1;
      }
   }
}
