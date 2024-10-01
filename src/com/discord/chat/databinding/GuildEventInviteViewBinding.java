package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class GuildEventInviteViewBinding implements ViewBinding {
   public final DCDButton acceptButton;
   public final ConstraintLayout badgeContainer;
   public final SimpleDraweeView badgeIcon;
   public final TextView badgeText;
   public final Barrier channelBottomBarrier;
   public final SimpleDraweeView channelIcon;
   public final TextView channelName;
   public final Barrier channelStartBarrier;
   public final Barrier channelTopBarrier;
   public final SimpleDraweeView creatorAvatar;
   public final MessageContentView descriptionText;
   public final SimpleDraweeView guildIcon;
   public final TextView guildName;
   public final Barrier headerBarrier;
   public final SimpleDraweeView headerIcon;
   public final TextView headerText;
   private final View rootView;
   public final SimpleDraweeView secondaryButton;
   public final TextView titleText;

   private GuildEventInviteViewBinding(
      View var1,
      DCDButton var2,
      ConstraintLayout var3,
      SimpleDraweeView var4,
      TextView var5,
      Barrier var6,
      SimpleDraweeView var7,
      TextView var8,
      Barrier var9,
      Barrier var10,
      SimpleDraweeView var11,
      MessageContentView var12,
      SimpleDraweeView var13,
      TextView var14,
      Barrier var15,
      SimpleDraweeView var16,
      TextView var17,
      SimpleDraweeView var18,
      TextView var19
   ) {
      this.rootView = var1;
      this.acceptButton = var2;
      this.badgeContainer = var3;
      this.badgeIcon = var4;
      this.badgeText = var5;
      this.channelBottomBarrier = var6;
      this.channelIcon = var7;
      this.channelName = var8;
      this.channelStartBarrier = var9;
      this.channelTopBarrier = var10;
      this.creatorAvatar = var11;
      this.descriptionText = var12;
      this.guildIcon = var13;
      this.guildName = var14;
      this.headerBarrier = var15;
      this.headerIcon = var16;
      this.headerText = var17;
      this.secondaryButton = var18;
      this.titleText = var19;
   }

   public static GuildEventInviteViewBinding bind(View var0) {
      int var1 = R.id.accept_button;
      DCDButton var16 = (DCDButton)a.a(var0, var1);
      if (var16 != null) {
         var1 = R.id.badge_container;
         ConstraintLayout var19 = (ConstraintLayout)a.a(var0, var1);
         if (var19 != null) {
            var1 = R.id.badge_icon;
            SimpleDraweeView var18 = (SimpleDraweeView)a.a(var0, var1);
            if (var18 != null) {
               var1 = R.id.badge_text;
               TextView var10 = (TextView)a.a(var0, var1);
               if (var10 != null) {
                  var1 = R.id.channel_bottom_barrier;
                  Barrier var15 = (Barrier)a.a(var0, var1);
                  if (var15 != null) {
                     var1 = R.id.channel_icon;
                     SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.channel_name;
                        TextView var12 = (TextView)a.a(var0, var1);
                        if (var12 != null) {
                           var1 = R.id.channel_start_barrier;
                           Barrier var7 = (Barrier)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.channel_top_barrier;
                              Barrier var2 = (Barrier)a.a(var0, var1);
                              if (var2 != null) {
                                 var1 = R.id.creator_avatar;
                                 SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                                 if (var3 != null) {
                                    var1 = R.id.description_text;
                                    MessageContentView var17 = (MessageContentView)a.a(var0, var1);
                                    if (var17 != null) {
                                       var1 = R.id.guild_icon;
                                       SimpleDraweeView var11 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var11 != null) {
                                          var1 = R.id.guild_name;
                                          TextView var6 = (TextView)a.a(var0, var1);
                                          if (var6 != null) {
                                             var1 = R.id.header_barrier;
                                             Barrier var4 = (Barrier)a.a(var0, var1);
                                             if (var4 != null) {
                                                var1 = R.id.header_icon;
                                                SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                                                if (var8 != null) {
                                                   var1 = R.id.header_text;
                                                   TextView var14 = (TextView)a.a(var0, var1);
                                                   if (var14 != null) {
                                                      var1 = R.id.secondary_button;
                                                      SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
                                                      if (var13 != null) {
                                                         var1 = R.id.title_text;
                                                         TextView var9 = (TextView)a.a(var0, var1);
                                                         if (var9 != null) {
                                                            return new GuildEventInviteViewBinding(
                                                               var0,
                                                               var16,
                                                               var19,
                                                               var18,
                                                               var10,
                                                               var15,
                                                               var5,
                                                               var12,
                                                               var7,
                                                               var2,
                                                               var3,
                                                               var17,
                                                               var11,
                                                               var6,
                                                               var4,
                                                               var8,
                                                               var14,
                                                               var13,
                                                               var9
                                                            );
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static GuildEventInviteViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_event_invite_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
