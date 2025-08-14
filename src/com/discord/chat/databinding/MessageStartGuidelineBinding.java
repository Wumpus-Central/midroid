package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

public final class MessageStartGuidelineBinding implements ViewBinding {
   @NonNull
   public final Guideline messageStartGuideline;
   @NonNull
   private final Guideline rootView;

   private MessageStartGuidelineBinding(@NonNull Guideline var1, @NonNull Guideline var2) {
      this.rootView = var1;
      this.messageStartGuideline = var2;
   }

   @NonNull
   public static MessageStartGuidelineBinding bind(@NonNull View var0) {
      if (var0 != null) {
         Guideline var1 = (Guideline)var0;
         return new MessageStartGuidelineBinding(var1, var1);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   @NonNull
   public static MessageStartGuidelineBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static MessageStartGuidelineBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_start_guideline, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public Guideline getRoot() {
      return this.rootView;
   }
}
