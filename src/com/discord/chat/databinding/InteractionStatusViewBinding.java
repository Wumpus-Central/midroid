package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class InteractionStatusViewBinding implements ViewBinding {
   private final View rootView;
   public final SimpleDraweeView viewInteractionStatusDangerIcon;
   public final LinearLayout viewInteractionStatusLabelIcon;
   public final TextView viewInteractionStatusLabelMessage;
   public final ProgressDots viewInteractionStatusLoadingDots;

   private InteractionStatusViewBinding(View var1, SimpleDraweeView var2, LinearLayout var3, TextView var4, ProgressDots var5) {
      this.rootView = var1;
      this.viewInteractionStatusDangerIcon = var2;
      this.viewInteractionStatusLabelIcon = var3;
      this.viewInteractionStatusLabelMessage = var4;
      this.viewInteractionStatusLoadingDots = var5;
   }

   public static InteractionStatusViewBinding bind(View var0) {
      int var1 = R.id.view_interaction_status_danger_icon;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.view_interaction_status_label_icon;
         LinearLayout var2 = (LinearLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.view_interaction_status_label_message;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.view_interaction_status_loading_dots;
               ProgressDots var5 = (ProgressDots)a.a(var0, var1);
               if (var5 != null) {
                  return new InteractionStatusViewBinding(var0, var3, var2, var4, var5);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static InteractionStatusViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.interaction_status_view, var1);
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
