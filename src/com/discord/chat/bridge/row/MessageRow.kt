package com.discord.chat.bridge.row

import cl.f
import cl.n
import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.SwipeActionsType
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameSerializer
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import com.discord.chat.presentation.root.MessageContextType
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var15: Int = Integer.hashCode(this.index);
      val var16: Int = this.changeType.hashCode();
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
                                                                                                                                                                        var15
                                                                                                                                                                              * 31
                                                                                                                                                                           + var16
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
      val var7: ChangeType = this.changeType;
      val var17: java.lang.Boolean = this.jumped;
      val var8: java.lang.Boolean = this.highlightJumpedOnceOnly;
      val var13: MessageBase = this.message;
      val var5: java.lang.Boolean = this.scrollTo;
      val var9: java.lang.Boolean = this.animated;
      val var18: java.lang.Boolean = this.canAddNewReactions;
      val var20: java.lang.String = this.addReactionLabel;
      val var12: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var4: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var14: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.isHighlight;
      val var3: Boolean = this.renderContentOnly;
      val var6: MessageFrame = this.messageFrame;
      val var21: Int = this.reactTag;
      val var15: Truncation = this.truncation;
      val var16: BackgroundHighlight = this.backgroundHighlight;
      val var11: SwipeActionsType = this.swipeActions;
      val var10: MessageContextType = this.contextType;
      val var19: StringBuilder = new StringBuilder();
      var19.append("MessageRow(index=");
      var19.append(var1);
      var19.append(", changeType=");
      var19.append(var7);
      var19.append(", jumped=");
      var19.append(var17);
      var19.append(", highlightJumpedOnceOnly=");
      var19.append(var8);
      var19.append(", message=");
      var19.append(var13);
      var19.append(", scrollTo=");
      var19.append(var5);
      var19.append(", animated=");
      var19.append(var9);
      var19.append(", canAddNewReactions=");
      var19.append(var18);
      var19.append(", addReactionLabel=");
      var19.append(var20);
      var19.append(", addNewReactionAccessibilityLabel=");
      var19.append(var12);
      var19.append(", addNewBurstReactionAccessibilityLabel=");
      var19.append(var4);
      var19.append(", reactionsTheme=");
      var19.append(var14);
      var19.append(", isHighlight=");
      var19.append(var2);
      var19.append(", renderContentOnly=");
      var19.append(var3);
      var19.append(", messageFrame=");
      var19.append(var6);
      var19.append(", reactTag=");
      var19.append(var21);
      var19.append(", truncation=");
      var19.append(var15);
      var19.append(", backgroundHighlight=");
      var19.append(var16);
      var19.append(", swipeActions=");
      var19.append(var11);
      var19.append(", contextType=");
      var19.append(var10);
      var19.append(")");
      return var19.toString();
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
         val var1: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         val var11: n0 = n0.a;
         val var4: ChangeType.Serializer = ChangeType.Serializer.INSTANCE;
         val var3: h = h.a;
         val var5: KSerializer = a.u(h.a);
         val var10: KSerializer = a.u(var3);
         val var7: MessageSerializer = MessageSerializer.INSTANCE;
         val var8: KSerializer = a.u(var3);
         val var6: KSerializer = a.u(var3);
         val var2: KSerializer = a.u(var3);
         val var9: b2 = b2.a;
         return new KSerializer[]{
            var11,
            var4,
            var5,
            var10,
            var7,
            var8,
            var6,
            var2,
            a.u(b2.a),
            a.u(var9),
            a.u(var9),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var3,
            var3,
            a.u(MessageFrameSerializer.INSTANCE),
            a.u(var11),
            a.u(Truncation.$serializer.INSTANCE),
            a.u(BackgroundHighlight.$serializer.INSTANCE),
            SwipeActionsType.Serializer.INSTANCE,
            a.u(var1[19])
         };
      }

      public open fun deserialize(decoder: Decoder): MessageRow {
         q.h(var1, "decoder");
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.c(var28);
         val var24: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         var var3: Byte;
         val var4: Int;
         var var5: Byte;
         val var6: Int;
         var var9: Any;
         var var10: Any;
         var var11: java.lang.String;
         var var14: MessageBase;
         var var15: Any;
         var var16: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         val var25: Any;
         var var32: Any;
         var var40: Any;
         var var45: Any;
         var var51: Any;
         val var54: java.lang.String;
         if (var29.y()) {
            var4 = var29.k(var28, 0);
            var18 = var29.m(var28, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var32 = h.a;
            var19 = var29.v(var28, 2, h.a, null) as java.lang.Boolean;
            var20 = var29.v(var28, 3, (DeserializationStrategy)var32, null) as java.lang.Boolean;
            var14 = var29.m(var28, 4, MessageSerializer.INSTANCE, null) as MessageBase;
            var21 = var29.v(var28, 5, (DeserializationStrategy)var32, null) as java.lang.Boolean;
            var15 = var29.v(var28, 6, (DeserializationStrategy)var32, null) as java.lang.Boolean;
            var25 = var29.v(var28, 7, (DeserializationStrategy)var32, null) as java.lang.Boolean;
            var32 = b2.a;
            var40 = var29.v(var28, 8, b2.a, null) as java.lang.String;
            var45 = var29.v(var28, 9, (DeserializationStrategy)var32, null) as java.lang.String;
            var11 = var29.v(var28, 10, (DeserializationStrategy)var32, null) as java.lang.String;
            var16 = var29.v(var28, 11, ReactionsTheme.$serializer.INSTANCE, null) as ReactionsTheme;
            var5 = var29.s(var28, 12);
            val var2: Byte = var29.s(var28, 13);
            var51 = var29.v(var28, 14, MessageFrameSerializer.INSTANCE, null) as MessageFrame;
            val var13: Int = var29.v(var28, 15, n0.a, null) as Int;
            var10 = var29.v(var28, 16, Truncation.$serializer.INSTANCE, null) as Truncation;
            var9 = var29.v(var28, 17, BackgroundHighlight.$serializer.INSTANCE, null) as BackgroundHighlight;
            var32 = var29.m(var28, 18, SwipeActionsType.Serializer.INSTANCE, null) as SwipeActionsType;
            val var23: MessageContextType = var29.v(var28, 19, var24[19], null) as MessageContextType;
            var6 = 1048575;
            var54 = (java.lang.String)var40;
            var22 = (java.lang.String)var45;
            var3 = var2;
            var40 = var51;
            var45 = var13;
            var51 = var23;
         } else {
            var var38: Boolean = true;
            var var53: MessageBase = null;
            var22 = null;
            var21 = null;
            var20 = null;
            var19 = null;
            var51 = null;
            var15 = null;
            var14 = null;
            var var48: Any = null;
            var16 = null;
            var9 = null;
            var10 = null;
            var40 = null;
            var32 = null;
            var45 = null;
            var11 = null;
            var var34: Int = 0;
            var5 = 0;
            var var36: Byte = 0;
            var3 = 0;
            var18 = null;

            while (var38) {
               val var7: Int = var29.x(var28);
               switch (var7) {
                  case -1:
                     var38 = false;
                     break;
                  case 0:
                     var3 = var29.k(var28, 0);
                     var34 |= 1;
                     break;
                  case 1:
                     var18 = var29.m(var28, 1, ChangeType.Serializer.INSTANCE, var18) as ChangeType;
                     var34 |= 2;
                     break;
                  case 2:
                     var19 = var29.v(var28, 2, h.a, var19) as java.lang.Boolean;
                     var34 |= 4;
                     break;
                  case 3:
                     var20 = var29.v(var28, 3, h.a, var20) as java.lang.Boolean;
                     var34 |= 8;
                     break;
                  case 4:
                     var53 = var29.m(var28, 4, MessageSerializer.INSTANCE, var53) as MessageBase;
                     var34 |= 16;
                     break;
                  case 5:
                     var21 = var29.v(var28, 5, h.a, var21) as java.lang.Boolean;
                     var34 |= 32;
                     break;
                  case 6:
                     var48 = var29.v(var28, 6, h.a, var48) as java.lang.Boolean;
                     var34 |= 64;
                     break;
                  case 7:
                     var14 = var29.v(var28, 7, h.a, var14) as java.lang.Boolean;
                     var34 |= 128;
                     break;
                  case 8:
                     var15 = var29.v(var28, 8, b2.a, var15) as java.lang.String;
                     var34 |= 256;
                     break;
                  case 9:
                     var22 = var29.v(var28, 9, b2.a, var22) as java.lang.String;
                     var34 |= 512;
                     break;
                  case 10:
                     var51 = var29.v(var28, 10, b2.a, var51) as java.lang.String;
                     var34 |= 1024;
                     break;
                  case 11:
                     var16 = var29.v(var28, 11, ReactionsTheme.$serializer.INSTANCE, var16) as ReactionsTheme;
                     var34 |= 2048;
                     break;
                  case 12:
                     var36 = var29.s(var28, 12);
                     var34 |= 4096;
                     break;
                  case 13:
                     var5 = var29.s(var28, 13);
                     var34 |= 8192;
                     break;
                  case 14:
                     var9 = var29.v(var28, 14, MessageFrameSerializer.INSTANCE, var9) as MessageFrame;
                     var34 |= 16384;
                     break;
                  case 15:
                     var10 = var29.v(var28, 15, n0.a, var10) as Int;
                     var34 |= 32768;
                     break;
                  case 16:
                     var40 = var29.v(var28, 16, Truncation.$serializer.INSTANCE, var40) as Truncation;
                     var34 |= 65536;
                     break;
                  case 17:
                     var32 = var29.v(var28, 17, BackgroundHighlight.$serializer.INSTANCE, var32) as BackgroundHighlight;
                     var34 |= 131072;
                     break;
                  case 18:
                     var45 = var29.m(var28, 18, SwipeActionsType.Serializer.INSTANCE, var45) as SwipeActionsType;
                     var34 |= 262144;
                     break;
                  case 19:
                     var11 = var29.v(var28, 19, var24[19], var11) as MessageContextType;
                     var34 |= 524288;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var40 = var9;
            var5 = var36;
            var4 = var3;
            var51 = var11;
            var32 = var45;
            var9 = var32;
            var10 = var40;
            var45 = var10;
            var3 = var5;
            var11 = (java.lang.String)var51;
            var54 = (java.lang.String)var15;
            var25 = var14;
            var15 = var48;
            var14 = var53;
            var6 = var34;
         }

         var29.b(var28);
         return new MessageRow(
            var6,
            var4,
            (ChangeType)var18,
            (java.lang.Boolean)var19,
            (java.lang.Boolean)var20,
            var14,
            (java.lang.Boolean)var21,
            (java.lang.Boolean)var15,
            (java.lang.Boolean)var25,
            var54,
            var22,
            var11,
            (ReactionsTheme)var16,
            (boolean)var5,
            (boolean)var3,
            (MessageFrame)var40,
            (Integer)var45,
            (Truncation)var10,
            (BackgroundHighlight)var9,
            (SwipeActionsType)var32,
            (MessageContextType)var51,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MessageRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MessageRow.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
