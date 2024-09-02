package com.discord.chat.presentation.message.view.polls

import android.annotation.SuppressLint
import android.view.View
import androidx.core.view.r0
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.presentation.message.view.polls.a11y.PollsAnswerAccessibilityDelegate
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.recycler_view.utils.ItemDiffer
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public abstract class PollAnswerAdapter<THolder extends PollAnswerViewHolder<?>> : RecyclerView.Adapter {
   private final var items: List<PollAnswerAccessory> = i.j()
   public final var onTapAnswer: (String) -> Unit = <unrepresentable>.INSTANCE
   private final var onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   public final var myAvatarUrl: String?

   open fun PollAnswerAdapter() {
      this.onLongPressImage = <unrepresentable>.INSTANCE;
      this.setHasStableIds(true);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$1$lambda$0`(var0: PollAnswerAdapter, var1: PollAnswerAccessory, var2: View) {
      q.h(var0, "this$0");
      q.h(var1, "$accessory");
      var0.onTapAnswer.invoke(var1.getAnswer().getAnswerId());
   }

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemId(position: Int): Long {
      return this.items.get(var1).getItemId();
   }

   public open fun onBindViewHolder(holder: Any, position: Int) {
      q.h(var1, "holder");
      val var4: PollAnswerAccessory = this.items.get(var2);
      val var3: View = var1.getBinding().getRoot();
      var3.setEnabled(var4.getCanTapAnswers());
      var3.setOnClickListener(new e(this, var4));
      r0.A0(var3, 1);
      r0.q0(var3, new PollsAnswerAccessibilityDelegate(var4));
      var1.bind(var4, new Function0(this, var4) {
         final PollAnswerAccessory $accessory;
         final PollAnswerAdapter<THolder> this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$accessory = var2;
         }

         public final void invoke() {
            this.this$0.getOnTapAnswer().invoke(this.$accessory.getAnswer().getAnswerId());
         }
      }, this.onLongPressImage);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setData(answers: List<PollAnswerAccessory>, onTapAnswer: (String) -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
      q.h(var1, "answers");
      q.h(var2, "onTapAnswer");
      q.h(var3, "onLongPressImage");
      val var4: java.util.List = this.items;
      this.items = var1;
      this.onTapAnswer = var2;
      this.onLongPressImage = var3;
      val var5: androidx.recyclerview.widget.c.e = androidx.recyclerview.widget.c.b(new ItemDiffer(var4, var1), false);
      q.g(var5, "calculateDiff(...)");
      var5.c(this);
   }
}
