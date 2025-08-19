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
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ActivityRichPresenceInviteEmbedViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView activityIcon;
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
      @NonNull ConstraintLayout var3,
      @NonNull SimpleDraweeView var4,
      @NonNull ConstraintLayout var5,
      @NonNull LinearLayout var6,
      @NonNull TextView var7,
      @NonNull View var8,
      @NonNull TextView var9,
      @NonNull OverlappingCirclesView var10,
      @NonNull ConstraintLayout var11,
      @NonNull TextView var12,
      @NonNull SimpleDraweeView var13,
      @NonNull TextView var14,
      @NonNull ConstraintLayout var15,
      @NonNull SimpleDraweeView var16,
      @NonNull LinearLayout var17,
      @NonNull TextView var18,
      @NonNull SimpleDraweeView var19
   ) {
      this.rootView = var1;
      this.activityIcon = var2;
      this.contentContainer = var3;
      this.desktopIcon = var4;
      this.footerContainer = var5;
      this.footerContent = var6;
      this.footerLabel = var7;
      this.gradientBackground = var8;
      this.headerText = var9;
      this.partyAvatars = var10;
      this.partyContainer = var11;
      this.partySizeText = var12;
      this.playstationIcon = var13;
      this.subtitle = var14;
      this.subtitleContainer = var15;
      this.subtitleIcon = var16;
      this.textContentWrapper = var17;
      this.title = var18;
      this.xboxIcon = var19;
   }

   @NonNull
   public static ActivityRichPresenceInviteEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.activity_icon;
      SimpleDraweeView var11 = (SimpleDraweeView)a.a(var0, var1);
      if (var11 != null) {
         var1 = R.id.content_container;
         ConstraintLayout var18 = (ConstraintLayout)a.a(var0, var1);
         if (var18 != null) {
            var1 = R.id.desktop_icon;
            SimpleDraweeView var14 = (SimpleDraweeView)a.a(var0, var1);
            if (var14 != null) {
               var1 = R.id.footer_container;
               ConstraintLayout var9 = (ConstraintLayout)a.a(var0, var1);
               if (var9 != null) {
                  var1 = R.id.footer_content;
                  LinearLayout var10 = (LinearLayout)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.footer_label;
                     TextView var16 = (TextView)a.a(var0, var1);
                     if (var16 != null) {
                        var1 = R.id.gradient_background;
                        View var7 = a.a(var0, var1);
                        if (var7 != null) {
                           var1 = R.id.header_text;
                           TextView var15 = (TextView)a.a(var0, var1);
                           if (var15 != null) {
                              var1 = R.id.party_avatars;
                              OverlappingCirclesView var17 = (OverlappingCirclesView)a.a(var0, var1);
                              if (var17 != null) {
                                 var1 = R.id.party_container;
                                 ConstraintLayout var5 = (ConstraintLayout)a.a(var0, var1);
                                 if (var5 != null) {
                                    var1 = R.id.party_size_text;
                                    TextView var8 = (TextView)a.a(var0, var1);
                                    if (var8 != null) {
                                       var1 = R.id.playstation_icon;
                                       SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var3 != null) {
                                          var1 = R.id.subtitle;
                                          TextView var4 = (TextView)a.a(var0, var1);
                                          if (var4 != null) {
                                             var1 = R.id.subtitle_container;
                                             ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
                                             if (var6 != null) {
                                                var1 = R.id.subtitle_icon;
                                                SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                                                if (var2 != null) {
                                                   var1 = R.id.text_content_wrapper;
                                                   LinearLayout var12 = (LinearLayout)a.a(var0, var1);
                                                   if (var12 != null) {
                                                      var1 = R.id.title;
                                                      TextView var13 = (TextView)a.a(var0, var1);
                                                      if (var13 != null) {
                                                         var1 = R.id.xbox_icon;
                                                         SimpleDraweeView var19 = (SimpleDraweeView)a.a(var0, var1);
                                                         if (var19 != null) {
                                                            return new ActivityRichPresenceInviteEmbedViewBinding(
                                                               var0,
                                                               var11,
                                                               var18,
                                                               var14,
                                                               var9,
                                                               var10,
                                                               var16,
                                                               var7,
                                                               var15,
                                                               var17,
                                                               var5,
                                                               var8,
                                                               var3,
                                                               var4,
                                                               var6,
                                                               var2,
                                                               var12,
                                                               var13,
                                                               var19
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
