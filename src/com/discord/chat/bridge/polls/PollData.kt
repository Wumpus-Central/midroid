package com.discord.chat.bridge.polls

import bl.b2
import bl.g0
import bl.h
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

@f
public data class PollData(resources: PollResources,
   question: PollMedia,
   answers: List<PollAnswer>,
   answersInteraction: PollChatAnswerInteractionType,
   answerTapAccessibilityLabel: String? = null,
   layoutType: PollLayoutType,
   canSelectMultipleAnswers: Boolean = false,
   canTapAnswers: Boolean,
   canShowVoteCounts: Boolean,
   hasVoted: Boolean,
   isExpired: Boolean,
   containerStyle: String = "normal",
   myAvatarUrl: String? = null,
   secondaryAction: PollAction? = null,
   primaryAction: PollAction? = null,
   tertiaryAction: PollAction? = ...,
   promptLabel: String? = null
) {
   public final val answerTapAccessibilityLabel: String?
   public final val answers: List<PollAnswer>
   public final val answersInteraction: PollChatAnswerInteractionType
   public final val canSelectMultipleAnswers: Boolean
   public final val canShowVoteCounts: Boolean
   public final val canTapAnswers: Boolean
   public final val containerStyle: String
   public final val hasVoted: Boolean
   public final val isExpired: Boolean
   public final val layoutType: PollLayoutType
   public final val myAvatarUrl: String?
   public final val primaryAction: PollAction?
   public final val promptLabel: String?
   public final val question: PollMedia
   public final val resources: PollResources
   public final val secondaryAction: PollAction?
   public final val tertiaryAction: PollAction?

   init {
      q.h(var1, "resources");
      q.h(var2, "question");
      q.h(var3, "answers");
      q.h(var4, "answersInteraction");
      q.h(var6, "layoutType");
      q.h(var12, "containerStyle");
      super();
      this.resources = var1;
      this.question = var2;
      this.answers = var3;
      this.answersInteraction = var4;
      this.answerTapAccessibilityLabel = var5;
      this.layoutType = var6;
      this.canSelectMultipleAnswers = var7;
      this.canTapAnswers = var8;
      this.canShowVoteCounts = var9;
      this.hasVoted = var10;
      this.isExpired = var11;
      this.containerStyle = var12;
      this.myAvatarUrl = var13;
      this.secondaryAction = var14;
      this.primaryAction = var15;
      this.tertiaryAction = var16;
      this.promptLabel = var17;
   }

   public operator fun component1(): PollResources {
      return this.resources;
   }

   public operator fun component10(): Boolean {
      return this.hasVoted;
   }

   public operator fun component11(): Boolean {
      return this.isExpired;
   }

   public operator fun component12(): String {
      return this.containerStyle;
   }

   public operator fun component13(): String? {
      return this.myAvatarUrl;
   }

   public operator fun component14(): PollAction? {
      return this.secondaryAction;
   }

   public operator fun component15(): PollAction? {
      return this.primaryAction;
   }

   public operator fun component16(): PollAction? {
      return this.tertiaryAction;
   }

   public operator fun component17(): String? {
      return this.promptLabel;
   }

   public operator fun component2(): PollMedia {
      return this.question;
   }

   public operator fun component3(): List<PollAnswer> {
      return this.answers;
   }

   public operator fun component4(): PollChatAnswerInteractionType {
      return this.answersInteraction;
   }

   public operator fun component5(): String? {
      return this.answerTapAccessibilityLabel;
   }

   public operator fun component6(): PollLayoutType {
      return this.layoutType;
   }

   public operator fun component7(): Boolean {
      return this.canSelectMultipleAnswers;
   }

   public operator fun component8(): Boolean {
      return this.canTapAnswers;
   }

   public operator fun component9(): Boolean {
      return this.canShowVoteCounts;
   }

   public fun copy(
      resources: PollResources = var0.resources,
      question: PollMedia = var0.question,
      answers: List<PollAnswer> = var0.answers,
      answersInteraction: PollChatAnswerInteractionType = var0.answersInteraction,
      answerTapAccessibilityLabel: String? = var0.answerTapAccessibilityLabel,
      layoutType: PollLayoutType = var0.layoutType,
      canSelectMultipleAnswers: Boolean = var0.canSelectMultipleAnswers,
      canTapAnswers: Boolean = var0.canTapAnswers,
      canShowVoteCounts: Boolean = var0.canShowVoteCounts,
      hasVoted: Boolean = var0.hasVoted,
      isExpired: Boolean = var0.isExpired,
      containerStyle: String = var0.containerStyle,
      myAvatarUrl: String? = var0.myAvatarUrl,
      secondaryAction: PollAction? = var0.secondaryAction,
      primaryAction: PollAction? = var0.primaryAction,
      tertiaryAction: PollAction? = var0.tertiaryAction,
      promptLabel: String? = var0.promptLabel
   ): PollData {
      q.h(var1, "resources");
      q.h(var2, "question");
      q.h(var3, "answers");
      q.h(var4, "answersInteraction");
      q.h(var6, "layoutType");
      q.h(var12, "containerStyle");
      return new PollData(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.resources, var1.resources)) {
            return false;
         } else if (!q.c(this.question, var1.question)) {
            return false;
         } else if (!q.c(this.answers, var1.answers)) {
            return false;
         } else if (this.answersInteraction != var1.answersInteraction) {
            return false;
         } else if (!q.c(this.answerTapAccessibilityLabel, var1.answerTapAccessibilityLabel)) {
            return false;
         } else if (this.layoutType != var1.layoutType) {
            return false;
         } else if (this.canSelectMultipleAnswers != var1.canSelectMultipleAnswers) {
            return false;
         } else if (this.canTapAnswers != var1.canTapAnswers) {
            return false;
         } else if (this.canShowVoteCounts != var1.canShowVoteCounts) {
            return false;
         } else if (this.hasVoted != var1.hasVoted) {
            return false;
         } else if (this.isExpired != var1.isExpired) {
            return false;
         } else if (!q.c(this.containerStyle, var1.containerStyle)) {
            return false;
         } else if (!q.c(this.myAvatarUrl, var1.myAvatarUrl)) {
            return false;
         } else if (!q.c(this.secondaryAction, var1.secondaryAction)) {
            return false;
         } else if (!q.c(this.primaryAction, var1.primaryAction)) {
            return false;
         } else if (!q.c(this.tertiaryAction, var1.tertiaryAction)) {
            return false;
         } else {
            return q.c(this.promptLabel, var1.promptLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = this.resources.hashCode();
      val var7: Int = this.question.hashCode();
      val var9: Int = this.answers.hashCode();
      val var8: Int = this.answersInteraction.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.answerTapAccessibilityLabel == null) {
         var1 = 0;
      } else {
         var1 = this.answerTapAccessibilityLabel.hashCode();
      }

      val var13: Int = this.layoutType.hashCode();
      val var15: Int = java.lang.Boolean.hashCode(this.canSelectMultipleAnswers);
      val var14: Int = java.lang.Boolean.hashCode(this.canTapAnswers);
      val var17: Int = java.lang.Boolean.hashCode(this.canShowVoteCounts);
      val var16: Int = java.lang.Boolean.hashCode(this.hasVoted);
      val var12: Int = java.lang.Boolean.hashCode(this.isExpired);
      val var11: Int = this.containerStyle.hashCode();
      val var2: Int;
      if (this.myAvatarUrl == null) {
         var2 = 0;
      } else {
         var2 = this.myAvatarUrl.hashCode();
      }

      val var3: Int;
      if (this.secondaryAction == null) {
         var3 = 0;
      } else {
         var3 = this.secondaryAction.hashCode();
      }

      val var4: Int;
      if (this.primaryAction == null) {
         var4 = 0;
      } else {
         var4 = this.primaryAction.hashCode();
      }

      val var5: Int;
      if (this.tertiaryAction == null) {
         var5 = 0;
      } else {
         var5 = this.tertiaryAction.hashCode();
      }

      if (this.promptLabel != null) {
         var6 = this.promptLabel.hashCode();
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
                                                                                                                           ((var10 * 31 + var7) * 31 + var9)
                                                                                                                                 * 31
                                                                                                                              + var8
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var1
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var13
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var15
                                                                                             )
                                                                                             * 31
                                                                                          + var14
                                                                                    )
                                                                                    * 31
                                                                                 + var17
                                                                           )
                                                                           * 31
                                                                        + var16
                                                                  )
                                                                  * 31
                                                               + var12
                                                         )
                                                         * 31
                                                      + var11
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
         + var6;
   }

   public override fun toString(): String {
      val var14: PollResources = this.resources;
      val var12: PollMedia = this.question;
      val var10: java.util.List = this.answers;
      val var13: PollChatAnswerInteractionType = this.answersInteraction;
      val var15: java.lang.String = this.answerTapAccessibilityLabel;
      val var7: PollLayoutType = this.layoutType;
      val var4: Boolean = this.canSelectMultipleAnswers;
      val var5: Boolean = this.canTapAnswers;
      val var1: Boolean = this.canShowVoteCounts;
      val var3: Boolean = this.hasVoted;
      val var2: Boolean = this.isExpired;
      val var6: java.lang.String = this.containerStyle;
      val var17: java.lang.String = this.myAvatarUrl;
      val var8: PollAction = this.secondaryAction;
      val var16: PollAction = this.primaryAction;
      val var11: PollAction = this.tertiaryAction;
      val var9: java.lang.String = this.promptLabel;
      val var18: StringBuilder = new StringBuilder();
      var18.append("PollData(resources=");
      var18.append(var14);
      var18.append(", question=");
      var18.append(var12);
      var18.append(", answers=");
      var18.append(var10);
      var18.append(", answersInteraction=");
      var18.append(var13);
      var18.append(", answerTapAccessibilityLabel=");
      var18.append(var15);
      var18.append(", layoutType=");
      var18.append(var7);
      var18.append(", canSelectMultipleAnswers=");
      var18.append(var4);
      var18.append(", canTapAnswers=");
      var18.append(var5);
      var18.append(", canShowVoteCounts=");
      var18.append(var1);
      var18.append(", hasVoted=");
      var18.append(var3);
      var18.append(", isExpired=");
      var18.append(var2);
      var18.append(", containerStyle=");
      var18.append(var6);
      var18.append(", myAvatarUrl=");
      var18.append(var17);
      var18.append(", secondaryAction=");
      var18.append(var8);
      var18.append(", primaryAction=");
      var18.append(var16);
      var18.append(", tertiaryAction=");
      var18.append(var11);
      var18.append(", promptLabel=");
      var18.append(var9);
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
         val var0: PollData.$serializer = new PollData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollData", var0, 17);
         var1.l("resources", false);
         var1.l("question", false);
         var1.l("answers", false);
         var1.l("answersInteraction", false);
         var1.l("answerTapAccessibilityLabel", true);
         var1.l("layoutType", false);
         var1.l("canSelectMultipleAnswers", true);
         var1.l("canTapAnswers", false);
         var1.l("canShowVoteCounts", false);
         var1.l("hasVoted", false);
         var1.l("isExpired", false);
         var1.l("containerStyle", true);
         var1.l("myAvatarUrl", true);
         var1.l("secondaryAction", true);
         var1.l("primaryAction", true);
         var1.l("tertiaryAction", true);
         var1.l("promptLabel", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: Array<KSerializer> = PollData.access$get$childSerializers$cp();
         val var2: PollResources.$serializer = PollResources.$serializer.INSTANCE;
         val var1: PollMedia.$serializer = PollMedia.$serializer.INSTANCE;
         val var5: KSerializer = var3[2];
         val var7: PollChatAnswerInteractionType.Serializer = PollChatAnswerInteractionType.Serializer.INSTANCE;
         val var8: b2 = b2.a;
         val var11: KSerializer = a.u(b2.a);
         val var9: PollLayoutType.Serializer = PollLayoutType.Serializer.INSTANCE;
         val var4: h = h.a;
         val var6: KSerializer = a.u(var8);
         val var10: PollAction.$serializer = PollAction.$serializer.INSTANCE;
         return new KSerializer[]{
            var2,
            var1,
            var5,
            var7,
            var11,
            var9,
            var4,
            var4,
            var4,
            var4,
            var4,
            var8,
            var6,
            a.u(PollAction.$serializer.INSTANCE),
            a.u(var10),
            a.u(var10),
            a.u(var8)
         };
      }

      public open fun deserialize(decoder: Decoder): PollData {
         q.h(var1, "decoder");
         val var26: SerialDescriptor = this.getDescriptor();
         val var27: c = var1.c(var26);
         val var23: Array<KSerializer> = PollData.access$get$childSerializers$cp();
         var var5: Boolean = var27.y();
         var var28: PollResources = null;
         var var2: Int;
         var var7: Boolean;
         var var8: Boolean;
         var var9: Boolean;
         val var10: Boolean;
         var var19: Any;
         var var20: Any;
         var var21: PollChatAnswerInteractionType;
         var var22: PollLayoutType;
         var var37: Any;
         var var39: Any;
         var var42: Any;
         var var44: Any;
         var var47: Any;
         var var49: Any;
         var var51: Any;
         val var53: PollResources;
         if (var5) {
            var49 = var27.m(var26, 0, PollResources.$serializer.INSTANCE, null) as PollResources;
            var19 = var27.m(var26, 1, PollMedia.$serializer.INSTANCE, null) as PollMedia;
            var20 = var27.m(var26, 2, var23[2], null) as java.util.List;
            var21 = var27.m(var26, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, null) as PollChatAnswerInteractionType;
            var37 = b2.a;
            var39 = var27.v(var26, 4, b2.a, null) as java.lang.String;
            var47 = var27.m(var26, 5, PollLayoutType.Serializer.INSTANCE, null) as PollLayoutType;
            var9 = var27.s(var26, 6);
            var7 = var27.s(var26, 7);
            var8 = var27.s(var26, 8);
            val var6: Boolean = var27.s(var26, 9);
            var5 = var27.s(var26, 10);
            var51 = var27.t(var26, 11);
            val var24: java.lang.String = var27.v(var26, 12, (DeserializationStrategy)var37, null) as java.lang.String;
            val var29: PollAction.$serializer = PollAction.$serializer.INSTANCE;
            var44 = var27.v(var26, 13, PollAction.$serializer.INSTANCE, null) as PollAction;
            var42 = var27.v(var26, 14, var29, null) as PollAction;
            val var30: PollAction = var27.v(var26, 15, var29, null) as PollAction;
            var37 = var27.v(var26, 16, (DeserializationStrategy)var37, null) as java.lang.String;
            var2 = 131071;
            var53 = (PollResources)var49;
            var49 = var39;
            var22 = (PollLayoutType)var47;
            var10 = var6;
            var39 = var51;
            var51 = var24;
            var47 = var44;
            var44 = var42;
            var42 = var30;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = false;
            var8 = false;
            var7 = false;
            var var34: Boolean = false;
            var5 = false;
            var22 = null;
            var21 = null;
            var20 = null;
            var19 = null;
            var39 = null;
            var51 = null;
            var49 = null;
            var47 = null;
            var44 = null;
            var37 = null;
            var42 = null;

            while (var3) {
               var var4: Int = var27.x(var26);
               switch (var4) {
                  case -1:
                     var3 = false;
                     continue;
                  case 0:
                     var28 = var27.m(var26, 0, PollResources.$serializer.INSTANCE, var28) as PollResources;
                     var2 |= 1;
                     continue;
                  case 1:
                     var19 = var27.m(var26, 1, PollMedia.$serializer.INSTANCE, var19) as PollMedia;
                     var2 |= 2;
                     continue;
                  case 2:
                     var20 = var27.m(var26, 2, var23[2], var20) as java.util.List;
                     var2 |= 4;
                     continue;
                  case 3:
                     var21 = var27.m(var26, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, var21) as PollChatAnswerInteractionType;
                     var2 |= 8;
                     continue;
                  case 4:
                     var44 = var27.v(var26, 4, b2.a, var44) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var22 = var27.m(var26, 5, PollLayoutType.Serializer.INSTANCE, var22) as PollLayoutType;
                     var2 |= 32;
                     continue;
                  case 6:
                     var34 = var27.s(var26, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var7 = var27.s(var26, 7);
                     var2 |= 128;
                     continue;
                  case 8:
                     var5 = var27.s(var26, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var8 = var27.s(var26, 9);
                     var2 |= 512;
                     continue;
                  case 10:
                     var9 = var27.s(var26, 10);
                     var2 |= 1024;
                     continue;
                  case 11:
                     var42 = var27.t(var26, 11);
                     var2 |= 2048;
                     continue;
                  case 12:
                     var47 = var27.v(var26, 12, b2.a, var47) as java.lang.String;
                     var2 |= 4096;
                     continue;
                  case 13:
                     var49 = var27.v(var26, 13, PollAction.$serializer.INSTANCE, var49) as PollAction;
                     var2 |= 8192;
                     continue;
                  case 14:
                     var51 = var27.v(var26, 14, PollAction.$serializer.INSTANCE, var51) as PollAction;
                     var2 |= 16384;
                     continue;
                  case 15:
                     var37 = var27.v(var26, 15, PollAction.$serializer.INSTANCE, var37) as PollAction;
                     var4 = 32768;
                     break;
                  case 16:
                     var39 = var27.v(var26, 16, b2.a, var39) as java.lang.String;
                     var4 = 65536;
                     break;
                  default:
                     throw new n(var4);
               }

               var2 |= var4;
            }

            var51 = var47;
            var49 = var44;
            var37 = var39;
            var42 = var37;
            var44 = var51;
            var47 = var49;
            var39 = var42;
            var5 = var9;
            var10 = var8;
            var8 = var5;
            var9 = var34;
            var53 = var28;
         }

         var27.b(var26);
         return new PollData(
            var2,
            var53,
            (PollMedia)var19,
            (java.util.List)var20,
            var21,
            (java.lang.String)var49,
            var22,
            var9,
            var7,
            var8,
            var10,
            var5,
            (java.lang.String)var39,
            (java.lang.String)var51,
            (PollAction)var47,
            (PollAction)var44,
            (PollAction)var42,
            (java.lang.String)var37,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PollData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PollData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollData> {
         return PollData.$serializer.INSTANCE;
      }
   }
}
