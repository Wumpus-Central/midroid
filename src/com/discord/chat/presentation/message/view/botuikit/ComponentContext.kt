package com.discord.chat.presentation.message.view.botuikit

public data class ComponentContext(containerId: String,
   generalEventHandlers: GeneralEventHandlers,
   markdownTextRenderOptions: MarkdownTextRenderOptions,
   markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers,
   mediaItemEventHandlers: MediaItemEventHandlers,
   componentActionEventHandlers: ComponentActionEventHandlers,
   widthInfo: WidthInfo,
   shouldAutoPlayGif: Boolean,
   isForwardedContent: Boolean,
   isInContainerComponent: Boolean,
   isInModal: Boolean
) {
   public final val containerId: String
   public final val generalEventHandlers: GeneralEventHandlers
   public final val markdownTextRenderOptions: MarkdownTextRenderOptions
   public final val markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers
   public final val mediaItemEventHandlers: MediaItemEventHandlers
   public final val componentActionEventHandlers: ComponentActionEventHandlers
   public final val widthInfo: WidthInfo
   public final val shouldAutoPlayGif: Boolean
   public final val isForwardedContent: Boolean
   public final val isInContainerComponent: Boolean
   public final val isInModal: Boolean

   init {
      this.containerId = var1;
      this.generalEventHandlers = var2;
      this.markdownTextRenderOptions = var3;
      this.markdownTextRenderEventHandlers = var4;
      this.mediaItemEventHandlers = var5;
      this.componentActionEventHandlers = var6;
      this.widthInfo = var7;
      this.shouldAutoPlayGif = var8;
      this.isForwardedContent = var9;
      this.isInContainerComponent = var10;
      this.isInModal = var11;
   }

   public operator fun component1(): String {
      return this.containerId;
   }

   public operator fun component10(): Boolean {
      return this.isInContainerComponent;
   }

   public operator fun component11(): Boolean {
      return this.isInModal;
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

   public operator fun component7(): WidthInfo {
      return this.widthInfo;
   }

   public operator fun component8(): Boolean {
      return this.shouldAutoPlayGif;
   }

   public operator fun component9(): Boolean {
      return this.isForwardedContent;
   }

   public fun copy(
      containerId: String = var0.containerId,
      generalEventHandlers: GeneralEventHandlers = var0.generalEventHandlers,
      markdownTextRenderOptions: MarkdownTextRenderOptions = var0.markdownTextRenderOptions,
      markdownTextRenderEventHandlers: MarkdownTextRenderEventHandlers = var0.markdownTextRenderEventHandlers,
      mediaItemEventHandlers: MediaItemEventHandlers = var0.mediaItemEventHandlers,
      componentActionEventHandlers: ComponentActionEventHandlers = var0.componentActionEventHandlers,
      widthInfo: WidthInfo = var0.widthInfo,
      shouldAutoPlayGif: Boolean = var0.shouldAutoPlayGif,
      isForwardedContent: Boolean = var0.isForwardedContent,
      isInContainerComponent: Boolean = var0.isInContainerComponent,
      isInModal: Boolean = var0.isInModal
   ): ComponentContext {
      return new ComponentContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ComponentContext) {
         return false;
      } else {
         var1 = var1;
         if (!(this.containerId == var1.containerId)) {
            return false;
         } else if (!(this.generalEventHandlers == var1.generalEventHandlers)) {
            return false;
         } else if (!(this.markdownTextRenderOptions == var1.markdownTextRenderOptions)) {
            return false;
         } else if (!(this.markdownTextRenderEventHandlers == var1.markdownTextRenderEventHandlers)) {
            return false;
         } else if (!(this.mediaItemEventHandlers == var1.mediaItemEventHandlers)) {
            return false;
         } else if (!(this.componentActionEventHandlers == var1.componentActionEventHandlers)) {
            return false;
         } else if (!(this.widthInfo == var1.widthInfo)) {
            return false;
         } else if (this.shouldAutoPlayGif != var1.shouldAutoPlayGif) {
            return false;
         } else if (this.isForwardedContent != var1.isForwardedContent) {
            return false;
         } else if (this.isInContainerComponent != var1.isInContainerComponent) {
            return false;
         } else {
            return this.isInModal == var1.isInModal;
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
                                             + this.widthInfo.hashCode()
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.shouldAutoPlayGif)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.isForwardedContent)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.isInContainerComponent)
            )
            * 31
         + java.lang.Boolean.hashCode(this.isInModal);
   }

   public fun reduceAvailableWidth(widthReduction: Int): ComponentContext {
      return copy$default(
         this,
         null,
         null,
         null,
         null,
         null,
         null,
         WidthInfo.copy$default(this.widthInfo, 0, 0, this.widthInfo.getWidthReductions$chat_release() + var1, 3, null),
         false,
         false,
         false,
         false,
         1983,
         null
      );
   }

   public override fun toString(): String {
      val var12: java.lang.String = this.containerId;
      val var6: GeneralEventHandlers = this.generalEventHandlers;
      val var10: MarkdownTextRenderOptions = this.markdownTextRenderOptions;
      val var9: MarkdownTextRenderEventHandlers = this.markdownTextRenderEventHandlers;
      val var7: MediaItemEventHandlers = this.mediaItemEventHandlers;
      val var5: ComponentActionEventHandlers = this.componentActionEventHandlers;
      val var11: WidthInfo = this.widthInfo;
      val var3: Boolean = this.shouldAutoPlayGif;
      val var1: Boolean = this.isForwardedContent;
      val var2: Boolean = this.isInContainerComponent;
      val var4: Boolean = this.isInModal;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ComponentContext(containerId=");
      var8.append(var12);
      var8.append(", generalEventHandlers=");
      var8.append(var6);
      var8.append(", markdownTextRenderOptions=");
      var8.append(var10);
      var8.append(", markdownTextRenderEventHandlers=");
      var8.append(var9);
      var8.append(", mediaItemEventHandlers=");
      var8.append(var7);
      var8.append(", componentActionEventHandlers=");
      var8.append(var5);
      var8.append(", widthInfo=");
      var8.append(var11);
      var8.append(", shouldAutoPlayGif=");
      var8.append(var3);
      var8.append(", isForwardedContent=");
      var8.append(var1);
      var8.append(", isInContainerComponent=");
      var8.append(var2);
      var8.append(", isInModal=");
      var8.append(var4);
      var8.append(")");
      return var8.toString();
   }
}
