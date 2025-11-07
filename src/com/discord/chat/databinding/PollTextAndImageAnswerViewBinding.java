package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollCheckboxView;
import com.discord.chat.presentation.message.view.polls.PollMediaView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;

public final class PollTextAndImageAnswerViewBinding implements ViewBinding {
   @NonNull
   public final PollCheckboxView checkbox;
   @NonNull
   public final PollMediaView image;
   @NonNull
   public final SimpleDraweeSpanTextView label;
   @NonNull
   public final View percentageBarBackground;
   @NonNull
   public final FrameLayout percentageBarContainer;
   @NonNull
   private final ConstraintLayout rootView;
   @NonNull
   public final TextView voteCounts;
   @NonNull
   public final TextView votePercentage;

   private PollTextAndImageAnswerViewBinding(
      @NonNull ConstraintLayout var1,
      @NonNull PollCheckboxView var2,
      @NonNull PollMediaView var3,
      @NonNull SimpleDraweeSpanTextView var4,
      @NonNull View var5,
      @NonNull FrameLayout var6,
      @NonNull TextView var7,
      @NonNull TextView var8
   ) {
      this.rootView = var1;
      this.checkbox = var2;
      this.image = var3;
      this.label = var4;
      this.percentageBarBackground = var5;
      this.percentageBarContainer = var6;
      this.voteCounts = var7;
      this.votePercentage = var8;
   }

   @NonNull
   public static PollTextAndImageAnswerViewBinding bind(@NonNull View var0) {
      int var1 = R.id.checkbox;
      PollCheckboxView var4 = (PollCheckboxView)k5.a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.image;
         PollMediaView var3 = (PollMediaView)k5.a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.label;
            SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)k5.a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.percentage_bar_background;
               View var2 = k5.a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.percentage_bar_container;
                  FrameLayout var7 = (FrameLayout)k5.a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.vote_counts;
                     TextView var6 = (TextView)k5.a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.vote_percentage;
                        TextView var8 = (TextView)k5.a.a(var0, var1);
                        if (var8 != null) {
                           return new PollTextAndImageAnswerViewBinding((ConstraintLayout)var0, var4, var3, var5, var2, var7, var6, var8);
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
   public static PollTextAndImageAnswerViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static PollTextAndImageAnswerViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.poll_text_and_image_answer_view, var1, false);
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
