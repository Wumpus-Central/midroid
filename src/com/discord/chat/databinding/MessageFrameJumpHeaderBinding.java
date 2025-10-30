package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import e4.a;

public final class MessageFrameJumpHeaderBinding implements ViewBinding {
   @NonNull
   public final TextView messageHeaderSubtitle;
   @NonNull
   public final TextView messageHeaderTitle;
   @NonNull
   private final View rootView;

   private MessageFrameJumpHeaderBinding(@NonNull View var1, @NonNull TextView var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.messageHeaderSubtitle = var2;
      this.messageHeaderTitle = var3;
   }

   @NonNull
   public static MessageFrameJumpHeaderBinding bind(@NonNull View var0) {
      int var1 = R.id.message_header_subtitle;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.message_header_title;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            return new MessageFrameJumpHeaderBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageFrameJumpHeaderBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_frame_jump_header, var1);
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
