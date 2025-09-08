package com.discord.chat.presentation.message.view.botuikit.react

import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions

public data class PartialData(component: TextDisplayComponent? = null, markdownTextRenderOptions: MarkdownTextRenderOptions? = null) {
   public final var component: TextDisplayComponent?
      internal set

   public final var markdownTextRenderOptions: MarkdownTextRenderOptions?
      internal set

   fun PartialData() {
      this(null, null, 3, null);
   }

   init {
      this.component = var1;
      this.markdownTextRenderOptions = var2;
   }

   public operator fun component1(): TextDisplayComponent? {
      return this.component;
   }

   public operator fun component2(): MarkdownTextRenderOptions? {
      return this.markdownTextRenderOptions;
   }

   public fun copy(component: TextDisplayComponent? = var0.component, markdownTextRenderOptions: MarkdownTextRenderOptions? = var0.markdownTextRenderOptions): PartialData {
      return new PartialData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PartialData) {
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
      var var2: Int = 0;
      val var1: Int;
      if (this.component == null) {
         var1 = 0;
      } else {
         var1 = this.component.hashCode();
      }

      if (this.markdownTextRenderOptions != null) {
         var2 = this.markdownTextRenderOptions.hashCode();
      }

      return var1 * 31 + var2;
   }

   public fun toData(): Data? {
      return if (this.component != null && this.markdownTextRenderOptions != null) new Data(this.component, this.markdownTextRenderOptions) else null;
   }

   public override fun toString(): String {
      val var1: TextDisplayComponent = this.component;
      val var3: MarkdownTextRenderOptions = this.markdownTextRenderOptions;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PartialData(component=");
      var2.append(var1);
      var2.append(", markdownTextRenderOptions=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
