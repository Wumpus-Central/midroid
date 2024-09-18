package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Flow
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.bridge.polls.PollAnswer
import com.discord.chat.databinding.PollImageOnlyAnswerViewBinding
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

public class PollImageOnlyView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : BasePollWithRecyclerView {
   protected open val myAdapter: com.discord.chat.presentation.message.view.polls.PollImageOnlyView.ImageOnlyAnswerAdapter

   fun PollImageOnlyView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun PollImageOnlyView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      this.myAdapter = new PollImageOnlyView.ImageOnlyAnswerAdapter();
      val var4: RecyclerView = this.getBinding().answers;
      var4.addItemDecoration(new GridGapItemDecoration(2, SizeUtilsKt.getDpToPx(8)));
      var4.setLayoutManager(new GridLayoutManager(var1, 2));
      var4.setAdapter(this.getMyAdapter());
   }

   public class ImageOnlyAnswerAdapter : PollAnswerAdapter<PollImageOnlyView.ImageOnlyAnswerHolder> {
      public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.discord.chat.presentation.message.view.polls.PollImageOnlyView.ImageOnlyAnswerHolder {
         q.h(var1, "parent");
         val var3: PollImageOnlyAnswerViewBinding = PollImageOnlyAnswerViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false);
         q.g(var3, "inflate(...)");
         return new PollImageOnlyView.ImageOnlyAnswerHolder(var3);
      }
   }

   public class ImageOnlyAnswerHolder(binding: PollImageOnlyAnswerViewBinding) : PollAnswerViewHolder<PollImageOnlyAnswerViewBinding> {
      init {
         q.h(var1, "binding");
         super(var1);
         val var2: SimpleDraweeView = var1.avatar;
         q.g(var1.avatar, "avatar");
         ViewClippingUtilsKt.clipToCircle(var2);
         val var5: ConstraintLayout = var1.getRoot();
         q.g(var5, "getRoot(...)");
         ViewClippingUtilsKt.clipToRoundedRectangle(var5, SizeUtilsKt.getDpToPx(12));
         val var6: PollMediaView = var1.image;
         q.g(var1.image, "image");
         ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(12));
         val var3: TextView = var1.votePercentage;
         q.g(var1.votePercentage, "votePercentage");
         val var7: DiscordFont = DiscordFont.PrimarySemibold;
         DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
         val var4: TextView = var1.voteCounts;
         q.g(var1.voteCounts, "voteCounts");
         DiscordFontUtilsKt.setDiscordFont(var4, var7);
      }

      public override fun bind(accessory: PollAnswerAccessory, onTapAnswer: () -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
         q.h(var1, "accessory");
         q.h(var2, "onTapAnswer");
         q.h(var3, "onLongPressImage");
         val var8: PollAnswer = var1.getAnswer();
         val var5: Int = var1.getStyleSet().getBorderWidthPx();
         val var7: ConstraintLayout = (this.getBinding() as PollImageOnlyAnswerViewBinding).getRoot();
         q.e(var7);
         ViewBackgroundUtilsKt.setBackgroundRectangle(var7, var1.getAnswerBackgroundColor(), SizeUtilsKt.getDpToPx(12), var1.getBorderColor(), var5);
         val var22: PollMediaView = (this.getBinding() as PollImageOnlyAnswerViewBinding).image;
         var22.setContentDescription(var8.getPollMedia().getText());
         var22.setAlpha(var1.getStyleSet().getOpacity());
         q.e(var22);
         val var9: android.view.ViewGroup.LayoutParams = var22.getLayoutParams();
         if (var9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
         } else {
            val var25: ConstraintLayout.LayoutParams = var9 as ConstraintLayout.LayoutParams;
            (var9 as ConstraintLayout.LayoutParams).setMargins(var5, var5, var5, var5);
            var22.setLayoutParams(var25);
            var22.setMedia(var1, var2, var3);
            val var6: Boolean = var8.getDidSelfVote();
            val var12: Flow = (this.getBinding() as PollImageOnlyAnswerViewBinding).infoBar;
            q.e(var12);
            var var4: Boolean;
            if (!var6 && !var1.getCanShowVoteCounts()) {
               var4 = 0;
            } else {
               var4 = 1;
            }

            if (var4) {
               var4 = (byte)0;
            } else {
               var4 = (byte)8;
            }

            var12.setVisibility(var4);
            var12.setBackgroundTintList(ColorStateList.valueOf(var1.getAnswerFillColor()));
            var12.setPaddingBottom(SizeUtilsKt.getDpToPx(4) - var5);
            val var23: SimpleDraweeView = (this.getBinding() as PollImageOnlyAnswerViewBinding).avatar;
            q.e(var23);
            var var13: java.lang.String = var1.getMyAvatarUrl();
            if (!java.lang.Boolean.valueOf(var6)) {
               var13 = null;
            }

            SetOptionalImageUrlKt.setOptionalImageUrl$default(var23, var13, null, null, 6, null);
            val var26: SimpleDraweeView = (this.getBinding() as PollImageOnlyAnswerViewBinding).selectedIcon;
            q.e(var26);
            val var24: java.lang.String = var1.getResources().getSelectedIcon();
            var var14: java.lang.String = null;
            if (java.lang.Boolean.valueOf(q.c(var8.isSelected(), java.lang.Boolean.TRUE))) {
               var14 = var24;
            }

            ReactAssetUtilsKt.setOptionalReactImageUrl(var26, var14);
            if (var1.getCanShowVoteCounts()) {
               val var18: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).votePercentage;
               q.e(var18);
               var18.setVisibility(0);
               var4 = var8.getVotesPercentage();
               val var15: StringBuilder = new StringBuilder();
               var15.append(var4);
               var15.append("%");
               var18.setText(var15.toString());
               var18.setTextColor(var1.getLabelColor());
               val var16: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).voteCounts;
               q.e(var16);
               var16.setVisibility(0);
               var16.setText(var8.getVotes());
               var16.setTextColor(var1.getLabelColor());
            } else {
               val var10: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).votePercentage;
               q.g(var10, "votePercentage");
               var10.setVisibility(8);
               val var11: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).voteCounts;
               q.g(var11, "voteCounts");
               var11.setVisibility(8);
            }
         }
      }
   }
}
