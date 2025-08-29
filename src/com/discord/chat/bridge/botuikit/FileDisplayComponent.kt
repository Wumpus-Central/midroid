package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import nb.g

@g
@SourceDebugExtension(["SMAP\nFileDisplayComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDisplayComponent.kt\ncom/discord/chat/bridge/botuikit/FileDisplayComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"])
public data class FileDisplayComponent(type: Int,
      id: String,
      file: UnfurledMediaItem,
      name: String,
      size: String,
      isSpoiler: Boolean,
      spoilerDescription: String?
   ) : Component(),
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
      this.type = var1;
      this.id = var2;
      this.file = var3;
      this.name = var4;
      this.size = var5;
      this.isSpoiler = var6;
      this.spoilerDescription = var7;
      val var8: Boolean;
      if (var7 != null && !StringsKt.c0(var7)) {
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
         } else if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.file == var1.file)) {
            return false;
         } else if (!(this.name == var1.name)) {
            return false;
         } else if (!(this.size == var1.size)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else {
            return this.spoilerDescription == var1.spoilerDescription;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.type);
      val var5: Int = this.id.hashCode();
      val var7: Int = this.file.hashCode();
      val var2: Int = this.name.hashCode();
      val var3: Int = this.size.hashCode();
      val var4: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var1: Int;
      if (this.spoilerDescription == null) {
         var1 = 0;
      } else {
         var1 = this.spoilerDescription.hashCode();
      }

      return (((((var6 * 31 + var5) * 31 + var7) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var5: UnfurledMediaItem = this.file;
      val var6: java.lang.String = this.name;
      val var3: java.lang.String = this.size;
      val var2: Boolean = this.isSpoiler;
      val var7: java.lang.String = this.spoilerDescription;
      val var8: StringBuilder = new StringBuilder();
      var8.append("FileDisplayComponent(type=");
      var8.append(var1);
      var8.append(", id=");
      var8.append(var4);
      var8.append(", file=");
      var8.append(var5);
      var8.append(", name=");
      var8.append(var6);
      var8.append(", size=");
      var8.append(var3);
      var8.append(", isSpoiler=");
      var8.append(var2);
      var8.append(", spoilerDescription=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<FileDisplayComponent> {
         return FileDisplayComponent.$serializer.INSTANCE;
      }
   }
}
