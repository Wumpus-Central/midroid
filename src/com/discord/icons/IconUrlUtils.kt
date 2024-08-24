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
import eh.s
import eh.r.a
import kotlin.jvm.internal.r

public object IconUrlUtils {
   public fun getApplicationIcon(applicationId: ApplicationId?, imageId: String?, size: Int = ...): String {
      val var4: MediaProxy = MediaProxy.INSTANCE;
      val var5: java.lang.String = Hosts.INSTANCE.getCDN();
      val var6: java.lang.String = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
      val var7: StringBuilder = new StringBuilder();
      var7.append(var5);
      var7.append("/app-icons/");
      var7.append(var1);
      var7.append("/");
      var7.append(var2);
      var7.append(".");
      var7.append(var6);
      return MediaProxy.withSize$default(var4, var7.toString(), var3, null, 4, null);
   }

   public fun getCustomEmojiUrl(emojiId: Long, animate: Boolean, size: Int? = null): String {
      val var8: MediaProxy = MediaProxy.INSTANCE;
      val var5: java.lang.String = Hosts.INSTANCE.getCDN();
      val var7: java.lang.String = MediaExtensionKt.getMediaExtension$default(var3, null, 2, null);
      val var6: StringBuilder = new StringBuilder();
      var6.append(var5);
      var6.append("/emojis/");
      var6.append(var1);
      var6.append(".");
      var6.append(var7);
      return MediaProxy.withSize$default(var8, var6.toString(), var4, null, 4, null);
   }

   public fun getForChannel(context: Context, id: ChannelId?, icon: String?, isGroupDM: Boolean, size: Int? = ...): String {
      r.h(var1, "context");
      if (var2 == null) {
         var3 = "";
      } else {
         val var6: Boolean;
         if (var3 != null && var3.length() != 0) {
            var6 = false;
         } else {
            var6 = true;
         }

         if (var6) {
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
         } else {
            label37:
            try {
               val var13: a = eh.r.k;
               val var19: MediaProxy = MediaProxy.INSTANCE;
               val var14: java.lang.String = Hosts.INSTANCE.getCDN();
               val var9: java.lang.String = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
               val var8: StringBuilder = new StringBuilder();
               var8.append(var14);
               var8.append("/channel-icons/");
               var8.append(var2);
               var8.append("/");
               var8.append(var3);
               var8.append(".");
               var8.append(var9);
               var12 = eh.r.b(MediaProxy.withSize$default(var19, var8.toString(), var5, null, 4, null));
            } catch (var10: java.lang.Throwable) {
               val var17: a = eh.r.k;
               var12 = eh.r.b(s.a(var10));
               break label37;
            }

            if (eh.r.e(var12) != null) {
               val var15: java.lang.String = Hosts.INSTANCE.getAPI();
               val var18: StringBuilder = new StringBuilder();
               var18.append(var15);
               var18.append("/channels/");
               var18.append(var2);
               var18.append("/icons/");
               var18.append(var3);
               var18.append(".jpg");
               var12 = var18.toString();
            }

            var3 = var12 as java.lang.String;
         }
      }

      return var3;
   }

