package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class EphemeralActionViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView chatListAdapterItemIconHelp;
   @NonNull
   public final SimpleDraweeSpanTextView chatListAdapterItemTextDismiss;
   @NonNull
   public final SimpleDraweeView chatListAdapterItemVisibilityIcon;
   @NonNull
   private final View rootView;

   private EphemeralActionViewBinding(
      @NonNull View var1, @NonNull SimpleDraweeView var2, @NonNull SimpleDraweeSpanTextView var3, @NonNull SimpleDraweeView var4
   ) {
      this.rootView = var1;
      this.chatListAdapterItemIconHelp = var2;
      this.chatListAdapterItemTextDismiss = var3;
      this.chatListAdapterItemVisibilityIcon = var4;
   }

   @NonNull
   public static EphemeralActionViewBinding bind(@NonNull View var0) {
      int var1 = R.id.chat_list_adapter_item_icon_help;
      SimpleDraweeView var2 = (SimpleDraweeView)k5.a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.chat_list_adapter_item_text_dismiss;
         SimpleDraweeSpanTextView var4 = (SimpleDraweeSpanTextView)k5.a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.chat_list_adapter_item_visibility_icon;
            SimpleDraweeView var3 = (SimpleDraweeView)k5.a.a(var0, var1);
            if (var3 != null) {
               return new EphemeralActionViewBinding(var0, var2, var4, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static EphemeralActionViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.ephemeral_action_view, var1);
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
