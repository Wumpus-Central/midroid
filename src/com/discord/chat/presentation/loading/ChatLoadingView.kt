package com.discord.chat.presentation.loading

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import com.discord.chat.R
import com.discord.chat.bridge.row.LoadMoreButton
import com.discord.chat.databinding.ChatLoadingViewBinding
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class ChatLoadingView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout {
   private final val binding: ChatLoadingViewBinding

   fun ChatLoadingView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var4: ChatLoadingViewBinding = ChatLoadingViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      val var3: Int = var1.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      this.setPaddingRelative(var3, this.getPaddingTop(), var3, this.getPaddingBottom());
      var4.progressSpinner.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
   }

   @JvmStatic
   fun `showButton$lambda$0`(var0: Function0, var1: View) {
      q.h(var0, "$onClick");
      var0.invoke();
   }

   public fun showButton(button: LoadMoreButton, onClick: () -> Unit) {
      q.h(var1, "button");
      q.h(var2, "onClick");
      val var4: ProgressBar = this.binding.progressSpinner;
      q.g(this.binding.progressSpinner, "progressSpinner");
      var4.setVisibility(8);
      val var7: Button = this.binding.button;
      q.g(this.binding.button, "button");
      var7.setVisibility(0);
      this.binding.button.setText(var1.getText());
      val var8: Button = this.binding.button;
      q.g(this.binding.button, "button");
      DiscordFontUtilsKt.setDiscordFont(var8, DiscordFont.PrimaryMedium);
      this.binding.button.setClickable(true);
      this.binding.button.setBackgroundTintList(ColorStateList.valueOf(var1.getBackgroundColor()));
      val var9: Button = this.binding.button;
      val var5: Int = var1.getColor();
      val var3: Int;
      if (var5 != null) {
         var3 = var5;
      } else {
         var3 = -1;
      }

      var9.setTextColor(var3);
      val var6: Button = this.binding.button;
      q.g(this.binding.button, "button");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var6, false, new g3.a(var2), 1, null);
   }

   public fun showProgress() {
      val var1: ProgressBar = this.binding.progressSpinner;
      q.g(this.binding.progressSpinner, "progressSpinner");
      var1.setVisibility(0);
      val var2: Button = this.binding.button;
      q.g(this.binding.button, "button");
      var2.setVisibility(8);
      val var3: Button = this.binding.button;
      q.g(this.binding.button, "button");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, null, 1, null);
   }
}
