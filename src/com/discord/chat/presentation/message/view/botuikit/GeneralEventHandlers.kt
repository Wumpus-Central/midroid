package com.discord.chat.presentation.message.view.botuikit

import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2

public data class GeneralEventHandlers(onLinkClicked: (String, String) -> Unit, onTapSpoiler: () -> Unit) {
   public final val onLinkClicked: (String, String) -> Unit
   public final val onTapSpoiler: () -> Unit

   init {
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
      return new GeneralEventHandlers(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GeneralEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!(this.onLinkClicked == var1.onLinkClicked)) {
            return false;
         } else {
            return this.onTapSpoiler == var1.onTapSpoiler;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.onLinkClicked.hashCode() * 31 + this.onTapSpoiler.hashCode();
   }

   public override fun toString(): String {
      val var3: Function2 = this.onLinkClicked;
      val var1: Function0 = this.onTapSpoiler;
      val var2: StringBuilder = new StringBuilder();
      var2.append("GeneralEventHandlers(onLinkClicked=");
      var2.append(var3);
      var2.append(", onTapSpoiler=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
