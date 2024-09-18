package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class BlockedMessageGroupViewBinding implements ViewBinding {
   public final TextView blockedMessageGroupButton;
   public final RecyclerView blockedMessages;
   public final SimpleDraweeView closeIcon;
   private final View rootView;

   private BlockedMessageGroupViewBinding(View var1, TextView var2, RecyclerView var3, SimpleDraweeView var4) {
      this.rootView = var1;
      this.blockedMessageGroupButton = var2;
      this.blockedMessages = var3;
      this.closeIcon = var4;
   }

   public static BlockedMessageGroupViewBinding bind(View var0) {
      int var1 = R.id.blocked_message_group_button;
      TextView var4 = (TextView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.blocked_messages;
         RecyclerView var2 = (RecyclerView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.close_icon;
            SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
            if (var3 != null) {
               return new BlockedMessageGroupViewBinding(var0, var4, var2, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static BlockedMessageGroupViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.blocked_message_group_view, var1);
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
