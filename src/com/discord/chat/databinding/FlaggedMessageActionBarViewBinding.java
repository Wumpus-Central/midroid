package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import x1.a;

public final class FlaggedMessageActionBarViewBinding implements ViewBinding {
   @NonNull
   public final DCDButton actionsButton;
   @NonNull
   public final DCDButton feedbackButton;
   @NonNull
   private final View rootView;
   @NonNull
   public final ImageView separatorDot;

   private FlaggedMessageActionBarViewBinding(@NonNull View var1, @NonNull DCDButton var2, @NonNull DCDButton var3, @NonNull ImageView var4) {
      this.rootView = var1;
      this.actionsButton = var2;
      this.feedbackButton = var3;
      this.separatorDot = var4;
   }

   @NonNull
   public static FlaggedMessageActionBarViewBinding bind(@NonNull View var0) {
      int var1 = R.id.actions_button;
      DCDButton var3 = (DCDButton)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.feedback_button;
         DCDButton var4 = (DCDButton)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.separator_dot;
            ImageView var2 = (ImageView)a.a(var0, var1);
            if (var2 != null) {
               return new FlaggedMessageActionBarViewBinding(var0, var3, var4, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static FlaggedMessageActionBarViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.flagged_message_action_bar_view, var1);
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
