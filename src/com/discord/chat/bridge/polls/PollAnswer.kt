package com.discord.chat.bridge.polls

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
public data class PollAnswer(answerId: String,
   pollMedia: PollMedia,
   didSelfVote: Boolean,
   votes: String,
   votesPercentage: Int,
   isSelected: Boolean? = null,
   isVictor: Boolean? = null,
   shouldAnimateTransition: Boolean? = null,
   style: String = "normal"
) {
   public final val answerId: String
   public final val didSelfVote: Boolean
   public final val isSelected: Boolean?
   public final val isVictor: Boolean?
   public final val pollMedia: PollMedia
   public final val shouldAnimateTransition: Boolean?
   public final val style: String
   public final val votes: String
   public final val votesPercentage: Int

   init {
      q.h(var1, "answerId");
      q.h(var2, "pollMedia");
      q.h(var4, "votes");
      q.h(var9, "style");
      super();
      this.answerId = var1;
      this.pollMedia = var2;
      this.didSelfVote = var3;
      this.votes = var4;
      this.votesPercentage = var5;
      this.isSelected = var6;
      this.isVictor = var7;
      this.shouldAnimateTransition = var8;
      this.style = var9;
   }

   public operator fun component1(): String {
      return this.answerId;
   }

   public operator fun component2(): PollMedia {
      return this.pollMedia;
   }

   public operator fun component3(): Boolean {
      return this.didSelfVote;
   }

   public operator fun component4(): String {
      return this.votes;
   }

   public operator fun component5(): Int {
      return this.votesPercentage;
   }

   public operator fun component6(): Boolean? {
      return this.isSelected;
   }

   public operator fun component7(): Boolean? {
      return this.isVictor;
   }

   public operator fun component8(): Boolean? {
      return this.shouldAnimateTransition;
   }

   public operator fun component9(): String {
      return this.style;
   }

   public fun copy(
      answerId: String = var0.answerId,
      pollMedia: PollMedia = var0.pollMedia,
      didSelfVote: Boolean = var0.didSelfVote,
      votes: String = var0.votes,
      votesPercentage: Int = var0.votesPercentage,
      isSelected: Boolean? = var0.isSelected,
      isVictor: Boolean? = var0.isVictor,
      shouldAnimateTransition: Boolean? = var0.shouldAnimateTransition,
      style: String = var0.style
   ): PollAnswer {
      q.h(var1, "answerId");
      q.h(var2, "pollMedia");
      q.h(var4, "votes");
      q.h(var9, "style");
      return new PollAnswer(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAnswer) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.answerId, var1.answerId)) {
            return false;
         } else if (!q.c(this.pollMedia, var1.pollMedia)) {
            return false;
         } else if (this.didSelfVote != var1.didSelfVote) {
            return false;
         } else if (!q.c(this.votes, var1.votes)) {
            return false;
         } else if (this.votesPercentage != var1.votesPercentage) {
            return false;
         } else if (!q.c(this.isSelected, var1.isSelected)) {
            return false;
         } else if (!q.c(this.isVictor, var1.isVictor)) {
            return false;
         } else if (!q.c(this.shouldAnimateTransition, var1.shouldAnimateTransition)) {
            return false;
         } else {
            return q.c(this.style, var1.style);
         }
      }
   }

   public fun hasImage(): Boolean {
      val var3: PollMediaEmoji = this.pollMedia.getEmoji();
      var var1: Boolean = true;
      if (var3 == null) {
         var1 = true;
         if (!(this.pollMedia.getAttachmentIds().isEmpty() xor true)) {
            if (this.pollMedia.getStickerId() != null) {
               var1 = true;
            } else {
               var1 = false;
            }
         }
      }

      return var1;
   }

   public override fun hashCode(): Int {
      val var7: Int = this.answerId.hashCode();
      val var6: Int = this.pollMedia.hashCode();
      val var4: Int = java.lang.Boolean.hashCode(this.didSelfVote);
      val var8: Int = this.votes.hashCode();
      val var5: Int = Integer.hashCode(this.votesPercentage);
      var var3: Int = 0;
      val var1: Int;
      if (this.isSelected == null) {
         var1 = 0;
      } else {
         var1 = this.isSelected.hashCode();
      }

      val var2: Int;
      if (this.isVictor == null) {
         var2 = 0;
      } else {
         var2 = this.isVictor.hashCode();
      }

      if (this.shouldAnimateTransition != null) {
         var3 = this.shouldAnimateTransition.hashCode();
      }

      return (((((((var7 * 31 + var6) * 31 + var4) * 31 + var8) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + this.style.hashCode();
   }

   public override fun toString(): String {
      val var8: java.lang.String = this.answerId;
      val var9: PollMedia = this.pollMedia;
      val var2: Boolean = this.didSelfVote;
      val var5: java.lang.String = this.votes;
      val var1: Int = this.votesPercentage;
      val var4: java.lang.Boolean = this.isSelected;
      val var3: java.lang.Boolean = this.isVictor;
      val var10: java.lang.Boolean = this.shouldAnimateTransition;
      val var7: java.lang.String = this.style;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PollAnswer(answerId=");
      var6.append(var8);
      var6.append(", pollMedia=");
      var6.append(var9);
      var6.append(", didSelfVote=");
      var6.append(var2);
      var6.append(", votes=");
      var6.append(var5);
      var6.append(", votesPercentage=");
      var6.append(var1);
      var6.append(", isSelected=");
      var6.append(var4);
      var6.append(", isVictor=");
      var6.append(var3);
      var6.append(", shouldAnimateTransition=");
      var6.append(var10);
      var6.append(", style=");
      var6.append(var7);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollAnswer.$serializer = new PollAnswer.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollAnswer", var0, 9);
         var1.c("answerId", false);
         var1.c("pollMedia", false);
         var1.c("didSelfVote", false);
         var1.c("votes", false);
         var1.c("votesPercentage", false);
         var1.c("isSelected", true);
         var1.c("isVictor", true);
         var1.c("shouldAnimateTransition", true);
         var1.c("style", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: b2 = b2.a;
         val var2: h = h.a;
         return new KSerializer[]{b2.a, PollMedia.$serializer.INSTANCE, h.a, b2.a, n0.a, a.u(h.a), a.u(var2), a.u(var2), var3};
      }

      public open fun deserialize(decoder: Decoder): PollAnswer {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var9: Any;
         var var10: java.lang.Boolean;
         var var11: Any;
         var var12: Any;
         val var13: java.lang.Boolean;
         var var19: Any;
         var var23: java.lang.Boolean;
         if (var16.p()) {
            var9 = var16.m(var15, 0);
            var12 = var16.y(var15, 1, PollMedia.$serializer.INSTANCE, null) as PollMedia;
            var3 = var16.C(var15, 2);
            var11 = var16.m(var15, 3);
            val var2: Int = var16.i(var15, 4);
            var19 = h.a;
            var10 = var16.n(var15, 5, h.a, null) as java.lang.Boolean;
            var23 = var16.n(var15, 6, (DeserializationStrategy)var19, null) as java.lang.Boolean;
            var19 = var16.n(var15, 7, (DeserializationStrategy)var19, null) as java.lang.Boolean;
            val var8: java.lang.String = var16.m(var15, 8);
            var4 = 511;
            var5 = var2;
            var13 = var23;
            var23 = (java.lang.Boolean)var19;
            var19 = var8;
         } else {
            var var22: Boolean = true;
            var4 = 0;
            var var20: Int = 0;
            var12 = null;
            var11 = null;
            var9 = null;
            var var25: Any = null;
            var23 = null;
            var19 = null;
            var10 = null;
            var3 = 0;

            while (var22) {
               val var6: Int = var16.o(var15);
               switch (var6) {
                  case -1:
                     var22 = false;
                     break;
                  case 0:
                     var9 = var16.m(var15, 0);
                     var20 |= 1;
                     break;
                  case 1:
                     var25 = var16.y(var15, 1, PollMedia.$serializer.INSTANCE, var25) as PollMedia;
                     var20 |= 2;
                     break;
                  case 2:
                     var3 = var16.C(var15, 2);
                     var20 |= 4;
                     break;
                  case 3:
                     var23 = var16.m(var15, 3);
                     var20 |= 8;
                     break;
                  case 4:
                     var4 = var16.i(var15, 4);
                     var20 |= 16;
                     break;
                  case 5:
                     var10 = var16.n(var15, 5, h.a, var10) as java.lang.Boolean;
                     var20 |= 32;
                     break;
                  case 6:
                     var11 = var16.n(var15, 6, h.a, var11) as java.lang.Boolean;
                     var20 |= 64;
                     break;
                  case 7:
                     var12 = var16.n(var15, 7, h.a, var12) as java.lang.Boolean;
                     var20 |= 128;
                     break;
                  case 8:
                     var19 = var16.m(var15, 8);
                     var20 |= 256;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var23 = (java.lang.Boolean)var12;
            var13 = (java.lang.Boolean)var11;
            var5 = var4;
            var11 = var23;
            var12 = var25;
            var4 = var20;
         }

         var16.c(var15);
         return new PollAnswer(
            var4, (java.lang.String)var9, (PollMedia)var12, (boolean)var3, (java.lang.String)var11, var5, var10, var13, var23, (java.lang.String)var19, null
         );
      }

      public open fun serialize(encoder: Encoder, value: PollAnswer) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollAnswer.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollAnswer> {
         return PollAnswer.$serializer.INSTANCE;
      }
   }
}
