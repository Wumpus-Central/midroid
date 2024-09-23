package com.discord.chat.bridge.automod

import al.b2
import al.g0
import al.h
import al.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n
import yk.a

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
      val var10: Int = this.header.hashCode();
      val var12: Int = Integer.hashCode(this.headerColor);
      val var9: Int = this.headerIconURL.hashCode();
      val var11: Int = Integer.hashCode(this.headerIconColor);
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
                        (((((((((var10 * 31 + var12) * 31 + var9) * 31 + var11) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var13) * 31 + var4) * 31 + var5)
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
      val var6: java.lang.String = this.header;
      val var1: Int = this.headerColor;
      val var4: java.lang.String = this.headerIconURL;
      val var2: Int = this.headerIconColor;
      val var10: java.lang.String = this.subtitleLeft;
      val var13: java.lang.String = this.subtitleRight;
      val var11: java.lang.String = this.body;
      val var3: Boolean = this.shouldShowActions;
      val var7: java.lang.String = this.enabledByUsername;
      val var14: java.lang.String = this.enabledByAvatarURL;
      val var5: Int = this.enabledByColor;
      val var12: java.lang.String = this.severity;
      val var8: java.lang.String = this.startTime;
      val var9: StringBuilder = new StringBuilder();
      var9.append("AutoModerationNotification(header=");
      var9.append(var6);
      var9.append(", headerColor=");
      var9.append(var1);
      var9.append(", headerIconURL=");
      var9.append(var4);
      var9.append(", headerIconColor=");
      var9.append(var2);
      var9.append(", subtitleLeft=");
      var9.append(var10);
      var9.append(", subtitleRight=");
      var9.append(var13);
      var9.append(", body=");
      var9.append(var11);
      var9.append(", shouldShowActions=");
      var9.append(var3);
      var9.append(", enabledByUsername=");
      var9.append(var7);
      var9.append(", enabledByAvatarURL=");
      var9.append(var14);
      var9.append(", enabledByColor=");
      var9.append(var5);
      var9.append(", severity=");
      var9.append(var12);
      var9.append(", startTime=");
      var9.append(var8);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : g0 {
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
         val var2: b2 = b2.a;
         val var1: n0 = n0.a;
         return new KSerializer[]{b2.a, n0.a, b2.a, n0.a, a.u(b2.a), a.u(var2), a.u(var2), h.a, a.u(var2), a.u(var2), a.u(var1), a.u(var2), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): AutoModerationNotification {
         q.h(var1, "decoder");
         val var22: SerialDescriptor = this.getDescriptor();
         val var23: c = var1.c(var22);
         var var9: Boolean = var23.y();
         var var5: Int = 10;
         var var3: Int;
         var var4: Int;
         var var10: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var16: java.lang.String;
         var var17: java.lang.String;
         var var18: java.lang.String;
         val var19: java.lang.String;
         var var24: Any;
         var var34: java.lang.String;
         var var38: java.lang.String;
         if (var9) {
            var13 = var23.t(var22, 0);
            var3 = var23.k(var22, 1);
            var17 = var23.t(var22, 2);
            val var2: Int = var23.k(var22, 3);
            val var15: b2 = b2.a;
            var16 = var23.v(var22, 4, b2.a, null) as java.lang.String;
            var19 = var23.v(var22, 5, var15, null) as java.lang.String;
            val var12: java.lang.String = var23.v(var22, 6, var15, null) as java.lang.String;
            var9 = var23.s(var22, 7);
            var14 = var23.v(var22, 8, var15, null) as java.lang.String;
            var34 = var23.v(var22, 9, var15, null) as java.lang.String;
            var24 = var23.v(var22, 10, n0.a, null) as Int;
            var10 = var23.v(var22, 11, var15, null) as java.lang.String;
            val var20: java.lang.String = var23.v(var22, 12, var15, null) as java.lang.String;
            var4 = 8191;
            var5 = var2;
            var38 = var12;
            var18 = var34;
            var34 = var20;
         } else {
            var13 = null;
            var var36: java.lang.String = null;
            var17 = null;
            var16 = null;
            var14 = null;
            var18 = null;
            var38 = null;
            var34 = null;
            var var7: Boolean = true;
            var9 = false;
            var4 = 0;
            var3 = 0;
            var10 = null;
            var var26: Int = 0;
            var24 = null;

            while (var7) {
               label39: {
                  label38: {
                     val var8: Int = var23.x(var22);
                     switch (var8) {
                        case -1:
                           var7 = false;
                           break label39;
                        case 0:
                           var13 = var23.t(var22, 0);
                           var26 |= 1;
                           break;
                        case 1:
                           var3 = var23.k(var22, 1);
                           var26 |= 2;
                           break;
                        case 2:
                           var36 = var23.t(var22, 2);
                           var26 |= 4;
                           break;
                        case 3:
                           var4 = var23.k(var22, 3);
                           var26 |= 8;
                           break;
                        case 4:
                           var24 = var23.v(var22, 4, b2.a, var24) as java.lang.String;
                           var26 |= 16;
                           break;
                        case 5:
                           var10 = var23.v(var22, 5, b2.a, var10) as java.lang.String;
                           var26 |= 32;
                           break;
                        case 6:
                           var34 = var23.v(var22, 6, b2.a, var34) as java.lang.String;
                           var26 |= 64;
                           break;
                        case 7:
                           var9 = var23.s(var22, 7);
                           var26 |= 128;
                           break label38;
                        case 8:
                           var18 = var23.v(var22, 8, b2.a, var18) as java.lang.String;
                           var26 |= 256;
                           break label38;
                        case 9:
                           var38 = var23.v(var22, 9, b2.a, var38) as java.lang.String;
                           var26 |= 512;
                           break label39;
                        case 10:
                           var14 = var23.v(var22, var5, n0.a, var14) as Int;
                           var26 |= 1024;
                           continue;
                        case 11:
                           var16 = var23.v(var22, 11, b2.a, var16) as java.lang.String;
                           var26 |= 2048;
                           continue;
                        case 12:
                           var17 = var23.v(var22, 12, b2.a, var17) as java.lang.String;
                           var26 |= 4096;
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

            var14 = var18;
            var18 = var38;
            var38 = var34;
            var34 = var17;
            var10 = var16;
            var24 = var14;
            var19 = var10;
            var16 = (java.lang.String)var24;
            var5 = var4;
            var17 = var36;
            var4 = var26;
         }

         var23.b(var22);
         return new AutoModerationNotification(var4, var13, var3, var17, var5, var16, var19, var38, var9, var14, var18, (Integer)var24, var10, var34, null);
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
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AutoModerationNotification> {
         return AutoModerationNotification.$serializer.INSTANCE;
      }
   }
}