   public fun getForGuild(id: GuildId?, icon: String?, defaultIcon: String? = ..., animated: Boolean = ..., size: Int? = ...): String {
      val var6: Boolean;
      if (var2 != null && var2.length() != 0) {
         var6 = false;
      } else {
         var6 = true;
      }

      var var12: java.lang.String;
      if (!var6 && var1 != null) {
         val var7: MediaProxy = MediaProxy.INSTANCE;

         label29:
         try {
            val var14: a = eh.r.k;
            var3 = Hosts.INSTANCE.getCDN();
            val var9: java.lang.String = MediaExtensionKt.getMediaExtension(var4, var2);
            val var17: StringBuilder = new StringBuilder();
            var17.append(var3);
            var17.append("/icons/");
            var17.append(var1);
            var17.append("/");
            var17.append(var2);
            var17.append(".");
            var17.append(var9);
            var13 = eh.r.b(var17.toString());
         } catch (var10: java.lang.Throwable) {
            val var8: a = eh.r.k;
            var13 = eh.r.b(s.a(var10));
            break label29;
         }

         if (eh.r.e(var13) != null) {
            val var18: java.lang.String = Hosts.INSTANCE.getAPI();
            val var16: StringBuilder = new StringBuilder();
            var16.append(var18);
            var16.append("/guilds/");
            var16.append(var1);
            var16.append("/icons/");
            var16.append(var2);
            var16.append(".jpg");
            var13 = var16.toString();
         }

         var12 = MediaProxy.withSize$default(var7, var13 as java.lang.String, var5, null, 4, null);
      } else {
         var12 = var3;
         if (var3 == null) {
            var12 = "";
         }
      }

      return var12;
   }

   public fun getForGuildMember(guildMemberAvatar: String?, guildId: GuildId?, userId: UserId?, sizePx: Int? = ..., animated: Boolean = ...): String {
      var var6: Boolean;
      if (var1 != null && !f.x(var1)) {
         var6 = false;
      } else {
         var6 = true;
      }

      if (!var6) {
         if (var2 != null && GuildId.isValid-impl(var2.unbox-impl())) {
            var6 = true;
         } else {
            var6 = false;
         }

         if (var6) {
            var6 = false;
            if (var3 != null) {
               var6 = false;
               if (UserId.isValid-impl(var3.unbox-impl())) {
                  var6 = true;
               }
            }

            if (var6) {
               val var9: java.lang.String = MediaExtensionKt.getMediaExtension(var5, var1);
               val var8: java.lang.String = Hosts.INSTANCE.getCDN();
               val var10: StringBuilder = new StringBuilder();
               var10.append(var8);
               var10.append("/guilds/");
               var10.append(var2);
               var10.append("/users/");
               var10.append(var3);
               var10.append("/avatars/");
               var10.append(var1);
               var10.append(".");
               var10.append(var9);
               return MediaProxy.withSize$default(MediaProxy.INSTANCE, var10.toString(), var4, null, 4, null);
            }
         }
      }

      return "";
   }

   public fun getForUser(context: Context, userId: UserId?, userAvatar: String?, discriminator: Int? = ..., animated: Boolean = ..., size: Int? = ...): String {
      r.h(var1, "context");
      if (var2 != null) {
         if (UserId.equals-impl(UserId.constructor-impl(-1L), var2)) {
            var var18: java.lang.String = var3;
            if (var3 == null) {
               var18 = "";
            }

            return var18;
         }

         if (var3 != null) {
            label43:
            try {
               val var14: a = eh.r.k;
               val var15: java.lang.String = MediaExtensionKt.getMediaExtension(var5, var3);
               val var8: java.lang.String = Hosts.INSTANCE.getCDN();
               val var19: StringBuilder = new StringBuilder();
               var19.append(var8);
               var19.append("/avatars/");
               var19.append(var2);
               var19.append("/");
               var19.append(var3);
               var19.append(".");
               var19.append(var15);
               var13 = eh.r.b(MediaProxy.withSize$default(MediaProxy.INSTANCE, var19.toString(), var6, null, 4, null));
            } catch (var9: java.lang.Throwable) {
               val var12: a = eh.r.k;
               var13 = eh.r.b(s.a(var9));
               break label43;
            }

            if (eh.r.e(var13) != null) {
               val var17: java.lang.String = Hosts.INSTANCE.getAPI();
               val var20: StringBuilder = new StringBuilder();
               var20.append(var17);
               var20.append("/users/");
               var20.append(var2);
               var20.append("/avatars/");
               var20.append(var3);
               var20.append(".jpg");
               var13 = var20.toString();
            }

            return var13 as java.lang.String;
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
      r.h(var1, "context");
      Hosts.INSTANCE.init(var1, var3, var2);
   }
}
