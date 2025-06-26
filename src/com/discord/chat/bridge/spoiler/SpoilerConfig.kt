package com.discord.chat.bridge.spoiler

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public data class SpoilerConfig(attributes: SpoilerAttributes,
   onTapObscureToggle: (Boolean) -> Unit,
   onReveal: (SpoilerIdentifier) -> Unit,
   onHide: (SpoilerIdentifier) -> Unit
) {
   public final val attributes: SpoilerAttributes
   public final val onTapObscureToggle: (Boolean) -> Unit
   private final val onReveal: (SpoilerIdentifier) -> Unit
   private final val onHide: (SpoilerIdentifier) -> Unit

   init {
      q.h(var1, "attributes");
      q.h(var2, "onTapObscureToggle");
      q.h(var3, "onReveal");
      q.h(var4, "onHide");
      super();
      this.attributes = var1;
      this.onTapObscureToggle = var2;
      this.onReveal = var3;
      this.onHide = var4;
   }

   private operator fun component3(): (SpoilerIdentifier) -> Unit {
      return this.onReveal;
   }

   private operator fun component4(): (SpoilerIdentifier) -> Unit {
      return this.onHide;
   }

   public operator fun component1(): SpoilerAttributes {
      return this.attributes;
   }

   public operator fun component2(): (Boolean) -> Unit {
      return this.onTapObscureToggle;
   }

   public fun copy(
      attributes: SpoilerAttributes = var0.attributes,
      onTapObscureToggle: (Boolean) -> Unit = var0.onTapObscureToggle,
      onReveal: (SpoilerIdentifier) -> Unit = var0.onReveal,
      onHide: (SpoilerIdentifier) -> Unit = var0.onHide
   ): SpoilerConfig {
      q.h(var1, "attributes");
      q.h(var2, "onTapObscureToggle");
      q.h(var3, "onReveal");
      q.h(var4, "onHide");
      return new SpoilerConfig(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SpoilerConfig) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.attributes, var1.attributes)) {
            return false;
         } else if (!q.c(this.onTapObscureToggle, var1.onTapObscureToggle)) {
            return false;
         } else if (!q.c(this.onReveal, var1.onReveal)) {
            return false;
         } else {
            return q.c(this.onHide, var1.onHide);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.attributes.hashCode() * 31 + this.onTapObscureToggle.hashCode()) * 31 + this.onReveal.hashCode()) * 31 + this.onHide.hashCode();
   }

   public fun onHide() {
      this.onHide.invoke(SpoilerIdentifier.box-impl(this.attributes.getIdentifier-Bq9X6Gg()));
   }

   public fun onReveal() {
      this.onReveal.invoke(SpoilerIdentifier.box-impl(this.attributes.getIdentifier-Bq9X6Gg()));
   }

   public override fun toString(): String {
      val var2: SpoilerAttributes = this.attributes;
      val var3: Function1 = this.onTapObscureToggle;
      val var4: Function1 = this.onReveal;
      val var1: Function1 = this.onHide;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SpoilerConfig(attributes=");
      var5.append(var2);
      var5.append(", onTapObscureToggle=");
      var5.append(var3);
      var5.append(", onReveal=");
      var5.append(var4);
      var5.append(", onHide=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }
}
