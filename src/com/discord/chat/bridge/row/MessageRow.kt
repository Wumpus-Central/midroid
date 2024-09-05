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
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.h
import qn.n0

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
      q.h(var2, "changeType");
      q.h(var5, "message");
      q.h(var19, "swipeActions");
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

   public operator fun component1(): Int {
      return this.index;
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
      return this.changeType;
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
      index: Int = var0.index,
      changeType: ChangeType = var0.changeType,
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
      q.h(var2, "changeType");
      q.h(var5, "message");
      q.h(var19, "swipeActions");
      return new MessageRow(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (!q.c(this.jumped, var1.jumped)) {
            return false;
         } else if (!q.c(this.highlightJumpedOnceOnly, var1.highlightJumpedOnceOnly)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else if (!q.c(this.scrollTo, var1.scrollTo)) {
            return false;
         } else if (!q.c(this.animated, var1.animated)) {
            return false;
         } else if (!q.c(this.canAddNewReactions, var1.canAddNewReactions)) {
            return false;
         } else if (!q.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!q.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else if (this.isHighlight != var1.isHighlight) {
            return false;
         } else if (this.renderContentOnly != var1.renderContentOnly) {
            return false;
         } else if (!q.c(this.messageFrame, var1.messageFrame)) {
            return false;
         } else if (!q.c(this.reactTag, var1.reactTag)) {
            return false;
         } else if (!q.c(this.truncation, var1.truncation)) {
            return false;
         } else if (!q.c(this.backgroundHighlight, var1.backgroundHighlight)) {
            return false;
         } else if (this.swipeActions != var1.swipeActions) {
            return false;
         } else {
            return this.contextType === var1.contextType;
         }
      }
   }

   public override fun hashCode(): Int {
      val var16: Int = Integer.hashCode(this.index);
      val var15: Int = this.changeType.hashCode();
      var var14: Int = 0;
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

      val var17: Int = this.message.hashCode();
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

      val var18: Int = java.lang.Boolean.hashCode(this.isHighlight);
      val var19: Int = java.lang.Boolean.hashCode(this.renderContentOnly);
      val var10: Int;
      if (this.messageFrame == null) {
         var10 = 0;
      } else {
         var10 = this.messageFrame.hashCode();
      }

      val var11: Int;
      if (this.reactTag == null) {
         var11 = 0;
      } else {
         var11 = this.reactTag.hashCode();
      }

      val var12: Int;
      if (this.truncation == null) {
         var12 = 0;
      } else {
         var12 = this.truncation.hashCode();
      }

      val var13: Int;
      if (this.backgroundHighlight == null) {
         var13 = 0;
      } else {
         var13 = this.backgroundHighlight.hashCode();
      }

      val var20: Int = this.swipeActions.hashCode();
      if (this.contextType != null) {
         var14 = this.contextType.hashCode();
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
                                                                                                                                                                        var16
                                                                                                                                                                              * 31
                                                                                                                                                                           + var15
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var1
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var2
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var17
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
                                                                        + var18
                                                                  )
                                                                  * 31
                                                               + var19
                                                         )
                                                         * 31
                                                      + var10
                                                )
                                                * 31
                                             + var11
                                       )
                                       * 31
                                    + var12
                              )
                              * 31
                           + var13
                     )
                     * 31
                  + var20
            )
            * 31
         + var14;
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var12: ChangeType = this.changeType;
      val var6: java.lang.Boolean = this.jumped;
      val var20: java.lang.Boolean = this.highlightJumpedOnceOnly;
      val var15: MessageBase = this.message;
      val var16: java.lang.Boolean = this.scrollTo;
      val var14: java.lang.Boolean = this.animated;
      val var9: java.lang.Boolean = this.canAddNewReactions;
      val var17: java.lang.String = this.addReactionLabel;
      val var10: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var8: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var19: ReactionsTheme = this.reactionsTheme;
      val var3: Boolean = this.isHighlight;
      val var2: Boolean = this.renderContentOnly;
      val var11: MessageFrame = this.messageFrame;
      val var4: Int = this.reactTag;
      val var21: Truncation = this.truncation;
      val var5: BackgroundHighlight = this.backgroundHighlight;
      val var7: SwipeActionsType = this.swipeActions;
      val var13: MessageContextType = this.contextType;
      val var18: StringBuilder = new StringBuilder();
      var18.append("MessageRow(index=");
      var18.append(var1);
      var18.append(", changeType=");
      var18.append(var12);
      var18.append(", jumped=");
      var18.append(var6);
      var18.append(", highlightJumpedOnceOnly=");
      var18.append(var20);
      var18.append(", message=");
      var18.append(var15);
      var18.append(", scrollTo=");
      var18.append(var16);
      var18.append(", animated=");
      var18.append(var14);
      var18.append(", canAddNewReactions=");
      var18.append(var9);
      var18.append(", addReactionLabel=");
      var18.append(var17);
      var18.append(", addNewReactionAccessibilityLabel=");
      var18.append(var10);
      var18.append(", addNewBurstReactionAccessibilityLabel=");
      var18.append(var8);
      var18.append(", reactionsTheme=");
      var18.append(var19);
      var18.append(", isHighlight=");
      var18.append(var3);
      var18.append(", renderContentOnly=");
      var18.append(var2);
      var18.append(", messageFrame=");
      var18.append(var11);
      var18.append(", reactTag=");
      var18.append(var4);
      var18.append(", truncation=");
      var18.append(var21);
      var18.append(", backgroundHighlight=");
      var18.append(var5);
      var18.append(", swipeActions=");
      var18.append(var7);
      var18.append(", contextType=");
      var18.append(var13);
      var18.append(")");
      return var18.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageRow.$serializer = new MessageRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("1", var0, 20);
         var1.c("index", false);
         var1.c("changeType", false);
         var1.c("jumped", true);
         var1.c("highlightJumpedOnceOnly", true);
         var1.c("message", false);
         var1.c("scrollTo", true);
         var1.c("animated", true);
         var1.c("canAddNewReactions", true);
         var1.c("addReactionLabel", true);
         var1.c("addNewReactionAccessibilityLabel", true);
         var1.c("addNewBurstReactionAccessibilityLabel", true);
         var1.c("reactionsTheme", true);
         var1.c("isHighlight", true);
         var1.c("renderContentOnly", true);
         var1.c("messageFrame", true);
         var1.c("reactTag", true);
         var1.c("truncation", true);
         var1.c("backgroundHighlight", true);
         var1.c("swipeActions", true);
         var1.c("contextType", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         val var8: n0 = n0.a;
         val var1: ChangeType.Serializer = ChangeType.Serializer.INSTANCE;
         val var5: h = h.a;
         val var11: KSerializer = a.u(h.a);
         val var6: KSerializer = a.u(var5);
         val var10: MessageSerializer = MessageSerializer.INSTANCE;
         val var3: KSerializer = a.u(var5);
         val var4: KSerializer = a.u(var5);
         val var9: KSerializer = a.u(var5);
         val var7: b2 = b2.a;
         return new KSerializer[]{
            var8,
            var1,
            var11,
            var6,
            var10,
            var3,
            var4,
            var9,
            a.u(b2.a),
            a.u(var7),
            a.u(var7),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var5,
            var5,
            a.u(MessageFrameSerializer.INSTANCE),
            a.u(var8),
            a.u(Truncation.$serializer.INSTANCE),
            a.u(BackgroundHighlight.$serializer.INSTANCE),
            SwipeActionsType.Serializer.INSTANCE,
            a.u(var2[19])
         };
      }

      public open fun deserialize(decoder: Decoder): MessageRow {
         q.h(var1, "decoder");
         val var27: SerialDescriptor = this.getDescriptor();
         val var28: c = var1.b(var27);
         var var23: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         var var3: Int;
         var var4: Byte;
         val var5: Int;
         val var6: Byte;
         var var8: java.lang.String;
         var var11: java.lang.String;
         var var14: Any;
         var var15: Any;
         var var16: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         var var24: MessageBase;
         val var25: Any;
         var var31: Any;
         var var38: Any;
         var var40: Any;
         var var43: Any;
         if (var28.p()) {
            var3 = var28.i(var27, 0);
            var18 = var28.y(var27, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var31 = h.a;
            var19 = var28.n(var27, 2, h.a, null) as java.lang.Boolean;
            var20 = var28.n(var27, 3, (DeserializationStrategy)var31, null) as java.lang.Boolean;
            var24 = var28.y(var27, 4, MessageSerializer.INSTANCE, null) as MessageBase;
            var21 = var28.n(var27, 5, (DeserializationStrategy)var31, null) as java.lang.Boolean;
            var15 = var28.n(var27, 6, (DeserializationStrategy)var31, null) as java.lang.Boolean;
            var14 = var28.n(var27, 7, (DeserializationStrategy)var31, null) as java.lang.Boolean;
            var31 = b2.a;
            var8 = var28.n(var27, 8, b2.a, null) as java.lang.String;
            var43 = var28.n(var27, 9, (DeserializationStrategy)var31, null) as java.lang.String;
            var11 = var28.n(var27, 10, (DeserializationStrategy)var31, null) as java.lang.String;
            var16 = var28.n(var27, 11, ReactionsTheme.$serializer.INSTANCE, null) as ReactionsTheme;
            var6 = var28.C(var27, 12);
            val var2: Byte = var28.C(var27, 13);
            val var17: MessageFrame = var28.n(var27, 14, MessageFrameSerializer.INSTANCE, null) as MessageFrame;
            val var13: Int = var28.n(var27, 15, n0.a, null) as Int;
            var40 = var28.n(var27, 16, Truncation.$serializer.INSTANCE, null) as Truncation;
            var38 = var28.n(var27, 17, BackgroundHighlight.$serializer.INSTANCE, null) as BackgroundHighlight;
            var31 = var28.y(var27, 18, SwipeActionsType.Serializer.INSTANCE, null) as SwipeActionsType;
            val var26: MessageContextType = var28.n(var27, 19, var23[19], null) as MessageContextType;
            var5 = 1048575;
            var22 = (java.lang.String)var43;
            var4 = var2;
            var43 = var17;
            var23 = var13;
            var25 = var40;
            var40 = var38;
            var38 = var26;
         } else {
            var var36: Boolean = true;
            var24 = null;
            var22 = null;
            var21 = null;
            var20 = null;
            var19 = null;
            var var48: java.lang.String = null;
            var15 = null;
            var14 = null;
            var var46: Any = null;
            var16 = null;
            var8 = null;
            var40 = null;
            var38 = null;
            var31 = null;
            var43 = null;
            var11 = null;
            var var33: Int = 0;
            var var35: Byte = 0;
            var4 = 0;
            var3 = 0;
            var18 = null;

            while (var36) {
               val var7: Int = var28.o(var27);
               switch (var7) {
                  case -1:
                     var36 = false;
                     break;
                  case 0:
                     var3 = var28.i(var27, 0);
                     var33 |= 1;
                     break;
                  case 1:
                     var18 = var28.y(var27, 1, ChangeType.Serializer.INSTANCE, var18) as ChangeType;
                     var33 |= 2;
                     break;
                  case 2:
                     var19 = var28.n(var27, 2, h.a, var19) as java.lang.Boolean;
                     var33 |= 4;
                     break;
                  case 3:
                     var20 = var28.n(var27, 3, h.a, var20) as java.lang.Boolean;
                     var33 |= 8;
                     break;
                  case 4:
                     var24 = var28.y(var27, 4, MessageSerializer.INSTANCE, var24) as MessageBase;
                     var33 |= 16;
                     break;
                  case 5:
                     var21 = var28.n(var27, 5, h.a, var21) as java.lang.Boolean;
                     var33 |= 32;
                     break;
                  case 6:
                     var46 = var28.n(var27, 6, h.a, var46) as java.lang.Boolean;
                     var33 |= 64;
                     break;
                  case 7:
                     var14 = var28.n(var27, 7, h.a, var14) as java.lang.Boolean;
                     var33 |= 128;
                     break;
                  case 8:
                     var15 = var28.n(var27, 8, b2.a, var15) as java.lang.String;
                     var33 |= 256;
                     break;
                  case 9:
                     var22 = var28.n(var27, 9, b2.a, var22) as java.lang.String;
                     var33 |= 512;
                     break;
                  case 10:
                     var48 = var28.n(var27, 10, b2.a, var48) as java.lang.String;
                     var33 |= 1024;
                     break;
                  case 11:
                     var16 = var28.n(var27, 11, ReactionsTheme.$serializer.INSTANCE, var16) as ReactionsTheme;
                     var33 |= 2048;
                     break;
                  case 12:
                     var4 = var28.C(var27, 12);
                     var33 |= 4096;
                     break;
                  case 13:
                     var35 = var28.C(var27, 13);
                     var33 |= 8192;
                     break;
                  case 14:
                     var8 = var28.n(var27, 14, MessageFrameSerializer.INSTANCE, var8) as MessageFrame;
                     var33 |= 16384;
                     break;
                  case 15:
                     var40 = var28.n(var27, 15, n0.a, var40) as Int;
                     var33 |= 32768;
                     break;
                  case 16:
                     var38 = var28.n(var27, 16, Truncation.$serializer.INSTANCE, var38) as Truncation;
                     var33 |= 65536;
                     break;
                  case 17:
                     var31 = var28.n(var27, 17, BackgroundHighlight.$serializer.INSTANCE, var31) as BackgroundHighlight;
                     var33 |= 131072;
                     break;
                  case 18:
                     var43 = var28.y(var27, 18, SwipeActionsType.Serializer.INSTANCE, var43) as SwipeActionsType;
                     var33 |= 262144;
                     break;
                  case 19:
                     var11 = var28.n(var27, 19, var23[19], var11) as MessageContextType;
                     var33 |= 524288;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var25 = var38;
            var23 = (KSerializer[])var40;
            var38 = var11;
            var6 = var4;
            var31 = var43;
            var40 = var31;
            var43 = var8;
            var4 = var35;
            var11 = var48;
            var8 = (java.lang.String)var15;
            var15 = var46;
            var5 = var33;
         }

         var28.c(var27);
         return new MessageRow(
            var5,
            var3,
            (ChangeType)var18,
            (java.lang.Boolean)var19,
            (java.lang.Boolean)var20,
            var24,
            (java.lang.Boolean)var21,
            (java.lang.Boolean)var15,
            (java.lang.Boolean)var14,
            var8,
            var22,
            var11,
            (ReactionsTheme)var16,
            (boolean)var6,
            (boolean)var4,
            (MessageFrame)var43,
            var23,
            (Truncation)var25,
            (BackgroundHighlight)var40,
            (SwipeActionsType)var31,
            (MessageContextType)var38,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MessageRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageRow.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
