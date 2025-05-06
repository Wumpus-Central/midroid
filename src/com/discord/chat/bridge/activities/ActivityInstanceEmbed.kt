package com.discord.chat.bridge.activities

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.h
import ha.p0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
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
   submitting: Boolean = ...,
   appMessageEmbedModel: AppMessageEmbedImpl? = ...,
   participantsDescription: String? = ...
) : ActivityInstanceEmbed(var1, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13) {
   public final val appMessageEmbedModel: AppMessageEmbedImpl?
   public final val applicationId: ApplicationId
   public final val buttonBackgroundColor: Int
   public final val buttonDisabled: Boolean
   public final val buttonLabelText: String
   public final val channelId: ChannelId
   public final val instanceId: String
   public final val participantAvatarUris: List<String>?
   public final val participantsDescription: String?
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
      var11: AppMessageEmbedImpl,
      var12: java.lang.String,
      var13: SerializationConstructorMarker
   ) {
      if (231 != (var1 and 231)) {
         p0.b(var1, 231, ActivityInstanceEmbed.$serializer.INSTANCE.getDescriptor());
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

      if ((var1 and 512) == 0) {
         this.appMessageEmbedModel = null;
      } else {
         this.appMessageEmbedModel = var11;
      }

      if ((var1 and 1024) == 0) {
         this.participantsDescription = null;
      } else {
         this.participantsDescription = var12;
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
      var11: Boolean,
      var12: AppMessageEmbedImpl,
      var13: java.lang.String
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
      this.appMessageEmbedModel = var12;
      this.participantsDescription = var13;
   }

   public operator fun component1(): ApplicationId {
      return this.applicationId;
   }

   public operator fun component10(): AppMessageEmbedImpl? {
      return this.appMessageEmbedModel;
   }

   public operator fun component11(): String? {
      return this.participantsDescription;
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
      submitting: Boolean = ...,
      appMessageEmbedModel: AppMessageEmbedImpl? = ...,
      participantsDescription: String? = ...
   ): ActivityInstanceEmbed {
      q.h(var5, "instanceId");
      q.h(var9, "buttonLabelText");
      return new ActivityInstanceEmbed(var1, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, null);
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
         } else if (this.submitting != var1.submitting) {
            return false;
         } else if (!q.c(this.appMessageEmbedModel, var1.appMessageEmbedModel)) {
            return false;
         } else {
            return q.c(this.participantsDescription, var1.participantsDescription);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var6: Int = ChannelId.hashCode-impl(this.channelId);
      val var7: Int = this.instanceId.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.statusText == null) {
         var1 = 0;
      } else {
         var1 = this.statusText.hashCode();
      }

      val var2: Int;
      if (this.participantAvatarUris == null) {
         var2 = 0;
      } else {
         var2 = this.participantAvatarUris.hashCode();
      }

      val var9: Int = java.lang.Boolean.hashCode(this.buttonDisabled);
      val var8: Int = this.buttonLabelText.hashCode();
      val var11: Int = Integer.hashCode(this.buttonBackgroundColor);
      val var10: Int = java.lang.Boolean.hashCode(this.submitting);
      val var3: Int;
      if (this.appMessageEmbedModel == null) {
         var3 = 0;
      } else {
         var3 = this.appMessageEmbedModel.hashCode();
      }

      if (this.participantsDescription != null) {
         var4 = this.participantsDescription.hashCode();
      }

      return (((((((((var5 * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var9) * 31 + var8) * 31 + var11) * 31 + var10) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var12: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var11: java.lang.String = this.instanceId;
      val var6: java.lang.String = this.statusText;
      val var9: java.util.List = this.participantAvatarUris;
      val var2: Boolean = this.buttonDisabled;
      val var5: java.lang.String = this.buttonLabelText;
      val var1: Int = this.buttonBackgroundColor;
      val var3: Boolean = this.submitting;
      val var8: AppMessageEmbedImpl = this.appMessageEmbedModel;
      val var7: java.lang.String = this.participantsDescription;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ActivityInstanceEmbed(applicationId=");
      var10.append(var12);
      var10.append(", channelId=");
      var10.append(var4);
      var10.append(", instanceId=");
      var10.append(var11);
      var10.append(", statusText=");
      var10.append(var6);
      var10.append(", participantAvatarUris=");
      var10.append(var9);
      var10.append(", buttonDisabled=");
      var10.append(var2);
      var10.append(", buttonLabelText=");
      var10.append(var5);
      var10.append(", buttonBackgroundColor=");
      var10.append(var1);
      var10.append(", submitting=");
      var10.append(var3);
      var10.append(", appMessageEmbedModel=");
      var10.append(var8);
      var10.append(", participantsDescription=");
      var10.append(var7);
      var10.append(")");
      return var10.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ActivityInstanceEmbed.$serializer = new ActivityInstanceEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activities.ActivityInstanceEmbed", var0, 11);
         var1.l("applicationId", false);
         var1.l("channelId", false);
         var1.l("instanceId", false);
         var1.l("statusText", true);
         var1.l("participantAvatarUris", true);
         var1.l("buttonDisabled", false);
         var1.l("buttonLabelText", false);
         var1.l("buttonBackgroundColor", false);
         var1.l("submitting", true);
         var1.l("appMessageEmbedModel", true);
         var1.l("participantsDescription", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         val var1: C0 = C0.a;
         return new KSerializer[]{
            ApplicationId.$serializer.INSTANCE,
            ChannelId.$serializer.INSTANCE,
            C0.a,
            a.u(C0.a),
            a.u(var3[4]),
            h.a,
            var1,
            N.a,
            h.a,
            a.u(AppMessageEmbedImpl.$serializer.INSTANCE),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): ActivityInstanceEmbed {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.c(var19);
         val var17: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         var var7: Boolean = var20.y();
         var var3: Int = 10;
         var var2: Int = 0;
         val var9: Boolean;
         var var10: java.util.List;
         var var11: AppMessageEmbedImpl;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         var var16: Any;
         var var22: Any;
         if (var7) {
            var14 = var20.m(var19, 0, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var13 = var20.m(var19, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var15 = var20.t(var19, 2);
            var22 = C0.a;
            var16 = var20.v(var19, 3, C0.a, null) as java.lang.String;
            var10 = var20.v(var19, 4, var17[4], null) as java.util.List;
            var7 = var20.s(var19, 5);
            var12 = var20.t(var19, 6);
            var3 = var20.k(var19, 7);
            var9 = var20.s(var19, 8);
            var11 = var20.v(var19, 9, AppMessageEmbedImpl.$serializer.INSTANCE, null) as AppMessageEmbedImpl;
            var22 = var20.v(var19, 10, (DeserializationStrategy)var22, null) as java.lang.String;
            var2 = 2047;
         } else {
            var var5: Boolean = true;
            var var4: Int = 0;
            var7 = false;
            var16 = null;
            var15 = null;
            var12 = null;
            var11 = null;
            var14 = null;
            var13 = null;
            var10 = null;
            var22 = null;
            var var8: Boolean = false;

            while (var5) {
               val var6: Int = var20.x(var19);
               switch (var6) {
                  case -1:
                     var5 = false;
                     continue;
                  case 0:
                     var14 = var20.m(var19, 0, ApplicationId.$serializer.INSTANCE, var14) as ApplicationId;
                     var2 |= 1;
                     var3 = 10;
                     continue;
                  case 1:
                     var13 = var20.m(var19, 1, ChannelId.$serializer.INSTANCE, var13) as ChannelId;
                     var2 |= 2;
                     var3 = 10;
                     continue;
                  case 2:
                     var10 = var20.t(var19, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var11 = var20.v(var19, 3, C0.a, var11) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var15 = var20.v(var19, 4, var17[4], var15) as java.util.List;
                     var2 |= 16;
                     break;
                  case 5:
                     var8 = var20.s(var19, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var22 = var20.t(var19, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var4 = var20.k(var19, 7);
                     var2 |= 128;
                     continue;
                  case 8:
                     var7 = var20.s(var19, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var16 = var20.v(var19, 9, AppMessageEmbedImpl.$serializer.INSTANCE, var16) as AppMessageEmbedImpl;
                     var2 |= 512;
                     continue;
                  case 10:
                     var12 = var20.v(var19, var3, C0.a, var12) as java.lang.String;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var6);
               }

               var3 = 10;
            }

            var3 = var4;
            var22 = var12;
            var11 = (AppMessageEmbedImpl)var16;
            var9 = var7;
            var12 = var22;
            var7 = var8;
            var10 = (java.util.List)var15;
            var16 = var11;
            var15 = var10;
         }

         var20.b(var19);
         return new ActivityInstanceEmbed(
            var2,
            (ApplicationId)var14,
            (ChannelId)var13,
            (java.lang.String)var15,
            (java.lang.String)var16,
            var10,
            var7,
            (java.lang.String)var12,
            var3,
            var9,
            var11,
            (java.lang.String)var22,
            null,
            null
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
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
