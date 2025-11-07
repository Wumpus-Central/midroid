package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class SurveyActionViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeSpanTextView chatListAdapterItemTextFeedback;
   @NonNull
   public final SimpleDraweeView chatListFeedbackIcon;
   @NonNull
   private final View rootView;
   @NonNull
   public final LinearLayout surveyBackground;
   @NonNull
   public final CardView surveyCard;

   private SurveyActionViewBinding(
      @NonNull View var1, @NonNull SimpleDraweeSpanTextView var2, @NonNull SimpleDraweeView var3, @NonNull LinearLayout var4, @NonNull CardView var5
   ) {
      this.rootView = var1;
      this.chatListAdapterItemTextFeedback = var2;
      this.chatListFeedbackIcon = var3;
      this.surveyBackground = var4;
      this.surveyCard = var5;
   }

   @NonNull
   public static SurveyActionViewBinding bind(@NonNull View var0) {
      int var1 = R.id.chat_list_adapter_item_text_feedback;
      SimpleDraweeSpanTextView var3 = (SimpleDraweeSpanTextView)k5.a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.chat_list_feedback_icon;
         SimpleDraweeView var2 = (SimpleDraweeView)k5.a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.survey_background;
            LinearLayout var4 = (LinearLayout)k5.a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.survey_card;
               CardView var5 = (CardView)k5.a.a(var0, var1);
               if (var5 != null) {
                  return new SurveyActionViewBinding(var0, var3, var2, var4, var5);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static SurveyActionViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.survey_action_view, var1);
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
