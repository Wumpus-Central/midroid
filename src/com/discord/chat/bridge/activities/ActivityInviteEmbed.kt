package com.discord.chat.bridge.activities

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0

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
      r.h(var3, "headerText");
      r.h(var4, "partyStatus");
      r.h(var10, "ctaText");
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

   @JvmStatic
   public fun `write$Self`(self: ActivityInviteEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.coverImage == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.coverImage);
      }

      var1.x(var2, 1, var0.isListening);
      var1.z(var2, 2, var0.headerText);
      var1.z(var2, 3, var0.partyStatus);
      if (!var1.A(var2, 4) && var0.avatarsToRender == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, new xk.f(a.u(a2.a)), var0.avatarsToRender);
      }

      var1.w(var2, 5, var0.maxPartySize);
      if (!var1.A(var2, 6) && var0.name == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, a2.a, var0.name);
      }

      label40: {
         if (!var1.A(var2, 7)) {
            var3 = false;
            if (var0.subtext == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, a2.a, var0.subtext);
      }

      var1.x(var2, 8, var0.joinable);
      var1.z(var2, 9, var0.ctaText);
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
      r.h(var3, "headerText");
      r.h(var4, "partyStatus");
      r.h(var10, "ctaText");
      return new ActivityInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.coverImage, var1.coverImage)) {
            return false;
         } else if (this.isListening != var1.isListening) {
            return false;
         } else if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!r.c(this.partyStatus, var1.partyStatus)) {
            return false;
         } else if (!r.c(this.avatarsToRender, var1.avatarsToRender)) {
            return false;
         } else if (this.maxPartySize != var1.maxPartySize) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.subtext, var1.subtext)) {
            return false;
         } else if (this.joinable != var1.joinable) {
            return false;
         } else {
            return r.c(this.ctaText, var1.ctaText);
         }
      }
   }

   public override fun hashCode(): Int {
      var var5: Int = 0;
      val var1: Int;
      if (this.coverImage == null) {
         var1 = 0;
      } else {
         var1 = this.coverImage.hashCode();
      }

      var var6: Byte = 1;
      var var2: Byte = this.isListening;
      if (this.isListening != 0) {
         var2 = 1;
      }

      val var8: Int = this.headerText.hashCode();
      val var9: Int = this.partyStatus.hashCode();
      val var12: Int;
      if (this.avatarsToRender == null) {
         var12 = 0;
      } else {
         var12 = this.avatarsToRender.hashCode();
      }

      val var10: Int = Integer.hashCode(this.maxPartySize);
      val var4: Int;
      if (this.name == null) {
         var4 = 0;
      } else {
         var4 = this.name.hashCode();
      }

      if (this.subtext != null) {
         var5 = this.subtext.hashCode();
      }

      if (this.joinable == 0) {
         var6 = this.joinable;
      }

      return ((((((((var1 * 31 + var2) * 31 + var8) * 31 + var9) * 31 + var12) * 31 + var10) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + this.ctaText.hashCode();
   }

   public override fun toString(): String {
      val var11: java.lang.String = this.coverImage;
      val var3: Boolean = this.isListening;
      val var10: java.lang.String = this.headerText;
      val var5: java.lang.String = this.partyStatus;
      val var9: java.util.List = this.avatarsToRender;
      val var1: Int = this.maxPartySize;
      val var6: java.lang.String = this.name;
      val var4: java.lang.String = this.subtext;
      val var2: Boolean = this.joinable;
      val var7: java.lang.String = this.ctaText;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ActivityInviteEmbed(coverImage=");
      var8.append(var11);
      var8.append(", isListening=");
      var8.append(var3);
      var8.append(", headerText=");
      var8.append(var10);
      var8.append(", partyStatus=");
      var8.append(var5);
      var8.append(", avatarsToRender=");
      var8.append(var9);
      var8.append(", maxPartySize=");
      var8.append(var1);
      var8.append(", name=");
      var8.append(var6);
      var8.append(", subtext=");
      var8.append(var4);
      var8.append(", joinable=");
      var8.append(var2);
      var8.append(", ctaText=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : f0<ActivityInviteEmbed> {
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
         val var3: a2 = a2.a;
         val var2: KSerializer = a.u(a2.a);
         val var1: h = h.a;
         return new KSerializer[]{var2, h.a, var3, var3, a.u(new xk.f(a.u(var3))), m0.a, a.u(var3), a.u(var3), var1, var3};
      }

      public open fun deserialize(decoder: Decoder): ActivityInviteEmbed {
         r.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.b(var18);
         var var10: Boolean = var19.p();
         var var3: Int = 9;
         var var8: Byte = 7;
         var var7: Byte = 6;
         var var4: Int;
         var var6: Int;
         var var11: Any;
         var var12: Any;
         var var14: Any;
         var var15: Any;
         var var16: Any;
         var var20: Any;
         var var26: Any;
         if (var10) {
            var26 = a2.a;
            var20 = var19.n(var18, 0, a2.a, null);
            var6 = var19.C(var18, 1);
            var14 = var19.m(var18, 2);
            var11 = var19.m(var18, 3);
            var16 = var19.n(var18, 4, new xk.f(a.u((KSerializer)var26)), null);
            val var2: Int = var19.i(var18, 5);
            var12 = var19.n(var18, 6, (DeserializationStrategy)var26, null);
            var15 = var19.n(var18, 7, (DeserializationStrategy)var26, null);
            var10 = var19.C(var18, 8);
            var26 = var19.m(var18, 9);
            var4 = 1023;
            var3 = var2;
         } else {
            var var5: Boolean = true;
            var10 = false;
            var var21: Int = 0;
            var6 = 0;
            var14 = null;
            var15 = null;
            var20 = null;
            var12 = null;
            var11 = null;
            var26 = null;
            var16 = null;
            var4 = 0;

            while (var5) {
               label44: {
                  val var9: Int = var19.o(var18);
                  switch (var9) {
                     case -1:
                        var5 = false;
                        break;
                     case 0:
                        var20 = var19.n(var18, 0, a2.a, var20);
                        var21 |= 1;
                        var3 = 9;
                        break;
                     case 1:
                        var6 = var19.C(var18, 1);
                        var21 |= 2;
                        break label44;
                     case 2:
                        var12 = var19.m(var18, 2);
                        var21 |= 4;
                        break label44;
                     case 3:
                        var11 = var19.m(var18, 3);
                        var21 |= 8;
                        break label44;
                     case 4:
                        var16 = var19.n(var18, 4, new xk.f(a.u(a2.a)), var16);
                        var21 |= 16;
                        var3 = 9;
                        continue;
                     case 5:
                        var4 = var19.i(var18, 5);
                        var21 |= 32;
                        continue;
                     case 6:
                        var15 = var19.n(var18, var7, a2.a, var15);
                        var21 |= 64;
                        continue;
                     case 7:
                        var14 = var19.n(var18, var8, a2.a, var14);
                        var21 |= 128;
                        continue;
                     case 8:
                        var10 = var19.C(var18, 8);
                        var21 |= 256;
                        continue;
                     case 9:
                        var26 = var19.m(var18, var3);
                        var21 |= 512;
                        continue;
                     default:
                        throw new n(var9);
                  }

                  var8 = 7;
                  var7 = 6;
                  continue;
               }

               var3 = 9;
            }

            var15 = var14;
            var3 = var4;
            var14 = var12;
            var12 = var15;
            var4 = var21;
         }

         var19.c(var18);
         return new ActivityInviteEmbed(
            var4,
            var20 as java.lang.String,
            (boolean)var6,
            (java.lang.String)var14,
            (java.lang.String)var11,
            var16 as java.util.List,
            var3,
            var12 as java.lang.String,
            var15 as java.lang.String,
            var10,
            (java.lang.String)var26,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ActivityInviteEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActivityInviteEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInviteEmbed> {
         return ActivityInviteEmbed.$serializer.INSTANCE;
      }
   }
}
