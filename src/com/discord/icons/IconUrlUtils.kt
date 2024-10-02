package com.discord.icons

import android.content.Context
import com.discord.hosts.Hosts
import com.discord.icons.media.MediaExtensionKt
import com.discord.icons.media.MediaProxy
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.snowflake.SnowflakeUtils
import kh.r
import kh.s
import kh.r.a
import kotlin.jvm.internal.q

public object IconUrlUtils {
   public fun getApplicationIcon(applicationId: ApplicationId?, imageId: String?, size: Int = ...): String {
      val var6: MediaProxy = MediaProxy.INSTANCE;
      val var4: java.lang.String = Hosts.INSTANCE.getCDN();
      val var5: java.lang.String = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
      val var7: StringBuilder = new StringBuilder();
      var7.append(var4);
      var7.append("/app-icons/");
      var7.append(var1);
      var7.append("/");
      var7.append(var2);
      var7.append(".");
      var7.append(var5);
      return MediaProxy.withSize$default(var6, var7.toString(), var3, null, 4, null);
   }

   public fun getCustomEmojiUrl(emojiId: Long, animate: Boolean, size: Int? = null): String {
      val var7: MediaProxy = MediaProxy.INSTANCE;
      val var5: java.lang.String = Hosts.INSTANCE.getCDN();
      val var6: java.lang.String = MediaExtensionKt.getMediaExtension$default(var3, null, 2, null);
      val var8: StringBuilder = new StringBuilder();
      var8.append(var5);
      var8.append("/emojis/");
      var8.append(var1);
      var8.append(".");
      var8.append(var6);
      return MediaProxy.withSize$default(var7, var8.toString(), var4, null, 4, null);
   }

