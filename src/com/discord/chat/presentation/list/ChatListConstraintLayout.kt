package com.discord.chat.presentation.list

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.jvm.internal.q

public open class ChatListConstraintLayout  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout, ChatListChildView {
   open fun ChatListConstraintLayout(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
   }

   protected override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
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
