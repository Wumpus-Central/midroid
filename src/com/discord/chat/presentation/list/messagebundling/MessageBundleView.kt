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
      r.g(var6.chatListView, "_init_$lambda$2");
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

            val var26: java.util.List = h.v0(var11, var30);
            val var22: java.lang.String = var1.getViewMoreText();
            val var23: MessageBundleViewMoreItem;
            if (var22 != null) {
               var23 = new MessageBundleViewMoreItem(var22);
            } else {
               var23 = null;
            }

            var var15: Boolean;
            label68: {
               var8 = h.w0(var26, var23);
               var31 = this.spineItemDecoration;
               if (!(var1.getReferenceMessageRows().isEmpty() xor true)) {
                  val var27: java.lang.String = var1.getViewMoreText();
                  val var6: Boolean;
                  if (var27 != null && var27.length() != 0) {
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

            var31.setShowThreadSpine(var15);
            val var28: MessageFrameFeedHeaderView = this.binding.messageFrameHeader;
            val var32: MessageFrameFeedHeaderView.MessageBundleHeader = var1.getMessageFrame();
            if (var32 != null) {
               var28.configure(var32, new d(var3));
            }

            r.g(var28, "setBundle$lambda$10");
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

            var28.setVisibility(var13);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var2, 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, var3, 1, null);
            this.adapter.setItems(h.X(var8), this.onTruncateMessage, var1.getTruncationThreshold(), new Function1<MessageId, Unit>(var4) {
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
         val var5: MessageFrameFeedHeaderView.MessageBundleHeader = this.messageFrame;
         val var4: java.util.List = this.rows;
         val var6: java.lang.Float = this.truncationThreshold;
         val var3: java.util.List = this.referenceMessageRows;
         val var2: java.lang.String = this.viewMoreText;
         val var1: StringBuilder = new StringBuilder();
         var1.append("MessageBundle(messageFrame=");
         var1.append(var5);
         var1.append(", rows=");
         var1.append(var4);
         var1.append(", truncationThreshold=");
         var1.append(var6);
         var1.append(", referenceMessageRows=");
         var1.append(var3);
         var1.append(", viewMoreText=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
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
            val var1: KSerializer = vk.a.u(MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE);
            val var2: MessageRow.$serializer = MessageRow.$serializer.INSTANCE;
            return new KSerializer[]{var1, new xk.f(MessageRow.$serializer.INSTANCE), vk.a.u(e0.a), new xk.f(var2), vk.a.u(a2.a)};
         }

         public open fun deserialize(decoder: Decoder): com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle {
            r.h(var1, "decoder");
            val var11: SerialDescriptor = this.getDescriptor();
            val var12: kotlinx.serialization.encoding.c = var1.b(var11);
            val var5: Boolean = var12.p();
            var var7: Any = null;
            var var2: Int;
            var var8: Any;
            var var9: Any;
            var var13: Any;
            var var15: Any;
            if (var5) {
               var13 = var12.n(var11, 0, MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE, null);
               var15 = MessageRow.$serializer.INSTANCE;
               var9 = var12.y(var11, 1, new xk.f(MessageRow.$serializer.INSTANCE), null);
               var8 = var12.n(var11, 2, e0.a, null);
               var15 = var12.y(var11, 3, new xk.f((KSerializer)var15), null);
               var7 = var12.n(var11, 4, a2.a, null);
               var2 = 31;
            } else {
               var var3: Boolean = true;
               var2 = 0;
               var9 = null;
               var8 = null;
               var15 = null;
               var13 = null;

               while (var3) {
                  val var4: Int = var12.o(var11);
                  if (var4 != -1) {
                     if (var4 != 0) {
                        if (var4 != 1) {
                           if (var4 != 2) {
                              if (var4 != 3) {
                                 if (var4 != 4) {
                                    throw new n(var4);
                                 }

                                 var13 = var12.n(var11, 4, a2.a, var13);
                                 var2 |= 16;
                              } else {
                                 var15 = var12.y(var11, 3, new xk.f(MessageRow.$serializer.INSTANCE), var15);
                                 var2 |= 8;
                              }
                           } else {
                              var8 = var12.n(var11, 2, e0.a, var8);
                              var2 |= 4;
                           }
                        } else {
                           var9 = var12.y(var11, 1, new xk.f(MessageRow.$serializer.INSTANCE), var9);
                           var2 |= 2;
                        }
                     } else {
                        var7 = var12.n(var11, 0, MessageFrameFeedHeaderView.MessageBundleHeader.$serializer.INSTANCE, var7);
                        var2 |= 1;
                     }
                  } else {
                     var3 = false;
                  }
               }

               var13 = var7;
               var7 = var13;
            }

            var12.c(var11);
            return new MessageBundleView.MessageBundle(
               var2,
               var13 as MessageFrameFeedHeaderView.MessageBundleHeader,
               var9 as java.util.List,
               var8 as java.lang.Float,
               var15 as java.util.List,
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
