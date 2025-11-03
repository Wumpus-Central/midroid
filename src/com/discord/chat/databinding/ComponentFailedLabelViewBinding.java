package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;

public final class ComponentFailedLabelViewBinding implements ViewBinding {
   @NonNull
   private final ConstraintLayout rootView;
   @NonNull
   public final SimpleDraweeView viewInteractionFailedLabelIcon;
   @NonNull
   public final TextView viewInteractionFailedLabelMessage;

   private ComponentFailedLabelViewBinding(@NonNull ConstraintLayout var1, @NonNull SimpleDraweeView var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.viewInteractionFailedLabelIcon = var2;
      this.viewInteractionFailedLabelMessage = var3;
   }

   @NonNull
   public static ComponentFailedLabelViewBinding bind(@NonNull View var0) {
      int var1 = R.id.view_interaction_failed_label_icon;
      SimpleDraweeView var2 = (SimpleDraweeView)k5.a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.view_interaction_failed_label_message;
         TextView var3 = (TextView)k5.a.a(var0, var1);
         if (var3 != null) {
            return new ComponentFailedLabelViewBinding((ConstraintLayout)var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ComponentFailedLabelViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static ComponentFailedLabelViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.component_failed_label_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
