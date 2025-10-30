package com.discord.permissions

import com.facebook.react.bridge.ReadableNativeMap
import java.util.Locale
import kotlin.enums.EnumEntries

public enum class NativePermissionStatus {
   AUTHORIZED,
   DENIED,
   LIMITED,
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
      $ENTRIES = lm.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      private const val ANDROID_PERMISSION_GRANTED: String
      private const val ANDROID_PERMISSION_DENIED: String
      private const val ANDROID_PERMISSION_NEVER_ASK_AGAIN: String

      public fun fromAndroidAuthorizationStatus(value: Any?): String {
         if (var1 == java.lang.Boolean.TRUE) {
            var1 = "AUTHORIZED".toLowerCase(Locale.ROOT);
            return var1;
         } else if (var1 == java.lang.Boolean.FALSE) {
            var1 = "DENIED".toLowerCase(Locale.ROOT);
            return var1;
         } else {
            val var2: StringBuilder = new StringBuilder();
            var2.append("Unknown authorization result: ");
            var2.append((Object)var1);
            throw new IllegalStateException(var2.toString().toString());
         }
      }

      public fun fromAndroidPermissionStatus(value: Any?): String {
         val var2: java.lang.String;
         if (var1 is java.lang.String) {
            var2 = var1;
         } else {
            if (var1 !is ReadableNativeMap) {
               val var7: StringBuilder = new StringBuilder();
               var7.append("Unknown authorization result: ");
               var7.append((Object)var1);
               throw new IllegalStateException(var7.toString().toString());
            }

            var2 = (var1 as ReadableNativeMap).toString();
         }

         if (StringsKt.N(var2, "granted", false, 2, null)) {
            var1 = "AUTHORIZED".toLowerCase(Locale.ROOT);
            return var1;
         } else if (StringsKt.N(var2, "denied", false, 2, null)) {
            var1 = "DENIED".toLowerCase(Locale.ROOT);
            return var1;
         } else if (StringsKt.N(var2, "never_ask_again", false, 2, null)) {
            var1 = "DENIED".toLowerCase(Locale.ROOT);
            return var1;
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append("Unknown authorization result: ");
            var6.append((Object)var1);
            throw new IllegalStateException(var6.toString().toString());
         }
      }
   }
}
