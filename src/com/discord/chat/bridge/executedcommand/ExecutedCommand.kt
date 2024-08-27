package com.discord.chat.bridge.executedcommand

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.n1

@f
public data class ExecutedCommand(userId: UserId,
   usernameColor: Int,
   avatarURL: String? = ...,
   content: AnnotatedStructurableText,
   commandNameBackgroundStyles: ExecutedCommandBackgroundStyles? = ...,
   showAppsIcon: Boolean? = ...
) : ExecutedCommand(var1, var3, var4, var5, var6, var7) {
   public final val avatarURL: String?
   public final val commandNameBackgroundStyles: ExecutedCommandBackgroundStyles?
   public final val content: AnnotatedStructurableText
   public final val showAppsIcon: Boolean?
   public final val userId: UserId
   public final val usernameColor: Int

   fun ExecutedCommand(
      var1: Int,
      var2: UserId,
      var3: Int,
      var4: java.lang.String,
      var5: AnnotatedStructurableText,
      var6: ExecutedCommandBackgroundStyles,
      var7: java.lang.Boolean,
      var8: SerializationConstructorMarker
   ) {
      if (11 != (var1 and 11)) {
         n1.b(var1, 11, ExecutedCommand.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.userId = var2.unbox-impl();
      this.usernameColor = var3;
      if ((var1 and 4) == 0) {
         this.avatarURL = null;
      } else {
         this.avatarURL = var4;
      }

      this.content = var5;
      if ((var1 and 16) == 0) {
         this.commandNameBackgroundStyles = null;
      } else {
         this.commandNameBackgroundStyles = var6;
      }

      if ((var1 and 32) == 0) {
         this.showAppsIcon = java.lang.Boolean.FALSE;
      } else {
         this.showAppsIcon = var7;
      }
   }

   fun ExecutedCommand(
      var1: Long, var3: Int, var4: java.lang.String, var5: AnnotatedStructurableText, var6: ExecutedCommandBackgroundStyles, var7: java.lang.Boolean
   ) {
      super();
      this.userId = var1;
      this.usernameColor = var3;
      this.avatarURL = var4;
      this.content = var5;
      this.commandNameBackgroundStyles = var6;
      this.showAppsIcon = var7;
   }

   @JvmStatic
   public fun `write$Self`(self: ExecutedCommand, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.userId));
      var1.w(var2, 1, var0.usernameColor);
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.avatarURL == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.avatarURL);
      }

      var1.y(var2, 3, AnnotatedStructurableTextSerializer.INSTANCE, var0.content);
      if (!var1.A(var2, 4) && var0.commandNameBackgroundStyles == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, var0.commandNameBackgroundStyles);
      }

      label32: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (r.c(var0.showAppsIcon, java.lang.Boolean.FALSE)) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, h.a, var0.showAppsIcon);
      }
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

   public operator fun component4(): AnnotatedStructurableText {
      return this.content;
   }

   public operator fun component5(): ExecutedCommandBackgroundStyles? {
      return this.commandNameBackgroundStyles;
   }

   public operator fun component6(): Boolean? {
      return this.showAppsIcon;
   }

   public fun copy(
      userId: UserId = ...,
      usernameColor: Int = ...,
      avatarURL: String? = ...,
      content: AnnotatedStructurableText = ...,
      commandNameBackgroundStyles: ExecutedCommandBackgroundStyles? = ...,
      showAppsIcon: Boolean? = ...
   ): ExecutedCommand {
      r.h(var5, "content");
      return new ExecutedCommand(var1, var3, var4, var5, var6, var7, null);
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
         } else if (!r.c(this.avatarURL, var1.avatarURL)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.commandNameBackgroundStyles, var1.commandNameBackgroundStyles)) {
            return false;
         } else {
            return r.c(this.showAppsIcon, var1.showAppsIcon);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = UserId.hashCode-impl(this.userId);
      val var5: Int = Integer.hashCode(this.usernameColor);
      var var3: Int = 0;
      val var1: Int;
      if (this.avatarURL == null) {
         var1 = 0;
      } else {
         var1 = this.avatarURL.hashCode();
      }

      val var6: Int = this.content.hashCode();
      val var2: Int;
      if (this.commandNameBackgroundStyles == null) {
         var2 = 0;
      } else {
         var2 = this.commandNameBackgroundStyles.hashCode();
      }

      if (this.showAppsIcon != null) {
         var3 = this.showAppsIcon.hashCode();
      }

      return ((((var4 * 31 + var5) * 31 + var1) * 31 + var6) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: java.lang.String = UserId.toString-impl(this.userId);
      val var1: Int = this.usernameColor;
      val var6: java.lang.String = this.avatarURL;
      val var4: AnnotatedStructurableText = this.content;
      val var7: ExecutedCommandBackgroundStyles = this.commandNameBackgroundStyles;
      val var5: java.lang.Boolean = this.showAppsIcon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ExecutedCommand(userId=");
      var3.append(var2);
      var3.append(", usernameColor=");
      var3.append(var1);
      var3.append(", avatarURL=");
      var3.append(var6);
      var3.append(", content=");
      var3.append(var4);
      var3.append(", commandNameBackgroundStyles=");
      var3.append(var7);
      var3.append(", showAppsIcon=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ExecutedCommand> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ExecutedCommand.$serializer = new ExecutedCommand.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.executedcommand.ExecutedCommand", var0, 6);
         var1.l("userId", false);
         var1.l("usernameColor", false);
         var1.l("avatarURL", true);
         var1.l("content", false);
         var1.l("commandNameBackgroundStyles", true);
         var1.l("showAppsIcon", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            com.discord.primitives.UserId..serializer.INSTANCE,
            m0.a,
            a.u(a2.a),
            AnnotatedStructurableTextSerializer.INSTANCE,
            a.u(ExecutedCommandBackgroundStyles.$serializer.INSTANCE),
            a.u(h.a)
         };
      }

      public open fun deserialize(decoder: Decoder): ExecutedCommand {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var14: Any;
         if (var13.p()) {
            var9 = var13.y(var12, 0, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var3 = var13.i(var12, 1);
            var7 = var13.n(var12, 2, a2.a, null);
            var8 = var13.y(var12, 3, AnnotatedStructurableTextSerializer.INSTANCE, null);
            var14 = var13.n(var12, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, null);
            var6 = var13.n(var12, 5, h.a, null);
            var2 = 63;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var7 = null;
            var9 = null;
            var8 = null;
            var6 = null;
            var14 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var13.o(var12);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var7 = var13.y(var12, 0, com.discord.primitives.UserId..serializer.INSTANCE, var7);
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var13.i(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var9 = var13.n(var12, 2, a2.a, var9);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var13.y(var12, 3, AnnotatedStructurableTextSerializer.INSTANCE, var8);
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.n(var12, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, var6);
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var13.n(var12, 5, h.a, var14);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var6 = var14;
            var9 = var7;
            var7 = var9;
            var14 = var6;
         }

         var13.c(var12);
         return new ExecutedCommand(
            var2,
            var9 as UserId,
            var3,
            var7 as java.lang.String,
            var8 as AnnotatedStructurableText,
            var14 as ExecutedCommandBackgroundStyles,
            var6 as java.lang.Boolean,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ExecutedCommand) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ExecutedCommand.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommand> {
         return ExecutedCommand.$serializer.INSTANCE;
      }
   }
}
