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
      val var20: ChangeType = this.getChangeType();
      val var18: java.lang.Boolean = this.jumped;
      val var6: java.lang.Boolean = this.highlightJumpedOnceOnly;
      val var21: MessageBase = this.message;
      val var8: java.lang.Boolean = this.scrollTo;
      val var4: java.lang.Boolean = this.animated;
      val var14: java.lang.Boolean = this.canAddNewReactions;
      val var13: java.lang.String = this.addReactionLabel;
      val var9: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var5: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var16: ReactionsTheme = this.reactionsTheme;
      val var3: Boolean = this.isHighlight;
      val var2: Boolean = this.renderContentOnly;
      val var10: MessageFrame = this.messageFrame;
      val var17: Int = this.reactTag;
      val var12: Truncation = this.truncation;
      val var19: BackgroundHighlight = this.backgroundHighlight;
      val var15: SwipeActionsType = this.swipeActions;
      val var7: MessageContextType = this.contextType;
      val var11: StringBuilder = new StringBuilder();
      var11.append("MessageRow(index=");
      var11.append(var1);
      var11.append(", changeType=");
      var11.append(var20);
      var11.append(", jumped=");
      var11.append(var18);
      var11.append(", highlightJumpedOnceOnly=");
      var11.append(var6);
      var11.append(", message=");
      var11.append(var21);
      var11.append(", scrollTo=");
      var11.append(var8);
      var11.append(", animated=");
      var11.append(var4);
      var11.append(", canAddNewReactions=");
      var11.append(var14);
      var11.append(", addReactionLabel=");
      var11.append(var13);
      var11.append(", addNewReactionAccessibilityLabel=");
      var11.append(var9);
      var11.append(", addNewBurstReactionAccessibilityLabel=");
      var11.append(var5);
      var11.append(", reactionsTheme=");
      var11.append(var16);
      var11.append(", isHighlight=");
      var11.append(var3);
      var11.append(", renderContentOnly=");
      var11.append(var2);
      var11.append(", messageFrame=");
      var11.append(var10);
      var11.append(", reactTag=");
      var11.append(var17);
      var11.append(", truncation=");
      var11.append(var12);
      var11.append(", backgroundHighlight=");
      var11.append(var19);
      var11.append(", swipeActions=");
      var11.append(var15);
      var11.append(", contextType=");
      var11.append(var7);
      var11.append(")");
      return var11.toString();
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
         val var2: m0 = m0.a;
         val var6: ChangeType.Serializer = ChangeType.Serializer.INSTANCE;
         val var5: h = h.a;
         val var9: KSerializer = a.u(h.a);
         val var10: KSerializer = a.u(var5);
         val var7: MessageSerializer = MessageSerializer.INSTANCE;
         val var3: KSerializer = a.u(var5);
         val var4: KSerializer = a.u(var5);
         val var8: KSerializer = a.u(var5);
         val var1: a2 = a2.a;
         return new KSerializer[]{
            var2,
            var6,
            var9,
            var10,
            var7,
            var3,
            var4,
            var8,
            a.u(a2.a),
            a.u(var1),
            a.u(var1),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var5,
            var5,
            a.u(MessageFrameSerializer.INSTANCE),
            a.u(var2),
            a.u(Truncation.$serializer.INSTANCE),
            a.u(BackgroundHighlight.$serializer.INSTANCE),
            SwipeActionsType.Serializer.INSTANCE,
            a.u(MessageContextType.Companion.serializer())
         };
      }

      public open fun deserialize(decoder: Decoder): MessageRow {
         r.h(var1, "decoder");
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.b(var28);
         var var2: Byte;
         var var3: Byte;
         var var5: Int;
         val var6: Int;
         var var9: Any;
         var var14: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: Any;
         val var25: Any;
         val var26: Any;
         var var35: Any;
         var var40: Any;
         var var43: Any;
         var var45: Any;
         var var55: Any;
         if (var29.p()) {
            var5 = var29.i(var28, 0);
            var40 = var29.y(var28, 1, ChangeType.Serializer.INSTANCE, null);
            var35 = h.a;
            var9 = var29.n(var28, 2, h.a, null);
            val var30: Any = var29.n(var28, 3, (DeserializationStrategy)var35, null);
            var21 = var29.y(var28, 4, MessageSerializer.INSTANCE, null);
            var20 = var29.n(var28, 5, (DeserializationStrategy)var35, null);
            var14 = var29.n(var28, 6, (DeserializationStrategy)var35, null);
            var35 = var29.n(var28, 7, (DeserializationStrategy)var35, null);
            var var10: a2 = a2.a;
            var19 = var29.n(var28, 8, a2.a, null);
            var55 = var29.n(var28, 9, var10, null);
            val var12: Any = var29.n(var28, 10, var10, null);
            var10 = (a2)var29.n(var28, 11, ReactionsTheme.$serializer.INSTANCE, null);
            var2 = var29.C(var28, 12);
            var3 = var29.C(var28, 13);
            var23 = var29.n(var28, 14, MessageFrameSerializer.INSTANCE, null);
            var43 = var29.n(var28, 15, m0.a, null);
            var16 = var29.n(var28, 16, Truncation.$serializer.INSTANCE, null);
            var18 = var29.n(var28, 17, BackgroundHighlight.$serializer.INSTANCE, null);
            var22 = var29.y(var28, 18, SwipeActionsType.Serializer.INSTANCE, null);
            var17 = var29.n(var28, 19, MessageContextType.Companion.serializer(), null);
            var6 = 1048575;
            var45 = var40;
            var40 = var55;
            var25 = var12;
            var55 = var30;
            var26 = var10;
         } else {
            var var31: Any = null;
            var var34: Boolean = true;
            var35 = null;
            var21 = null;
            var18 = null;
            var17 = null;
            var22 = null;
            var20 = null;
            var19 = null;
            var14 = null;
            var45 = null;
            var16 = null;
            var23 = null;
            var43 = null;
            var var42: Any = null;
            var40 = null;
            var var39: Any = null;
            var2 = 0;
            var var4: Byte = 0;
            var5 = 0;
            var3 = 0;
            var9 = null;

            while (var34) {
               val var7: Int = var29.o(var28);
               switch (var7) {
                  case -1:
                     var34 = false;
                     break;
                  case 0:
                     var5 = var29.i(var28, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var29.y(var28, 1, ChangeType.Serializer.INSTANCE, var9);
                     var2 |= 2;
                     break;
                  case 2:
                     var35 = var29.n(var28, 2, h.a, var35);
                     var2 |= 4;
                     break;
                  case 3:
                     var22 = var29.n(var28, 3, h.a, var22);
                     var2 |= 8;
                     break;
                  case 4:
                     var21 = var29.y(var28, 4, MessageSerializer.INSTANCE, var21);
                     var2 |= 16;
                     break;
                  case 5:
                     var18 = var29.n(var28, 5, h.a, var18);
                     var2 |= 32;
                     break;
                  case 6:
                     var16 = var29.n(var28, 6, h.a, var16);
                     var2 |= 64;
                     break;
                  case 7:
                     var45 = var29.n(var28, 7, h.a, var45);
                     var2 |= 128;
                     break;
                  case 8:
                     var14 = var29.n(var28, 8, a2.a, var14);
                     var2 |= 256;
                     break;
                  case 9:
                     var17 = var29.n(var28, 9, a2.a, var17);
                     var2 |= 512;
                     break;
                  case 10:
                     var19 = var29.n(var28, 10, a2.a, var19);
                     var2 |= 1024;
                     break;
                  case 11:
                     var20 = var29.n(var28, 11, ReactionsTheme.$serializer.INSTANCE, var20);
                     var2 |= 2048;
                     break;
                  case 12:
                     var3 = var29.C(var28, 12);
                     var2 |= 4096;
                     break;
                  case 13:
                     var4 = var29.C(var28, 13);
                     var2 |= 8192;
                     break;
                  case 14:
                     var23 = var29.n(var28, 14, MessageFrameSerializer.INSTANCE, var23);
                     var2 |= 16384;
                     break;
                  case 15:
                     var43 = var29.n(var28, 15, m0.a, var43);
                     var2 |= 32768;
                     break;
                  case 16:
                     var42 = var29.n(var28, 16, Truncation.$serializer.INSTANCE, var42);
                     var2 |= 65536;
                     break;
                  case 17:
                     var40 = var29.n(var28, 17, BackgroundHighlight.$serializer.INSTANCE, var40);
                     var2 |= 131072;
                     break;
                  case 18:
                     var39 = var29.y(var28, 18, SwipeActionsType.Serializer.INSTANCE, var39);
                     var2 |= 262144;
                     break;
                  case 19:
                     var31 = var29.n(var28, 19, MessageContextType.Companion.serializer(), var31);
                     var2 |= 524288;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var6 = var2;
            var26 = var20;
            var18 = var40;
            var9 = var35;
            var2 = var3;
            var3 = var4;
            var55 = var22;
            var25 = var19;
            var35 = var45;
            var40 = var17;
            var19 = var14;
            var14 = var16;
            var45 = var9;
            var20 = var18;
            var17 = var31;
            var22 = var39;
            var16 = var42;
         }

         var29.c(var28);
         return new MessageRow(
            var6,
            var5,
            var45 as ChangeType,
            var9 as java.lang.Boolean,
            var55 as java.lang.Boolean,
            var21 as MessageBase,
            var20 as java.lang.Boolean,
            var14 as java.lang.Boolean,
            var35 as java.lang.Boolean,
            var19 as java.lang.String,
            var40 as java.lang.String,
            var25 as java.lang.String,
            var26 as ReactionsTheme,
            (boolean)var2,
            (boolean)var3,
            var23 as MessageFrame,
            var43 as Integer,
            var16 as Truncation,
            var18 as BackgroundHighlight,
            var22 as SwipeActionsType,
            var17 as MessageContextType,
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
