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
import xk.m0

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
      r.h(var1, "answerId");
      r.h(var2, "pollMedia");
      r.h(var4, "votes");
      r.h(var9, "style");
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

   @JvmStatic
   public fun `write$Self`(self: PollAnswer, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.answerId);
      var1.y(var2, 1, PollMedia.$serializer.INSTANCE, var0.pollMedia);
      var1.x(var2, 2, var0.didSelfVote);
      var1.z(var2, 3, var0.votes);
      var1.w(var2, 4, var0.votesPercentage);
      var var3: Boolean;
      if (!var1.A(var2, 5) && var0.isSelected == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, h.a, var0.isSelected);
      }

      if (!var1.A(var2, 6) && var0.isVictor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, h.a, var0.isVictor);
      }

      if (!var1.A(var2, 7) && var0.shouldAnimateTransition == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, h.a, var0.shouldAnimateTransition);
      }

      label40: {
         if (!var1.A(var2, 8)) {
            var3 = false;
            if (r.c(var0.style, "normal")) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 8, var0.style);
      }
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
      r.h(var1, "answerId");
      r.h(var2, "pollMedia");
      r.h(var4, "votes");
      r.h(var9, "style");
      return new PollAnswer(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAnswer) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.answerId, var1.answerId)) {
            return false;
         } else if (!r.c(this.pollMedia, var1.pollMedia)) {
            return false;
         } else if (this.didSelfVote != var1.didSelfVote) {
            return false;
         } else if (!r.c(this.votes, var1.votes)) {
            return false;
         } else if (this.votesPercentage != var1.votesPercentage) {
            return false;
         } else if (!r.c(this.isSelected, var1.isSelected)) {
            return false;
         } else if (!r.c(this.isVictor, var1.isVictor)) {
            return false;
         } else if (!r.c(this.shouldAnimateTransition, var1.shouldAnimateTransition)) {
            return false;
         } else {
            return r.c(this.style, var1.style);
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
      val var6: Int = this.answerId.hashCode();
      val var5: Int = this.pollMedia.hashCode();
      var var1: Byte = this.didSelfVote;
      if (this.didSelfVote != 0) {
         var1 = 1;
      }

      val var7: Int = this.votes.hashCode();
      val var8: Int = Integer.hashCode(this.votesPercentage);
      var var4: Int = 0;
      val var10: Int;
      if (this.isSelected == null) {
         var10 = 0;
      } else {
         var10 = this.isSelected.hashCode();
      }

      val var3: Int;
      if (this.isVictor == null) {
         var3 = 0;
      } else {
         var3 = this.isVictor.hashCode();
      }

      if (this.shouldAnimateTransition != null) {
         var4 = this.shouldAnimateTransition.hashCode();
      }

      return (((((((var6 * 31 + var5) * 31 + var1) * 31 + var7) * 31 + var8) * 31 + var10) * 31 + var3) * 31 + var4) * 31 + this.style.hashCode();
   }

   public override fun toString(): String {
      val var9: java.lang.String = this.answerId;
      val var8: PollMedia = this.pollMedia;
      val var2: Boolean = this.didSelfVote;
      val var7: java.lang.String = this.votes;
      val var1: Int = this.votesPercentage;
      val var4: java.lang.Boolean = this.isSelected;
      val var5: java.lang.Boolean = this.isVictor;
      val var6: java.lang.Boolean = this.shouldAnimateTransition;
      val var10: java.lang.String = this.style;
      val var3: StringBuilder = new StringBuilder();
      var3.append("PollAnswer(answerId=");
      var3.append(var9);
      var3.append(", pollMedia=");
      var3.append(var8);
      var3.append(", didSelfVote=");
      var3.append(var2);
      var3.append(", votes=");
      var3.append(var7);
      var3.append(", votesPercentage=");
      var3.append(var1);
      var3.append(", isSelected=");
      var3.append(var4);
      var3.append(", isVictor=");
      var3.append(var5);
      var3.append(", shouldAnimateTransition=");
      var3.append(var6);
      var3.append(", style=");
      var3.append(var10);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<PollAnswer> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollAnswer.$serializer = new PollAnswer.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollAnswer", var0, 9);
         var1.l("answerId", false);
         var1.l("pollMedia", false);
         var1.l("didSelfVote", false);
         var1.l("votes", false);
         var1.l("votesPercentage", false);
         var1.l("isSelected", true);
         var1.l("isVictor", true);
         var1.l("shouldAnimateTransition", true);
         var1.l("style", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: a2 = a2.a;
         val var3: h = h.a;
         return new KSerializer[]{a2.a, PollMedia.$serializer.INSTANCE, h.a, a2.a, m0.a, a.u(h.a), a.u(var3), a.u(var3), var2};
      }

      public open fun deserialize(decoder: Decoder): PollAnswer {
         r.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: c = var1.b(var14);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var16: Any;
         var var21: Any;
         if (var15.p()) {
            var9 = var15.m(var14, 0);
            var8 = var15.y(var14, 1, PollMedia.$serializer.INSTANCE, null);
            var5 = var15.C(var14, 2);
            var16 = var15.m(var14, 3);
            val var2: Int = var15.i(var14, 4);
            var21 = h.a;
            var10 = var15.n(var14, 5, h.a, null);
            var11 = var15.n(var14, 6, (DeserializationStrategy)var21, null);
            var12 = var15.n(var14, 7, (DeserializationStrategy)var21, null);
            var21 = var15.m(var14, 8);
            var3 = 511;
            var4 = var2;
         } else {
            var var20: Boolean = true;
            var4 = 0;
            var var18: Int = 0;
            var12 = null;
            var11 = null;
            var9 = null;
            var8 = null;
            var21 = null;
            var16 = null;
            var10 = null;
            var3 = 0;

            while (var20) {
               val var6: Int = var15.o(var14);
               switch (var6) {
                  case -1:
                     var20 = false;
                     break;
                  case 0:
                     var9 = var15.m(var14, 0);
                     var18 |= 1;
                     break;
                  case 1:
                     var8 = var15.y(var14, 1, PollMedia.$serializer.INSTANCE, var8);
                     var18 |= 2;
                     break;
                  case 2:
                     var3 = var15.C(var14, 2);
                     var18 |= 4;
                     break;
                  case 3:
                     var21 = var15.m(var14, 3);
                     var18 |= 8;
                     break;
                  case 4:
                     var4 = var15.i(var14, 4);
                     var18 |= 16;
                     break;
                  case 5:
                     var10 = var15.n(var14, 5, h.a, var10);
                     var18 |= 32;
                     break;
                  case 6:
                     var11 = var15.n(var14, 6, h.a, var11);
                     var18 |= 64;
                     break;
                  case 7:
                     var12 = var15.n(var14, 7, h.a, var12);
                     var18 |= 128;
                     break;
                  case 8:
                     var16 = var15.m(var14, 8);
                     var18 |= 256;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var21 = var16;
            var16 = var21;
            var5 = var3;
            var3 = var18;
         }

         var15.c(var14);
         return new PollAnswer(
            var3,
            (java.lang.String)var9,
            var8 as PollMedia,
            (boolean)var5,
            (java.lang.String)var16,
            var4,
            var10 as java.lang.Boolean,
            var11 as java.lang.Boolean,
            var12 as java.lang.Boolean,
            (java.lang.String)var21,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PollAnswer) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollAnswer.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollAnswer> {
         return PollAnswer.$serializer.INSTANCE;
      }
   }
}
