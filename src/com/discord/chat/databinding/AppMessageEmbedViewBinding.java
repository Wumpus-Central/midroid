package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class AppMessageEmbedViewBinding implements ViewBinding {
   @NonNull
   public final LinearLayout actionsContainer;
   @NonNull
   public final SimpleDraweeView appIcon;
   @NonNull
   public final SimpleDraweeView banner;
   @NonNull
   public final Barrier barrierFooter;
   @NonNull
   public final TextView header;
   @NonNull
   public final TextView info;
   @NonNull
   public final ConstraintLayout itemBottomContainer;
   @NonNull
   public final DCDButton linkIcon;
   @NonNull
   public final DCDButton linkIconTitle;
   @NonNull
   public final OverlappingCirclesView participants;
   @NonNull
   public final TextView participantsText;
   @NonNull
   public final SimpleDraweeView playerIcon;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView tagline;
   @NonNull
   public final TextView title;

   private AppMessageEmbedViewBinding(
      @NonNull View var1,
      @NonNull LinearLayout var2,
      @NonNull SimpleDraweeView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull Barrier var5,
      @NonNull TextView var6,
      @NonNull TextView var7,
      @NonNull ConstraintLayout var8,
      @NonNull DCDButton var9,
      @NonNull DCDButton var10,
      @NonNull OverlappingCirclesView var11,
      @NonNull TextView var12,
      @NonNull SimpleDraweeView var13,
      @NonNull TextView var14,
      @NonNull TextView var15
   ) {
      this.rootView = var1;
      this.actionsContainer = var2;
      this.appIcon = var3;
      this.banner = var4;
      this.barrierFooter = var5;
      this.header = var6;
      this.info = var7;
      this.itemBottomContainer = var8;
      this.linkIcon = var9;
      this.linkIconTitle = var10;
      this.participants = var11;
      this.participantsText = var12;
      this.playerIcon = var13;
      this.tagline = var14;
      this.title = var15;
   }

   @NonNull
   public static AppMessageEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.actions_container;
      LinearLayout var15 = (LinearLayout)a.a(var0, var1);
      if (var15 != null) {
         var1 = R.id.app_icon;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.banner;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.barrier_footer;
               Barrier var8 = (Barrier)a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.header;
                  TextView var4 = (TextView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.info;
                     TextView var11 = (TextView)a.a(var0, var1);
                     if (var11 != null) {
                        var1 = R.id.item_bottom_container;
                        ConstraintLayout var12 = (ConstraintLayout)a.a(var0, var1);
                        if (var12 != null) {
                           var1 = R.id.link_icon;
                           DCDButton var13 = (DCDButton)a.a(var0, var1);
                           if (var13 != null) {
                              var1 = R.id.link_icon_title;
                              DCDButton var14 = (DCDButton)a.a(var0, var1);
                              if (var14 != null) {
                                 var1 = R.id.participants;
                                 OverlappingCirclesView var10 = (OverlappingCirclesView)a.a(var0, var1);
                                 if (var10 != null) {
                                    var1 = R.id.participants_text;
                                    TextView var5 = (TextView)a.a(var0, var1);
                                    if (var5 != null) {
                                       var1 = R.id.player_icon;
                                       SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var7 != null) {
                                          var1 = R.id.tagline;
                                          TextView var9 = (TextView)a.a(var0, var1);
                                          if (var9 != null) {
                                             var1 = R.id.title;
                                             TextView var6 = (TextView)a.a(var0, var1);
                                             if (var6 != null) {
                                                return new AppMessageEmbedViewBinding(
                                                   var0, var15, var3, var2, var8, var4, var11, var12, var13, var14, var10, var5, var7, var9, var6
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static AppMessageEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.app_message_embed_view, var1);
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
