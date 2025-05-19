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
import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
import kotlin.jvm.internal.q
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
      message: MessageBase,
      canAddNewReactions: Boolean? = null,
      addReactionLabel: String? = null,
      addNewReactionAccessibilityLabel: String? = null,
      addNewBurstReactionAccessibilityLabel: String? = null,
      reactionsTheme: ReactionsTheme? = null,
      renderContentOnly: Boolean = false,
      messageFrame: MessageFrame? = null,
      reactTag: Int? = null,
      truncation: Truncation? = null,
      backgroundHighlight: BackgroundHighlight? = null,
      swipeActions: SwipeActionsType = SwipeActionsType.NONE,
      contextType: MessageContextType? = ...,
      replyAccessibilityLabel: String? = ...,
      forwardAccessibilityLabel: String? = ...,
      threadAccessibilityLabel: String? = null
   )
   : Row {
   public final val addNewBurstReactionAccessibilityLabel: String?
   public final val addNewReactionAccessibilityLabel: String?
   public final val addReactionLabel: String?
   public final val backgroundHighlight: BackgroundHighlight?
   public final val canAddNewReactions: Boolean?
   public open val changeType: ChangeType
   public final val contextType: MessageContextType?
   public final val forwardAccessibilityLabel: String?
   public open val index: Int
   public final val jumped: Boolean?

   @f(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   public final val messageFrame: MessageFrame?
   public final val reactTag: Int?
   public final val reactionsTheme: ReactionsTheme?
   public final val renderContentOnly: Boolean
   public final val replyAccessibilityLabel: String?
   public final val swipeActions: SwipeActionsType
   public final val threadAccessibilityLabel: String?
   public final val truncation: Truncation?

   init {
      q.h(var2, "changeType");
      q.h(var4, "message");
      q.h(var15, "swipeActions");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.jumped = var3;
      this.message = var4;
      this.canAddNewReactions = var5;
      this.addReactionLabel = var6;
      this.addNewReactionAccessibilityLabel = var7;
      this.addNewBurstReactionAccessibilityLabel = var8;
      this.reactionsTheme = var9;
      this.renderContentOnly = var10;
      this.messageFrame = var11;
      this.reactTag = var12;
      this.truncation = var13;
      this.backgroundHighlight = var14;
      this.swipeActions = var15;
      this.contextType = var16;
      this.replyAccessibilityLabel = var17;
      this.forwardAccessibilityLabel = var18;
      this.threadAccessibilityLabel = var19;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component10(): Boolean {
      return this.renderContentOnly;
   }

   public operator fun component11(): MessageFrame? {
      return this.messageFrame;
   }

   public operator fun component12(): Int? {
      return this.reactTag;
   }

   public operator fun component13(): Truncation? {
      return this.truncation;
   }

   public operator fun component14(): BackgroundHighlight? {
      return this.backgroundHighlight;
   }

   public operator fun component15(): SwipeActionsType {
      return this.swipeActions;
   }

   public operator fun component16(): MessageContextType? {
      return this.contextType;
   }

   public operator fun component17(): String? {
      return this.replyAccessibilityLabel;
   }

   public operator fun component18(): String? {
      return this.forwardAccessibilityLabel;
   }

   public operator fun component19(): String? {
      return this.threadAccessibilityLabel;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): Boolean? {
      return this.jumped;
   }

   public operator fun component4(): MessageBase {
      return this.message;
   }

   public operator fun component5(): Boolean? {
      return this.canAddNewReactions;
   }

   public operator fun component6(): String? {
      return this.addReactionLabel;
   }

   public operator fun component7(): String? {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component8(): String? {
      return this.addNewBurstReactionAccessibilityLabel;
   }

   public operator fun component9(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public fun copy(
      index: Int = var0.index,
      changeType: ChangeType = var0.changeType,
      jumped: Boolean? = var0.jumped,
      message: MessageBase = var0.message,
      canAddNewReactions: Boolean? = var0.canAddNewReactions,
      addReactionLabel: String? = var0.addReactionLabel,
      addNewReactionAccessibilityLabel: String? = var0.addNewReactionAccessibilityLabel,
      addNewBurstReactionAccessibilityLabel: String? = var0.addNewBurstReactionAccessibilityLabel,
      reactionsTheme: ReactionsTheme? = var0.reactionsTheme,
      renderContentOnly: Boolean = var0.renderContentOnly,
      messageFrame: MessageFrame? = var0.messageFrame,
      reactTag: Int? = var0.reactTag,
      truncation: Truncation? = var0.truncation,
      backgroundHighlight: BackgroundHighlight? = var0.backgroundHighlight,
      swipeActions: SwipeActionsType = var0.swipeActions,
      contextType: MessageContextType? = var0.contextType,
      replyAccessibilityLabel: String? = var0.replyAccessibilityLabel,
      forwardAccessibilityLabel: String? = var0.forwardAccessibilityLabel,
      threadAccessibilityLabel: String? = var0.threadAccessibilityLabel
   ): MessageRow {
      q.h(var2, "changeType");
      q.h(var4, "message");
      q.h(var15, "swipeActions");
      return new MessageRow(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
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
         } else if (!q.c(this.message, var1.message)) {
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
         } else if (this.contextType != var1.contextType) {
            return false;
         } else if (!q.c(this.replyAccessibilityLabel, var1.replyAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.forwardAccessibilityLabel, var1.forwardAccessibilityLabel)) {
            return false;
         } else {
            return q.c(this.threadAccessibilityLabel, var1.threadAccessibilityLabel);
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

      val var17: Int = this.message.hashCode();
      val var2: Int;
      if (this.canAddNewReactions == null) {
         var2 = 0;
      } else {
         var2 = this.canAddNewReactions.hashCode();
      }

      val var3: Int;
      if (this.addReactionLabel == null) {
         var3 = 0;
      } else {
         var3 = this.addReactionLabel.hashCode();
      }

      val var4: Int;
      if (this.addNewReactionAccessibilityLabel == null) {
         var4 = 0;
      } else {
         var4 = this.addNewReactionAccessibilityLabel.hashCode();
      }

      val var5: Int;
      if (this.addNewBurstReactionAccessibilityLabel == null) {
         var5 = 0;
      } else {
         var5 = this.addNewBurstReactionAccessibilityLabel.hashCode();
      }

      val var6: Int;
      if (this.reactionsTheme == null) {
         var6 = 0;
      } else {
         var6 = this.reactionsTheme.hashCode();
      }

      val var18: Int = java.lang.Boolean.hashCode(this.renderContentOnly);
      val var7: Int;
      if (this.messageFrame == null) {
         var7 = 0;
      } else {
         var7 = this.messageFrame.hashCode();
      }

      val var8: Int;
      if (this.reactTag == null) {
         var8 = 0;
      } else {
         var8 = this.reactTag.hashCode();
      }

      val var9: Int;
      if (this.truncation == null) {
         var9 = 0;
      } else {
         var9 = this.truncation.hashCode();
      }

      val var10: Int;
      if (this.backgroundHighlight == null) {
         var10 = 0;
      } else {
         var10 = this.backgroundHighlight.hashCode();
      }

      val var19: Int = this.swipeActions.hashCode();
      val var11: Int;
      if (this.contextType == null) {
         var11 = 0;
      } else {
         var11 = this.contextType.hashCode();
      }

      val var12: Int;
      if (this.replyAccessibilityLabel == null) {
         var12 = 0;
      } else {
         var12 = this.replyAccessibilityLabel.hashCode();
      }

      val var13: Int;
      if (this.forwardAccessibilityLabel == null) {
         var13 = 0;
      } else {
         var13 = this.forwardAccessibilityLabel.hashCode();
      }

      if (this.threadAccessibilityLabel != null) {
         var14 = this.threadAccessibilityLabel.hashCode();
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
                                                                                                                                                               var16
                                                                                                                                                                     * 31
                                                                                                                                                                  + var15
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var1
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var17
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var2
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
                                                                                          + var18
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
                                             + var19
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
         + var14;
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var11: ChangeType = this.changeType;
      val var8: java.lang.Boolean = this.jumped;
      val var18: MessageBase = this.message;
      val var15: java.lang.Boolean = this.canAddNewReactions;
      val var20: java.lang.String = this.addReactionLabel;
      val var7: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var10: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var16: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.renderContentOnly;
      val var4: MessageFrame = this.messageFrame;
      val var5: Int = this.reactTag;
      val var17: Truncation = this.truncation;
      val var9: BackgroundHighlight = this.backgroundHighlight;
      val var3: SwipeActionsType = this.swipeActions;
      val var14: MessageContextType = this.contextType;
      val var19: java.lang.String = this.replyAccessibilityLabel;
      val var6: java.lang.String = this.forwardAccessibilityLabel;
      val var12: java.lang.String = this.threadAccessibilityLabel;
      val var13: StringBuilder = new StringBuilder();
      var13.append("MessageRow(index=");
      var13.append(var1);
      var13.append(", changeType=");
      var13.append(var11);
      var13.append(", jumped=");
      var13.append(var8);
      var13.append(", message=");
      var13.append(var18);
      var13.append(", canAddNewReactions=");
      var13.append(var15);
      var13.append(", addReactionLabel=");
      var13.append(var20);
      var13.append(", addNewReactionAccessibilityLabel=");
      var13.append(var7);
      var13.append(", addNewBurstReactionAccessibilityLabel=");
      var13.append(var10);
      var13.append(", reactionsTheme=");
      var13.append(var16);
      var13.append(", renderContentOnly=");
      var13.append(var2);
      var13.append(", messageFrame=");
      var13.append(var4);
      var13.append(", reactTag=");
      var13.append(var5);
      var13.append(", truncation=");
      var13.append(var17);
      var13.append(", backgroundHighlight=");
      var13.append(var9);
      var13.append(", swipeActions=");
      var13.append(var3);
      var13.append(", contextType=");
      var13.append(var14);
      var13.append(", replyAccessibilityLabel=");
      var13.append(var19);
      var13.append(", forwardAccessibilityLabel=");
      var13.append(var6);
      var13.append(", threadAccessibilityLabel=");
      var13.append(var12);
      var13.append(")");
      return var13.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageRow.$serializer = new MessageRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("1", var0, 19);
         var1.l("index", false);
         var1.l("changeType", false);
         var1.l("jumped", true);
         var1.l("message", false);
         var1.l("canAddNewReactions", true);
         var1.l("addReactionLabel", true);
         var1.l("addNewReactionAccessibilityLabel", true);
         var1.l("addNewBurstReactionAccessibilityLabel", true);
         var1.l("reactionsTheme", true);
         var1.l("renderContentOnly", true);
         var1.l("messageFrame", true);
         var1.l("reactTag", true);
         var1.l("truncation", true);
         var1.l("backgroundHighlight", true);
         var1.l("swipeActions", true);
         var1.l("contextType", true);
         var1.l("replyAccessibilityLabel", true);
         var1.l("forwardAccessibilityLabel", true);
         var1.l("threadAccessibilityLabel", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var13: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         val var7: N = N.a;
         val var4: h = h.a;
         val var12: KSerializer = a.u(h.a);
         val var3: KSerializer = a.u(var4);
         val var15: C0 = C0.a;
         return new KSerializer[]{
            var7,
            ChangeType.Serializer.INSTANCE,
            var12,
            MessageSerializer.INSTANCE,
            var3,
            a.u(C0.a),
            a.u(var15),
            a.u(var15),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var4,
            a.u(MessageFrameSerializer.INSTANCE),
            a.u(var7),
            a.u(Truncation.$serializer.INSTANCE),
            a.u(BackgroundHighlight.$serializer.INSTANCE),
            SwipeActionsType.Serializer.INSTANCE,
            a.u(var13[15]),
            a.u(var15),
            a.u(var15),
            a.u(var15)
         };
      }

      public open fun deserialize(decoder: Decoder): MessageRow {
         q.h(var1, "decoder");
         val var27: SerialDescriptor = this.getDescriptor();
         val var28: c = var1.c(var27);
         var var23: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         var var3: Byte;
         val var4: Int;
         val var5: Int;
         var var7: java.lang.String;
         var var13: java.lang.String;
         var var14: Any;
         var var17: java.lang.String;
         var var18: Any;
         var var19: java.lang.String;
         var var20: Any;
         var var21: Any;
         var var22: BackgroundHighlight;
         val var24: Any;
         val var25: Any;
         val var31: java.lang.String;
         var var40: Any;
         var var45: Any;
         var var49: Any;
         var var51: java.lang.String;
         if (var28.y()) {
            var4 = var28.k(var27, 0);
            var14 = var28.m(var27, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            val var29: h = h.a;
            var18 = var28.v(var27, 2, h.a, null) as java.lang.Boolean;
            var45 = var28.m(var27, 3, MessageSerializer.INSTANCE, null) as MessageBase;
            val var11: java.lang.Boolean = var28.v(var27, 4, var29, null) as java.lang.Boolean;
            val var16: C0 = C0.a;
            var17 = var28.v(var27, 5, C0.a, null) as java.lang.String;
            var13 = var28.v(var27, 6, var16, null) as java.lang.String;
            var19 = var28.v(var27, 7, var16, null) as java.lang.String;
            var40 = var28.v(var27, 8, ReactionsTheme.$serializer.INSTANCE, null) as ReactionsTheme;
            val var2: Byte = var28.s(var27, 9);
            var49 = var28.v(var27, 10, MessageFrameSerializer.INSTANCE, null) as MessageFrame;
            var21 = var28.v(var27, 11, N.a, null) as Int;
            var20 = var28.v(var27, 12, Truncation.$serializer.INSTANCE, null) as Truncation;
            var22 = var28.v(var27, 13, BackgroundHighlight.$serializer.INSTANCE, null) as BackgroundHighlight;
            val var30: SwipeActionsType = var28.m(var27, 14, SwipeActionsType.Serializer.INSTANCE, null) as SwipeActionsType;
            val var10: MessageContextType = var28.v(var27, 15, var23[15], null) as MessageContextType;
            var7 = var28.v(var27, 16, var16, null) as java.lang.String;
            val var9: java.lang.String = var28.v(var27, 17, var16, null) as java.lang.String;
            val var26: java.lang.String = var28.v(var27, 18, var16, null) as java.lang.String;
            var5 = 524287;
            var23 = (KSerializer[])var45;
            var45 = var11;
            var24 = var40;
            var3 = var2;
            var40 = var49;
            var25 = var30;
            var49 = var10;
            var51 = var9;
            var31 = var26;
         } else {
            var var36: Boolean = true;
            var3 = 0;
            var var35: Byte = 0;
            var22 = null;
            var var32: java.lang.String = null;
            var21 = null;
            var49 = null;
            var13 = null;
            var19 = null;
            var18 = null;
            var17 = null;
            var51 = null;
            var7 = null;
            var45 = null;
            var14 = null;
            var var44: Any = null;
            var var43: Any = null;
            var var42: Any = null;
            var40 = null;
            var20 = null;
            var var33: Int = 0;

            while (var36) {
               var var6: Int = var28.x(var27);
               switch (var6) {
                  case -1:
                     var36 = false;
                     continue;
                  case 0:
                     var3 = var28.k(var27, 0);
                     var33 |= 1;
                     continue;
                  case 1:
                     var14 = var28.m(var27, 1, ChangeType.Serializer.INSTANCE, var14) as ChangeType;
                     var33 |= 2;
                     continue;
                  case 2:
                     var44 = var28.v(var27, 2, h.a, var44) as java.lang.Boolean;
                     var33 |= 4;
                     continue;
                  case 3:
                     var43 = var28.m(var27, 3, MessageSerializer.INSTANCE, var43) as MessageBase;
                     var33 |= 8;
                     continue;
                  case 4:
                     var42 = var28.v(var27, 4, h.a, var42) as java.lang.Boolean;
                     var33 |= 16;
                     continue;
                  case 5:
                     var40 = var28.v(var27, 5, C0.a, var40) as java.lang.String;
                     var33 |= 32;
                     continue;
                  case 6:
                     var32 = var28.v(var27, 6, C0.a, var32) as java.lang.String;
                     var33 |= 64;
                     continue;
                  case 7:
                     var7 = var28.v(var27, 7, C0.a, var7) as java.lang.String;
                     var33 |= 128;
                     continue;
                  case 8:
                     var51 = var28.v(var27, 8, ReactionsTheme.$serializer.INSTANCE, var51) as ReactionsTheme;
                     var33 |= 256;
                     continue;
                  case 9:
                     var35 = var28.s(var27, 9);
                     var33 |= 512;
                     continue;
                  case 10:
                     var17 = var28.v(var27, 10, MessageFrameSerializer.INSTANCE, var17) as MessageFrame;
                     var33 |= 1024;
                     continue;
                  case 11:
                     var21 = var28.v(var27, 11, N.a, var21) as Int;
                     var33 |= 2048;
                     continue;
                  case 12:
                     var18 = var28.v(var27, 12, Truncation.$serializer.INSTANCE, var18) as Truncation;
                     var33 |= 4096;
                     continue;
                  case 13:
                     var22 = var28.v(var27, 13, BackgroundHighlight.$serializer.INSTANCE, var22) as BackgroundHighlight;
                     var33 |= 8192;
                     continue;
                  case 14:
                     var19 = var28.m(var27, 14, SwipeActionsType.Serializer.INSTANCE, var19) as SwipeActionsType;
                     var33 |= 16384;
                     continue;
                  case 15:
                     var20 = var28.v(var27, 15, var23[15], var20) as MessageContextType;
                     var33 |= 32768;
                     continue;
                  case 16:
                     var13 = var28.v(var27, 16, C0.a, var13) as java.lang.String;
                     var6 = 65536;
                     break;
                  case 17:
                     var49 = var28.v(var27, 17, C0.a, var49) as java.lang.String;
                     var6 = 131072;
                     break;
                  case 18:
                     var45 = var28.v(var27, 18, C0.a, var45) as java.lang.String;
                     var6 = 262144;
                     break;
                  default:
                     throw new n(var6);
               }

               var33 |= var6;
            }

            var24 = var51;
            var3 = var35;
            var31 = (java.lang.String)var45;
            var51 = (java.lang.String)var49;
            var7 = var13;
            var49 = var20;
            var25 = var19;
            var20 = var18;
            var40 = var17;
            var19 = var7;
            var13 = var32;
            var17 = (java.lang.String)var40;
            var45 = var42;
            var23 = (KSerializer[])var43;
            var18 = var44;
            var4 = var3;
            var5 = var33;
         }

         var28.b(var27);
         return new MessageRow(
            var5,
            var4,
            (ChangeType)var14,
            (java.lang.Boolean)var18,
            var23,
            (java.lang.Boolean)var45,
            var17,
            var13,
            var19,
            (ReactionsTheme)var24,
            (boolean)var3,
            (MessageFrame)var40,
            (Integer)var21,
            (Truncation)var20,
            var22,
            (SwipeActionsType)var25,
            (MessageContextType)var49,
            var7,
            var51,
            var31,
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
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
