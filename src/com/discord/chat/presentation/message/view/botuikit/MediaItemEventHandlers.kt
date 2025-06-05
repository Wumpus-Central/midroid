package com.discord.chat.presentation.message.view.botuikit

import android.view.View
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.q

public data class MediaItemEventHandlers(onMediaItemClicked: (View, String, Int, Double?) -> Unit,
   onMediaItemLongClicked: ((String, Int?) -> Unit)?,
   onMediaItemSpoilerClicked: () -> Unit,
   onMediaItemAltTextButtonClicked: (String) -> Unit,
   onMediaItemObscureToggle: (Boolean) -> Unit
) {
   public final val onMediaItemClicked: (View, String, Int, Double?) -> Unit
   public final val onMediaItemLongClicked: ((String, Int?) -> Unit)?
   public final val onMediaItemSpoilerClicked: () -> Unit
   public final val onMediaItemAltTextButtonClicked: (String) -> Unit
   public final val onMediaItemObscureToggle: (Boolean) -> Unit

   init {
      q.h(var1, "onMediaItemClicked");
      q.h(var3, "onMediaItemSpoilerClicked");
      q.h(var4, "onMediaItemAltTextButtonClicked");
      q.h(var5, "onMediaItemObscureToggle");
      super();
      this.onMediaItemClicked = var1;
      this.onMediaItemLongClicked = var2;
      this.onMediaItemSpoilerClicked = var3;
      this.onMediaItemAltTextButtonClicked = var4;
      this.onMediaItemObscureToggle = var5;
   }

   public operator fun component1(): (View, String, Int, Double?) -> Unit {
      return this.onMediaItemClicked;
   }

   public operator fun component2(): ((String, Int?) -> Unit)? {
      return this.onMediaItemLongClicked;
   }

   public operator fun component3(): () -> Unit {
      return this.onMediaItemSpoilerClicked;
   }

   public operator fun component4(): (String) -> Unit {
      return this.onMediaItemAltTextButtonClicked;
   }

   public operator fun component5(): (Boolean) -> Unit {
      return this.onMediaItemObscureToggle;
   }

   public fun copy(
      onMediaItemClicked: (View, String, Int, Double?) -> Unit = var0.onMediaItemClicked,
      onMediaItemLongClicked: ((String, Int?) -> Unit)? = var0.onMediaItemLongClicked,
      onMediaItemSpoilerClicked: () -> Unit = var0.onMediaItemSpoilerClicked,
      onMediaItemAltTextButtonClicked: (String) -> Unit = var0.onMediaItemAltTextButtonClicked,
      onMediaItemObscureToggle: (Boolean) -> Unit = var0.onMediaItemObscureToggle
   ): MediaItemEventHandlers {
      q.h(var1, "onMediaItemClicked");
      q.h(var3, "onMediaItemSpoilerClicked");
      q.h(var4, "onMediaItemAltTextButtonClicked");
      q.h(var5, "onMediaItemObscureToggle");
      return new MediaItemEventHandlers(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaItemEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.onMediaItemClicked, var1.onMediaItemClicked)) {
            return false;
         } else if (!q.c(this.onMediaItemLongClicked, var1.onMediaItemLongClicked)) {
            return false;
         } else if (!q.c(this.onMediaItemSpoilerClicked, var1.onMediaItemSpoilerClicked)) {
            return false;
         } else if (!q.c(this.onMediaItemAltTextButtonClicked, var1.onMediaItemAltTextButtonClicked)) {
            return false;
         } else {
            return q.c(this.onMediaItemObscureToggle, var1.onMediaItemObscureToggle);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.onMediaItemClicked.hashCode();
      val var1: Int;
      if (this.onMediaItemLongClicked == null) {
         var1 = 0;
      } else {
         var1 = this.onMediaItemLongClicked.hashCode();
      }

      return (((var2 * 31 + var1) * 31 + this.onMediaItemSpoilerClicked.hashCode()) * 31 + this.onMediaItemAltTextButtonClicked.hashCode()) * 31
         + this.onMediaItemObscureToggle.hashCode();
   }

   public override fun toString(): String {
      val var2: Function4 = this.onMediaItemClicked;
      val var4: Function2 = this.onMediaItemLongClicked;
      val var3: Function0 = this.onMediaItemSpoilerClicked;
      val var5: Function1 = this.onMediaItemAltTextButtonClicked;
      val var6: Function1 = this.onMediaItemObscureToggle;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MediaItemEventHandlers(onMediaItemClicked=");
      var1.append(var2);
      var1.append(", onMediaItemLongClicked=");
      var1.append(var4);
      var1.append(", onMediaItemSpoilerClicked=");
      var1.append(var3);
      var1.append(", onMediaItemAltTextButtonClicked=");
      var1.append(var5);
      var1.append(", onMediaItemObscureToggle=");
      var1.append(var6);
      var1.append(")");
      return var1.toString();
   }
}
