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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nChatLoadingView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatLoadingView.kt\ncom/discord/chat/presentation/loading/ChatLoadingView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,49:1\n146#2,8:50\n257#2,2:58\n257#2,2:60\n257#2,2:62\n257#2,2:64\n*S KotlinDebug\n*F\n+ 1 ChatLoadingView.kt\ncom/discord/chat/presentation/loading/ChatLoadingView\n*L\n27#1:50,8\n32#1:58,2\n33#1:60,2\n38#1:62,2\n39#1:64,2\n*E\n"])
public class ChatLoadingView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout(var1, var2) {
   private final val binding: ChatLoadingViewBinding

   fun ChatLoadingView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var4: ChatLoadingViewBinding = ChatLoadingViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      val var3: Int = var1.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      this.setPaddingRelative(var3, this.getPaddingTop(), var3, this.getPaddingBottom());
      var4.progressSpinner.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
   }

   @JvmStatic
   fun `showButton$lambda$0`(var0: Function0, var1: View) {
      var0.invoke();
   }

   public fun showButton(button: LoadMoreButton, onClick: () -> Unit) {
      val var4: ProgressBar = this.binding.progressSpinner;
      var4.setVisibility(8);
      val var7: Button = this.binding.button;
      var7.setVisibility(0);
      this.binding.button.setText(var1.getText());
      val var8: Button = this.binding.button;
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
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var6, false, new x2.a(var2), 1, null);
   }

   public fun showProgress() {
      val var1: ProgressBar = this.binding.progressSpinner;
      var1.setVisibility(0);
      val var2: Button = this.binding.button;
      var2.setVisibility(8);
      val var3: Button = this.binding.button;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, null, 1, null);
   }
}
