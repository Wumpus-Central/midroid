package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.view.View
import android.widget.TextView
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.chat.bridge.threads.ThreadEmbedMessage
import com.discord.chat.presentation.message.MessageUtilsKt
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
      kotlin.jvm.internal.r.h(var1, "threadEmbedView");
      super(var1, null);
      this.threadEmbedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: Function1, var1: ThreadEmbedMessageAccessory, var2: View) {
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()));
   }

   public fun bind(threadItem: ThreadEmbedMessageAccessory, onTapThreadEmbed: (MessageId) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "threadItem");
      kotlin.jvm.internal.r.h(var2, "onTapThreadEmbed");
      val var12: ThreadEmbed = var1.getThreadEmbed();
      val var15: ThreadEmbedView = this.threadEmbedView;
      this.threadEmbedView.setThread(var12.getTitle(), var12.getMessageCountLabel());
      val var9: java.lang.Boolean = var12.getArchived();
      val var13: java.lang.Boolean = java.lang.Boolean.TRUE;
      var15.setArchived(kotlin.jvm.internal.r.c(var9, java.lang.Boolean.TRUE), var12.getArchivedIconUrl());
      val var16: O = new O(var2, var1);
      var var4: Boolean = false;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var15, false, var16, 1, null);
      val var17: ThreadEmbedMessage = var12.getReferencedMessage();
      val var22: Message;
      if (var17 != null) {
         var22 = var17.getMessage();
      } else {
         var22 = null;
      }

      var var18: Any = "";
      if (var22 == null) {
         val var23: java.lang.String = var12.getMessagePreviewString();
         if (var23 != null) {
            var18 = var23;
         }

         var18 = new DraweeSpanStringBuilder((java.lang.CharSequence)var18);
      } else if (var22.getContent() != null) {
         var18 = var22.getContent();
         val var10: Context = var15.getContext();
         kotlin.jvm.internal.r.g(var10, "getContext(...)");
         val var24: java.lang.String = var22.getId-3Eiw7ao();
         val var8: Boolean = MessageKt.shouldAnimateEmoji(var22);
         val var7: Boolean = MessageKt.shouldShowLinkDecorations(var22);
         val var6: Boolean = var22.getShouldShowRoleDot();
         val var5: Boolean = var22.getShouldShowRoleOnName();
         val var11: FontMetrics = var15.getBinding().threadEmbedMostRecentMessageContent.getPaint().getFontMetrics();
         kotlin.jvm.internal.r.g(var11, "getFontMetrics(...)");
         val var3: Float = TextUtilsKt.getBaselineHeightPx(var11);
         val var30: TextPaint = var15.getBinding().threadEmbedMostRecentMessageContent.getPaint();
         kotlin.jvm.internal.r.g(var30, "getPaint(...)");
         var18 = TextUtilsKt.toSpannable$default(
            (StructurableText)var18,
            var10,
            var24,
            var8,
            var7,
            var6,
            var5,
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
         val var25: Context = var15.getContext();
         kotlin.jvm.internal.r.g(var25, "getContext(...)");
         val var26: java.lang.CharSequence = ThreadEmbedViewHolderKt.access$getContentlessPreviewText(var25, var22);
         if (var26 != null) {
            var18 = var26;
         }

         var18 = new DraweeSpanStringBuilder((java.lang.CharSequence)var18);
      }

      val var28: java.lang.String;
      if (var22 != null) {
         val var27: Context = var15.getContext();
         kotlin.jvm.internal.r.g(var27, "getContext(...)");
         var28 = MessageKt.avatarUrl(var22, var27);
      } else {
         var28 = null;
      }

      val var29: java.lang.String;
      if (var22 != null) {
         var29 = var22.getUsername();
      } else {
         var29 = null;
      }

      val var31: Int;
      if (var22 != null) {
         var31 = MessageKt.usernameColor$default(var22, 0, 1, null);
      } else {
         var31 = null;
      }

      if (kotlin.jvm.internal.r.c(var12.getArchived(), var13) || var22 == null || var22.getContent() == null) {
         var4 = true;
      }

      val var32: java.lang.String;
      if (var22 != null) {
         var32 = var22.getClanTag();
      } else {
         var32 = null;
      }

      val var33: java.lang.String;
      if (var22 != null) {
         var33 = var22.getClanBadgeUrl();
      } else {
         var33 = null;
      }

      val var14: GuildId;
      if (var22 != null) {
         var14 = var22.getClanTagGuildId-qOKuAAo();
      } else {
         var14 = null;
      }

      var15.setMessage-CKTq3AQ(var28, var29, var31, (DraweeSpanStringBuilder)var18, var4, var32, var33, var14);
      if (var22 != null) {
         var18 = var15.getBinding().threadEmbedMostRecentMessageName;
         kotlin.jvm.internal.r.g(var18, "threadEmbedMostRecentMessageName");
         MessageUtilsKt.clearOrSetRoleColors((TextView)var18, var22);
      }
   }
}
