package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class GiftViewBinding implements ViewBinding {
   @NonNull
   public final DCDButton acceptButton;
   @NonNull
   public final View acceptButtonGradient;
   @NonNull
   public final Barrier barrier;
   @NonNull
   public final TextView body;
   @NonNull
   public final ConstraintLayout content;
   @NonNull
   public final Group gradients;
   @NonNull
   public final TextView header;
   @NonNull
   public final View headerGradient;
   @NonNull
   private final FrameLayout rootView;
   @NonNull
   public final SimpleDraweeView splash;
   @NonNull
   public final TextView subtitle;
   @NonNull
   public final View subtitleGradient;
   @NonNull
   public final SimpleDraweeView thumbnail;
   @NonNull
   public final View thumbnailGradient;
   @NonNull
   public final TextView title;
   @NonNull
   public final View titleGradient;

   private GiftViewBinding(
      @NonNull FrameLayout var1,
      @NonNull DCDButton var2,
      @NonNull View var3,
      @NonNull Barrier var4,
      @NonNull TextView var5,
      @NonNull ConstraintLayout var6,
      @NonNull Group var7,
      @NonNull TextView var8,
      @NonNull View var9,
      @NonNull SimpleDraweeView var10,
      @NonNull TextView var11,
      @NonNull View var12,
      @NonNull SimpleDraweeView var13,
      @NonNull View var14,
      @NonNull TextView var15,
      @NonNull View var16
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

   @NonNull
   public static GiftViewBinding bind(@NonNull View var0) {
      int var1 = R.id.acceptButton;
      DCDButton var9 = (DCDButton)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.acceptButtonGradient;
         View var12 = a.a(var0, var1);
         if (var12 != null) {
            var1 = R.id.barrier;
            Barrier var8 = (Barrier)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.body;
               TextView var13 = (TextView)a.a(var0, var1);
               if (var13 != null) {
                  var1 = R.id.content;
                  ConstraintLayout var10 = (ConstraintLayout)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.gradients;
                     Group var2 = (Group)a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.header;
                        TextView var15 = (TextView)a.a(var0, var1);
                        if (var15 != null) {
                           var1 = R.id.headerGradient;
                           View var5 = a.a(var0, var1);
                           if (var5 != null) {
                              var1 = R.id.splash;
                              SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                              if (var3 != null) {
                                 var1 = R.id.subtitle;
                                 TextView var14 = (TextView)a.a(var0, var1);
                                 if (var14 != null) {
                                    var1 = R.id.subtitleGradient;
                                    View var6 = a.a(var0, var1);
                                    if (var6 != null) {
                                       var1 = R.id.thumbnail;
                                       SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var7 != null) {
                                          var1 = R.id.thumbnailGradient;
                                          View var16 = a.a(var0, var1);
                                          if (var16 != null) {
                                             var1 = R.id.title;
                                             TextView var4 = (TextView)a.a(var0, var1);
                                             if (var4 != null) {
                                                var1 = R.id.titleGradient;
                                                View var11 = a.a(var0, var1);
                                                if (var11 != null) {
                                                   return new GiftViewBinding(
                                                      (FrameLayout)var0,
                                                      var9,
                                                      var12,
                                                      var8,
                                                      var13,
                                                      var10,
                                                      var2,
                                                      var15,
                                                      var5,
                                                      var3,
                                                      var14,
                                                      var6,
                                                      var7,
                                                      var16,
                                                      var4,
                                                      var11
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

   @NonNull
   public static GiftViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static GiftViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.gift_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public FrameLayout getRoot() {
      return this.rootView;
   }
}
