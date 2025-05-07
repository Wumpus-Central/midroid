package com.discord.chat.bridge.automod

import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      q.h(var1, "header");
      q.h(var3, "headerIconURL");
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
      q.h(var1, "header");
      q.h(var3, "headerIconURL");
      return new AutoModerationNotification(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationNotification) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.header, var1.header)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!q.c(this.headerIconURL, var1.headerIconURL)) {
            return false;
         } else if (this.headerIconColor != var1.headerIconColor) {
            return false;
         } else if (!q.c(this.subtitleLeft, var1.subtitleLeft)) {
            return false;
         } else if (!q.c(this.subtitleRight, var1.subtitleRight)) {
            return false;
         } else if (!q.c(this.body, var1.body)) {
            return false;
         } else if (this.shouldShowActions != var1.shouldShowActions) {
            return false;
         } else if (!q.c(this.enabledByUsername, var1.enabledByUsername)) {
            return false;
         } else if (!q.c(this.enabledByAvatarURL, var1.enabledByAvatarURL)) {
            return false;
         } else if (!q.c(this.enabledByColor, var1.enabledByColor)) {
            return false;
         } else if (!q.c(this.severity, var1.severity)) {
            return false;
         } else {
            return q.c(this.startTime, var1.startTime);
         }
      }
   }

   public override fun hashCode(): Int {
      val var11: Int = this.header.hashCode();
      val var10: Int = Integer.hashCode(this.headerColor);
      val var12: Int = this.headerIconURL.hashCode();
      val var9: Int = Integer.hashCode(this.headerIconColor);
      var var8: Int = 0;
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

      val var13: Int = java.lang.Boolean.hashCode(this.shouldShowActions);
      val var4: Int;
      if (this.enabledByUsername == null) {
         var4 = 0;
      } else {
         var4 = this.enabledByUsername.hashCode();
      }

      val var5: Int;
      if (this.enabledByAvatarURL == null) {
         var5 = 0;
      } else {
         var5 = this.enabledByAvatarURL.hashCode();
      }

      val var6: Int;
      if (this.enabledByColor == null) {
         var6 = 0;
      } else {
         var6 = this.enabledByColor.hashCode();
      }

      val var7: Int;
      if (this.severity == null) {
         var7 = 0;
      } else {
         var7 = this.severity.hashCode();
      }

      if (this.startTime != null) {
         var8 = this.startTime.hashCode();
      }

      return (
               (
                        (((((((((var11 * 31 + var10) * 31 + var12) * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var13) * 31 + var4) * 31 + var5)
                              * 31
                           + var6
                     )
                     * 31
                  + var7
            )
            * 31
         + var8;
   }

   public override fun toString(): String {
      val var11: java.lang.String = this.header;
      val var1: Int = this.headerColor;
      val var10: java.lang.String = this.headerIconURL;
      val var2: Int = this.headerIconColor;
      val var12: java.lang.String = this.subtitleLeft;
      val var7: java.lang.String = this.subtitleRight;
      val var9: java.lang.String = this.body;
      val var3: Boolean = this.shouldShowActions;
      val var14: java.lang.String = this.enabledByUsername;
      val var5: java.lang.String = this.enabledByAvatarURL;
      val var6: Int = this.enabledByColor;
      val var13: java.lang.String = this.severity;
      val var4: java.lang.String = this.startTime;
      val var8: StringBuilder = new StringBuilder();
      var8.append("AutoModerationNotification(header=");
      var8.append(var11);
      var8.append(", headerColor=");
      var8.append(var1);
      var8.append(", headerIconURL=");
      var8.append(var10);
      var8.append(", headerIconColor=");
      var8.append(var2);
      var8.append(", subtitleLeft=");
      var8.append(var12);
      var8.append(", subtitleRight=");
      var8.append(var7);
      var8.append(", body=");
      var8.append(var9);
      var8.append(", shouldShowActions=");
      var8.append(var3);
      var8.append(", enabledByUsername=");
      var8.append(var14);
      var8.append(", enabledByAvatarURL=");
      var8.append(var5);
      var8.append(", enabledByColor=");
      var8.append(var6);
      var8.append(", severity=");
      var8.append(var13);
      var8.append(", startTime=");
      var8.append(var4);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : G {
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
         val var2: C0 = C0.a;
         val var4: N = N.a;
         return new KSerializer[]{C0.a, N.a, C0.a, N.a, a.u(C0.a), a.u(var2), a.u(var2), h.a, a.u(var2), a.u(var2), a.u(var4), a.u(var2), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): AutoModerationNotification {
         q.h(var1, "decoder");
         val var23: SerialDescriptor = this.getDescriptor();
         val var24: c = var1.c(var23);
         var var9: Boolean = var24.y();
         var var5: Int = 10;
         var var3: Int;
         var var4: Int;
         var var10: Any;
         var var11: java.lang.String;
         var var13: java.lang.String;
         var var15: java.lang.String;
         var var16: java.lang.String;
         var var17: java.lang.String;
         var var18: java.lang.String;
         val var19: java.lang.String;
         val var25: java.lang.String;
         var var37: java.lang.String;
         if (var9) {
            var13 = var24.t(var23, 0);
            var3 = var24.k(var23, 1);
            var16 = var24.t(var23, 2);
            val var2: Int = var24.k(var23, 3);
            val var14: C0 = C0.a;
            var17 = var24.v(var23, 4, C0.a, null) as java.lang.String;
            var15 = var24.v(var23, 5, var14, null) as java.lang.String;
            val var12: java.lang.String = var24.v(var23, 6, var14, null) as java.lang.String;
            var9 = var24.s(var23, 7);
            var19 = var24.v(var23, 8, var14, null) as java.lang.String;
            var11 = var24.v(var23, 9, var14, null) as java.lang.String;
            var10 = var24.v(var23, 10, N.a, null) as Int;
            var25 = var24.v(var23, 11, var14, null) as java.lang.String;
            var18 = var24.v(var23, 12, var14, null) as java.lang.String;
            var4 = 8191;
            var5 = var2;
            var37 = var12;
         } else {
            var13 = null;
            var var36: java.lang.String = null;
            var17 = null;
            var16 = null;
            var37 = null;
            var18 = null;
            var15 = null;
            var11 = null;
            var var7: Boolean = true;
            var9 = false;
            var4 = 0;
            var3 = 0;
            var10 = null;
            var var27: Int = 0;
            var var26: java.lang.String = null;

            while (var7) {
               label39: {
                  label38: {
                     val var8: Int = var24.x(var23);
                     switch (var8) {
                        case -1:
                           var7 = false;
                           break label39;
                        case 0:
                           var13 = var24.t(var23, 0);
                           var27 |= 1;
                           break;
                        case 1:
                           var3 = var24.k(var23, 1);
                           var27 |= 2;
                           break;
                        case 2:
                           var36 = var24.t(var23, 2);
                           var27 |= 4;
                           break;
                        case 3:
                           var4 = var24.k(var23, 3);
                           var27 |= 8;
                           break;
                        case 4:
                           var26 = var24.v(var23, 4, C0.a, var26) as java.lang.String;
                           var27 |= 16;
                           break;
                        case 5:
                           var10 = var24.v(var23, 5, C0.a, var10) as java.lang.String;
                           var27 |= 32;
                           break;
                        case 6:
                           var11 = var24.v(var23, 6, C0.a, var11) as java.lang.String;
                           var27 |= 64;
                           break;
                        case 7:
                           var9 = var24.s(var23, 7);
                           var27 |= 128;
                           break label38;
                        case 8:
                           var18 = var24.v(var23, 8, C0.a, var18) as java.lang.String;
                           var27 |= 256;
                           break label38;
                        case 9:
                           var15 = var24.v(var23, 9, C0.a, var15) as java.lang.String;
                           var27 |= 512;
                           break label39;
                        case 10:
                           var37 = var24.v(var23, var5, N.a, var37) as Int;
                           var27 |= 1024;
                           continue;
                        case 11:
                           var16 = var24.v(var23, 11, C0.a, var16) as java.lang.String;
                           var27 |= 2048;
                           continue;
                        case 12:
                           var17 = var24.v(var23, 12, C0.a, var17) as java.lang.String;
                           var27 |= 4096;
                           continue;
                        default:
                           throw new n(var8);
                     }

                     var5 = 10;
                     continue;
                  }

                  var5 = 10;
                  continue;
               }

               var5 = 10;
            }

            var19 = var18;
            var37 = var11;
            var15 = (java.lang.String)var10;
            var17 = var26;
            var18 = var17;
            var25 = var16;
            var10 = var37;
            var11 = var15;
            var5 = var4;
            var16 = var36;
            var4 = var27;
         }

         var24.b(var23);
         return new AutoModerationNotification(var4, var13, var3, var16, var5, var17, var15, var37, var9, var19, var11, (Integer)var10, var25, var18, null);
      }

      public open fun serialize(encoder: Encoder, value: AutoModerationNotification) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AutoModerationNotification.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationNotification> {
         return AutoModerationNotification.$serializer.INSTANCE;
      }
   }
}
