package com.discord.chat.presentation.list

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import kotlin.jvm.internal.q

public open class ChatListRelativeLayout  public constructor(context: Context, attrs: AttributeSet? = null) : RelativeLayout, ChatListChildView {
   public open var currentKey: Any?
      internal final set

   public open var lastKey: Any?
      internal final set

   open fun ChatListRelativeLayout(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
   }

   override fun bindKey(var1: Any) {
      ChatListChildView.DefaultImpls.bindKey(this, var1);
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
