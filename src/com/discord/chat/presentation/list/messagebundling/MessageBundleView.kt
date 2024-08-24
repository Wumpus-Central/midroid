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
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.e0
import xk.f0

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
      r.g(var6, "inflate(LayoutInflater.from(context), this)");
      this.binding = var6;
      val var7: MessageBundleAdapter = new MessageBundleAdapter();
      this.adapter = var7;
      val var4: Int = this.getResources().getDimensionPixelSize(R.dimen.message_start_guideline);
      this.leftMarginPx = var4;
      var3 = this.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      this.rightMarginPx = var3;
      val var5: MessageBundleSpineItemDecoration = new MessageBundleSpineItemDecoration(var1, var4);
      this.spineItemDecoration = var5;
      this.onTruncateMessage = <unrepresentable>.INSTANCE;
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
      val var9: MessageBundleRecyclerView = var6.chatListView;
      r.g(var6.chatListView, "_init_$lambda$2");
      ChatListUtilsKt.configureMessageRecyclerView(
         var9,
         var1,
         new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(8), 0, SizeUtilsKt.getDpToPx(8), false, 10, null),
         var5,
         new MessageBundleHorizontalSpacingDecoration(var4, var3)
      );
      var9.setLayoutManager(new LinearLayoutManager(var1));
      var9.setAdapter(var7);
      var9.setNestedScrollingEnabled(false);
   }

   @JvmStatic
   fun `setBundle$lambda$10$lambda$9$lambda$8`(var0: OnLongClickListener, var1: View) {
      r.h(var0, "$onLongClickListener");
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
            val var30: ArrayList = new ArrayList();
            var12 = var8.iterator();

            while (var12.hasNext()) {
               val var25: ChatListItem = MessageRowKt.toChatListMessageItem(var12.next() as MessageRow);
               var var19: ChatListItem = var25;
               if (var25 !is MessageItem) {
                  var19 = null;
               }

               val var20: MessageItem = var19 as MessageItem;
               val var21: MessageBundleConversationItem;
               if (var19 as MessageItem != null) {
                  var21 = new MessageBundleConversationItem(var20);
               } else {
                  var21 = null;
               }

               if (var21 != null) {
                  var30.add(var21);
               }
            }

            val var26: java.util.List = h.u0(var11, var30);
            val var22: java.lang.String = var1.getViewMoreText();
            val var23: MessageBundleViewMoreItem;
            if (var22 != null) {
               var23 = new MessageBundleViewMoreItem(var22);
            } else {
               var23 = null;
            }

            var var15: Boolean;
            label68: {
               var8 = h.v0(var26, var23);
               var27 = this.spineItemDecoration;
               if (!(var1.getReferenceMessageRows().isEmpty() xor true)) {
                  val var31: java.lang.String = var1.getViewMoreText();
                  val var6: Boolean;
                  if (var31 != null && var31.length() != 0) {
                     var6 = false;
                  } else {
                     var6 = true;
                  }

                  if (var6) {
                     var15 = false;
                     break label68;
                  }
               }

               var15 = true;
            }

            var27.setShowThreadSpine(var15);
            val var32: MessageFrameFeedHeaderView = this.binding.messageFrameHeader;
            val var28: MessageFrameFeedHeaderView.MessageBundleHeader = var1.getMessageFrame();
            if (var28 != null) {
               var32.configure(var28, new d(var3));
            }

            r.g(var32, "setBundle$lambda$10");
            var var13: Boolean;
            if (var1.getMessageFrame() != null) {
               var13 = 1;
            } else {
               var13 = 0;
            }

            if (var13) {
               var13 = 0;
            } else {
               var13 = 8;
            }

            var32.setVisibility(var13);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var2, 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, var3, 1, null);
            this.adapter.setItems(h.W(var8), this.onTruncateMessage, var1.getTruncationThreshold(), new Function1<MessageId, Unit>(var4) {
               final Function1<MessageId, Unit> $onTapReply;

               {
                  super(1);
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
         var var16: ChatListItem = var10;
         if (var10 !is MessageItem) {
            var16 = null;
         }

         val var29: MessageItem = var16 as MessageItem;
         var var17: MessageBundleMessageItem = null;
         if (var29 != null) {
            var17 = new MessageBundleMessageItem(var29);
         }

         if (var17 != null) {
            var11.add(var17);
         }
      }
   }

   @f
   public data class MessageBundle(messageFrame: MessageBundleHeader? = null,
      rows: List<MessageRow>,
      truncationThreshold: Float? = null,
      referenceMessageRows: List<MessageRow> = h.i(),
      viewMoreText: String? = null
   ) {
      public final val messageFrame: MessageBundleHeader?
      public final val referenceMessageRows: List<MessageRow>
      public final val rows: List<MessageRow>
      public final val truncationThreshold: Float?
      public final val viewMoreText: String?

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

      @JvmStatic
      public fun `write$Self`(
         self: com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle,
         output: CompositeEncoder,
         serialDesc: SerialDescriptor
      ) {
         r.h(var0, "self");
         r.h(var1, "output");
         r.h(var2, "serialDesc");
         var var3: Boolean;
         if (!var1.A(var2, 0) && var0.messageFrame == null) {
            var3 = false;
         } else {
            var3 = true;
         }

         if (var3) {
            var1.m(var2, 0, MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE, var0.messageFrame);
         }

         val var5: MessageRow.$serializer = MessageRow.$serializer.INSTANCE;
         var1.y(var2, 1, new xk.f(MessageRow.$serializer.INSTANCE), var0.rows);
         if (!var1.A(var2, 2) && var0.truncationThreshold == null) {
            var3 = false;
         } else {
            var3 = true;
         }

         if (var3) {
            var1.m(var2, 2, e0.a, var0.truncationThreshold);
         }

         if (!var1.A(var2, 3) && r.c(var0.referenceMessageRows, h.i())) {
            var3 = false;
         } else {
            var3 = true;
         }

         if (var3) {
            var1.y(var2, 3, new xk.f(var5), var0.referenceMessageRows);
         }

         label40: {
            if (!var1.A(var2, 4)) {
               var3 = false;
               if (var0.viewMoreText == null) {
                  break label40;
               }
            }

            var3 = true;
         }

         if (var3) {
            var1.m(var2, 4, a2.a, var0.viewMoreText);
         }
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
         val var1: MessageFrameFeedHeaderView.MessageBundleHeader = this.messageFrame;
         val var3: java.util.List = this.rows;
         val var6: java.lang.Float = this.truncationThreshold;
         val var4: java.util.List = this.referenceMessageRows;
         val var5: java.lang.String = this.viewMoreText;
         val var2: StringBuilder = new StringBuilder();
         var2.append("MessageBundle(messageFrame=");
         var2.append(var1);
         var2.append(", rows=");
         var2.append(var3);
         var2.append(", truncationThreshold=");
         var2.append(var6);
         var2.append(", referenceMessageRows=");
         var2.append(var4);
         var2.append(", viewMoreText=");
         var2.append(var5);
         var2.append(")");
         return var2.toString();
      }

      public object `$serializer` : f0<MessageBundleView.MessageBundle> {
         public open val descriptor: SerialDescriptor
            public open get() {
               return descriptor;
            }


         @JvmStatic
         fun {
            val var0: MessageBundleView.MessageBundle.$serializer = new MessageBundleView.MessageBundle.$serializer();
            INSTANCE = var0;
            val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
               "com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle", var0, 5
            );
            var1.l("messageFrame", true);
            var1.l("rows", false);
            var1.l("truncationThreshold", true);
            var1.l("referenceMessageRows", true);
            var1.l("viewMoreText", true);
            descriptor = var1;
         }

         public open fun childSerializers(): Array<KSerializer<*>> {
            val var2: KSerializer = vk.a.u(MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE);
            val var1: MessageRow.$serializer = MessageRow.$serializer.INSTANCE;
            return new KSerializer[]{var2, new xk.f(MessageRow.$serializer.INSTANCE), vk.a.u(e0.a), new xk.f(var1), vk.a.u(a2.a)};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle {
            r.h(var1, "decoder");
            val var12: SerialDescriptor = this.getDescriptor();
            val var13: kotlinx.serialization.encoding.c = var1.b(var12);
            val var5: Boolean = var13.p();
            var var7: Any = null;
            var var2: Int;
            var var6: Any;
            var var9: Any;
            val var10: Any;
            var var14: Any;
            if (var5) {
               var6 = var13.n(var12, 0, MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE, null);
               var7 = MessageRow.$serializer.INSTANCE;
               var14 = var13.y(var12, 1, new xk.f(MessageRow.$serializer.INSTANCE), null);
               var10 = var13.n(var12, 2, e0.a, null);
               var9 = var13.y(var12, 3, new xk.f((KSerializer)var7), null);
               var7 = var13.n(var12, 4, a2.a, null);
               var2 = 31;
            } else {
               var var3: Boolean = true;
               var2 = 0;
               var9 = null;
               var var8: Any = null;
               var6 = null;
               var14 = null;

               while (var3) {
                  val var4: Int = var13.o(var12);
                  if (var4 != -1) {
                     if (var4 != 0) {
                        if (var4 != 1) {
                           if (var4 != 2) {
                              if (var4 != 3) {
                                 if (var4 != 4) {
                                    throw new n(var4);
                                 }

                                 var14 = var13.n(var12, 4, a2.a, var14);
                                 var2 |= 16;
                              } else {
                                 var6 = var13.y(var12, 3, new xk.f(MessageRow.$serializer.INSTANCE), var6);
                                 var2 |= 8;
                              }
                           } else {
                              var8 = var13.n(var12, 2, e0.a, var8);
                              var2 |= 4;
                           }
                        } else {
                           var9 = var13.y(var12, 1, new xk.f(MessageRow.$serializer.INSTANCE), var9);
                           var2 |= 2;
                        }
                     } else {
                        var7 = var13.n(var12, 0, MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE, var7);
                        var2 |= 1;
                     }
                  } else {
                     var3 = false;
                  }
               }

               var14 = var9;
               var10 = var8;
               var7 = var14;
               var9 = var6;
               var6 = var7;
            }

            var13.c(var12);
            return new MessageBundleView.MessageBundle(
               var2,
               var6 as MessageFrameFeedHeaderView.MessageBundleHeader,
               var14 as java.util.List,
               var10 as java.lang.Float,
               var9 as java.util.List,
               var7 as java.lang.String,
               null
            );
         }

         public open fun serialize(encoder: Encoder, value: com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle) {
            r.h(var1, "encoder");
            r.h(var2, "value");
            val var3: SerialDescriptor = this.getDescriptor();
            val var4: CompositeEncoder = var1.b(var3);
            MessageBundleView.MessageBundle.write$Self(var2, var4, var3);
            var4.c(var3);
         }

         fun typeParametersSerializers(): Array<KSerializer<?>> {
            return xk.f0.a.a(this);
         }
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle> {
            return MessageBundleView.MessageBundle.$serializer.INSTANCE;
         }
      }
   }
}
