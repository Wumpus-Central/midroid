package com.discord.chat.presentation.list

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlin.jvm.internal.q

public open class ChatListLinearLayout  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout, ChatListChildView {
   open fun ChatListLinearLayout(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
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
