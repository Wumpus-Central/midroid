package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class ComponentFailedLabelViewBinding implements ViewBinding {
   private final ConstraintLayout rootView;
   public final SimpleDraweeView viewInteractionFailedLabelIcon;
   public final TextView viewInteractionFailedLabelMessage;

   private ComponentFailedLabelViewBinding(ConstraintLayout var1, SimpleDraweeView var2, TextView var3) {
      this.rootView = var1;
      this.viewInteractionFailedLabelIcon = var2;
      this.viewInteractionFailedLabelMessage = var3;
   }

   public static ComponentFailedLabelViewBinding bind(View var0) {
      int var1 = R.id.view_interaction_failed_label_icon;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.view_interaction_failed_label_message;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            return new ComponentFailedLabelViewBinding((ConstraintLayout)var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ComponentFailedLabelViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static ComponentFailedLabelViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.component_failed_label_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
