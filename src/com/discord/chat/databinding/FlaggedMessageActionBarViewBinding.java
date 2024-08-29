package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import v2.a;

public final class FlaggedMessageActionBarViewBinding implements ViewBinding {
   public final DCDButton actionsButton;
   public final DCDButton feedbackButton;
   private final View rootView;
   public final ImageView separatorDot;

   private FlaggedMessageActionBarViewBinding(View var1, DCDButton var2, DCDButton var3, ImageView var4) {
      this.rootView = var1;
      this.actionsButton = var2;
      this.feedbackButton = var3;
      this.separatorDot = var4;
   }

   public static FlaggedMessageActionBarViewBinding bind(View var0) {
      int var1 = R.id.actions_button;
      DCDButton var4 = (DCDButton)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.feedback_button;
         DCDButton var2 = (DCDButton)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.separator_dot;
            ImageView var3 = (ImageView)a.a(var0, var1);
            if (var3 != null) {
               return new FlaggedMessageActionBarViewBinding(var0, var4, var2, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static FlaggedMessageActionBarViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.flagged_message_action_bar_view, var1);
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
