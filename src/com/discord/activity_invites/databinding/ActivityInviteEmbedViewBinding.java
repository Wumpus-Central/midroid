package com.discord.activity_invites.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.activity_invites.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ActivityInviteEmbedViewBinding implements ViewBinding {
   @NonNull
   public final Barrier aboveBottomRowBarrier;
   @NonNull
   public final OverlappingCirclesView avatars;
   @NonNull
   public final View bgGradient;
   @NonNull
   public final TextView bottomEndLabel;
   @NonNull
   public final DCDButton button;
   @NonNull
   public final SimpleDraweeView endImage;
   @NonNull
   public final TextView header;
   @NonNull
   public final TextView heroText;
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeView startImage;
   @NonNull
   public final TextView subtext;

   private ActivityInviteEmbedViewBinding(
      @NonNull View var1,
      @NonNull Barrier var2,
      @NonNull OverlappingCirclesView var3,
      @NonNull View var4,
      @NonNull TextView var5,
      @NonNull DCDButton var6,
      @NonNull SimpleDraweeView var7,
      @NonNull TextView var8,
      @NonNull TextView var9,
      @NonNull SimpleDraweeView var10,
      @NonNull TextView var11
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

   @NonNull
   public static ActivityInviteEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.above_bottom_row_barrier;
      Barrier var10 = (Barrier)a.a(var0, var1);
      if (var10 != null) {
         var1 = R.id.avatars;
         OverlappingCirclesView var2 = (OverlappingCirclesView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.bg_gradient;
            View var8 = a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.bottom_end_label;
               TextView var6 = (TextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.button;
                  DCDButton var9 = (DCDButton)a.a(var0, var1);
                  if (var9 != null) {
                     var1 = R.id.end_image;
                     SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.header;
                        TextView var11 = (TextView)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.hero_text;
                           TextView var7 = (TextView)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.start_image;
                              SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
                              if (var4 != null) {
                                 var1 = R.id.subtext;
                                 TextView var5 = (TextView)a.a(var0, var1);
                                 if (var5 != null) {
                                    return new ActivityInviteEmbedViewBinding(var0, var10, var2, var8, var6, var9, var3, var11, var7, var4, var5);
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
   public static ActivityInviteEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.activity_invite_embed_view, var1);
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
