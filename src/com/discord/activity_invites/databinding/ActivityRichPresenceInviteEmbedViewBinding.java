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
      @NonNull SimpleDraweeView var2,
      @NonNull DCDButton var3,
      @NonNull ConstraintLayout var4,
      @NonNull SimpleDraweeView var5,
      @NonNull ConstraintLayout var6,
      @NonNull LinearLayout var7,
      @NonNull TextView var8,
      @NonNull View var9,
      @NonNull TextView var10,
      @NonNull OverlappingCirclesView var11,
      @NonNull ConstraintLayout var12,
      @NonNull TextView var13,
      @NonNull SimpleDraweeView var14,
      @NonNull TextView var15,
      @NonNull ConstraintLayout var16,
      @NonNull SimpleDraweeView var17,
      @NonNull LinearLayout var18,
      @NonNull TextView var19,
      @NonNull SimpleDraweeView var20
   ) {
      this.rootView = var1;
      this.activityIcon = var2;
      this.button = var3;
      this.contentContainer = var4;
      this.desktopIcon = var5;
      this.footerContainer = var6;
      this.footerContent = var7;
      this.footerLabel = var8;
      this.gradientBackground = var9;
      this.headerText = var10;
      this.partyAvatars = var11;
      this.partyContainer = var12;
      this.partySizeText = var13;
      this.playstationIcon = var14;
      this.subtitle = var15;
      this.subtitleContainer = var16;
      this.subtitleIcon = var17;
      this.textContentWrapper = var18;
      this.title = var19;
      this.xboxIcon = var20;
   }

   @NonNull
   public static ActivityRichPresenceInviteEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.activity_icon;
      SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
      if (var13 != null) {
         var1 = R.id.button;
         DCDButton var6 = (DCDButton)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.content_container;
            ConstraintLayout var18 = (ConstraintLayout)a.a(var0, var1);
            if (var18 != null) {
               var1 = R.id.desktop_icon;
               SimpleDraweeView var20 = (SimpleDraweeView)a.a(var0, var1);
               if (var20 != null) {
                  var1 = R.id.footer_container;
                  ConstraintLayout var11 = (ConstraintLayout)a.a(var0, var1);
                  if (var11 != null) {
                     var1 = R.id.footer_content;
                     LinearLayout var9 = (LinearLayout)a.a(var0, var1);
                     if (var9 != null) {
                        var1 = R.id.footer_label;
                        TextView var10 = (TextView)a.a(var0, var1);
                        if (var10 != null) {
                           var1 = R.id.gradient_background;
                           View var5 = a.a(var0, var1);
                           if (var5 != null) {
                              var1 = R.id.header_text;
                              TextView var7 = (TextView)a.a(var0, var1);
                              if (var7 != null) {
                                 var1 = R.id.party_avatars;
                                 OverlappingCirclesView var16 = (OverlappingCirclesView)a.a(var0, var1);
                                 if (var16 != null) {
                                    var1 = R.id.party_container;
                                    ConstraintLayout var14 = (ConstraintLayout)a.a(var0, var1);
                                    if (var14 != null) {
                                       var1 = R.id.party_size_text;
                                       TextView var4 = (TextView)a.a(var0, var1);
                                       if (var4 != null) {
                                          var1 = R.id.playstation_icon;
                                          SimpleDraweeView var12 = (SimpleDraweeView)a.a(var0, var1);
                                          if (var12 != null) {
                                             var1 = R.id.subtitle;
                                             TextView var3 = (TextView)a.a(var0, var1);
                                             if (var3 != null) {
                                                var1 = R.id.subtitle_container;
                                                ConstraintLayout var15 = (ConstraintLayout)a.a(var0, var1);
                                                if (var15 != null) {
                                                   var1 = R.id.subtitle_icon;
                                                   SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                                                   if (var8 != null) {
                                                      var1 = R.id.text_content_wrapper;
                                                      LinearLayout var19 = (LinearLayout)a.a(var0, var1);
                                                      if (var19 != null) {
                                                         var1 = R.id.title;
                                                         TextView var2 = (TextView)a.a(var0, var1);
                                                         if (var2 != null) {
                                                            var1 = R.id.xbox_icon;
                                                            SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
                                                            if (var17 != null) {
                                                               return new ActivityRichPresenceInviteEmbedViewBinding(
                                                                  var0,
                                                                  var13,
                                                                  var6,
                                                                  var18,
                                                                  var20,
                                                                  var11,
                                                                  var9,
                                                                  var10,
                                                                  var5,
                                                                  var7,
                                                                  var16,
                                                                  var14,
                                                                  var4,
                                                                  var12,
                                                                  var3,
                                                                  var15,
                                                                  var8,
                                                                  var19,
                                                                  var2,
                                                                  var17
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
