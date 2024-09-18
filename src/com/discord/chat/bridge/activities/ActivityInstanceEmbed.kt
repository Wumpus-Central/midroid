package com.discord.chat.bridge.activities

import cl.f
import cl.n
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import fl.o1
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class ActivityInstanceEmbed(applicationId: ApplicationId,
   channelId: ChannelId,
   instanceId: String,
   statusText: String? = ...,
   participantAvatarUris: List<String>? = ...,
   buttonDisabled: Boolean,
   buttonLabelText: String,
   buttonBackgroundColor: Int,
   submitting: Boolean = ...
) : ActivityInstanceEmbed(var1, var3, var5, var6, var7, var8, var9, var10, var11) {
   public final val applicationId: ApplicationId
   public final val buttonBackgroundColor: Int
   public final val buttonDisabled: Boolean
   public final val buttonLabelText: String
   public final val channelId: ChannelId
   public final val instanceId: String
   public final val participantAvatarUris: List<String>?
   public final val statusText: String?
   public final val submitting: Boolean

   fun ActivityInstanceEmbed(
      var1: Int,
      var2: ApplicationId,
      var3: ChannelId,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: MutableList<java.lang.String>,
      var7: Boolean,
      var8: java.lang.String,
      var9: Int,
      var10: Boolean,
      var11: SerializationConstructorMarker
   ) {
      if (231 != (var1 and 231)) {
         o1.b(var1, 231, ActivityInstanceEmbed.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.applicationId = var2.unbox-impl();
      this.channelId = var3.unbox-impl();
      this.instanceId = var4;
      if ((var1 and 8) == 0) {
         this.statusText = null;
      } else {
         this.statusText = var5;
      }

      if ((var1 and 16) == 0) {
         this.participantAvatarUris = null;
      } else {
         this.participantAvatarUris = var6;
      }

      this.buttonDisabled = var7;
      this.buttonLabelText = var8;
      this.buttonBackgroundColor = var9;
      if ((var1 and 256) == 0) {
         this.submitting = false;
      } else {
         this.submitting = var10;
      }
   }

   fun ActivityInstanceEmbed(
      var1: Long,
      var3: Long,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: MutableList<java.lang.String>,
      var8: Boolean,
      var9: java.lang.String,
      var10: Int,
      var11: Boolean
   ) {
      q.h(var5, "instanceId");
      q.h(var9, "buttonLabelText");
      super();
      this.applicationId = var1;
      this.channelId = var3;
      this.instanceId = var5;
      this.statusText = var6;
      this.participantAvatarUris = var7;
      this.buttonDisabled = var8;
      this.buttonLabelText = var9;
      this.buttonBackgroundColor = var10;
      this.submitting = var11;
   }

   public operator fun component1(): ApplicationId {
      return this.applicationId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.instanceId;
   }

   public operator fun component4(): String? {
      return this.statusText;
   }

   public operator fun component5(): List<String>? {
      return this.participantAvatarUris;
   }

   public operator fun component6(): Boolean {
      return this.buttonDisabled;
   }

   public operator fun component7(): String {
      return this.buttonLabelText;
   }

   public operator fun component8(): Int {
      return this.buttonBackgroundColor;
   }

   public operator fun component9(): Boolean {
      return this.submitting;
   }

   public fun copy(
      applicationId: ApplicationId = ...,
      channelId: ChannelId = ...,
      instanceId: String = ...,
      statusText: String? = ...,
      participantAvatarUris: List<String>? = ...,
      buttonDisabled: Boolean = ...,
      buttonLabelText: String = ...,
      buttonBackgroundColor: Int = ...,
      submitting: Boolean = ...
   ): ActivityInstanceEmbed {
      q.h(var5, "instanceId");
      q.h(var9, "buttonLabelText");
      return new ActivityInstanceEmbed(var1, var3, var5, var6, var7, var8, var9, var10, var11, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityInstanceEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!ApplicationId.equals-impl0(this.applicationId, var1.applicationId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.instanceId, var1.instanceId)) {
            return false;
         } else if (!q.c(this.statusText, var1.statusText)) {
            return false;
         } else if (!q.c(this.participantAvatarUris, var1.participantAvatarUris)) {
            return false;
         } else if (this.buttonDisabled != var1.buttonDisabled) {
            return false;
         } else if (!q.c(this.buttonLabelText, var1.buttonLabelText)) {
            return false;
         } else if (this.buttonBackgroundColor != var1.buttonBackgroundColor) {
            return false;
         } else {
            return this.submitting == var1.submitting;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var3: Int = ChannelId.hashCode-impl(this.channelId);
      val var5: Int = this.instanceId.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.statusText == null) {
         var1 = 0;
      } else {
         var1 = this.statusText.hashCode();
      }

      if (this.participantAvatarUris != null) {
         var2 = this.participantAvatarUris.hashCode();
      }

      return (
               (
                        (((((var4 * 31 + var3) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + java.lang.Boolean.hashCode(this.buttonDisabled)) * 31
                           + this.buttonLabelText.hashCode()
                     )
                     * 31
                  + Integer.hashCode(this.buttonBackgroundColor)
            )
            * 31
         + java.lang.Boolean.hashCode(this.submitting);
   }

   public override fun toString(): String {
      val var9: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var7: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var10: java.lang.String = this.instanceId;
      val var8: java.lang.String = this.statusText;
      val var5: java.util.List = this.participantAvatarUris;
      val var3: Boolean = this.buttonDisabled;
      val var4: java.lang.String = this.buttonLabelText;
      val var1: Int = this.buttonBackgroundColor;
      val var2: Boolean = this.submitting;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ActivityInstanceEmbed(applicationId=");
      var6.append(var9);
      var6.append(", channelId=");
      var6.append(var7);
      var6.append(", instanceId=");
      var6.append(var10);
      var6.append(", statusText=");
      var6.append(var8);
      var6.append(", participantAvatarUris=");
      var6.append(var5);
      var6.append(", buttonDisabled=");
      var6.append(var3);
      var6.append(", buttonLabelText=");
      var6.append(var4);
      var6.append(", buttonBackgroundColor=");
      var6.append(var1);
      var6.append(", submitting=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActivityInstanceEmbed.$serializer = new ActivityInstanceEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activities.ActivityInstanceEmbed", var0, 9);
         var1.l("applicationId", false);
         var1.l("channelId", false);
         var1.l("instanceId", false);
         var1.l("statusText", true);
         var1.l("participantAvatarUris", true);
         var1.l("buttonDisabled", false);
         var1.l("buttonLabelText", false);
         var1.l("buttonBackgroundColor", false);
         var1.l("submitting", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var5: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         val var2: b2 = b2.a;
         return new KSerializer[]{ApplicationId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, b2.a, a.u(b2.a), a.u(var5[4]), h.a, var2, n0.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): ActivityInstanceEmbed {
         q.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.c(var18);
         val var17: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         val var11: Boolean = var19.y();
         var var3: Int = 7;
         var var8: Byte = 6;
         var var9: Byte = 5;
         var var4: Byte;
         var var5: Byte;
         var var7: Int;
         var var12: java.lang.String;
         var var13: Any;
         var var14: Any;
         var var15: java.lang.String;
         val var16: java.lang.String;
         val var26: java.util.List;
         if (var11) {
            var13 = var19.m(var18, 0, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var14 = var19.m(var18, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var16 = var19.t(var18, 2);
            var15 = var19.v(var18, 3, b2.a, null) as java.lang.String;
            val var20: java.util.List = var19.v(var18, 4, var17[4], null) as java.util.List;
            var5 = var19.s(var18, 5);
            var12 = var19.t(var18, 6);
            val var2: Int = var19.k(var18, 7);
            var4 = var19.s(var18, 8);
            var3 = 511;
            var26 = var20;
            var7 = var2;
         } else {
            var var6: Boolean = true;
            var7 = 0;
            var4 = 0;
            var var22: Int = 0;
            var var25: java.util.List = null;
            var15 = null;
            var var21: Any = null;
            var13 = null;
            var12 = null;
            var14 = null;
            var5 = 0;

            while (var6) {
               label40: {
                  val var10: Int = var19.x(var18);
                  switch (var10) {
                     case -1:
                        var6 = false;
                        break;
                     case 0:
                        var21 = var19.m(var18, 0, ApplicationId.$serializer.INSTANCE, var21) as ApplicationId;
                        var22 |= 1;
                        var3 = 7;
                        break;
                     case 1:
                        var14 = var19.m(var18, 1, ChannelId.$serializer.INSTANCE, var14) as ChannelId;
                        var22 |= 2;
                        var3 = 7;
                        var8 = 6;
                        continue;
                     case 2:
                        var13 = var19.t(var18, 2);
                        var22 |= 4;
                        break label40;
                     case 3:
                        var15 = var19.v(var18, 3, b2.a, var15) as java.lang.String;
                        var22 |= 8;
                        break label40;
                     case 4:
                        var25 = var19.v(var18, 4, var17[4], var25) as java.util.List;
                        var22 |= 16;
                        continue;
                     case 5:
                        var5 = var19.s(var18, var9);
                        var22 |= 32;
                        continue;
                     case 6:
                        var12 = var19.t(var18, var8);
                        var22 |= 64;
                        continue;
                     case 7:
                        var7 = var19.k(var18, var3);
                        var22 |= 128;
                        continue;
                     case 8:
                        var4 = var19.s(var18, 8);
                        var22 |= 256;
                        continue;
                     default:
                        throw new n(var10);
                  }

                  var8 = 6;
                  var9 = 5;
                  continue;
               }

               var3 = 7;
            }

            var26 = var25;
            var16 = (java.lang.String)var13;
            var13 = var21;
            var3 = var22;
         }

         var19.b(var18);
         return new ActivityInstanceEmbed(
            var3, (ApplicationId)var13, (ChannelId)var14, var16, var15, var26, (boolean)var5, var12, var7, (boolean)var4, null, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ActivityInstanceEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ActivityInstanceEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
