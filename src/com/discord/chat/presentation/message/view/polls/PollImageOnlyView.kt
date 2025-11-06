package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
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
import kotlin.jvm.internal.SourceDebugExtension

public class PollImageOnlyView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : BasePollWithRecyclerView(
         var1, var2, var3
      ),
   PollPresenter {
   protected open val myAdapter: com.discord.chat.presentation.message.view.polls.PollImageOnlyView.ImageOnlyAnswerAdapter =
      new PollImageOnlyView.ImageOnlyAnswerAdapter()

   fun PollImageOnlyView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun PollImageOnlyView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: RecyclerView = this.getBinding().answers;
      var4.addItemDecoration(new GridGapItemDecoration(2, SizeUtilsKt.getDpToPx(8)));
      var4.setLayoutManager(new GridLayoutManager(var1, 2));
      var4.setAdapter(this.getMyAdapter());
   }

   public class ImageOnlyAnswerAdapter : PollAnswerAdapter<PollImageOnlyView.ImageOnlyAnswerHolder> {
      public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.discord.chat.presentation.message.view.polls.PollImageOnlyView.ImageOnlyAnswerHolder {
         val var3: PollImageOnlyAnswerViewBinding = PollImageOnlyAnswerViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false);
         return new PollImageOnlyView.ImageOnlyAnswerHolder(var3);
      }
   }

   @SourceDebugExtension(["SMAP\nPollImageOnlyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollImageOnlyView.kt\ncom/discord/chat/presentation/message/view/polls/PollImageOnlyView$ImageOnlyAnswerHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n327#2,2:153\n329#2,2:157\n257#2,2:159\n257#2,2:162\n257#2,2:164\n257#2,2:166\n257#2,2:168\n190#3,2:155\n1#4:161\n*S KotlinDebug\n*F\n+ 1 PollImageOnlyView.kt\ncom/discord/chat/presentation/message/view/polls/PollImageOnlyView$ImageOnlyAnswerHolder\n*L\n101#1:153,2\n101#1:157,2\n113#1:159,2\n134#1:162,2\n141#1:164,2\n146#1:166,2\n147#1:168,2\n102#1:155,2\n*E\n"])
   public class ImageOnlyAnswerHolder(binding: PollImageOnlyAnswerViewBinding) : PollAnswerViewHolder(var1) {
      init {
         val var2: SimpleDraweeView = var1.avatar;
         ViewClippingUtilsKt.clipToCircle(var2);
         val var5: ConstraintLayout = var1.getRoot();
         ViewClippingUtilsKt.clipToRoundedRectangle(var5, SizeUtilsKt.getDpToPx(12));
         val var6: PollMediaView = var1.image;
         ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(12));
         val var3: TextView = var1.votePercentage;
         val var7: DiscordFont = DiscordFont.PrimarySemibold;
         DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
         val var4: TextView = var1.voteCounts;
         DiscordFontUtilsKt.setDiscordFont(var4, var7);
      }

      public override fun bind(accessory: PollAnswerAccessory, onTapAnswer: () -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
         val var8: PollAnswer = var1.getAnswer();
         val var5: Int = var1.getStyleSet().getBorderWidthPx();
         val var7: ConstraintLayout = (this.getBinding() as PollImageOnlyAnswerViewBinding).getRoot();
         ViewBackgroundUtilsKt.setBackgroundRectangle(var7, var1.getAnswerBackgroundColor(), SizeUtilsKt.getDpToPx(12), var1.getBorderColor(), var5);
         val var21: PollMediaView = (this.getBinding() as PollImageOnlyAnswerViewBinding).image;
         var21.setContentDescription(var8.getPollMedia().getText());
         var21.setAlpha(var1.getStyleSet().getOpacity());
         val var9: LayoutParams = var21.getLayoutParams();
         if (var9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
         } else {
            val var24: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams = var9 as androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
            (var9 as androidx.constraintlayout.widget.ConstraintLayout.LayoutParams).setMargins(var5, var5, var5, var5);
            var21.setLayoutParams(var24);
            var21.setMedia(var1, var2, var3);
            val var6: Boolean = var8.getDidSelfVote();
            val var12: Flow = (this.getBinding() as PollImageOnlyAnswerViewBinding).infoBar;
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
            val var22: SimpleDraweeView = (this.getBinding() as PollImageOnlyAnswerViewBinding).avatar;
            var var13: java.lang.String = var1.getMyAvatarUrl();
            if (!var6) {
               var13 = null;
            }

            SetOptionalImageUrlKt.setOptionalImageUrl$default(var22, var13, null, null, null, 14, null);
            val var25: SimpleDraweeView = (this.getBinding() as PollImageOnlyAnswerViewBinding).selectedIcon;
            val var23: java.lang.String = var1.getResources().getSelectedIcon();
            var var14: java.lang.String = null;
            if (var8.isSelected() == java.lang.Boolean.TRUE) {
               var14 = var23;
            }

            ReactAssetUtilsKt.setOptionalReactImageUrl(var25, var14);
            if (var1.getCanShowVoteCounts()) {
               val var18: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).votePercentage;
               var18.setVisibility(0);
               var4 = var8.getVotesPercentage();
               val var15: StringBuilder = new StringBuilder();
               var15.append(var4);
               var15.append("%");
               var18.setText(var15.toString());
               var18.setTextColor(var1.getLabelColor());
               val var16: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).voteCounts;
               var16.setVisibility(0);
               var16.setText(var8.getVotes());
               var16.setTextColor(var1.getLabelColor());
            } else {
               val var10: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).votePercentage;
               var10.setVisibility(8);
               val var11: TextView = (this.getBinding() as PollImageOnlyAnswerViewBinding).voteCounts;
               var11.setVisibility(8);
            }
         }
      }
   }
}
