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
   public final SimpleDraweeView coverImage;
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
      @NonNull SimpleDraweeView var7,
      @NonNull ConstraintLayout var8,
      @NonNull LinearLayout var9,
      @NonNull TextView var10,
      @NonNull View var11,
      @NonNull TextView var12,
      @NonNull OverlappingCirclesView var13,
      @NonNull ConstraintLayout var14,
      @NonNull TextView var15,
      @NonNull SimpleDraweeView var16,
      @NonNull TextView var17,
      @NonNull ConstraintLayout var18,
      @NonNull SimpleDraweeView var19,
      @NonNull LinearLayout var20,
      @NonNull TextView var21,
      @NonNull SimpleDraweeView var22
   ) {
      this.rootView = var1;
      this.actionWrapper = var2;
      this.activityIcon = var3;
      this.button = var4;
      this.contentContainer = var5;
      this.coverImage = var6;
      this.desktopIcon = var7;
      this.footerContainer = var8;
      this.footerContent = var9;
      this.footerLabel = var10;
      this.gradientBackground = var11;
      this.headerText = var12;
      this.partyAvatars = var13;
      this.partyContainer = var14;
      this.partySizeText = var15;
      this.playstationIcon = var16;
      this.subtitle = var17;
      this.subtitleContainer = var18;
      this.subtitleIcon = var19;
      this.textContentWrapper = var20;
      this.title = var21;
      this.xboxIcon = var22;
   }

   @NonNull
   public static ActivityRichPresenceInviteEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.action_wrapper;
      LinearLayout var22 = (LinearLayout)a.a(var0, var1);
      if (var22 != null) {
         var1 = R.id.activity_icon;
         SimpleDraweeView var10 = (SimpleDraweeView)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.button;
            DCDButton var16 = (DCDButton)a.a(var0, var1);
            if (var16 != null) {
               var1 = R.id.content_container;
               ConstraintLayout var5 = (ConstraintLayout)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.cover_image;
                  SimpleDraweeView var11 = (SimpleDraweeView)a.a(var0, var1);
                  if (var11 != null) {
                     var1 = R.id.desktop_icon;
                     SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.footer_container;
                        ConstraintLayout var4 = (ConstraintLayout)a.a(var0, var1);
                        if (var4 != null) {
                           var1 = R.id.footer_content;
                           LinearLayout var7 = (LinearLayout)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.footer_label;
                              TextView var9 = (TextView)a.a(var0, var1);
                              if (var9 != null) {
                                 var1 = R.id.gradient_background;
                                 View var13 = a.a(var0, var1);
                                 if (var13 != null) {
                                    var1 = R.id.header_text;
                                    TextView var12 = (TextView)a.a(var0, var1);
                                    if (var12 != null) {
                                       var1 = R.id.party_avatars;
                                       OverlappingCirclesView var17 = (OverlappingCirclesView)a.a(var0, var1);
                                       if (var17 != null) {
                                          var1 = R.id.party_container;
                                          ConstraintLayout var3 = (ConstraintLayout)a.a(var0, var1);
                                          if (var3 != null) {
                                             var1 = R.id.party_size_text;
                                             TextView var19 = (TextView)a.a(var0, var1);
                                             if (var19 != null) {
                                                var1 = R.id.playstation_icon;
                                                SimpleDraweeView var15 = (SimpleDraweeView)a.a(var0, var1);
                                                if (var15 != null) {
                                                   var1 = R.id.subtitle;
                                                   TextView var14 = (TextView)a.a(var0, var1);
                                                   if (var14 != null) {
                                                      var1 = R.id.subtitle_container;
                                                      ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
                                                      if (var6 != null) {
                                                         var1 = R.id.subtitle_icon;
                                                         SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                                                         if (var8 != null) {
                                                            var1 = R.id.text_content_wrapper;
                                                            LinearLayout var18 = (LinearLayout)a.a(var0, var1);
                                                            if (var18 != null) {
                                                               var1 = R.id.title;
                                                               TextView var21 = (TextView)a.a(var0, var1);
                                                               if (var21 != null) {
                                                                  var1 = R.id.xbox_icon;
                                                                  SimpleDraweeView var20 = (SimpleDraweeView)a.a(var0, var1);
                                                                  if (var20 != null) {
                                                                     return new ActivityRichPresenceInviteEmbedViewBinding(
                                                                        var0,
                                                                        var22,
                                                                        var10,
                                                                        var16,
                                                                        var5,
                                                                        var11,
                                                                        var2,
                                                                        var4,
                                                                        var7,
                                                                        var9,
                                                                        var13,
                                                                        var12,
                                                                        var17,
                                                                        var3,
                                                                        var19,
                                                                        var15,
                                                                        var14,
                                                                        var6,
                                                                        var8,
                                                                        var18,
                                                                        var21,
                                                                        var20
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
