package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.internal.r

public data class ComponentContext(containerId: String,
   markdownTextRenderOptions: MarkdownTextRenderOptions,
   markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers,
   mediaItemEventHandlers: MediaItemEventHandlers,
   userEventHandlers: UserEventHandlers,
   contentInventoryEventHandlers: ContentInventoryEventHandlers,
   constrainedWidth: Int,
   shouldAutoPlayGif: Boolean
) {
   public final val constrainedWidth: Int
   public final val containerId: String
   public final val contentInventoryEventHandlers: ContentInventoryEventHandlers
   public final val markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers
   public final val markdownTextRenderOptions: MarkdownTextRenderOptions
   public final val mediaItemEventHandlers: MediaItemEventHandlers
   public final val shouldAutoPlayGif: Boolean
   public final val userEventHandlers: UserEventHandlers

   init {
      r.h(var1, "containerId");
      r.h(var2, "markdownTextRenderOptions");
      r.h(var3, "markdownTextRenderEventHandlers");
      r.h(var4, "mediaItemEventHandlers");
      r.h(var5, "userEventHandlers");
      r.h(var6, "contentInventoryEventHandlers");
      super();
      this.containerId = var1;
      this.markdownTextRenderOptions = var2;
      this.markdownTextRenderEventHandlers = var3;
      this.mediaItemEventHandlers = var4;
      this.userEventHandlers = var5;
      this.contentInventoryEventHandlers = var6;
      this.constrainedWidth = var7;
      this.shouldAutoPlayGif = var8;
   }

   public operator fun component1(): String {
      return this.containerId;
   }

   public operator fun component2(): MarkdownTextRenderOptions {
      return this.markdownTextRenderOptions;
   }

   public operator fun component3(): MarkdownTextRenderEventHandlers {
      return this.markdownTextRenderEventHandlers;
   }

   public operator fun component4(): MediaItemEventHandlers {
      return this.mediaItemEventHandlers;
   }

   public operator fun component5(): UserEventHandlers {
      return this.userEventHandlers;
   }

   public operator fun component6(): ContentInventoryEventHandlers {
      return this.contentInventoryEventHandlers;
   }

   public operator fun component7(): Int {
      return this.constrainedWidth;
   }

   public operator fun component8(): Boolean {
      return this.shouldAutoPlayGif;
   }

   public fun copy(
      containerId: String = var0.containerId,
      markdownTextRenderOptions: MarkdownTextRenderOptions = var0.markdownTextRenderOptions,
      markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers = var0.markdownTextRenderEventHandlers,
      mediaItemEventHandlers: MediaItemEventHandlers = var0.mediaItemEventHandlers,
      userEventHandlers: UserEventHandlers = var0.userEventHandlers,
      contentInventoryEventHandlers: ContentInventoryEventHandlers = var0.contentInventoryEventHandlers,
      constrainedWidth: Int = var0.constrainedWidth,
      shouldAutoPlayGif: Boolean = var0.shouldAutoPlayGif
   ): ComponentContext {
      r.h(var1, "containerId");
      r.h(var2, "markdownTextRenderOptions");
      r.h(var3, "markdownTextRenderEventHandlers");
      r.h(var4, "mediaItemEventHandlers");
      r.h(var5, "userEventHandlers");
      r.h(var6, "contentInventoryEventHandlers");
      return new ComponentContext(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentContext) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.containerId, var1.containerId)) {
            return false;
         } else if (!r.c(this.markdownTextRenderOptions, var1.markdownTextRenderOptions)) {
            return false;
         } else if (!r.c(this.markdownTextRenderEventHandlers, var1.markdownTextRenderEventHandlers)) {
            return false;
         } else if (!r.c(this.mediaItemEventHandlers, var1.mediaItemEventHandlers)) {
            return false;
         } else if (!r.c(this.userEventHandlers, var1.userEventHandlers)) {
            return false;
         } else if (!r.c(this.contentInventoryEventHandlers, var1.contentInventoryEventHandlers)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else {
            return this.shouldAutoPlayGif == var1.shouldAutoPlayGif;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.containerId.hashCode();
      val var5: Int = this.markdownTextRenderOptions.hashCode();
      val var3: Int = this.markdownTextRenderEventHandlers.hashCode();
      val var7: Int = this.mediaItemEventHandlers.hashCode();
      val var9: Int = this.userEventHandlers.hashCode();
      val var4: Int = this.contentInventoryEventHandlers.hashCode();
      val var8: Int = Integer.hashCode(this.constrainedWidth);
      var var1: Byte = this.shouldAutoPlayGif;
      if (this.shouldAutoPlayGif != 0) {
         var1 = 1;
      }

      return ((((((var6 * 31 + var5) * 31 + var3) * 31 + var7) * 31 + var9) * 31 + var4) * 31 + var8) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.containerId;
      val var5: MarkdownTextRenderOptions = this.markdownTextRenderOptions;
      val var8: MarkdownTextRenderEventHandlers = this.markdownTextRenderEventHandlers;
      val var9: MediaItemEventHandlers = this.mediaItemEventHandlers;
      val var7: UserEventHandlers = this.userEventHandlers;
      val var6: ContentInventoryEventHandlers = this.contentInventoryEventHandlers;
      val var1: Int = this.constrainedWidth;
      val var2: Boolean = this.shouldAutoPlayGif;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ComponentContext(containerId=");
      var4.append(var3);
      var4.append(", markdownTextRenderOptions=");
      var4.append(var5);
      var4.append(", markdownTextRenderEventHandlers=");
      var4.append(var8);
      var4.append(", mediaItemEventHandlers=");
      var4.append(var9);
      var4.append(", userEventHandlers=");
      var4.append(var7);
      var4.append(", contentInventoryEventHandlers=");
      var4.append(var6);
      var4.append(", constrainedWidth=");
      var4.append(var1);
      var4.append(", shouldAutoPlayGif=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
