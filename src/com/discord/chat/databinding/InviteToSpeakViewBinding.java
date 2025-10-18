package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class InviteToSpeakViewBinding implements ViewBinding {
   @NonNull
   public final TextView inviteToSpeakText;
   @NonNull
   public final SimpleDraweeView moveToSpeakerIcon;
   @NonNull
   private final View rootView;

   private InviteToSpeakViewBinding(@NonNull View var1, @NonNull TextView var2, @NonNull SimpleDraweeView var3) {
      this.rootView = var1;
      this.inviteToSpeakText = var2;
      this.moveToSpeakerIcon = var3;
   }

   @NonNull
   public static InviteToSpeakViewBinding bind(@NonNull View var0) {
      int var1 = R.id.invite_to_speak_text;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.move_to_speaker_icon;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            return new InviteToSpeakViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static InviteToSpeakViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.invite_to_speak_view, var1);
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
