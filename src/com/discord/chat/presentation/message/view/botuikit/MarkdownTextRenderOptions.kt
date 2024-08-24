package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.internal.r

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
      r.h(var1, "containerId");
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
      r.h(var1, "containerId");
      return new MarkdownTextRenderOptions(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MarkdownTextRenderOptions) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.containerId, var1.containerId)) {
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
      val var6: Int = this.containerId.hashCode();
      var var4: Byte = 1;
      var var1: Byte = this.shouldAnimateEmoji;
      if (this.shouldAnimateEmoji != 0) {
         var1 = 1;
      }

      var var7: Byte = this.shouldShowLinkDecorations;
      if (this.shouldShowLinkDecorations != 0) {
         var7 = 1;
      }

      var var8: Byte = this.shouldShowRoleDot;
      if (this.shouldShowRoleDot != 0) {
         var8 = 1;
      }

      if (this.shouldShowRoleOnName == 0) {
         var4 = this.shouldShowRoleOnName;
      }

      return (((var6 * 31 + var1) * 31 + var7) * 31 + var8) * 31 + var4;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.containerId;
      val var3: Boolean = this.shouldAnimateEmoji;
      val var1: Boolean = this.shouldShowLinkDecorations;
      val var4: Boolean = this.shouldShowRoleDot;
      val var2: Boolean = this.shouldShowRoleOnName;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MarkdownTextRenderOptions(containerId=");
      var5.append(var6);
      var5.append(", shouldAnimateEmoji=");
      var5.append(var3);
      var5.append(", shouldShowLinkDecorations=");
      var5.append(var1);
      var5.append(", shouldShowRoleDot=");
      var5.append(var4);
      var5.append(", shouldShowRoleOnName=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }
}
