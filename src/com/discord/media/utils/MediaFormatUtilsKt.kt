package com.discord.media.utils

import android.media.MediaFormat
import gh.r
import gh.s
import kotlin.jvm.internal.q

public final val codecType: String?
   public final get() {
      q.h(var0, "<this>");
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


public final val mimeType: String?
   public final get() {
      q.h(var0, "<this>");

      label16:
      try {
         val var1: gh.r.a = r.k;
         var5 = r.b(var0.getString("mime"));
      } catch (var2: java.lang.Throwable) {
         val var4: gh.r.a = r.k;
         var5 = r.b(s.a(var2));
         break label16;
      }

      var var6: Any = var5;
      if (r.g(var5)) {
         var6 = null;
      }

      return var6 as java.lang.String;
   }


public fun MediaFormat.isHevcVideo(): Boolean {
   q.h(var0, "<this>");
   return q.c(getMimeType(var0), "video/hevc");
}
