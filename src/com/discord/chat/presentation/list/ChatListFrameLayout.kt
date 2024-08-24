package com.discord.chat.presentation.list

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import kotlin.jvm.internal.r

public open class ChatListFrameLayout  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout, ChatListChildView {
   open fun ChatListFrameLayout(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      this.onMeasureConsiderFrozen(var1, var2);
   }

   override fun onMeasureConsiderFrozen(var1: Int, var2: Int) {
      ChatListChildView.DefaultImpls.onMeasureConsiderFrozen(this, var1, var2);
   }

   @SuppressLint(["WrongCall"])
   public override fun superOnMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      super.onMeasure(var1, var2);
   }
}
