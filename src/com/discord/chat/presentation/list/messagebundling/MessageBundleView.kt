package com.discord.chat.presentation.list.messagebundling

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.R
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.row.MessageRowKt
import com.discord.chat.databinding.MessageBundleViewBinding
import com.discord.chat.presentation.list.ChatListUtilsKt
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.MessageBundleConversationItem
import com.discord.chat.presentation.list.item.MessageBundleMessageItem
import com.discord.chat.presentation.list.item.MessageBundleViewMoreItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView.MessageBundleHeader
import com.discord.chat.presentation.message.decorations.MessageBundleHorizontalSpacingDecoration
import com.discord.chat.presentation.message.decorations.MessageBundleSpineItemDecoration
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.ripple.RippleUtilsKt
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

public class MessageBundleView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout {
   private final val binding: MessageBundleViewBinding
   private final val adapter: MessageBundleAdapter
   private final val leftMarginPx: Int
   private final val rightMarginPx: Int
   private final val spineItemDecoration: MessageBundleSpineItemDecoration

   public final var messageRowViewPool: RecycledViewPool?
      public final set(value) {
         if (var1 != null) {
            this.binding.chatListView.setRecycledViewPool(var1);
         }

         this.messageRowViewPool = var1;
      }


   public final var messageAccessoriesViewPool: RecycledViewPool?
      public final set(value) {
         if (var1 != null) {
            this.adapter.setMessageAccessoriesViewPool(var1);
         }

         this.messageAccessoriesViewPool = var1;
      }


   public final var onTruncateMessage: (MessageId) -> Unit

