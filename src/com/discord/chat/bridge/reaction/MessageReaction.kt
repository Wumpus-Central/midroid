package com.discord.chat.bridge.reaction

import bl.g0
import bl.h
import bl.n0
import com.discord.reactions.ReactionView
import kotlin.jvm.internal.q
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
public data class MessageReaction(count: Int,
      me: Boolean,
      isMeBurst: Boolean = false,
      emoji: MessageReactionEmoji,
      burstCount: Int = 0,
      themedBurstColors: ThemedBurstReactionColorPalette? = null
   ) :
   ReactionView.Reaction {
   public open val burstCount: Int
   public open val count: Int
   public open val emoji: MessageReactionEmoji
   public open val isMe: Boolean
   public open val isMeBurst: Boolean
   public final val me: Boolean
   public open val themedBurstColors: ThemedBurstReactionColorPalette?

   init {
      q.h(var4, "emoji");
      super();
      this.count = var1;
      this.me = var2;
      this.isMeBurst = var3;
      this.emoji = var4;
      this.burstCount = var5;
      this.themedBurstColors = var6;
      this.isMe = var2;
   }

   public operator fun component1(): Int {
      return this.count;
   }

   public operator fun component2(): Boolean {
      return this.me;
   }

   public operator fun component3(): Boolean {
      return this.isMeBurst;
   }

   public operator fun component4(): MessageReactionEmoji {
      return this.emoji;
   }

   public operator fun component5(): Int {
      return this.burstCount;
   }

   public operator fun component6(): ThemedBurstReactionColorPalette? {
      return this.themedBurstColors;
   }

   public fun copy(
      count: Int = var0.count,
      me: Boolean = var0.me,
      isMeBurst: Boolean = var0.isMeBurst,
      emoji: MessageReactionEmoji = var0.emoji,
      burstCount: Int = var0.burstCount,
      themedBurstColors: ThemedBurstReactionColorPalette? = var0.themedBurstColors
   ): MessageReaction {
      q.h(var4, "emoji");
      return new MessageReaction(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReaction) {
         return false;
      } else {
         var1 = var1;
         if (this.count != var1.count) {
            return false;
         } else if (this.me != var1.me) {
            return false;
         } else if (this.isMeBurst != var1.isMeBurst) {
            return false;
         } else if (!q.c(this.emoji, var1.emoji)) {
            return false;
         } else if (this.burstCount != var1.burstCount) {
            return false;
         } else {
            return q.c(this.themedBurstColors, var1.themedBurstColors);
         }
      }
   }

   override fun getItemId(): java.lang.Long {
      return ReactionView.Reaction.DefaultImpls.getItemId(this);
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.count);
      val var3: Int = java.lang.Boolean.hashCode(this.me);
      val var2: Int = java.lang.Boolean.hashCode(this.isMeBurst);
      val var5: Int = this.emoji.hashCode();
      val var6: Int = Integer.hashCode(this.burstCount);
      val var1: Int;
      if (this.themedBurstColors == null) {
         var1 = 0;
      } else {
         var1 = this.themedBurstColors.hashCode();
      }

      return ((((var4 * 31 + var3) * 31 + var2) * 31 + var5) * 31 + var6) * 31 + var1;
   }

   override fun isBurstReaction(): Boolean {
      return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
   }

   public override fun toString(): String {
      val var1: Int = this.count;
      val var3: Boolean = this.me;
      val var4: Boolean = this.isMeBurst;
      val var7: MessageReactionEmoji = this.emoji;
      val var2: Int = this.burstCount;
      val var5: ThemedBurstReactionColorPalette = this.themedBurstColors;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MessageReaction(count=");
      var6.append(var1);
      var6.append(", me=");
      var6.append(var3);
      var6.append(", isMeBurst=");
      var6.append(var4);
      var6.append(", emoji=");
      var6.append(var7);
      var6.append(", burstCount=");
      var6.append(var2);
      var6.append(", themedBurstColors=");
      var6.append(var5);
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
            n0.a, h.a, h.a, MessageReactionEmoji.$serializer.INSTANCE, n0.a, a.u(ThemedBurstReactionColorPalette.$serializer.INSTANCE), var2
         };
      }

      public open fun deserialize(decoder: Decoder): MessageReaction {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.c(var12);
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var10: ThemedBurstReactionColorPalette;
         val var11: MessageReactionEmoji;
         var var17: Int;
         var var19: Int;
         val var23: Int;
         if (var13.y()) {
            var19 = var13.k(var12, 0);
            var5 = var13.s(var12, 1);
            val var8: Byte = var13.s(var12, 2);
            var11 = var13.m(var12, 3, MessageReactionEmoji.$serializer.INSTANCE, null) as MessageReactionEmoji;
            var17 = var13.k(var12, 4);
            val var14: ThemedBurstReactionColorPalette = var13.v(var12, 5, ThemedBurstReactionColorPalette.$serializer.INSTANCE, null) as ThemedBurstReactionColorPalette;
            val var2: Byte = var13.s(var12, 6);
            var6 = 127;
            var7 = var19;
            var19 = var8;
            var23 = var17;
            var10 = var14;
            var17 = var2;
         } else {
            var var24: Boolean = true;
            var7 = 0;
            var5 = 0;
            var19 = 0;
            var17 = 0;
            var var16: Int = 0;
            var var15: MessageReactionEmoji = null;
            var10 = null;
            var6 = 0;

            while (var24) {
               val var9: Int = var13.x(var12);
               switch (var9) {
                  case -1:
                     var24 = false;
                     break;
                  case 0:
                     var7 = var13.k(var12, 0);
                     var16 |= 1;
                     break;
                  case 1:
                     var17 = var13.s(var12, 1);
                     var16 |= 2;
                     break;
                  case 2:
                     var19 = var13.s(var12, 2);
                     var16 |= 4;
                     break;
                  case 3:
                     var15 = var13.m(var12, 3, MessageReactionEmoji.$serializer.INSTANCE, var15) as MessageReactionEmoji;
                     var16 |= 8;
                     break;
                  case 4:
                     var5 = var13.k(var12, 4);
                     var16 |= 16;
                     break;
                  case 5:
                     var10 = var13.v(var12, 5, ThemedBurstReactionColorPalette.$serializer.INSTANCE, var10) as ThemedBurstReactionColorPalette;
                     var16 |= 32;
                     break;
                  case 6:
                     var6 = var13.s(var12, 6);
                     var16 |= 64;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var17 = var6;
            var23 = var5;
            var11 = var15;
            var5 = var17;
            var6 = var16;
         }

         var13.b(var12);
         return new MessageReaction(var6, var7, (boolean)var5, (boolean)var19, var11, var23, var10, (boolean)var17, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageReaction) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MessageReaction.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReaction> {
         return MessageReaction.$serializer.INSTANCE;
      }
   }
}
