package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;

public final class GuildProfileInviteViewBinding implements ViewBinding {
   @NonNull
   public final DCDButton acceptButton;
   @NonNull
   public final GuildView avatar;
   @NonNull
   public final FrameLayout avatarContainer;
   @NonNull
   public final Barrier barrier;
   @NonNull
   public final TextView bodyText;
   @NonNull
   public final TextView establishedText;
   @NonNull
   public final SimpleDraweeView guildBadge;
   @NonNull
   public final TextView headerText;
   @NonNull
   public final ImageView itemInviteOnlineDot;
   @NonNull
   public final TextView itemInviteOnlineText;
   @NonNull
   public final SimpleDraweeView itemInviteSplash;
   @NonNull
   public final ImageView itemInviteTotalMemberDot;
   @NonNull
   public final TextView itemInviteTotalMemberText;
   @NonNull
   public final View overlayGradient;
   @NonNull
   private final View rootView;
   @NonNull
   public final Barrier serverNameBarrier;
   @NonNull
   public final View spacer;
   @NonNull
   public final TextView titleText;

   private GuildProfileInviteViewBinding(
      @NonNull View var1,
      @NonNull DCDButton var2,
      @NonNull GuildView var3,
      @NonNull FrameLayout var4,
      @NonNull Barrier var5,
      @NonNull TextView var6,
      @NonNull TextView var7,
      @NonNull SimpleDraweeView var8,
      @NonNull TextView var9,
      @NonNull ImageView var10,
      @NonNull TextView var11,
      @NonNull SimpleDraweeView var12,
      @NonNull ImageView var13,
      @NonNull TextView var14,
      @NonNull View var15,
      @NonNull Barrier var16,
      @NonNull View var17,
      @NonNull TextView var18
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

   @NonNull
   public static GuildProfileInviteViewBinding bind(@NonNull View var0) {
      int var1 = R.id.accept_button;
      DCDButton var14 = (DCDButton)k5.a.a(var0, var1);
      if (var14 != null) {
         var1 = R.id.avatar;
         GuildView var6 = (GuildView)k5.a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.avatar_container;
            FrameLayout var16 = (FrameLayout)k5.a.a(var0, var1);
            if (var16 != null) {
               var1 = R.id.barrier;
               Barrier var8 = (Barrier)k5.a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.body_text;
                  TextView var2 = (TextView)k5.a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.established_text;
                     TextView var17 = (TextView)k5.a.a(var0, var1);
                     if (var17 != null) {
                        var1 = R.id.guild_badge;
                        SimpleDraweeView var11 = (SimpleDraweeView)k5.a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.header_text;
                           TextView var9 = (TextView)k5.a.a(var0, var1);
                           if (var9 != null) {
                              var1 = R.id.item_invite_online_dot;
                              ImageView var4 = (ImageView)k5.a.a(var0, var1);
                              if (var4 != null) {
                                 var1 = R.id.item_invite_online_text;
                                 TextView var18 = (TextView)k5.a.a(var0, var1);
                                 if (var18 != null) {
                                    var1 = R.id.item_invite_splash;
                                    SimpleDraweeView var7 = (SimpleDraweeView)k5.a.a(var0, var1);
                                    if (var7 != null) {
                                       var1 = R.id.item_invite_total_member_dot;
                                       ImageView var3 = (ImageView)k5.a.a(var0, var1);
                                       if (var3 != null) {
                                          var1 = R.id.item_invite_total_member_text;
                                          TextView var5 = (TextView)k5.a.a(var0, var1);
                                          if (var5 != null) {
                                             var1 = R.id.overlay_gradient;
                                             View var12 = k5.a.a(var0, var1);
                                             if (var12 != null) {
                                                var1 = R.id.server_name_barrier;
                                                Barrier var10 = (Barrier)k5.a.a(var0, var1);
                                                if (var10 != null) {
                                                   var1 = R.id.spacer;
                                                   View var13 = k5.a.a(var0, var1);
                                                   if (var13 != null) {
                                                      var1 = R.id.title_text;
                                                      TextView var15 = (TextView)k5.a.a(var0, var1);
                                                      if (var15 != null) {
                                                         return new GuildProfileInviteViewBinding(
                                                            var0,
                                                            var14,
                                                            var6,
                                                            var16,
                                                            var8,
                                                            var2,
                                                            var17,
                                                            var11,
                                                            var9,
                                                            var4,
                                                            var18,
                                                            var7,
                                                            var3,
                                                            var5,
                                                            var12,
                                                            var10,
                                                            var13,
                                                            var15
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

   @NonNull
   public static GuildProfileInviteViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_profile_invite_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @NonNull
   @Override
   public View getRoot() {
      return this.rootView;
   }
}
