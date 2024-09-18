package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Paint
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.theme.DiscordThemeObject
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.q

public data class RenderContext(context: Context,
   containerId: String,
   onTapLink: (LinkContentNode) -> Unit,
   onLongTapLink: (LinkContentNode) -> Unit,
   linkStyle: (LinkContentNode) -> LinkStyle,
   onTapChannel: (String, String?, String?) -> Unit,
   onLongPressChannel: (String, String?, String?, String?) -> Unit,
   onTapAttachmentLink: (String) -> Unit,
   onLongPressAttachmentLink: (String, String) -> Unit,
   onTapMention: (String?, String, String?, String?) -> Unit,
   onTapCommand: (CommandMentionContentNode) -> Unit,
   onLongPressCommand: (CommandMentionContentNode) -> Unit,
   onTapSpoiler: () -> Unit,
   onTapTimestamp: (String) -> Unit,
   onTapEmoji: (EmojiContentNode) -> Unit,
   animateEmoji: Boolean,
   showLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean,
   singleLine: Boolean,
   paint: Paint,
   spoilerState: com.discord.chat.presentation.textutils.RenderContext.SpoilerState = RenderContext.SpoilerState.None,
   listNestedLevel: Int = 0,
   listOrderedIndex: Long? = null,
   listLargestOrderedIndex: Long? = null,
   insets: com.discord.chat.presentation.textutils.RenderContext.Insets = new RenderContext.Insets(0, 0, 0, 0, 15, null),
   theme: DiscordThemeObject,
   baselineHeightPx: Float = -1.0F,
   emojiBaselineHeightOverridePx: Float? = null
) {
   public final val context: Context
   public final val containerId: String
   public final val onTapLink: (LinkContentNode) -> Unit
   public final val onLongTapLink: (LinkContentNode) -> Unit
   public final val linkStyle: (LinkContentNode) -> LinkStyle
   public final val onTapChannel: (String, String?, String?) -> Unit
   public final val onLongPressChannel: (String, String?, String?, String?) -> Unit
   public final val onTapAttachmentLink: (String) -> Unit
   public final val onLongPressAttachmentLink: (String, String) -> Unit
   public final val onTapMention: (String?, String, String?, String?) -> Unit
   public final val onTapCommand: (CommandMentionContentNode) -> Unit
   public final val onLongPressCommand: (CommandMentionContentNode) -> Unit
   public final val onTapSpoiler: () -> Unit
   public final val onTapTimestamp: (String) -> Unit
   public final val onTapEmoji: (EmojiContentNode) -> Unit
   public final val animateEmoji: Boolean
   public final val showLinkDecorations: Boolean
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean
   public final val singleLine: Boolean
   public final val paint: Paint
   public final val spoilerState: com.discord.chat.presentation.textutils.RenderContext.SpoilerState
   public final val listNestedLevel: Int
   public final val listOrderedIndex: Long?
   public final val listLargestOrderedIndex: Long?
   public final val insets: com.discord.chat.presentation.textutils.RenderContext.Insets
   public final val theme: DiscordThemeObject
   public final val baselineHeightPx: Float
   public final val emojiBaselineHeightOverridePx: Float?

   init {
      q.h(var1, "context");
      q.h(var2, "containerId");
      q.h(var3, "onTapLink");
      q.h(var4, "onLongTapLink");
      q.h(var5, "linkStyle");
      q.h(var6, "onTapChannel");
      q.h(var7, "onLongPressChannel");
      q.h(var8, "onTapAttachmentLink");
      q.h(var9, "onLongPressAttachmentLink");
      q.h(var10, "onTapMention");
      q.h(var11, "onTapCommand");
      q.h(var12, "onLongPressCommand");
      q.h(var13, "onTapSpoiler");
      q.h(var14, "onTapTimestamp");
      q.h(var15, "onTapEmoji");
      q.h(var21, "paint");
      q.h(var22, "spoilerState");
      q.h(var26, "insets");
      q.h(var27, "theme");
      super();
      this.context = var1;
      this.containerId = var2;
      this.onTapLink = var3;
      this.onLongTapLink = var4;
      this.linkStyle = var5;
      this.onTapChannel = var6;
      this.onLongPressChannel = var7;
      this.onTapAttachmentLink = var8;
      this.onLongPressAttachmentLink = var9;
      this.onTapMention = var10;
      this.onTapCommand = var11;
      this.onLongPressCommand = var12;
      this.onTapSpoiler = var13;
      this.onTapTimestamp = var14;
      this.onTapEmoji = var15;
      this.animateEmoji = var16;
      this.showLinkDecorations = var17;
      this.shouldShowRoleDot = var18;
      this.shouldShowRoleOnName = var19;
      this.singleLine = var20;
      this.paint = var21;
      this.spoilerState = var22;
      this.listNestedLevel = var23;
      this.listOrderedIndex = var24;
      this.listLargestOrderedIndex = var25;
      this.insets = var26;
      this.theme = var27;
      this.baselineHeightPx = var28;
      this.emojiBaselineHeightOverridePx = var29;
   }

   public operator fun component1(): Context {
      return this.context;
   }

   public operator fun component10(): (String?, String, String?, String?) -> Unit {
      return this.onTapMention;
   }

   public operator fun component11(): (CommandMentionContentNode) -> Unit {
      return this.onTapCommand;
   }

   public operator fun component12(): (CommandMentionContentNode) -> Unit {
      return this.onLongPressCommand;
   }

   public operator fun component13(): () -> Unit {
      return this.onTapSpoiler;
   }

   public operator fun component14(): (String) -> Unit {
      return this.onTapTimestamp;
   }

   public operator fun component15(): (EmojiContentNode) -> Unit {
      return this.onTapEmoji;
   }

   public operator fun component16(): Boolean {
      return this.animateEmoji;
   }

   public operator fun component17(): Boolean {
      return this.showLinkDecorations;
   }

   public operator fun component18(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component19(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public operator fun component2(): String {
      return this.containerId;
   }

   public operator fun component20(): Boolean {
      return this.singleLine;
   }

   public operator fun component21(): Paint {
      return this.paint;
   }

   public operator fun component22(): com.discord.chat.presentation.textutils.RenderContext.SpoilerState {
      return this.spoilerState;
   }

   public operator fun component23(): Int {
      return this.listNestedLevel;
   }

   public operator fun component24(): Long? {
      return this.listOrderedIndex;
   }

   public operator fun component25(): Long? {
      return this.listLargestOrderedIndex;
   }

   public operator fun component26(): com.discord.chat.presentation.textutils.RenderContext.Insets {
      return this.insets;
   }

   public operator fun component27(): DiscordThemeObject {
      return this.theme;
   }

   public operator fun component28(): Float {
      return this.baselineHeightPx;
   }

   public operator fun component29(): Float? {
      return this.emojiBaselineHeightOverridePx;
   }

   public operator fun component3(): (LinkContentNode) -> Unit {
      return this.onTapLink;
   }

   public operator fun component4(): (LinkContentNode) -> Unit {
      return this.onLongTapLink;
   }

   public operator fun component5(): (LinkContentNode) -> LinkStyle {
      return this.linkStyle;
   }

   public operator fun component6(): (String, String?, String?) -> Unit {
      return this.onTapChannel;
   }

   public operator fun component7(): (String, String?, String?, String?) -> Unit {
      return this.onLongPressChannel;
   }

   public operator fun component8(): (String) -> Unit {
      return this.onTapAttachmentLink;
   }

   public operator fun component9(): (String, String) -> Unit {
      return this.onLongPressAttachmentLink;
   }

   public fun copy(
      context: Context = var0.context,
      containerId: String = var0.containerId,
      onTapLink: (LinkContentNode) -> Unit = var0.onTapLink,
      onLongTapLink: (LinkContentNode) -> Unit = var0.onLongTapLink,
      linkStyle: (LinkContentNode) -> LinkStyle = var0.linkStyle,
      onTapChannel: (String, String?, String?) -> Unit = var0.onTapChannel,
      onLongPressChannel: (String, String?, String?, String?) -> Unit = var0.onLongPressChannel,
      onTapAttachmentLink: (String) -> Unit = var0.onTapAttachmentLink,
      onLongPressAttachmentLink: (String, String) -> Unit = var0.onLongPressAttachmentLink,
      onTapMention: (String?, String, String?, String?) -> Unit = var0.onTapMention,
      onTapCommand: (CommandMentionContentNode) -> Unit = var0.onTapCommand,
      onLongPressCommand: (CommandMentionContentNode) -> Unit = var0.onLongPressCommand,
      onTapSpoiler: () -> Unit = var0.onTapSpoiler,
      onTapTimestamp: (String) -> Unit = var0.onTapTimestamp,
      onTapEmoji: (EmojiContentNode) -> Unit = var0.onTapEmoji,
      animateEmoji: Boolean = var0.animateEmoji,
      showLinkDecorations: Boolean = var0.showLinkDecorations,
      shouldShowRoleDot: Boolean = var0.shouldShowRoleDot,
      shouldShowRoleOnName: Boolean = var0.shouldShowRoleOnName,
      singleLine: Boolean = var0.singleLine,
      paint: Paint = var0.paint,
      spoilerState: com.discord.chat.presentation.textutils.RenderContext.SpoilerState = var0.spoilerState,
      listNestedLevel: Int = var0.listNestedLevel,
      listOrderedIndex: Long? = var0.listOrderedIndex,
      listLargestOrderedIndex: Long? = var0.listLargestOrderedIndex,
      insets: com.discord.chat.presentation.textutils.RenderContext.Insets = var0.insets,
      theme: DiscordThemeObject = var0.theme,
      baselineHeightPx: Float = var0.baselineHeightPx,
      emojiBaselineHeightOverridePx: Float? = var0.emojiBaselineHeightOverridePx
   ): RenderContext {
      q.h(var1, "context");
      q.h(var2, "containerId");
      q.h(var3, "onTapLink");
      q.h(var4, "onLongTapLink");
      q.h(var5, "linkStyle");
      q.h(var6, "onTapChannel");
      q.h(var7, "onLongPressChannel");
      q.h(var8, "onTapAttachmentLink");
      q.h(var9, "onLongPressAttachmentLink");
      q.h(var10, "onTapMention");
      q.h(var11, "onTapCommand");
      q.h(var12, "onLongPressCommand");
      q.h(var13, "onTapSpoiler");
      q.h(var14, "onTapTimestamp");
      q.h(var15, "onTapEmoji");
      q.h(var21, "paint");
      q.h(var22, "spoilerState");
      q.h(var26, "insets");
      q.h(var27, "theme");
      return new RenderContext(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RenderContext) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.context, var1.context)) {
            return false;
         } else if (!q.c(this.containerId, var1.containerId)) {
            return false;
         } else if (!q.c(this.onTapLink, var1.onTapLink)) {
            return false;
         } else if (!q.c(this.onLongTapLink, var1.onLongTapLink)) {
            return false;
         } else if (!q.c(this.linkStyle, var1.linkStyle)) {
            return false;
         } else if (!q.c(this.onTapChannel, var1.onTapChannel)) {
            return false;
         } else if (!q.c(this.onLongPressChannel, var1.onLongPressChannel)) {
            return false;
         } else if (!q.c(this.onTapAttachmentLink, var1.onTapAttachmentLink)) {
            return false;
         } else if (!q.c(this.onLongPressAttachmentLink, var1.onLongPressAttachmentLink)) {
            return false;
         } else if (!q.c(this.onTapMention, var1.onTapMention)) {
            return false;
         } else if (!q.c(this.onTapCommand, var1.onTapCommand)) {
            return false;
         } else if (!q.c(this.onLongPressCommand, var1.onLongPressCommand)) {
            return false;
         } else if (!q.c(this.onTapSpoiler, var1.onTapSpoiler)) {
            return false;
         } else if (!q.c(this.onTapTimestamp, var1.onTapTimestamp)) {
            return false;
         } else if (!q.c(this.onTapEmoji, var1.onTapEmoji)) {
            return false;
         } else if (this.animateEmoji != var1.animateEmoji) {
            return false;
         } else if (this.showLinkDecorations != var1.showLinkDecorations) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else if (this.shouldShowRoleOnName != var1.shouldShowRoleOnName) {
            return false;
         } else if (this.singleLine != var1.singleLine) {
            return false;
         } else if (!q.c(this.paint, var1.paint)) {
            return false;
         } else if (this.spoilerState != var1.spoilerState) {
            return false;
         } else if (this.listNestedLevel != var1.listNestedLevel) {
            return false;
         } else if (!q.c(this.listOrderedIndex, var1.listOrderedIndex)) {
            return false;
         } else if (!q.c(this.listLargestOrderedIndex, var1.listLargestOrderedIndex)) {
            return false;
         } else if (!q.c(this.insets, var1.insets)) {
            return false;
         } else if (!q.c(this.theme, var1.theme)) {
            return false;
         } else if (java.lang.Float.compare(this.baselineHeightPx, var1.baselineHeightPx) != 0) {
            return false;
         } else {
            return q.c(this.emojiBaselineHeightOverridePx, var1.emojiBaselineHeightOverridePx);
         }
      }
   }

   public override fun hashCode(): Int {
      val var12: Int = this.context.hashCode();
      val var22: Int = this.containerId.hashCode();
      val var13: Int = this.onTapLink.hashCode();
      val var9: Int = this.onLongTapLink.hashCode();
      val var23: Int = this.linkStyle.hashCode();
      val var25: Int = this.onTapChannel.hashCode();
      val var4: Int = this.onLongPressChannel.hashCode();
      val var14: Int = this.onTapAttachmentLink.hashCode();
      val var20: Int = this.onLongPressAttachmentLink.hashCode();
      val var10: Int = this.onTapMention.hashCode();
      val var7: Int = this.onTapCommand.hashCode();
      val var11: Int = this.onLongPressCommand.hashCode();
      val var8: Int = this.onTapSpoiler.hashCode();
      val var6: Int = this.onTapTimestamp.hashCode();
      val var21: Int = this.onTapEmoji.hashCode();
      val var18: Int = java.lang.Boolean.hashCode(this.animateEmoji);
      val var24: Int = java.lang.Boolean.hashCode(this.showLinkDecorations);
      val var15: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var16: Int = java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
      val var5: Int = java.lang.Boolean.hashCode(this.singleLine);
      val var17: Int = this.paint.hashCode();
      val var19: Int = this.spoilerState.hashCode();
      val var26: Int = Integer.hashCode(this.listNestedLevel);
      var var3: Int = 0;
      val var1: Int;
      if (this.listOrderedIndex == null) {
         var1 = 0;
      } else {
         var1 = this.listOrderedIndex.hashCode();
      }

      val var2: Int;
      if (this.listLargestOrderedIndex == null) {
         var2 = 0;
      } else {
         var2 = this.listLargestOrderedIndex.hashCode();
      }

      val var27: Int = this.insets.hashCode();
      val var29: Int = this.theme.hashCode();
      val var28: Int = java.lang.Float.hashCode(this.baselineHeightPx);
      if (this.emojiBaselineHeightOverridePx != null) {
         var3 = this.emojiBaselineHeightOverridePx.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        (
                                                                                                                                                                                 (
                                                                                                                                                                                          (
                                                                                                                                                                                                   (
                                                                                                                                                                                                            (
                                                                                                                                                                                                                     (
                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                         var12
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var22
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var13
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var9
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var23
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + var25
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + var4
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var14
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var20
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var10
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var7
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var11
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var8
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var6
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var21
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var18
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var24
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var15
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var16
                                                                                             )
                                                                                             * 31
                                                                                          + var5
                                                                                    )
                                                                                    * 31
                                                                                 + var17
                                                                           )
                                                                           * 31
                                                                        + var19
                                                                  )
                                                                  * 31
                                                               + var26
                                                         )
                                                         * 31
                                                      + var1
                                                )
                                                * 31
                                             + var2
                                       )
                                       * 31
                                    + var27
                              )
                              * 31
                           + var29
                     )
                     * 31
                  + var28
            )
            * 31
         + var3;
   }

   public fun spoilerExists(): Boolean {
      val var1: Boolean;
      if (this.spoilerState != RenderContext.SpoilerState.None) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun spoilerIsHidden(): Boolean {
      val var1: Boolean;
      if (this.spoilerState === RenderContext.SpoilerState.Hidden) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun spoilerIsRevealed(): Boolean {
      val var1: Boolean;
      if (this.spoilerState === RenderContext.SpoilerState.Revealed) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public override fun toString(): String {
      val var20: Context = this.context;
      val var12: java.lang.String = this.containerId;
      val var30: Function1 = this.onTapLink;
      val var22: Function1 = this.onLongTapLink;
      val var8: Function1 = this.linkStyle;
      val var26: Function3 = this.onTapChannel;
      val var14: Function4 = this.onLongPressChannel;
      val var18: Function1 = this.onTapAttachmentLink;
      val var15: Function2 = this.onLongPressAttachmentLink;
      val var16: Function4 = this.onTapMention;
      val var27: Function1 = this.onTapCommand;
      val var24: Function1 = this.onLongPressCommand;
      val var29: Function0 = this.onTapSpoiler;
      val var28: Function1 = this.onTapTimestamp;
      val var17: Function1 = this.onTapEmoji;
      val var6: Boolean = this.animateEmoji;
      val var5: Boolean = this.showLinkDecorations;
      val var7: Boolean = this.shouldShowRoleDot;
      val var4: Boolean = this.shouldShowRoleOnName;
      val var3: Boolean = this.singleLine;
      val var11: Paint = this.paint;
      val var23: RenderContext.SpoilerState = this.spoilerState;
      val var2: Int = this.listNestedLevel;
      val var9: java.lang.Long = this.listOrderedIndex;
      val var19: java.lang.Long = this.listLargestOrderedIndex;
      val var13: RenderContext.Insets = this.insets;
      val var21: DiscordThemeObject = this.theme;
      val var1: Float = this.baselineHeightPx;
      val var10: java.lang.Float = this.emojiBaselineHeightOverridePx;
      val var25: StringBuilder = new StringBuilder();
      var25.append("RenderContext(context=");
      var25.append(var20);
      var25.append(", containerId=");
      var25.append(var12);
      var25.append(", onTapLink=");
      var25.append(var30);
      var25.append(", onLongTapLink=");
      var25.append(var22);
      var25.append(", linkStyle=");
      var25.append(var8);
      var25.append(", onTapChannel=");
      var25.append(var26);
      var25.append(", onLongPressChannel=");
      var25.append(var14);
      var25.append(", onTapAttachmentLink=");
      var25.append(var18);
      var25.append(", onLongPressAttachmentLink=");
      var25.append(var15);
      var25.append(", onTapMention=");
      var25.append(var16);
      var25.append(", onTapCommand=");
      var25.append(var27);
      var25.append(", onLongPressCommand=");
      var25.append(var24);
      var25.append(", onTapSpoiler=");
      var25.append(var29);
      var25.append(", onTapTimestamp=");
      var25.append(var28);
      var25.append(", onTapEmoji=");
      var25.append(var17);
      var25.append(", animateEmoji=");
      var25.append(var6);
      var25.append(", showLinkDecorations=");
      var25.append(var5);
      var25.append(", shouldShowRoleDot=");
      var25.append(var7);
      var25.append(", shouldShowRoleOnName=");
      var25.append(var4);
      var25.append(", singleLine=");
      var25.append(var3);
      var25.append(", paint=");
      var25.append(var11);
      var25.append(", spoilerState=");
      var25.append(var23);
      var25.append(", listNestedLevel=");
      var25.append(var2);
      var25.append(", listOrderedIndex=");
      var25.append(var9);
      var25.append(", listLargestOrderedIndex=");
      var25.append(var19);
      var25.append(", insets=");
      var25.append(var13);
      var25.append(", theme=");
      var25.append(var21);
      var25.append(", baselineHeightPx=");
      var25.append(var1);
      var25.append(", emojiBaselineHeightOverridePx=");
      var25.append(var10);
      var25.append(")");
      return var25.toString();
   }

   public fun updateInsets(
      update: (com.discord.chat.presentation.textutils.RenderContext.Insets) -> com.discord.chat.presentation.textutils.RenderContext.Insets
   ): RenderContext {
      q.h(var1, "update");
      return copy$default(
         this,
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
         false,
         false,
         false,
         false,
         false,
         null,
         null,
         0,
         null,
         null,
         var1.invoke(this.insets) as RenderContext.Insets,
         null,
         0.0F,
         null,
         503316479,
         null
      );
   }

   public data class Insets(top: Int = 0, bottom: Int = 0, start: Int = 0, end: Int = 0) {
      public final val bottom: Int
      public final val end: Int
      public final val start: Int
      public final val top: Int

      fun Insets() {
         this(0, 0, 0, 0, 15, null);
      }

      init {
         this.top = var1;
         this.bottom = var2;
         this.start = var3;
         this.end = var4;
      }

      public operator fun component1(): Int {
         return this.top;
      }

      public operator fun component2(): Int {
         return this.bottom;
      }

      public operator fun component3(): Int {
         return this.start;
      }

      public operator fun component4(): Int {
         return this.end;
      }

      public fun copy(top: Int = var0.top, bottom: Int = var0.bottom, start: Int = var0.start, end: Int = var0.end): com.discord.chat.presentation.textutils.RenderContext.Insets {
         return new RenderContext.Insets(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is RenderContext.Insets) {
            return false;
         } else {
            var1 = var1;
            if (this.top != var1.top) {
               return false;
            } else if (this.bottom != var1.bottom) {
               return false;
            } else if (this.start != var1.start) {
               return false;
            } else {
               return this.end == var1.end;
            }
         }
      }

      public override fun hashCode(): Int {
         return ((Integer.hashCode(this.top) * 31 + Integer.hashCode(this.bottom)) * 31 + Integer.hashCode(this.start)) * 31 + Integer.hashCode(this.end);
      }

      public override fun toString(): String {
         val var1: Int = this.top;
         val var3: Int = this.bottom;
         val var2: Int = this.start;
         val var4: Int = this.end;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Insets(top=");
         var5.append(var1);
         var5.append(", bottom=");
         var5.append(var3);
         var5.append(", start=");
         var5.append(var2);
         var5.append(", end=");
         var5.append(var4);
         var5.append(")");
         return var5.toString();
      }
   }

   public enum class SpoilerState {
      Hidden,
      None,
      Revealed      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private RenderContext.SpoilerState[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<RenderContext.SpoilerState> = $values();
         $VALUES = var0;
         $ENTRIES = rh.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
