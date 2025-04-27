package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;

public final class AppMessageEmbedViewBinding implements ViewBinding {
   public final LinearLayout actionsContainer;
   public final SimpleDraweeView appIcon;
   public final SimpleDraweeView banner;
   public final Barrier barrierFooter;
   public final TextView header;
   public final TextView info;
   public final ConstraintLayout itemBottomContainer;
   public final DCDButton linkIcon;
   public final SimpleDraweeView playerIcon;
   private final View rootView;
   public final TextView tagline;

   private AppMessageEmbedViewBinding(
      View var1,
      LinearLayout var2,
      SimpleDraweeView var3,
      SimpleDraweeView var4,
      Barrier var5,
      TextView var6,
      TextView var7,
      ConstraintLayout var8,
      DCDButton var9,
      SimpleDraweeView var10,
      TextView var11
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
      this.playerIcon = var10;
      this.tagline = var11;
   }

   public static AppMessageEmbedViewBinding bind(View var0) {
      int var1 = R.id.actions_container;
      LinearLayout var4 = (LinearLayout)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.app_icon;
         SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.banner;
            SimpleDraweeView var10 = (SimpleDraweeView)a.a(var0, var1);
            if (var10 != null) {
               var1 = R.id.barrier_footer;
               Barrier var9 = (Barrier)a.a(var0, var1);
               if (var9 != null) {
                  var1 = R.id.header;
                  TextView var5 = (TextView)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.info;
                     TextView var8 = (TextView)a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.item_bottom_container;
                        ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.link_icon;
                           DCDButton var3 = (DCDButton)a.a(var0, var1);
                           if (var3 != null) {
                              var1 = R.id.player_icon;
                              SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
                              if (var6 != null) {
                                 var1 = R.id.tagline;
                                 TextView var11 = (TextView)a.a(var0, var1);
                                 if (var11 != null) {
                                    return new AppMessageEmbedViewBinding(var0, var4, var7, var10, var9, var5, var8, var2, var3, var6, var11);
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

   public static AppMessageEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.app_message_embed_view, var1);
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
