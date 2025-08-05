package com.discord.activity_invites.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.activity_invites.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ActivityRichPresenceInviteEmbedViewBinding implements ViewBinding {
   public final SimpleDraweeView activityIcon;
   public final ConstraintLayout contentContainer;
   public final SimpleDraweeView desktopIcon;
   public final ConstraintLayout footerContainer;
   public final LinearLayout footerContent;
   public final TextView footerLabel;
   public final View gradientBackground;
   public final TextView headerText;
   public final OverlappingCirclesView partyAvatars;
   public final ConstraintLayout partyContainer;
   public final TextView partySizeText;
   public final SimpleDraweeView playstationIcon;
   private final View rootView;
   public final TextView subtitle;
   public final ConstraintLayout subtitleContainer;
   public final SimpleDraweeView subtitleIcon;
   public final LinearLayout textContentWrapper;
   public final TextView title;
   public final SimpleDraweeView xboxIcon;

   private ActivityRichPresenceInviteEmbedViewBinding(
      View var1,
      SimpleDraweeView var2,
      ConstraintLayout var3,
      SimpleDraweeView var4,
      ConstraintLayout var5,
      LinearLayout var6,
      TextView var7,
      View var8,
      TextView var9,
      OverlappingCirclesView var10,
      ConstraintLayout var11,
      TextView var12,
      SimpleDraweeView var13,
      TextView var14,
      ConstraintLayout var15,
      SimpleDraweeView var16,
      LinearLayout var17,
      TextView var18,
      SimpleDraweeView var19
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

   public static ActivityRichPresenceInviteEmbedViewBinding bind(View var0) {
      int var1 = R.id.activity_icon;
      SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
      if (var17 != null) {
         var1 = R.id.content_container;
         ConstraintLayout var9 = (ConstraintLayout)a.a(var0, var1);
         if (var9 != null) {
            var1 = R.id.desktop_icon;
            SimpleDraweeView var19 = (SimpleDraweeView)a.a(var0, var1);
            if (var19 != null) {
               var1 = R.id.footer_container;
               ConstraintLayout var11 = (ConstraintLayout)a.a(var0, var1);
               if (var11 != null) {
                  var1 = R.id.footer_content;
                  LinearLayout var13 = (LinearLayout)a.a(var0, var1);
                  if (var13 != null) {
                     var1 = R.id.footer_label;
                     TextView var4 = (TextView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.gradient_background;
                        View var2 = a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.header_text;
                           TextView var18 = (TextView)a.a(var0, var1);
                           if (var18 != null) {
                              var1 = R.id.party_avatars;
                              OverlappingCirclesView var15 = (OverlappingCirclesView)a.a(var0, var1);
                              if (var15 != null) {
                                 var1 = R.id.party_container;
                                 ConstraintLayout var5 = (ConstraintLayout)a.a(var0, var1);
                                 if (var5 != null) {
                                    var1 = R.id.party_size_text;
                                    TextView var8 = (TextView)a.a(var0, var1);
                                    if (var8 != null) {
                                       var1 = R.id.playstation_icon;
                                       SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var7 != null) {
                                          var1 = R.id.subtitle;
                                          TextView var12 = (TextView)a.a(var0, var1);
                                          if (var12 != null) {
                                             var1 = R.id.subtitle_container;
                                             ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
                                             if (var6 != null) {
                                                var1 = R.id.subtitle_icon;
                                                SimpleDraweeView var16 = (SimpleDraweeView)a.a(var0, var1);
                                                if (var16 != null) {
                                                   var1 = R.id.text_content_wrapper;
                                                   LinearLayout var10 = (LinearLayout)a.a(var0, var1);
                                                   if (var10 != null) {
                                                      var1 = R.id.title;
                                                      TextView var14 = (TextView)a.a(var0, var1);
                                                      if (var14 != null) {
                                                         var1 = R.id.xbox_icon;
                                                         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                                                         if (var3 != null) {
                                                            return new ActivityRichPresenceInviteEmbedViewBinding(
                                                               var0,
                                                               var17,
                                                               var9,
                                                               var19,
                                                               var11,
                                                               var13,
                                                               var4,
                                                               var2,
                                                               var18,
                                                               var15,
                                                               var5,
                                                               var8,
                                                               var7,
                                                               var12,
                                                               var6,
                                                               var16,
                                                               var10,
                                                               var14,
                                                               var3
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

   public static ActivityRichPresenceInviteEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.activity_rich_presence_invite_embed_view, var1);
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
