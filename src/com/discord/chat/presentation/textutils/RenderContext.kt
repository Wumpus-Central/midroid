package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Paint
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.theme.DiscordThemeObject
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.r

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
      r.h(var1, "context");
      r.h(var2, "containerId");
      r.h(var3, "onTapLink");
      r.h(var4, "onLongTapLink");
      r.h(var5, "linkStyle");
      r.h(var6, "onTapChannel");
      r.h(var7, "onLongPressChannel");
      r.h(var8, "onTapAttachmentLink");
      r.h(var9, "onLongPressAttachmentLink");
      r.h(var10, "onTapMention");
      r.h(var11, "onTapCommand");
      r.h(var12, "onLongPressCommand");
      r.h(var13, "onTapSpoiler");
      r.h(var14, "onTapTimestamp");
      r.h(var15, "onTapEmoji");
      r.h(var21, "paint");
      r.h(var22, "spoilerState");
      r.h(var26, "insets");
      r.h(var27, "theme");
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
      r.h(var1, "context");
      r.h(var2, "containerId");
      r.h(var3, "onTapLink");
      r.h(var4, "onLongTapLink");
      r.h(var5, "linkStyle");
      r.h(var6, "onTapChannel");
      r.h(var7, "onLongPressChannel");
      r.h(var8, "onTapAttachmentLink");
      r.h(var9, "onLongPressAttachmentLink");
      r.h(var10, "onTapMention");
      r.h(var11, "onTapCommand");
      r.h(var12, "onLongPressCommand");
      r.h(var13, "onTapSpoiler");
      r.h(var14, "onTapTimestamp");
      r.h(var15, "onTapEmoji");
      r.h(var21, "paint");
      r.h(var22, "spoilerState");
      r.h(var26, "insets");
      r.h(var27, "theme");
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
         if (!r.c(this.context, var1.context)) {
            return false;
         } else if (!r.c(this.containerId, var1.containerId)) {
            return false;
         } else if (!r.c(this.onTapLink, var1.onTapLink)) {
            return false;
         } else if (!r.c(this.onLongTapLink, var1.onLongTapLink)) {
            return false;
         } else if (!r.c(this.linkStyle, var1.linkStyle)) {
            return false;
         } else if (!r.c(this.onTapChannel, var1.onTapChannel)) {
            return false;
         } else if (!r.c(this.onLongPressChannel, var1.onLongPressChannel)) {
            return false;
         } else if (!r.c(this.onTapAttachmentLink, var1.onTapAttachmentLink)) {
            return false;
         } else if (!r.c(this.onLongPressAttachmentLink, var1.onLongPressAttachmentLink)) {
            return false;
         } else if (!r.c(this.onTapMention, var1.onTapMention)) {
            return false;
         } else if (!r.c(this.onTapCommand, var1.onTapCommand)) {
            return false;
         } else if (!r.c(this.onLongPressCommand, var1.onLongPressCommand)) {
            return false;
         } else if (!r.c(this.onTapSpoiler, var1.onTapSpoiler)) {
            return false;
         } else if (!r.c(this.onTapTimestamp, var1.onTapTimestamp)) {
            return false;
         } else if (!r.c(this.onTapEmoji, var1.onTapEmoji)) {
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
         } else if (!r.c(this.paint, var1.paint)) {
            return false;
         } else if (this.spoilerState != var1.spoilerState) {
            return false;
         } else if (this.listNestedLevel != var1.listNestedLevel) {
            return false;
         } else if (!r.c(this.listOrderedIndex, var1.listOrderedIndex)) {
            return false;
         } else if (!r.c(this.listLargestOrderedIndex, var1.listLargestOrderedIndex)) {
            return false;
         } else if (!r.c(this.insets, var1.insets)) {
            return false;
         } else if (!r.c(this.theme, var1.theme)) {
            return false;
         } else if (java.lang.Float.compare(this.baselineHeightPx, var1.baselineHeightPx) != 0) {
            return false;
         } else {
            return r.c(this.emojiBaselineHeightOverridePx, var1.emojiBaselineHeightOverridePx);
         }
      }
   }

   public override fun hashCode(): Int {
      val var16: Int = this.context.hashCode();
      val var19: Int = this.containerId.hashCode();
      val var11: Int = this.onTapLink.hashCode();
      val var23: Int = this.onLongTapLink.hashCode();
      val var9: Int = this.linkStyle.hashCode();
      val var10: Int = this.onTapChannel.hashCode();
      val var14: Int = this.onLongPressChannel.hashCode();
      val var21: Int = this.onTapAttachmentLink.hashCode();
      val var15: Int = this.onLongPressAttachmentLink.hashCode();
      val var20: Int = this.onTapMention.hashCode();
      val var12: Int = this.onTapCommand.hashCode();
      val var13: Int = this.onLongPressCommand.hashCode();
      val var22: Int = this.onTapSpoiler.hashCode();
      val var17: Int = this.onTapTimestamp.hashCode();
      val var18: Int = this.onTapEmoji.hashCode();
      var var5: Byte = 1;
      var var1: Byte = this.animateEmoji;
      if (this.animateEmoji != 0) {
         var1 = 1;
      }

      var var31: Byte = this.showLinkDecorations;
      if (this.showLinkDecorations != 0) {
         var31 = 1;
      }

      var var32: Byte = this.shouldShowRoleDot;
      if (this.shouldShowRoleDot != 0) {
         var32 = 1;
      }

      var var33: Byte = this.shouldShowRoleOnName;
      if (this.shouldShowRoleOnName != 0) {
         var33 = 1;
      }

      if (this.singleLine == 0) {
         var5 = this.singleLine;
      }

      val var24: Int = this.paint.hashCode();
      val var26: Int = this.spoilerState.hashCode();
      val var25: Int = Integer.hashCode(this.listNestedLevel);
      var var8: Int = 0;
      val var35: Int;
      if (this.listOrderedIndex == null) {
         var35 = 0;
      } else {
         var35 = this.listOrderedIndex.hashCode();
      }

      val var7: Int;
      if (this.listLargestOrderedIndex == null) {
         var7 = 0;
      } else {
         var7 = this.listLargestOrderedIndex.hashCode();
      }

      val var29: Int = this.insets.hashCode();
      val var28: Int = this.theme.hashCode();
      val var27: Int = java.lang.Float.hashCode(this.baselineHeightPx);
      if (this.emojiBaselineHeightOverridePx != null) {
         var8 = this.emojiBaselineHeightOverridePx.hashCode();
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
                                                                                                                                                                                                                                                         var16
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var19
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var11
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var23
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var9
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + var10
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + var14
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var21
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var15
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var20
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var12
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var13
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var22
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var17
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var18
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var1
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var31
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var32
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var33
                                                                                             )
                                                                                             * 31
                                                                                          + var5
                                                                                    )
                                                                                    * 31
                                                                                 + var24
                                                                           )
                                                                           * 31
                                                                        + var26
                                                                  )
                                                                  * 31
                                                               + var25
                                                         )
                                                         * 31
                                                      + var35
                                                )
                                                * 31
                                             + var7
                                       )
                                       * 31
                                    + var29
                              )
                              * 31
                           + var28
                     )
                     * 31
                  + var27
            )
            * 31
         + var8;
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
      val var17: Context = this.context;
      val var14: java.lang.String = this.containerId;
      val var15: Function1 = this.onTapLink;
      val var20: Function1 = this.onLongTapLink;
      val var8: Function1 = this.linkStyle;
      val var24: Function3 = this.onTapChannel;
      val var16: Function4 = this.onLongPressChannel;
      val var27: Function1 = this.onTapAttachmentLink;
      val var29: Function2 = this.onLongPressAttachmentLink;
      val var21: Function4 = this.onTapMention;
      val var28: Function1 = this.onTapCommand;
      val var9: Function1 = this.onLongPressCommand;
      val var11: Function0 = this.onTapSpoiler;
      val var22: Function1 = this.onTapTimestamp;
      val var25: Function1 = this.onTapEmoji;
      val var4: Boolean = this.animateEmoji;
      val var5: Boolean = this.showLinkDecorations;
      val var7: Boolean = this.shouldShowRoleDot;
      val var3: Boolean = this.shouldShowRoleOnName;
      val var6: Boolean = this.singleLine;
      val var10: Paint = this.paint;
      val var19: RenderContext.SpoilerState = this.spoilerState;
      val var2: Int = this.listNestedLevel;
      val var18: java.lang.Long = this.listOrderedIndex;
      val var12: java.lang.Long = this.listLargestOrderedIndex;
      val var30: RenderContext.Insets = this.insets;
      val var13: DiscordThemeObject = this.theme;
      val var1: Float = this.baselineHeightPx;
      val var23: java.lang.Float = this.emojiBaselineHeightOverridePx;
      val var26: StringBuilder = new StringBuilder();
      var26.append("RenderContext(context=");
      var26.append(var17);
      var26.append(", containerId=");
      var26.append(var14);
      var26.append(", onTapLink=");
      var26.append(var15);
      var26.append(", onLongTapLink=");
      var26.append(var20);
      var26.append(", linkStyle=");
      var26.append(var8);
      var26.append(", onTapChannel=");
      var26.append(var24);
      var26.append(", onLongPressChannel=");
      var26.append(var16);
      var26.append(", onTapAttachmentLink=");
      var26.append(var27);
      var26.append(", onLongPressAttachmentLink=");
      var26.append(var29);
      var26.append(", onTapMention=");
      var26.append(var21);
      var26.append(", onTapCommand=");
      var26.append(var28);
      var26.append(", onLongPressCommand=");
      var26.append(var9);
      var26.append(", onTapSpoiler=");
      var26.append(var11);
      var26.append(", onTapTimestamp=");
      var26.append(var22);
      var26.append(", onTapEmoji=");
      var26.append(var25);
      var26.append(", animateEmoji=");
      var26.append(var4);
      var26.append(", showLinkDecorations=");
      var26.append(var5);
      var26.append(", shouldShowRoleDot=");
      var26.append(var7);
      var26.append(", shouldShowRoleOnName=");
      var26.append(var3);
      var26.append(", singleLine=");
      var26.append(var6);
      var26.append(", paint=");
      var26.append(var10);
      var26.append(", spoilerState=");
      var26.append(var19);
      var26.append(", listNestedLevel=");
      var26.append(var2);
      var26.append(", listOrderedIndex=");
      var26.append(var18);
      var26.append(", listLargestOrderedIndex=");
      var26.append(var12);
      var26.append(", insets=");
      var26.append(var30);
      var26.append(", theme=");
      var26.append(var13);
      var26.append(", baselineHeightPx=");
      var26.append(var1);
      var26.append(", emojiBaselineHeightOverridePx=");
      var26.append(var23);
      var26.append(")");
      return var26.toString();
   }

   public fun updateInsets(
      update: (com.discord.chat.presentation.textutils.RenderContext.Insets) -> com.discord.chat.presentation.textutils.RenderContext.Insets
   ): RenderContext {
      r.h(var1, "update");
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
         val var2: Int = this.top;
         val var1: Int = this.bottom;
         val var3: Int = this.start;
         val var4: Int = this.end;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Insets(top=");
         var5.append(var2);
         var5.append(", bottom=");
         var5.append(var1);
         var5.append(", start=");
         var5.append(var3);
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
      private RenderContext.SpoilerState[] $VALUES = $values();
   }
}
