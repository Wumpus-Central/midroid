package com.discord.chat.presentation.message.view.botuikit.react

import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions

public data class Data(component: TextDisplayComponent, markdownTextRenderOptions: MarkdownTextRenderOptions) {
   public final val component: TextDisplayComponent
   public final val markdownTextRenderOptions: MarkdownTextRenderOptions

   init {
      this.component = var1;
      this.markdownTextRenderOptions = var2;
   }

   public operator fun component1(): TextDisplayComponent {
      return this.component;
   }

   public operator fun component2(): MarkdownTextRenderOptions {
      return this.markdownTextRenderOptions;
   }

   public fun copy(component: TextDisplayComponent = var0.component, markdownTextRenderOptions: MarkdownTextRenderOptions = var0.markdownTextRenderOptions): Data {
      return new Data(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Data) {
         return false;
      } else {
         var1 = var1;
         if (!(this.component == var1.component)) {
            return false;
         } else {
            return this.markdownTextRenderOptions == var1.markdownTextRenderOptions;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.component.hashCode() * 31 + this.markdownTextRenderOptions.hashCode();
   }

   public override fun toString(): String {
      val var2: TextDisplayComponent = this.component;
      val var1: MarkdownTextRenderOptions = this.markdownTextRenderOptions;
      val var3: StringBuilder = new StringBuilder();
      var3.append("Data(component=");
      var3.append(var2);
      var3.append(", markdownTextRenderOptions=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
