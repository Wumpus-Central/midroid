package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class InviteToSpeakViewBinding implements ViewBinding {
   public final TextView inviteToSpeakText;
   public final SimpleDraweeView moveToSpeakerIcon;
   private final View rootView;

   private InviteToSpeakViewBinding(View var1, TextView var2, SimpleDraweeView var3) {
      this.rootView = var1;
      this.inviteToSpeakText = var2;
      this.moveToSpeakerIcon = var3;
   }

   public static InviteToSpeakViewBinding bind(View var0) {
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

   public static InviteToSpeakViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.invite_to_speak_view, var1);
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
