package com.discord.chat.bridge.executedcommand

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import com.discord.primitives.UserId
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.h
import gn.n0
import gn.o1
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
      val var5: java.lang.String = UserId.toString-impl(this.userId);
      val var1: Int = this.usernameColor;
      val var7: java.lang.String = this.avatarURL;
      val var3: AnnotatedStructurableText = this.content;
      val var6: ExecutedCommandBackgroundStyles = this.commandNameBackgroundStyles;
      val var2: java.lang.Boolean = this.showAppsIcon;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ExecutedCommand(userId=");
      var4.append(var5);
      var4.append(", usernameColor=");
      var4.append(var1);
      var4.append(", avatarURL=");
      var4.append(var7);
      var4.append(", content=");
      var4.append(var3);
      var4.append(", commandNameBackgroundStyles=");
      var4.append(var6);
      var4.append(", showAppsIcon=");
      var4.append(var2);
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
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         var var9: UserId;
         val var10: Any;
         var var13: Any;
         var var17: Any;
         if (var12.p()) {
            var9 = var12.y(var11, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var2 = var12.i(var11, 1);
            var8 = var12.n(var11, 2, b2.a, null) as java.lang.String;
            var17 = var12.y(var11, 3, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            val var7: ExecutedCommandBackgroundStyles = var12.n(var11, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, null) as ExecutedCommandBackgroundStyles;
            var13 = var12.n(var11, 5, h.a, null) as java.lang.Boolean;
            var3 = 63;
            var10 = var17;
            var17 = var7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var9 = null;
            var8 = null;
            var var18: Any = null;
            var17 = null;
            var13 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var12.o(var11);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var9 = var12.y(var11, 0, UserId.$serializer.INSTANCE, var9) as UserId;
                     var2 |= 1;
                     break;
                  case 1:
                     var3 = var12.i(var11, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var12.n(var11, 2, b2.a, var8) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var18 = var12.y(var11, 3, AnnotatedStructurableTextSerializer.INSTANCE, var18) as AnnotatedStructurableText;
                     var2 |= 8;
                     break;
                  case 4:
                     var17 = var12.n(var11, 4, ExecutedCommandBackgroundStyles.$serializer.INSTANCE, var17) as ExecutedCommandBackgroundStyles;
                     var2 |= 16;
                     break;
                  case 5:
                     var13 = var12.n(var11, 5, h.a, var13) as java.lang.Boolean;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var10 = var18;
            var2 = var3;
            var3 = var2;
         }

         var12.c(var11);
         return new ExecutedCommand(
            var3, var9, var2, var8, (AnnotatedStructurableText)var10, (ExecutedCommandBackgroundStyles)var17, (java.lang.Boolean)var13, null, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ExecutedCommand) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ExecutedCommand.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommand> {
         return ExecutedCommand.$serializer.INSTANCE;
      }
   }
}
