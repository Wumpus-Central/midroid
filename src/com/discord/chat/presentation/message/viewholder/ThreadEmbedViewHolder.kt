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
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()));
   }

   public fun bind(threadItem: ThreadEmbedMessageAccessory, onTapThreadEmbed: (MessageId) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "threadItem");
      kotlin.jvm.internal.q.h(var2, "onTapThreadEmbed");
      val var12: ThreadEmbed = var1.getThreadEmbed();
      val var14: ThreadEmbedView = this.threadEmbedView;
      this.threadEmbedView.setThread(var12.getTitle(), var12.getMessageCountLabel());
      val var9: java.lang.Boolean = var12.getArchived();
      val var13: java.lang.Boolean = java.lang.Boolean.TRUE;
      var14.setArchived(kotlin.jvm.internal.q.c(var9, java.lang.Boolean.TRUE), var12.getArchivedIconUrl());
      val var15: O = new O(var2, var1);
      var var4: Boolean = false;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var14, false, var15, 1, null);
      val var16: ThreadEmbedMessage = var12.getReferencedMessage();
      val var20: Message;
      if (var16 != null) {
         var20 = var16.getMessage();
      } else {
         var20 = null;
      }

      var var17: Any = "";
      if (var20 == null) {
         val var22: java.lang.String = var12.getMessagePreviewString();
         if (var22 != null) {
            var17 = var22;
         }

         var17 = new DraweeSpanStringBuilder((java.lang.CharSequence)var17);
      } else if (var20.getContent() != null) {
         val var23: StructurableText = var20.getContent();
         val var10: Context = var14.getContext();
         kotlin.jvm.internal.q.g(var10, "getContext(...)");
         var17 = var20.getId-3Eiw7ao();
         val var6: Boolean = MessageKt.shouldAnimateEmoji(var20);
         val var8: Boolean = MessageKt.shouldShowLinkDecorations(var20);
         val var5: Boolean = var20.getShouldShowRoleDot();
         val var7: Boolean = var20.getShouldShowRoleOnName();
         val var11: FontMetrics = var14.getBinding().threadEmbedMostRecentMessageContent.getPaint().getFontMetrics();
         kotlin.jvm.internal.q.g(var11, "getFontMetrics(...)");
         val var3: Float = TextUtilsKt.getBaselineHeightPx(var11);
         val var29: TextPaint = var14.getBinding().threadEmbedMostRecentMessageContent.getPaint();
         kotlin.jvm.internal.q.g(var29, "getPaint(...)");
         var17 = TextUtilsKt.toSpannable$default(
            var23,
            var10,
            (java.lang.String)var17,
            var6,
            var8,
            var5,
            var7,
            var29,
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
            null,
            null,
            true,
            null,
            var3,
            null,
            46137216,
            null
         );
      } else {
         val var24: Context = var14.getContext();
         kotlin.jvm.internal.q.g(var24, "getContext(...)");
         val var25: java.lang.CharSequence = ThreadEmbedViewHolderKt.access$getContentlessPreviewText(var24, var20);
         if (var25 != null) {
            var17 = var25;
         }

         var17 = new DraweeSpanStringBuilder((java.lang.CharSequence)var17);
      }

      val var27: java.lang.String;
      if (var20 != null) {
         val var26: Context = var14.getContext();
         kotlin.jvm.internal.q.g(var26, "getContext(...)");
         var27 = MessageKt.avatarUrl(var20, var26);
      } else {
         var27 = null;
      }

      val var28: java.lang.String;
      if (var20 != null) {
         var28 = var20.getUsername();
      } else {
         var28 = null;
      }

      val var30: Int;
      if (var20 != null) {
         var30 = MessageKt.usernameColor$default(var20, 0, 1, null);
      } else {
         var30 = null;
      }

      if (kotlin.jvm.internal.q.c(var12.getArchived(), var13) || var20 == null || var20.getContent() == null) {
         var4 = true;
      }

      val var31: java.lang.String;
      if (var20 != null) {
         var31 = var20.getClanTag();
      } else {
         var31 = null;
      }

      val var32: java.lang.String;
      if (var20 != null) {
         var32 = var20.getClanBadgeUrl();
      } else {
         var32 = null;
      }

      val var21: GuildId;
      if (var20 != null) {
         var21 = var20.getClanTagGuildId-qOKuAAo();
      } else {
         var21 = null;
      }

      var14.setMessage-CKTq3AQ(var27, var28, var30, (DraweeSpanStringBuilder)var17, var4, var31, var32, var21);
   }
}
