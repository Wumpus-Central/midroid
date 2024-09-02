package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.util.AttributeSet
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType
import com.discord.chat.bridge.polls.PollRadioStyle
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

public class PollCheckboxView  public constructor(context: Context, attrs: AttributeSet? = null) : SimpleDraweeView {
   fun PollCheckboxView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
   }

   public fun configure(accessory: PollAnswerAccessory) {
      q.h(var1, "accessory");
      if (var1.getStyleSet().getRadioStyle() === PollRadioStyle.NONE) {
         this.setVisibility(4);
      } else {
         this.setVisibility(0);
         var var5: Any;
         if (var1.getAnswer().getDidSelfVote()) {
            var5 = this.getContext();
            q.g(var5, "getContext(...)");
            var5 = I18nUtilsKt.i18nFormat$default((Context)var5, I18nMessage.POLL_ANSWER_VOTED_ARIA, null, 2, null);
         } else {
            var5 = "";
         }

         this.setContentDescription((java.lang.CharSequence)var5);
         val var2: Boolean;
         if (var1.getInteractionType() === PollChatAnswerInteractionType.CHECKBOXES) {
            var2 = true;
         } else {
            var2 = false;
         }

         val var3: Int;
         if (var2) {
            var3 = SizeUtilsKt.getDpToPx(8);
         } else {
            var3 = ROUND;
         }

         if (var1.getStyleSet().getRadioStyle() === PollRadioStyle.HOLLOW) {
            this.setImageURI(null);
            ViewBackgroundUtilsKt.setBackgroundRectangle(this, 0, var3, var1.getRadioBackgroundColor(), SizeUtilsKt.getDpToPx(2));
         } else if (var1.getStyleSet().getRadioStyle() != PollRadioStyle.CHECKMARK && !var2) {
            if (var1.getStyleSet().getRadioStyle() === PollRadioStyle.FILLED) {
               this.setImageURI(null);
               ViewBackgroundUtilsKt.setBackgroundRectangle(
                  this, var1.getRadioForegroundColor(), var3, var1.getRadioBackgroundColor(), SizeUtilsKt.getDpToPx(6)
               );
            }
         } else {
            ReactAssetUtilsKt.setReactImageUrl(this, var1.getResources().getCheckmarkIcon());
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var1.getRadioBackgroundColor(), var3, null, 0, 12, null);
            ColorUtilsKt.setTintColor(this, var1.getRadioForegroundColor());
         }
      }
   }

   public companion object {
      private final val ROUND: Int
   }
}
