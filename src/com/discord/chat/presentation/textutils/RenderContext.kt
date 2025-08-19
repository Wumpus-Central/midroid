package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Paint
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.theme.DiscordThemeObject
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

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
   onTapInlineCode: (InlineCodeContentNode) -> Unit,
   onTapEmoji: (EmojiContentNode) -> Unit,
   onTapSoundmoji: (SoundmojiContentNode) -> Unit = ...,
   animateEmoji: Boolean,
   showLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean,
   singleLine: Boolean,
   paint: Paint,
   spoilerState: com.discord.chat.presentation.textutils.RenderContext.SpoilerState = ...,
   listNestedLevel: Int = ...,
   listOrderedIndex: Long? = ...,
   listLargestOrderedIndex: Long? = ...,
   inLink: Boolean = ...,
   insets: com.discord.chat.presentation.textutils.RenderContext.Insets = ...,
   theme: DiscordThemeObject,
   baselineHeightPx: Float = ...,
   emojiBaselineHeightOverridePx: Float? = ...
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
   public final val onTapInlineCode: (InlineCodeContentNode) -> Unit
   public final val onTapEmoji: (EmojiContentNode) -> Unit
   public final val onTapSoundmoji: (SoundmojiContentNode) -> Unit
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
   public final val inLink: Boolean
   public final val insets: com.discord.chat.presentation.textutils.RenderContext.Insets
   public final val theme: DiscordThemeObject
   public final val baselineHeightPx: Float
   public final val emojiBaselineHeightOverridePx: Float?

   init {
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
      this.onTapInlineCode = var15;
      this.onTapEmoji = var16;
      this.onTapSoundmoji = var17;
      this.animateEmoji = var18;
      this.showLinkDecorations = var19;
      this.shouldShowRoleDot = var20;
      this.shouldShowRoleOnName = var21;
      this.singleLine = var22;
      this.paint = var23;
      this.spoilerState = var24;
      this.listNestedLevel = var25;
      this.listOrderedIndex = var26;
      this.listLargestOrderedIndex = var27;
      this.inLink = var28;
      this.insets = var29;
      this.theme = var30;
      this.baselineHeightPx = var31;
      this.emojiBaselineHeightOverridePx = var32;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: SoundmojiContentNode): Unit {
      return Unit.a;
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

   public operator fun component15(): (InlineCodeContentNode) -> Unit {
      return this.onTapInlineCode;
   }

   public operator fun component16(): (EmojiContentNode) -> Unit {
      return this.onTapEmoji;
   }

   public operator fun component17(): (SoundmojiContentNode) -> Unit {
      return this.onTapSoundmoji;
   }

   public operator fun component18(): Boolean {
      return this.animateEmoji;
   }

   public operator fun component19(): Boolean {
      return this.showLinkDecorations;
   }

   public operator fun component2(): String {
      return this.containerId;
   }

   public operator fun component20(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component21(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public operator fun component22(): Boolean {
      return this.singleLine;
   }

   public operator fun component23(): Paint {
      return this.paint;
   }

   public operator fun component24(): com.discord.chat.presentation.textutils.RenderContext.SpoilerState {
      return this.spoilerState;
   }

   public operator fun component25(): Int {
      return this.listNestedLevel;
   }

   public operator fun component26(): Long? {
      return this.listOrderedIndex;
   }

   public operator fun component27(): Long? {
      return this.listLargestOrderedIndex;
   }

   public operator fun component28(): Boolean {
      return this.inLink;
   }

   public operator fun component29(): com.discord.chat.presentation.textutils.RenderContext.Insets {
      return this.insets;
   }

   public operator fun component3(): (LinkContentNode) -> Unit {
      return this.onTapLink;
   }

   public operator fun component30(): DiscordThemeObject {
      return this.theme;
   }

   public operator fun component31(): Float {
      return this.baselineHeightPx;
   }

   public operator fun component32(): Float? {
      return this.emojiBaselineHeightOverridePx;
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
      context: Context = ...,
      containerId: String = ...,
      onTapLink: (LinkContentNode) -> Unit = ...,
      onLongTapLink: (LinkContentNode) -> Unit = ...,
      linkStyle: (LinkContentNode) -> LinkStyle = ...,
      onTapChannel: (String, String?, String?) -> Unit = ...,
      onLongPressChannel: (String, String?, String?, String?) -> Unit = ...,
      onTapAttachmentLink: (String) -> Unit = ...,
      onLongPressAttachmentLink: (String, String) -> Unit = ...,
      onTapMention: (String?, String, String?, String?) -> Unit = ...,
      onTapCommand: (CommandMentionContentNode) -> Unit = ...,
      onLongPressCommand: (CommandMentionContentNode) -> Unit = ...,
      onTapSpoiler: () -> Unit = ...,
      onTapTimestamp: (String) -> Unit = ...,
      onTapInlineCode: (InlineCodeContentNode) -> Unit = ...,
      onTapEmoji: (EmojiContentNode) -> Unit = ...,
      onTapSoundmoji: (SoundmojiContentNode) -> Unit = ...,
      animateEmoji: Boolean = ...,
      showLinkDecorations: Boolean = ...,
      shouldShowRoleDot: Boolean = ...,
      shouldShowRoleOnName: Boolean = ...,
      singleLine: Boolean = ...,
      paint: Paint = ...,
      spoilerState: com.discord.chat.presentation.textutils.RenderContext.SpoilerState = ...,
      listNestedLevel: Int = ...,
      listOrderedIndex: Long? = ...,
      listLargestOrderedIndex: Long? = ...,
      inLink: Boolean = ...,
      insets: com.discord.chat.presentation.textutils.RenderContext.Insets = ...,
      theme: DiscordThemeObject = ...,
      baselineHeightPx: Float = ...,
      emojiBaselineHeightOverridePx: Float? = ...
   ): RenderContext {
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
         var29,
         var30,
         var31,
         var32
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RenderContext) {
         return false;
      } else {
         var1 = var1;
         if (!(this.context == var1.context)) {
            return false;
         } else if (!(this.containerId == var1.containerId)) {
            return false;
         } else if (!(this.onTapLink == var1.onTapLink)) {
            return false;
         } else if (!(this.onLongTapLink == var1.onLongTapLink)) {
            return false;
         } else if (!(this.linkStyle == var1.linkStyle)) {
            return false;
         } else if (!(this.onTapChannel == var1.onTapChannel)) {
            return false;
         } else if (!(this.onLongPressChannel == var1.onLongPressChannel)) {
            return false;
         } else if (!(this.onTapAttachmentLink == var1.onTapAttachmentLink)) {
            return false;
         } else if (!(this.onLongPressAttachmentLink == var1.onLongPressAttachmentLink)) {
            return false;
         } else if (!(this.onTapMention == var1.onTapMention)) {
            return false;
         } else if (!(this.onTapCommand == var1.onTapCommand)) {
            return false;
         } else if (!(this.onLongPressCommand == var1.onLongPressCommand)) {
            return false;
         } else if (!(this.onTapSpoiler == var1.onTapSpoiler)) {
            return false;
         } else if (!(this.onTapTimestamp == var1.onTapTimestamp)) {
            return false;
         } else if (!(this.onTapInlineCode == var1.onTapInlineCode)) {
            return false;
         } else if (!(this.onTapEmoji == var1.onTapEmoji)) {
            return false;
         } else if (!(this.onTapSoundmoji == var1.onTapSoundmoji)) {
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
         } else if (!(this.paint == var1.paint)) {
            return false;
         } else if (this.spoilerState != var1.spoilerState) {
            return false;
         } else if (this.listNestedLevel != var1.listNestedLevel) {
            return false;
         } else if (!(this.listOrderedIndex == var1.listOrderedIndex)) {
            return false;
         } else if (!(this.listLargestOrderedIndex == var1.listLargestOrderedIndex)) {
            return false;
         } else if (this.inLink != var1.inLink) {
            return false;
         } else if (!(this.insets == var1.insets)) {
            return false;
         } else if (!(this.theme == var1.theme)) {
            return false;
         } else if (java.lang.Float.compare(this.baselineHeightPx, var1.baselineHeightPx) != 0) {
            return false;
         } else {
            return this.emojiBaselineHeightOverridePx == var1.emojiBaselineHeightOverridePx;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.context.hashCode();
      val var24: Int = this.containerId.hashCode();
      val var8: Int = this.onTapLink.hashCode();
      val var4: Int = this.onLongTapLink.hashCode();
      val var12: Int = this.linkStyle.hashCode();
      val var22: Int = this.onTapChannel.hashCode();
      val var10: Int = this.onLongPressChannel.hashCode();
      val var28: Int = this.onTapAttachmentLink.hashCode();
      val var6: Int = this.onLongPressAttachmentLink.hashCode();
      val var18: Int = this.onTapMention.hashCode();
      val var7: Int = this.onTapCommand.hashCode();
      val var11: Int = this.onLongPressCommand.hashCode();
      val var14: Int = this.onTapSpoiler.hashCode();
      val var21: Int = this.onTapTimestamp.hashCode();
      val var19: Int = this.onTapInlineCode.hashCode();
      val var23: Int = this.onTapEmoji.hashCode();
      val var13: Int = this.onTapSoundmoji.hashCode();
      val var15: Int = java.lang.Boolean.hashCode(this.animateEmoji);
      val var20: Int = java.lang.Boolean.hashCode(this.showLinkDecorations);
      val var9: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var26: Int = java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
      val var17: Int = java.lang.Boolean.hashCode(this.singleLine);
      val var25: Int = this.paint.hashCode();
      val var16: Int = this.spoilerState.hashCode();
      val var27: Int = Integer.hashCode(this.listNestedLevel);
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

      val var29: Int = java.lang.Boolean.hashCode(this.inLink);
      val var30: Int = this.insets.hashCode();
      val var31: Int = this.theme.hashCode();
      val var32: Int = java.lang.Float.hashCode(this.baselineHeightPx);
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
                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                    var5
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var24
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var8
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var4
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var12
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var22
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var10
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var28
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + var6
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + var18
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var7
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var11
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var14
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var21
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var19
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var23
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var13
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var15
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var20
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var9
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var26
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var17
                                                                                             )
                                                                                             * 31
                                                                                          + var25
                                                                                    )
                                                                                    * 31
                                                                                 + var16
                                                                           )
                                                                           * 31
                                                                        + var27
                                                                  )
                                                                  * 31
                                                               + var1
                                                         )
                                                         * 31
                                                      + var2
                                                )
                                                * 31
                                             + var29
                                       )
                                       * 31
                                    + var30
                              )
                              * 31
                           + var31
                     )
                     * 31
                  + var32
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
      val var16: Context = this.context;
      val var31: java.lang.String = this.containerId;
      val var29: Function1 = this.onTapLink;
      val var25: Function1 = this.onLongTapLink;
      val var24: Function1 = this.linkStyle;
      val var18: Function3 = this.onTapChannel;
      val var23: Function4 = this.onLongPressChannel;
      val var12: Function1 = this.onTapAttachmentLink;
      val var33: Function2 = this.onLongPressAttachmentLink;
      val var26: Function4 = this.onTapMention;
      val var19: Function1 = this.onTapCommand;
      val var9: Function1 = this.onLongPressCommand;
      val var30: Function0 = this.onTapSpoiler;
      val var17: Function1 = this.onTapTimestamp;
      val var10: Function1 = this.onTapInlineCode;
      val var14: Function1 = this.onTapEmoji;
      val var22: Function1 = this.onTapSoundmoji;
      val var8: Boolean = this.animateEmoji;
      val var3: Boolean = this.showLinkDecorations;
      val var7: Boolean = this.shouldShowRoleDot;
      val var5: Boolean = this.shouldShowRoleOnName;
      val var4: Boolean = this.singleLine;
      val var27: Paint = this.paint;
      val var20: RenderContext.SpoilerState = this.spoilerState;
      val var2: Int = this.listNestedLevel;
      val var21: java.lang.Long = this.listOrderedIndex;
      val var15: java.lang.Long = this.listLargestOrderedIndex;
      val var6: Boolean = this.inLink;
      val var32: RenderContext.Insets = this.insets;
      val var11: DiscordThemeObject = this.theme;
      val var1: Float = this.baselineHeightPx;
      val var28: java.lang.Float = this.emojiBaselineHeightOverridePx;
      val var13: StringBuilder = new StringBuilder();
      var13.append("RenderContext(context=");
      var13.append(var16);
      var13.append(", containerId=");
      var13.append(var31);
      var13.append(", onTapLink=");
      var13.append(var29);
      var13.append(", onLongTapLink=");
      var13.append(var25);
      var13.append(", linkStyle=");
      var13.append(var24);
      var13.append(", onTapChannel=");
      var13.append(var18);
      var13.append(", onLongPressChannel=");
      var13.append(var23);
      var13.append(", onTapAttachmentLink=");
      var13.append(var12);
      var13.append(", onLongPressAttachmentLink=");
      var13.append(var33);
      var13.append(", onTapMention=");
      var13.append(var26);
      var13.append(", onTapCommand=");
      var13.append(var19);
      var13.append(", onLongPressCommand=");
      var13.append(var9);
      var13.append(", onTapSpoiler=");
      var13.append(var30);
      var13.append(", onTapTimestamp=");
      var13.append(var17);
      var13.append(", onTapInlineCode=");
      var13.append(var10);
      var13.append(", onTapEmoji=");
      var13.append(var14);
      var13.append(", onTapSoundmoji=");
      var13.append(var22);
      var13.append(", animateEmoji=");
      var13.append(var8);
      var13.append(", showLinkDecorations=");
      var13.append(var3);
      var13.append(", shouldShowRoleDot=");
      var13.append(var7);
      var13.append(", shouldShowRoleOnName=");
      var13.append(var5);
      var13.append(", singleLine=");
      var13.append(var4);
      var13.append(", paint=");
      var13.append(var27);
      var13.append(", spoilerState=");
      var13.append(var20);
      var13.append(", listNestedLevel=");
      var13.append(var2);
      var13.append(", listOrderedIndex=");
      var13.append(var21);
      var13.append(", listLargestOrderedIndex=");
      var13.append(var15);
      var13.append(", inLink=");
      var13.append(var6);
      var13.append(", insets=");
      var13.append(var32);
      var13.append(", theme=");
      var13.append(var11);
      var13.append(", baselineHeightPx=");
      var13.append(var1);
      var13.append(", emojiBaselineHeightOverridePx=");
      var13.append(var28);
      var13.append(")");
      return var13.toString();
   }

   public fun updateInsets(
      update: (com.discord.chat.presentation.textutils.RenderContext.Insets) -> com.discord.chat.presentation.textutils.RenderContext.Insets
   ): RenderContext {
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
         false,
         var1.invoke(this.insets) as RenderContext.Insets,
         null,
         0.0F,
         null,
         -268435457,
         null
      );
   }

   public data class Insets(top: Int = 0, bottom: Int = 0, start: Int = 0, end: Int = 0) {
      public final val top: Int
      public final val bottom: Int
      public final val start: Int
      public final val end: Int

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
         val var3: Int = this.top;
         val var2: Int = this.bottom;
         val var4: Int = this.start;
         val var1: Int = this.end;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Insets(top=");
         var5.append(var3);
         var5.append(", bottom=");
         var5.append(var2);
         var5.append(", start=");
         var5.append(var4);
         var5.append(", end=");
         var5.append(var1);
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
         $ENTRIES = H9.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
