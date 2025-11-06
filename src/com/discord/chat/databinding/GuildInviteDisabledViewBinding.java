package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.GuildView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class GuildInviteDisabledViewBinding implements ViewBinding {
   @NonNull
   public final Barrier barrierButton;
   @NonNull
   public final Barrier barrierHeader;
   @NonNull
   public final ConstraintLayout itemBottomContainer;
   @NonNull
   public final SimpleDraweeView itemInviteDisabledIcon;
   @NonNull
   public final TextView itemInviteHeader;
   @NonNull
   public final SimpleDraweeView itemInviteHelpIcon;
   @NonNull
   public final GuildView itemInviteImage;
   @NonNull
   public final SimpleDraweeSpanTextView itemInviteSubtitle;
   @NonNull
   public final TextView itemInviteTitle;
   @NonNull
   private final View rootView;

   private GuildInviteDisabledViewBinding(
      @NonNull View var1,
      @NonNull Barrier var2,
      @NonNull Barrier var3,
      @NonNull ConstraintLayout var4,
      @NonNull SimpleDraweeView var5,
      @NonNull TextView var6,
      @NonNull SimpleDraweeView var7,
      @NonNull GuildView var8,
      @NonNull SimpleDraweeSpanTextView var9,
      @NonNull TextView var10
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

   @NonNull
   public static GuildInviteDisabledViewBinding bind(@NonNull View var0) {
      int var1 = R.id.barrier_button;
      Barrier var3 = (Barrier)k5.a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.barrier_header;
         Barrier var4 = (Barrier)k5.a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.item_bottom_container;
            ConstraintLayout var2 = (ConstraintLayout)k5.a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.item_invite_disabled_icon;
               SimpleDraweeView var10 = (SimpleDraweeView)k5.a.a(var0, var1);
               if (var10 != null) {
                  var1 = R.id.item_invite_header;
                  TextView var5 = (TextView)k5.a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.item_invite_help_icon;
                     SimpleDraweeView var8 = (SimpleDraweeView)k5.a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.item_invite_image;
                        GuildView var9 = (GuildView)k5.a.a(var0, var1);
                        if (var9 != null) {
                           var1 = R.id.item_invite_subtitle;
                           SimpleDraweeSpanTextView var6 = (SimpleDraweeSpanTextView)k5.a.a(var0, var1);
                           if (var6 != null) {
                              var1 = R.id.item_invite_title;
                              TextView var7 = (TextView)k5.a.a(var0, var1);
                              if (var7 != null) {
                                 return new GuildInviteDisabledViewBinding(var0, var3, var4, var2, var10, var5, var8, var9, var6, var7);
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

   @NonNull
   public static GuildInviteDisabledViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_invite_disabled_view, var1);
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
