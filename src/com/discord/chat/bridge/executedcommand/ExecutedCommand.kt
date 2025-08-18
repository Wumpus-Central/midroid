package com.discord.chat.bridge.executedcommand

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class ExecutedCommand(userId: UserId,
   usernameColor: Int,
   avatarURL: String? = ...,
   targetUsernameColor: Int,
   content: AnnotatedStructurableText,
   commandNameBackgroundStyles: ExecutedCommandBackgroundStyles? = ...,
   showAppsIcon: Boolean? = ...,
   showControllerIcon: Boolean? = ...
) : ExecutedCommand(var1, var3, var4, var5, var6, var7, var8, var9) {
   public final val userId: UserId
   public final val usernameColor: Int
   public final val avatarURL: String?
   public final val targetUsernameColor: Int
   public final val content: AnnotatedStructurableText
   public final val commandNameBackgroundStyles: ExecutedCommandBackgroundStyles?
   public final val showAppsIcon: Boolean?
   public final val showControllerIcon: Boolean?

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
         } else if (!(this.avatarURL == var1.avatarURL)) {
            return false;
         } else if (this.targetUsernameColor != var1.targetUsernameColor) {
            return false;
         } else if (!(this.content == var1.content)) {
            return false;
         } else if (!(this.commandNameBackgroundStyles == var1.commandNameBackgroundStyles)) {
            return false;
         } else if (!(this.showAppsIcon == var1.showAppsIcon)) {
            return false;
         } else {
            return this.showControllerIcon == var1.showControllerIcon;
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
      val var8: java.lang.String = UserId.toString-impl(this.userId);
      val var2: Int = this.usernameColor;
      val var9: java.lang.String = this.avatarURL;
      val var1: Int = this.targetUsernameColor;
      val var4: AnnotatedStructurableText = this.content;
      val var5: ExecutedCommandBackgroundStyles = this.commandNameBackgroundStyles;
      val var6: java.lang.Boolean = this.showAppsIcon;
      val var3: java.lang.Boolean = this.showControllerIcon;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ExecutedCommand(userId=");
      var7.append(var8);
      var7.append(", usernameColor=");
      var7.append(var2);
      var7.append(", avatarURL=");
      var7.append(var9);
      var7.append(", targetUsernameColor=");
      var7.append(var1);
      var7.append(", content=");
      var7.append(var4);
      var7.append(", commandNameBackgroundStyles=");
      var7.append(var5);
      var7.append(", showAppsIcon=");
      var7.append(var6);
      var7.append(", showControllerIcon=");
      var7.append(var3);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommand> {
         return ExecutedCommand.$serializer.INSTANCE;
      }
   }
}
