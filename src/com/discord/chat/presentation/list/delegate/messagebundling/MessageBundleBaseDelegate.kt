package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.presentation.list.item.MessageBundleItem
import com.discord.misc.utilities.measure.NativeViewMeasuringWrapper
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import kotlin.jvm.internal.r

public abstract class MessageBundleBaseDelegate : AdapterDelegate<java.util.List<? extends MessageBundleItem>> {
   private final val onMeasured: (View, Int, Int) -> Unit

   open fun MessageBundleBaseDelegate(var1: (View?, Int?, Int?) -> Unit) {
      r.h(var1, "onMeasured");
      super();
      this.onMeasured = var1;
   }

   public abstract fun createView(context: Context): View {
   }

   public abstract fun onBindViewHolder(view: View, item: MessageBundleItem, items: List<MessageBundleItem>, position: Int) {
   }

   protected open fun onBindViewHolder(items: List<MessageBundleItem>, position: Int, holder: ViewHolder, payloads: MutableList<Any>) {
      r.h(var1, "items");
      r.h(var3, "holder");
      r.h(var4, "payloads");
      val var8: View = var3.itemView;
      r.g(var3.itemView, "holder.itemView");
      var var5: View = var8;
      if (var8 !is NativeViewMeasuringWrapper) {
         var5 = null;
      }

      val var6: NativeViewMeasuringWrapper = var5 as NativeViewMeasuringWrapper;
      if (var5 as NativeViewMeasuringWrapper != null) {
         var6.setId(var2);
         val var7: View = var6.getView();
         if (var7 != null) {
            this.onBindViewHolder(var7, var1.get(var2) as MessageBundleItem, var1, var2);
         }
      }
   }

   protected open fun onCreateViewHolder(parent: ViewGroup): com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleBaseDelegate.MessageBundleBaseViewHolder {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      val var3: View = this.createView(var2);
      var3.setLayoutParams(new LayoutParams(-1, -2));
      val var4: NativeViewMeasuringWrapper = new NativeViewMeasuringWrapper(var3, this.onMeasured);
      var4.setLayoutParams(new LayoutParams(-1, -2));
      return new MessageBundleBaseDelegate.MessageBundleBaseViewHolder(var4);
   }

   protected open fun onViewRecycled(holder: ViewHolder) {
      r.h(var1, "holder");
      super.onViewRecycled(var1);
      var1.itemView.setId(-1);
   }

   public class MessageBundleBaseViewHolder(itemView: View) : ViewHolder {
      init {
         r.h(var1, "itemView");
         super(var1);
      }
   }
}
