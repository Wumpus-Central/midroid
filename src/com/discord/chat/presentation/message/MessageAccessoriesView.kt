package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Paint.Style
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.R
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.decorations.MessageAccessoriesHorizontalSpacingDecoration
import com.discord.chat.presentation.message.decorations.ThreadSpineItemDecoration
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.root.MessageContextType
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.reactions.ShortcutsFlexbox
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMessageAccessoriesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageAccessoriesView.kt\ncom/discord/chat/presentation/message/MessageAccessoriesView\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1317#2,2:246\n1755#3,3:248\n*S KotlinDebug\n*F\n+ 1 MessageAccessoriesView.kt\ncom/discord/chat/presentation/message/MessageAccessoriesView\n*L\n106#1:246,2\n172#1:248,3\n*E\n"])
public class MessageAccessoriesView  public constructor(context: Context, attrs: AttributeSet? = null) : RecyclerView(var1, var2) {
   private final var threadSpineDecoration: ThreadSpineItemDecoration
   private final val accessoriesAdapter: MessageAccessoriesAdapter
   private final val transitionResilientLinearLayoutManager: TransitionResilientLinearLayoutManager
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
      this(var1, null, 2, null);
   }

   init {
      val var3: MessageAccessoriesAdapter = new MessageAccessoriesAdapter(new Function0<Unit>(this) {
         {
            super(0, var1, ViewMeasureExtensionsKt::class.java, "measureAndLayout", "measureAndLayout(Landroid/view/View;)V", 1);
         }

         public final void invoke() {
            ViewMeasureExtensionsKt.measureAndLayout(super.receiver as View);
         }
      });
      this.accessoriesAdapter = var3;
      val var4: TransitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(var1, 1, false, null, 8, null);
      this.transitionResilientLinearLayoutManager = var4;
      this.forwardBarPaint$delegate = B9.j.b(new Q());
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
      this.setLayoutManager(var4);
      this.setAdapter(var3);
   }

   @JvmStatic
   fun `forwardBarPaint_delegate$lambda$1`(): Paint {
      val var0: Paint = new Paint();
      var0.setStyle(Style.FILL);
      return var0;
   }

   private fun getForwardBarHeight(): Int {
      for (Pair var3 : kotlin.sequences.k.L(androidx.core.view.f0.a(this))) {
         val var2: View = var3.c() as View;
         val var4: View = var3.d() as View;
         if (var4 is ShortcutsFlexbox || var4 is ThreadEmbedView) {
            return var2.getBottom();
         }
      }

      return this.getHeight();
   }

   private fun updateLeftMargin(leftMargin: Int) {
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

   public fun clear(removeViews: Boolean = true) {
      this.accessoriesAdapter.clear();
      if (var1) {
         this.removeAllViewsInLayout();
      }
   }

   public open fun endViewTransition(view: View?) {
      super.endViewTransition(var1);
      this.transitionResilientLinearLayoutManager.disableRecycling(false);
   }

   public override fun onDraw(c: Canvas) {
      super.onDraw(var1);
      if (this.showingForwardBar) {
         this.getForwardBarPaint().setColor(ThemeManagerKt.getTheme().getBorderStrong());
         val var2: Float = leftMarginPx;
         val var3: Float = leftMarginPx;
         val var5: Int = FORWARD_BAR_WIDTH;
         var1.drawRoundRect(
            var2, 0.0F, var3 + (float)FORWARD_BAR_WIDTH, (float)this.getForwardBarHeight(), (float)(var5 / 2), (float)(var5 / 2), this.getForwardBarPaint()
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
      messageContext: MessageContext,
      renderContentOnly: Boolean,
      drawForward: Boolean
   ) {
      this.setItemAnimator(null);
      if (this.showingForwardBar != var10) {
         this.showingForwardBar = var10;
      }

      val var11: MessageAccessoriesView.Companion = Companion;
      val var12: Resources = this.getResources();
      this.updateLeftMargin(var11.getAccessoryLeftMargin(var12, var8, var9));
      val var16: ThreadSpineItemDecoration = this.threadSpineDecoration;
      var10 = false;
      if (var5 != null && var5.isEmpty()) {
         var9 = false;
      } else {
         val var13: java.util.Iterator = var5.iterator();

         while (true) {
            var9 = var10;
            if (!var13.hasNext()) {
               break;
            }

            if (var13.next() as MessageAccessory is ThreadEmbedMessageAccessory) {
               var9 = true;
               break;
            }
         }
      }

      var16.setShowThreadSpine(var9);
      this.accessoriesAdapter.setEventHandler(var6);
      this.accessoriesAdapter.setComponentProvider(var7);
      this.accessoriesAdapter.setItems-bo5iIEc(var1, var2, var4, var5);
   }

   public override fun setRecycledViewPool(pool: RecycledViewPool?) {
      super.setRecycledViewPool(var1);
      this.accessoriesAdapter.setNestedAccessoriesRecycledViewPool(var1);
   }

   public open fun startViewTransition(view: View?) {
      super.startViewTransition(var1);
      this.transitionResilientLinearLayoutManager.disableRecycling(true);
   }

   public companion object {
      private final var leftMarginPx: Int
      private final var rightMarginPx: Int
      private final var embedContentMarginPx: Int
      public final val FORWARD_BAR_WIDTH: Int
      public final val FORWARD_BAR_SPACING: Int

      public fun getAccessoryLeftMargin(resources: Resources, messageContext: MessageContext, renderContentOnly: Boolean): Int {
         if (var2.getContextType() === MessageContextType.SEARCH) {
            return 0;
         } else {
            val var4: Int;
            if (var3) {
               var4 = var1.getDimensionPixelSize(R.dimen.message_horizontal_spacing);
            } else {
               var4 = var1.getDimensionPixelSize(R.dimen.message_start_guideline);
            }

            return var4;
         }
      }

      public fun getWidth(constrainedWidth: Int, isForwardedContent: Boolean): Int {
         val var3: Int = var1 - MessageAccessoriesView.access$getLeftMarginPx$cp() - MessageAccessoriesView.access$getRightMarginPx$cp();
         var1 = var3;
         if (var2) {
            var1 = var3 - this.getFORWARD_BAR_SPACING();
         }

         return var1;
      }

      public fun getWidthForEmbedContent(constrainedWidth: Int, isForward: Boolean): Int {
         return this.getWidth(var1, var2) - MessageAccessoriesView.access$getEmbedContentMarginPx$cp() * 2;
      }
   }
}
