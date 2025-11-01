package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;

public final class BlockedMessageGroupViewBinding implements ViewBinding {
   @NonNull
   public final TextView blockedMessageGroupButton;
   @NonNull
   public final RecyclerView blockedMessages;
   @NonNull
   public final SimpleDraweeView closeIcon;
   @NonNull
   private final View rootView;

   private BlockedMessageGroupViewBinding(@NonNull View var1, @NonNull TextView var2, @NonNull RecyclerView var3, @NonNull SimpleDraweeView var4) {
      this.rootView = var1;
      this.blockedMessageGroupButton = var2;
      this.blockedMessages = var3;
      this.closeIcon = var4;
   }

   @NonNull
   public static BlockedMessageGroupViewBinding bind(@NonNull View var0) {
      int var1 = R.id.blocked_message_group_button;
      TextView var4 = (TextView)k5.a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.blocked_messages;
         RecyclerView var2 = (RecyclerView)k5.a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.close_icon;
            SimpleDraweeView var3 = (SimpleDraweeView)k5.a.a(var0, var1);
            if (var3 != null) {
               return new BlockedMessageGroupViewBinding(var0, var4, var2, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static BlockedMessageGroupViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.blocked_message_group_view, var1);
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
