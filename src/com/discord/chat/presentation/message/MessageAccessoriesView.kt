package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.core.view.v0
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.R
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.TransitionResilientLinearLayoutManager
import com.discord.chat.presentation.message.decorations.MessageAccessoriesHorizontalSpacingDecoration
import com.discord.chat.presentation.message.decorations.ThreadSpineItemDecoration
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder
import com.discord.chat.presentation.root.ChatView
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.reactions.ReactionsView
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0

public class MessageAccessoriesView  public constructor(context: Context, attrs: AttributeSet? = null) : RecyclerView {
   private final var threadSpineDecoration: ThreadSpineItemDecoration
   private final val accessoriesAdapter: MessageAccessoriesAdapter
   private final val contentViewTracker: com.discord.chat.presentation.message.MessageAccessoriesView.ContentViewTracker
   private final val transitionResilientLinearLayoutManager: TransitionResilientLinearLayoutManager
   private final val defaultItemAnimator: <unrepresentable>
   private final var messageAccessoriesDecoration: MessageAccessoriesHorizontalSpacingDecoration

   private final val forwardBarPaint: Paint
      private final get() {
         return this.forwardBarPaint$delegate.getValue() as Paint;
      }


   private final var showingForwardBar: Boolean

   @JvmStatic
   fun {
      val var0: Int = SizeUtilsKt.getDpToPx(4);
      FORWARD_BAR_WIDTH = var0;
      FORWARD_BAR_SPACING = var0 + SizeUtilsKt.getDpToPx(16);
   }

