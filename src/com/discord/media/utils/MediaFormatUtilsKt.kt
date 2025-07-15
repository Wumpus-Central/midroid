package com.discord.media.utils

import android.media.MediaFormat
import kotlin.jvm.internal.r

public final val mimeType: String?
   public final get() {
      r.h(var0, "<this>");

      label16:
      try {
         val var1: kotlin.Result.a = Result.k;
         var5 = Result.b(var0.getString("mime"));
      } catch (var2: java.lang.Throwable) {
         val var4: kotlin.Result.a = Result.k;
         var5 = Result.b(kotlin.c.a(var2));
         break label16;
      }

      var var6: Any = var5;
      if (Result.g(var5)) {
         var6 = null;
      }

      return var6 as java.lang.String;
   }


public final val codecType: String?
   public final get() {
      r.h(var0, "<this>");
      val var1: java.lang.String = getMimeType(var0);
      if (var1 != null) {
         switch (var1.hashCode()) {
            case -1851077871:
               if (var1.equals("video/dolby-vision")) {
                  return "dvh1";
               }
               break;
            case -1664118616:
               if (var1.equals("video/3gpp")) {
                  return "h263";
               }
               break;
            case -1662735862:
               if (var1.equals("video/av01")) {
                  return "av01";
               }
               break;
            case -1662541442:
               if (var1.equals("video/hevc")) {
                  return "hvc1";
               }
               break;
            case 5751993:
               if (var1.equals("video/mpeg2")) {
                  return "mp2v";
               }
               break;
            case 1187890754:
               if (var1.equals("video/mp4v-es")) {
                  return "mp4v";
               }
               break;
            case 1331836730:
               if (var1.equals("video/avc")) {
                  return "avc1";
               }
               break;
            case 1599127256:
               if (var1.equals("video/x-vnd.on2.vp8")) {
                  return "vp08";
               }
               break;
            case 1599127257:
               if (var1.equals("video/x-vnd.on2.vp9")) {
                  return "vp09";
               }
            default:
         }
      }

      return null;
   }


public final val profile: Int?
   public final get() {
      r.h(var0, "<this>");

      label16:
      try {
         val var1: kotlin.Result.a = Result.k;
         var5 = Result.b(var0.getInteger("profile"));
      } catch (var2: java.lang.Throwable) {
         val var4: kotlin.Result.a = Result.k;
         var5 = Result.b(kotlin.c.a(var2));
         break label16;
      }

      var var6: Any = var5;
      if (Result.g(var5)) {
         var6 = null;
      }

      return var6 as Int;
   }


public final val level: Int?
   public final get() {
      r.h(var0, "<this>");

      label16:
      try {
         val var5: kotlin.Result.a = Result.k;
         var4 = Result.b(var0.getInteger("level"));
      } catch (var2: java.lang.Throwable) {
         val var1: kotlin.Result.a = Result.k;
         var4 = Result.b(kotlin.c.a(var2));
         break label16;
      }

      var var6: Any = var4;
      if (Result.g(var4)) {
         var6 = null;
      }

      return var6 as Int;
   }


public final val profileName: String?
   public final get() {
      r.h(var0, "<this>");
      val var3: java.lang.String = getMimeType(var0);
      if (r.c(var3, "video/avc")) {
         val var6: Int = getProfile(var0);
         if (var6 != null && var6 == 1) {
            return "baseline";
         }

         if (var6 == null || var6 != 2) {
            if (var6 != null && var6 == 4) {
               return "extended";
            }

            if (var6 != null && var6 == 8) {
               return "high";
            }

            val var12: java.lang.String;
            if (var6 == null) {
               var12 = "other";
            } else {
               var12 = "other";
               if (var6 == 16) {
                  return "high10";
               }
            }

            return var12;
         }
      } else {
         if (!r.c(var3, "video/hevc")) {
            return null;
         }

         val var5: Int = getProfile(var0);
         if (var5 == null || var5 != 1) {
            if (var5 != null && var5 == 2) {
               return "main10";
            }

            if (var5 != null && var5 == 4) {
               return "mainstill";
            }

            if (var5 != null && var5 == 4096) {
               return "main10hdr";
            }

            val var4: java.lang.String;
            if (var5 == null) {
               var4 = "other";
            } else {
               var4 = "other";
               if (var5 == 8192) {
                  return "main10hdrplus";
               }
            }

            return var4;
         }
      }

      return "main";
   }


public fun MediaFormat.isHevcVideo(): Boolean {
   r.h(var0, "<this>");
   return r.c(getMimeType(var0), "video/hevc");
}
