package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollActionButton;
import y0.a;

public final class PollRecyclerViewBinding implements ViewBinding {
   @NonNull
   public final RecyclerView answers;
   @NonNull
   public final PollActionButton primaryAction;
   @NonNull
   public final TextView promptText;
   @NonNull
   public final TextView questionText;
   @NonNull
   private final View rootView;
   @NonNull
   public final PollActionButton secondaryActionButton;
   @NonNull
   public final PollActionButton tertiaryActionButton;

   private PollRecyclerViewBinding(
      @NonNull View var1,
      @NonNull RecyclerView var2,
      @NonNull PollActionButton var3,
      @NonNull TextView var4,
      @NonNull TextView var5,
      @NonNull PollActionButton var6,
      @NonNull PollActionButton var7
   ) {
      this.rootView = var1;
      this.answers = var2;
      this.primaryAction = var3;
      this.promptText = var4;
      this.questionText = var5;
      this.secondaryActionButton = var6;
      this.tertiaryActionButton = var7;
   }

   @NonNull
   public static PollRecyclerViewBinding bind(@NonNull View var0) {
      int var1 = R.id.answers;
      RecyclerView var5 = (RecyclerView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.primary_action;
         PollActionButton var2 = (PollActionButton)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.prompt_text;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.question_text;
               TextView var6 = (TextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.secondary_action_button;
                  PollActionButton var3 = (PollActionButton)a.a(var0, var1);
                  if (var3 != null) {
                     var1 = R.id.tertiary_action_button;
                     PollActionButton var7 = (PollActionButton)a.a(var0, var1);
                     if (var7 != null) {
                        return new PollRecyclerViewBinding(var0, var5, var2, var4, var6, var3, var7);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static PollRecyclerViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.poll_recycler_view, var1);
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
