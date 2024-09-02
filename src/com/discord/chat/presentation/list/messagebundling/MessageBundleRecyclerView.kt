package com.discord.chat.presentation.list.messagebundling

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView
import kotlin.jvm.internal.q

public class MessageBundleRecyclerView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : RecyclerView {
   fun MessageBundleRecyclerView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageBundleRecyclerView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public override fun onTouchEvent(e: MotionEvent?): Boolean {
      super.onTouchEvent(var1);
      return false;
   }
}
