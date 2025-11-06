package com.discord.chat.presentation.message.view.polls

import android.annotation.SuppressLint
import android.view.View
import androidx.core.view.h0
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.presentation.message.view.polls.a11y.PollsAnswerAccessibilityDelegate
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.recycler_view.utils.ItemDiffer

public abstract class PollAnswerAdapter<THolder extends PollAnswerViewHolder<?>> : Adapter {
   private final var items: List<PollAnswerAccessory> = CollectionsKt.l()
   public final var onTapAnswer: (String) -> Unit = new com.discord.chat.presentation.message.view.polls.i()
   private final var onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   public final var myAvatarUrl: String?

   open fun PollAnswerAdapter() {
      this.onLongPressImage = new com.discord.chat.presentation.message.view.polls.j();
      this.setHasStableIds(true);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3$lambda$2`(var0: PollAnswerAdapter, var1: PollAnswerAccessory, var2: View) {
      var0.onTapAnswer.invoke(var1.getAnswer().getAnswerId());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4`(var0: PollAnswerAdapter, var1: PollAnswerAccessory): Unit {
      var0.onTapAnswer.invoke(var1.getAnswer().getAnswerId());
      return Unit.a;
   }

   @JvmStatic
   fun `onLongPressImage$lambda$1`(var0: java.lang.String, var1: Int, var2: Int, var3: Int, var4: Int, var5: ViewResizeMode): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onTapAnswer$lambda$0`(var0: java.lang.String): Unit {
      return Unit.a;
   }

   public open fun getItemCount(): Int {
      return this.items.size();
   }

   public open fun getItemId(position: Int): Long {
      return this.items.get(var1).getItemId();
   }

   public open fun onBindViewHolder(holder: Any, position: Int) {
      val var4: PollAnswerAccessory = this.items.get(var2);
      val var3: View = var1.getBinding().getRoot();
      var3.setEnabled(var4.getCanTapAnswers());
      var3.setOnClickListener(new com.discord.chat.presentation.message.view.polls.g(this, var4));
      var3.setImportantForAccessibility(1);
      h0.n0(var3, new PollsAnswerAccessibilityDelegate(var4));
      var1.bind(var4, new com.discord.chat.presentation.message.view.polls.h(this, var4), this.onLongPressImage);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setData(answers: List<PollAnswerAccessory>, onTapAnswer: (String) -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
      val var4: java.util.List = this.items;
      this.items = var1;
      this.onTapAnswer = var2;
      this.onLongPressImage = var3;
      val var5: androidx.recyclerview.widget.e.e = androidx.recyclerview.widget.e.c(new ItemDiffer(var4, var1), false);
      var5.c(this);
   }
}
