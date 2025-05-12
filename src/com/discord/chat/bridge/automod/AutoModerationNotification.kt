package com.discord.chat.bridge.automod

import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
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
      val var9: Int = this.header.hashCode();
      val var11: Int = Integer.hashCode(this.headerColor);
      val var10: Int = this.headerIconURL.hashCode();
      val var12: Int = Integer.hashCode(this.headerIconColor);
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
                        (((((((((var9 * 31 + var11) * 31 + var10) * 31 + var12) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var13) * 31 + var4) * 31 + var5)
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
      val var10: java.lang.String = this.header;
      val var1: Int = this.headerColor;
      val var6: java.lang.String = this.headerIconURL;
      val var2: Int = this.headerIconColor;
      val var12: java.lang.String = this.subtitleLeft;
      val var8: java.lang.String = this.subtitleRight;
      val var11: java.lang.String = this.body;
      val var3: Boolean = this.shouldShowActions;
      val var13: java.lang.String = this.enabledByUsername;
      val var7: java.lang.String = this.enabledByAvatarURL;
      val var9: Int = this.enabledByColor;
      val var5: java.lang.String = this.severity;
      val var14: java.lang.String = this.startTime;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AutoModerationNotification(header=");
      var4.append(var10);
      var4.append(", headerColor=");
      var4.append(var1);
      var4.append(", headerIconURL=");
      var4.append(var6);
      var4.append(", headerIconColor=");
      var4.append(var2);
      var4.append(", subtitleLeft=");
      var4.append(var12);
      var4.append(", subtitleRight=");
      var4.append(var8);
      var4.append(", body=");
      var4.append(var11);
      var4.append(", shouldShowActions=");
      var4.append(var3);
      var4.append(", enabledByUsername=");
      var4.append(var13);
      var4.append(", enabledByAvatarURL=");
      var4.append(var7);
      var4.append(", enabledByColor=");
      var4.append(var9);
      var4.append(", severity=");
      var4.append(var5);
      var4.append(", startTime=");
      var4.append(var14);
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
         val var9: C0 = C0.a;
         val var4: N = N.a;
         return new KSerializer[]{C0.a, N.a, C0.a, N.a, a.u(C0.a), a.u(var9), a.u(var9), h.a, a.u(var9), a.u(var9), a.u(var4), a.u(var9), a.u(var9)};
      }

      public open fun deserialize(decoder: Decoder): AutoModerationNotification {
         q.h(var1, "decoder");
         val var22: SerialDescriptor = this.getDescriptor();
         val var23: c = var1.c(var22);
         var var9: Boolean = var23.y();
         var var5: Int = 10;
         var var3: Int;
         var var4: Int;
         var var10: Any;
         var var11: java.lang.String;
         var var12: java.lang.String;
         var var14: java.lang.String;
         var var15: java.lang.String;
         var var17: java.lang.String;
         var var18: java.lang.String;
         val var19: java.lang.String;
         val var25: java.lang.String;
         var var40: java.lang.String;
         if (var9) {
            var15 = var23.t(var22, 0);
            var3 = var23.k(var22, 1);
            var12 = var23.t(var22, 2);
            val var2: Int = var23.k(var22, 3);
            val var16: C0 = C0.a;
            var19 = var23.v(var22, 4, C0.a, null) as java.lang.String;
            var14 = var23.v(var22, 5, var16, null) as java.lang.String;
            val var13: java.lang.String = var23.v(var22, 6, var16, null) as java.lang.String;
            var9 = var23.s(var22, 7);
            var18 = var23.v(var22, 8, var16, null) as java.lang.String;
            var11 = var23.v(var22, 9, var16, null) as java.lang.String;
            var10 = var23.v(var22, 10, N.a, null) as Int;
            val var24: java.lang.String = var23.v(var22, 11, var16, null) as java.lang.String;
            val var20: java.lang.String = var23.v(var22, 12, var16, null) as java.lang.String;
            var4 = 8191;
            var5 = var2;
            var17 = var13;
            var40 = var24;
            var25 = var20;
         } else {
            var var36: java.lang.String = null;
            var12 = null;
            var17 = null;
            var40 = null;
            var14 = null;
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
                     val var8: Int = var23.x(var22);
                     switch (var8) {
                        case -1:
                           var7 = false;
                           break label39;
                        case 0:
                           var36 = var23.t(var22, 0);
                           var27 |= 1;
                           break;
                        case 1:
                           var3 = var23.k(var22, 1);
                           var27 |= 2;
                           break;
                        case 2:
                           var12 = var23.t(var22, 2);
                           var27 |= 4;
                           break;
                        case 3:
                           var4 = var23.k(var22, 3);
                           var27 |= 8;
                           break;
                        case 4:
                           var26 = var23.v(var22, 4, C0.a, var26) as java.lang.String;
                           var27 |= 16;
                           break;
                        case 5:
                           var10 = var23.v(var22, 5, C0.a, var10) as java.lang.String;
                           var27 |= 32;
                           break;
                        case 6:
                           var11 = var23.v(var22, 6, C0.a, var11) as java.lang.String;
                           var27 |= 64;
                           break;
                        case 7:
                           var9 = var23.s(var22, 7);
                           var27 |= 128;
                           break label38;
                        case 8:
                           var18 = var23.v(var22, 8, C0.a, var18) as java.lang.String;
                           var27 |= 256;
                           break label38;
                        case 9:
                           var15 = var23.v(var22, 9, C0.a, var15) as java.lang.String;
                           var27 |= 512;
                           break label39;
                        case 10:
                           var14 = var23.v(var22, var5, N.a, var14) as Int;
                           var27 |= 1024;
                           continue;
                        case 11:
                           var40 = var23.v(var22, 11, C0.a, var40) as java.lang.String;
                           var27 |= 2048;
                           continue;
                        case 12:
                           var17 = var23.v(var22, 12, C0.a, var17) as java.lang.String;
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

            var17 = var11;
            var19 = var26;
            var25 = var17;
            var10 = var14;
            var11 = var15;
            var14 = (java.lang.String)var10;
            var5 = var4;
            var15 = var36;
            var4 = var27;
         }

         var23.b(var22);
         return new AutoModerationNotification(var4, var15, var3, var12, var5, var19, var14, var17, var9, var18, var11, (Integer)var10, var40, var25, null);
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
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationNotification> {
         return AutoModerationNotification.$serializer.INSTANCE;
      }
   }
}
