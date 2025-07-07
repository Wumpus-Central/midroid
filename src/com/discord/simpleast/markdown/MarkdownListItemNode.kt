package com.discord.simpleast.markdown

import android.text.SpannableStringBuilder
import android.text.style.BulletSpan
import com.discord.simpleast.core.node.Node
import kotlin.jvm.internal.r

public open class MarkdownListItemNode<R>(bulletSpanProvider: () -> BulletSpan) : Node<R> {
   public final val bulletSpanProvider: () -> BulletSpan

   init {
      r.h(var1, "bulletSpanProvider");
      super(null, 1, null);
      this.bulletSpanProvider = var1;
   }

   public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
      r.h(var1, "builder");
      val var3: Int = var1.length();
      val var4: java.util.Collection = this.getChildren();
      if (var4 != null) {
         val var5: java.util.Iterator = var4.iterator();

         while (var5.hasNext()) {
            (var5.next() as Node).render(var1, var2);
         }
      }

      var1.setSpan(this.bulletSpanProvider.invoke(), var3, var3 + 1, 33);
   }
}