   fun MessageBundleView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageBundleView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var6: MessageBundleViewBinding = MessageBundleViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var6, "inflate(...)");
      this.binding = var6;
      val var5: MessageBundleAdapter = new MessageBundleAdapter();
      this.adapter = var5;
      var3 = this.getResources().getDimensionPixelSize(R.dimen.message_start_guideline);
      this.leftMarginPx = var3;
      val var4: Int = this.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      this.rightMarginPx = var4;
      val var7: MessageBundleSpineItemDecoration = new MessageBundleSpineItemDecoration(var1, var3);
      this.spineItemDecoration = var7;
      this.onTruncateMessage = <unrepresentable>.INSTANCE;
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
      val var9: MessageBundleRecyclerView = var6.chatListView;
      r.e(var6.chatListView);
      ChatListUtilsKt.configureMessageRecyclerView(
         var9,
         var1,
         new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(8), 0, SizeUtilsKt.getDpToPx(8), false, 10, null),
         var7,
         new MessageBundleHorizontalSpacingDecoration(var3, var4)
      );
      var9.setLayoutManager(new LinearLayoutManager(var1));
      var9.setAdapter(var5);
      var9.setNestedScrollingEnabled(false);
   }

   @JvmStatic
   fun `setBundle$lambda$10$lambda$9$lambda$8`(var0: OnLongClickListener, var1: View) {
      var0.onLongClick(var1);
   }

   public fun setBundle(
      messageBundle: com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle,
      onClickListener: OnClickListener,
      onLongClickListener: OnLongClickListener,
      onTapReply: (MessageId) -> Unit,
      onTapViewMoreText: OnClickListener
   ) {
      r.h(var1, "messageBundle");
      r.h(var2, "onClickListener");
      r.h(var3, "onLongClickListener");
      r.h(var4, "onTapReply");
      r.h(var5, "onTapViewMoreText");
      var var8: java.util.List = var1.getRows();
      val var11: ArrayList = new ArrayList();
      var var12: java.util.Iterator = var8.iterator();

      while (true) {
         if (!var12.hasNext()) {
            var8 = var1.getReferenceMessageRows();
            val var29: ArrayList = new ArrayList();
            var12 = var8.iterator();

            while (var12.hasNext()) {
               val var24: ChatListItem = MessageRowKt.toChatListMessageItem(var12.next() as MessageRow);
               var var18: ChatListItem = var24;
               if (var24 !is MessageItem) {
                  var18 = null;
               }

               val var19: MessageItem = var18 as MessageItem;
               val var20: MessageBundleConversationItem;
               if (var18 as MessageItem != null) {
                  var20 = new MessageBundleConversationItem(var19);
               } else {
                  var20 = null;
               }

               if (var20 != null) {
                  var29.add(var20);
               }
            }

            val var25: java.util.List = i.B0(var11, var29);
            val var21: java.lang.String = var1.getViewMoreText();
            val var22: MessageBundleViewMoreItem;
            if (var21 != null) {
               var22 = new MessageBundleViewMoreItem(var21);
            } else {
               var22 = null;
            }

            var var14: Boolean;
            label61: {
               var8 = i.C0(var25, var22);
               var30 = this.spineItemDecoration;
               if (var1.getReferenceMessageRows().isEmpty()) {
                  val var26: java.lang.String = var1.getViewMoreText();
                  if (var26 == null || var26.length() == 0) {
                     var14 = false;
                     break label61;
                  }
               }

               var14 = true;
            }

            var30.setShowThreadSpine(var14);
            val var27: MessageFrameFeedHeaderView = this.binding.messageFrameHeader;
            val var31: MessageFrameFeedHeaderView.MessageBundleHeader = var1.getMessageFrame();
            if (var31 != null) {
               var27.configure(var31, new h(var3));
            }

            r.e(var27);
            var var6: Boolean;
            if (var1.getMessageFrame() != null) {
               var6 = 1;
            } else {
               var6 = 0;
            }

            if (var6) {
               var6 = 0;
            } else {
               var6 = 8;
            }

            var27.setVisibility(var6);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var2, 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, var3, 1, null);
            this.adapter.setItems(i.e0(var8), this.onTruncateMessage, var1.getTruncationThreshold(), new Function1(var4) {
               final Function1 $onTapReply;

               {
                  this.$onTapReply = var1;
               }

               public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                  r.h(var1, "it");
                  this.$onTapReply.invoke(MessageId.box-impl(var1));
               }
            }, var5);
            return;
         }

         val var10: ChatListItem = MessageRowKt.toChatListMessageItem(var12.next() as MessageRow);
         var var15: ChatListItem = var10;
         if (var10 !is MessageItem) {
            var15 = null;
         }

         val var28: MessageItem = var15 as MessageItem;
         var var16: MessageBundleMessageItem = null;
         if (var28 != null) {
            var16 = new MessageBundleMessageItem(var28);
         }

         if (var16 != null) {
            var11.add(var16);
         }
      }
   }

   @sb.g
   public data class MessageBundle(messageFrame: MessageBundleHeader? = null,
      rows: List<MessageRow>,
      truncationThreshold: Float? = null,
      referenceMessageRows: List<MessageRow> = i.k(),
      viewMoreText: String? = null
   ) {
      public final val messageFrame: MessageBundleHeader?
      public final val rows: List<MessageRow>
      public final val truncationThreshold: Float?
      public final val referenceMessageRows: List<MessageRow>
      public final val viewMoreText: String?

      @JvmStatic
      fun {
         val var0: MessageRow.$serializer = MessageRow.$serializer.INSTANCE;
         $childSerializers = new KSerializer[]{null, new vb.f(MessageRow.$serializer.INSTANCE), null, new vb.f(var0), null};
      }

      init {
         r.h(var2, "rows");
         r.h(var4, "referenceMessageRows");
         super();
         this.messageFrame = var1;
         this.rows = var2;
         this.truncationThreshold = var3;
         this.referenceMessageRows = var4;
         this.viewMoreText = var5;
      }

      public operator fun component1(): MessageBundleHeader? {
         return this.messageFrame;
      }

      public operator fun component2(): List<MessageRow> {
         return this.rows;
      }

      public operator fun component3(): Float? {
         return this.truncationThreshold;
      }

      public operator fun component4(): List<MessageRow> {
         return this.referenceMessageRows;
      }

      public operator fun component5(): String? {
         return this.viewMoreText;
      }

      public fun copy(
         messageFrame: MessageBundleHeader? = var0.messageFrame,
         rows: List<MessageRow> = var0.rows,
         truncationThreshold: Float? = var0.truncationThreshold,
         referenceMessageRows: List<MessageRow> = var0.referenceMessageRows,
         viewMoreText: String? = var0.viewMoreText
      ): com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle {
         r.h(var2, "rows");
         r.h(var4, "referenceMessageRows");
         return new MessageBundleView.MessageBundle(var1, var2, var3, var4, var5);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MessageBundleView.MessageBundle) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.messageFrame, var1.messageFrame)) {
               return false;
            } else if (!r.c(this.rows, var1.rows)) {
               return false;
            } else if (!r.c(this.truncationThreshold, var1.truncationThreshold)) {
               return false;
            } else if (!r.c(this.referenceMessageRows, var1.referenceMessageRows)) {
               return false;
            } else {
               return r.c(this.viewMoreText, var1.viewMoreText);
            }
         }
      }

      public override fun hashCode(): Int {
         var var3: Int = 0;
         val var1: Int;
         if (this.messageFrame == null) {
            var1 = 0;
         } else {
            var1 = this.messageFrame.hashCode();
         }

         val var4: Int = this.rows.hashCode();
         val var2: Int;
         if (this.truncationThreshold == null) {
            var2 = 0;
         } else {
            var2 = this.truncationThreshold.hashCode();
         }

         val var5: Int = this.referenceMessageRows.hashCode();
         if (this.viewMoreText != null) {
            var3 = this.viewMoreText.hashCode();
         }

         return (((var1 * 31 + var4) * 31 + var2) * 31 + var5) * 31 + var3;
      }

      public override fun toString(): String {
         val var6: MessageFrameFeedHeaderView.MessageBundleHeader = this.messageFrame;
         val var2: java.util.List = this.rows;
         val var1: java.lang.Float = this.truncationThreshold;
         val var4: java.util.List = this.referenceMessageRows;
         val var5: java.lang.String = this.viewMoreText;
         val var3: StringBuilder = new StringBuilder();
         var3.append("MessageBundle(messageFrame=");
         var3.append(var6);
         var3.append(", rows=");
         var3.append(var2);
         var3.append(", truncationThreshold=");
         var3.append(var1);
         var3.append(", referenceMessageRows=");
         var3.append(var4);
         var3.append(", viewMoreText=");
         var3.append(var5);
         var3.append(")");
         return var3.toString();
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle> {
            return MessageBundleView.MessageBundle.$serializer.INSTANCE;
         }
      }
   }
}
