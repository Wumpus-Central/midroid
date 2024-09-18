package com.discord.chat.bridge.forums

import com.discord.chat.bridge.reaction.MessageReaction
import kotlin.jvm.internal.q
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
import xk.b2
import xk.g0
import xk.h
import xk.n0

@f
public data class ForumPostActions(numDisplayedReactions: Int,
   isFollowing: Boolean,
   followIcon: String? = null,
   followLabel: String,
   shareIcon: String? = null,
   shareLabel: String,
   defaultReaction: MessageReaction? = null,
   sharePrompt: PostSharePrompt? = null
) {
   public final val defaultReaction: MessageReaction?
   public final val followIcon: String?
   public final val followLabel: String
   public final val isFollowing: Boolean
   public final val numDisplayedReactions: Int
   public final val shareIcon: String?
   public final val shareLabel: String
   public final val sharePrompt: PostSharePrompt?

   init {
      q.h(var4, "followLabel");
      q.h(var6, "shareLabel");
      super();
      this.numDisplayedReactions = var1;
      this.isFollowing = var2;
      this.followIcon = var3;
      this.followLabel = var4;
      this.shareIcon = var5;
      this.shareLabel = var6;
      this.defaultReaction = var7;
      this.sharePrompt = var8;
   }

   public operator fun component1(): Int {
      return this.numDisplayedReactions;
   }

   public operator fun component2(): Boolean {
      return this.isFollowing;
   }

   public operator fun component3(): String? {
      return this.followIcon;
   }

   public operator fun component4(): String {
      return this.followLabel;
   }

   public operator fun component5(): String? {
      return this.shareIcon;
   }

   public operator fun component6(): String {
      return this.shareLabel;
   }

   public operator fun component7(): MessageReaction? {
      return this.defaultReaction;
   }

   public operator fun component8(): PostSharePrompt? {
      return this.sharePrompt;
   }

   public fun copy(
      numDisplayedReactions: Int = var0.numDisplayedReactions,
      isFollowing: Boolean = var0.isFollowing,
      followIcon: String? = var0.followIcon,
      followLabel: String = var0.followLabel,
      shareIcon: String? = var0.shareIcon,
      shareLabel: String = var0.shareLabel,
      defaultReaction: MessageReaction? = var0.defaultReaction,
      sharePrompt: PostSharePrompt? = var0.sharePrompt
   ): ForumPostActions {
      q.h(var4, "followLabel");
      q.h(var6, "shareLabel");
      return new ForumPostActions(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForumPostActions) {
         return false;
      } else {
         var1 = var1;
         if (this.numDisplayedReactions != var1.numDisplayedReactions) {
            return false;
         } else if (this.isFollowing != var1.isFollowing) {
            return false;
         } else if (!q.c(this.followIcon, var1.followIcon)) {
            return false;
         } else if (!q.c(this.followLabel, var1.followLabel)) {
            return false;
         } else if (!q.c(this.shareIcon, var1.shareIcon)) {
            return false;
         } else if (!q.c(this.shareLabel, var1.shareLabel)) {
            return false;
         } else if (!q.c(this.defaultReaction, var1.defaultReaction)) {
            return false;
         } else {
            return q.c(this.sharePrompt, var1.sharePrompt);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.numDisplayedReactions);
      val var5: Int = java.lang.Boolean.hashCode(this.isFollowing);
      var var4: Int = 0;
      val var1: Int;
      if (this.followIcon == null) {
         var1 = 0;
      } else {
         var1 = this.followIcon.hashCode();
      }

      val var7: Int = this.followLabel.hashCode();
      val var2: Int;
      if (this.shareIcon == null) {
         var2 = 0;
      } else {
         var2 = this.shareIcon.hashCode();
      }

      val var8: Int = this.shareLabel.hashCode();
      val var3: Int;
      if (this.defaultReaction == null) {
         var3 = 0;
      } else {
         var3 = this.defaultReaction.hashCode();
      }

      if (this.sharePrompt != null) {
         var4 = this.sharePrompt.hashCode();
      }

      return ((((((var6 * 31 + var5) * 31 + var1) * 31 + var7) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var1: Int = this.numDisplayedReactions;
      val var2: Boolean = this.isFollowing;
      val var6: java.lang.String = this.followIcon;
      val var9: java.lang.String = this.followLabel;
      val var7: java.lang.String = this.shareIcon;
      val var3: java.lang.String = this.shareLabel;
      val var4: MessageReaction = this.defaultReaction;
      val var5: PostSharePrompt = this.sharePrompt;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ForumPostActions(numDisplayedReactions=");
      var8.append(var1);
      var8.append(", isFollowing=");
      var8.append(var2);
      var8.append(", followIcon=");
      var8.append(var6);
      var8.append(", followLabel=");
      var8.append(var9);
      var8.append(", shareIcon=");
      var8.append(var7);
      var8.append(", shareLabel=");
      var8.append(var3);
      var8.append(", defaultReaction=");
      var8.append(var4);
      var8.append(", sharePrompt=");
      var8.append(var5);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ForumPostActions.$serializer = new ForumPostActions.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forums.ForumPostActions", var0, 8);
         var1.l("numDisplayedReactions", false);
         var1.l("isFollowing", false);
         var1.l("followIcon", true);
         var1.l("followLabel", false);
         var1.l("shareIcon", true);
         var1.l("shareLabel", false);
         var1.l("defaultReaction", true);
         var1.l("sharePrompt", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{
            n0.a, h.a, a.u(b2.a), var1, a.u(var1), var1, a.u(MessageReaction.$serializer.INSTANCE), a.u(PostSharePrompt.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): ForumPostActions {
         q.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: c = var1.c(var14);
         var var2: Int;
         var var3: Int;
         val var5: Int;
         var var9: java.lang.String;
         var var10: java.lang.String;
         val var11: java.lang.String;
         val var12: java.lang.String;
         val var22: PostSharePrompt;
         var var24: Any;
         if (var15.y()) {
            var3 = var15.k(var14, 0);
            val var4: Byte = var15.s(var14, 1);
            val var16: b2 = b2.a;
            var11 = var15.v(var14, 2, b2.a, null) as java.lang.String;
            var9 = var15.t(var14, 3);
            var10 = var15.v(var14, 4, var16, null) as java.lang.String;
            var24 = var15.t(var14, 5);
            val var7: MessageReaction = var15.v(var14, 6, MessageReaction.$serializer.INSTANCE, null) as MessageReaction;
            val var17: PostSharePrompt = var15.v(var14, 7, PostSharePrompt.$serializer.INSTANCE, null) as PostSharePrompt;
            var2 = 255;
            var5 = var4;
            var12 = (java.lang.String)var24;
            var24 = var7;
            var22 = var17;
         } else {
            var var21: Boolean = true;
            var var20: Int = 0;
            var2 = 0;
            var var27: PostSharePrompt = null;
            var var18: java.lang.String = null;
            var9 = null;
            var24 = null;
            var var23: java.lang.String = null;
            var10 = null;
            var3 = 0;

            while (var21) {
               val var6: Int = var15.x(var14);
               switch (var6) {
                  case -1:
                     var21 = false;
                     break;
                  case 0:
                     var20 = var15.k(var14, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var15.s(var14, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var18 = var15.v(var14, 2, b2.a, var18) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var15.t(var14, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var24 = var15.v(var14, 4, b2.a, var24) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var23 = var15.t(var14, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var10 = var15.v(var14, 6, MessageReaction.$serializer.INSTANCE, var10) as MessageReaction;
                     var2 |= 64;
                     break;
                  case 7:
                     var27 = var15.v(var14, 7, PostSharePrompt.$serializer.INSTANCE, var27) as PostSharePrompt;
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var12 = var23;
            var22 = var27;
            var24 = var10;
            var10 = (java.lang.String)var24;
            var11 = var18;
            var5 = var3;
            var3 = var20;
         }

         var15.b(var14);
         return new ForumPostActions(var2, var3, (boolean)var5, var11, var9, var10, var12, (MessageReaction)var24, var22, null);
      }

      public open fun serialize(encoder: Encoder, value: ForumPostActions) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ForumPostActions.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return xk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForumPostActions> {
         return ForumPostActions.$serializer.INSTANCE;
      }
   }
}
