package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class ThreadStarterMessageHeaderViewBinding implements ViewBinding {
   private final View rootView;
   public final SimpleDraweeView threadStarterHeaderIcon;
   public final TextView threadStarterHeaderText;

   private ThreadStarterMessageHeaderViewBinding(View var1, SimpleDraweeView var2, TextView var3) {
      this.rootView = var1;
      this.threadStarterHeaderIcon = var2;
      this.threadStarterHeaderText = var3;
   }

   public static ThreadStarterMessageHeaderViewBinding bind(View var0) {
      int var1 = R.id.thread_starter_header_icon;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.thread_starter_header_text;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            return new ThreadStarterMessageHeaderViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ThreadStarterMessageHeaderViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.thread_starter_message_header_view, var1);
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
