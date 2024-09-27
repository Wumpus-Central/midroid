package com.discord.chat.bridge.executedcommand

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import com.discord.primitives.UserId
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import il.n0
import il.o1
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class ExecutedCommand(userId: UserId,
   usernameColor: Int,
   avatarURL: String? = ...,
   targetUsernameColor: Int,
   content: AnnotatedStructurableText,
   commandNameBackgroundStyles: ExecutedCommandBackgroundStyles? = ...,
   showAppsIcon: Boolean? = ...
) : ExecutedCommand(var1, var3, var4, var5, var6, var7, var8) {
   public final val avatarURL: String?
   public final val commandNameBackgroundStyles: ExecutedCommandBackgroundStyles?
   public final val content: AnnotatedStructurableText
   public final val showAppsIcon: Boolean?
   public final val targetUsernameColor: Int
   public final val userId: UserId
   public final val usernameColor: Int

   fun ExecutedCommand(
      var1: Int,
      var2: UserId,
      var3: Int,
      var4: java.lang.String,
      var5: Int,
      var6: AnnotatedStructurableText,
      var7: ExecutedCommandBackgroundStyles,
      var8: java.lang.Boolean,
      var9: SerializationConstructorMarker
   ) {
      if (27 != (var1 and 27)) {
         o1.b(var1, 27, ExecutedCommand.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.userId = var2.unbox-impl();
      this.usernameColor = var3;
      if ((var1 and 4) == 0) {
         this.avatarURL = null;
      } else {
         this.avatarURL = var4;
      }

      this.targetUsernameColor = var5;
      this.content = var6;
      if ((var1 and 32) == 0) {
         this.commandNameBackgroundStyles = null;
      } else {
         this.commandNameBackgroundStyles = var7;
      }

      if ((var1 and 64) == 0) {
         this.showAppsIcon = java.lang.Boolean.FALSE;
      } else {
         this.showAppsIcon = var8;
      }
   }

   fun ExecutedCommand(
      var1: Long, var3: Int, var4: java.lang.String, var5: Int, var6: AnnotatedStructurableText, var7: ExecutedCommandBackgroundStyles, var8: java.lang.Boolean
   ) {
      q.h(var6, "content");
      super();
      this.userId = var1;
      this.usernameColor = var3;
      this.avatarURL = var4;
      this.targetUsernameColor = var5;
      this.content = var6;
      this.commandNameBackgroundStyles = var7;
      this.showAppsIcon = var8;
   }

   public operator fun component1(): UserId {
      return this.userId;
   }

   public operator fun component2(): Int {
      return this.usernameColor;
   }

   public operator fun component3(): String? {
      return this.avatarURL;
   }

   public operator fun component4(): Int {
      return this.targetUsernameColor;
   }

   public operator fun component5(): AnnotatedStructurableText {
      return this.content;
   }

   public operator fun component6(): ExecutedCommandBackgroundStyles? {
      return this.commandNameBackgroundStyles;
   }

   public operator fun component7(): Boolean? {
      return this.showAppsIcon;
   }

   public fun copy(
      userId: UserId = ...,
      usernameColor: Int = ...,
      avatarURL: String? = ...,
      targetUsernameColor: Int = ...,
      content: AnnotatedStructurableText = ...,
      commandNameBackgroundStyles: ExecutedCommandBackgroundStyles? = ...,
      showAppsIcon: Boolean? = ...
   ): ExecutedCommand {
      q.h(var6, "content");
      return new ExecutedCommand(var1, var3, var4, var5, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ExecutedCommand) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.userId, var1.userId)) {
            return false;
         } else if (this.usernameColor != var1.usernameColor) {
            return false;
         } else if (!q.c(this.avatarURL, var1.avatarURL)) {
            return false;
         } else if (this.targetUsernameColor != var1.targetUsernameColor) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.commandNameBackgroundStyles, var1.commandNameBackgroundStyles)) {
            return false;
         } else {
            return q.c(this.showAppsIcon, var1.showAppsIcon);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = UserId.hashCode-impl(this.userId);
      val var4: Int = Integer.hashCode(this.usernameColor);
      var var3: Int = 0;
      val var1: Int;
      if (this.avatarURL == null) {
         var1 = 0;
      } else {
         var1 = this.avatarURL.hashCode();
      }

      val var6: Int = Integer.hashCode(this.targetUsernameColor);
      val var7: Int = this.content.hashCode();
      val var2: Int;
      if (this.commandNameBackgroundStyles == null) {
         var2 = 0;
      } else {
         var2 = this.commandNameBackgroundStyles.hashCode();
      }

      if (this.showAppsIcon != null) {
         var3 = this.showAppsIcon.hashCode();
      }

      return (((((var5 * 31 + var4) * 31 + var1) * 31 + var6) * 31 + var7) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var7: java.lang.String = UserId.toString-impl(this.userId);
      val var2: Int = this.usernameColor;
      val var6: java.lang.String = this.avatarURL;
      val var1: Int = this.targetUsernameColor;
      val var3: AnnotatedStructurableText = this.content;
      val var5: ExecutedCommandBackgroundStyles = this.commandNameBackgroundStyles;
      val var8: java.lang.Boolean = this.showAppsIcon;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ExecutedCommand(userId=");
      var4.append(var7);
      var4.append(", usernameColor=");
      var4.append(var2);
      var4.append(", avatarURL=");
      var4.append(var6);
      var4.append(", targetUsernameColor=");
      var4.append(var1);
      var4.append(", content=");
      var4.append(var3);
      var4.append(", commandNameBackgroundStyles=");
      var4.append(var5);
      var4.append(", showAppsIcon=");
      var4.append(var8);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ExecutedCommand.$serializer = new ExecutedCommand.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.executedcommand.ExecutedCommand", var0, 7);
         var1.l("userId", false);
         var1.l("usernameColor", false);
         var1.l("avatarURL", true);
         var1.l("targetUsernameColor", false);
         var1.l("content", false);
         var1.l("commandNameBackgroundStyles", true);
         var1.l("showAppsIcon", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: n0 = n0.a;
         return new KSerializer[]{
            UserId.$serializer.INSTANCE,
            n0.a,
            a.u(b2.a),
            var2,
            AnnotatedStructurableTextSerializer.INSTANCE,
            a.u(ExecutedCommandBackgroundStyles.$serializer.INSTANCE),
            a.u(h.a)
         };
      }

      public open fun deserialize(decoder: Decoder): ExecutedCommand {
         q.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: c = var1.c(var14);
         val var8: Boolean = var15.y();
         var var6: Byte = 6;
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var9: Any;
         var var11: UserId;
         var var12: Any;
         var var16: Any;
         var var22: java.lang.String;
         if (var8) {
            val var10: UserId = var15.m(var14, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var5 = var15.k(var14, 1);
            val var13: java.lang.String = var15.v(var14, 2, b2.a, null) as java.lang.String;
            val var2: Int = var15.k(var14, 3);
            var12 = var15.m(var14, 4, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            var9 = var15.v(var14, 5, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, null) as ExecutedCommandBackgroundStyles;
            var16 = var15.v(var14, 6, h.a, null) as java.lang.Boolean;
            var3 = 127;
            var11 = var10;
            var22 = var13;
            var4 = var2;
         } else {
            var var20: Boolean = true;
            var4 = 0;
            var var18: Int = 0;
            var11 = null;
            var22 = null;
            var9 = null;
            var16 = null;
            var12 = null;
            var3 = 0;

            while (var20) {
               val var7: Int = var15.x(var14);
               switch (var7) {
                  case -1:
                     var20 = false;
                     break;
                  case 0:
                     var11 = var15.m(var14, 0, UserId.$serializer.INSTANCE, var11) as UserId;
                     var18 |= 1;
                     var6 = 6;
                     break;
                  case 1:
                     var3 = var15.k(var14, 1);
                     var18 |= 2;
                     break;
                  case 2:
                     var22 = var15.v(var14, 2, b2.a, var22) as java.lang.String;
                     var18 |= 4;
                     break;
                  case 3:
                     var4 = var15.k(var14, 3);
                     var18 |= 8;
                     break;
                  case 4:
                     var9 = var15.m(var14, 4, AnnotatedStructurableTextSerializer.INSTANCE, var9) as AnnotatedStructurableText;
                     var18 |= 16;
                     break;
                  case 5:
                     var16 = var15.v(var14, 5, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, var16) as ExecutedCommandBackgroundStyles;
                     var18 |= 32;
                     break;
                  case 6:
                     var12 = var15.v(var14, var6, h.a, var12) as java.lang.Boolean;
                     var18 |= 64;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var9 = var16;
            var16 = var12;
            var12 = var9;
            var5 = var3;
            var3 = var18;
         }

         var15.b(var14);
         return new ExecutedCommand(
            var3, var11, var5, var22, var4, (AnnotatedStructurableText)var12, (ExecutedCommandBackgroundStyles)var9, (java.lang.Boolean)var16, null, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ExecutedCommand) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ExecutedCommand.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommand> {
         return ExecutedCommand.$serializer.INSTANCE;
      }
   }
}
