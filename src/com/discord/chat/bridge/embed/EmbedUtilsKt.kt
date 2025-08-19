package com.discord.chat.bridge.embed

import B9.s
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import java.util.ArrayList

public fun Embed.getMedia(): EmbedUrlProvider? {
   var var2: Any;
   switch (EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[getMediaType(var0).ordinal()]) {
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

public fun Embed.getMediaType(): EmbedType {
   val var2: EmbedType;
   if (EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()] == 8) {
      if (var0.getVideo() != null) {
         var2 = EmbedType.Video;
      } else if (var0.getImage() != null) {
         var2 = EmbedType.Image;
      } else {
         var2 = var0.getType();
      }
   } else {
      var2 = var0.getType();
   }

   return var2;
}

public fun Embed.getTag(): String {
   val var1: java.lang.String = var0.getClass().getSimpleName();
   val var3: java.lang.String = var0.getType().name();
   val var2: StringBuilder = new StringBuilder();
   var2.append(var1);
   var2.append(": ");
   var2.append(var3);
   return var2.toString();
}

public fun Embed.getTargetDimensions(): Pair<Int?, Int?> {
   val var1: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[getMediaType(var0).ordinal()];
   val var7: Pair;
   if (var1 != 1) {
      if (var1 != 2) {
         val var6: EmbedMedia = var0.getImage();
         if (var6 != null) {
            val var11: Pair = s.a(var6.getWidth(), var6.getHeight());
            if (var11 != null) {
               return var11;
            }
         }

         var7 = s.a(null, null);
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

         var7 = s.a(var13, var8);
      } else {
         val var14: EmbedThumbnail = var0.getThumbnail();
         if (var14 != null) {
            val var15: Pair = s.a(var14.getWidth(), var14.getHeight());
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

         var7 = s.a(var17, var9);
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

      var7 = s.a(var19, var10);
   }

   return var7;
}

public fun Embed.isInlineMedia(): Boolean {
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
   val var5: java.util.List = var0.getImages();
   val var4: ArrayList;
   if (var5 != null) {
      var4 = new ArrayList(CollectionsKt.v(var5, 10));

      for (EmbedMedia var6 : var5) {
         var4.add(
            new MediaSource(
               null,
               var6.getEmbedUrl(),
               null,
               null,
               getTag(var0),
               MediaType.IMAGE,
               false,
               ChannelId.box-impl(var1),
               var3,
               null,
               null,
               var6.getSrcIsAnimated(),
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
   val var6: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[getMediaType(var0).ordinal()];
   var var12: Int = null;
   val var17: MediaSource;
   if (var6 != 1) {
      if (var6 != 2) {
         val var21: EmbedMedia = var0.getImage();
         if (var21 == null) {
            return null;
         }

         val var25: java.lang.String = var21.getEmbedUrl();
         if (var25 == null) {
            return null;
         }

         val var22: java.lang.String = getTag(var0);
         val var38: MediaType = MediaType.IMAGE;
         var17 = new MediaSource(
            null,
            var25,
            var0.getImage().getPlaceholder(),
            var0.getImage().getPlaceholderVersion(),
            var22,
            var38,
            var4,
            ChannelId.box-impl(var1),
            var3,
            null,
            null,
            var0.getImage().getSrcIsAnimated(),
            1537,
            null
         );
      } else {
         val var26: EmbedMedia = var0.getVideo();
         val var27: java.lang.String;
         if (var26 != null) {
            var27 = var26.getProxyURL();
         } else {
            var27 = null;
         }

         val var30: EmbedThumbnail = var0.getThumbnail();
         val var31: java.lang.String;
         if (var30 != null) {
            var31 = var30.getEmbedUrl();
         } else {
            var31 = null;
         }

         val var40: java.lang.String = getTag(var0);
         val var14: MediaType = MediaType.VIDEO;
         val var34: EmbedMedia = var0.getVideo();
         val var35: java.lang.String;
         if (var34 != null) {
            var35 = var34.getPlaceholder();
         } else {
            var35 = null;
         }

         val var15: EmbedMedia = var0.getVideo();
         if (var15 != null) {
            var12 = var15.getPlaceholderVersion();
         }

         val var18: EmbedThumbnail = var0.getThumbnail();
         var4 = false;
         if (var18 != null) {
            var4 = var18.getSrcIsAnimated();
         }

         var17 = new MediaSource(var27, var31, var35, var12, var40, var14, false, ChannelId.box-impl(var1), var3, null, var5, var4, 512, null);
      }
   } else {
      val var28: EmbedMedia = var0.getVideo();
      val var29: java.lang.String;
      if (var28 != null) {
         var29 = var28.getEmbedUrl();
      } else {
         var29 = null;
      }

      val var32: EmbedThumbnail = var0.getThumbnail();
      val var33: java.lang.String;
      if (var32 != null) {
         var33 = var32.getEmbedUrl();
      } else {
         var33 = null;
      }

      val var42: java.lang.String = getTag(var0);
      val var41: MediaType = MediaType.GIFV;
      val var36: EmbedMedia = var0.getVideo();
      val var37: java.lang.String;
      if (var36 != null) {
         var37 = var36.getPlaceholder();
      } else {
         var37 = null;
      }

      val var16: EmbedMedia = var0.getVideo();
      var12 = null;
      if (var16 != null) {
         var12 = var16.getPlaceholderVersion();
      }

      val var19: EmbedThumbnail = var0.getThumbnail();
      var var24: Boolean = false;
      if (var19 != null) {
         var24 = var19.getSrcIsAnimated();
      }

      var17 = new MediaSource(var29, var33, var37, var12, var42, var41, var4, ChannelId.box-impl(var1), var3, null, var5, var24, 512, null);
   }

   return var17;
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
      } catch (var9: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Video.ordinal()] = 2;
      } catch (var8: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Image.ordinal()] = 3;
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Link.ordinal()] = 4;
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.HTML.ordinal()] = 5;
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Tweet.ordinal()] = 6;
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Article.ordinal()] = 7;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[EmbedType.Rich.ordinal()] = 8;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}
