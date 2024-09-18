package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Point
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.FrameLayout.LayoutParams
import android.widget.ImageView.ScaleType
import com.discord.chat.R
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.polls.PollAnswer
import com.discord.chat.bridge.polls.PollMedia
import com.discord.chat.bridge.polls.PollMediaEmoji
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessoryKt
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.view.ViewLocationUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import gh.l
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.q

public class PollMediaView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val childViews: MutableList<View>
   private final val hierarchyBuilder: GenericDraweeHierarchyBuilder
   private final var emojiSize: Int
   private final var lastMedia: PollAnswerAccessory?

   private final val draweeView: SimpleDraweeView
      private final get() {
         return this.draweeView$delegate.getValue() as SimpleDraweeView;
      }


   private final val textView: SimpleDraweeSpanTextView
      private final get() {
         return this.textView$delegate.getValue() as SimpleDraweeSpanTextView;
      }


   fun PollMediaView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.childViews = new ArrayList<>();
      this.hierarchyBuilder = v4.a.d(var1, var2);
      this.emojiSize = DEFAULT_EMOJI_SIZE;
      val var3: IntArray = R.styleable.PollMediaView;
      q.g(R.styleable.PollMediaView, "PollMediaView");
      val var4: TypedArray = var1.obtainStyledAttributes(var2, var3, 0, 0);
      this.emojiSize = var4.getDimensionPixelSize(R.styleable.PollMediaView_emojiSize, this.emojiSize);
      var4.recycle();
      this.draweeView$delegate = l.b(new Function0(var1, this) {
         final Context $context;
         final PollMediaView this$0;

         {
            super(0);
            this.$context = var1;
            this.this$0 = var2;
         }

         public final SimpleDraweeView invoke() {
            val var2: SimpleDraweeView = new SimpleDraweeView(this.$context);
            val var1: PollMediaView = this.this$0;
            var2.setHierarchy(PollMediaView.access$getHierarchyBuilder$p(this.this$0).a());
            PollMediaView.access$getChildViews$p(var1).add(var2);
            var1.addView(var2, new LayoutParams(-1, -1, 17));
            return var2;
         }
      });
      this.textView$delegate = l.b(new Function0(var1, this) {
         final Context $context;
         final PollMediaView this$0;

         {
            super(0);
            this.$context = var1;
            this.this$0 = var2;
         }

         public final SimpleDraweeSpanTextView invoke() {
            val var2: SimpleDraweeSpanTextView = new SimpleDraweeSpanTextView(this.$context);
            val var1: PollMediaView = this.this$0;
            PollMediaView.access$getChildViews$p(this.this$0).add(var2);
            var1.addView(var2, new LayoutParams(-2, -2, 17));
            return var2;
         }
      });
   }

   private fun hideViews() {
      val var1: java.util.Iterator = this.childViews.iterator();

      while (var1.hasNext()) {
         (var1.next() as View).setVisibility(8);
      }
   }

   private fun setDraweeSpanStringBuilder(spanBuilder: DraweeSpanStringBuilder) {
      this.hideViews();
      val var2: SimpleDraweeSpanTextView = this.getTextView();
      var2.setVisibility(0);
      var2.setDraweeSpanStringBuilder(var1);
   }

   private fun setImageURL(url: String, scaleType: ScaleType, autoPlayAnimations: Boolean) {
      this.hideViews();
      this.getDraweeView().setScaleType(var2);
      SetOptionalImageUrlKt.setOptionalImageUrl$default(this.getDraweeView(), var1, var3, null, 4, null);
   }

   @JvmStatic
   fun `setMedia$lambda$1`(var0: Function0, var1: View) {
      q.h(var0, "$onTapAnswer");
      var0.invoke();
   }

   @JvmStatic
   fun `setMedia$lambda$2`(var0: PollMediaView, var1: Function6, var2: Attachment, var3: View): Boolean {
      q.h(var0, "this$0");
      q.h(var1, "$onLongPressImage");
      val var4: Point = ViewLocationUtilsKt.getLocationInWindow(var0);
      var1.invoke(var2.getId(), var0.getWidth(), var0.getHeight(), var4.x, var4.y, ViewResizeMode.Cover);
      return true;
   }

   @JvmStatic
   fun `setMedia$lambda$3`(var0: Function0, var1: View) {
      q.h(var0, "$onTapAnswer");
      var0.invoke();
   }

   public fun setMedia(accessory: PollAnswerAccessory, onTapAnswer: () -> Unit, onLongPressImage: (String, Int, Int, Int, Int, ViewResizeMode) -> Unit) {
      var var14: PollMedia;
      label40: {
         q.h(var1, "accessory");
         q.h(var2, "onTapAnswer");
         q.h(var3, "onLongPressImage");
         if (this.lastMedia != null) {
            val var13: PollAnswer = this.lastMedia.getAnswer();
            if (var13 != null) {
               var14 = var13.getPollMedia();
               break label40;
            }
         }

         var14 = null;
      }

      if (!q.c(var14, var1.getAnswer().getPollMedia())) {
         this.lastMedia = var1;
         val var15: Attachment = PollAnswerAccessoryKt.getFirstImage(var1.getAttachments());
         this.setOnClickListener(null);
         this.setOnLongClickListener(null);
         var var4: Boolean;
         if (var15 != null) {
            this.setImageURL(var15.getUrl(), ScaleType.CENTER_CROP, var1.getShouldAutoPlayGifs());
            var4 = 1;
            if (var15.getId() != null) {
               this.setOnClickListener(new f(var2));
               this.setOnLongClickListener(new g(this, var3, var15));
               var4 = 1;
            }
         } else if (var1.getAnswer().getPollMedia().getEmoji() != null) {
            val var16: PollMediaEmoji = var1.getAnswer().getPollMedia().getEmoji();
            val var9: RenderableEmoji = var16.renderable();
            val var10: Context = this.getContext();
            q.g(var10, "getContext(...)");
            var4 = this.emojiSize;
            val var7: Boolean;
            if (var1.getShouldAnimateEmoji() && var16.getAnimated()) {
               var7 = true;
            } else {
               var7 = false;
            }

            this.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(var9, var10, var4, var7, 0, null, 48, null));
            this.setOnClickListener(new h(var2));
            var4 = 1;
         } else {
            this.hideViews();
            var4 = 0;
         }

         val var12: Byte;
         if (var4) {
            var12 = 0;
         } else {
            var12 = 8;
         }

         this.setVisibility(var12);
      }
   }

   public companion object {
      private final val DEFAULT_EMOJI_SIZE: Int
   }
}
