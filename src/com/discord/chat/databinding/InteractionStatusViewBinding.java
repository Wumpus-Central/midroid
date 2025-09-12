package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class InteractionStatusViewBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeView viewInteractionStatusDangerIcon;
   @NonNull
   public final LinearLayout viewInteractionStatusLabelIcon;
   @NonNull
   public final TextView viewInteractionStatusLabelMessage;
   @NonNull
   public final ProgressDots viewInteractionStatusLoadingDots;

   private InteractionStatusViewBinding(
      @NonNull View var1, @NonNull SimpleDraweeView var2, @NonNull LinearLayout var3, @NonNull TextView var4, @NonNull ProgressDots var5
   ) {
      this.rootView = var1;
      this.viewInteractionStatusDangerIcon = var2;
      this.viewInteractionStatusLabelIcon = var3;
      this.viewInteractionStatusLabelMessage = var4;
      this.viewInteractionStatusLoadingDots = var5;
   }

   @NonNull
   public static InteractionStatusViewBinding bind(@NonNull View var0) {
      int var1 = R.id.view_interaction_status_danger_icon;
      SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.view_interaction_status_label_icon;
         LinearLayout var4 = (LinearLayout)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.view_interaction_status_label_message;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.view_interaction_status_loading_dots;
               ProgressDots var3 = (ProgressDots)a.a(var0, var1);
               if (var3 != null) {
                  return new InteractionStatusViewBinding(var0, var5, var4, var2, var3);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static InteractionStatusViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.interaction_status_view, var1);
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