   fun MessageAccessoriesView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: MessageAccessoriesAdapter = new MessageAccessoriesAdapter(new Function0(this) {
         {
            super(0, var1, ViewMeasureExtensionsKt::class.java, "measureAndLayout", "measureAndLayout(Landroid/view/View;)V", 1);
         }

         public final void invoke() {
            ViewMeasureExtensionsKt.measureAndLayout(super.receiver as View);
         }
      });
      this.accessoriesAdapter = var3;
      val var5: MessageAccessoriesView.ContentViewTracker = new MessageAccessoriesView.ContentViewTracker();
      this.contentViewTracker = var5;
      val var6: TransitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(var1, 1, false);
      this.transitionResilientLinearLayoutManager = var6;
      val var4: DefaultItemAnimator = new DefaultItemAnimator() {
         @Override
         public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder var1, java.util.List<Object> var2) {
            kotlin.jvm.internal.q.h(var1, "viewHolder");
            kotlin.jvm.internal.q.h(var2, "payloads");
            val var3: Boolean;
            if (super.canReuseUpdatedViewHolder(var1, var2) && var1 !is MessageContentViewHolder) {
               var3 = true;
            } else {
               var3 = false;
            }

            return var3;
         }
      };
      var4.setSupportsChangeAnimations(false);
      this.defaultItemAnimator = var4;
      this.forwardBarPaint$delegate = gh.l.b(<unrepresentable>.INSTANCE);
      this.setItemAnimator(null);
      this.setNestedScrollingEnabled(false);
      leftMarginPx = this.getResources().getDimensionPixelSize(R.dimen.message_start_guideline);
      rightMarginPx = this.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      embedContentMarginPx = this.getResources().getDimensionPixelSize(R.dimen.message_embed_margin);
      this.threadSpineDecoration = new ThreadSpineItemDecoration(var1, leftMarginPx);
      this.messageAccessoriesDecoration = new MessageAccessoriesHorizontalSpacingDecoration(leftMarginPx, rightMarginPx, false);
      this.addItemDecoration(this.threadSpineDecoration);
      this.addItemDecoration(this.messageAccessoriesDecoration);
      this.addItemDecoration(
         new VerticalSpacingItemDecoration(this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing), 0, 0, false, 14, null)
      );
      this.setLayoutManager(var6);
      this.setAdapter(var3);
      var3.setMessageContentViewLifecycleListener(var5);
   }

   private fun getForwardBarHeight(): Int {
      for (Pair var3 : lk.j.H(v0.a(this))) {
         val var2: View = var3.c() as View;
         val var4: View = var3.d() as View;
         if (var4 is ReactionsView || var4 is ThreadEmbedView) {
            return var2.getBottom();
         }
      }

      return this.getHeight();
   }

   public fun clear() {
      this.accessoriesAdapter.clear();
      this.removeAllViewsInLayout();
   }

   public open fun endViewTransition(view: View?) {
      super.endViewTransition(var1);
      this.transitionResilientLinearLayoutManager.disableRecycling(false);
   }

   public override fun onDraw(c: Canvas) {
      kotlin.jvm.internal.q.h(var1, "c");
      super.onDraw(var1);
      if (this.showingForwardBar) {
         this.getForwardBarPaint().setColor(ThemeManagerKt.getTheme().getBorderStrong());
         val var3: Float = leftMarginPx;
         val var2: Float = leftMarginPx;
         val var5: Int = FORWARD_BAR_WIDTH;
         var1.drawRoundRect(
            var3, 0.0F, (float)FORWARD_BAR_WIDTH + var2, (float)this.getForwardBarHeight(), (float)(var5 / 2), (float)(var5 / 2), this.getForwardBarPaint()
         );
      }
   }

   @SuppressLint(["ClickableViewAccessibility"])
   public override fun onTouchEvent(e: MotionEvent?): Boolean {
      super.onTouchEvent(var1);
      return false;
   }

   public fun setAccessories(
      messageId: MessageId,
      channelId: ChannelId,
      guildId: GuildId?,
      items: List<MessageAccessory>,
      eventHandler: ChatEventHandler,
      messageComponentProvider: ComponentProvider?,
      drawForward: Boolean
   ) {
      kotlin.jvm.internal.q.h(var1, "messageId");
      kotlin.jvm.internal.q.h(var5, "items");
      kotlin.jvm.internal.q.h(var6, "eventHandler");
      val var10: <unrepresentable>;
      if (ChatView.Companion.getAreChatAnimationsEnabled()) {
         var10 = this.defaultItemAnimator;
      } else {
         var10 = null;
      }

      this.setItemAnimator(var10);
      if (this.showingForwardBar != var8) {
         this.showingForwardBar = var8;
         this.updateLeftMargin(leftMarginPx);
      }

      val var14: ThreadSpineItemDecoration = this.threadSpineDecoration;
      var8 = var5 is java.util.Collection;
      val var9: Boolean = false;
      if (var8 && var5.isEmpty()) {
         var8 = false;
      } else {
         val var11: java.util.Iterator = var5.iterator();

         while (true) {
            var8 = var9;
            if (!var11.hasNext()) {
               break;
            }

            if (var11.next() as MessageAccessory is ThreadEmbedMessageAccessory) {
               var8 = true;
               break;
            }
         }
      }

      var14.setShowThreadSpine(var8);
      this.accessoriesAdapter.setEventHandler(var6);
      this.accessoriesAdapter.setComponentProvider(var7);
      this.accessoriesAdapter.setItems-bo5iIEc(var1, var2, var4, var5);
   }

   public fun setOnCurrentContentViewChanged(onViewChanged: (MessageContentView) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "onViewChanged");
      this.contentViewTracker.setOnViewChanged(var1);
   }

   public override fun setRecycledViewPool(pool: RecycledViewPool?) {
      super.setRecycledViewPool(var1);
      this.accessoriesAdapter.setNestedAccessoriesRecycledViewPool(var1);
   }

   public open fun startViewTransition(view: View?) {
      super.startViewTransition(var1);
      this.transitionResilientLinearLayoutManager.disableRecycling(true);
   }

   public fun updateLeftMargin(leftMargin: Int) {
      if (var1 != this.messageAccessoriesDecoration.getLeftMarginPx() || this.showingForwardBar != this.messageAccessoriesDecoration.getIsForwardedMessage()) {
         leftMarginPx = var1;
         this.removeItemDecoration(this.messageAccessoriesDecoration);
         val var2: MessageAccessoriesHorizontalSpacingDecoration = new MessageAccessoriesHorizontalSpacingDecoration(
            leftMarginPx, rightMarginPx, this.showingForwardBar
         );
         this.messageAccessoriesDecoration = var2;
         this.addItemDecoration(var2);
      }
   }

   public companion object {
      public final val FORWARD_BAR_SPACING: Int
      public final val FORWARD_BAR_WIDTH: Int
      private final val INLINE_FORWARD_BUTTON_SPACING: Int
      private final var embedContentMarginPx: Int
      private final var leftMarginPx: Int
      private final var rightMarginPx: Int

      public fun getWidth(constrainedWidth: Int, isForwardedContent: Boolean, isShowingInlineForward: Boolean): Int {
         var var4: Int = var1 - MessageAccessoriesView.access$getLeftMarginPx$cp() - MessageAccessoriesView.access$getRightMarginPx$cp();
         var1 = var4;
         if (var2) {
            var1 = var4 - this.getFORWARD_BAR_SPACING();
         }

         var4 = var1;
         if (var3) {
            var4 = var1 - MessageAccessoriesView.access$getINLINE_FORWARD_BUTTON_SPACING$cp();
         }

         return var4;
      }

      public fun getWidthForEmbedContent(constrainedWidth: Int, isForward: Boolean, isShowingInlineForward: Boolean): Int {
         return this.getWidth(var1, var2, var3) - MessageAccessoriesView.access$getEmbedContentMarginPx$cp() * 2;
      }
   }

   private class ContentViewTracker : MessageAccessoriesAdapter.MessageContentViewLifecycleListener {
      private final var onViewChanged: (MessageContentView) -> Unit = <unrepresentable>.INSTANCE
      private final var currentContentView: MessageContentView?

      public override fun onAttachedToWindow(messageContentView: MessageContentView) {
         kotlin.jvm.internal.q.h(var1, "messageContentView");
         this.currentContentView = var1;
         this.onViewChanged.invoke(var1);
      }

      public override fun onDetachedFromWindow() {
         this.currentContentView = null;
      }

      public fun setOnViewChanged(onViewChanged: (MessageContentView) -> Unit) {
         kotlin.jvm.internal.q.h(var1, "onViewChanged");
         this.onViewChanged = var1;
         if (this.currentContentView != null) {
            var1.invoke(this.currentContentView);
         }
      }
   }
}
