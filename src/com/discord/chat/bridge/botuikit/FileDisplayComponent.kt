package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class FileDisplayComponent(type: Int,
      id: String,
      file: UnfurledMediaItem,
      name: String,
      size: String,
      isSpoiler: Boolean,
      spoilerDescription: String?
   )
   : Component,
   SpoilerableData {
   public open val type: Int
   public open val id: String
   public final val file: UnfurledMediaItem
   public final val name: String
   public final val size: String
   public final val isSpoiler: Boolean
   public final val spoilerDescription: String?
   public open val spoilerOrNull: String?
   public open val obscureOrNull: Nothing?

   init {
      r.h(var2, "id");
      r.h(var3, "file");
      r.h(var4, "name");
      r.h(var5, "size");
      super(null);
      this.type = var1;
      this.id = var2;
      this.file = var3;
      this.name = var4;
      this.size = var5;
      this.isSpoiler = var6;
      this.spoilerDescription = var7;
      val var8: Boolean;
      if (var7 != null && !h.c0(var7)) {
         var8 = false;
      } else {
         var8 = true;
      }

      if (var8) {
         var7 = null;
      }

      this.spoilerOrNull = var7;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): UnfurledMediaItem {
      return this.file;
   }

   public operator fun component4(): String {
      return this.name;
   }

   public operator fun component5(): String {
      return this.size;
   }

   public operator fun component6(): Boolean {
      return this.isSpoiler;
   }

   public operator fun component7(): String? {
      return this.spoilerDescription;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      file: UnfurledMediaItem = var0.file,
      name: String = var0.name,
      size: String = var0.size,
      isSpoiler: Boolean = var0.isSpoiler,
      spoilerDescription: String? = var0.spoilerDescription
   ): FileDisplayComponent {
      r.h(var2, "id");
      r.h(var3, "file");
      r.h(var4, "name");
      r.h(var5, "size");
      return new FileDisplayComponent(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FileDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.file, var1.file)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.size, var1.size)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else {
            return r.c(this.spoilerDescription, var1.spoilerDescription);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = Integer.hashCode(this.type);
      val var6: Int = this.id.hashCode();
      val var3: Int = this.file.hashCode();
      val var2: Int = this.name.hashCode();
      val var4: Int = this.size.hashCode();
      val var5: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var1: Int;
      if (this.spoilerDescription == null) {
         var1 = 0;
      } else {
         var1 = this.spoilerDescription.hashCode();
      }

      return (((((var7 * 31 + var6) * 31 + var3) * 31 + var2) * 31 + var4) * 31 + var5) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var6: java.lang.String = this.id;
      val var3: UnfurledMediaItem = this.file;
      val var4: java.lang.String = this.name;
      val var8: java.lang.String = this.size;
      val var2: Boolean = this.isSpoiler;
      val var5: java.lang.String = this.spoilerDescription;
      val var7: StringBuilder = new StringBuilder();
      var7.append("FileDisplayComponent(type=");
      var7.append(var1);
      var7.append(", id=");
      var7.append(var6);
      var7.append(", file=");
      var7.append(var3);
      var7.append(", name=");
      var7.append(var4);
      var7.append(", size=");
      var7.append(var8);
      var7.append(", isSpoiler=");
      var7.append(var2);
      var7.append(", spoilerDescription=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<FileDisplayComponent> {
         return FileDisplayComponent.$serializer.INSTANCE;
      }
   }
}
