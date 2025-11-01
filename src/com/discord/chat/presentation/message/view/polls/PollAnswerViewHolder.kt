package com.discord.chat.presentation.message.view.polls

import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.viewbinding.ViewBinding
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.reactevents.ViewResizeMode

public abstract class PollAnswerViewHolder<T extends ViewBinding> : ViewHolder {
   public final val binding: Any

   public final val pollAnswerAdapter: PollAnswerAdapter<*>
      public final get() {
         val var1: Adapter = this.getBindingAdapter();
         return var1 as PollAnswerAdapter<*>;
      }


   open fun PollAnswerViewHolder(var1: T) {
      super(var1.getRoot());
      this.binding = (T)var1;
   }

   public abstract fun bind(accessory: PollAnswerAccessory, onTapAnswer: () -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
   }
}
