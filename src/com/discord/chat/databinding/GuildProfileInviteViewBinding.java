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
import u0.a;

public final class GuildProfileInviteViewBinding implements ViewBinding {
   public final DCDButton acceptButton;
   public final GuildView avatar;
   public final FrameLayout avatarContainer;
   public final Barrier barrier;
   public final TextView bodyText;
   public final View divider;
   public final SimpleDraweeView guildBadge;
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
      View var7,
      SimpleDraweeView var8,
      ImageView var9,
      TextView var10,
      SimpleDraweeView var11,
      ImageView var12,
      TextView var13,
      View var14,
      Barrier var15,
      View var16,
      TextView var17
   ) {
      this.rootView = var1;
      this.acceptButton = var2;
      this.avatar = var3;
      this.avatarContainer = var4;
      this.barrier = var5;
      this.bodyText = var6;
      this.divider = var7;
      this.guildBadge = var8;
      this.itemInviteOnlineDot = var9;
      this.itemInviteOnlineText = var10;
      this.itemInviteSplash = var11;
      this.itemInviteTotalMemberDot = var12;
      this.itemInviteTotalMemberText = var13;
      this.overlayGradient = var14;
      this.serverNameBarrier = var15;
      this.spacer = var16;
      this.titleText = var17;
   }

   public static GuildProfileInviteViewBinding bind(View var0) {
      int var1 = R.id.accept_button;
      DCDButton var11 = (DCDButton)a.a(var0, var1);
      if (var11 != null) {
         var1 = R.id.avatar;
         GuildView var7 = (GuildView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.avatar_container;
            FrameLayout var15 = (FrameLayout)a.a(var0, var1);
            if (var15 != null) {
               var1 = R.id.barrier;
               Barrier var6 = (Barrier)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.body_text;
                  TextView var8 = (TextView)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.divider;
                     View var16 = a.a(var0, var1);
                     if (var16 != null) {
                        var1 = R.id.guild_badge;
                        SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.item_invite_online_dot;
                           ImageView var5 = (ImageView)a.a(var0, var1);
                           if (var5 != null) {
                              var1 = R.id.item_invite_online_text;
                              TextView var3 = (TextView)a.a(var0, var1);
                              if (var3 != null) {
                                 var1 = R.id.item_invite_splash;
                                 SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
                                 if (var17 != null) {
                                    var1 = R.id.item_invite_total_member_dot;
                                    ImageView var13 = (ImageView)a.a(var0, var1);
                                    if (var13 != null) {
                                       var1 = R.id.item_invite_total_member_text;
                                       TextView var9 = (TextView)a.a(var0, var1);
                                       if (var9 != null) {
                                          var1 = R.id.overlay_gradient;
                                          View var14 = a.a(var0, var1);
                                          if (var14 != null) {
                                             var1 = R.id.server_name_barrier;
                                             Barrier var10 = (Barrier)a.a(var0, var1);
                                             if (var10 != null) {
                                                var1 = R.id.spacer;
                                                View var4 = a.a(var0, var1);
                                                if (var4 != null) {
                                                   var1 = R.id.title_text;
                                                   TextView var12 = (TextView)a.a(var0, var1);
                                                   if (var12 != null) {
                                                      return new GuildProfileInviteViewBinding(
                                                         var0,
                                                         var11,
                                                         var7,
                                                         var15,
                                                         var6,
                                                         var8,
                                                         var16,
                                                         var2,
                                                         var5,
                                                         var3,
                                                         var17,
                                                         var13,
                                                         var9,
                                                         var14,
                                                         var10,
                                                         var4,
                                                         var12
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
