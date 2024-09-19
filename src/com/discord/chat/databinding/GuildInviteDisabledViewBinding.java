package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class GuildInviteDisabledViewBinding implements ViewBinding {
   public final Barrier barrierButton;
   public final Barrier barrierHeader;
   public final ConstraintLayout itemBottomContainer;
   public final SimpleDraweeView itemInviteDisabledIcon;
   public final TextView itemInviteHeader;
   public final SimpleDraweeView itemInviteHelpIcon;
   public final GuildView itemInviteImage;
   public final SimpleDraweeSpanTextView itemInviteSubtitle;
   public final TextView itemInviteTitle;
   private final View rootView;

   private GuildInviteDisabledViewBinding(
      View var1,
      Barrier var2,
      Barrier var3,
      ConstraintLayout var4,
      SimpleDraweeView var5,
      TextView var6,
      SimpleDraweeView var7,
      GuildView var8,
      SimpleDraweeSpanTextView var9,
      TextView var10
   ) {
      this.rootView = var1;
      this.barrierButton = var2;
      this.barrierHeader = var3;
      this.itemBottomContainer = var4;
      this.itemInviteDisabledIcon = var5;
      this.itemInviteHeader = var6;
      this.itemInviteHelpIcon = var7;
      this.itemInviteImage = var8;
      this.itemInviteSubtitle = var9;
      this.itemInviteTitle = var10;
   }

   public static GuildInviteDisabledViewBinding bind(View var0) {
      int var1 = R.id.barrier_button;
      Barrier var4 = (Barrier)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.barrier_header;
         Barrier var8 = (Barrier)a.a(var0, var1);
         if (var8 != null) {
            var1 = R.id.item_bottom_container;
            ConstraintLayout var5 = (ConstraintLayout)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.item_invite_disabled_icon;
               SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.item_invite_header;
                  TextView var10 = (TextView)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.item_invite_help_icon;
                     SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.item_invite_image;
                        GuildView var2 = (GuildView)a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.item_invite_subtitle;
                           SimpleDraweeSpanTextView var7 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.item_invite_title;
                              TextView var9 = (TextView)a.a(var0, var1);
                              if (var9 != null) {
                                 return new GuildInviteDisabledViewBinding(var0, var4, var8, var5, var6, var10, var3, var2, var7, var9);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static GuildInviteDisabledViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_invite_disabled_view, var1);
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
