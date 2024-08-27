package com.discord.chat.bridge.polls

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
      r.h(var1, "resources");
      r.h(var2, "question");
      r.h(var3, "answers");
      r.h(var4, "answersInteraction");
      r.h(var6, "layoutType");
      r.h(var12, "containerStyle");
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

   @JvmStatic
   public fun `write$Self`(self: PollData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, PollResources.$serializer.INSTANCE, var0.resources);
      var1.y(var2, 1, PollMedia.$serializer.INSTANCE, var0.question);
      var1.y(var2, 2, new xk.f(PollAnswer.$serializer.INSTANCE), var0.answers);
      var1.y(var2, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, var0.answersInteraction);
      var var3: Boolean;
      if (!var1.A(var2, 4) && var0.answerTapAccessibilityLabel == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.answerTapAccessibilityLabel);
      }

      var1.y(var2, 5, PollLayoutType.Serializer.INSTANCE, var0.layoutType);
      if (!var1.A(var2, 6) && !var0.canSelectMultipleAnswers) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 6, var0.canSelectMultipleAnswers);
      }

      var1.x(var2, 7, var0.canTapAnswers);
      var1.x(var2, 8, var0.canShowVoteCounts);
      var1.x(var2, 9, var0.hasVoted);
      var1.x(var2, 10, var0.isExpired);
      if (!var1.A(var2, 11) && r.c(var0.containerStyle, "normal")) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.z(var2, 11, var0.containerStyle);
      }

      if (!var1.A(var2, 12) && var0.myAvatarUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 12, a2.a, var0.myAvatarUrl);
      }

      if (!var1.A(var2, 13) && var0.secondaryAction == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 13, PollAction.$serializer.INSTANCE, var0.secondaryAction);
      }

      if (!var1.A(var2, 14) && var0.primaryAction == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 14, PollAction.$serializer.INSTANCE, var0.primaryAction);
      }

      if (!var1.A(var2, 15) && var0.tertiaryAction == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 15, PollAction.$serializer.INSTANCE, var0.tertiaryAction);
      }

      label72: {
         if (!var1.A(var2, 16)) {
            var3 = false;
            if (var0.promptLabel == null) {
               break label72;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 16, a2.a, var0.promptLabel);
      }
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
      r.h(var1, "resources");
      r.h(var2, "question");
      r.h(var3, "answers");
      r.h(var4, "answersInteraction");
      r.h(var6, "layoutType");
      r.h(var12, "containerStyle");
      return new PollData(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.resources, var1.resources)) {
            return false;
         } else if (!r.c(this.question, var1.question)) {
            return false;
         } else if (!r.c(this.answers, var1.answers)) {
            return false;
         } else if (this.answersInteraction != var1.answersInteraction) {
            return false;
         } else if (!r.c(this.answerTapAccessibilityLabel, var1.answerTapAccessibilityLabel)) {
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
         } else if (!r.c(this.containerStyle, var1.containerStyle)) {
            return false;
         } else if (!r.c(this.myAvatarUrl, var1.myAvatarUrl)) {
            return false;
         } else if (!r.c(this.secondaryAction, var1.secondaryAction)) {
            return false;
         } else if (!r.c(this.primaryAction, var1.primaryAction)) {
            return false;
         } else if (!r.c(this.tertiaryAction, var1.tertiaryAction)) {
            return false;
         } else {
            return r.c(this.promptLabel, var1.promptLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      val var14: Int = this.resources.hashCode();
      val var12: Int = this.question.hashCode();
      val var13: Int = this.answers.hashCode();
      val var15: Int = this.answersInteraction.hashCode();
      var var11: Int = 0;
      val var1: Int;
      if (this.answerTapAccessibilityLabel == null) {
         var1 = 0;
      } else {
         var1 = this.answerTapAccessibilityLabel.hashCode();
      }

      val var16: Int = this.layoutType.hashCode();
      var var6: Byte = 1;
      var var2: Byte = this.canSelectMultipleAnswers;
      if (this.canSelectMultipleAnswers != 0) {
         var2 = 1;
      }

      var var19: Byte = this.canTapAnswers;
      if (this.canTapAnswers != 0) {
         var19 = 1;
      }

      var var20: Byte = this.canShowVoteCounts;
      if (this.canShowVoteCounts != 0) {
         var20 = 1;
      }

      var var21: Byte = this.hasVoted;
      if (this.hasVoted != 0) {
         var21 = 1;
      }

      if (this.isExpired == 0) {
         var6 = this.isExpired;
      }

      val var17: Int = this.containerStyle.hashCode();
      val var23: Int;
      if (this.myAvatarUrl == null) {
         var23 = 0;
      } else {
         var23 = this.myAvatarUrl.hashCode();
      }

      val var8: Int;
      if (this.secondaryAction == null) {
         var8 = 0;
      } else {
         var8 = this.secondaryAction.hashCode();
      }

      val var9: Int;
      if (this.primaryAction == null) {
         var9 = 0;
      } else {
         var9 = this.primaryAction.hashCode();
      }

      val var10: Int;
      if (this.tertiaryAction == null) {
         var10 = 0;
      } else {
         var10 = this.tertiaryAction.hashCode();
      }

      if (this.promptLabel != null) {
         var11 = this.promptLabel.hashCode();
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
                                                                                                                           ((var14 * 31 + var12) * 31 + var13)
                                                                                                                                 * 31
                                                                                                                              + var15
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var1
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var16
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var2
                                                                                             )
                                                                                             * 31
                                                                                          + var19
                                                                                    )
                                                                                    * 31
                                                                                 + var20
                                                                           )
                                                                           * 31
                                                                        + var21
                                                                  )
                                                                  * 31
                                                               + var6
                                                         )
                                                         * 31
                                                      + var17
                                                )
                                                * 31
                                             + var23
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
         + var11;
   }

   public override fun toString(): String {
      val var15: PollResources = this.resources;
      val var16: PollMedia = this.question;
      val var18: java.util.List = this.answers;
      val var6: PollChatAnswerInteractionType = this.answersInteraction;
      val var11: java.lang.String = this.answerTapAccessibilityLabel;
      val var10: PollLayoutType = this.layoutType;
      val var1: Boolean = this.canSelectMultipleAnswers;
      val var3: Boolean = this.canTapAnswers;
      val var5: Boolean = this.canShowVoteCounts;
      val var4: Boolean = this.hasVoted;
      val var2: Boolean = this.isExpired;
      val var8: java.lang.String = this.containerStyle;
      val var17: java.lang.String = this.myAvatarUrl;
      val var12: PollAction = this.secondaryAction;
      val var14: PollAction = this.primaryAction;
      val var7: PollAction = this.tertiaryAction;
      val var13: java.lang.String = this.promptLabel;
      val var9: StringBuilder = new StringBuilder();
      var9.append("PollData(resources=");
      var9.append(var15);
      var9.append(", question=");
      var9.append(var16);
      var9.append(", answers=");
      var9.append(var18);
      var9.append(", answersInteraction=");
      var9.append(var6);
      var9.append(", answerTapAccessibilityLabel=");
      var9.append(var11);
      var9.append(", layoutType=");
      var9.append(var10);
      var9.append(", canSelectMultipleAnswers=");
      var9.append(var1);
      var9.append(", canTapAnswers=");
      var9.append(var3);
      var9.append(", canShowVoteCounts=");
      var9.append(var5);
      var9.append(", hasVoted=");
      var9.append(var4);
      var9.append(", isExpired=");
      var9.append(var2);
      var9.append(", containerStyle=");
      var9.append(var8);
      var9.append(", myAvatarUrl=");
      var9.append(var17);
      var9.append(", secondaryAction=");
      var9.append(var12);
      var9.append(", primaryAction=");
      var9.append(var14);
      var9.append(", tertiaryAction=");
      var9.append(var7);
      var9.append(", promptLabel=");
      var9.append(var13);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : f0<PollData> {
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
         val var4: PollResources.$serializer = PollResources.$serializer.INSTANCE;
         val var3: PollMedia.$serializer = PollMedia.$serializer.INSTANCE;
         val var7: xk.f = new xk.f(PollAnswer.$serializer.INSTANCE);
         val var10: PollChatAnswerInteractionType.Serializer = PollChatAnswerInteractionType.Serializer.INSTANCE;
         val var2: a2 = a2.a;
         val var1: KSerializer = a.u(a2.a);
         val var5: PollLayoutType.Serializer = PollLayoutType.Serializer.INSTANCE;
         val var8: h = h.a;
         val var6: KSerializer = a.u(var2);
         val var9: PollAction.$serializer = PollAction.$serializer.INSTANCE;
         return new KSerializer[]{
            var4,
            var3,
            var7,
            var10,
            var1,
            var5,
            var8,
            var8,
            var8,
            var8,
            var8,
            var2,
            var6,
            a.u(PollAction.$serializer.INSTANCE),
            a.u(var9),
            a.u(var9),
            a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): PollData {
         r.h(var1, "decoder");
         val var25: SerialDescriptor = this.getDescriptor();
         val var26: c = var1.b(var25);
         var var3: Byte;
         val var4: Int;
         var var5: Byte;
         var var7: Byte;
         val var8: Byte;
         var var10: Boolean;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var21: Any;
         var var27: Any;
         var var36: Any;
         var var42: Any;
         if (var26.p()) {
            var16 = var26.y(var25, 0, PollResources.$serializer.INSTANCE, null);
            var19 = var26.y(var25, 1, PollMedia.$serializer.INSTANCE, null);
            var14 = var26.y(var25, 2, new xk.f(PollAnswer.$serializer.INSTANCE), null);
            var18 = var26.y(var25, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, null);
            var36 = a2.a;
            var11 = var26.n(var25, 4, a2.a, null);
            var17 = var26.y(var25, 5, PollLayoutType.Serializer.INSTANCE, null);
            var5 = var26.C(var25, 6);
            var3 = var26.C(var25, 7);
            var7 = var26.C(var25, 8);
            val var2: Byte = var26.C(var25, 9);
            var10 = var26.C(var25, 10);
            var27 = var26.m(var25, 11);
            var12 = var26.n(var25, 12, (DeserializationStrategy)var36, null);
            var42 = PollAction.$serializer.INSTANCE;
            var13 = var26.n(var25, 13, PollAction.$serializer.INSTANCE, null);
            var21 = var26.n(var25, 14, (DeserializationStrategy)var42, null);
            var42 = var26.n(var25, 15, (DeserializationStrategy)var42, null);
            var36 = var26.n(var25, 16, (DeserializationStrategy)var36, null);
            var4 = 131071;
            var8 = var2;
         } else {
            var7 = 16;
            var var33: Boolean = true;
            var10 = false;
            var var31: Byte = 0;
            var var6: Byte = 0;
            var5 = 0;
            var3 = 0;
            var36 = null;
            var14 = null;
            var16 = null;
            var27 = null;
            var21 = null;
            var42 = null;
            var19 = null;
            var11 = null;
            var12 = null;
            var17 = null;
            var18 = null;
            var13 = null;
            var var29: Int = 0;

            while (var33) {
               val var9: Int = var26.o(var25);
               switch (var9) {
                  case -1:
                     var33 = false;
                     continue;
                  case 0:
                     var16 = var26.y(var25, 0, PollResources.$serializer.INSTANCE, var16);
                     var29 |= 1;
                     break;
                  case 1:
                     var13 = var26.y(var25, 1, PollMedia.$serializer.INSTANCE, var13);
                     var29 |= 2;
                     break;
                  case 2:
                     var14 = var26.y(var25, 2, new xk.f(PollAnswer.$serializer.INSTANCE), var14);
                     var29 |= 4;
                     break;
                  case 3:
                     var36 = var26.y(var25, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, var36);
                     var29 |= 8;
                     break;
                  case 4:
                     var11 = var26.n(var25, 4, a2.a, var11);
                     var29 |= 16;
                     break;
                  case 5:
                     var12 = var26.y(var25, 5, PollLayoutType.Serializer.INSTANCE, var12);
                     var29 |= 32;
                     break;
                  case 6:
                     var5 = var26.C(var25, 6);
                     var29 |= 64;
                     break;
                  case 7:
                     var6 = var26.C(var25, 7);
                     var29 |= 128;
                     break;
                  case 8:
                     var3 = var26.C(var25, 8);
                     var29 |= 256;
                     break;
                  case 9:
                     var31 = var26.C(var25, 9);
                     var29 |= 512;
                     break;
                  case 10:
                     var10 = var26.C(var25, 10);
                     var29 |= 1024;
                     var7 = 16;
                     continue;
                  case 11:
                     var18 = var26.m(var25, 11);
                     var29 |= 2048;
                     break;
                  case 12:
                     var19 = var26.n(var25, 12, a2.a, var19);
                     var29 |= 4096;
                     break;
                  case 13:
                     var42 = var26.n(var25, 13, PollAction.$serializer.INSTANCE, var42);
                     var29 |= 8192;
                     break;
                  case 14:
                     var21 = var26.n(var25, 14, PollAction.$serializer.INSTANCE, var21);
                     var29 |= 16384;
                     break;
                  case 15:
                     var17 = var26.n(var25, 15, PollAction.$serializer.INSTANCE, var17);
                     var29 |= 32768;
                     break;
                  case 16:
                     var27 = var26.n(var25, var7, a2.a, var27);
                     var29 |= 65536;
                     continue;
                  default:
                     throw new n(var9);
               }

               var7 = 16;
            }

            var27 = var18;
            var18 = var36;
            var8 = var31;
            var7 = var3;
            var3 = var6;
            var4 = var29;
            var36 = var27;
            var12 = var19;
            var13 = var42;
            var42 = var17;
            var17 = var12;
            var19 = var13;
         }

         var26.c(var25);
         return new PollData(
            var4,
            var16 as PollResources,
            var19 as PollMedia,
            var14 as java.util.List,
            var18 as PollChatAnswerInteractionType,
            var11 as java.lang.String,
            var17 as PollLayoutType,
            (boolean)var5,
            (boolean)var3,
            (boolean)var7,
            (boolean)var8,
            var10,
            (java.lang.String)var27,
            var12 as java.lang.String,
            var13 as PollAction,
            var21 as PollAction,
            var42 as PollAction,
            var36 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PollData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollData> {
         return PollData.$serializer.INSTANCE;
      }
   }
}
