package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.f1
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
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function6
import kotlin.jvm.functions.Function8
import kotlin.jvm.internal.r

public abstract class BasePollWithRecyclerView : ConstraintLayout, PollPresenter {
   protected final val binding: PollRecyclerViewBinding
   protected abstract val myAdapter: PollAnswerAdapter<*>

   open fun BasePollWithRecyclerView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   open fun BasePollWithRecyclerView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   open fun BasePollWithRecyclerView(var1: Context, var2: AttributeSet, var3: Int) {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var5: PollRecyclerViewBinding = PollRecyclerViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      val var4: RecyclerView = var5.answers;
      val var7: NoMoveItemAnimator = new NoMoveItemAnimator() {
         {
            super(null, null, 3, null);
         }

         public void endAnimation(ViewHolder var1) {
            r.h(var1, "item");
            super.endAnimation(var1);
            val var2: View = var1.itemView;
            r.g(var1.itemView, "item.itemView");
            MaybeAnimateElevationToKt.maybeEndAnimation(var2);
         }
      };
      var7.setSupportsChangeAnimations(false);
      var4.setItemAnimator(var7);
      val var8: View = var5.getRoot();
      r.g(var8, "binding.root");
      var3 = SizeUtilsKt.getDpToPx(16);
      var8.setPadding(var3, var3, var3, var3);
      val var9: TextView = var5.questionText;
      var5.questionText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      r.g(var9, "_init_$lambda$1");
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
      val var6: TextView = var5.promptText;
      var5.promptText.setTextColor(ThemeManagerKt.getTheme().getTextSecondary());
      r.g(var6, "_init_$lambda$2");
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
      r.h(var1, "accessory");
      r.h(var2, "onTapAnswer");
      r.h(var3, "onTapPollAction");
      r.h(var4, "onLongPressImage");
      this.getMyAdapter()
         .setData(
            var1.getAnswers(),
            new Function1<java.lang.String, Unit>(var2, var1) {
               final PollMessageAccessory $accessory;
               final Function3<ChannelId, MessageId, java.lang.String, Unit> $onTapAnswer;

               {
                  super(1);
                  this.$onTapAnswer = var1;
                  this.$accessory = var2;
               }

               public final void invoke(java.lang.String var1) {
                  r.h(var1, "answerId");
                  this.$onTapAnswer
                     .invoke(ChannelId.box_impl(this.$accessory.getChannelId_o4g7jtM()), MessageId.box_impl(this.$accessory.getMessageId_3Eiw7ao()), var1);
               }
            },
            new Function6<java.lang.String, Integer, Integer, Integer, Integer, ViewResizeMode, Unit>(var4, var1) {
               final PollMessageAccessory $accessory;
               final Function8<ChannelId, MessageId, java.lang.String, Integer, Integer, Integer, Integer, ViewResizeMode, Unit> $onLongPressImage;

               {
                  super(6);
                  this.$onLongPressImage = var1;
                  this.$accessory = var2;
               }

               public final void invoke(java.lang.String var1, int var2, int var3, int var4, int var5, ViewResizeMode var6) {
                  r.h(var1, "attachmentId");
                  r.h(var6, "viewResizeMode");
                  this.$onLongPressImage
                     .invoke(
                        ChannelId.box_impl(this.$accessory.getChannelId_o4g7jtM()),
                        MessageId.box_impl(this.$accessory.getMessageId_3Eiw7ao()),
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
      r.g(var11, "bind$lambda$3");
      ViewBackgroundUtilsKt.setBackgroundRectangle(var11, var1.getFillColor(), SizeUtilsKt.getDpToPx(16), var1.getBorderColor(), var1.getBorderWidthPx());
      val var12: RecyclerView = this.binding.answers;
      var var8: Boolean = var1.getData().getCanSelectMultipleAnswers();
      var var7: Boolean = true;
      var12.setFocusableInTouchMode(var8 xor true);
      f1.D0(var12, 4);
      f1.A0(var12, 1);
      f1.q0(var12, new PollAnswersRecyclerAccessibilityDelegate(var1));
      var8 = this.binding.primaryAction.hasAccessibilityFocus();
      val var10: Boolean = this.binding.secondaryActionButton.hasAccessibilityFocus();
      val var9: Boolean = this.binding.tertiaryActionButton.hasAccessibilityFocus();
      this.binding.questionText.setText(var1.getData().getQuestion().getText());
      val var13: TextView = this.binding.promptText;
      r.g(this.binding.promptText, "bind$lambda$5");
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
      this.binding.primaryAction.bind_urJ__Hs(var1.getData().getPrimaryAction(), var1.getChannelId_o4g7jtM(), var1.getMessageId_3Eiw7ao(), var3);
      this.binding.secondaryActionButton.bind_urJ__Hs(var1.getData().getSecondaryAction(), var1.getChannelId_o4g7jtM(), var1.getMessageId_3Eiw7ao(), var3);
      this.binding.tertiaryActionButton.bind_urJ__Hs(var1.getData().getTertiaryAction(), var1.getChannelId_o4g7jtM(), var1.getMessageId_3Eiw7ao(), var3);
      val var15: Boolean;
      if (var8 && !this.binding.primaryAction.hasAccessibilityFocus()) {
         var15 = true;
      } else {
         var15 = false;
      }

      val var6: Boolean;
      if (var10 && !this.binding.secondaryActionButton.hasAccessibilityFocus()) {
         var6 = true;
      } else {
         var6 = false;
      }

      if (!var9 || this.binding.tertiaryActionButton.hasAccessibilityFocus()) {
         var7 = false;
      }

      if ((var15 || var6 || var7) && !this.binding.answers.isAccessibilityFocused()) {
         this.binding.answers.sendAccessibilityEvent(8);
      }
   }
}
