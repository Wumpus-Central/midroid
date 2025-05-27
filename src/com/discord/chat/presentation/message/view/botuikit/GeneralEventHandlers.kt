package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

public data class GeneralEventHandlers(onLinkClicked: (String, String) -> Unit, onTapSpoiler: () -> Unit) {
   public final val onLinkClicked: (String, String) -> Unit
   public final val onTapSpoiler: () -> Unit

   init {
      q.h(var1, "onLinkClicked");
      q.h(var2, "onTapSpoiler");
      super();
      this.onLinkClicked = var1;
      this.onTapSpoiler = var2;
   }

   public operator fun component1(): (String, String) -> Unit {
      return this.onLinkClicked;
   }

   public operator fun component2(): () -> Unit {
      return this.onTapSpoiler;
   }

   public fun copy(onLinkClicked: (String, String) -> Unit = var0.onLinkClicked, onTapSpoiler: () -> Unit = var0.onTapSpoiler): GeneralEventHandlers {
      q.h(var1, "onLinkClicked");
      q.h(var2, "onTapSpoiler");
      return new GeneralEventHandlers(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GeneralEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.onLinkClicked, var1.onLinkClicked)) {
            return false;
         } else {
            return q.c(this.onTapSpoiler, var1.onTapSpoiler);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.onLinkClicked.hashCode() * 31 + this.onTapSpoiler.hashCode();
   }

   public override fun toString(): String {
      val var3: Function2 = this.onLinkClicked;
      val var2: Function0 = this.onTapSpoiler;
      val var1: StringBuilder = new StringBuilder();
      var1.append("GeneralEventHandlers(onLinkClicked=");
      var1.append(var3);
      var1.append(", onTapSpoiler=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
