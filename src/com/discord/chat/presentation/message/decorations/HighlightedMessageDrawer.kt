package com.discord.chat.presentation.message.decorations

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Paint.Style
import android.view.View
import com.discord.chat.R
import com.discord.chat.presentation.list.item.ChatListItem
import kotlin.jvm.internal.r

public open class HighlightedMessageDrawer(context: Context,
   cellHighlightColor: (ChatListItem) -> Int?,
   gutterColor: (ChatListItem) -> Int?,
   shouldRenderHighlight: (ChatListItem) -> Boolean
) {
   private final val backgroundPaint: Paint
   private final var backgroundPaintColor: Int?
   public final val cellHighlightColor: (ChatListItem) -> Int?
   public final val gutterColor: (ChatListItem) -> Int?
   private final val gutterPaint: Paint
   private final var gutterPaintColor: Int?
   private final val gutterWidth: Int
   public final val shouldRenderHighlight: (ChatListItem) -> Boolean

   init {
      r.h(var1, "context");
      r.h(var2, "cellHighlightColor");
      r.h(var3, "gutterColor");
      r.h(var4, "shouldRenderHighlight");
      super();
      this.cellHighlightColor = var2;
      this.gutterColor = var3;
      this.shouldRenderHighlight = var4;
      this.gutterWidth = var1.getResources().getDimensionPixelSize(R.dimen.message_gutter_width);
      val var5: Paint = new Paint();
      var5.setStyle(Style.FILL);
      this.backgroundPaint = var5;
      val var6: Paint = new Paint();
      var6.setStyle(Style.FILL);
      this.gutterPaint = var6;
   }

   public fun drawHighlight(canvas: Canvas, child: View, topSpacing: Int = 0, bottomSpacing: Int = 0) {
      r.h(var1, "canvas");
      r.h(var2, "child");
      val var5: Float = HighlightedMessageDrawerKt.access$getTranslatedLeft(var2);
      val var8: Float = HighlightedMessageDrawerKt.access$getTranslatedRight(var2);
      val var6: Float = HighlightedMessageDrawerKt.access$getTranslatedTop(var2) - var3;
      val var7: Float = HighlightedMessageDrawerKt.access$getTranslatedBottom(var2) + var4;
      if (this.backgroundPaintColor != null) {
         this.backgroundPaint.setColor(this.backgroundPaintColor.intValue());
         var1.drawRect(var5, var6, var8, var7, this.backgroundPaint);
      }

      if (this.gutterPaintColor != null) {
         this.gutterPaint.setColor(this.gutterPaintColor.intValue());
         var1.drawRect(var5, var6, var5 + (float)this.gutterWidth, var7, this.gutterPaint);
      }
   }

   public fun setPaintStyles(chatListItem: ChatListItem) {
      r.h(var1, "chatListItem");
      this.backgroundPaintColor = this.cellHighlightColor.invoke(var1) as Integer;
      this.gutterPaintColor = this.gutterColor.invoke(var1) as Integer;
   }
}
