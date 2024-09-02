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
import v2.a;

public final class GuildInviteViewBinding implements ViewBinding {
   public final Barrier barrierButton;
   public final Barrier barrierHeader;
   public final ConstraintLayout itemBottomContainer;
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
      TextView var5,
      FrameLayout var6,
      TextView var7,
      GuildView var8,
      DCDButton var9,
      LinearLayout var10,
      ImageView var11,
      TextView var12,
      SimpleDraweeView var13,
      TextView var14,
      SimpleDraweeView var15,
      TextView var16,
      ImageView var17,
      TextView var18
   ) {
      this.rootView = var1;
      this.barrierButton = var2;
      this.barrierHeader = var3;
      this.itemBottomContainer = var4;
      this.itemInviteHeader = var5;
      this.itemInviteHubLayout = var6;
      this.itemInviteHubLink = var7;
      this.itemInviteImage = var8;
      this.itemInviteJoinedButton = var9;
      this.itemInviteMemberContainer = var10;
      this.itemInviteOnlineDot = var11;
      this.itemInviteOnlineText = var12;
      this.itemInviteSplash = var13;
      this.itemInviteSubtitle = var14;
      this.itemInviteSubtitleIcon = var15;
      this.itemInviteTitle = var16;
      this.itemInviteTotalMemberDot = var17;
      this.itemInviteTotalMemberText = var18;
   }

   public static GuildInviteViewBinding bind(View var0) {
      int var1 = R.id.barrier_button;
      Barrier var5 = (Barrier)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.barrier_header;
         Barrier var13 = (Barrier)a.a(var0, var1);
         if (var13 != null) {
            var1 = R.id.item_bottom_container;
            ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.item_invite_header;
               TextView var4 = (TextView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.item_invite_hub_layout;
                  FrameLayout var12 = (FrameLayout)a.a(var0, var1);
                  if (var12 != null) {
                     var1 = R.id.item_invite_hub_link;
                     TextView var2 = (TextView)a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.item_invite_image;
                        GuildView var3 = (GuildView)a.a(var0, var1);
                        if (var3 != null) {
                           var1 = R.id.item_invite_joined_button;
                           DCDButton var8 = (DCDButton)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.item_invite_member_container;
                              LinearLayout var7 = (LinearLayout)a.a(var0, var1);
                              if (var7 != null) {
                                 var1 = R.id.item_invite_online_dot;
                                 ImageView var16 = (ImageView)a.a(var0, var1);
                                 if (var16 != null) {
                                    var1 = R.id.item_invite_online_text;
                                    TextView var18 = (TextView)a.a(var0, var1);
                                    if (var18 != null) {
                                       var1 = R.id.item_invite_splash;
                                       SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var17 != null) {
                                          var1 = R.id.item_invite_subtitle;
                                          TextView var10 = (TextView)a.a(var0, var1);
                                          if (var10 != null) {
                                             var1 = R.id.item_invite_subtitle_icon;
                                             SimpleDraweeView var14 = (SimpleDraweeView)a.a(var0, var1);
                                             if (var14 != null) {
                                                var1 = R.id.item_invite_title;
                                                TextView var11 = (TextView)a.a(var0, var1);
                                                if (var11 != null) {
                                                   var1 = R.id.item_invite_total_member_dot;
                                                   ImageView var9 = (ImageView)a.a(var0, var1);
                                                   if (var9 != null) {
                                                      var1 = R.id.item_invite_total_member_text;
                                                      TextView var15 = (TextView)a.a(var0, var1);
                                                      if (var15 != null) {
                                                         return new GuildInviteViewBinding(
                                                            var0,
                                                            var5,
                                                            var13,
                                                            var6,
                                                            var4,
                                                            var12,
                                                            var2,
                                                            var3,
                                                            var8,
                                                            var7,
                                                            var16,
                                                            var18,
                                                            var17,
                                                            var10,
                                                            var14,
                                                            var11,
                                                            var9,
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
