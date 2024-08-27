package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.polls.PollActionButton;
import n1.a;

public final class PollRecyclerViewBinding implements ViewBinding {
   public final RecyclerView answers;
   public final PollActionButton primaryAction;
   public final TextView promptText;
   public final TextView questionText;
   private final View rootView;
   public final PollActionButton secondaryActionButton;
   public final PollActionButton tertiaryActionButton;

   private PollRecyclerViewBinding(
      View var1, RecyclerView var2, PollActionButton var3, TextView var4, TextView var5, PollActionButton var6, PollActionButton var7
   ) {
      this.rootView = var1;
      this.answers = var2;
      this.primaryAction = var3;
      this.promptText = var4;
      this.questionText = var5;
      this.secondaryActionButton = var6;
      this.tertiaryActionButton = var7;
   }

   public static PollRecyclerViewBinding bind(View var0) {
      int var1 = R.id.answers;
      RecyclerView var7 = (RecyclerView)a.a(var0, var1);
      if (var7 != null) {
         var1 = R.id.primary_action;
         PollActionButton var2 = (PollActionButton)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.prompt_text;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.question_text;
               TextView var4 = (TextView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.secondary_action_button;
                  PollActionButton var6 = (PollActionButton)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.tertiary_action_button;
                     PollActionButton var5 = (PollActionButton)a.a(var0, var1);
                     if (var5 != null) {
                        return new PollRecyclerViewBinding(var0, var7, var2, var3, var4, var6, var5);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static PollRecyclerViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.poll_recycler_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
