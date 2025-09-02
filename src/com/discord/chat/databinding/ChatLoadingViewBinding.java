package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import y0.a;

public final class ChatLoadingViewBinding implements ViewBinding {
   @NonNull
   public final Button button;
   @NonNull
   public final ProgressBar progressSpinner;
   @NonNull
   private final View rootView;

   private ChatLoadingViewBinding(@NonNull View var1, @NonNull Button var2, @NonNull ProgressBar var3) {
      this.rootView = var1;
      this.button = var2;
      this.progressSpinner = var3;
   }

   @NonNull
   public static ChatLoadingViewBinding bind(@NonNull View var0) {
      int var1 = R.id.button;
      Button var3 = (Button)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.progress_spinner;
         ProgressBar var2 = (ProgressBar)a.a(var0, var1);
         if (var2 != null) {
            return new ChatLoadingViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ChatLoadingViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.chat_loading_view, var1);
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
