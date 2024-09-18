package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.bridge.polls.PollAnswer
import com.discord.chat.databinding.PollTextAndImageAnswerViewBinding
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.internal.q

public class PollTextAndImageView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : BasePollWithRecyclerView {
   protected open val myAdapter: com.discord.chat.presentation.message.view.polls.PollTextAndImageView.ImageAndTextAnswerAdapter

   fun PollTextAndImageView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun PollTextAndImageView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      this.myAdapter = new PollTextAndImageView.ImageAndTextAnswerAdapter();
      val var4: RecyclerView = this.getBinding().answers;
      var4.addItemDecoration(new VerticalGapItemDecoration(SizeUtilsKt.getDpToPx(8)));
      var4.setLayoutManager(new LinearLayoutManager(var1, 1, false));
      var4.setAdapter(this.getMyAdapter());
   }

   public class ImageAndTextAnswerAdapter : PollAnswerAdapter<PollTextAndImageView.ImageAndTextAnswerHolder> {
      public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.discord.chat.presentation.message.view.polls.PollTextAndImageView.ImageAndTextAnswerHolder {
         q.h(var1, "parent");
         val var3: PollTextAndImageAnswerViewBinding = PollTextAndImageAnswerViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false);
         q.g(var3, "inflate(...)");
         return new PollTextAndImageView.ImageAndTextAnswerHolder(var3);
      }
   }

   public class ImageAndTextAnswerHolder(binding: PollTextAndImageAnswerViewBinding) : PollAnswerViewHolder<PollTextAndImageAnswerViewBinding> {
      init {
         q.h(var1, "binding");
         super(var1);
         val var2: SimpleDraweeSpanTextView = var1.label;
         var1.label.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
         q.e(var2);
         DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimarySemibold);
         val var4: FrameLayout = var1.percentageBarContainer;
         q.g(var1.percentageBarContainer, "percentageBarContainer");
         ViewClippingUtilsKt.clipToRoundedRectangle(var4, BORDER_RADIUS);
         val var5: TextView = var1.votePercentage;
         var1.votePercentage.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
         q.e(var5);
         DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryBold);
         val var3: TextView = var1.voteCounts;
         var1.voteCounts.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
         q.e(var3);
         DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      }

      public override fun bind(accessory: PollAnswerAccessory, onTapAnswer: () -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
         q.h(var1, "accessory");
         q.h(var2, "onTapAnswer");
         q.h(var3, "onLongPressImage");
         val var6: PollAnswer = var1.getAnswer();
         val var5: Int = var1.getBorderWidthPx();
         val var7: ConstraintLayout = (this.getBinding() as PollTextAndImageAnswerViewBinding).getRoot();
         q.e(var7);
         ViewBackgroundUtilsKt.setBackgroundRectangle(var7, var1.getAnswerBackgroundColor(), BORDER_RADIUS, var1.getBorderColor(), var5);
         val var16: View = (this.getBinding() as PollTextAndImageAnswerViewBinding).percentageBarBackground;
         q.e(var16);
         var var14: Byte;
         if (var1.getCanShowVoteCounts()) {
            var14 = 0;
         } else {
            var14 = 8;
         }

         var16.setVisibility(var14);
         val var4: Float = var6.getVotesPercentage() / 100.0F;
         if (var1.getCanShowVoteCounts()) {
            var16.setBackgroundColor(var1.getAnswerFillColor());
            var16.setPivotX(0.0F);
            if (var1.getShouldAnimateTransition()) {
               var16.setScaleX(0.0F);
               var16.animate().setDuration(1200L).setInterpolator(new AccelerateDecelerateInterpolator()).scaleX(var4);
            } else {
               var16.setScaleX(var4);
            }
         }

         val var17: PollMediaView = (this.getBinding() as PollTextAndImageAnswerViewBinding).image;
         var17.setAlpha(var1.getStyleSet().getOpacity());
         var17.setMedia(var1, var2, var3);
         val var10: SimpleDraweeSpanTextView = (this.getBinding() as PollTextAndImageAnswerViewBinding).label;
         var10.setTextColor(var1.getLabelColor());
         var10.setText(var6.getPollMedia().getText());
         (this.getBinding() as PollTextAndImageAnswerViewBinding).checkbox.configure(var1);
         if (var1.getCanShowVoteCounts()) {
            val var13: TextView = (this.getBinding() as PollTextAndImageAnswerViewBinding).votePercentage;
            q.e(var13);
            var13.setVisibility(0);
            var13.setTextColor(var1.getLabelColor());
            var14 = var6.getVotesPercentage();
            val var11: StringBuilder = new StringBuilder();
            var11.append(var14);
            var11.append("%");
            var13.setText(var11.toString());
            val var12: TextView = (this.getBinding() as PollTextAndImageAnswerViewBinding).voteCounts;
            q.e(var12);
            var12.setVisibility(0);
            var12.setTextColor(var1.getLabelColor());
            var12.setText(var6.getVotes());
         } else {
            val var8: TextView = (this.getBinding() as PollTextAndImageAnswerViewBinding).votePercentage;
            q.g(var8, "votePercentage");
            var8.setVisibility(8);
            val var9: TextView = (this.getBinding() as PollTextAndImageAnswerViewBinding).voteCounts;
            q.g(var9, "voteCounts");
            var9.setVisibility(8);
         }
      }

      public companion object {
         private final val BORDER_RADIUS: Int
         private const val VOTED_TRANSITION_DURATION_MS: Long
      }
   }
}
