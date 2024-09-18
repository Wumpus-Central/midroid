package com.discord.chat.bridge.embed

import ch.w
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import java.util.ArrayList
import kotlin.jvm.internal.q

public fun Embed.getMedia(): EmbedUrlProvider? {
   q.h(var0, "<this>");
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
   q.h(var0, "<this>");
   val var1: java.lang.String = var0.getClass().getSimpleName();
   val var3: java.lang.String = var0.getType().name();
   val var2: StringBuilder = new StringBuilder();
   var2.append(var1);
   var2.append(": ");
   var2.append(var3);
   return var2.toString();
}

public fun Embed.getTargetDimensions(): Pair<Int?, Int?> {
   q.h(var0, "<this>");
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
   q.h(var0, "<this>");
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

public fun Embed.toImageMediaSources(channelId: ChannelId, messageId: MessageId): List<MediaSource>? {
   q.h(var0, "$this$toImageMediaSources");
   q.h(var3, "messageId");
   val var5: java.util.List = var0.getImages();
   val var4: ArrayList;
   if (var5 != null) {
      var4 = new ArrayList(i.u(var5, 10));
      val var6: java.util.Iterator = var5.iterator();

      while (var6.hasNext()) {
         var4.add(
            new MediaSource(
               null,
               (var6.next() as EmbedMedia).getEmbedUrl(),
               null,
               null,
               getTag(var0),
               MediaType.IMAGE,
               false,
               ChannelId.box-impl(var1),
               var3,
               null,
               null,
               1549,
               null
            )
         );
      }
   } else {
      var4 = null;
   }

   return var4;
}

public fun Embed.toMediaSource(channelId: ChannelId, messageId: MessageId, shouldAutoPlay: Boolean, portal: Double?): MediaSource? {
   q.h(var0, "$this$toMediaSource");
   q.h(var3, "messageId");
   val var6: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()];
   val var12: MediaSource;
   if (var6 != 1) {
      if (var6 != 2) {
         val var17: EmbedMedia = var0.getImage();
         if (var17 == null) {
            return null;
         }

         val var8: java.lang.String = var17.getEmbedUrl();
         if (var8 == null) {
            return null;
         }

         val var18: java.lang.String = getTag(var0);
         val var19: MediaType = MediaType.IMAGE;
         var12 = new MediaSource(
            null,
            var8,
            var0.getImage().getPlaceholder(),
            var0.getImage().getPlaceholderVersion(),
            var18,
            var19,
            false,
            ChannelId.box-impl(var1),
            var3,
            null,
            null,
            1537,
            null
         );
      } else {
         val var20: EmbedMedia = var0.getVideo();
         val var21: java.lang.String;
         if (var20 != null) {
            var21 = var20.getProxyURL();
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

         val var10: java.lang.String = getTag(var0);
         val var11: MediaType = MediaType.VIDEO;
         val var9: EmbedMedia = var0.getVideo();
         val var28: java.lang.String;
         if (var9 != null) {
            var28 = var9.getPlaceholder();
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

         var12 = new MediaSource(var21, var25, var28, var14, var10, var11, false, ChannelId.box-impl(var1), var3, null, var5, 512, null);
      }
   } else {
      val var22: EmbedMedia = var0.getVideo();
      val var23: java.lang.String;
      if (var22 != null) {
         var23 = var22.getEmbedUrl();
      } else {
         var23 = null;
      }

      val var26: EmbedThumbnail = var0.getThumbnail();
      val var27: java.lang.String;
      if (var26 != null) {
         var27 = var26.getEmbedUrl();
      } else {
         var27 = null;
      }

      val var31: java.lang.String = getTag(var0);
      val var32: MediaType = MediaType.GIFV;
      val var29: EmbedMedia = var0.getVideo();
      val var30: java.lang.String;
      if (var29 != null) {
         var30 = var29.getPlaceholder();
      } else {
         var30 = null;
      }

      val var15: EmbedMedia = var0.getVideo();
      val var16: Int;
      if (var15 != null) {
         var16 = var15.getPlaceholderVersion();
      } else {
         var16 = null;
      }

      var12 = new MediaSource(var23, var27, var30, var16, var31, var32, var4, ChannelId.box-impl(var1), var3, null, var5, 512, null);
   }

   return var12;
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
