package com.discord.chat.bridge.embed

import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.primitives.MessageId
import eh.w
import java.util.ArrayList
import kotlin.jvm.internal.r

public fun Embed.getMedia(): EmbedUrlProvider? {
   r.h(var0, "<this>");
   var var2: Any;
   switch (EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()]) {
      case 1:
      case 2:
         val var4: EmbedMedia = var0.getVideo();
         if (var4 != null) {
            var2 = var4;
         } else {
            var2 = var0.getThumbnail();
         }
         break;
      case 3:
      case 6:
      case 7:
         val var3: EmbedMedia = var0.getImage();
         if (var3 != null) {
            var2 = var3;
         } else {
            var2 = var0.getThumbnail();
         }
         break;
      case 4:
      case 5:
         var2 = null;
         break;
      default:
         var2 = var0.getImage();
   }

   return (EmbedUrlProvider)var2;
}

public fun Embed.getTag(): String {
   r.h(var0, "<this>");
   val var1: java.lang.String = var0.getClass().getSimpleName();
   val var2: java.lang.String = var0.getType().name();
   val var3: StringBuilder = new StringBuilder();
   var3.append(var1);
   var3.append(": ");
   var3.append(var2);
   return var3.toString();
}

public fun Embed.getTargetDimensions(): Pair<Int?, Int?> {
   r.h(var0, "<this>");
   val var1: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()];
   val var7: Pair;
   if (var1 != 1) {
      if (var1 != 2) {
         val var6: EmbedMedia = var0.getImage();
         if (var6 != null) {
            val var11: Pair = w.a(var6.getWidth(), var6.getHeight());
            if (var11 != null) {
               return var11;
            }
         }

         var7 = w.a(null, null);
      } else if (isInlineMedia(var0)) {
         val var12: EmbedMedia = var0.getVideo();
         val var13: Int;
         if (var12 != null) {
            var13 = var12.getWidth();
         } else {
            var13 = null;
         }

         val var20: EmbedMedia = var0.getVideo();
         var var8: Int = null;
         if (var20 != null) {
            var8 = var20.getHeight();
         }

         var7 = w.a(var13, var8);
      } else {
         val var14: EmbedThumbnail = var0.getThumbnail();
         if (var14 != null) {
            val var15: Pair = w.a(var14.getWidth(), var14.getHeight());
            if (var15 != null) {
               return var15;
            }
         }

         val var16: EmbedMedia = var0.getImage();
         val var17: Int;
         if (var16 != null) {
            var17 = var16.getWidth();
         } else {
            var17 = null;
         }

         val var22: EmbedMedia = var0.getImage();
         var var9: Int = null;
         if (var22 != null) {
            var9 = var22.getHeight();
         }

         var7 = w.a(var17, var9);
      }
   } else {
      val var18: EmbedThumbnail = var0.getThumbnail();
      val var19: Int;
      if (var18 != null) {
         var19 = var18.getWidth();
      } else {
         var19 = null;
      }

      val var21: EmbedThumbnail = var0.getThumbnail();
      var var10: Int = null;
      if (var21 != null) {
         var10 = var21.getHeight();
      }

      var7 = w.a(var19, var10);
   }

   return var7;
}

public fun Embed.isInlineMedia(): Boolean {
   r.h(var0, "<this>");
   if (getMedia(var0) == null && var0.getVideo() == null) {
      return false;
   } else {
      val var1: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()];
      if (var1 != 1) {
         if (var1 != 2 && var1 != 3) {
            return false;
         }

         if (var0.getAuthor() != null) {
            return false;
         }

         if (var0.getTitle() != null) {
            return false;
         }
      }

      return true;
   }
}

