package com.discord.simpleast.core.node

import android.text.SpannableStringBuilder

public open class TextNode<R>(content: String) : Node(null, 1) {
   public final val content: String

   init {
      this.content = var1;
   }

   public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
      var1.append(this.content);
   }

   public override fun toString(): String {
      val var1: StringBuilder = new StringBuilder();
      var1.append(this.getClass().getSimpleName());
      var1.append(": ");
      var1.append(this.content);
      return var1.toString();
   }
}
