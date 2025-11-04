package com.discord.icons

import android.content.Context
import com.discord.hosts.Hosts
import com.discord.icons.media.MediaProxy
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.snowflake.SnowflakeUtils
import kotlin.Result.a

public object IconUrlUtils {
   public fun getApplicationIcon(applicationId: ApplicationId?, imageId: String?, size: Int = ...): String {
      val var5: MediaProxy = MediaProxy.INSTANCE;
      val var4: java.lang.String = Hosts.INSTANCE.getCDN();
      val var6: StringBuilder = new StringBuilder();
      var6.append(var4);
      var6.append("/app-icons/");
      var6.append(var1);
      var6.append("/");
      var6.append(var2);
      return var5.withSize(var6.toString(), false, var3, null);
   }

   public fun getCustomEmojiUrl(emojiId: Long, animate: Boolean, size: Int? = null): String {
      val var6: MediaProxy = MediaProxy.INSTANCE;
      val var5: java.lang.String = Hosts.INSTANCE.getCDN();
      val var7: StringBuilder = new StringBuilder();
      var7.append(var5);
      var7.append("/emojis/");
      var7.append(var1);
      return var6.withSize(var7.toString(), var3, var4, null);
   }

   public fun getForChannel(context: Context, id: ChannelId?, icon: String?, isGroupDM: Boolean, size: Int? = ...): String {
      if (var2 == null) {
         return "";
      } else if (var3 != null && var3.length() != 0) {
         label36:
         try {
            val var12: a = Result.e;
            val var13: MediaProxy = MediaProxy.INSTANCE;
            val var6: java.lang.String = Hosts.INSTANCE.getCDN();
            val var7: StringBuilder = new StringBuilder();
            var7.append(var6);
            var7.append("/channel-icons/");
            var7.append(var2);
            var7.append("/");
            var7.append(var3);
            var11 = Result.b(var13.withSize(var7.toString(), false, var5, var3));
         } catch (var8: java.lang.Throwable) {
            val var10: a = Result.e;
            var11 = Result.b(kotlin.c.a(var8));
            break label36;
         }

         if (Result.e(var11) != null) {
            val var15: java.lang.String = Hosts.INSTANCE.getAPI();
            val var14: StringBuilder = new StringBuilder();
            var14.append(var15);
            var14.append("/channels/");
            var14.append(var2);
            var14.append("/icons/");
            var14.append(var3);
            var14.append(".jpg");
            var11 = var14.toString();
         }

         return var11 as java.lang.String;
      } else if (var4) {
         switch ((int)(SnowflakeUtils.INSTANCE.toTimestamp(var2) % 8)) {
            case 1:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup1.getUri(var1));
            case 2:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup2.getUri(var1));
            case 3:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup3.getUri(var1));
            case 4:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup4.getUri(var1));
            case 5:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup5.getUri(var1));
            case 6:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup6.getUri(var1));
            case 7:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup7.getUri(var1));
            default:
               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup0.getUri(var1));
         }
      } else {
         return "";
      }
   }

   public fun getForGuild(id: GuildId?, icon: String?, defaultIcon: String? = ..., animated: Boolean = ..., size: Int? = ...): String {
      if (var2 != null && var2.length() != 0 && var1 != null) {
         val var6: MediaProxy = MediaProxy.INSTANCE;

         label27:
         try {
            val var12: a = Result.e;
            var3 = Hosts.INSTANCE.getCDN();
            val var7: StringBuilder = new StringBuilder();
            var7.append(var3);
            var7.append("/icons/");
            var7.append(var1);
            var7.append("/");
            var7.append(var2);
            var11 = Result.b(var7.toString());
         } catch (var8: java.lang.Throwable) {
            val var10: a = Result.e;
            var11 = Result.b(kotlin.c.a(var8));
            break label27;
         }

         if (Result.e(var11) != null) {
            var3 = Hosts.INSTANCE.getAPI();
            val var15: StringBuilder = new StringBuilder();
            var15.append(var3);
            var15.append("/guilds/");
            var15.append(var1);
            var15.append("/icons/");
            var15.append(var2);
            var11 = var15.toString();
         }

         return var6.withSize(var11 as java.lang.String, var4, var5, var2);
      } else {
         return if (var3 == null) "" else var3;
      }
   }

   public fun getForGuildMember(guildMemberAvatar: String?, guildId: GuildId?, userId: UserId?, sizePx: Int? = ..., animated: Boolean = ...): String {
      if (var1 != null
         && !StringsKt.i0(var1)
         && var2 != null
         && GuildId.isValid-impl(var2.unbox-impl())
         && var3 != null
         && UserId.isValid-impl(var3.unbox-impl())) {
         val var6: java.lang.String = Hosts.INSTANCE.getCDN();
         val var7: StringBuilder = new StringBuilder();
         var7.append(var6);
         var7.append("/guilds/");
         var7.append(var2);
         var7.append("/users/");
         var7.append(var3);
         var7.append("/avatars/");
         var7.append(var1);
         return MediaProxy.INSTANCE.withSize(var7.toString(), var5, var4, var1);
      } else {
         return "";
      }
   }

   public fun getForUser(context: Context, userId: UserId?, userAvatar: String?, discriminator: Int? = ..., animated: Boolean = ..., size: Int? = ...): String {
      if (var2 != null) {
         if (UserId.equals-impl(UserId.constructor-impl(-1L), var2)) {
            if (var3 == null) {
               return "";
            }

            return var3;
         }

         if (var3 != null) {
            label45:
            try {
               val var11: a = Result.e;
               val var12: java.lang.String = Hosts.INSTANCE.getCDN();
               val var16: StringBuilder = new StringBuilder();
               var16.append(var12);
               var16.append("/avatars/");
               var16.append(var2);
               var16.append("/");
               var16.append(var3);
               var10 = Result.b(MediaProxy.INSTANCE.withSize(var16.toString(), var5, var6, var3));
            } catch (var8: java.lang.Throwable) {
               val var15: a = Result.e;
               var10 = Result.b(kotlin.c.a(var8));
               break label45;
            }

            if (Result.e(var10) != null) {
               val var14: java.lang.String = Hosts.INSTANCE.getAPI();
               val var17: StringBuilder = new StringBuilder();
               var17.append(var14);
               var17.append("/users/");
               var17.append(var2);
               var17.append("/avatars/");
               var17.append(var3);
               var17.append(".jpg");
               var10 = var17.toString();
            }

            return var10 as java.lang.String;
         }

         if (var4 != null) {
            val var7: Int = var4 % 5;
            if (var7 != 1) {
               if (var7 != 2) {
                  if (var7 != 3) {
                     if (var7 != 4) {
                        return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar0.getUri(var1));
                     }

                     return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar4.getUri(var1));
                  }

                  return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar3.getUri(var1));
               }

               return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar2.getUri(var1));
            }

            return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar1.getUri(var1));
         }
      }

      return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar0.getUri(var1));
   }

   public fun init(context: Context, cdnHost: String? = null, apiHost: String? = null) {
      Hosts.INSTANCE.init(var1, var3, var2);
   }
}
