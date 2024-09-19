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
         o1.b(var1, 11, ExecutedCommand.$serializer.INSTANCE.getDescriptor());
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
      q.h(var5, "content");
      super();
      this.userId = var1;
      this.usernameColor = var3;
      this.avatarURL = var4;
      this.content = var5;
      this.commandNameBackgroundStyles = var6;
      this.showAppsIcon = var7;
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
      q.h(var5, "content");
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
         } else if (!q.c(this.avatarURL, var1.avatarURL)) {
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

      return ((((var5 * 31 + var4) * 31 + var1) * 31 + var6) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = UserId.toString-impl(this.userId);
      val var1: Int = this.usernameColor;
      val var3: java.lang.String = this.avatarURL;
      val var6: AnnotatedStructurableText = this.content;
      val var2: ExecutedCommandBackgroundStyles = this.commandNameBackgroundStyles;
      val var5: java.lang.Boolean = this.showAppsIcon;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ExecutedCommand(userId=");
      var7.append(var4);
      var7.append(", usernameColor=");
      var7.append(var1);
      var7.append(", avatarURL=");
      var7.append(var3);
      var7.append(", content=");
      var7.append(var6);
      var7.append(", commandNameBackgroundStyles=");
      var7.append(var2);
      var7.append(", showAppsIcon=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
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
            UserId.$serializer.INSTANCE,
            n0.a,
            a.u(b2.a),
            AnnotatedStructurableTextSerializer.INSTANCE,
            a.u(ExecutedCommandBackgroundStyles.$serializer.INSTANCE),
            a.u(h.a)
         };
      }

      public open fun deserialize(decoder: Decoder): ExecutedCommand {
         q.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.c(var13);
         var var2: Int;
         var var3: Int;
         var var6: UserId;
         val var10: Any;
         val var11: java.lang.String;
         val var12: Any;
         var var15: Any;
         if (var14.y()) {
            var6 = var14.m(var13, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var3 = var14.k(var13, 1);
            var11 = var14.v(var13, 2, b2.a, null) as java.lang.String;
            val var8: AnnotatedStructurableText = var14.m(var13, 3, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            val var7: ExecutedCommandBackgroundStyles = var14.v(var13, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, null) as ExecutedCommandBackgroundStyles;
            var15 = var14.v(var13, 5, h.a, null) as java.lang.Boolean;
            var2 = 63;
            var12 = var8;
            var10 = var7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var var9: UserId = null;
            var var18: java.lang.String = null;
            var var17: Any = null;
            var6 = null;
            var15 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var14.x(var13);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var9 = var14.m(var13, 0, UserId.$serializer.INSTANCE, var9) as UserId;
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var14.k(var13, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var18 = var14.v(var13, 2, b2.a, var18) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var17 = var14.m(var13, 3, AnnotatedStructurableTextSerializer.INSTANCE, var17) as AnnotatedStructurableText;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var14.v(var13, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, var6) as ExecutedCommandBackgroundStyles;
                     var2 |= 16;
                     break;
                  case 5:
                     var15 = var14.v(var13, 5, h.a, var15) as java.lang.Boolean;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var10 = var6;
            var12 = var17;
            var11 = var18;
            var6 = var9;
         }

         var14.b(var13);
         return new ExecutedCommand(
            var2, var6, var3, var11, (AnnotatedStructurableText)var12, (ExecutedCommandBackgroundStyles)var10, (java.lang.Boolean)var15, null, null
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
