package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class MediaGalleryDisplayComponent(type: Int, id: String, items: List<MediaGalleryItem>) : Component() {
   public open val type: Int
   public open val id: String
   public final val items: List<MediaGalleryItem>

   init {
      this.type = var1;
      this.id = var2;
      this.items = var3;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): List<MediaGalleryItem> {
      return this.items;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, items: List<MediaGalleryItem> = var0.items): MediaGalleryDisplayComponent {
      return new MediaGalleryDisplayComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaGalleryDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!(this.id == var1.id)) {
            return false;
         } else {
            return this.items == var1.items;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + this.items.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var3: java.util.List = this.items;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MediaGalleryDisplayComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var4);
      var2.append(", items=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryDisplayComponent> {
         return MediaGalleryDisplayComponent.$serializer.INSTANCE;
      }
   }
}
