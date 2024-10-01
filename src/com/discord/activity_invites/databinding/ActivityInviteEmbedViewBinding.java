package com.discord.activity_invites.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.activity_invites.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class ActivityInviteEmbedViewBinding implements ViewBinding {
   public final Barrier aboveBottomRowBarrier;
   public final OverlappingCirclesView avatars;
   public final View bgGradient;
   public final TextView bottomEndLabel;
   public final DCDButton button;
   public final SimpleDraweeView endImage;
   public final TextView header;
   public final TextView heroText;
   private final View rootView;
   public final SimpleDraweeView startImage;
   public final TextView subtext;

   private ActivityInviteEmbedViewBinding(
      View var1,
      Barrier var2,
      OverlappingCirclesView var3,
      View var4,
      TextView var5,
      DCDButton var6,
      SimpleDraweeView var7,
      TextView var8,
      TextView var9,
      SimpleDraweeView var10,
      TextView var11
   ) {
      this.rootView = var1;
      this.aboveBottomRowBarrier = var2;
      this.avatars = var3;
      this.bgGradient = var4;
      this.bottomEndLabel = var5;
      this.button = var6;
      this.endImage = var7;
      this.header = var8;
      this.heroText = var9;
      this.startImage = var10;
      this.subtext = var11;
   }

   public static ActivityInviteEmbedViewBinding bind(View var0) {
      int var1 = R.id.above_bottom_row_barrier;
      Barrier var8 = (Barrier)a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.avatars;
         OverlappingCirclesView var9 = (OverlappingCirclesView)a.a(var0, var1);
         if (var9 != null) {
            var1 = R.id.bg_gradient;
            View var4 = a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.bottom_end_label;
               TextView var2 = (TextView)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.button;
                  DCDButton var3 = (DCDButton)a.a(var0, var1);
                  if (var3 != null) {
                     var1 = R.id.end_image;
                     SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.header;
                        TextView var6 = (TextView)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.hero_text;
                           TextView var11 = (TextView)a.a(var0, var1);
                           if (var11 != null) {
                              var1 = R.id.start_image;
                              SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                              if (var7 != null) {
                                 var1 = R.id.subtext;
                                 TextView var10 = (TextView)a.a(var0, var1);
                                 if (var10 != null) {
                                    return new ActivityInviteEmbedViewBinding(var0, var8, var9, var4, var2, var3, var5, var6, var11, var7, var10);
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

   public static ActivityInviteEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.activity_invite_embed_view, var1);
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
