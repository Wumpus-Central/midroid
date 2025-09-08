package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class GuildInviteViewBinding implements ViewBinding {
   @NonNull
   public final Barrier barrierButton;
   @NonNull
   public final Barrier barrierHeader;
   @NonNull
   public final ConstraintLayout itemBottomContainer;
   @NonNull
   public final SimpleDraweeView itemGuildBadge;
   @NonNull
   public final TextView itemInviteHeader;
   @NonNull
   public final FrameLayout itemInviteHubLayout;
   @NonNull
   public final TextView itemInviteHubLink;
   @NonNull
   public final GuildView itemInviteImage;
   @NonNull
   public final DCDButton itemInviteJoinedButton;
   @NonNull
   public final LinearLayout itemInviteMemberContainer;
   @NonNull
   public final ImageView itemInviteOnlineDot;
   @NonNull
   public final TextView itemInviteOnlineText;
   @NonNull
   public final SimpleDraweeView itemInviteSplash;
   @NonNull
   public final TextView itemInviteSubtitle;
   @NonNull
   public final SimpleDraweeView itemInviteSubtitleIcon;
   @NonNull
   public final TextView itemInviteTitle;
   @NonNull
   public final ImageView itemInviteTotalMemberDot;
   @NonNull
   public final TextView itemInviteTotalMemberText;
   @NonNull
   private final View rootView;

   private GuildInviteViewBinding(
      @NonNull View var1,
      @NonNull Barrier var2,
      @NonNull Barrier var3,
      @NonNull ConstraintLayout var4,
      @NonNull SimpleDraweeView var5,
      @NonNull TextView var6,
      @NonNull FrameLayout var7,
      @NonNull TextView var8,
      @NonNull GuildView var9,
      @NonNull DCDButton var10,
      @NonNull LinearLayout var11,
      @NonNull ImageView var12,
      @NonNull TextView var13,
      @NonNull SimpleDraweeView var14,
      @NonNull TextView var15,
      @NonNull SimpleDraweeView var16,
      @NonNull TextView var17,
      @NonNull ImageView var18,
      @NonNull TextView var19
   ) {
      this.rootView = var1;
      this.barrierButton = var2;
      this.barrierHeader = var3;
      this.itemBottomContainer = var4;
      this.itemGuildBadge = var5;
      this.itemInviteHeader = var6;
      this.itemInviteHubLayout = var7;
      this.itemInviteHubLink = var8;
      this.itemInviteImage = var9;
      this.itemInviteJoinedButton = var10;
      this.itemInviteMemberContainer = var11;
      this.itemInviteOnlineDot = var12;
      this.itemInviteOnlineText = var13;
      this.itemInviteSplash = var14;
      this.itemInviteSubtitle = var15;
      this.itemInviteSubtitleIcon = var16;
      this.itemInviteTitle = var17;
      this.itemInviteTotalMemberDot = var18;
      this.itemInviteTotalMemberText = var19;
   }

   @NonNull
   public static GuildInviteViewBinding bind(@NonNull View var0) {
      int var1 = R.id.barrier_button;
      Barrier var18 = (Barrier)a.a(var0, var1);
      if (var18 != null) {
         var1 = R.id.barrier_header;
         Barrier var3 = (Barrier)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.item_bottom_container;
            ConstraintLayout var7 = (ConstraintLayout)a.a(var0, var1);
            if (var7 != null) {
               var1 = R.id.item_guild_badge;
               SimpleDraweeView var12 = (SimpleDraweeView)a.a(var0, var1);
               if (var12 != null) {
                  var1 = R.id.item_invite_header;
                  TextView var8 = (TextView)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.item_invite_hub_layout;
                     FrameLayout var19 = (FrameLayout)a.a(var0, var1);
                     if (var19 != null) {
                        var1 = R.id.item_invite_hub_link;
                        TextView var15 = (TextView)a.a(var0, var1);
                        if (var15 != null) {
                           var1 = R.id.item_invite_image;
                           GuildView var16 = (GuildView)a.a(var0, var1);
                           if (var16 != null) {
                              var1 = R.id.item_invite_joined_button;
                              DCDButton var13 = (DCDButton)a.a(var0, var1);
                              if (var13 != null) {
                                 var1 = R.id.item_invite_member_container;
                                 LinearLayout var6 = (LinearLayout)a.a(var0, var1);
                                 if (var6 != null) {
                                    var1 = R.id.item_invite_online_dot;
                                    ImageView var14 = (ImageView)a.a(var0, var1);
                                    if (var14 != null) {
                                       var1 = R.id.item_invite_online_text;
                                       TextView var10 = (TextView)a.a(var0, var1);
                                       if (var10 != null) {
                                          var1 = R.id.item_invite_splash;
                                          SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
                                          if (var17 != null) {
                                             var1 = R.id.item_invite_subtitle;
                                             TextView var2 = (TextView)a.a(var0, var1);
                                             if (var2 != null) {
                                                var1 = R.id.item_invite_subtitle_icon;
                                                SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                                                if (var5 != null) {
                                                   var1 = R.id.item_invite_title;
                                                   TextView var9 = (TextView)a.a(var0, var1);
                                                   if (var9 != null) {
                                                      var1 = R.id.item_invite_total_member_dot;
                                                      ImageView var11 = (ImageView)a.a(var0, var1);
                                                      if (var11 != null) {
                                                         var1 = R.id.item_invite_total_member_text;
                                                         TextView var4 = (TextView)a.a(var0, var1);
                                                         if (var4 != null) {
                                                            return new GuildInviteViewBinding(
                                                               var0,
                                                               var18,
                                                               var3,
                                                               var7,
                                                               var12,
                                                               var8,
                                                               var19,
                                                               var15,
                                                               var16,
                                                               var13,
                                                               var6,
                                                               var14,
                                                               var10,
                                                               var17,
                                                               var2,
                                                               var5,
                                                               var9,
                                                               var11,
                                                               var4
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

   @NonNull
   public static GuildInviteViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_invite_view, var1);
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
