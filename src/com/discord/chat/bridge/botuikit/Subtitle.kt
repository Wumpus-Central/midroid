package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class Subtitle(badgeUrl: String? = null, text: String, ariaDescription: String? = null, clickable: ContentInventoryEntryClickable? = null) {
   public final val badgeUrl: String?
   public final val text: String
   public final val ariaDescription: String?
   public final val clickable: ContentInventoryEntryClickable?

   init {
      super();
      this.badgeUrl = var1;
      this.text = var2;
      this.ariaDescription = var3;
      this.clickable = var4;
   }

   public operator fun component1(): String? {
      return this.badgeUrl;
   }

   public operator fun component2(): String {
      return this.text;
   }

   public operator fun component3(): String? {
      return this.ariaDescription;
   }

   public operator fun component4(): ContentInventoryEntryClickable? {
      return this.clickable;
   }

   public fun copy(
      badgeUrl: String? = var0.badgeUrl,
      text: String = var0.text,
      ariaDescription: String? = var0.ariaDescription,
      clickable: ContentInventoryEntryClickable? = var0.clickable
   ): Subtitle {
      return new Subtitle(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Subtitle) {
         return false;
      } else {
         var1 = var1;
         if (!(this.badgeUrl == var1.badgeUrl)) {
            return false;
         } else if (!(this.text == var1.text)) {
            return false;
         } else if (!(this.ariaDescription == var1.ariaDescription)) {
            return false;
         } else {
            return this.clickable == var1.clickable;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.badgeUrl == null) {
         var1 = 0;
      } else {
         var1 = this.badgeUrl.hashCode();
      }

      val var4: Int = this.text.hashCode();
      val var2: Int;
      if (this.ariaDescription == null) {
         var2 = 0;
      } else {
         var2 = this.ariaDescription.hashCode();
      }

      if (this.clickable != null) {
         var3 = this.clickable.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.badgeUrl;
      val var1: java.lang.String = this.text;
      val var3: java.lang.String = this.ariaDescription;
      val var2: ContentInventoryEntryClickable = this.clickable;
      val var4: StringBuilder = new StringBuilder();
      var4.append("Subtitle(badgeUrl=");
      var4.append(var5);
      var4.append(", text=");
      var4.append(var1);
      var4.append(", ariaDescription=");
      var4.append(var3);
      var4.append(", clickable=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Subtitle> {
         return Subtitle.$serializer.INSTANCE;
      }
   }
}
