package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import f3.a;

public final class SurveyActionViewBinding implements ViewBinding {
   public final SimpleDraweeSpanTextView chatListAdapterItemTextFeedback;
   public final SimpleDraweeView chatListFeedbackIcon;
   private final View rootView;
   public final LinearLayout surveyBackground;
   public final CardView surveyCard;

   private SurveyActionViewBinding(View var1, SimpleDraweeSpanTextView var2, SimpleDraweeView var3, LinearLayout var4, CardView var5) {
      this.rootView = var1;
      this.chatListAdapterItemTextFeedback = var2;
      this.chatListFeedbackIcon = var3;
      this.surveyBackground = var4;
      this.surveyCard = var5;
   }

   public static SurveyActionViewBinding bind(View var0) {
      int var1 = R.id.chat_list_adapter_item_text_feedback;
      SimpleDraweeSpanTextView var4 = (SimpleDraweeSpanTextView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.chat_list_feedback_icon;
         SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.survey_background;
            LinearLayout var2 = (LinearLayout)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.survey_card;
               CardView var3 = (CardView)a.a(var0, var1);
               if (var3 != null) {
                  return new SurveyActionViewBinding(var0, var4, var5, var2, var3);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SurveyActionViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.survey_action_view, var1);
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
