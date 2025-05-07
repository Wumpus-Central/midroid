package com.discord.chat.bridge.executedcommand

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import com.discord.primitives.UserId
import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
import ia.p0
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
   showAppsIcon: Boolean? = ...,
   showControllerIcon: Boolean? = ...
) : ExecutedCommand(var1, var3, var4, var5, var6, var7, var8, var9) {
   public final val avatarURL: String?
   public final val commandNameBackgroundStyles: ExecutedCommandBackgroundStyles?
   public final val content: AnnotatedStructurableText
   public final val showAppsIcon: Boolean?
   public final val showControllerIcon: Boolean?
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
      var9: java.lang.Boolean,
      var10: SerializationConstructorMarker
   ) {
      if (27 != (var1 and 27)) {
         p0.b(var1, 27, ExecutedCommand.$serializer.INSTANCE.getDescriptor());
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

      if ((var1 and 128) == 0) {
         this.showControllerIcon = java.lang.Boolean.FALSE;
      } else {
         this.showControllerIcon = var9;
      }
   }

   fun ExecutedCommand(
      var1: Long,
      var3: Int,
      var4: java.lang.String,
      var5: Int,
      var6: AnnotatedStructurableText,
      var7: ExecutedCommandBackgroundStyles,
      var8: java.lang.Boolean,
      var9: java.lang.Boolean
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
      this.showControllerIcon = var9;
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

   public operator fun component8(): Boolean? {
      return this.showControllerIcon;
   }

   public fun copy(
      userId: UserId = ...,
      usernameColor: Int = ...,
      avatarURL: String? = ...,
      targetUsernameColor: Int = ...,
      content: AnnotatedStructurableText = ...,
      commandNameBackgroundStyles: ExecutedCommandBackgroundStyles? = ...,
      showAppsIcon: Boolean? = ...,
      showControllerIcon: Boolean? = ...
   ): ExecutedCommand {
      q.h(var6, "content");
      return new ExecutedCommand(var1, var3, var4, var5, var6, var7, var8, var9, null);
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
         } else if (!q.c(this.showAppsIcon, var1.showAppsIcon)) {
            return false;
         } else {
            return q.c(this.showControllerIcon, var1.showControllerIcon);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = UserId.hashCode-impl(this.userId);
      val var6: Int = Integer.hashCode(this.usernameColor);
      var var4: Int = 0;
      val var1: Int;
      if (this.avatarURL == null) {
         var1 = 0;
      } else {
         var1 = this.avatarURL.hashCode();
      }

      val var7: Int = Integer.hashCode(this.targetUsernameColor);
      val var8: Int = this.content.hashCode();
      val var2: Int;
      if (this.commandNameBackgroundStyles == null) {
         var2 = 0;
      } else {
         var2 = this.commandNameBackgroundStyles.hashCode();
      }

      val var3: Int;
      if (this.showAppsIcon == null) {
         var3 = 0;
      } else {
         var3 = this.showAppsIcon.hashCode();
      }

      if (this.showControllerIcon != null) {
         var4 = this.showControllerIcon.hashCode();
      }

      return ((((((var5 * 31 + var6) * 31 + var1) * 31 + var7) * 31 + var8) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var5: java.lang.String = UserId.toString-impl(this.userId);
      val var1: Int = this.usernameColor;
      val var3: java.lang.String = this.avatarURL;
      val var2: Int = this.targetUsernameColor;
      val var7: AnnotatedStructurableText = this.content;
      val var8: ExecutedCommandBackgroundStyles = this.commandNameBackgroundStyles;
      val var4: java.lang.Boolean = this.showAppsIcon;
      val var6: java.lang.Boolean = this.showControllerIcon;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ExecutedCommand(userId=");
      var9.append(var5);
      var9.append(", usernameColor=");
      var9.append(var1);
      var9.append(", avatarURL=");
      var9.append(var3);
      var9.append(", targetUsernameColor=");
      var9.append(var2);
      var9.append(", content=");
      var9.append(var7);
      var9.append(", commandNameBackgroundStyles=");
      var9.append(var8);
      var9.append(", showAppsIcon=");
      var9.append(var4);
      var9.append(", showControllerIcon=");
      var9.append(var6);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ExecutedCommand.$serializer = new ExecutedCommand.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.executedcommand.ExecutedCommand", var0, 8);
         var1.l("userId", false);
         var1.l("usernameColor", false);
         var1.l("avatarURL", true);
         var1.l("targetUsernameColor", false);
         var1.l("content", false);
         var1.l("commandNameBackgroundStyles", true);
         var1.l("showAppsIcon", true);
         var1.l("showControllerIcon", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: KSerializer = a.u(C0.a);
         val var2: KSerializer = a.u(ExecutedCommandBackgroundStyles.$serializer.INSTANCE);
         val var4: h = h.a;
         return new KSerializer[]{UserId.$serializer.INSTANCE, N.a, var3, N.a, AnnotatedStructurableTextSerializer.INSTANCE, var2, a.u(h.a), a.u(var4)};
      }

      public open fun deserialize(decoder: Decoder): ExecutedCommand {
         q.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.c(var16);
         val var8: Boolean = var17.y();
         var var6: Byte = 7;
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         val var14: java.lang.Boolean;
         val var15: Any;
         var var26: java.lang.Boolean;
         if (var8) {
            val var10: UserId = var17.m(var16, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var4 = var17.k(var16, 1);
            var13 = var17.v(var16, 2, C0.a, null) as java.lang.String;
            var2 = var17.k(var16, 3);
            var11 = var17.m(var16, 4, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            var12 = var17.v(var16, 5, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, null) as ExecutedCommandBackgroundStyles;
            val var18: h = h.a;
            val var9: java.lang.Boolean = var17.v(var16, 6, h.a, null) as java.lang.Boolean;
            val var19: java.lang.Boolean = var17.v(var16, 7, var18, null) as java.lang.Boolean;
            var3 = 255;
            var15 = var10;
            var26 = var9;
            var14 = var19;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var13 = null;
            var12 = null;
            var var25: Any = null;
            var var20: Any = null;
            var26 = null;
            var11 = null;
            var3 = 0;

            while (var5) {
               val var7: Int = var17.x(var16);
               switch (var7) {
                  case -1:
                     var5 = false;
                     continue;
                  case 0:
                     var25 = var17.m(var16, 0, UserId.$serializer.INSTANCE, var25) as UserId;
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var17.k(var16, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var20 = var17.v(var16, 2, C0.a, var20) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var4 = var17.k(var16, 3);
                     var2 |= 8;
                     continue;
                  case 4:
                     var26 = var17.m(var16, 4, AnnotatedStructurableTextSerializer.INSTANCE, var26) as AnnotatedStructurableText;
                     var2 |= 16;
                     continue;
                  case 5:
                     var11 = var17.v(var16, 5, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, var11) as ExecutedCommandBackgroundStyles;
                     var2 |= 32;
                     continue;
                  case 6:
                     var12 = var17.v(var16, 6, h.a, var12) as java.lang.Boolean;
                     var2 |= 64;
                     continue;
                  case 7:
                     var13 = var17.v(var16, var6, h.a, var13) as java.lang.Boolean;
                     var2 |= 128;
                     continue;
                  default:
                     throw new n(var7);
               }

               var6 = 7;
            }

            var14 = (java.lang.Boolean)var13;
            var26 = (java.lang.Boolean)var12;
            var12 = var11;
            var11 = var26;
            var2 = var4;
            var13 = var20;
            var4 = var3;
            var15 = var25;
            var3 = var2;
         }

         var17.b(var16);
         return new ExecutedCommand(
            var3,
            (UserId)var15,
            var4,
            (java.lang.String)var13,
            var2,
            (AnnotatedStructurableText)var11,
            (ExecutedCommandBackgroundStyles)var12,
            var26,
            var14,
            null,
            null
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
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommand> {
         return ExecutedCommand.$serializer.INSTANCE;
      }
   }
}
