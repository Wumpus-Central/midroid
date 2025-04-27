package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.internal.q

public data class ComponentContext(containerId: String,
   generalEventHandlers: GeneralEventHandlers,
   markdownTextRenderOptions: MarkdownTextRenderOptions,
   markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers,
   mediaItemEventHandlers: MediaItemEventHandlers,
   componentActionEventHandlers: ComponentActionEventHandlers,
   constrainedWidth: Int,
   isLargeWidthRenderingMode: Boolean,
   shouldAutoPlayGif: Boolean,
   isForwardedContent: Boolean,
   isInContainerComponent: Boolean
) {
   public final val componentActionEventHandlers: ComponentActionEventHandlers
   public final val constrainedWidth: Int
   public final val containerId: String
   public final val generalEventHandlers: GeneralEventHandlers
   public final val isForwardedContent: Boolean
   public final val isInContainerComponent: Boolean
   public final val isLargeWidthRenderingMode: Boolean
   public final val markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers
   public final val markdownTextRenderOptions: MarkdownTextRenderOptions
   public final val mediaItemEventHandlers: MediaItemEventHandlers
   public final val shouldAutoPlayGif: Boolean

   init {
      q.h(var1, "containerId");
      q.h(var2, "generalEventHandlers");
      q.h(var3, "markdownTextRenderOptions");
      q.h(var4, "markdownTextRenderEventHandlers");
      q.h(var5, "mediaItemEventHandlers");
      q.h(var6, "componentActionEventHandlers");
      super();
      this.containerId = var1;
      this.generalEventHandlers = var2;
      this.markdownTextRenderOptions = var3;
      this.markdownTextRenderEventHandlers = var4;
      this.mediaItemEventHandlers = var5;
      this.componentActionEventHandlers = var6;
      this.constrainedWidth = var7;
      this.isLargeWidthRenderingMode = var8;
      this.shouldAutoPlayGif = var9;
      this.isForwardedContent = var10;
      this.isInContainerComponent = var11;
   }

   public operator fun component1(): String {
      return this.containerId;
   }

   public operator fun component10(): Boolean {
      return this.isForwardedContent;
   }

   public operator fun component11(): Boolean {
      return this.isInContainerComponent;
   }

   public operator fun component2(): GeneralEventHandlers {
      return this.generalEventHandlers;
   }

   public operator fun component3(): MarkdownTextRenderOptions {
      return this.markdownTextRenderOptions;
   }

   public operator fun component4(): MarkdownTextRenderEventHandlers {
      return this.markdownTextRenderEventHandlers;
   }

   public operator fun component5(): MediaItemEventHandlers {
      return this.mediaItemEventHandlers;
   }

   public operator fun component6(): ComponentActionEventHandlers {
      return this.componentActionEventHandlers;
   }

   public operator fun component7(): Int {
      return this.constrainedWidth;
   }

   public operator fun component8(): Boolean {
      return this.isLargeWidthRenderingMode;
   }

   public operator fun component9(): Boolean {
      return this.shouldAutoPlayGif;
   }

   public fun copy(
      containerId: String = var0.containerId,
      generalEventHandlers: GeneralEventHandlers = var0.generalEventHandlers,
      markdownTextRenderOptions: MarkdownTextRenderOptions = var0.markdownTextRenderOptions,
      markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers = var0.markdownTextRenderEventHandlers,
      mediaItemEventHandlers: MediaItemEventHandlers = var0.mediaItemEventHandlers,
      componentActionEventHandlers: ComponentActionEventHandlers = var0.componentActionEventHandlers,
      constrainedWidth: Int = var0.constrainedWidth,
      isLargeWidthRenderingMode: Boolean = var0.isLargeWidthRenderingMode,
      shouldAutoPlayGif: Boolean = var0.shouldAutoPlayGif,
      isForwardedContent: Boolean = var0.isForwardedContent,
      isInContainerComponent: Boolean = var0.isInContainerComponent
   ): ComponentContext {
      q.h(var1, "containerId");
      q.h(var2, "generalEventHandlers");
      q.h(var3, "markdownTextRenderOptions");
      q.h(var4, "markdownTextRenderEventHandlers");
      q.h(var5, "mediaItemEventHandlers");
      q.h(var6, "componentActionEventHandlers");
      return new ComponentContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
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
         } else if (!q.c(this.generalEventHandlers, var1.generalEventHandlers)) {
            return false;
         } else if (!q.c(this.markdownTextRenderOptions, var1.markdownTextRenderOptions)) {
            return false;
         } else if (!q.c(this.markdownTextRenderEventHandlers, var1.markdownTextRenderEventHandlers)) {
            return false;
         } else if (!q.c(this.mediaItemEventHandlers, var1.mediaItemEventHandlers)) {
            return false;
         } else if (!q.c(this.componentActionEventHandlers, var1.componentActionEventHandlers)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.isLargeWidthRenderingMode != var1.isLargeWidthRenderingMode) {
            return false;
         } else if (this.shouldAutoPlayGif != var1.shouldAutoPlayGif) {
            return false;
         } else if (this.isForwardedContent != var1.isForwardedContent) {
            return false;
         } else {
            return this.isInContainerComponent == var1.isInContainerComponent;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (this.containerId.hashCode() * 31 + this.generalEventHandlers.hashCode()) * 31
                                                                                 + this.markdownTextRenderOptions.hashCode()
                                                                           )
                                                                           * 31
                                                                        + this.markdownTextRenderEventHandlers.hashCode()
                                                                  )
                                                                  * 31
                                                               + this.mediaItemEventHandlers.hashCode()
                                                         )
                                                         * 31
                                                      + this.componentActionEventHandlers.hashCode()
                                                )
                                                * 31
                                             + Integer.hashCode(this.constrainedWidth)
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.isLargeWidthRenderingMode)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.shouldAutoPlayGif)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.isForwardedContent)
            )
            * 31
         + java.lang.Boolean.hashCode(this.isInContainerComponent);
   }

   public override fun toString(): String {
      val var11: java.lang.String = this.containerId;
      val var9: GeneralEventHandlers = this.generalEventHandlers;
      val var8: MarkdownTextRenderOptions = this.markdownTextRenderOptions;
      val var6: MarkdownTextRenderEventHandlers = this.markdownTextRenderEventHandlers;
      val var7: MediaItemEventHandlers = this.mediaItemEventHandlers;
      val var12: ComponentActionEventHandlers = this.componentActionEventHandlers;
      val var1: Int = this.constrainedWidth;
      val var2: Boolean = this.isLargeWidthRenderingMode;
      val var5: Boolean = this.shouldAutoPlayGif;
      val var4: Boolean = this.isForwardedContent;
      val var3: Boolean = this.isInContainerComponent;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ComponentContext(containerId=");
      var10.append(var11);
      var10.append(", generalEventHandlers=");
      var10.append(var9);
      var10.append(", markdownTextRenderOptions=");
      var10.append(var8);
      var10.append(", markdownTextRenderEventHandlers=");
      var10.append(var6);
      var10.append(", mediaItemEventHandlers=");
      var10.append(var7);
      var10.append(", componentActionEventHandlers=");
      var10.append(var12);
      var10.append(", constrainedWidth=");
      var10.append(var1);
      var10.append(", isLargeWidthRenderingMode=");
      var10.append(var2);
      var10.append(", shouldAutoPlayGif=");
      var10.append(var5);
      var10.append(", isForwardedContent=");
      var10.append(var4);
      var10.append(", isInContainerComponent=");
      var10.append(var3);
      var10.append(")");
      return var10.toString();
   }
}
