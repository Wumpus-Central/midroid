package com.discord.chat.presentation.message.view.polls

import android.annotation.SuppressLint
import android.view.View
import androidx.core.view.Z
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.presentation.message.view.polls.a11y.PollsAnswerAccessibilityDelegate
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.recycler_view.utils.ItemDiffer
import kotlin.jvm.internal.r

public abstract class PollAnswerAdapter<THolder extends PollAnswerViewHolder<?>> : RecyclerView.Adapter {
   private final var items: List<PollAnswerAccessory> = kotlin.collections.i.k()
   public final var onTapAnswer: (String) -> Unit = new i()
   private final var onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   public final var myAvatarUrl: String?

   open fun PollAnswerAdapter() {
      this.onLongPressImage = new j();
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
      r.h(var0, "<unused var>");
      r.h(var5, "<unused var>");
      return Unit.a;
   }

   @JvmStatic
   fun `onTapAnswer$lambda$0`(var0: java.lang.String): Unit {
      r.h(var0, "<unused var>");
      return Unit.a;
   }

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemId(position: Int): Long {
      return this.items.get(var1).getItemId();
   }

   public open fun onBindViewHolder(holder: Any, position: Int) {
      r.h(var1, "holder");
      val var3: PollAnswerAccessory = this.items.get(var2);
      val var4: View = var1.getBinding().getRoot();
      var4.setEnabled(var3.getCanTapAnswers());
      var4.setOnClickListener(new g(this, var3));
      var4.setImportantForAccessibility(1);
      Z.o0(var4, new PollsAnswerAccessibilityDelegate(var3));
      var1.bind(var3, new h(this, var3), this.onLongPressImage);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setData(answers: List<PollAnswerAccessory>, onTapAnswer: (String) -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
      r.h(var1, "answers");
      r.h(var2, "onTapAnswer");
      r.h(var3, "onLongPressImage");
      val var4: java.util.List = this.items;
      this.items = var1;
      this.onTapAnswer = var2;
      this.onLongPressImage = var3;
      val var5: androidx.recyclerview.widget.c.e = androidx.recyclerview.widget.c.b(new ItemDiffer(var4, var1), false);
      r.g(var5, "calculateDiff(...)");
      var5.c(this);
   }
}
