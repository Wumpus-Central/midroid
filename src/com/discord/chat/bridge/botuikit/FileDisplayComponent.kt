package com.discord.chat.bridge.botuikit

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.h0
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
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
      val var2: Int = this.id.hashCode();
      val var7: Int = this.file.hashCode();
      val var5: Int = this.name.hashCode();
      val var4: Int = this.size.hashCode();
      val var3: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var1: Int;
      if (this.spoilerDescription == null) {
         var1 = 0;
      } else {
         var1 = this.spoilerDescription.hashCode();
      }

      return (((((var6 * 31 + var2) * 31 + var7) * 31 + var5) * 31 + var4) * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var5: java.lang.String = this.id;
      val var4: UnfurledMediaItem = this.file;
      val var6: java.lang.String = this.name;
      val var7: java.lang.String = this.size;
      val var2: Boolean = this.isSpoiler;
      val var8: java.lang.String = this.spoilerDescription;
      val var3: StringBuilder = new StringBuilder();
      var3.append("FileDisplayComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var5);
      var3.append(", file=");
      var3.append(var4);
      var3.append(", name=");
      var3.append(var6);
      var3.append(", size=");
      var3.append(var7);
      var3.append(", isSpoiler=");
      var3.append(var2);
      var3.append(", spoilerDescription=");
      var3.append(var8);
      var3.append(")");
      return var3.toString();
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
         return new KSerializer[]{N.a, C0.a, UnfurledMediaItem.$serializer.INSTANCE, C0.a, C0.a, ba.h.a, a.u(C0.a), a.u(var2), a.u(h0.a)};
      }

      public open fun deserialize(decoder: Decoder): FileDisplayComponent {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.c(var15);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         val var7: Void;
         var var9: java.lang.String;
         var var10: Any;
         var var11: java.lang.String;
         val var12: java.lang.String;
         val var13: java.lang.String;
         val var18: java.lang.String;
         if (var16.y()) {
            var4 = var16.k(var15, 0);
            var9 = var16.t(var15, 1);
            var10 = var16.m(var15, 2, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            var13 = var16.t(var15, 3);
            var11 = var16.t(var15, 4);
            var2 = var16.s(var15, 5);
            val var17: C0 = C0.a;
            val var8: java.lang.String = var16.v(var15, 6, C0.a, null) as java.lang.String;
            var18 = var16.v(var15, 7, var17, null) as java.lang.String;
            var7 = var16.v(var15, 8, h0.a, null) as Void;
            var3 = 511;
            var12 = var8;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var var27: Void = null;
            var11 = null;
            var9 = null;
            var var24: Any = null;
            var var23: java.lang.String = null;
            var var19: java.lang.String = null;
            var10 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var16.x(var15);
               switch (var6) {
                  case -1:
                     var5 = false;
                     break;
                  case 0:
                     var4 = var16.k(var15, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var16.t(var15, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var24 = var16.m(var15, 2, UnfurledMediaItem.$serializer.INSTANCE, var24) as UnfurledMediaItem;
                     var2 |= 4;
                     break;
                  case 3:
                     var23 = var16.t(var15, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var19 = var16.t(var15, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var3 = var16.s(var15, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var10 = var16.v(var15, 6, C0.a, var10) as java.lang.String;
                     var2 |= 64;
                     break;
                  case 7:
                     var11 = var16.v(var15, 7, C0.a, var11) as java.lang.String;
                     var2 |= 128;
                     break;
                  case 8:
                     var27 = var16.v(var15, 8, h0.a, var27) as Void;
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var6);
               }
            }

            var3 = var2;
            var13 = var23;
            var7 = var27;
            var18 = var11;
            var12 = (java.lang.String)var10;
            var2 = var3;
            var11 = var19;
            var10 = var24;
         }

         var16.b(var15);
         return new FileDisplayComponent(var3, var4, var9, (UnfurledMediaItem)var10, var13, var11, (boolean)var2, var12, var18, var7, null);
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FileDisplayComponent> {
         return FileDisplayComponent.$serializer.INSTANCE;
      }
   }
}
