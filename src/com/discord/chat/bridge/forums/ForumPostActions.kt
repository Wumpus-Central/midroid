package com.discord.chat.bridge.forums

import com.discord.chat.bridge.reaction.MessageReaction
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
      r.h(var4, "followLabel");
      r.h(var6, "shareLabel");
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

   @JvmStatic
   public fun `write$Self`(self: ForumPostActions, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.numDisplayedReactions);
      var1.x(var2, 1, var0.isFollowing);
      var var5: Boolean;
      if (!var1.A(var2, 2) && var0.followIcon == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 2, a2.a, var0.followIcon);
      }

      var1.z(var2, 3, var0.followLabel);
      if (!var1.A(var2, 4) && var0.shareIcon == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 4, a2.a, var0.shareIcon);
      }

      var1.z(var2, 5, var0.shareLabel);
      if (!var1.A(var2, 6) && var0.defaultReaction == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 6, MessageReaction.$serializer.INSTANCE, var0.defaultReaction);
      }

      label40: {
         if (!var1.A(var2, 7)) {
            var5 = false;
            if (var0.sharePrompt == null) {
               break label40;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 7, PostSharePrompt.$serializer.INSTANCE, var0.sharePrompt);
      }
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
      r.h(var4, "followLabel");
      r.h(var6, "shareLabel");
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
         } else if (!r.c(this.followIcon, var1.followIcon)) {
            return false;
         } else if (!r.c(this.followLabel, var1.followLabel)) {
            return false;
         } else if (!r.c(this.shareIcon, var1.shareIcon)) {
            return false;
         } else if (!r.c(this.shareLabel, var1.shareLabel)) {
            return false;
         } else if (!r.c(this.defaultReaction, var1.defaultReaction)) {
            return false;
         } else {
            return r.c(this.sharePrompt, var1.sharePrompt);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.numDisplayedReactions);
      var var1: Byte = this.isFollowing;
      if (this.isFollowing != 0) {
         var1 = 1;
      }

      var var5: Int = 0;
      val var10: Int;
      if (this.followIcon == null) {
         var10 = 0;
      } else {
         var10 = this.followIcon.hashCode();
      }

      val var7: Int = this.followLabel.hashCode();
      val var3: Int;
      if (this.shareIcon == null) {
         var3 = 0;
      } else {
         var3 = this.shareIcon.hashCode();
      }

      val var8: Int = this.shareLabel.hashCode();
      val var4: Int;
      if (this.defaultReaction == null) {
         var4 = 0;
      } else {
         var4 = this.defaultReaction.hashCode();
      }

      if (this.sharePrompt != null) {
         var5 = this.sharePrompt.hashCode();
      }

      return ((((((var6 * 31 + var1) * 31 + var10) * 31 + var7) * 31 + var3) * 31 + var8) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var1: Int = this.numDisplayedReactions;
      val var2: Boolean = this.isFollowing;
      val var8: java.lang.String = this.followIcon;
      val var4: java.lang.String = this.followLabel;
      val var6: java.lang.String = this.shareIcon;
      val var3: java.lang.String = this.shareLabel;
      val var5: MessageReaction = this.defaultReaction;
      val var7: PostSharePrompt = this.sharePrompt;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ForumPostActions(numDisplayedReactions=");
      var9.append(var1);
      var9.append(", isFollowing=");
      var9.append(var2);
      var9.append(", followIcon=");
      var9.append(var8);
      var9.append(", followLabel=");
      var9.append(var4);
      var9.append(", shareIcon=");
      var9.append(var6);
      var9.append(", shareLabel=");
      var9.append(var3);
      var9.append(", defaultReaction=");
      var9.append(var5);
      var9.append(", sharePrompt=");
      var9.append(var7);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : f0<ForumPostActions> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{
            m0.a, h.a, a.u(a2.a), var1, a.u(var1), var1, a.u(MessageReaction.$serializer.INSTANCE), a.u(PostSharePrompt.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): ForumPostActions {
         r.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: c = var1.b(var14);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var17: Any;
         if (var15.p()) {
            val var2: Int = var15.i(var14, 0);
            var3 = var15.C(var14, 1);
            var17 = a2.a;
            var8 = var15.n(var14, 2, a2.a, null);
            var9 = var15.m(var14, 3);
            var7 = var15.n(var14, 4, (DeserializationStrategy)var17, null);
            var17 = var15.m(var14, 5);
            var10 = var15.n(var14, 6, MessageReaction.$serializer.INSTANCE, null);
            var11 = var15.n(var14, 7, PostSharePrompt.$serializer.INSTANCE, null);
            var4 = 255;
            var5 = var2;
         } else {
            var var21: Boolean = true;
            var4 = 0;
            var var19: Int = 0;
            var11 = null;
            var17 = null;
            var8 = null;
            var9 = null;
            var7 = null;
            var10 = null;
            var3 = 0;

            while (var21) {
               val var6: Int = var15.o(var14);
               switch (var6) {
                  case -1:
                     var21 = false;
                     break;
                  case 0:
                     var4 = var15.i(var14, 0);
                     var19 |= 1;
                     break;
                  case 1:
                     var3 = var15.C(var14, 1);
                     var19 |= 2;
                     break;
                  case 2:
                     var17 = var15.n(var14, 2, a2.a, var17);
                     var19 |= 4;
                     break;
                  case 3:
                     var8 = var15.m(var14, 3);
                     var19 |= 8;
                     break;
                  case 4:
                     var9 = var15.n(var14, 4, a2.a, var9);
                     var19 |= 16;
                     break;
                  case 5:
                     var7 = var15.m(var14, 5);
                     var19 |= 32;
                     break;
                  case 6:
                     var10 = var15.n(var14, 6, MessageReaction.$serializer.INSTANCE, var10);
                     var19 |= 64;
                     break;
                  case 7:
                     var11 = var15.n(var14, 7, PostSharePrompt.$serializer.INSTANCE, var11);
                     var19 |= 128;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var17 = var7;
            var9 = var8;
            var5 = var4;
            var4 = var19;
            var8 = var17;
            var7 = var9;
         }

         var15.c(var14);
         return new ForumPostActions(
            var4,
            var5,
            (boolean)var3,
            var8 as java.lang.String,
            (java.lang.String)var9,
            var7 as java.lang.String,
            (java.lang.String)var17,
            var10 as MessageReaction,
            var11 as PostSharePrompt,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ForumPostActions) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ForumPostActions.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForumPostActions> {
         return ForumPostActions.$serializer.INSTANCE;
      }
   }
}
