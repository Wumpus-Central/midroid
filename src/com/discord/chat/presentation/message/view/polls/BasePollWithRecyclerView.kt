package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.h0
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.databinding.PollRecyclerViewBinding
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.presentation.message.view.polls.a11y.PollAnswersRecyclerAccessibilityDelegate
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.recycler_view.animator.NoMoveItemAnimator
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function8
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nBasePollWithRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePollWithRecyclerView.kt\ncom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,167:1\n176#2,2:168\n257#2,2:170\n*S KotlinDebug\n*F\n+ 1 BasePollWithRecyclerView.kt\ncom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView\n*L\n49#1:168,2\n133#1:170,2\n*E\n"])
public abstract class BasePollWithRecyclerView : ConstraintLayout, PollPresenter {
   protected final val binding: PollRecyclerViewBinding
   protected abstract val myAdapter: PollAnswerAdapter<*>

   open fun BasePollWithRecyclerView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   open fun BasePollWithRecyclerView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   open fun BasePollWithRecyclerView(var1: Context, var2: AttributeSet, var3: Int) {
      super(var1, var2, var3);
      val var5: PollRecyclerViewBinding = PollRecyclerViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      val var7: RecyclerView = var5.answers;
      val var4: NoMoveItemAnimator = new NoMoveItemAnimator() {
         {
            super(null, null, 3, null);
         }

         public void endAnimation(ViewHolder var1) {
            super.endAnimation(var1);
            val var2: View = var1.itemView;
            MaybeAnimateElevationToKt.maybeEndAnimation(var2);
         }
      };
      var4.setSupportsChangeAnimations(false);
      var7.setItemAnimator(var4);
      val var8: View = var5.getRoot();
      var3 = SizeUtilsKt.getDpToPx(16);
      var8.setPadding(var3, var3, var3, var3);
      val var9: TextView = var5.questionText;
      var5.questionText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
      val var6: TextView = var5.promptText;
      var5.promptText.setTextColor(ThemeManagerKt.getTheme().getTextSecondary());
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryNormal);
      this.setClipChildren(false);
      this.setClipToPadding(false);
   }

   @JvmStatic
   fun `bind$lambda$3`(var0: Function3, var1: PollMessageAccessory, var2: java.lang.String): Unit {
      var0.invoke(ChannelId.box-impl(var1.getChannelId-o4g7jtM()), MessageId.box-impl(var1.getMessageId-3Eiw7ao()), var2);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$4`(var0: Function8, var1: PollMessageAccessory, var2: java.lang.String, var3: Int, var4: Int, var5: Int, var6: Int, var7: ViewResizeMode): Unit {
      var0.invoke(
         ChannelId.box-impl(var1.getChannelId-o4g7jtM()),
         MessageId.box-impl(var1.getMessageId-3Eiw7ao()),
         var2,
         (int)SizeUtilsKt.getPxToDp(var3),
         (int)SizeUtilsKt.getPxToDp(var4),
         (int)SizeUtilsKt.getPxToDp(var5),
         (int)SizeUtilsKt.getPxToDp(var6),
         var7
      );
      return Unit.a;
   }

   public override fun bind(
      accessory: PollMessageAccessory,
      onTapAnswer: (ChannelId, MessageId, String) -> Unit,
      onTapPollAction: (ChannelId, MessageId, String) -> Unit,
      onLongPressImage: (ChannelId, MessageId, String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   ) {
      this.getMyAdapter().setData(var1.getAnswers(), new a(var2, var1), new b(var4, var1));
      val var11: View = this.binding.getRoot();
      ViewBackgroundUtilsKt.setBackgroundRectangle(var11, var1.getFillColor(), SizeUtilsKt.getDpToPx(16), var1.getBorderColor(), var1.getBorderWidthPx());
      val var12: RecyclerView = this.binding.answers;
      var var8: Boolean = var1.getData().getCanSelectMultipleAnswers();
      var var7: Boolean = true;
      var12.setFocusableInTouchMode(var8 xor true);
      h0.A0(var12, 4);
      var12.setImportantForAccessibility(1);
      h0.n0(var12, new PollAnswersRecyclerAccessibilityDelegate(var1));
      val var9: Boolean = this.binding.primaryAction.hasAccessibilityFocus();
      var8 = this.binding.secondaryActionButton.hasAccessibilityFocus();
      val var10: Boolean = this.binding.tertiaryActionButton.hasAccessibilityFocus();
      this.binding.questionText.setText(var1.getData().getQuestion().getText());
      val var13: TextView = this.binding.promptText;
      var var5: Boolean;
      if (var1.getData().getPromptLabel() != null) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      if (var5) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var13.setVisibility(var5);
      var13.setText(var1.getData().getPromptLabel());
      this.binding.primaryAction.bind-urJ__Hs(var1.getData().getPrimaryAction(), var1.getChannelId-o4g7jtM(), var1.getMessageId-3Eiw7ao(), var3);
      this.binding.secondaryActionButton.bind-urJ__Hs(var1.getData().getSecondaryAction(), var1.getChannelId-o4g7jtM(), var1.getMessageId-3Eiw7ao(), var3);
      this.binding.tertiaryActionButton.bind-urJ__Hs(var1.getData().getTertiaryAction(), var1.getChannelId-o4g7jtM(), var1.getMessageId-3Eiw7ao(), var3);
      val var15: Boolean;
      if (var9 && !this.binding.primaryAction.hasAccessibilityFocus()) {
         var15 = true;
      } else {
         var15 = false;
      }

      val var6: Boolean;
      if (var8 && !this.binding.secondaryActionButton.hasAccessibilityFocus()) {
         var6 = true;
      } else {
         var6 = false;
      }

      if (!var10 || this.binding.tertiaryActionButton.hasAccessibilityFocus()) {
         var7 = false;
      }

      if ((var15 || var6 || var7) && !this.binding.answers.isAccessibilityFocused()) {
         this.binding.answers.sendAccessibilityEvent(8);
      }
   }
}
