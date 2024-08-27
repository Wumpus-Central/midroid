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
      val var18: Int = Integer.hashCode(this.getIndex());
      val var17: Int = this.getChangeType().hashCode();
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
                                                                                                                                                                        var18
                                                                                                                                                                              * 31
                                                                                                                                                                           + var17
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
      val var4: ChangeType = this.getChangeType();
      val var21: java.lang.Boolean = this.jumped;
      val var8: java.lang.Boolean = this.highlightJumpedOnceOnly;
      val var12: MessageBase = this.message;
      val var13: java.lang.Boolean = this.scrollTo;
      val var11: java.lang.Boolean = this.animated;
      val var14: java.lang.Boolean = this.canAddNewReactions;
      val var15: java.lang.String = this.addReactionLabel;
      val var7: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var20: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var16: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.isHighlight;
      val var3: Boolean = this.renderContentOnly;
      val var9: MessageFrame = this.messageFrame;
      val var5: Int = this.reactTag;
      val var19: Truncation = this.truncation;
      val var17: BackgroundHighlight = this.backgroundHighlight;
      val var6: SwipeActionsType = this.swipeActions;
      val var10: MessageContextType = this.contextType;
      val var18: StringBuilder = new StringBuilder();
      var18.append("MessageRow(index=");
      var18.append(var1);
      var18.append(", changeType=");
      var18.append(var4);
      var18.append(", jumped=");
      var18.append(var21);
      var18.append(", highlightJumpedOnceOnly=");
      var18.append(var8);
      var18.append(", message=");
      var18.append(var12);
      var18.append(", scrollTo=");
      var18.append(var13);
      var18.append(", animated=");
      var18.append(var11);
      var18.append(", canAddNewReactions=");
      var18.append(var14);
      var18.append(", addReactionLabel=");
      var18.append(var15);
      var18.append(", addNewReactionAccessibilityLabel=");
      var18.append(var7);
      var18.append(", addNewBurstReactionAccessibilityLabel=");
      var18.append(var20);
      var18.append(", reactionsTheme=");
      var18.append(var16);
      var18.append(", isHighlight=");
      var18.append(var2);
      var18.append(", renderContentOnly=");
      var18.append(var3);
      var18.append(", messageFrame=");
      var18.append(var9);
      var18.append(", reactTag=");
      var18.append(var5);
      var18.append(", truncation=");
      var18.append(var19);
      var18.append(", backgroundHighlight=");
      var18.append(var17);
      var18.append(", swipeActions=");
      var18.append(var6);
      var18.append(", contextType=");
      var18.append(var10);
      var18.append(")");
      return var18.toString();
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
         val var8: ChangeType.Serializer = ChangeType.Serializer.INSTANCE;
         val var6: h = h.a;
         val var9: KSerializer = a.u(h.a);
         val var5: KSerializer = a.u(var6);
         val var10: MessageSerializer = MessageSerializer.INSTANCE;
         val var1: KSerializer = a.u(var6);
         val var3: KSerializer = a.u(var6);
         val var4: KSerializer = a.u(var6);
         val var7: a2 = a2.a;
         return new KSerializer[]{
            var2,
            var8,
            var9,
            var5,
            var10,
            var1,
            var3,
            var4,
            a.u(a2.a),
            a.u(var7),
            a.u(var7),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var6,
            var6,
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
         val var29: SerialDescriptor = this.getDescriptor();
         val var30: c = var1.b(var29);
         var var2: Byte;
         var var3: Byte;
         val var4: Int;
         val var6: Int;
         var var15: Any;
         var var16: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var22: Any;
         var var23: Any;
         val var24: Any;
         val var25: Any;
         val var26: Any;
         val var27: Any;
         val var28: Any;
         var var37: Any;
         var var41: Any;
         var var45: Any;
         var var49: Any;
         var var54: Any;
         if (var30.p()) {
            var4 = var30.i(var29, 0);
            var41 = var30.y(var29, 1, ChangeType.Serializer.INSTANCE, null);
            var37 = h.a;
            val var9: Any = var30.n(var29, 2, h.a, null);
            val var31: Any = var30.n(var29, 3, (DeserializationStrategy)var37, null);
            val var13: Any = var30.y(var29, 4, MessageSerializer.INSTANCE, null);
            var19 = var30.n(var29, 5, (DeserializationStrategy)var37, null);
            var20 = var30.n(var29, 6, (DeserializationStrategy)var37, null);
            var37 = var30.n(var29, 7, (DeserializationStrategy)var37, null);
            var var10: a2 = a2.a;
            var49 = var30.n(var29, 8, a2.a, null);
            var25 = var30.n(var29, 9, var10, null);
            val var12: Any = var30.n(var29, 10, var10, null);
            var10 = (a2)var30.n(var29, 11, ReactionsTheme.$serializer.INSTANCE, null);
            var3 = var30.C(var29, 12);
            var2 = var30.C(var29, 13);
            var23 = var30.n(var29, 14, MessageFrameSerializer.INSTANCE, null);
            var18 = var30.n(var29, 15, m0.a, null);
            var16 = var30.n(var29, 16, Truncation.$serializer.INSTANCE, null);
            var15 = var30.n(var29, 17, BackgroundHighlight.$serializer.INSTANCE, null);
            var45 = var30.y(var29, 18, SwipeActionsType.Serializer.INSTANCE, null);
            var27 = var30.n(var29, 19, MessageContextType.Companion.serializer(), null);
            var6 = 1048575;
            var54 = var13;
            var28 = var41;
            var41 = var49;
            var24 = var37;
            var49 = var12;
            var22 = var31;
            var26 = var10;
            var37 = var9;
         } else {
            var var32: Any = null;
            var var35: Boolean = true;
            var37 = null;
            var54 = null;
            var18 = null;
            var49 = null;
            var22 = null;
            var20 = null;
            var19 = null;
            var45 = null;
            var15 = null;
            var16 = null;
            var23 = null;
            var var44: Any = null;
            var var43: Any = null;
            var41 = null;
            var var40: Any = null;
            var2 = 0;
            var var34: Byte = 0;
            var var5: Int = 0;
            var3 = 0;
            var var38: Any = null;

            while (var35) {
               val var7: Int = var30.o(var29);
               switch (var7) {
                  case -1:
                     var35 = false;
                     break;
                  case 0:
                     var5 = var30.i(var29, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var38 = var30.y(var29, 1, ChangeType.Serializer.INSTANCE, var38);
                     var2 |= 2;
                     break;
                  case 2:
                     var37 = var30.n(var29, 2, h.a, var37);
                     var2 |= 4;
                     break;
                  case 3:
                     var22 = var30.n(var29, 3, h.a, var22);
                     var2 |= 8;
                     break;
                  case 4:
                     var54 = var30.y(var29, 4, MessageSerializer.INSTANCE, var54);
                     var2 |= 16;
                     break;
                  case 5:
                     var18 = var30.n(var29, 5, h.a, var18);
                     var2 |= 32;
                     break;
                  case 6:
                     var16 = var30.n(var29, 6, h.a, var16);
                     var2 |= 64;
                     break;
                  case 7:
                     var15 = var30.n(var29, 7, h.a, var15);
                     var2 |= 128;
                     break;
                  case 8:
                     var45 = var30.n(var29, 8, a2.a, var45);
                     var2 |= 256;
                     break;
                  case 9:
                     var49 = var30.n(var29, 9, a2.a, var49);
                     var2 |= 512;
                     break;
                  case 10:
                     var19 = var30.n(var29, 10, a2.a, var19);
                     var2 |= 1024;
                     break;
                  case 11:
                     var20 = var30.n(var29, 11, ReactionsTheme.$serializer.INSTANCE, var20);
                     var2 |= 2048;
                     break;
                  case 12:
                     var3 = var30.C(var29, 12);
                     var2 |= 4096;
                     break;
                  case 13:
                     var34 = var30.C(var29, 13);
                     var2 |= 8192;
                     break;
                  case 14:
                     var23 = var30.n(var29, 14, MessageFrameSerializer.INSTANCE, var23);
                     var2 |= 16384;
                     break;
                  case 15:
                     var44 = var30.n(var29, 15, m0.a, var44);
                     var2 |= 32768;
                     break;
                  case 16:
                     var43 = var30.n(var29, 16, Truncation.$serializer.INSTANCE, var43);
                     var2 |= 65536;
                     break;
                  case 17:
                     var41 = var30.n(var29, 17, BackgroundHighlight.$serializer.INSTANCE, var41);
                     var2 |= 131072;
                     break;
                  case 18:
                     var40 = var30.y(var29, 18, SwipeActionsType.Serializer.INSTANCE, var40);
                     var2 |= 262144;
                     break;
                  case 19:
                     var32 = var30.n(var29, 19, MessageContextType.Companion.serializer(), var32);
                     var2 |= 524288;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var6 = var2;
            var24 = var15;
            var25 = var49;
            var15 = var41;
            var41 = var45;
            var2 = var34;
            var26 = var20;
            var49 = var19;
            var20 = var16;
            var28 = var38;
            var19 = var18;
            var4 = var5;
            var27 = var32;
            var45 = var40;
            var16 = var43;
            var18 = var44;
         }

         var30.c(var29);
         return new MessageRow(
            var6,
            var4,
            var28 as ChangeType,
            var37 as java.lang.Boolean,
            var22 as java.lang.Boolean,
            var54 as MessageBase,
            var19 as java.lang.Boolean,
            var20 as java.lang.Boolean,
            var24 as java.lang.Boolean,
            var41 as java.lang.String,
            var25 as java.lang.String,
            var49 as java.lang.String,
            var26 as ReactionsTheme,
            (boolean)var3,
            (boolean)var2,
            var23 as MessageFrame,
            var18 as Int,
            var16 as Truncation,
            var15 as BackgroundHighlight,
            var45 as SwipeActionsType,
            var27 as MessageContextType,
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
