package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.view.View
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.chat.bridge.threads.ThreadEmbedMessage
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import kotlin.jvm.functions.Function1

public class ThreadEmbedViewHolder(threadEmbedView: ThreadEmbedView) : MessagePartViewHolder {
   private final val threadEmbedView: ThreadEmbedView

   init {
      kotlin.jvm.internal.q.h(var1, "threadEmbedView");
      super(var1, null);
      this.threadEmbedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: Function1, var1: ThreadEmbedMessageAccessory, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onTapThreadEmbed");
      kotlin.jvm.internal.q.h(var1, "$threadItem");
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()));
   }

   public fun bind(threadItem: ThreadEmbedMessageAccessory, onTapThreadEmbed: (MessageId) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "threadItem");
      kotlin.jvm.internal.q.h(var2, "onTapThreadEmbed");
      val var13: ThreadEmbed = var1.getThreadEmbed();
      val var14: ThreadEmbedView = this.threadEmbedView;
      this.threadEmbedView.setThread(var13.getTitle(), var13.getMessageCountLabel());
      val var9: java.lang.Boolean = var13.getArchived();
      val var12: java.lang.Boolean = java.lang.Boolean.TRUE;
      var14.setArchived(kotlin.jvm.internal.q.c(var9, java.lang.Boolean.TRUE), var13.getArchivedIconUrl());
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var14, false, new z(var2, var1), 1, null);
      val var16: ThreadEmbedMessage = var13.getReferencedMessage();
      val var20: Message;
      if (var16 != null) {
         var20 = var16.getMessage();
      } else {
         var20 = null;
      }

      var var17: Any = "";
      if (var20 == null) {
         val var23: java.lang.String = var13.getMessagePreviewString();
         if (var23 != null) {
            var17 = var23;
         }

         var17 = new DraweeSpanStringBuilder((java.lang.CharSequence)var17);
      } else if (var20.getContent() != null) {
         val var10: StructurableText = var20.getContent();
         var17 = var14.getContext();
         val var24: java.lang.String = var20.getId-3Eiw7ao();
         val var8: Boolean = MessageKt.shouldAnimateEmoji(var20);
         val var7: Boolean = MessageKt.shouldShowLinkDecorations(var20);
         val var4: Boolean = var20.getShouldShowRoleDot();
         val var6: Boolean = var20.getShouldShowRoleOnName();
         val var11: FontMetrics = var14.getBinding().threadEmbedMostRecentMessageContent.getPaint().getFontMetrics();
         kotlin.jvm.internal.q.g(var11, "getFontMetrics(...)");
         val var3: Float = TextUtilsKt.getBaselineHeightPx(var11);
         val var30: TextPaint = var14.getBinding().threadEmbedMostRecentMessageContent.getPaint();
         kotlin.jvm.internal.q.e(var17);
         kotlin.jvm.internal.q.e(var30);
         var17 = TextUtilsKt.toSpannable$default(
            var10,
            (Context)var17,
            var24,
            var8,
            var7,
            var4,
            var6,
            var30,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            true,
            null,
            var3,
            null,
            11534208,
            null
         );
      } else {
         val var25: Context = var14.getContext();
         kotlin.jvm.internal.q.g(var25, "getContext(...)");
         val var26: java.lang.CharSequence = ThreadEmbedViewHolderKt.access$getContentlessPreviewText(var25, var20);
         if (var26 != null) {
            var17 = var26;
         }

         var17 = new DraweeSpanStringBuilder((java.lang.CharSequence)var17);
      }

      val var28: java.lang.String;
      if (var20 != null) {
         val var27: Context = var14.getContext();
         kotlin.jvm.internal.q.g(var27, "getContext(...)");
         var28 = MessageKt.avatarUrl(var20, var27);
      } else {
         var28 = null;
      }

      val var29: java.lang.String;
      if (var20 != null) {
         var29 = var20.getUsername();
      } else {
         var29 = null;
      }

      val var31: Int;
      if (var20 != null) {
         var31 = MessageKt.usernameColor$default(var20, 0, 1, null);
      } else {
         var31 = null;
      }

      var var22: Boolean = true;
      if (!kotlin.jvm.internal.q.c(var13.getArchived(), var12)) {
         var22 = true;
         if (var20 != null) {
            if (var20.getContent() == null) {
               var22 = true;
            } else {
               var22 = false;
            }
         }
      }

      val var32: java.lang.String;
      if (var20 != null) {
         var32 = var20.getClanTag();
      } else {
         var32 = null;
      }

      val var33: java.lang.String;
      if (var20 != null) {
         var33 = var20.getClanBadgeUrl();
      } else {
         var33 = null;
      }

      val var21: GuildId;
      if (var20 != null) {
         var21 = var20.getClanTagGuildId-qOKuAAo();
      } else {
         var21 = null;
      }

      var14.setMessage-CKTq3AQ(var28, var29, var31, (DraweeSpanStringBuilder)var17, var22, var32, var33, var21);
   }
}
