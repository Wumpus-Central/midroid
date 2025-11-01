package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;

public final class PollActionButtonBinding implements ViewBinding {
   @NonNull
   public final DCDButton actionButton;
   @NonNull
   public final TextView actionText;
   @NonNull
   private final View rootView;

   private PollActionButtonBinding(@NonNull View var1, @NonNull DCDButton var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.actionButton = var2;
      this.actionText = var3;
   }

   @NonNull
   public static PollActionButtonBinding bind(@NonNull View var0) {
      int var1 = R.id.action_button;
      DCDButton var2 = (DCDButton)k5.a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.action_text;
         TextView var3 = (TextView)k5.a.a(var0, var1);
         if (var3 != null) {
            return new PollActionButtonBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static PollActionButtonBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.poll_action_button, var1);
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
