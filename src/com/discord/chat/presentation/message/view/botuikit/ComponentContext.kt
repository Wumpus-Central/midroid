package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.internal.q

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
      q.h(var1, "containerId");
      q.h(var2, "markdownTextRenderOptions");
      q.h(var3, "markdownTextRenderEventHandlers");
      q.h(var4, "mediaItemEventHandlers");
      q.h(var5, "userEventHandlers");
      q.h(var6, "contentInventoryEventHandlers");
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
      q.h(var1, "containerId");
      q.h(var2, "markdownTextRenderOptions");
      q.h(var3, "markdownTextRenderEventHandlers");
      q.h(var4, "mediaItemEventHandlers");
      q.h(var5, "userEventHandlers");
      q.h(var6, "contentInventoryEventHandlers");
      return new ComponentContext(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentContext) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.containerId, var1.containerId)) {
            return false;
         } else if (!q.c(this.markdownTextRenderOptions, var1.markdownTextRenderOptions)) {
            return false;
         } else if (!q.c(this.markdownTextRenderEventHandlers, var1.markdownTextRenderEventHandlers)) {
            return false;
         } else if (!q.c(this.mediaItemEventHandlers, var1.mediaItemEventHandlers)) {
            return false;
         } else if (!q.c(this.userEventHandlers, var1.userEventHandlers)) {
            return false;
         } else if (!q.c(this.contentInventoryEventHandlers, var1.contentInventoryEventHandlers)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else {
            return this.shouldAutoPlayGif == var1.shouldAutoPlayGif;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (this.containerId.hashCode() * 31 + this.markdownTextRenderOptions.hashCode()) * 31
                                                      + this.markdownTextRenderEventHandlers.hashCode()
                                                )
                                                * 31
                                             + this.mediaItemEventHandlers.hashCode()
                                       )
                                       * 31
                                    + this.userEventHandlers.hashCode()
                              )
                              * 31
                           + this.contentInventoryEventHandlers.hashCode()
                     )
                     * 31
                  + Integer.hashCode(this.constrainedWidth)
            )
            * 31
         + java.lang.Boolean.hashCode(this.shouldAutoPlayGif);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.containerId;
      val var7: MarkdownTextRenderOptions = this.markdownTextRenderOptions;
      val var6: MarkdownTextRenderEventHandlers = this.markdownTextRenderEventHandlers;
      val var8: MediaItemEventHandlers = this.mediaItemEventHandlers;
      val var3: UserEventHandlers = this.userEventHandlers;
      val var5: ContentInventoryEventHandlers = this.contentInventoryEventHandlers;
      val var1: Int = this.constrainedWidth;
      val var2: Boolean = this.shouldAutoPlayGif;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ComponentContext(containerId=");
      var9.append(var4);
      var9.append(", markdownTextRenderOptions=");
      var9.append(var7);
      var9.append(", markdownTextRenderEventHandlers=");
      var9.append(var6);
      var9.append(", mediaItemEventHandlers=");
      var9.append(var8);
      var9.append(", userEventHandlers=");
      var9.append(var3);
      var9.append(", contentInventoryEventHandlers=");
      var9.append(var5);
      var9.append(", constrainedWidth=");
      var9.append(var1);
      var9.append(", shouldAutoPlayGif=");
      var9.append(var2);
      var9.append(")");
      return var9.toString();
   }
}
