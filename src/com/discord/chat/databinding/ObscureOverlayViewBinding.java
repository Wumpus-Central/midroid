package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.IconButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import y0.a;

public final class ObscureOverlayViewBinding implements ViewBinding {
   @NonNull
   public final BlurView blurView;
   @NonNull
   public final TextView descriptionLabel;
   @NonNull
   public final IconButtonView hideButton;
   @NonNull
   public final SimpleDraweeView mediaWarningIcon;
   @NonNull
   public final FrameLayout opaqueBackground;
   @NonNull
   public final LinearLayout overlayCenteredContainer;
   @NonNull
   public final ConstraintLayout overlayLayout;
   @NonNull
   public final IconButtonView revealButton;
   @NonNull
   private final View rootView;

   private ObscureOverlayViewBinding(
      @NonNull View var1,
      @NonNull BlurView var2,
      @NonNull TextView var3,
      @NonNull IconButtonView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull FrameLayout var6,
      @NonNull LinearLayout var7,
      @NonNull ConstraintLayout var8,
      @NonNull IconButtonView var9
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

   @NonNull
   public static ObscureOverlayViewBinding bind(@NonNull View var0) {
      int var1 = R.id.blur_view;
      BlurView var4 = (BlurView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.description_label;
         TextView var7 = (TextView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.hide_button;
            IconButtonView var8 = (IconButtonView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.media_warning_icon;
               SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.opaque_background;
                  FrameLayout var6 = (FrameLayout)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.overlay_centered_container;
                     LinearLayout var9 = (LinearLayout)a.a(var0, var1);
                     if (var9 != null) {
                        var1 = R.id.overlay_layout;
                        ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.reveal_button;
                           IconButtonView var5 = (IconButtonView)a.a(var0, var1);
                           if (var5 != null) {
                              return new ObscureOverlayViewBinding(var0, var4, var7, var8, var3, var6, var9, var2, var5);
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
   public static ObscureOverlayViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.obscure_overlay_view, var1);
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
