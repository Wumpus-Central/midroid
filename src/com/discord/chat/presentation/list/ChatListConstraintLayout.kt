package com.discord.chat.presentation.list

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

public open class ChatListConstraintLayout  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout(var1, var2), ChatListChildView {
   public open var lastKey: Any?
      internal final set

   public open var currentKey: Any?
      internal final set

   open fun ChatListConstraintLayout(var1: Context) {
      this(var1, null, 2, null);
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
