package com.discord.chat.bridge.reaction

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
import xk.f0
import xk.m0

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
      super();
      this.reactionBackgroundColor = var1;
      this.reactionBorderColor = var2;
      this.reactionTextColor = var3;
      this.activeReactionBackgroundColor = var4;
      this.activeReactionBorderColor = var5;
      this.activeReactionTextColor = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: ReactionsTheme, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.getReactionBackgroundColor() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, m0.a, var0.getReactionBackgroundColor());
      }

      if (!var1.A(var2, 1) && var0.getReactionBorderColor() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, m0.a, var0.getReactionBorderColor());
      }

      if (!var1.A(var2, 2) && var0.getReactionTextColor() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, m0.a, var0.getReactionTextColor());
      }

      if (!var1.A(var2, 3) && var0.getActiveReactionBackgroundColor() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, m0.a, var0.getActiveReactionBackgroundColor());
      }

      if (!var1.A(var2, 4) && var0.getActiveReactionBorderColor() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, m0.a, var0.getActiveReactionBorderColor());
      }

      label56: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (var0.getActiveReactionTextColor() == null) {
               break label56;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, m0.a, var0.getActiveReactionTextColor());
      }
   }

   public operator fun component1(): Int? {
      return this.getReactionBackgroundColor();
   }

   public operator fun component2(): Int? {
      return this.getReactionBorderColor();
   }

   public operator fun component3(): Int? {
      return this.getReactionTextColor();
   }

   public operator fun component4(): Int? {
      return this.getActiveReactionBackgroundColor();
   }

   public operator fun component5(): Int? {
      return this.getActiveReactionBorderColor();
   }

   public operator fun component6(): Int? {
      return this.getActiveReactionTextColor();
   }

   public fun copy(
      reactionBackgroundColor: Int? = var0.getReactionBackgroundColor(),
      reactionBorderColor: Int? = var0.getReactionBorderColor(),
      reactionTextColor: Int? = var0.getReactionTextColor(),
      activeReactionBackgroundColor: Int? = var0.getActiveReactionBackgroundColor(),
      activeReactionBorderColor: Int? = var0.getActiveReactionBorderColor(),
      activeReactionTextColor: Int? = var0.getActiveReactionTextColor()
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
         if (!r.c(this.getReactionBackgroundColor(), var1.getReactionBackgroundColor())) {
            return false;
         } else if (!r.c(this.getReactionBorderColor(), var1.getReactionBorderColor())) {
            return false;
         } else if (!r.c(this.getReactionTextColor(), var1.getReactionTextColor())) {
            return false;
         } else if (!r.c(this.getActiveReactionBackgroundColor(), var1.getActiveReactionBackgroundColor())) {
            return false;
         } else if (!r.c(this.getActiveReactionBorderColor(), var1.getActiveReactionBorderColor())) {
            return false;
         } else {
            return r.c(this.getActiveReactionTextColor(), var1.getActiveReactionTextColor());
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.getReactionBackgroundColor();
      var var6: Int = 0;
      val var1: Int;
      if (var7 == null) {
         var1 = 0;
      } else {
         var1 = this.getReactionBackgroundColor().hashCode();
      }

      val var2: Int;
      if (this.getReactionBorderColor() == null) {
         var2 = 0;
      } else {
         var2 = this.getReactionBorderColor().hashCode();
      }

      val var3: Int;
      if (this.getReactionTextColor() == null) {
         var3 = 0;
      } else {
         var3 = this.getReactionTextColor().hashCode();
      }

      val var4: Int;
      if (this.getActiveReactionBackgroundColor() == null) {
         var4 = 0;
      } else {
         var4 = this.getActiveReactionBackgroundColor().hashCode();
      }

      val var5: Int;
      if (this.getActiveReactionBorderColor() == null) {
         var5 = 0;
      } else {
         var5 = this.getActiveReactionBorderColor().hashCode();
      }

      if (this.getActiveReactionTextColor() != null) {
         var6 = this.getActiveReactionTextColor().hashCode();
      }

      return ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var6: Int = this.getReactionBackgroundColor();
      val var7: Int = this.getReactionBorderColor();
      val var2: Int = this.getReactionTextColor();
      val var3: Int = this.getActiveReactionBackgroundColor();
      val var4: Int = this.getActiveReactionBorderColor();
      val var1: Int = this.getActiveReactionTextColor();
      val var5: StringBuilder = new StringBuilder();
      var5.append("ReactionsTheme(reactionBackgroundColor=");
      var5.append(var6);
      var5.append(", reactionBorderColor=");
      var5.append(var7);
      var5.append(", reactionTextColor=");
      var5.append(var2);
      var5.append(", activeReactionBackgroundColor=");
      var5.append(var3);
      var5.append(", activeReactionBorderColor=");
      var5.append(var4);
      var5.append(", activeReactionTextColor=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<ReactionsTheme> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ReactionsTheme.$serializer = new ReactionsTheme.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.ReactionsTheme", var0, 6);
         var1.l("reactionBackgroundColor", true);
         var1.l("reactionBorderColor", true);
         var1.l("reactionTextColor", true);
         var1.l("activeReactionBackgroundColor", true);
         var1.l("activeReactionBorderColor", true);
         var1.l("activeReactionTextColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: m0 = m0.a;
         return new KSerializer[]{a.u(m0.a), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ReactionsTheme {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var10: Any = null;
         var var2: Int;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var14: Any;
         var var16: Any;
         if (var5) {
            var16 = m0.a;
            var10 = var13.n(var12, 0, m0.a, null);
            var9 = var13.n(var12, 1, (DeserializationStrategy)var16, null);
            var8 = var13.n(var12, 2, (DeserializationStrategy)var16, null);
            var14 = var13.n(var12, 3, (DeserializationStrategy)var16, null);
            var7 = var13.n(var12, 4, (DeserializationStrategy)var16, null);
            var16 = var13.n(var12, 5, (DeserializationStrategy)var16, null);
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var8 = null;
            var16 = null;
            var7 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.n(var12, 0, m0.a, var10);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.n(var12, 1, m0.a, var9);
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var13.n(var12, 2, m0.a, var8);
                     var2 |= 4;
                     break;
                  case 3:
                     var16 = var13.n(var12, 3, m0.a, var16);
                     var2 |= 8;
                     break;
                  case 4:
                     var7 = var13.n(var12, 4, m0.a, var7);
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var13.n(var12, 5, m0.a, var14);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var14 = var16;
            var16 = var14;
         }

         var13.c(var12);
         return new ReactionsTheme(var2, var10 as Integer, var9 as Integer, var8 as Integer, var14 as Integer, var7 as Integer, var16 as Integer, null);
      }

      public open fun serialize(encoder: Encoder, value: ReactionsTheme) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ReactionsTheme.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ReactionsTheme> {
         return ReactionsTheme.$serializer.INSTANCE;
      }
   }
}
