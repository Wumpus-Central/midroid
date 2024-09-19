package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollMediaView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class PollImageOnlyAnswerViewBinding implements ViewBinding {
   public final SimpleDraweeView avatar;
   public final Space avatarPlaceholder;
   public final PollMediaView image;
   public final Flow infoBar;
   private final ConstraintLayout rootView;
   public final SimpleDraweeView selectedIcon;
   public final TextView voteCounts;
   public final TextView votePercentage;

   private PollImageOnlyAnswerViewBinding(
      ConstraintLayout var1, SimpleDraweeView var2, Space var3, PollMediaView var4, Flow var5, SimpleDraweeView var6, TextView var7, TextView var8
   ) {
      this.rootView = var1;
      this.avatar = var2;
      this.avatarPlaceholder = var3;
      this.image = var4;
      this.infoBar = var5;
      this.selectedIcon = var6;
      this.voteCounts = var7;
      this.votePercentage = var8;
   }

   public static PollImageOnlyAnswerViewBinding bind(View var0) {
      int var1 = R.id.avatar;
      SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.avatar_placeholder;
         Space var3 = (Space)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.image;
            PollMediaView var6 = (PollMediaView)a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.info_bar;
               Flow var7 = (Flow)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.selected_icon;
                  SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.vote_counts;
                     TextView var4 = (TextView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.vote_percentage;
                        TextView var5 = (TextView)a.a(var0, var1);
                        if (var5 != null) {
                           return new PollImageOnlyAnswerViewBinding((ConstraintLayout)var0, var8, var3, var6, var7, var2, var4, var5);
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static PollImageOnlyAnswerViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static PollImageOnlyAnswerViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.poll_image_only_answer_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
