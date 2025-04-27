package com.discord.chat.bridge.polls

import ca.f
import ca.n
import da.a
import fa.C0
import fa.G
import fa.h
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
      val var7: Int = this.resources.hashCode();
      val var8: Int = this.question.hashCode();
      val var9: Int = this.answers.hashCode();
      val var10: Int = this.answersInteraction.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.answerTapAccessibilityLabel == null) {
         var1 = 0;
      } else {
         var1 = this.answerTapAccessibilityLabel.hashCode();
      }

      val var12: Int = this.layoutType.hashCode();
      val var14: Int = java.lang.Boolean.hashCode(this.canSelectMultipleAnswers);
      val var15: Int = java.lang.Boolean.hashCode(this.canTapAnswers);
      val var13: Int = java.lang.Boolean.hashCode(this.canShowVoteCounts);
      val var16: Int = java.lang.Boolean.hashCode(this.hasVoted);
      val var17: Int = java.lang.Boolean.hashCode(this.isExpired);
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
                                                                                                                           ((var7 * 31 + var8) * 31 + var9)
                                                                                                                                 * 31
                                                                                                                              + var10
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var1
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var12
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var14
                                                                                             )
                                                                                             * 31
                                                                                          + var15
                                                                                    )
                                                                                    * 31
                                                                                 + var13
                                                                           )
                                                                           * 31
                                                                        + var16
                                                                  )
                                                                  * 31
                                                               + var17
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
      val var13: PollResources = this.resources;
      val var11: PollMedia = this.question;
      val var10: java.util.List = this.answers;
      val var15: PollChatAnswerInteractionType = this.answersInteraction;
      val var14: java.lang.String = this.answerTapAccessibilityLabel;
      val var8: PollLayoutType = this.layoutType;
      val var4: Boolean = this.canSelectMultipleAnswers;
      val var3: Boolean = this.canTapAnswers;
      val var1: Boolean = this.canShowVoteCounts;
      val var5: Boolean = this.hasVoted;
      val var2: Boolean = this.isExpired;
      val var16: java.lang.String = this.containerStyle;
      val var12: java.lang.String = this.myAvatarUrl;
      val var7: PollAction = this.secondaryAction;
      val var9: PollAction = this.primaryAction;
      val var18: PollAction = this.tertiaryAction;
      val var6: java.lang.String = this.promptLabel;
      val var17: StringBuilder = new StringBuilder();
      var17.append("PollData(resources=");
      var17.append(var13);
      var17.append(", question=");
      var17.append(var11);
      var17.append(", answers=");
      var17.append(var10);
      var17.append(", answersInteraction=");
      var17.append(var15);
      var17.append(", answerTapAccessibilityLabel=");
      var17.append(var14);
      var17.append(", layoutType=");
      var17.append(var8);
      var17.append(", canSelectMultipleAnswers=");
      var17.append(var4);
      var17.append(", canTapAnswers=");
      var17.append(var3);
      var17.append(", canShowVoteCounts=");
      var17.append(var1);
      var17.append(", hasVoted=");
      var17.append(var5);
      var17.append(", isExpired=");
      var17.append(var2);
      var17.append(", containerStyle=");
      var17.append(var16);
      var17.append(", myAvatarUrl=");
      var17.append(var12);
      var17.append(", secondaryAction=");
      var17.append(var7);
      var17.append(", primaryAction=");
      var17.append(var9);
      var17.append(", tertiaryAction=");
      var17.append(var18);
      var17.append(", promptLabel=");
      var17.append(var6);
      var17.append(")");
      return var17.toString();
   }

   public object `$serializer` : G {
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
         val var3: KSerializer = PollData.access$get$childSerializers$cp()[2];
         val var2: C0 = C0.a;
         val var5: KSerializer = a.u(C0.a);
         val var1: KSerializer = a.u(var2);
         val var7: PollAction.$serializer = PollAction.$serializer.INSTANCE;
         return new KSerializer[]{
            PollResources.$serializer.INSTANCE,
            PollMedia.$serializer.INSTANCE,
            var3,
            PollChatAnswerInteractionType.Serializer.INSTANCE,
            var5,
            PollLayoutType.Serializer.INSTANCE,
            h.a,
            h.a,
            h.a,
            h.a,
            h.a,
            var2,
            var1,
            a.u(PollAction.$serializer.INSTANCE),
            a.u(var7),
            a.u(var7),
            a.u(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): PollData {
         q.h(var1, "decoder");
         val var25: SerialDescriptor = this.getDescriptor();
         val var26: c = var1.c(var25);
         val var23: Array<KSerializer> = PollData.access$get$childSerializers$cp();
         var var5: Boolean = var26.y();
         var var27: PollResources = null;
         var var2: Int;
         var var7: Boolean;
         var var8: Boolean;
         var var9: Boolean;
         val var10: Boolean;
         var var13: Any;
         var var16: Any;
         var var17: PollLayoutType;
         var var19: Any;
         var var20: Any;
         var var21: PollChatAnswerInteractionType;
         val var22: PollResources;
         val var24: Any;
         var var37: Any;
         var var39: Any;
         var var41: Any;
         var var45: Any;
         if (var5) {
            var22 = var26.m(var25, 0, PollResources.$serializer.INSTANCE, null) as PollResources;
            var19 = var26.m(var25, 1, PollMedia.$serializer.INSTANCE, null) as PollMedia;
            var20 = var26.m(var25, 2, var23[2], null) as java.util.List;
            var41 = var26.m(var25, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, null) as PollChatAnswerInteractionType;
            val var28: C0 = C0.a;
            var39 = var26.v(var25, 4, C0.a, null) as java.lang.String;
            var17 = var26.m(var25, 5, PollLayoutType.Serializer.INSTANCE, null) as PollLayoutType;
            var7 = var26.s(var25, 6);
            var9 = var26.s(var25, 7);
            var8 = var26.s(var25, 8);
            val var6: Boolean = var26.s(var25, 9);
            var5 = var26.s(var25, 10);
            var45 = var26.t(var25, 11);
            var24 = var26.v(var25, 12, var28, null) as java.lang.String;
            var37 = PollAction.$serializer.INSTANCE;
            val var48: PollAction = var26.v(var25, 13, PollAction.$serializer.INSTANCE, null) as PollAction;
            var13 = var26.v(var25, 14, (DeserializationStrategy)var37, null) as PollAction;
            var37 = var26.v(var25, 15, (DeserializationStrategy)var37, null) as PollAction;
            val var29: java.lang.String = var26.v(var25, 16, var28, null) as java.lang.String;
            var2 = 131071;
            var21 = (PollChatAnswerInteractionType)var41;
            var16 = var39;
            var10 = var6;
            var41 = var45;
            var39 = var48;
            var45 = var29;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = false;
            var8 = false;
            var7 = false;
            var var33: Boolean = false;
            var5 = false;
            var var47: PollLayoutType = null;
            var21 = null;
            var20 = null;
            var19 = null;
            var13 = null;
            var45 = null;
            var17 = null;
            var16 = null;
            var41 = null;
            var37 = null;
            var39 = null;

            while (var3) {
               var var4: Int = var26.x(var25);
               switch (var4) {
                  case -1:
                     var3 = false;
                     continue;
                  case 0:
                     var27 = var26.m(var25, 0, PollResources.$serializer.INSTANCE, var27) as PollResources;
                     var2 |= 1;
                     continue;
                  case 1:
                     var19 = var26.m(var25, 1, PollMedia.$serializer.INSTANCE, var19) as PollMedia;
                     var2 |= 2;
                     continue;
                  case 2:
                     var20 = var26.m(var25, 2, var23[2], var20) as java.util.List;
                     var2 |= 4;
                     continue;
                  case 3:
                     var21 = var26.m(var25, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, var21) as PollChatAnswerInteractionType;
                     var2 |= 8;
                     continue;
                  case 4:
                     var41 = var26.v(var25, 4, C0.a, var41) as java.lang.String;
                     var2 |= 16;
                     continue;
                  case 5:
                     var47 = var26.m(var25, 5, PollLayoutType.Serializer.INSTANCE, var47) as PollLayoutType;
                     var2 |= 32;
                     continue;
                  case 6:
                     var33 = var26.s(var25, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var7 = var26.s(var25, 7);
                     var2 |= 128;
                     continue;
                  case 8:
                     var5 = var26.s(var25, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var8 = var26.s(var25, 9);
                     var2 |= 512;
                     continue;
                  case 10:
                     var9 = var26.s(var25, 10);
                     var2 |= 1024;
                     continue;
                  case 11:
                     var39 = var26.t(var25, 11);
                     var2 |= 2048;
                     continue;
                  case 12:
                     var16 = var26.v(var25, 12, C0.a, var16) as java.lang.String;
                     var2 |= 4096;
                     continue;
                  case 13:
                     var17 = var26.v(var25, 13, PollAction.$serializer.INSTANCE, var17) as PollAction;
                     var2 |= 8192;
                     continue;
                  case 14:
                     var45 = var26.v(var25, 14, PollAction.$serializer.INSTANCE, var45) as PollAction;
                     var2 |= 16384;
                     continue;
                  case 15:
                     var37 = var26.v(var25, 15, PollAction.$serializer.INSTANCE, var37) as PollAction;
                     var4 = 32768;
                     break;
                  case 16:
                     var13 = var26.v(var25, 16, C0.a, var13) as java.lang.String;
                     var4 = 65536;
                     break;
                  default:
                     throw new n(var4);
               }

               var2 |= var4;
            }

            var13 = var45;
            var24 = var16;
            var16 = var41;
            var41 = var39;
            var45 = var13;
            var39 = var17;
            var5 = var9;
            var10 = var8;
            var8 = var5;
            var9 = var7;
            var7 = var33;
            var17 = var47;
            var22 = var27;
         }

         var26.b(var25);
         return new PollData(
            var2,
            var22,
            (PollMedia)var19,
            (java.util.List)var20,
            var21,
            (java.lang.String)var16,
            var17,
            var7,
            var9,
            var8,
            var10,
            var5,
            (java.lang.String)var41,
            (java.lang.String)var24,
            (PollAction)var39,
            (PollAction)var13,
            (PollAction)var37,
            (java.lang.String)var45,
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
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollData> {
         return PollData.$serializer.INSTANCE;
      }
   }
}