   public fun getForChannel(context: Context, id: ChannelId?, icon: String?, isGroupDM: Boolean, size: Int? = ...): String {
      q.h(var1, "context");
      if (var2 == null) {
         var3 = "";
      } else if (var3 != null && var3.length() != 0) {
         label34:
         try {
            val var13: a = r.k;
            val var18: MediaProxy = MediaProxy.INSTANCE;
            val var7: java.lang.String = Hosts.INSTANCE.getCDN();
            val var8: java.lang.String = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
            val var14: StringBuilder = new StringBuilder();
            var14.append(var7);
            var14.append("/channel-icons/");
            var14.append(var2);
            var14.append("/");
            var14.append(var3);
            var14.append(".");
            var14.append(var8);
            var12 = r.b(MediaProxy.withSize$default(var18, var14.toString(), var5, null, 4, null));
         } catch (var9: java.lang.Throwable) {
            val var11: a = r.k;
            var12 = r.b(s.a(var9));
            break label34;
         }

         if (r.e(var12) != null) {
            val var17: java.lang.String = Hosts.INSTANCE.getAPI();
            val var15: StringBuilder = new StringBuilder();
            var15.append(var17);
            var15.append("/channels/");
            var15.append(var2);
            var15.append("/icons/");
            var15.append(var3);
            var15.append(".jpg");
            var12 = var15.toString();
         }

         var3 = var12 as java.lang.String;
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
      var var11: java.lang.String;
      if (var2 != null && var2.length() != 0 && var1 != null) {
         val var6: MediaProxy = MediaProxy.INSTANCE;

         label26:
         try {
            val var13: a = r.k;
            val var16: java.lang.String = Hosts.INSTANCE.getCDN();
            var3 = MediaExtensionKt.getMediaExtension(var4, var2);
            val var8: StringBuilder = new StringBuilder();
            var8.append(var16);
            var8.append("/icons/");
            var8.append(var1);
            var8.append("/");
            var8.append(var2);
            var8.append(".");
            var8.append(var3);
            var12 = r.b(var8.toString());
         } catch (var9: java.lang.Throwable) {
            val var7: a = r.k;
            var12 = r.b(s.a(var9));
            break label26;
         }

         if (r.e(var12) != null) {
            var3 = Hosts.INSTANCE.getAPI();
            val var17: StringBuilder = new StringBuilder();
            var17.append(var3);
            var17.append("/guilds/");
            var17.append(var1);
            var17.append("/icons/");
            var17.append(var2);
            var17.append(".jpg");
            var12 = var17.toString();
         }

         var11 = MediaProxy.withSize$default(var6, var12 as java.lang.String, var5, null, 4, null);
      } else {
         var11 = var3;
         if (var3 == null) {
            var11 = "";
         }
      }

      return var11;
   }

   public fun getForGuildMember(guildMemberAvatar: String?, guildId: GuildId?, userId: UserId?, sizePx: Int? = ..., animated: Boolean = ...): String {
      if (var1 != null && !h.x(var1) && var2 != null && GuildId.isValid-impl(var2.unbox-impl()) && var3 != null && UserId.isValid-impl(var3.unbox-impl())) {
         val var8: java.lang.String = MediaExtensionKt.getMediaExtension(var5, var1);
         val var7: java.lang.String = Hosts.INSTANCE.getCDN();
         val var6: StringBuilder = new StringBuilder();
         var6.append(var7);
         var6.append("/guilds/");
         var6.append(var2);
         var6.append("/users/");
         var6.append(var3);
         var6.append("/avatars/");
         var6.append(var1);
         var6.append(".");
         var6.append(var8);
         return MediaProxy.withSize$default(MediaProxy.INSTANCE, var6.toString(), var4, null, 4, null);
      } else {
         return "";
      }
   }

   public fun getForUser(context: Context, userId: UserId?, userAvatar: String?, discriminator: Int? = ..., animated: Boolean = ..., size: Int? = ...): String {
      q.h(var1, "context");
      if (var2 != null) {
         if (UserId.equals-impl(UserId.constructor-impl(-1L), var2)) {
            var var17: java.lang.String = var3;
            if (var3 == null) {
               var17 = "";
            }

            return var17;
         }

         if (var3 != null) {
            label43:
            try {
               val var13: a = r.k;
               val var19: java.lang.String = MediaExtensionKt.getMediaExtension(var5, var3);
               val var8: java.lang.String = Hosts.INSTANCE.getCDN();
               val var14: StringBuilder = new StringBuilder();
               var14.append(var8);
               var14.append("/avatars/");
               var14.append(var2);
               var14.append("/");
               var14.append(var3);
               var14.append(".");
               var14.append(var19);
               var12 = r.b(MediaProxy.withSize$default(MediaProxy.INSTANCE, var14.toString(), var6, null, 4, null));
            } catch (var9: java.lang.Throwable) {
               val var18: a = r.k;
               var12 = r.b(s.a(var9));
               break label43;
            }

            if (r.e(var12) != null) {
               val var16: java.lang.String = Hosts.INSTANCE.getAPI();
               val var20: StringBuilder = new StringBuilder();
               var20.append(var16);
               var20.append("/users/");
               var20.append(var2);
               var20.append("/avatars/");
               var20.append(var3);
               var20.append(".jpg");
               var12 = var20.toString();
            }

            return var12 as java.lang.String;
         }

         if (var4 != null) {
            val var7: Int = var4 % 5;
            val var11: java.lang.String;
            if (var7 != 1) {
               if (var7 != 2) {
                  if (var7 != 3) {
                     if (var7 != 4) {
                        var11 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar0.getUri(var1));
                     } else {
                        var11 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar4.getUri(var1));
                     }
                  } else {
                     var11 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar3.getUri(var1));
                  }
               } else {
                  var11 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar2.getUri(var1));
               }
            } else {
               var11 = ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar1.getUri(var1));
            }

            return var11;
         }
      }

      return ReactAssetUtilsKt.getReactImageUrl(var1, ReactAsset.DefaultAvatar0.getUri(var1));
   }

   public fun init(context: Context, cdnHost: String? = null, apiHost: String? = null) {
      q.h(var1, "context");
      Hosts.INSTANCE.init(var1, var3, var2);
   }
}
