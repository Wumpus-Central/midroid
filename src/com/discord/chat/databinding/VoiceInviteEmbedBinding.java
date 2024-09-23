package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import n1.a;

public final class VoiceInviteEmbedBinding implements ViewBinding {
   public final TextView body;
   public final CardView card;
   public final DCDButton joinCta;
   private final View rootView;
   public final TextView title;

   private VoiceInviteEmbedBinding(View var1, TextView var2, CardView var3, DCDButton var4, TextView var5) {
      this.rootView = var1;
      this.body = var2;
      this.card = var3;
      this.joinCta = var4;
      this.title = var5;
   }

   public static VoiceInviteEmbedBinding bind(View var0) {
      int var1 = R.id.body;
      TextView var4 = (TextView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.card;
         CardView var3 = (CardView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.join_cta;
            DCDButton var5 = (DCDButton)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.title;
               TextView var2 = (TextView)a.a(var0, var1);
               if (var2 != null) {
                  return new VoiceInviteEmbedBinding(var0, var4, var3, var5, var2);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static VoiceInviteEmbedBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.voice_invite_embed, var1);
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
