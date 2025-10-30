package com.discord.chat.bridge.embed

import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import fm.v
import java.util.ArrayList

public fun Embed.getMedia(): EmbedUrlProvider? {
   switch (EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[getMediaType(var0).ordinal()]) {
      case 1:
      case 2:
         val var3: EmbedMedia = var0.getVideo();
         if (var3 != null) {
            return var3;
         }

         return var0.getThumbnail();
      case 3:
      case 6:
      case 7:
         val var2: EmbedMedia = var0.getImage();
         if (var2 != null) {
            return var2;
         }

         return var0.getThumbnail();
      case 4:
      case 5:
         return null;
      default:
         return var0.getImage();
   }
}

public fun Embed.getMediaType(): EmbedType {
   if (EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()] == 8) {
      if (var0.getVideo() != null) {
         return EmbedType.Video;
      } else {
         return if (var0.getImage() != null) EmbedType.Image else var0.getType();
      }
   } else {
      return var0.getType();
   }
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
   if (var1 != 1) {
      if (var1 != 2) {
         val var9: EmbedMedia = var0.getImage();
         if (var9 != null) {
            val var10: Pair = v.a(var9.getWidth(), var9.getHeight());
            if (var10 != null) {
               return var10;
            }
         }

         return v.a(null, null);
      } else if (isInlineMedia(var0)) {
         val var17: EmbedMedia = var0.getVideo();
         val var18: Int;
         if (var17 != null) {
            var18 = var17.getWidth();
         } else {
            var18 = null;
         }

         val var20: EmbedMedia = var0.getVideo();
         var var8: Int = null;
         if (var20 != null) {
            var8 = var20.getHeight();
         }

         return v.a(var18, var8);
      } else {
         val var13: EmbedThumbnail = var0.getThumbnail();
         if (var13 != null) {
            val var14: Pair = v.a(var13.getWidth(), var13.getHeight());
            if (var14 != null) {
               return var14;
            }
         }

         val var15: EmbedMedia = var0.getImage();
         val var16: Int;
         if (var15 != null) {
            var16 = var15.getWidth();
         } else {
            var16 = null;
         }

         val var21: EmbedMedia = var0.getImage();
         var var7: Int = null;
         if (var21 != null) {
            var7 = var21.getHeight();
         }

         return v.a(var16, var7);
      }
   } else {
      val var11: EmbedThumbnail = var0.getThumbnail();
      val var12: Int;
      if (var11 != null) {
         var12 = var11.getWidth();
      } else {
         var12 = null;
      }

      val var19: EmbedThumbnail = var0.getThumbnail();
      var var6: Int = null;
      if (var19 != null) {
         var6 = var19.getHeight();
      }

      return v.a(var12, var6);
   }
}

public fun Embed.isInlineMedia(): Boolean {
   if (getMedia(var0) == null && var0.getVideo() == null) {
      return false;
   } else {
      val var1: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[var0.getType().ordinal()];
      if (var1 != 1) {
         if (var1 != 2 && var1 != 3) {
            return false;
         } else {
            return var0.getAuthor() == null && var0.getTitle() == null;
         }
      } else {
         return true;
      }
   }
}

public fun Embed.toImageMediaSources(channelId: ChannelId, messageId: MessageId): List<MediaSource>? {
   val var4: java.util.List = var0.getImages();
   if (var4 == null) {
      return null;
   } else {
      val var5: ArrayList = new ArrayList(CollectionsKt.v(var4, 10));

      for (EmbedMedia var6 : var4) {
         var5.add(
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

      return var5;
   }
}

public fun Embed.toMediaSource(channelId: ChannelId, messageId: MessageId, shouldAutoPlay: Boolean, portal: Double?): MediaSource? {
   val var6: Int = EmbedUtilsKt.WhenMappings.$EnumSwitchMapping$0[getMediaType(var0).ordinal()];
   var var12: Int = null;
   if (var6 != 1) {
      if (var6 != 2) {
         val var20: EmbedMedia = var0.getImage();
         if (var20 != null) {
            val var32: java.lang.String = var20.getEmbedUrl();
            if (var32 != null) {
               val var28: java.lang.String = getTag(var0);
               val var38: MediaType = MediaType.IMAGE;
               return new MediaSource(
                  null,
                  var32,
                  var0.getImage().getPlaceholder(),
                  var0.getImage().getPlaceholderVersion(),
                  var28,
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
            }
         }

         return null;
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

         val var39: java.lang.String = getTag(var0);
         val var40: MediaType = MediaType.VIDEO;
         val var34: EmbedMedia = var0.getVideo();
         val var35: java.lang.String;
         if (var34 != null) {
            var35 = var34.getPlaceholder();
         } else {
            var35 = null;
         }

         val var41: EmbedMedia = var0.getVideo();
         if (var41 != null) {
            var12 = var41.getPlaceholderVersion();
         }

         val var18: EmbedThumbnail = var0.getThumbnail();
         var4 = false;
         if (var18 != null) {
            var4 = var18.getSrcIsAnimated();
         }

         return new MediaSource(var27, var31, var35, var12, var39, var40, false, ChannelId.box-impl(var1), var3, null, var5, var4, 512, null);
      }
   } else {
      val var24: EmbedMedia = var0.getVideo();
      val var25: java.lang.String;
      if (var24 != null) {
         var25 = var24.getEmbedUrl();
      } else {
         var25 = null;
      }

      val var10: EmbedThumbnail = var0.getThumbnail();
      val var29: java.lang.String;
      if (var10 != null) {
         var29 = var10.getEmbedUrl();
      } else {
         var29 = null;
      }

      val var14: java.lang.String = getTag(var0);
      val var15: MediaType = MediaType.GIFV;
      val var11: EmbedMedia = var0.getVideo();
      val var33: java.lang.String;
      if (var11 != null) {
         var33 = var11.getPlaceholder();
      } else {
         var33 = null;
      }

      val var16: EmbedMedia = var0.getVideo();
      var12 = null;
      if (var16 != null) {
         var12 = var16.getPlaceholderVersion();
      }

      val var17: EmbedThumbnail = var0.getThumbnail();
      var var22: Boolean = false;
      if (var17 != null) {
         var22 = var17.getSrcIsAnimated();
      }

      return new MediaSource(var25, var29, var33, var12, var14, var15, var4, ChannelId.box-impl(var1), var3, null, var5, var22, 512, null);
   }
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
