package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.IconButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import y0.a;

public final class ObscureOverlayViewBinding implements ViewBinding {
   public final BlurView blurView;
   public final TextView descriptionLabel;
   public final IconButtonView hideButton;
   public final SimpleDraweeView mediaWarningIcon;
   public final FrameLayout opaqueBackground;
   public final LinearLayout overlayCenteredContainer;
   public final ConstraintLayout overlayLayout;
   public final IconButtonView revealButton;
   private final View rootView;

   private ObscureOverlayViewBinding(
      View var1,
      BlurView var2,
      TextView var3,
      IconButtonView var4,
      SimpleDraweeView var5,
      FrameLayout var6,
      LinearLayout var7,
      ConstraintLayout var8,
      IconButtonView var9
   ) {
      this.rootView = var1;
      this.blurView = var2;
      this.descriptionLabel = var3;
      this.hideButton = var4;
      this.mediaWarningIcon = var5;
      this.opaqueBackground = var6;
      this.overlayCenteredContainer = var7;
      this.overlayLayout = var8;
      this.revealButton = var9;
   }

   public static ObscureOverlayViewBinding bind(View var0) {
      int var1 = R.id.blur_view;
      BlurView var2 = (BlurView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.description_label;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.hide_button;
            IconButtonView var8 = (IconButtonView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.media_warning_icon;
               SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.opaque_background;
                  FrameLayout var7 = (FrameLayout)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.overlay_centered_container;
                     LinearLayout var9 = (LinearLayout)a.a(var0, var1);
                     if (var9 != null) {
                        var1 = R.id.overlay_layout;
                        ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.reveal_button;
                           IconButtonView var4 = (IconButtonView)a.a(var0, var1);
                           if (var4 != null) {
                              return new ObscureOverlayViewBinding(var0, var2, var3, var8, var5, var7, var9, var6, var4);
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

   public static ObscureOverlayViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.obscure_overlay_view, var1);
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
