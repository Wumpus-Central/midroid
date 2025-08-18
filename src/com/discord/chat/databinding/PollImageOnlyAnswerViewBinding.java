package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollMediaView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class PollImageOnlyAnswerViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView avatar;
   @NonNull
   public final Space avatarPlaceholder;
   @NonNull
   public final PollMediaView image;
   @NonNull
   public final Flow infoBar;
   @NonNull
   private final ConstraintLayout rootView;
   @NonNull
   public final SimpleDraweeView selectedIcon;
   @NonNull
   public final TextView voteCounts;
   @NonNull
   public final TextView votePercentage;

   private PollImageOnlyAnswerViewBinding(
      @NonNull ConstraintLayout var1,
      @NonNull SimpleDraweeView var2,
      @NonNull Space var3,
      @NonNull PollMediaView var4,
      @NonNull Flow var5,
      @NonNull SimpleDraweeView var6,
      @NonNull TextView var7,
      @NonNull TextView var8
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

   @NonNull
   public static PollImageOnlyAnswerViewBinding bind(@NonNull View var0) {
      int var1 = R.id.avatar;
      SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.avatar_placeholder;
         Space var6 = (Space)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.image;
            PollMediaView var3 = (PollMediaView)a.a(var0, var1);
            if (var3 != null) {
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
                        TextView var8 = (TextView)a.a(var0, var1);
                        if (var8 != null) {
                           return new PollImageOnlyAnswerViewBinding((ConstraintLayout)var0, var5, var6, var3, var7, var2, var4, var8);
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
   public static PollImageOnlyAnswerViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static PollImageOnlyAnswerViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.poll_image_only_answer_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
