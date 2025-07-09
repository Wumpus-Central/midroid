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
import kotlin.jvm.internal.r

public object IconUrlUtils {
   public fun getApplicationIcon(applicationId: ApplicationId?, imageId: String?, size: Int = ...): String {
      val var4: MediaProxy = MediaProxy.INSTANCE;
      val var6: java.lang.String = Hosts.INSTANCE.getCDN();
      val var5: StringBuilder = new StringBuilder();
      var5.append(var6);
      var5.append("/app-icons/");
      var5.append(var1);
      var5.append("/");
      var5.append(var2);
      return var4.withSize(var5.toString(), false, var3, null);
   }

   public fun getCustomEmojiUrl(emojiId: Long, animate: Boolean, size: Int? = null): String {
      val var7: MediaProxy = MediaProxy.INSTANCE;
      val var5: java.lang.String = Hosts.INSTANCE.getCDN();
      val var6: StringBuilder = new StringBuilder();
      var6.append(var5);
      var6.append("/emojis/");
      var6.append(var1);
      return var7.withSize(var6.toString(), var3, var4, null);
   }

   public fun getForChannel(context: Context, id: ChannelId?, icon: String?, isGroupDM: Boolean, size: Int? = ...): String {
      r.h(var1, "context");
      if (var2 == null) {
         var3 = "";
      } else if (var3 != null && var3.length() != 0) {
         label34:
         try {
            val var11: a = Result.k;
            val var12: MediaProxy = MediaProxy.INSTANCE;
            val var17: java.lang.String = Hosts.INSTANCE.getCDN();
            val var7: StringBuilder = new StringBuilder();
            var7.append(var17);
            var7.append("/channel-icons/");
            var7.append(var2);
            var7.append("/");
            var7.append(var3);
            var10 = Result.b(var12.withSize(var7.toString(), false, var5, var3));
         } catch (var8: java.lang.Throwable) {
            val var15: a = Result.k;
            var10 = Result.b(c.a(var8));
            break label34;
         }

         if (Result.e(var10) != null) {
            val var16: java.lang.String = Hosts.INSTANCE.getAPI();
            val var13: StringBuilder = new StringBuilder();
            var13.append(var16);
            var13.append("/channels/");
            var13.append(var2);
            var13.append("/icons/");
            var13.append(var3);
            var13.append(".jpg");
            var10 = var13.toString();
         }

         var3 = var10 as java.lang.String;
      } else {
         var3 = "";
         if (var4) {
            switch ((int)(SnowflakeUtils.INSTANCE.toTimestamp(var2) % 8)) {
               case 1:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup1.getUri(var1));
                  break;
               case 2:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup2.getUri(var1));
                  break;
               case 3:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup3.getUri(var1));
                  break;
               case 4:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup4.getUri(var1));
                  break;
               case 5:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup5.getUri(var1));
                  break;
               case 6:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup6.getUri(var1));
                  break;
               case 7:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup7.getUri(var1));
                  break;
               default:
                  var3 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultGroup0.getUri(var1));
            }
         }
      }

      return var3;
   }

   public fun getForGuild(id: GuildId?, icon: String?, defaultIcon: String? = ..., animated: Boolean = ..., size: Int? = ...): String {
      var var10: java.lang.String;
      if (var2 != null && var2.length() != 0 && var1 != null) {
         val var6: MediaProxy = MediaProxy.INSTANCE;

         label26:
         try {
            val var13: a = Result.k;
            var3 = Hosts.INSTANCE.getCDN();
            val var7: StringBuilder = new StringBuilder();
            var7.append(var3);
            var7.append("/icons/");
            var7.append(var1);
            var7.append("/");
            var7.append(var2);
            var12 = Result.b(var7.toString());
         } catch (var8: java.lang.Throwable) {
            val var11: a = Result.k;
            var12 = Result.b(c.a(var8));
            break label26;
         }

         if (Result.e(var12) != null) {
            val var16: java.lang.String = Hosts.INSTANCE.getAPI();
            val var15: StringBuilder = new StringBuilder();
            var15.append(var16);
            var15.append("/guilds/");
            var15.append(var1);
            var15.append("/icons/");
            var15.append(var2);
            var12 = var15.toString();
         }

         var10 = var6.withSize(var12 as java.lang.String, var4, var5, var2);
      } else {
         var10 = var3;
         if (var3 == null) {
            var10 = "";
         }
      }

      return var10;
   }

   public fun getForGuildMember(guildMemberAvatar: String?, guildId: GuildId?, userId: UserId?, sizePx: Int? = ..., animated: Boolean = ...): String {
      if (var1 != null && !h.c0(var1) && var2 != null && GuildId.isValid-impl(var2.unbox-impl()) && var3 != null && UserId.isValid-impl(var3.unbox-impl())) {
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
      r.h(var1, "context");
      if (var2 != null) {
         if (UserId.equals-impl(UserId.constructor-impl(-1L), var2)) {
            var var16: java.lang.String = var3;
            if (var3 == null) {
               var16 = "";
            }

            return var16;
         }

         if (var3 != null) {
            label43:
            try {
               val var12: a = Result.k;
               val var18: java.lang.String = Hosts.INSTANCE.getCDN();
               val var13: StringBuilder = new StringBuilder();
               var13.append(var18);
               var13.append("/avatars/");
               var13.append(var2);
               var13.append("/");
               var13.append(var3);
               var11 = Result.b(MediaProxy.INSTANCE.withSize(var13.toString(), var5, var6, var3));
            } catch (var8: java.lang.Throwable) {
               val var17: a = Result.k;
               var11 = Result.b(c.a(var8));
               break label43;
            }

            if (Result.e(var11) != null) {
               val var15: java.lang.String = Hosts.INSTANCE.getAPI();
               val var19: StringBuilder = new StringBuilder();
               var19.append(var15);
               var19.append("/users/");
               var19.append(var2);
               var19.append("/avatars/");
               var19.append(var3);
               var19.append(".jpg");
               var11 = var19.toString();
            }

            return var11 as java.lang.String;
         }

         if (var4 != null) {
            val var7: Int = var4 % 5;
            val var10: java.lang.String;
            if (var7 != 1) {
               if (var7 != 2) {
                  if (var7 != 3) {
                     if (var7 != 4) {
                        var10 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar0.getUri(var1));
                     } else {
                        var10 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar4.getUri(var1));
                     }
                  } else {
                     var10 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar3.getUri(var1));
                  }
               } else {
                  var10 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar2.getUri(var1));
               }
            } else {
               var10 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar1.getUri(var1));
            }

            return var10;
         }
      }

      return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar0.getUri(var1));
   }

   public fun init(context: Context, cdnHost: String? = null, apiHost: String? = null) {
      r.h(var1, "context");
      Hosts.INSTANCE.init(var1, var3, var2);
   }
}
