package com.discord.chat.bridge.row

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.SwipeActionsType
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameSerializer
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import com.discord.chat.presentation.root.MessageContextType
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0

@f
public data class MessageRow(index: Int,
      changeType: ChangeType,
      jumped: Boolean? = null,
      highlightJumpedOnceOnly: Boolean? = null,
      message: MessageBase,
      scrollTo: Boolean? = null,
      animated: Boolean? = null,
      canAddNewReactions: Boolean? = null,
      addReactionLabel: String? = null,
      addNewReactionAccessibilityLabel: String? = null,
      addNewBurstReactionAccessibilityLabel: String? = null,
      reactionsTheme: ReactionsTheme? = null,
      isHighlight: Boolean = false,
      renderContentOnly: Boolean = false,
      messageFrame: MessageFrame? = null,
      reactTag: Int? = ...,
      truncation: Truncation? = ...,
      backgroundHighlight: BackgroundHighlight? = ...,
      swipeActions: SwipeActionsType = ...,
      contextType: MessageContextType? = null
   )
   : Row {
   public final val addNewBurstReactionAccessibilityLabel: String?
   public final val addNewReactionAccessibilityLabel: String?
   public final val addReactionLabel: String?
   public final val animated: Boolean?
   public final val backgroundHighlight: BackgroundHighlight?
   public final val canAddNewReactions: Boolean?
   public open val changeType: ChangeType
   public final val contextType: MessageContextType?
   public final val highlightJumpedOnceOnly: Boolean?
   public open val index: Int
   public final val isHighlight: Boolean
   public final val jumped: Boolean?

   @f(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   public final val messageFrame: MessageFrame?
   public final val reactTag: Int?
   public final val reactionsTheme: ReactionsTheme?
   public final val renderContentOnly: Boolean
   public final val scrollTo: Boolean?
   public final val swipeActions: SwipeActionsType
   public final val truncation: Truncation?

   init {
      r.h(var2, "changeType");
      r.h(var5, "message");
      r.h(var19, "swipeActions");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.jumped = var3;
      this.highlightJumpedOnceOnly = var4;
      this.message = var5;
      this.scrollTo = var6;
      this.animated = var7;
      this.canAddNewReactions = var8;
      this.addReactionLabel = var9;
      this.addNewReactionAccessibilityLabel = var10;
      this.addNewBurstReactionAccessibilityLabel = var11;
      this.reactionsTheme = var12;
      this.isHighlight = var13;
      this.renderContentOnly = var14;
      this.messageFrame = var15;
      this.reactTag = var16;
      this.truncation = var17;
      this.backgroundHighlight = var18;
      this.swipeActions = var19;
      this.contextType = var20;
   }

   @JvmStatic
   public fun `write$Self`(self: MessageRow, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getIndex());
      var1.y(var2, 1, ChangeType.Serializer.INSTANCE, var0.getChangeType());
      var var5: Boolean;
      if (!var1.A(var2, 2) && var0.jumped == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 2, h.a, var0.jumped);
      }

      if (!var1.A(var2, 3) && var0.highlightJumpedOnceOnly == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 3, h.a, var0.highlightJumpedOnceOnly);
      }

      var1.y(var2, 4, MessageSerializer.INSTANCE, var0.message);
      if (!var1.A(var2, 5) && var0.scrollTo == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 5, h.a, var0.scrollTo);
      }

      if (!var1.A(var2, 6) && var0.animated == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 6, h.a, var0.animated);
      }

      if (!var1.A(var2, 7) && var0.canAddNewReactions == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 7, h.a, var0.canAddNewReactions);
      }

      if (!var1.A(var2, 8) && var0.addReactionLabel == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 8, a2.a, var0.addReactionLabel);
      }

      if (!var1.A(var2, 9) && var0.addNewReactionAccessibilityLabel == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 9, a2.a, var0.addNewReactionAccessibilityLabel);
      }

      if (!var1.A(var2, 10) && var0.addNewBurstReactionAccessibilityLabel == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 10, a2.a, var0.addNewBurstReactionAccessibilityLabel);
      }

      if (!var1.A(var2, 11) && var0.reactionsTheme == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 11, ReactionsTheme.$serializer.INSTANCE, var0.reactionsTheme);
      }

      if (!var1.A(var2, 12) && !var0.isHighlight) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.x(var2, 12, var0.isHighlight);
      }

      if (!var1.A(var2, 13) && !var0.renderContentOnly) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.x(var2, 13, var0.renderContentOnly);
      }

      if (!var1.A(var2, 14) && var0.messageFrame == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 14, MessageFrameSerializer.INSTANCE, var0.messageFrame);
      }

      if (!var1.A(var2, 15) && var0.reactTag == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 15, m0.a, var0.reactTag);
      }

      if (!var1.A(var2, 16) && var0.truncation == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 16, Truncation.$serializer.INSTANCE, var0.truncation);
      }

      if (!var1.A(var2, 17) && var0.backgroundHighlight == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 17, BackgroundHighlight.$serializer.INSTANCE, var0.backgroundHighlight);
      }

      if (!var1.A(var2, 18) && var0.swipeActions === SwipeActionsType.NONE) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.y(var2, 18, SwipeActionsType.Serializer.INSTANCE, var0.swipeActions);
      }

      label144: {
         if (!var1.A(var2, 19)) {
            var5 = false;
            if (var0.contextType == null) {
               break label144;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 19, MessageContextType.Companion.serializer(), var0.contextType);
      }
   }

   public operator fun component1(): Int {
      return this.getIndex();
   }

   public operator fun component10(): String? {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component11(): String? {
      return this.addNewBurstReactionAccessibilityLabel;
   }

   public operator fun component12(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public operator fun component13(): Boolean {
      return this.isHighlight;
   }

   public operator fun component14(): Boolean {
      return this.renderContentOnly;
   }

   public operator fun component15(): MessageFrame? {
      return this.messageFrame;
   }

   public operator fun component16(): Int? {
      return this.reactTag;
   }

   public operator fun component17(): Truncation? {
      return this.truncation;
   }

   public operator fun component18(): BackgroundHighlight? {
      return this.backgroundHighlight;
   }

   public operator fun component19(): SwipeActionsType {
      return this.swipeActions;
   }

   public operator fun component2(): ChangeType {
      return this.getChangeType();
   }

   public operator fun component20(): MessageContextType? {
      return this.contextType;
   }

   public operator fun component3(): Boolean? {
      return this.jumped;
   }

   public operator fun component4(): Boolean? {
      return this.highlightJumpedOnceOnly;
   }

   public operator fun component5(): MessageBase {
      return this.message;
   }

   public operator fun component6(): Boolean? {
      return this.scrollTo;
   }

   public operator fun component7(): Boolean? {
      return this.animated;
   }

   public operator fun component8(): Boolean? {
      return this.canAddNewReactions;
   }

   public operator fun component9(): String? {
      return this.addReactionLabel;
   }

   public fun copy(
      index: Int = var0.getIndex(),
      changeType: ChangeType = var0.getChangeType(),
      jumped: Boolean? = var0.jumped,
      highlightJumpedOnceOnly: Boolean? = var0.highlightJumpedOnceOnly,
      message: MessageBase = var0.message,
      scrollTo: Boolean? = var0.scrollTo,
      animated: Boolean? = var0.animated,
      canAddNewReactions: Boolean? = var0.canAddNewReactions,
      addReactionLabel: String? = var0.addReactionLabel,
      addNewReactionAccessibilityLabel: String? = var0.addNewReactionAccessibilityLabel,
      addNewBurstReactionAccessibilityLabel: String? = var0.addNewBurstReactionAccessibilityLabel,
      reactionsTheme: ReactionsTheme? = var0.reactionsTheme,
      isHighlight: Boolean = var0.isHighlight,
      renderContentOnly: Boolean = var0.renderContentOnly,
      messageFrame: MessageFrame? = var0.messageFrame,
      reactTag: Int? = var0.reactTag,
      truncation: Truncation? = var0.truncation,
      backgroundHighlight: BackgroundHighlight? = var0.backgroundHighlight,
      swipeActions: SwipeActionsType = var0.swipeActions,
      contextType: MessageContextType? = var0.contextType
   ): MessageRow {
      r.h(var2, "changeType");
      r.h(var5, "message");
      r.h(var19, "swipeActions");
      return new MessageRow(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageRow) {
         return false;
      } else {
         var1 = var1;
         if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (this.getChangeType() != var1.getChangeType()) {
            return false;
         } else if (!r.c(this.jumped, var1.jumped)) {
            return false;
         } else if (!r.c(this.highlightJumpedOnceOnly, var1.highlightJumpedOnceOnly)) {
            return false;
         } else if (!r.c(this.message, var1.message)) {
            return false;
         } else if (!r.c(this.scrollTo, var1.scrollTo)) {
            return false;
         } else if (!r.c(this.animated, var1.animated)) {
            return false;
         } else if (!r.c(this.canAddNewReactions, var1.canAddNewReactions)) {
            return false;
         } else if (!r.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!r.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else if (this.isHighlight != var1.isHighlight) {
            return false;
         } else if (this.renderContentOnly != var1.renderContentOnly) {
            return false;
         } else if (!r.c(this.messageFrame, var1.messageFrame)) {
            return false;
         } else if (!r.c(this.reactTag, var1.reactTag)) {
            return false;
         } else if (!r.c(this.truncation, var1.truncation)) {
            return false;
         } else if (!r.c(this.backgroundHighlight, var1.backgroundHighlight)) {
            return false;
         } else if (this.swipeActions != var1.swipeActions) {
            return false;
         } else {
            return this.contextType === var1.contextType;
         }
      }
   }

   public override fun hashCode(): Int {
      val var17: Int = Integer.hashCode(this.getIndex());
      val var18: Int = this.getChangeType().hashCode();
      var var16: Int = 0;
      val var1: Int;
      if (this.jumped == null) {
         var1 = 0;
      } else {
         var1 = this.jumped.hashCode();
      }

      val var2: Int;
      if (this.highlightJumpedOnceOnly == null) {
         var2 = 0;
      } else {
         var2 = this.highlightJumpedOnceOnly.hashCode();
      }

      val var19: Int = this.message.hashCode();
      val var3: Int;
      if (this.scrollTo == null) {
         var3 = 0;
      } else {
         var3 = this.scrollTo.hashCode();
      }

      val var4: Int;
      if (this.animated == null) {
         var4 = 0;
      } else {
         var4 = this.animated.hashCode();
      }

      val var5: Int;
      if (this.canAddNewReactions == null) {
         var5 = 0;
      } else {
         var5 = this.canAddNewReactions.hashCode();
      }

      val var6: Int;
      if (this.addReactionLabel == null) {
         var6 = 0;
      } else {
         var6 = this.addReactionLabel.hashCode();
      }

      val var7: Int;
      if (this.addNewReactionAccessibilityLabel == null) {
         var7 = 0;
      } else {
         var7 = this.addNewReactionAccessibilityLabel.hashCode();
      }

      val var8: Int;
      if (this.addNewBurstReactionAccessibilityLabel == null) {
         var8 = 0;
      } else {
         var8 = this.addNewBurstReactionAccessibilityLabel.hashCode();
      }

      val var9: Int;
      if (this.reactionsTheme == null) {
         var9 = 0;
      } else {
         var9 = this.reactionsTheme.hashCode();
      }

      var var11: Byte = 1;
      var var10: Byte = this.isHighlight;
      if (this.isHighlight != 0) {
         var10 = 1;
      }

      if (this.renderContentOnly == 0) {
         var11 = this.renderContentOnly;
      }

      val var23: Int;
      if (this.messageFrame == null) {
         var23 = 0;
      } else {
         var23 = this.messageFrame.hashCode();
      }

      val var13: Int;
      if (this.reactTag == null) {
         var13 = 0;
      } else {
         var13 = this.reactTag.hashCode();
      }

      val var14: Int;
      if (this.truncation == null) {
         var14 = 0;
      } else {
         var14 = this.truncation.hashCode();
      }

      val var15: Int;
      if (this.backgroundHighlight == null) {
         var15 = 0;
      } else {
         var15 = this.backgroundHighlight.hashCode();
      }

      val var20: Int = this.swipeActions.hashCode();
      if (this.contextType != null) {
         var16 = this.contextType.hashCode();
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
                                                                                                                                                                        var17
                                                                                                                                                                              * 31
                                                                                                                                                                           + var18
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var1
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var2
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var19
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var3
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var4
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var5
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var6
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var7
                                                                                             )
                                                                                             * 31
                                                                                          + var8
                                                                                    )
                                                                                    * 31
                                                                                 + var9
                                                                           )
                                                                           * 31
                                                                        + var10
                                                                  )
                                                                  * 31
                                                               + var11
                                                         )
                                                         * 31
                                                      + var23
                                                )
                                                * 31
                                             + var13
                                       )
                                       * 31
                                    + var14
                              )
                              * 31
                           + var15
                     )
                     * 31
                  + var20
            )
            * 31
         + var16;
   }

   public override fun toString(): String {
      val var1: Int = this.getIndex();
      val var11: ChangeType = this.getChangeType();
      val var19: java.lang.Boolean = this.jumped;
      val var20: java.lang.Boolean = this.highlightJumpedOnceOnly;
      val var15: MessageBase = this.message;
      val var18: java.lang.Boolean = this.scrollTo;
      val var5: java.lang.Boolean = this.animated;
      val var6: java.lang.Boolean = this.canAddNewReactions;
      val var9: java.lang.String = this.addReactionLabel;
      val var16: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var13: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var21: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.isHighlight;
      val var3: Boolean = this.renderContentOnly;
      val var8: MessageFrame = this.messageFrame;
      val var7: Int = this.reactTag;
      val var10: Truncation = this.truncation;
      val var4: BackgroundHighlight = this.backgroundHighlight;
      val var12: SwipeActionsType = this.swipeActions;
      val var17: MessageContextType = this.contextType;
      val var14: StringBuilder = new StringBuilder();
      var14.append("MessageRow(index=");
      var14.append(var1);
      var14.append(", changeType=");
      var14.append(var11);
      var14.append(", jumped=");
      var14.append(var19);
      var14.append(", highlightJumpedOnceOnly=");
      var14.append(var20);
      var14.append(", message=");
      var14.append(var15);
      var14.append(", scrollTo=");
      var14.append(var18);
      var14.append(", animated=");
      var14.append(var5);
      var14.append(", canAddNewReactions=");
      var14.append(var6);
      var14.append(", addReactionLabel=");
      var14.append(var9);
      var14.append(", addNewReactionAccessibilityLabel=");
      var14.append(var16);
      var14.append(", addNewBurstReactionAccessibilityLabel=");
      var14.append(var13);
      var14.append(", reactionsTheme=");
      var14.append(var21);
      var14.append(", isHighlight=");
      var14.append(var2);
      var14.append(", renderContentOnly=");
      var14.append(var3);
      var14.append(", messageFrame=");
      var14.append(var8);
      var14.append(", reactTag=");
      var14.append(var7);
      var14.append(", truncation=");
      var14.append(var10);
      var14.append(", backgroundHighlight=");
      var14.append(var4);
      var14.append(", swipeActions=");
      var14.append(var12);
      var14.append(", contextType=");
      var14.append(var17);
      var14.append(")");
      return var14.toString();
   }

   public object `$serializer` : f0<MessageRow> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageRow.$serializer = new MessageRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("1", var0, 20);
         var1.l("index", false);
         var1.l("changeType", false);
         var1.l("jumped", true);
         var1.l("highlightJumpedOnceOnly", true);
         var1.l("message", false);
         var1.l("scrollTo", true);
         var1.l("animated", true);
         var1.l("canAddNewReactions", true);
         var1.l("addReactionLabel", true);
         var1.l("addNewReactionAccessibilityLabel", true);
         var1.l("addNewBurstReactionAccessibilityLabel", true);
         var1.l("reactionsTheme", true);
         var1.l("isHighlight", true);
         var1.l("renderContentOnly", true);
         var1.l("messageFrame", true);
         var1.l("reactTag", true);
         var1.l("truncation", true);
         var1.l("backgroundHighlight", true);
         var1.l("swipeActions", true);
         var1.l("contextType", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: m0 = m0.a;
         val var7: ChangeType.Serializer = ChangeType.Serializer.INSTANCE;
         val var4: h = h.a;
         val var1: KSerializer = a.u(h.a);
         val var8: KSerializer = a.u(var4);
         val var2: MessageSerializer = MessageSerializer.INSTANCE;
         val var10: KSerializer = a.u(var4);
         val var5: KSerializer = a.u(var4);
         val var6: KSerializer = a.u(var4);
         val var9: a2 = a2.a;
         return new KSerializer[]{
            var3,
            var7,
            var1,
            var8,
            var2,
            var10,
            var5,
            var6,
            a.u(a2.a),
            a.u(var9),
            a.u(var9),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var4,
            var4,
            a.u(MessageFrameSerializer.INSTANCE),
            a.u(var3),
            a.u(Truncation.$serializer.INSTANCE),
            a.u(BackgroundHighlight.$serializer.INSTANCE),
            SwipeActionsType.Serializer.INSTANCE,
            a.u(MessageContextType.Companion.serializer())
         };
      }

      public open fun deserialize(decoder: Decoder): MessageRow {
         r.h(var1, "decoder");
         val var30: SerialDescriptor = this.getDescriptor();
         val var31: c = var1.b(var30);
         var var3: Byte;
         val var4: Int;
         var var5: Int;
         var var7: Byte;
         var var11: Any;
         var var16: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var23: Any;
         val var24: Any;
         val var25: Any;
         val var26: Any;
         val var27: Any;
         val var28: Any;
         var var40: Any;
         var var47: Any;
         var var50: Any;
         var var53: Any;
         var var59: Any;
         if (var31.p()) {
            var4 = var31.i(var30, 0);
            var11 = var31.y(var30, 1, ChangeType.Serializer.INSTANCE, null);
            var40 = h.a;
            val var9: Any = var31.n(var30, 2, h.a, null);
            val var32: Any = var31.n(var30, 3, (DeserializationStrategy)var40, null);
            val var14: Any = var31.y(var30, 4, MessageSerializer.INSTANCE, null);
            var53 = var31.n(var30, 5, (DeserializationStrategy)var40, null);
            var59 = var31.n(var30, 6, (DeserializationStrategy)var40, null);
            var40 = var31.n(var30, 7, (DeserializationStrategy)var40, null);
            var var10: a2 = a2.a;
            var16 = var31.n(var30, 8, a2.a, null);
            var19 = var31.n(var30, 9, var10, null);
            val var12: Any = var31.n(var30, 10, var10, null);
            var10 = (a2)var31.n(var30, 11, ReactionsTheme.$serializer.INSTANCE, null);
            var3 = var31.C(var30, 12);
            val var2: Byte = var31.C(var30, 13);
            var23 = var31.n(var30, 14, MessageFrameSerializer.INSTANCE, null);
            var21 = var31.n(var30, 15, m0.a, null);
            var18 = var31.n(var30, 16, Truncation.$serializer.INSTANCE, null);
            var47 = var31.n(var30, 17, BackgroundHighlight.$serializer.INSTANCE, null);
            var20 = var31.y(var30, 18, SwipeActionsType.Serializer.INSTANCE, null);
            var50 = var31.n(var30, 19, MessageContextType.Companion.serializer(), null);
            var5 = 1048575;
            var26 = var14;
            var27 = var53;
            var53 = var59;
            var25 = var40;
            var40 = var12;
            var59 = var32;
            var24 = var10;
            var7 = var2;
            var28 = var9;
         } else {
            var var33: Any = null;
            var var6: Boolean = true;
            var40 = null;
            var20 = null;
            var18 = null;
            var53 = null;
            var59 = null;
            var21 = null;
            var19 = null;
            var47 = null;
            var50 = null;
            var16 = null;
            var23 = null;
            var var49: Any = null;
            var var46: Any = null;
            var11 = null;
            var var44: Any = null;
            var var34: Int = 0;
            var var35: Byte = 0;
            var5 = 0;
            var3 = 0;
            var var42: Any = null;

            while (var6) {
               var7 = var31.o(var30);
               switch (var7) {
                  case -1:
                     var6 = false;
                     break;
                  case 0:
                     var5 = var31.i(var30, 0);
                     var34 |= 1;
                     break;
                  case 1:
                     var42 = var31.y(var30, 1, ChangeType.Serializer.INSTANCE, var42);
                     var34 |= 2;
                     break;
                  case 2:
                     var40 = var31.n(var30, 2, h.a, var40);
                     var34 |= 4;
                     break;
                  case 3:
                     var59 = var31.n(var30, 3, h.a, var59);
                     var34 |= 8;
                     break;
                  case 4:
                     var20 = var31.y(var30, 4, MessageSerializer.INSTANCE, var20);
                     var34 |= 16;
                     break;
                  case 5:
                     var18 = var31.n(var30, 5, h.a, var18);
                     var34 |= 32;
                     break;
                  case 6:
                     var16 = var31.n(var30, 6, h.a, var16);
                     var34 |= 64;
                     break;
                  case 7:
                     var50 = var31.n(var30, 7, h.a, var50);
                     var34 |= 128;
                     break;
                  case 8:
                     var47 = var31.n(var30, 8, a2.a, var47);
                     var34 |= 256;
                     break;
                  case 9:
                     var53 = var31.n(var30, 9, a2.a, var53);
                     var34 |= 512;
                     break;
                  case 10:
                     var19 = var31.n(var30, 10, a2.a, var19);
                     var34 |= 1024;
                     break;
                  case 11:
                     var21 = var31.n(var30, 11, ReactionsTheme.$serializer.INSTANCE, var21);
                     var34 |= 2048;
                     break;
                  case 12:
                     var3 = var31.C(var30, 12);
                     var34 |= 4096;
                     break;
                  case 13:
                     var35 = var31.C(var30, 13);
                     var34 |= 8192;
                     break;
                  case 14:
                     var23 = var31.n(var30, 14, MessageFrameSerializer.INSTANCE, var23);
                     var34 |= 16384;
                     break;
                  case 15:
                     var49 = var31.n(var30, 15, m0.a, var49);
                     var34 |= 32768;
                     break;
                  case 16:
                     var46 = var31.n(var30, 16, Truncation.$serializer.INSTANCE, var46);
                     var34 |= 65536;
                     break;
                  case 17:
                     var11 = var31.n(var30, 17, BackgroundHighlight.$serializer.INSTANCE, var11);
                     var34 |= 131072;
                     break;
                  case 18:
                     var44 = var31.y(var30, 18, SwipeActionsType.Serializer.INSTANCE, var44);
                     var34 |= 262144;
                     break;
                  case 19:
                     var33 = var31.n(var30, 19, MessageContextType.Companion.serializer(), var33);
                     var34 |= 524288;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var28 = var40;
            var7 = var35;
            var24 = var21;
            var5 = var34;
            var40 = var19;
            var25 = var50;
            var19 = var53;
            var16 = var47;
            var53 = var16;
            var11 = var42;
            var27 = var18;
            var4 = var5;
            var26 = var20;
            var50 = var33;
            var20 = var44;
            var47 = var11;
            var18 = var46;
            var21 = var49;
         }

         var31.c(var30);
         return new MessageRow(
            var5,
            var4,
            var11 as ChangeType,
            var28 as java.lang.Boolean,
            var59 as java.lang.Boolean,
            var26 as MessageBase,
            var27 as java.lang.Boolean,
            var53 as java.lang.Boolean,
            var25 as java.lang.Boolean,
            var16 as java.lang.String,
            var19 as java.lang.String,
            var40 as java.lang.String,
            var24 as ReactionsTheme,
            (boolean)var3,
            (boolean)var7,
            var23 as MessageFrame,
            var21 as Integer,
            var18 as Truncation,
            var47 as BackgroundHighlight,
            var20 as SwipeActionsType,
            var50 as MessageContextType,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MessageRow) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageRow.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
