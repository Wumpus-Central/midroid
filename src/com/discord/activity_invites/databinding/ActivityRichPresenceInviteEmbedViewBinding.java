package com.discord.activity_invites.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.activity_invites.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ActivityRichPresenceInviteEmbedViewBinding implements ViewBinding {
   @NonNull
   public final LinearLayout actionWrapper;
   @NonNull
   public final SimpleDraweeView activityIcon;
   @NonNull
   public final DCDButton button;
   @NonNull
   public final ConstraintLayout contentContainer;
   @NonNull
   public final SimpleDraweeView desktopIcon;
   @NonNull
   public final ConstraintLayout footerContainer;
   @NonNull
   public final LinearLayout footerContent;
   @NonNull
   public final TextView footerLabel;
   @NonNull
   public final View gradientBackground;
   @NonNull
   public final TextView headerText;
   @NonNull
   public final OverlappingCirclesView partyAvatars;
   @NonNull
   public final ConstraintLayout partyContainer;
   @NonNull
   public final TextView partySizeText;
   @NonNull
   public final SimpleDraweeView playstationIcon;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView subtitle;
   @NonNull
   public final ConstraintLayout subtitleContainer;
   @NonNull
   public final SimpleDraweeView subtitleIcon;
   @NonNull
   public final LinearLayout textContentWrapper;
   @NonNull
   public final TextView title;
   @NonNull
   public final SimpleDraweeView xboxIcon;

   private ActivityRichPresenceInviteEmbedViewBinding(
      @NonNull View var1,
      @NonNull LinearLayout var2,
      @NonNull SimpleDraweeView var3,
      @NonNull DCDButton var4,
      @NonNull ConstraintLayout var5,
      @NonNull SimpleDraweeView var6,
      @NonNull ConstraintLayout var7,
      @NonNull LinearLayout var8,
      @NonNull TextView var9,
      @NonNull View var10,
      @NonNull TextView var11,
      @NonNull OverlappingCirclesView var12,
      @NonNull ConstraintLayout var13,
      @NonNull TextView var14,
      @NonNull SimpleDraweeView var15,
      @NonNull TextView var16,
      @NonNull ConstraintLayout var17,
      @NonNull SimpleDraweeView var18,
      @NonNull LinearLayout var19,
      @NonNull TextView var20,
      @NonNull SimpleDraweeView var21
   ) {
      this.rootView = var1;
      this.actionWrapper = var2;
      this.activityIcon = var3;
      this.button = var4;
      this.contentContainer = var5;
      this.desktopIcon = var6;
      this.footerContainer = var7;
      this.footerContent = var8;
      this.footerLabel = var9;
      this.gradientBackground = var10;
      this.headerText = var11;
      this.partyAvatars = var12;
      this.partyContainer = var13;
      this.partySizeText = var14;
      this.playstationIcon = var15;
      this.subtitle = var16;
      this.subtitleContainer = var17;
      this.subtitleIcon = var18;
      this.textContentWrapper = var19;
      this.title = var20;
      this.xboxIcon = var21;
   }

   @NonNull
   public static ActivityRichPresenceInviteEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.action_wrapper;
      LinearLayout var10 = (LinearLayout)a.a(var0, var1);
      if (var10 != null) {
         var1 = R.id.activity_icon;
         SimpleDraweeView var19 = (SimpleDraweeView)a.a(var0, var1);
         if (var19 != null) {
            var1 = R.id.button;
            DCDButton var5 = (DCDButton)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.content_container;
               ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.desktop_icon;
                  SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.footer_container;
                     ConstraintLayout var8 = (ConstraintLayout)a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.footer_content;
                        LinearLayout var9 = (LinearLayout)a.a(var0, var1);
                        if (var9 != null) {
                           var1 = R.id.footer_label;
                           TextView var15 = (TextView)a.a(var0, var1);
                           if (var15 != null) {
                              var1 = R.id.gradient_background;
                              View var12 = a.a(var0, var1);
                              if (var12 != null) {
                                 var1 = R.id.header_text;
                                 TextView var14 = (TextView)a.a(var0, var1);
                                 if (var14 != null) {
                                    var1 = R.id.party_avatars;
                                    OverlappingCirclesView var20 = (OverlappingCirclesView)a.a(var0, var1);
                                    if (var20 != null) {
                                       var1 = R.id.party_container;
                                       ConstraintLayout var3 = (ConstraintLayout)a.a(var0, var1);
                                       if (var3 != null) {
                                          var1 = R.id.party_size_text;
                                          TextView var6 = (TextView)a.a(var0, var1);
                                          if (var6 != null) {
                                             var1 = R.id.playstation_icon;
                                             SimpleDraweeView var16 = (SimpleDraweeView)a.a(var0, var1);
                                             if (var16 != null) {
                                                var1 = R.id.subtitle;
                                                TextView var11 = (TextView)a.a(var0, var1);
                                                if (var11 != null) {
                                                   var1 = R.id.subtitle_container;
                                                   ConstraintLayout var21 = (ConstraintLayout)a.a(var0, var1);
                                                   if (var21 != null) {
                                                      var1 = R.id.subtitle_icon;
                                                      SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
                                                      if (var17 != null) {
                                                         var1 = R.id.text_content_wrapper;
                                                         LinearLayout var18 = (LinearLayout)a.a(var0, var1);
                                                         if (var18 != null) {
                                                            var1 = R.id.title;
                                                            TextView var7 = (TextView)a.a(var0, var1);
                                                            if (var7 != null) {
                                                               var1 = R.id.xbox_icon;
                                                               SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
                                                               if (var13 != null) {
                                                                  return new ActivityRichPresenceInviteEmbedViewBinding(
                                                                     var0,
                                                                     var10,
                                                                     var19,
                                                                     var5,
                                                                     var2,
                                                                     var4,
                                                                     var8,
                                                                     var9,
                                                                     var15,
                                                                     var12,
                                                                     var14,
                                                                     var20,
                                                                     var3,
                                                                     var6,
                                                                     var16,
                                                                     var11,
                                                                     var21,
                                                                     var17,
                                                                     var18,
                                                                     var7,
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
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ActivityRichPresenceInviteEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.activity_rich_presence_invite_embed_view, var1);
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
