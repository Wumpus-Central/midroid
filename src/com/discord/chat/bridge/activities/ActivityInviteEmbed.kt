package com.discord.chat.bridge.activities

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ActivityInviteEmbed(coverImage: String? = null,
   isListening: Boolean,
   headerText: String,
   partyStatus: String,
   avatarsToRender: List<String?>? = null,
   maxPartySize: Int,
   name: String? = null,
   subtext: String? = null,
   joinable: Boolean,
   ctaText: String
) {
   public final val avatarsToRender: List<String?>?
   public final val coverImage: String?
   public final val ctaText: String
   public final val headerText: String
   public final val isListening: Boolean
   public final val joinable: Boolean
   public final val maxPartySize: Int
   public final val name: String?
   public final val partyStatus: String
   public final val subtext: String?

   init {
      q.h(var3, "headerText");
      q.h(var4, "partyStatus");
      q.h(var10, "ctaText");
      super();
      this.coverImage = var1;
      this.isListening = var2;
      this.headerText = var3;
      this.partyStatus = var4;
      this.avatarsToRender = var5;
      this.maxPartySize = var6;
      this.name = var7;
      this.subtext = var8;
      this.joinable = var9;
      this.ctaText = var10;
   }

   public operator fun component1(): String? {
      return this.coverImage;
   }

   public operator fun component10(): String {
      return this.ctaText;
   }

   public operator fun component2(): Boolean {
      return this.isListening;
   }

   public operator fun component3(): String {
      return this.headerText;
   }

   public operator fun component4(): String {
      return this.partyStatus;
   }

   public operator fun component5(): List<String?>? {
      return this.avatarsToRender;
   }

   public operator fun component6(): Int {
      return this.maxPartySize;
   }

   public operator fun component7(): String? {
      return this.name;
   }

   public operator fun component8(): String? {
      return this.subtext;
   }

   public operator fun component9(): Boolean {
      return this.joinable;
   }

   public fun copy(
      coverImage: String? = var0.coverImage,
      isListening: Boolean = var0.isListening,
      headerText: String = var0.headerText,
      partyStatus: String = var0.partyStatus,
      avatarsToRender: List<String?>? = var0.avatarsToRender,
      maxPartySize: Int = var0.maxPartySize,
      name: String? = var0.name,
      subtext: String? = var0.subtext,
      joinable: Boolean = var0.joinable,
      ctaText: String = var0.ctaText
   ): ActivityInviteEmbed {
      q.h(var3, "headerText");
      q.h(var4, "partyStatus");
      q.h(var10, "ctaText");
      return new ActivityInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.coverImage, var1.coverImage)) {
            return false;
         } else if (this.isListening != var1.isListening) {
            return false;
         } else if (!q.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!q.c(this.partyStatus, var1.partyStatus)) {
            return false;
         } else if (!q.c(this.avatarsToRender, var1.avatarsToRender)) {
            return false;
         } else if (this.maxPartySize != var1.maxPartySize) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.subtext, var1.subtext)) {
            return false;
         } else if (this.joinable != var1.joinable) {
            return false;
         } else {
            return q.c(this.ctaText, var1.ctaText);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.coverImage == null) {
         var1 = 0;
      } else {
         var1 = this.coverImage.hashCode();
      }

      val var5: Int = java.lang.Boolean.hashCode(this.isListening);
      val var7: Int = this.headerText.hashCode();
      val var6: Int = this.partyStatus.hashCode();
      val var2: Int;
      if (this.avatarsToRender == null) {
         var2 = 0;
      } else {
         var2 = this.avatarsToRender.hashCode();
      }

      val var8: Int = Integer.hashCode(this.maxPartySize);
      val var3: Int;
      if (this.name == null) {
         var3 = 0;
      } else {
         var3 = this.name.hashCode();
      }

      if (this.subtext != null) {
         var4 = this.subtext.hashCode();
      }

      return (
               (((((((var1 * 31 + var5) * 31 + var7) * 31 + var6) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4) * 31
                  + java.lang.Boolean.hashCode(this.joinable)
            )
            * 31
         + this.ctaText.hashCode();
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.coverImage;
      val var3: Boolean = this.isListening;
      val var10: java.lang.String = this.headerText;
      val var11: java.lang.String = this.partyStatus;
      val var7: java.util.List = this.avatarsToRender;
      val var1: Int = this.maxPartySize;
      val var9: java.lang.String = this.name;
      val var4: java.lang.String = this.subtext;
      val var2: Boolean = this.joinable;
      val var5: java.lang.String = this.ctaText;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ActivityInviteEmbed(coverImage=");
      var8.append(var6);
      var8.append(", isListening=");
      var8.append(var3);
      var8.append(", headerText=");
      var8.append(var10);
      var8.append(", partyStatus=");
      var8.append(var11);
      var8.append(", avatarsToRender=");
      var8.append(var7);
      var8.append(", maxPartySize=");
      var8.append(var1);
      var8.append(", name=");
      var8.append(var9);
      var8.append(", subtext=");
      var8.append(var4);
      var8.append(", joinable=");
      var8.append(var2);
      var8.append(", ctaText=");
      var8.append(var5);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActivityInviteEmbed.$serializer = new ActivityInviteEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activities.ActivityInviteEmbed", var0, 10);
         var1.l("coverImage", true);
         var1.l("isListening", false);
         var1.l("headerText", false);
         var1.l("partyStatus", false);
         var1.l("avatarsToRender", true);
         var1.l("maxPartySize", false);
         var1.l("name", true);
         var1.l("subtext", true);
         var1.l("joinable", false);
         var1.l("ctaText", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: Array<KSerializer> = ActivityInviteEmbed.access$get$childSerializers$cp();
         val var1: b2 = b2.a;
         val var4: KSerializer = a.u(b2.a);
         val var2: h = h.a;
         return new KSerializer[]{var4, h.a, var1, var1, a.u(var3[4]), n0.a, a.u(var1), a.u(var1), var2, var1};
      }

      public open fun deserialize(decoder: Decoder): ActivityInviteEmbed {
         q.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.c(var18);
         val var15: Array<KSerializer> = ActivityInviteEmbed.access$get$childSerializers$cp();
         var var8: Boolean = var19.y();
         var var5: Int = 9;
         var var3: Int;
         var var4: Int;
         var var9: java.lang.String;
         var var12: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         val var16: Any;
         var var21: java.lang.String;
         val var30: java.lang.String;
         if (var8) {
            val var20: b2 = b2.a;
            var13 = var19.v(var18, 0, b2.a, null) as java.lang.String;
            var3 = var19.s(var18, 1);
            var14 = var19.t(var18, 2);
            var12 = var19.t(var18, 3);
            val var10: java.util.List = var19.v(var18, 4, var15[4], null) as java.util.List;
            val var2: Int = var19.k(var18, 5);
            val var11: java.lang.String = var19.v(var18, 6, var20, null) as java.lang.String;
            var9 = var19.v(var18, 7, var20, null) as java.lang.String;
            var8 = var19.s(var18, 8);
            var21 = var19.t(var18, 9);
            var5 = 1023;
            var16 = var10;
            var4 = var2;
            var30 = var11;
         } else {
            var var6: Boolean = true;
            var8 = false;
            var var22: Int = 0;
            var3 = 0;
            var14 = null;
            var12 = null;
            var13 = null;
            var var26: java.lang.String = null;
            var9 = null;
            var21 = null;
            var var27: Any = null;
            var4 = 0;

            while (var6) {
               val var7: Int = var19.x(var18);
               switch (var7) {
                  case -1:
                     var6 = false;
                     continue;
                  case 0:
                     var13 = var19.v(var18, 0, b2.a, var13) as java.lang.String;
                     var22 |= 1;
                     var5 = 9;
                     continue;
                  case 1:
                     var3 = var19.s(var18, 1);
                     var22 |= 2;
                     break;
                  case 2:
                     var26 = var19.t(var18, 2);
                     var22 |= 4;
                     break;
                  case 3:
                     var9 = var19.t(var18, 3);
                     var22 |= 8;
                     continue;
                  case 4:
                     var27 = var19.v(var18, 4, var15[4], var27) as java.util.List;
                     var22 |= 16;
                     continue;
                  case 5:
                     var4 = var19.k(var18, 5);
                     var22 |= 32;
                     continue;
                  case 6:
                     var12 = var19.v(var18, 6, b2.a, var12) as java.lang.String;
                     var22 |= 64;
                     continue;
                  case 7:
                     var14 = var19.v(var18, 7, b2.a, var14) as java.lang.String;
                     var22 |= 128;
                     continue;
                  case 8:
                     var8 = var19.s(var18, 8);
                     var22 |= 256;
                     continue;
                  case 9:
                     var21 = var19.t(var18, var5);
                     var22 |= 512;
                     continue;
                  default:
                     throw new n(var7);
               }

               var5 = 9;
            }

            var9 = var14;
            var30 = var12;
            var16 = var27;
            var12 = var9;
            var14 = var26;
            var5 = var22;
         }

         var19.b(var18);
         return new ActivityInviteEmbed(var5, var13, (boolean)var3, var14, var12, (java.util.List)var16, var4, var30, var9, var8, var21, null);
      }

      public open fun serialize(encoder: Encoder, value: ActivityInviteEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ActivityInviteEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInviteEmbed> {
         return ActivityInviteEmbed.$serializer.INSTANCE;
      }
   }
}
