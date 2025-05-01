package com.discord.chat.bridge.activities

import aa.f
import aa.n
import ba.a
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import da.C0
import da.G
import da.N
import da.h
import da.p0
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
      val var6: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var7: Int = ChannelId.hashCode-impl(this.channelId);
      val var5: Int = this.instanceId.hashCode();
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

      val var10: Int = java.lang.Boolean.hashCode(this.buttonDisabled);
      val var11: Int = this.buttonLabelText.hashCode();
      val var8: Int = Integer.hashCode(this.buttonBackgroundColor);
      val var9: Int = java.lang.Boolean.hashCode(this.submitting);
      val var3: Int;
      if (this.appMessageEmbedModel == null) {
         var3 = 0;
      } else {
         var3 = this.appMessageEmbedModel.hashCode();
      }

      if (this.participantsDescription != null) {
         var4 = this.participantsDescription.hashCode();
      }

      return (((((((((var6 * 31 + var7) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var11) * 31 + var8) * 31 + var9) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var11: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var6: java.lang.String = this.instanceId;
      val var9: java.lang.String = this.statusText;
      val var8: java.util.List = this.participantAvatarUris;
      val var3: Boolean = this.buttonDisabled;
      val var5: java.lang.String = this.buttonLabelText;
      val var1: Int = this.buttonBackgroundColor;
      val var2: Boolean = this.submitting;
      val var7: AppMessageEmbedImpl = this.appMessageEmbedModel;
      val var10: java.lang.String = this.participantsDescription;
      val var12: StringBuilder = new StringBuilder();
      var12.append("ActivityInstanceEmbed(applicationId=");
      var12.append(var11);
      var12.append(", channelId=");
      var12.append(var4);
      var12.append(", instanceId=");
      var12.append(var6);
      var12.append(", statusText=");
      var12.append(var9);
      var12.append(", participantAvatarUris=");
      var12.append(var8);
      var12.append(", buttonDisabled=");
      var12.append(var3);
      var12.append(", buttonLabelText=");
      var12.append(var5);
      var12.append(", buttonBackgroundColor=");
      var12.append(var1);
      var12.append(", submitting=");
      var12.append(var2);
      var12.append(", appMessageEmbedModel=");
      var12.append(var7);
      var12.append(", participantsDescription=");
      var12.append(var10);
      var12.append(")");
      return var12.toString();
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
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.c(var18);
         val var16: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         var var7: Boolean = var19.y();
         var var3: Int = 10;
         var var2: Int = 0;
         var var8: Boolean;
         var var9: java.util.List;
         var var10: AppMessageEmbedImpl;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         var var21: Any;
         if (var7) {
            var12 = var19.m(var18, 0, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var13 = var19.m(var18, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var14 = var19.t(var18, 2);
            var21 = C0.a;
            var15 = var19.v(var18, 3, C0.a, null) as java.lang.String;
            var9 = var19.v(var18, 4, var16[4], null) as java.util.List;
            var8 = var19.s(var18, 5);
            var11 = var19.t(var18, 6);
            var2 = var19.k(var18, 7);
            var7 = var19.s(var18, 8);
            var10 = var19.v(var18, 9, AppMessageEmbedImpl.$serializer.INSTANCE, null) as AppMessageEmbedImpl;
            var21 = var19.v(var18, 10, (DeserializationStrategy)var21, null) as java.lang.String;
            var3 = 2047;
         } else {
            var var5: Boolean = true;
            var var4: Int = 0;
            var7 = false;
            var15 = null;
            var14 = null;
            var11 = null;
            var10 = null;
            var12 = null;
            var13 = null;
            var9 = null;
            var21 = null;
            var8 = false;

            while (var5) {
               val var6: Int = var19.x(var18);
               switch (var6) {
                  case -1:
                     var5 = false;
                     continue;
                  case 0:
                     var12 = var19.m(var18, 0, ApplicationId.$serializer.INSTANCE, var12) as ApplicationId;
                     var2 |= 1;
                     var3 = 10;
                     continue;
                  case 1:
                     var13 = var19.m(var18, 1, ChannelId.$serializer.INSTANCE, var13) as ChannelId;
                     var2 |= 2;
                     var3 = 10;
                     continue;
                  case 2:
                     var9 = var19.t(var18, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var10 = var19.v(var18, 3, C0.a, var10) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var14 = var19.v(var18, 4, var16[4], var14) as java.util.List;
                     var2 |= 16;
                     break;
                  case 5:
                     var8 = var19.s(var18, 5);
                     var2 |= 32;
                     continue;
                  case 6:
                     var21 = var19.t(var18, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var4 = var19.k(var18, 7);
                     var2 |= 128;
                     continue;
                  case 8:
                     var7 = var19.s(var18, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var15 = var19.v(var18, 9, AppMessageEmbedImpl.$serializer.INSTANCE, var15) as AppMessageEmbedImpl;
                     var2 |= 512;
                     continue;
                  case 10:
                     var11 = var19.v(var18, var3, C0.a, var11) as java.lang.String;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var6);
               }

               var3 = 10;
            }

            var3 = var2;
            var21 = var11;
            var10 = (AppMessageEmbedImpl)var15;
            var2 = var4;
            var11 = var21;
            var9 = (java.util.List)var14;
            var15 = var10;
            var14 = var9;
         }

         var19.b(var18);
         return new ActivityInstanceEmbed(
            var3,
            (ApplicationId)var12,
            (ChannelId)var13,
            (java.lang.String)var14,
            (java.lang.String)var15,
            var9,
            var8,
            (java.lang.String)var11,
            var2,
            var7,
            var10,
            (java.lang.String)var21,
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
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
