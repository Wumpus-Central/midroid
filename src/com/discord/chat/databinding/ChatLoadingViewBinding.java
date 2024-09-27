package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import n1.a;

public final class ChatLoadingViewBinding implements ViewBinding {
   public final Button button;
   public final ProgressBar progressSpinner;
   private final View rootView;

   private ChatLoadingViewBinding(View var1, Button var2, ProgressBar var3) {
      this.rootView = var1;
      this.button = var2;
      this.progressSpinner = var3;
   }

   public static ChatLoadingViewBinding bind(View var0) {
      int var1 = R.id.button;
      Button var2 = (Button)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.progress_spinner;
         ProgressBar var3 = (ProgressBar)a.a(var0, var1);
         if (var3 != null) {
            return new ChatLoadingViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ChatLoadingViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.chat_loading_view, var1);
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
