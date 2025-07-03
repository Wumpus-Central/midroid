package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class GuildProfileInviteViewBinding implements ViewBinding {
   public final DCDButton acceptButton;
   public final GuildView avatar;
   public final FrameLayout avatarContainer;
   public final Barrier barrier;
   public final TextView bodyText;
   public final TextView establishedText;
   public final SimpleDraweeView guildBadge;
   public final TextView headerText;
   public final ImageView itemInviteOnlineDot;
   public final TextView itemInviteOnlineText;
   public final SimpleDraweeView itemInviteSplash;
   public final ImageView itemInviteTotalMemberDot;
   public final TextView itemInviteTotalMemberText;
   public final View overlayGradient;
   private final View rootView;
   public final Barrier serverNameBarrier;
   public final View spacer;
   public final TextView titleText;

   private GuildProfileInviteViewBinding(
      View var1,
      DCDButton var2,
      GuildView var3,
      FrameLayout var4,
      Barrier var5,
      TextView var6,
      TextView var7,
      SimpleDraweeView var8,
      TextView var9,
      ImageView var10,
      TextView var11,
      SimpleDraweeView var12,
      ImageView var13,
      TextView var14,
      View var15,
      Barrier var16,
      View var17,
      TextView var18
   ) {
      this.rootView = var1;
      this.acceptButton = var2;
      this.avatar = var3;
      this.avatarContainer = var4;
      this.barrier = var5;
      this.bodyText = var6;
      this.establishedText = var7;
      this.guildBadge = var8;
      this.headerText = var9;
      this.itemInviteOnlineDot = var10;
      this.itemInviteOnlineText = var11;
      this.itemInviteSplash = var12;
      this.itemInviteTotalMemberDot = var13;
      this.itemInviteTotalMemberText = var14;
      this.overlayGradient = var15;
      this.serverNameBarrier = var16;
      this.spacer = var17;
      this.titleText = var18;
   }

   public static GuildProfileInviteViewBinding bind(View var0) {
      int var1 = R.id.accept_button;
      DCDButton var4 = (DCDButton)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.avatar;
         GuildView var17 = (GuildView)a.a(var0, var1);
         if (var17 != null) {
            var1 = R.id.avatar_container;
            FrameLayout var18 = (FrameLayout)a.a(var0, var1);
            if (var18 != null) {
               var1 = R.id.barrier;
               Barrier var2 = (Barrier)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.body_text;
                  TextView var15 = (TextView)a.a(var0, var1);
                  if (var15 != null) {
                     var1 = R.id.established_text;
                     TextView var6 = (TextView)a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.guild_badge;
                        SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                        if (var7 != null) {
                           var1 = R.id.header_text;
                           TextView var8 = (TextView)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.item_invite_online_dot;
                              ImageView var9 = (ImageView)a.a(var0, var1);
                              if (var9 != null) {
                                 var1 = R.id.item_invite_online_text;
                                 TextView var10 = (TextView)a.a(var0, var1);
                                 if (var10 != null) {
                                    var1 = R.id.item_invite_splash;
                                    SimpleDraweeView var16 = (SimpleDraweeView)a.a(var0, var1);
                                    if (var16 != null) {
                                       var1 = R.id.item_invite_total_member_dot;
                                       ImageView var5 = (ImageView)a.a(var0, var1);
                                       if (var5 != null) {
                                          var1 = R.id.item_invite_total_member_text;
                                          TextView var14 = (TextView)a.a(var0, var1);
                                          if (var14 != null) {
                                             var1 = R.id.overlay_gradient;
                                             View var3 = a.a(var0, var1);
                                             if (var3 != null) {
                                                var1 = R.id.server_name_barrier;
                                                Barrier var12 = (Barrier)a.a(var0, var1);
                                                if (var12 != null) {
                                                   var1 = R.id.spacer;
                                                   View var11 = a.a(var0, var1);
                                                   if (var11 != null) {
                                                      var1 = R.id.title_text;
                                                      TextView var13 = (TextView)a.a(var0, var1);
                                                      if (var13 != null) {
                                                         return new GuildProfileInviteViewBinding(
                                                            var0,
                                                            var4,
                                                            var17,
                                                            var18,
                                                            var2,
                                                            var15,
                                                            var6,
                                                            var7,
                                                            var8,
                                                            var9,
                                                            var10,
                                                            var16,
                                                            var5,
                                                            var14,
                                                            var3,
                                                            var12,
                                                            var11,
                                                            var13
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static GuildProfileInviteViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_profile_invite_view, var1);
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
