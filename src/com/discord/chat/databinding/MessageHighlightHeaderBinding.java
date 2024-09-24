package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class MessageHighlightHeaderBinding implements ViewBinding {
   public final TextView header;
   public final SimpleDraweeView highlightIcon;
   private final View rootView;

   private MessageHighlightHeaderBinding(View var1, TextView var2, SimpleDraweeView var3) {
      this.rootView = var1;
      this.header = var2;
      this.highlightIcon = var3;
   }

   public static MessageHighlightHeaderBinding bind(View var0) {
      int var1 = R.id.header;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.highlight_icon;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            return new MessageHighlightHeaderBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageHighlightHeaderBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_highlight_header, var1);
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
