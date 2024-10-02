package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.r0
import androidx.recyclerview.widget.RecyclerView
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
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function6
import kotlin.jvm.functions.Function8
import kotlin.jvm.internal.q

public abstract class BasePollWithRecyclerView : ConstraintLayout, PollPresenter {
   protected final val binding: PollRecyclerViewBinding
   protected abstract val myAdapter: PollAnswerAdapter<*>

   open fun BasePollWithRecyclerView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   open fun BasePollWithRecyclerView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   open fun BasePollWithRecyclerView(var1: Context, var2: AttributeSet, var3: Int) {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var5: PollRecyclerViewBinding = PollRecyclerViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var5, "inflate(...)");
      this.binding = var5;
      val var7: RecyclerView = var5.answers;
      val var4: NoMoveItemAnimator = new NoMoveItemAnimator() {
         {
            super(null, null, 3, null);
         }

         @Override
         public void endAnimation(RecyclerView.ViewHolder var1) {
            q.h(var1, "item");
            super.endAnimation(var1);
            val var2: View = var1.itemView;
            q.g(var1.itemView, "itemView");
            MaybeAnimateElevationToKt.maybeEndAnimation(var2);
         }
      };
      var4.setSupportsChangeAnimations(false);
      var7.setItemAnimator(var4);
      val var8: View = var5.getRoot();
      q.g(var8, "getRoot(...)");
      var3 = SizeUtilsKt.getDpToPx(16);
      var8.setPadding(var3, var3, var3, var3);
      val var9: TextView = var5.questionText;
      var5.questionText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      q.e(var9);
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
      val var6: TextView = var5.promptText;
      var5.promptText.setTextColor(ThemeManagerKt.getTheme().getTextSecondary());
      q.e(var6);
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryNormal);
      this.setClipChildren(false);
      this.setClipToPadding(false);
   }

   public override fun bind(
      accessory: PollMessageAccessory,
      onTapAnswer: (ChannelId, MessageId, String) -> Unit,
      onTapPollAction: (ChannelId, MessageId, String) -> Unit,
      onLongPressImage: (ChannelId, MessageId, String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   ) {
      q.h(var1, "accessory");
      q.h(var2, "onTapAnswer");
      q.h(var3, "onTapPollAction");
      q.h(var4, "onLongPressImage");
      this.getMyAdapter()
         .setData(
            var1.getAnswers(),
            new Function1(var2, var1) {
               final PollMessageAccessory $accessory;
               final Function3 $onTapAnswer;

               {
                  super(1);
                  this.$onTapAnswer = var1;
                  this.$accessory = var2;
               }

               public final void invoke(java.lang.String var1) {
                  q.h(var1, "answerId");
                  this.$onTapAnswer
                     .invoke(ChannelId.box-impl(this.$accessory.getChannelId-o4g7jtM()), MessageId.box-impl(this.$accessory.getMessageId-3Eiw7ao()), var1);
               }
            },
            new Function6(var4, var1) {
               final PollMessageAccessory $accessory;
               final Function8 $onLongPressImage;

               {
                  super(6);
                  this.$onLongPressImage = var1;
                  this.$accessory = var2;
               }

               public final void invoke(java.lang.String var1, int var2, int var3, int var4, int var5, ViewResizeMode var6) {
                  q.h(var1, "attachmentId");
                  q.h(var6, "viewResizeMode");
                  this.$onLongPressImage
                     .invoke(
                        ChannelId.box-impl(this.$accessory.getChannelId-o4g7jtM()),
                        MessageId.box-impl(this.$accessory.getMessageId-3Eiw7ao()),
                        var1,
                        var2,
                        var3,
                        var4,
                        var5,
                        var6
                     );
               }
            }
         );
      val var11: View = this.binding.getRoot();
      q.e(var11);
      ViewBackgroundUtilsKt.setBackgroundRectangle(var11, var1.getFillColor(), SizeUtilsKt.getDpToPx(16), var1.getBorderColor(), var1.getBorderWidthPx());
      val var12: RecyclerView = this.binding.answers;
      var var8: Boolean = var1.getData().getCanSelectMultipleAnswers();
      var var7: Boolean = true;
      var12.setFocusableInTouchMode(var8 xor true);
      r0.D0(var12, 4);
      r0.A0(var12, 1);
      r0.q0(var12, new PollAnswersRecyclerAccessibilityDelegate(var1));
      val var9: Boolean = this.binding.primaryAction.hasAccessibilityFocus();
      var8 = this.binding.secondaryActionButton.hasAccessibilityFocus();
      val var10: Boolean = this.binding.tertiaryActionButton.hasAccessibilityFocus();
      this.binding.questionText.setText(var1.getData().getQuestion().getText());
      val var13: TextView = this.binding.promptText;
      q.e(this.binding.promptText);
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
