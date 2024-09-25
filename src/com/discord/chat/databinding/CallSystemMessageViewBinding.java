package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class CallSystemMessageViewBinding implements ViewBinding {
   public final SimpleDraweeView icon;
   public final TextView info;
   public final TextView message;
   public final OverlappingCirclesView participants;
   private final View rootView;

   private CallSystemMessageViewBinding(View var1, SimpleDraweeView var2, TextView var3, TextView var4, OverlappingCirclesView var5) {
      this.rootView = var1;
      this.icon = var2;
      this.info = var3;
      this.message = var4;
      this.participants = var5;
   }

   public static CallSystemMessageViewBinding bind(View var0) {
      int var1 = R.id.icon;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.info;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.message;
            TextView var5 = (TextView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.participants;
               OverlappingCirclesView var4 = (OverlappingCirclesView)a.a(var0, var1);
               if (var4 != null) {
                  return new CallSystemMessageViewBinding(var0, var3, var2, var5, var4);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static CallSystemMessageViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.call_system_message_view, var1);
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
