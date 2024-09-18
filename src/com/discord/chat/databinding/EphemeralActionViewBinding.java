package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class EphemeralActionViewBinding implements ViewBinding {
   public final SimpleDraweeView chatListAdapterItemIconHelp;
   public final SimpleDraweeSpanTextView chatListAdapterItemTextDismiss;
   public final SimpleDraweeView chatListAdapterItemVisibilityIcon;
   private final View rootView;

   private EphemeralActionViewBinding(View var1, SimpleDraweeView var2, SimpleDraweeSpanTextView var3, SimpleDraweeView var4) {
      this.rootView = var1;
      this.chatListAdapterItemIconHelp = var2;
      this.chatListAdapterItemTextDismiss = var3;
      this.chatListAdapterItemVisibilityIcon = var4;
   }

   public static EphemeralActionViewBinding bind(View var0) {
      int var1 = R.id.chat_list_adapter_item_icon_help;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.chat_list_adapter_item_text_dismiss;
         SimpleDraweeSpanTextView var4 = (SimpleDraweeSpanTextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.chat_list_adapter_item_visibility_icon;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               return new EphemeralActionViewBinding(var0, var3, var4, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static EphemeralActionViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.ephemeral_action_view, var1);
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
