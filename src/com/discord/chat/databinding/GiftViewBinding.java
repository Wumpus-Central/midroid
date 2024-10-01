package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class GiftViewBinding implements ViewBinding {
   public final DCDButton acceptButton;
   public final View acceptButtonGradient;
   public final Barrier barrier;
   public final TextView body;
   public final ConstraintLayout content;
   public final Group gradients;
   public final TextView header;
   public final View headerGradient;
   private final FrameLayout rootView;
   public final SimpleDraweeView splash;
   public final TextView subtitle;
   public final View subtitleGradient;
   public final SimpleDraweeView thumbnail;
   public final View thumbnailGradient;
   public final TextView title;
   public final View titleGradient;

   private GiftViewBinding(
      FrameLayout var1,
      DCDButton var2,
      View var3,
      Barrier var4,
      TextView var5,
      ConstraintLayout var6,
      Group var7,
      TextView var8,
      View var9,
      SimpleDraweeView var10,
      TextView var11,
      View var12,
      SimpleDraweeView var13,
      View var14,
      TextView var15,
      View var16
   ) {
      this.rootView = var1;
      this.acceptButton = var2;
      this.acceptButtonGradient = var3;
      this.barrier = var4;
      this.body = var5;
      this.content = var6;
      this.gradients = var7;
      this.header = var8;
      this.headerGradient = var9;
      this.splash = var10;
      this.subtitle = var11;
      this.subtitleGradient = var12;
      this.thumbnail = var13;
      this.thumbnailGradient = var14;
      this.title = var15;
      this.titleGradient = var16;
   }

   public static GiftViewBinding bind(View var0) {
      int var1 = R.id.acceptButton;
      DCDButton var2 = (DCDButton)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.acceptButtonGradient;
         View var6 = a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.barrier;
            Barrier var5 = (Barrier)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.body;
               TextView var15 = (TextView)a.a(var0, var1);
               if (var15 != null) {
                  var1 = R.id.content;
                  ConstraintLayout var10 = (ConstraintLayout)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.gradients;
                     Group var11 = (Group)a.a(var0, var1);
                     if (var11 != null) {
                        var1 = R.id.header;
                        TextView var12 = (TextView)a.a(var0, var1);
                        if (var12 != null) {
                           var1 = R.id.headerGradient;
                           View var3 = a.a(var0, var1);
                           if (var3 != null) {
                              var1 = R.id.splash;
                              SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                              if (var9 != null) {
                                 var1 = R.id.subtitle;
                                 TextView var4 = (TextView)a.a(var0, var1);
                                 if (var4 != null) {
                                    var1 = R.id.subtitleGradient;
                                    View var13 = a.a(var0, var1);
                                    if (var13 != null) {
                                       var1 = R.id.thumbnail;
                                       SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var8 != null) {
                                          var1 = R.id.thumbnailGradient;
                                          View var14 = a.a(var0, var1);
                                          if (var14 != null) {
                                             var1 = R.id.title;
                                             TextView var7 = (TextView)a.a(var0, var1);
                                             if (var7 != null) {
                                                var1 = R.id.titleGradient;
                                                View var16 = a.a(var0, var1);
                                                if (var16 != null) {
                                                   return new GiftViewBinding(
                                                      (FrameLayout)var0,
                                                      var2,
                                                      var6,
                                                      var5,
                                                      var15,
                                                      var10,
                                                      var11,
                                                      var12,
                                                      var3,
                                                      var9,
                                                      var4,
                                                      var13,
                                                      var8,
                                                      var14,
                                                      var7,
                                                      var16
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static GiftViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static GiftViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.gift_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public FrameLayout getRoot() {
      return this.rootView;
   }
}
