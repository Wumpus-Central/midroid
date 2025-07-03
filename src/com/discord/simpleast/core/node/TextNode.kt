package com.discord.simpleast.core.node

import android.text.SpannableStringBuilder
import kotlin.jvm.internal.r

public open class TextNode<R>(content: String) : Node<R> {
   public final val content: String

   init {
      r.h(var1, "content");
      super(null, 1, null);
      this.content = var1;
   }

   public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
      r.h(var1, "builder");
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
