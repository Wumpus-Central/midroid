package com.discord.chat.bridge.automod

import kotlin.jvm.internal.r
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
public data class AutoModerationNotification(header: String,
   headerColor: Int,
   headerIconURL: String,
   headerIconColor: Int,
   subtitleLeft: String? = null,
   subtitleRight: String? = null,
   body: String? = null,
   shouldShowActions: Boolean,
   enabledByUsername: String? = null,
   enabledByAvatarURL: String? = null,
   enabledByColor: Int? = null,
   severity: String? = null,
   startTime: String? = null
) {
   public final val body: String?
   public final val enabledByAvatarURL: String?
   public final val enabledByColor: Int?
   public final val enabledByUsername: String?
   public final val header: String
   public final val headerColor: Int
   public final val headerIconColor: Int
   public final val headerIconURL: String
   public final val severity: String?
   public final val shouldShowActions: Boolean
   public final val startTime: String?
   public final val subtitleLeft: String?
   public final val subtitleRight: String?

   init {
      r.h(var1, "header");
      r.h(var3, "headerIconURL");
      super();
      this.header = var1;
      this.headerColor = var2;
      this.headerIconURL = var3;
      this.headerIconColor = var4;
      this.subtitleLeft = var5;
      this.subtitleRight = var6;
      this.body = var7;
      this.shouldShowActions = var8;
      this.enabledByUsername = var9;
      this.enabledByAvatarURL = var10;
      this.enabledByColor = var11;
      this.severity = var12;
      this.startTime = var13;
   }

   @JvmStatic
   public fun `write$Self`(self: AutoModerationNotification, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.header);
      var1.w(var2, 1, var0.headerColor);
      var1.z(var2, 2, var0.headerIconURL);
      var1.w(var2, 3, var0.headerIconColor);
      var var3: Boolean;
      if (!var1.A(var2, 4) && var0.subtitleLeft == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.subtitleLeft);
      }

      if (!var1.A(var2, 5) && var0.subtitleRight == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.subtitleRight);
      }

      if (!var1.A(var2, 6) && var0.body == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, a2.a, var0.body);
      }

      var1.x(var2, 7, var0.shouldShowActions);
      if (!var1.A(var2, 8) && var0.enabledByUsername == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, a2.a, var0.enabledByUsername);
      }

      if (!var1.A(var2, 9) && var0.enabledByAvatarURL == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, a2.a, var0.enabledByAvatarURL);
      }

      if (!var1.A(var2, 10) && var0.enabledByColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 10, m0.a, var0.enabledByColor);
      }

      if (!var1.A(var2, 11) && var0.severity == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 11, a2.a, var0.severity);
      }

      label72: {
         if (!var1.A(var2, 12)) {
            var3 = false;
            if (var0.startTime == null) {
               break label72;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 12, a2.a, var0.startTime);
      }
   }

   public operator fun component1(): String {
      return this.header;
   }

   public operator fun component10(): String? {
      return this.enabledByAvatarURL;
   }

   public operator fun component11(): Int? {
      return this.enabledByColor;
   }

   public operator fun component12(): String? {
      return this.severity;
   }

   public operator fun component13(): String? {
      return this.startTime;
   }

   public operator fun component2(): Int {
      return this.headerColor;
   }

   public operator fun component3(): String {
      return this.headerIconURL;
   }

   public operator fun component4(): Int {
      return this.headerIconColor;
   }

   public operator fun component5(): String? {
      return this.subtitleLeft;
   }

   public operator fun component6(): String? {
      return this.subtitleRight;
   }

   public operator fun component7(): String? {
      return this.body;
   }

   public operator fun component8(): Boolean {
      return this.shouldShowActions;
   }

   public operator fun component9(): String? {
      return this.enabledByUsername;
   }

   public fun copy(
      header: String = var0.header,
      headerColor: Int = var0.headerColor,
      headerIconURL: String = var0.headerIconURL,
      headerIconColor: Int = var0.headerIconColor,
      subtitleLeft: String? = var0.subtitleLeft,
      subtitleRight: String? = var0.subtitleRight,
      body: String? = var0.body,
      shouldShowActions: Boolean = var0.shouldShowActions,
      enabledByUsername: String? = var0.enabledByUsername,
      enabledByAvatarURL: String? = var0.enabledByAvatarURL,
      enabledByColor: Int? = var0.enabledByColor,
      severity: String? = var0.severity,
      startTime: String? = var0.startTime
   ): AutoModerationNotification {
      r.h(var1, "header");
      r.h(var3, "headerIconURL");
      return new AutoModerationNotification(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationNotification) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.header, var1.header)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!r.c(this.headerIconURL, var1.headerIconURL)) {
            return false;
         } else if (this.headerIconColor != var1.headerIconColor) {
            return false;
         } else if (!r.c(this.subtitleLeft, var1.subtitleLeft)) {
            return false;
         } else if (!r.c(this.subtitleRight, var1.subtitleRight)) {
            return false;
         } else if (!r.c(this.body, var1.body)) {
            return false;
         } else if (this.shouldShowActions != var1.shouldShowActions) {
            return false;
         } else if (!r.c(this.enabledByUsername, var1.enabledByUsername)) {
            return false;
         } else if (!r.c(this.enabledByAvatarURL, var1.enabledByAvatarURL)) {
            return false;
         } else if (!r.c(this.enabledByColor, var1.enabledByColor)) {
            return false;
         } else if (!r.c(this.severity, var1.severity)) {
            return false;
         } else {
            return r.c(this.startTime, var1.startTime);
         }
      }
   }

   public override fun hashCode(): Int {
      val var13: Int = this.header.hashCode();
      val var11: Int = Integer.hashCode(this.headerColor);
      val var10: Int = this.headerIconURL.hashCode();
      val var12: Int = Integer.hashCode(this.headerIconColor);
      var var9: Int = 0;
      val var1: Int;
      if (this.subtitleLeft == null) {
         var1 = 0;
      } else {
         var1 = this.subtitleLeft.hashCode();
      }

      val var2: Int;
      if (this.subtitleRight == null) {
         var2 = 0;
      } else {
         var2 = this.subtitleRight.hashCode();
      }

      val var3: Int;
      if (this.body == null) {
         var3 = 0;
      } else {
         var3 = this.body.hashCode();
      }

      var var4: Byte = this.shouldShowActions;
      if (this.shouldShowActions != 0) {
         var4 = 1;
      }

      val var15: Int;
      if (this.enabledByUsername == null) {
         var15 = 0;
      } else {
         var15 = this.enabledByUsername.hashCode();
      }

      val var6: Int;
      if (this.enabledByAvatarURL == null) {
         var6 = 0;
      } else {
         var6 = this.enabledByAvatarURL.hashCode();
      }

      val var7: Int;
      if (this.enabledByColor == null) {
         var7 = 0;
      } else {
         var7 = this.enabledByColor.hashCode();
      }

      val var8: Int;
      if (this.severity == null) {
         var8 = 0;
      } else {
         var8 = this.severity.hashCode();
      }

      if (this.startTime != null) {
         var9 = this.startTime.hashCode();
      }

      return (
               (
                        (((((((((var13 * 31 + var11) * 31 + var10) * 31 + var12) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var15) * 31 + var6)
                              * 31
                           + var7
                     )
                     * 31
                  + var8
            )
            * 31
         + var9;
   }

   public override fun toString(): String {
      val var9: java.lang.String = this.header;
      val var1: Int = this.headerColor;
      val var8: java.lang.String = this.headerIconURL;
      val var2: Int = this.headerIconColor;
      val var6: java.lang.String = this.subtitleLeft;
      val var13: java.lang.String = this.subtitleRight;
      val var7: java.lang.String = this.body;
      val var3: Boolean = this.shouldShowActions;
      val var10: java.lang.String = this.enabledByUsername;
      val var12: java.lang.String = this.enabledByAvatarURL;
      val var5: Int = this.enabledByColor;
      val var14: java.lang.String = this.severity;
      val var11: java.lang.String = this.startTime;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AutoModerationNotification(header=");
      var4.append(var9);
      var4.append(", headerColor=");
      var4.append(var1);
      var4.append(", headerIconURL=");
      var4.append(var8);
      var4.append(", headerIconColor=");
      var4.append(var2);
      var4.append(", subtitleLeft=");
      var4.append(var6);
      var4.append(", subtitleRight=");
      var4.append(var13);
      var4.append(", body=");
      var4.append(var7);
      var4.append(", shouldShowActions=");
      var4.append(var3);
      var4.append(", enabledByUsername=");
      var4.append(var10);
      var4.append(", enabledByAvatarURL=");
      var4.append(var12);
      var4.append(", enabledByColor=");
      var4.append(var5);
      var4.append(", severity=");
      var4.append(var14);
      var4.append(", startTime=");
      var4.append(var11);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<AutoModerationNotification> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AutoModerationNotification.$serializer = new AutoModerationNotification.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.AutoModerationNotification", var0, 13);
         var1.l("header", false);
         var1.l("headerColor", false);
         var1.l("headerIconURL", false);
         var1.l("headerIconColor", false);
         var1.l("subtitleLeft", true);
         var1.l("subtitleRight", true);
         var1.l("body", true);
         var1.l("shouldShowActions", false);
         var1.l("enabledByUsername", true);
         var1.l("enabledByAvatarURL", true);
         var1.l("enabledByColor", true);
         var1.l("severity", true);
         var1.l("startTime", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: a2 = a2.a;
         val var1: m0 = m0.a;
         return new KSerializer[]{a2.a, m0.a, a2.a, m0.a, a.u(a2.a), a.u(var2), a.u(var2), h.a, a.u(var2), a.u(var2), a.u(var1), a.u(var2), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): AutoModerationNotification {
         r.h(var1, "decoder");
         val var23: SerialDescriptor = this.getDescriptor();
         val var24: c = var1.b(var23);
         val var10: Boolean = var24.p();
         var var8: Byte = 11;
         var var15: java.lang.String = null;
         var var3: Int;
         var var4: Int;
         var var5: Byte;
         val var6: Int;
         var var11: Any;
         var var12: java.lang.String;
         var var13: Any;
         var var14: Any;
         var var16: Any;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         val var20: Any;
         if (var10) {
            var12 = var24.m(var23, 0);
            var4 = var24.i(var23, 1);
            var17 = var24.m(var23, 2);
            val var2: Int = var24.i(var23, 3);
            val var35: a2 = a2.a;
            val var25: Any = var24.n(var23, 4, a2.a, null);
            var11 = var24.n(var23, 5, var35, null);
            var20 = var24.n(var23, 6, var35, null);
            var5 = var24.C(var23, 7);
            var14 = var24.n(var23, 8, var35, null);
            var13 = var24.n(var23, 9, var35, null);
            var18 = var24.n(var23, 10, m0.a, null);
            var19 = var24.n(var23, 11, var35, null);
            var15 = (java.lang.String)var24.n(var23, 12, var35, null);
            var6 = 8191;
            var3 = var2;
            var16 = var25;
         } else {
            var var7: Byte = 12;
            var17 = null;
            var19 = null;
            var18 = null;
            var14 = null;
            var16 = null;
            var12 = null;
            var13 = null;
            var var30: Boolean = true;
            var var27: Int = 0;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var var26: Any = null;
            var11 = null;

            while (var30) {
               label42: {
                  val var9: Int = var24.o(var23);
                  switch (var9) {
                     case -1:
                        var30 = false;
                        break;
                     case 0:
                        var15 = var24.m(var23, 0);
                        var27 |= 1;
                        break label42;
                     case 1:
                        var3 = var24.i(var23, 1);
                        var27 |= 2;
                        break label42;
                     case 2:
                        var13 = var24.m(var23, 2);
                        var27 |= 4;
                        break label42;
                     case 3:
                        var4 = var24.i(var23, 3);
                        var27 |= 8;
                        break label42;
                     case 4:
                        var11 = var24.n(var23, 4, a2.a, var11);
                        var27 |= 16;
                        break label42;
                     case 5:
                        var26 = var24.n(var23, 5, a2.a, var26);
                        var27 |= 32;
                        break label42;
                     case 6:
                        var12 = (java.lang.String)var24.n(var23, 6, a2.a, var12);
                        var27 |= 64;
                        break label42;
                     case 7:
                        var5 = var24.C(var23, 7);
                        var27 |= 128;
                        break;
                     case 8:
                        var14 = var24.n(var23, 8, a2.a, var14);
                        var27 |= 256;
                        break;
                     case 9:
                        var16 = var24.n(var23, 9, a2.a, var16);
                        var27 |= 512;
                        var7 = 12;
                        continue;
                     case 10:
                        var18 = var24.n(var23, 10, m0.a, var18);
                        var27 |= 1024;
                        continue;
                     case 11:
                        var19 = var24.n(var23, var8, a2.a, var19);
                        var27 |= 2048;
                        continue;
                     case 12:
                        var17 = var24.n(var23, var7, a2.a, var17);
                        var27 |= 4096;
                        continue;
                     default:
                        throw new n(var9);
                  }

                  var7 = 12;
                  continue;
               }

               var7 = 12;
               var8 = 11;
            }

            var4 = var3;
            var15 = (java.lang.String)var17;
            var16 = var11;
            var11 = var26;
            var20 = var12;
            var3 = var4;
            var17 = var13;
            var12 = var15;
            var6 = var27;
            var13 = var16;
         }

         var24.c(var23);
         return new AutoModerationNotification(
            var6,
            var12,
            var4,
            (java.lang.String)var17,
            var3,
            var16 as java.lang.String,
            var11 as java.lang.String,
            var20 as java.lang.String,
            (boolean)var5,
            var14 as java.lang.String,
            var13 as java.lang.String,
            var18 as Integer,
            var19 as java.lang.String,
            var15,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: AutoModerationNotification) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AutoModerationNotification.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationNotification> {
         return AutoModerationNotification.$serializer.INSTANCE;
      }
   }
}
