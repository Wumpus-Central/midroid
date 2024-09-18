package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.internal.q

public data class MarkdownTextRenderOptions(containerId: String,
   shouldAnimateEmoji: Boolean,
   shouldShowLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean
) {
   public final val containerId: String
   public final val shouldAnimateEmoji: Boolean
   public final val shouldShowLinkDecorations: Boolean
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean

   init {
      q.h(var1, "containerId");
      super();
      this.containerId = var1;
      this.shouldAnimateEmoji = var2;
      this.shouldShowLinkDecorations = var3;
      this.shouldShowRoleDot = var4;
      this.shouldShowRoleOnName = var5;
   }

   public operator fun component1(): String {
      return this.containerId;
   }

   public operator fun component2(): Boolean {
      return this.shouldAnimateEmoji;
   }

   public operator fun component3(): Boolean {
      return this.shouldShowLinkDecorations;
   }

   public operator fun component4(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component5(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public fun copy(
      containerId: String = var0.containerId,
      shouldAnimateEmoji: Boolean = var0.shouldAnimateEmoji,
      shouldShowLinkDecorations: Boolean = var0.shouldShowLinkDecorations,
      shouldShowRoleDot: Boolean = var0.shouldShowRoleDot,
      shouldShowRoleOnName: Boolean = var0.shouldShowRoleOnName
   ): MarkdownTextRenderOptions {
      q.h(var1, "containerId");
      return new MarkdownTextRenderOptions(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MarkdownTextRenderOptions) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.containerId, var1.containerId)) {
            return false;
         } else if (this.shouldAnimateEmoji != var1.shouldAnimateEmoji) {
            return false;
         } else if (this.shouldShowLinkDecorations != var1.shouldShowLinkDecorations) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else {
            return this.shouldShowRoleOnName == var1.shouldShowRoleOnName;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (this.containerId.hashCode() * 31 + java.lang.Boolean.hashCode(this.shouldAnimateEmoji)) * 31
                           + java.lang.Boolean.hashCode(this.shouldShowLinkDecorations)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.shouldShowRoleDot)
            )
            * 31
         + java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.containerId;
      val var1: Boolean = this.shouldAnimateEmoji;
      val var4: Boolean = this.shouldShowLinkDecorations;
      val var3: Boolean = this.shouldShowRoleDot;
      val var2: Boolean = this.shouldShowRoleOnName;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MarkdownTextRenderOptions(containerId=");
      var5.append(var6);
      var5.append(", shouldAnimateEmoji=");
      var5.append(var1);
      var5.append(", shouldShowLinkDecorations=");
      var5.append(var4);
      var5.append(", shouldShowRoleDot=");
      var5.append(var3);
      var5.append(", shouldShowRoleOnName=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }
}
