package com.discord.chat.bridge.reaction

import kotlin.jvm.internal.q
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
import qn.g0
import qn.n0

@f
public data class ReactionsTheme(reactionBackgroundColor: Int? = null,
      reactionBorderColor: Int? = null,
      reactionTextColor: Int? = null,
      activeReactionBackgroundColor: Int? = null,
      activeReactionBorderColor: Int? = null,
      activeReactionTextColor: Int? = null
   ) :
   com.discord.reactions.ReactionView.ReactionsTheme {
   public open val activeReactionBackgroundColor: Int?
   public open val activeReactionBorderColor: Int?
   public open val activeReactionTextColor: Int?
   public open val reactionBackgroundColor: Int?
   public open val reactionBorderColor: Int?
   public open val reactionTextColor: Int?

   fun ReactionsTheme() {
      this(null, null, null, null, null, null, 63, null);
   }

   init {
      this.reactionBackgroundColor = var1;
      this.reactionBorderColor = var2;
      this.reactionTextColor = var3;
      this.activeReactionBackgroundColor = var4;
      this.activeReactionBorderColor = var5;
      this.activeReactionTextColor = var6;
   }

   public operator fun component1(): Int? {
      return this.reactionBackgroundColor;
   }

   public operator fun component2(): Int? {
      return this.reactionBorderColor;
   }

   public operator fun component3(): Int? {
      return this.reactionTextColor;
   }

   public operator fun component4(): Int? {
      return this.activeReactionBackgroundColor;
   }

   public operator fun component5(): Int? {
      return this.activeReactionBorderColor;
   }

   public operator fun component6(): Int? {
      return this.activeReactionTextColor;
   }

   public fun copy(
      reactionBackgroundColor: Int? = var0.reactionBackgroundColor,
      reactionBorderColor: Int? = var0.reactionBorderColor,
      reactionTextColor: Int? = var0.reactionTextColor,
      activeReactionBackgroundColor: Int? = var0.activeReactionBackgroundColor,
      activeReactionBorderColor: Int? = var0.activeReactionBorderColor,
      activeReactionTextColor: Int? = var0.activeReactionTextColor
   ): ReactionsTheme {
      return new ReactionsTheme(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReactionsTheme) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.reactionBackgroundColor, var1.reactionBackgroundColor)) {
            return false;
         } else if (!q.c(this.reactionBorderColor, var1.reactionBorderColor)) {
            return false;
         } else if (!q.c(this.reactionTextColor, var1.reactionTextColor)) {
            return false;
         } else if (!q.c(this.activeReactionBackgroundColor, var1.activeReactionBackgroundColor)) {
            return false;
         } else if (!q.c(this.activeReactionBorderColor, var1.activeReactionBorderColor)) {
            return false;
         } else {
            return q.c(this.activeReactionTextColor, var1.activeReactionTextColor);
         }
      }
   }

   public override fun hashCode(): Int {
      var var6: Int = 0;
      val var1: Int;
      if (this.reactionBackgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.reactionBackgroundColor.hashCode();
      }

      val var2: Int;
      if (this.reactionBorderColor == null) {
         var2 = 0;
      } else {
         var2 = this.reactionBorderColor.hashCode();
      }

      val var3: Int;
      if (this.reactionTextColor == null) {
         var3 = 0;
      } else {
         var3 = this.reactionTextColor.hashCode();
      }

      val var4: Int;
      if (this.activeReactionBackgroundColor == null) {
         var4 = 0;
      } else {
         var4 = this.activeReactionBackgroundColor.hashCode();
      }

      val var5: Int;
      if (this.activeReactionBorderColor == null) {
         var5 = 0;
      } else {
         var5 = this.activeReactionBorderColor.hashCode();
      }

      if (this.activeReactionTextColor != null) {
         var6 = this.activeReactionTextColor.hashCode();
      }

      return ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var1: Int = this.reactionBackgroundColor;
      val var6: Int = this.reactionBorderColor;
      val var4: Int = this.reactionTextColor;
      val var7: Int = this.activeReactionBackgroundColor;
      val var3: Int = this.activeReactionBorderColor;
      val var5: Int = this.activeReactionTextColor;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ReactionsTheme(reactionBackgroundColor=");
      var2.append(var1);
      var2.append(", reactionBorderColor=");
      var2.append(var6);
      var2.append(", reactionTextColor=");
      var2.append(var4);
      var2.append(", activeReactionBackgroundColor=");
      var2.append(var7);
      var2.append(", activeReactionBorderColor=");
      var2.append(var3);
      var2.append(", activeReactionTextColor=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ReactionsTheme.$serializer = new ReactionsTheme.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.ReactionsTheme", var0, 6);
         var1.c("reactionBackgroundColor", true);
         var1.c("reactionBorderColor", true);
         var1.c("reactionTextColor", true);
         var1.c("activeReactionBackgroundColor", true);
         var1.c("activeReactionBorderColor", true);
         var1.c("activeReactionTextColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{a.u(n0.a), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ReactionsTheme {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var10: Int = null;
         var var2: Int;
         var var8: Int;
         var var9: Int;
         val var14: Int;
         var var16: Int;
         var var18: Int;
         if (var5) {
            val var7: n0 = n0.a;
            var10 = var13.n(var12, 0, n0.a, null) as Int;
            var9 = var13.n(var12, 1, var7, null) as Int;
            var8 = var13.n(var12, 2, var7, null) as Int;
            var16 = var13.n(var12, 3, var7, null) as Int;
            var14 = var13.n(var12, 4, var7, null) as Int;
            val var11: Int = var13.n(var12, 5, var7, null) as Int;
            var2 = 63;
            var18 = var16;
            var16 = var11;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var8 = null;
            var18 = null;
            var16 = null;
            var var15: Int = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.n(var12, 0, n0.a, var10) as Int;
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.n(var12, 1, n0.a, var9) as Int;
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var13.n(var12, 2, n0.a, var8) as Int;
                     var2 |= 4;
                     break;
                  case 3:
                     var18 = var13.n(var12, 3, n0.a, var18) as Int;
                     var2 |= 8;
                     break;
                  case 4:
                     var16 = var13.n(var12, 4, n0.a, var16) as Int;
                     var2 |= 16;
                     break;
                  case 5:
                     var15 = var13.n(var12, 5, n0.a, var15) as Int;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var16 = var15;
            var14 = var16;
         }

         var13.c(var12);
         return new ReactionsTheme(var2, var10, var9, var8, var18, var14, var16, null);
      }

      public open fun serialize(encoder: Encoder, value: ReactionsTheme) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ReactionsTheme.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ReactionsTheme> {
         return ReactionsTheme.$serializer.INSTANCE;
      }
   }
}
