package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class GuildInviteViewBinding implements ViewBinding {
   public final Barrier barrierButton;
   public final Barrier barrierHeader;
   public final ConstraintLayout itemBottomContainer;
   public final SimpleDraweeView itemGuildBadge;
   public final TextView itemInviteHeader;
   public final FrameLayout itemInviteHubLayout;
   public final TextView itemInviteHubLink;
   public final GuildView itemInviteImage;
   public final DCDButton itemInviteJoinedButton;
   public final LinearLayout itemInviteMemberContainer;
   public final ImageView itemInviteOnlineDot;
   public final TextView itemInviteOnlineText;
   public final SimpleDraweeView itemInviteSplash;
   public final TextView itemInviteSubtitle;
   public final SimpleDraweeView itemInviteSubtitleIcon;
   public final TextView itemInviteTitle;
   public final ImageView itemInviteTotalMemberDot;
   public final TextView itemInviteTotalMemberText;
   private final View rootView;

   private GuildInviteViewBinding(
      View var1,
      Barrier var2,
      Barrier var3,
      ConstraintLayout var4,
      SimpleDraweeView var5,
      TextView var6,
      FrameLayout var7,
      TextView var8,
      GuildView var9,
      DCDButton var10,
      LinearLayout var11,
      ImageView var12,
      TextView var13,
      SimpleDraweeView var14,
      TextView var15,
      SimpleDraweeView var16,
      TextView var17,
      ImageView var18,
      TextView var19
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

   public static GuildInviteViewBinding bind(View var0) {
      int var1 = R.id.barrier_button;
      Barrier var19 = (Barrier)a.a(var0, var1);
      if (var19 != null) {
         var1 = R.id.barrier_header;
         Barrier var18 = (Barrier)a.a(var0, var1);
         if (var18 != null) {
            var1 = R.id.item_bottom_container;
            ConstraintLayout var10 = (ConstraintLayout)a.a(var0, var1);
            if (var10 != null) {
               var1 = R.id.item_guild_badge;
               SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
               if (var13 != null) {
                  var1 = R.id.item_invite_header;
                  TextView var11 = (TextView)a.a(var0, var1);
                  if (var11 != null) {
                     var1 = R.id.item_invite_hub_layout;
                     FrameLayout var6 = (FrameLayout)a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.item_invite_hub_link;
                        TextView var5 = (TextView)a.a(var0, var1);
                        if (var5 != null) {
                           var1 = R.id.item_invite_image;
                           GuildView var4 = (GuildView)a.a(var0, var1);
                           if (var4 != null) {
                              var1 = R.id.item_invite_joined_button;
                              DCDButton var12 = (DCDButton)a.a(var0, var1);
                              if (var12 != null) {
                                 var1 = R.id.item_invite_member_container;
                                 LinearLayout var9 = (LinearLayout)a.a(var0, var1);
                                 if (var9 != null) {
                                    var1 = R.id.item_invite_online_dot;
                                    ImageView var14 = (ImageView)a.a(var0, var1);
                                    if (var14 != null) {
                                       var1 = R.id.item_invite_online_text;
                                       TextView var15 = (TextView)a.a(var0, var1);
                                       if (var15 != null) {
                                          var1 = R.id.item_invite_splash;
                                          SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                                          if (var2 != null) {
                                             var1 = R.id.item_invite_subtitle;
                                             TextView var7 = (TextView)a.a(var0, var1);
                                             if (var7 != null) {
                                                var1 = R.id.item_invite_subtitle_icon;
                                                SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                                                if (var3 != null) {
                                                   var1 = R.id.item_invite_title;
                                                   TextView var17 = (TextView)a.a(var0, var1);
                                                   if (var17 != null) {
                                                      var1 = R.id.item_invite_total_member_dot;
                                                      ImageView var16 = (ImageView)a.a(var0, var1);
                                                      if (var16 != null) {
                                                         var1 = R.id.item_invite_total_member_text;
                                                         TextView var8 = (TextView)a.a(var0, var1);
                                                         if (var8 != null) {
                                                            return new GuildInviteViewBinding(
                                                               var0,
                                                               var19,
                                                               var18,
                                                               var10,
                                                               var13,
                                                               var11,
                                                               var6,
                                                               var5,
                                                               var4,
                                                               var12,
                                                               var9,
                                                               var14,
                                                               var15,
                                                               var2,
                                                               var7,
                                                               var3,
                                                               var17,
                                                               var16,
                                                               var8
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

   public static GuildInviteViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_invite_view, var1);
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