public fun Embed.toImageMediaSources(): List<MediaSource>? {
   r.h(var0, "<this>");
   val var1: java.util.List = var0.getImages();
   val var4: ArrayList;
   if (var1 != null) {
      val var2: ArrayList = new ArrayList(h.t(var1, 10));
      val var3: java.util.Iterator = var1.iterator();

      while (true) {
         var4 = var2;
         if (!var3.hasNext()) {
            break;
         }

         var2.add(
            new MediaSource(null, (var3.next() as EmbedMedia).getEmbedUrl(), null, null, getTag(var0), MediaType.IMAGE, false, null, null, null, 909, null)
         );
      }
   } else {
      var4 = null;
   }

   return var4;
}

public fun Embed.toMediaSource(messageId: MessageId, shouldAutoPlay: Boolean, portal: Double?): MediaSource? {
   r.h(var0, "$this$toMediaSource");
   r.h(var1, "messageId");
   val var4: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()];
   val var10: MediaSource;
   if (var4 != 1) {
      if (var4 != 2) {
         val var15: EmbedMedia = var0.getImage();
         if (var15 == null) {
            return null;
         }

         val var16: java.lang.String = var15.getEmbedUrl();
         if (var16 == null) {
            return null;
         }

         val var17: java.lang.String = getTag(var0);
         val var6: MediaType = MediaType.IMAGE;
         var10 = new MediaSource(
            null, var16, var0.getImage().getPlaceholder(), var0.getImage().getPlaceholderVersion(), var17, var6, false, var1, null, null, 769, null
         );
      } else {
         val var18: EmbedMedia = var0.getVideo();
         val var19: java.lang.String;
         if (var18 != null) {
            var19 = var18.getProxyURL();
         } else {
            var19 = null;
         }

         val var22: EmbedThumbnail = var0.getThumbnail();
         val var23: java.lang.String;
         if (var22 != null) {
            var23 = var22.getEmbedUrl();
         } else {
            var23 = null;
         }

         val var8: java.lang.String = getTag(var0);
         val var9: MediaType = MediaType.VIDEO;
         val var7: EmbedMedia = var0.getVideo();
         val var26: java.lang.String;
         if (var7 != null) {
            var26 = var7.getPlaceholder();
         } else {
            var26 = null;
         }

         val var11: EmbedMedia = var0.getVideo();
         val var12: Int;
         if (var11 != null) {
            var12 = var11.getPlaceholderVersion();
         } else {
            var12 = null;
         }

         var10 = new MediaSource(var19, var23, var26, var12, var8, var9, false, var1, null, var3, 256, null);
      }
   } else {
      val var20: EmbedMedia = var0.getVideo();
      val var21: java.lang.String;
      if (var20 != null) {
         var21 = var20.getEmbedUrl();
      } else {
         var21 = null;
      }

      val var24: EmbedThumbnail = var0.getThumbnail();
      val var25: java.lang.String;
      if (var24 != null) {
         var25 = var24.getEmbedUrl();
      } else {
         var25 = null;
      }

      val var29: java.lang.String = getTag(var0);
      val var30: MediaType = MediaType.GIFV;
      val var27: EmbedMedia = var0.getVideo();
      val var28: java.lang.String;
      if (var27 != null) {
         var28 = var27.getPlaceholder();
      } else {
         var28 = null;
      }

      val var13: EmbedMedia = var0.getVideo();
      val var14: Int;
      if (var13 != null) {
         var14 = var13.getPlaceholderVersion();
      } else {
         var14 = null;
      }

      var10 = new MediaSource(var21, var25, var28, var14, var29, var30, var2, var1, null, var3, 256, null);
   }

   return var10;
}
// $VF: Class flags could not be determined
@JvmSynthetic
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var0: IntArray = new int[EmbedType.values().length];

      try {
         var0[EmbedType.GIFV.ordinal()] = 1;
      } catch (var8: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Video.ordinal()] = 2;
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Image.ordinal()] = 3;
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Link.ordinal()] = 4;
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.HTML.ordinal()] = 5;
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Tweet.ordinal()] = 6;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Article.ordinal()] = 7;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}
