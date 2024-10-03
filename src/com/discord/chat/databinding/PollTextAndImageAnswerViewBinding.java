package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollCheckboxView;
import com.discord.chat.presentation.message.view.polls.PollMediaView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import o1.a;

public final class PollTextAndImageAnswerViewBinding implements ViewBinding {
   public final PollCheckboxView checkbox;
   public final PollMediaView image;
   public final SimpleDraweeSpanTextView label;
   public final View percentageBarBackground;
   public final FrameLayout percentageBarContainer;
   private final ConstraintLayout rootView;
   public final TextView voteCounts;
   public final TextView votePercentage;

   private PollTextAndImageAnswerViewBinding(
      ConstraintLayout var1,
      PollCheckboxView var2,
      PollMediaView var3,
      SimpleDraweeSpanTextView var4,
      View var5,
      FrameLayout var6,
      TextView var7,
      TextView var8
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

   public static PollTextAndImageAnswerViewBinding bind(View var0) {
      int var1 = R.id.checkbox;
      PollCheckboxView var6 = (PollCheckboxView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.image;
         PollMediaView var7 = (PollMediaView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.label;
            SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.percentage_bar_background;
               View var2 = a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.percentage_bar_container;
                  FrameLayout var4 = (FrameLayout)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.vote_counts;
                     TextView var3 = (TextView)a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.vote_percentage;
                        TextView var8 = (TextView)a.a(var0, var1);
                        if (var8 != null) {
                           return new PollTextAndImageAnswerViewBinding((ConstraintLayout)var0, var6, var7, var5, var2, var4, var3, var8);
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static PollTextAndImageAnswerViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static PollTextAndImageAnswerViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.poll_text_and_image_answer_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
