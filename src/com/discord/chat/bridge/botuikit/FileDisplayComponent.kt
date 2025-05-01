package com.discord.chat.bridge.botuikit

import aa.f
import aa.n
import ba.a
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import da.C0
import da.G
import da.N
import da.h0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
   public final val file: UnfurledMediaItem
   public open val id: String
   public final val isSpoiler: Boolean
   public final val name: String
   public open val obscureOrNull: Nothing?
   public final val size: String
   public final val spoilerDescription: String?
   public open val spoilerOrNull: String?
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var3, "file");
      q.h(var4, "name");
      q.h(var5, "size");
      super(null);
      this.type = var1;
      this.id = var2;
      this.file = var3;
      this.name = var4;
      this.size = var5;
      this.isSpoiler = var6;
      this.spoilerDescription = var7;
      val var8: Boolean;
      if (var7 != null && !h.d0(var7)) {
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
      q.h(var2, "id");
      q.h(var3, "file");
      q.h(var4, "name");
      q.h(var5, "size");
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
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.file, var1.file)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.size, var1.size)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else {
            return q.c(this.spoilerDescription, var1.spoilerDescription);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.type);
      val var5: Int = this.id.hashCode();
      val var3: Int = this.file.hashCode();
      val var7: Int = this.name.hashCode();
      val var4: Int = this.size.hashCode();
      val var2: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var1: Int;
      if (this.spoilerDescription == null) {
         var1 = 0;
      } else {
         var1 = this.spoilerDescription.hashCode();
      }

      return (((((var6 * 31 + var5) * 31 + var3) * 31 + var7) * 31 + var4) * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var6: java.lang.String = this.id;
      val var8: UnfurledMediaItem = this.file;
      val var7: java.lang.String = this.name;
      val var5: java.lang.String = this.size;
      val var2: Boolean = this.isSpoiler;
      val var3: java.lang.String = this.spoilerDescription;
      val var4: StringBuilder = new StringBuilder();
      var4.append("FileDisplayComponent(type=");
      var4.append(var1);
      var4.append(", id=");
      var4.append(var6);
      var4.append(", file=");
      var4.append(var8);
      var4.append(", name=");
      var4.append(var7);
      var4.append(", size=");
      var4.append(var5);
      var4.append(", isSpoiler=");
      var4.append(var2);
      var4.append(", spoilerDescription=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: FileDisplayComponent.$serializer = new FileDisplayComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("13", var0, 9);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("file", false);
         var1.l("name", false);
         var1.l("size", false);
         var1.l("isSpoiler", false);
         var1.l("spoilerDescription", false);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: C0 = C0.a;
         return new KSerializer[]{N.a, C0.a, UnfurledMediaItem.$serializer.INSTANCE, C0.a, C0.a, da.h.a, a.u(C0.a), a.u(var2), a.u(h0.a)};
      }

      public open fun deserialize(decoder: Decoder): FileDisplayComponent {
         q.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.c(var16);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: java.lang.String;
         var var9: java.lang.String;
         var var10: java.lang.String;
         var var11: Any;
         val var12: java.lang.String;
         val var13: Void;
         val var19: java.lang.String;
         if (var17.y()) {
            var4 = var17.k(var16, 0);
            var9 = var17.t(var16, 1);
            var11 = var17.m(var16, 2, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            var10 = var17.t(var16, 3);
            var12 = var17.t(var16, 4);
            var2 = var17.s(var16, 5);
            val var18: C0 = C0.a;
            var7 = var17.v(var16, 6, C0.a, null) as java.lang.String;
            var19 = var17.v(var16, 7, var18, null) as java.lang.String;
            val var8: Void = var17.v(var16, 8, h0.a, null) as Void;
            var3 = 511;
            var13 = var8;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var var28: Void = null;
            var11 = null;
            var9 = null;
            var var25: Any = null;
            var7 = null;
            var var20: java.lang.String = null;
            var10 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var17.x(var16);
               switch (var6) {
                  case -1:
                     var5 = false;
                     break;
                  case 0:
                     var4 = var17.k(var16, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var17.t(var16, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var25 = var17.m(var16, 2, UnfurledMediaItem.$serializer.INSTANCE, var25) as UnfurledMediaItem;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var17.t(var16, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var20 = var17.t(var16, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var3 = var17.s(var16, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var10 = var17.v(var16, 6, C0.a, var10) as java.lang.String;
                     var2 |= 64;
                     break;
                  case 7:
                     var11 = var17.v(var16, 7, C0.a, var11) as java.lang.String;
                     var2 |= 128;
                     break;
                  case 8:
                     var28 = var17.v(var16, 8, h0.a, var28) as Void;
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var3 = var2;
            var13 = var28;
            var19 = (java.lang.String)var11;
            var7 = var10;
            var2 = var3;
            var12 = var20;
            var10 = var7;
            var11 = var25;
         }

         var17.b(var16);
         return new FileDisplayComponent(var3, var4, var9, (UnfurledMediaItem)var11, var10, var12, (boolean)var2, var7, var19, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: FileDisplayComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         FileDisplayComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FileDisplayComponent> {
         return FileDisplayComponent.$serializer.INSTANCE;
      }
   }
}
