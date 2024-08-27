package com.discord.chat.bridge.reaction

import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.Reaction.DefaultImpls
import kotlin.jvm.internal.r
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
import xk.h
import xk.m0

@f
public data class MessageReaction(count: Int,
      me: Boolean,
      isMeBurst: Boolean = false,
      emoji: MessageReactionEmoji,
      burstCount: Int = 0,
      themedBurstColors: ThemedBurstReactionColorPalette? = null
   ) :
   Reaction {
   public open val burstCount: Int
   public open val count: Int
   public open val emoji: MessageReactionEmoji
   public open val isMe: Boolean
   public open val isMeBurst: Boolean
   public final val me: Boolean
   public open val themedBurstColors: ThemedBurstReactionColorPalette?

   init {
      r.h(var4, "emoji");
      super();
      this.count = var1;
      this.me = var2;
      this.isMeBurst = var3;
      this.emoji = var4;
      this.burstCount = var5;
      this.themedBurstColors = var6;
      this.isMe = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: MessageReaction, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getCount());
      var1.x(var2, 1, var0.me);
      var var5: Boolean;
      if (!var1.A(var2, 2) && !var0.isMeBurst()) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.x(var2, 2, var0.isMeBurst());
      }

      var1.y(var2, 3, MessageReactionEmoji.$serializer.INSTANCE, var0.getEmoji());
      if (!var1.A(var2, 4) && var0.getBurstCount() == 0) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.w(var2, 4, var0.getBurstCount());
      }

      if (!var1.A(var2, 5) && var0.getThemedBurstColors() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 5, ThemedBurstReactionColorPalette.$serializer.INSTANCE, var0.getThemedBurstColors());
      }

      label40: {
         if (!var1.A(var2, 6)) {
            var5 = false;
            if (var0.isMe() == var0.me) {
               break label40;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.x(var2, 6, var0.isMe());
      }
   }

   public operator fun component1(): Int {
      return this.getCount();
   }

   public operator fun component2(): Boolean {
      return this.me;
   }

   public operator fun component3(): Boolean {
      return this.isMeBurst();
   }

   public operator fun component4(): MessageReactionEmoji {
      return this.getEmoji();
   }

   public operator fun component5(): Int {
      return this.getBurstCount();
   }

   public operator fun component6(): ThemedBurstReactionColorPalette? {
      return this.getThemedBurstColors();
   }

   public fun copy(
      count: Int = var0.getCount(),
      me: Boolean = var0.me,
      isMeBurst: Boolean = var0.isMeBurst(),
      emoji: MessageReactionEmoji = var0.getEmoji(),
      burstCount: Int = var0.getBurstCount(),
      themedBurstColors: ThemedBurstReactionColorPalette? = var0.getThemedBurstColors()
   ): MessageReaction {
      r.h(var4, "emoji");
      return new MessageReaction(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReaction) {
         return false;
      } else {
         var1 = var1;
         if (this.getCount() != var1.getCount()) {
            return false;
         } else if (this.me != var1.me) {
            return false;
         } else if (this.isMeBurst() != var1.isMeBurst()) {
            return false;
         } else if (!r.c(this.getEmoji(), var1.getEmoji())) {
            return false;
         } else if (this.getBurstCount() != var1.getBurstCount()) {
            return false;
         } else {
            return r.c(this.getThemedBurstColors(), var1.getThemedBurstColors());
         }
      }
   }

   fun getItemId(): java.lang.Long {
      return DefaultImpls.getItemId(this);
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.getCount());
      var var2: Byte = 1;
      var var1: Byte = this.me;
      if (this.me != 0) {
         var1 = 1;
      }

      var var7: Int = this.isMeBurst();
      if (var7 == 0) {
         var2 = (byte)var7;
      }

      val var6: Int = this.getEmoji().hashCode();
      val var5: Int = Integer.hashCode(this.getBurstCount());
      if (this.getThemedBurstColors() == null) {
         var7 = 0;
      } else {
         var7 = this.getThemedBurstColors().hashCode();
      }

      return ((((var4 * 31 + var1) * 31 + var2) * 31 + var6) * 31 + var5) * 31 + var7;
   }

   fun isBurstReaction(): Boolean {
      return DefaultImpls.isBurstReaction(this);
   }

   public override fun toString(): String {
      val var1: Int = this.getCount();
      val var3: Boolean = this.me;
      val var4: Boolean = this.isMeBurst();
      val var6: MessageReactionEmoji = this.getEmoji();
      val var2: Int = this.getBurstCount();
      val var5: ThemedBurstReactionColorPalette = this.getThemedBurstColors();
      val var7: StringBuilder = new StringBuilder();
      var7.append("MessageReaction(count=");
      var7.append(var1);
      var7.append(", me=");
      var7.append(var3);
      var7.append(", isMeBurst=");
      var7.append(var4);
      var7.append(", emoji=");
      var7.append(var6);
      var7.append(", burstCount=");
      var7.append(var2);
      var7.append(", themedBurstColors=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<MessageReaction> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageReaction.$serializer = new MessageReaction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.MessageReaction", var0, 7);
         var1.l("count", false);
         var1.l("me", false);
         var1.l("me_burst", true);
         var1.l("emoji", false);
         var1.l("burst_count", true);
         var1.l("themedBurstColors", true);
         var1.l("isMe", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: h = h.a;
         return new KSerializer[]{
            m0.a, h.a, h.a, MessageReactionEmoji.$serializer.INSTANCE, m0.a, a.u(ThemedBurstReactionColorPalette.$serializer.INSTANCE), var2
         };
      }

      public open fun deserialize(decoder: Decoder): MessageReaction {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         val var8: Int;
         var var10: Any;
         var var13: Any;
         if (var12.p()) {
            var5 = var12.i(var11, 0);
            var6 = var12.C(var11, 1);
            var8 = var12.C(var11, 2);
            var13 = var12.y(var11, 3, MessageReactionEmoji.$serializer.INSTANCE, null);
            var3 = var12.i(var11, 4);
            var10 = var12.n(var11, 5, ThemedBurstReactionColorPalette.$serializer.INSTANCE, null);
            val var2: Byte = var12.C(var11, 6);
            var4 = 127;
            var7 = var2;
         } else {
            var var19: Boolean = true;
            var5 = 0;
            var6 = 0;
            var4 = 0;
            var3 = 0;
            var var14: Int = 0;
            var13 = null;
            var10 = null;
            var7 = 0;

            while (var19) {
               val var9: Int = var12.o(var11);
               switch (var9) {
                  case -1:
                     var19 = false;
                     break;
                  case 0:
                     var5 = var12.i(var11, 0);
                     var14 |= 1;
                     break;
                  case 1:
                     var3 = var12.C(var11, 1);
                     var14 |= 2;
                     break;
                  case 2:
                     var4 = var12.C(var11, 2);
                     var14 |= 4;
                     break;
                  case 3:
                     var13 = var12.y(var11, 3, MessageReactionEmoji.$serializer.INSTANCE, var13);
                     var14 |= 8;
                     break;
                  case 4:
                     var6 = var12.i(var11, 4);
                     var14 |= 16;
                     break;
                  case 5:
                     var10 = var12.n(var11, 5, ThemedBurstReactionColorPalette.$serializer.INSTANCE, var10);
                     var14 |= 32;
                     break;
                  case 6:
                     var7 = var12.C(var11, 6);
                     var14 |= 64;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var8 = var4;
            var3 = var6;
            var6 = var3;
            var4 = var14;
         }

         var12.c(var11);
         return new MessageReaction(
            var4, var5, (boolean)var6, (boolean)var8, var13 as MessageReactionEmoji, var3, var10 as ThemedBurstReactionColorPalette, (boolean)var7, null
         );
      }

      public open fun serialize(encoder: Encoder, value: MessageReaction) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageReaction.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReaction> {
         return MessageReaction.$serializer.INSTANCE;
      }
   }
}
