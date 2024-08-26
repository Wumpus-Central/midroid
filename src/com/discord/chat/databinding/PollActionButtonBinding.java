package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import n1.a;

public final class PollActionButtonBinding implements ViewBinding {
   public final DCDButton actionButton;
   public final TextView actionText;
   private final View rootView;

   private PollActionButtonBinding(View var1, DCDButton var2, TextView var3) {
      this.rootView = var1;
      this.actionButton = var2;
      this.actionText = var3;
   }

   public static PollActionButtonBinding bind(View var0) {
      int var1 = R.id.action_button;
      DCDButton var3 = (DCDButton)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.action_text;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            return new PollActionButtonBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static PollActionButtonBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.poll_action_button, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
