package com.discord.chat.bridge.row

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.h
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
      val var15: Int = Integer.hashCode(this.index);
      val var16: Int = this.changeType.hashCode();
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
                                                                                                                                                               var15
                                                                                                                                                                     * 31
                                                                                                                                                                  + var16
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
      val var9: ChangeType = this.changeType;
      val var3: java.lang.Boolean = this.jumped;
      val var16: MessageBase = this.message;
      val var20: java.lang.Boolean = this.canAddNewReactions;
      val var12: java.lang.String = this.addReactionLabel;
      val var11: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var13: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var6: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.renderContentOnly;
      val var10: MessageFrame = this.messageFrame;
      val var17: Int = this.reactTag;
      val var8: Truncation = this.truncation;
      val var7: BackgroundHighlight = this.backgroundHighlight;
      val var14: SwipeActionsType = this.swipeActions;
      val var4: MessageContextType = this.contextType;
      val var5: java.lang.String = this.replyAccessibilityLabel;
      val var19: java.lang.String = this.forwardAccessibilityLabel;
      val var15: java.lang.String = this.threadAccessibilityLabel;
      val var18: StringBuilder = new StringBuilder();
      var18.append("MessageRow(index=");
      var18.append(var1);
      var18.append(", changeType=");
      var18.append(var9);
      var18.append(", jumped=");
      var18.append(var3);
      var18.append(", message=");
      var18.append(var16);
      var18.append(", canAddNewReactions=");
      var18.append(var20);
      var18.append(", addReactionLabel=");
      var18.append(var12);
      var18.append(", addNewReactionAccessibilityLabel=");
      var18.append(var11);
      var18.append(", addNewBurstReactionAccessibilityLabel=");
      var18.append(var13);
      var18.append(", reactionsTheme=");
      var18.append(var6);
      var18.append(", renderContentOnly=");
      var18.append(var2);
      var18.append(", messageFrame=");
      var18.append(var10);
      var18.append(", reactTag=");
      var18.append(var17);
      var18.append(", truncation=");
      var18.append(var8);
      var18.append(", backgroundHighlight=");
      var18.append(var7);
      var18.append(", swipeActions=");
      var18.append(var14);
      var18.append(", contextType=");
      var18.append(var4);
      var18.append(", replyAccessibilityLabel=");
      var18.append(var5);
      var18.append(", forwardAccessibilityLabel=");
      var18.append(var19);
      var18.append(", threadAccessibilityLabel=");
      var18.append(var15);
      var18.append(")");
      return var18.toString();
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
         val var9: N = N.a;
         val var4: h = h.a;
         val var11: KSerializer = a.u(h.a);
         val var2: KSerializer = a.u(var4);
         val var16: C0 = C0.a;
         return new KSerializer[]{
            var9,
            ChangeType.Serializer.INSTANCE,
            var11,
            MessageSerializer.INSTANCE,
            var2,
            a.u(C0.a),
            a.u(var16),
            a.u(var16),
            a.u(ReactionsTheme.$serializer.INSTANCE),
            var4,
            a.u(MessageFrameSerializer.INSTANCE),
            a.u(var9),
            a.u(Truncation.$serializer.INSTANCE),
            a.u(BackgroundHighlight.$serializer.INSTANCE),
            SwipeActionsType.Serializer.INSTANCE,
            a.u(var13[15]),
            a.u(var16),
            a.u(var16),
            a.u(var16)
         };
      }

      public open fun deserialize(decoder: Decoder): MessageRow {
         q.h(var1, "decoder");
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.c(var28);
         val var23: Array<KSerializer> = MessageRow.access$get$childSerializers$cp();
         var var3: Int;
         val var4: Int;
         val var5: Byte;
         var var7: java.lang.String;
         var var9: java.lang.String;
         var var12: Any;
         var var13: Any;
         var var14: java.lang.String;
         var var15: Any;
         var var16: java.lang.String;
         var var18: java.lang.String;
         var var20: Any;
         var var21: Any;
         var var22: BackgroundHighlight;
         val var24: Any;
         var var31: Any;
         var var38: Any;
         var var48: Any;
         var var51: Any;
         val var55: java.lang.String;
         if (var29.y()) {
            var3 = var29.k(var28, 0);
            var13 = var29.m(var28, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var31 = h.a;
            var15 = var29.v(var28, 2, h.a, null) as java.lang.Boolean;
            var12 = var29.m(var28, 3, MessageSerializer.INSTANCE, null) as MessageBase;
            val var10: java.lang.Boolean = var29.v(var28, 4, (DeserializationStrategy)var31, null) as java.lang.Boolean;
            var48 = C0.a;
            var14 = var29.v(var28, 5, C0.a, null) as java.lang.String;
            var16 = var29.v(var28, 6, (DeserializationStrategy)var48, null) as java.lang.String;
            var18 = var29.v(var28, 7, (DeserializationStrategy)var48, null) as java.lang.String;
            var38 = var29.v(var28, 8, ReactionsTheme.$serializer.INSTANCE, null) as ReactionsTheme;
            val var2: Byte = var29.s(var28, 9);
            var20 = var29.v(var28, 10, MessageFrameSerializer.INSTANCE, null) as MessageFrame;
            var21 = var29.v(var28, 11, N.a, null) as Int;
            var51 = var29.v(var28, 12, Truncation.$serializer.INSTANCE, null) as Truncation;
            var22 = var29.v(var28, 13, BackgroundHighlight.$serializer.INSTANCE, null) as BackgroundHighlight;
            var31 = var29.m(var28, 14, SwipeActionsType.Serializer.INSTANCE, null) as SwipeActionsType;
            val var11: MessageContextType = var29.v(var28, 15, var23[15], null) as MessageContextType;
            var7 = var29.v(var28, 16, (DeserializationStrategy)var48, null) as java.lang.String;
            var9 = var29.v(var28, 17, (DeserializationStrategy)var48, null) as java.lang.String;
            var55 = var29.v(var28, 18, (DeserializationStrategy)var48, null) as java.lang.String;
            var4 = 524287;
            var24 = var10;
            var48 = var38;
            var5 = var2;
            var38 = var51;
            var51 = var11;
         } else {
            var var35: Boolean = true;
            var3 = 0;
            var var34: Byte = 0;
            var22 = null;
            var31 = null;
            var21 = null;
            var15 = null;
            var14 = null;
            var51 = null;
            var18 = null;
            var48 = null;
            var16 = null;
            var7 = null;
            var12 = null;
            var13 = null;
            var var42: Any = null;
            var var41: Any = null;
            var9 = null;
            var38 = null;
            var20 = null;
            var var33: Int = 0;

            while (var35) {
               var var6: Int = var29.x(var28);
               switch (var6) {
                  case -1:
                     var35 = false;
                     continue;
                  case 0:
                     var3 = var29.k(var28, 0);
                     var33 |= 1;
                     continue;
                  case 1:
                     var13 = var29.m(var28, 1, ChangeType.Serializer.INSTANCE, var13) as ChangeType;
                     var33 |= 2;
                     continue;
                  case 2:
                     var42 = var29.v(var28, 2, h.a, var42) as java.lang.Boolean;
                     var33 |= 4;
                     continue;
                  case 3:
                     var41 = var29.m(var28, 3, MessageSerializer.INSTANCE, var41) as MessageBase;
                     var33 |= 8;
                     continue;
                  case 4:
                     var9 = var29.v(var28, 4, h.a, var9) as java.lang.Boolean;
                     var33 |= 16;
                     continue;
                  case 5:
                     var38 = var29.v(var28, 5, C0.a, var38) as java.lang.String;
                     var33 |= 32;
                     continue;
                  case 6:
                     var31 = var29.v(var28, 6, C0.a, var31) as java.lang.String;
                     var33 |= 64;
                     continue;
                  case 7:
                     var7 = var29.v(var28, 7, C0.a, var7) as java.lang.String;
                     var33 |= 128;
                     continue;
                  case 8:
                     var16 = var29.v(var28, 8, ReactionsTheme.$serializer.INSTANCE, var16) as ReactionsTheme;
                     var33 |= 256;
                     continue;
                  case 9:
                     var34 = var29.s(var28, 9);
                     var33 |= 512;
                     continue;
                  case 10:
                     var48 = var29.v(var28, 10, MessageFrameSerializer.INSTANCE, var48) as MessageFrame;
                     var33 |= 1024;
                     continue;
                  case 11:
                     var21 = var29.v(var28, 11, N.a, var21) as Int;
                     var33 |= 2048;
                     continue;
                  case 12:
                     var18 = var29.v(var28, 12, Truncation.$serializer.INSTANCE, var18) as Truncation;
                     var33 |= 4096;
                     continue;
                  case 13:
                     var22 = var29.v(var28, 13, BackgroundHighlight.$serializer.INSTANCE, var22) as BackgroundHighlight;
                     var33 |= 8192;
                     continue;
                  case 14:
                     var51 = var29.m(var28, 14, SwipeActionsType.Serializer.INSTANCE, var51) as SwipeActionsType;
                     var33 |= 16384;
                     continue;
                  case 15:
                     var20 = var29.v(var28, 15, var23[15], var20) as MessageContextType;
                     var33 |= 32768;
                     continue;
                  case 16:
                     var14 = var29.v(var28, 16, C0.a, var14) as java.lang.String;
                     var6 = 65536;
                     break;
                  case 17:
                     var15 = var29.v(var28, 17, C0.a, var15) as java.lang.String;
                     var6 = 131072;
                     break;
                  case 18:
                     var12 = var29.v(var28, 18, C0.a, var12) as java.lang.String;
                     var6 = 262144;
                     break;
                  default:
                     throw new n(var6);
               }

               var33 |= var6;
            }

            var55 = (java.lang.String)var12;
            var9 = (java.lang.String)var15;
            var7 = var14;
            var51 = var20;
            var31 = var51;
            var38 = var18;
            var20 = var48;
            var5 = var34;
            var48 = var16;
            var18 = var7;
            var16 = (java.lang.String)var31;
            var14 = (java.lang.String)var38;
            var24 = var9;
            var12 = var41;
            var15 = var42;
            var4 = var33;
         }

         var29.b(var28);
         return new MessageRow(
            var4,
            var3,
            (ChangeType)var13,
            (java.lang.Boolean)var15,
            (MessageBase)var12,
            (java.lang.Boolean)var24,
            var14,
            var16,
            var18,
            (ReactionsTheme)var48,
            (boolean)var5,
            (MessageFrame)var20,
            (Integer)var21,
            (Truncation)var38,
            var22,
            (SwipeActionsType)var31,
            (MessageContextType)var51,
            var7,
            var9,
            var55,
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
