package com.discord.chat.bridge.activities

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.primitives.ApplicationId
import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.p0
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
   instanceId: String,
   participantAvatarUris: List<String>? = ...,
   appMessageEmbedModel: AppMessageEmbedImpl,
   participantsDescription: String? = ...
) : ActivityInstanceEmbed(var1, var3, var4, var5, var6) {
   public final val appMessageEmbedModel: AppMessageEmbedImpl
   public final val applicationId: ApplicationId
   public final val instanceId: String
   public final val participantAvatarUris: List<String>?
   public final val participantsDescription: String?

   fun ActivityInstanceEmbed(
      var1: Int,
      var2: ApplicationId,
      var3: java.lang.String,
      var4: MutableList<java.lang.String>,
      var5: AppMessageEmbedImpl,
      var6: java.lang.String,
      var7: SerializationConstructorMarker
   ) {
      if (11 != (var1 and 11)) {
         p0.b(var1, 11, ActivityInstanceEmbed.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.applicationId = var2.unbox-impl();
      this.instanceId = var3;
      if ((var1 and 4) == 0) {
         this.participantAvatarUris = null;
      } else {
         this.participantAvatarUris = var4;
      }

      this.appMessageEmbedModel = var5;
      if ((var1 and 16) == 0) {
         this.participantsDescription = null;
      } else {
         this.participantsDescription = var6;
      }
   }

   fun ActivityInstanceEmbed(var1: Long, var3: java.lang.String, var4: MutableList<java.lang.String>, var5: AppMessageEmbedImpl, var6: java.lang.String) {
      q.h(var3, "instanceId");
      q.h(var5, "appMessageEmbedModel");
      super();
      this.applicationId = var1;
      this.instanceId = var3;
      this.participantAvatarUris = var4;
      this.appMessageEmbedModel = var5;
      this.participantsDescription = var6;
   }

   public operator fun component1(): ApplicationId {
      return this.applicationId;
   }

   public operator fun component2(): String {
      return this.instanceId;
   }

   public operator fun component3(): List<String>? {
      return this.participantAvatarUris;
   }

   public operator fun component4(): AppMessageEmbedImpl {
      return this.appMessageEmbedModel;
   }

   public operator fun component5(): String? {
      return this.participantsDescription;
   }

   public fun copy(
      applicationId: ApplicationId = ...,
      instanceId: String = ...,
      participantAvatarUris: List<String>? = ...,
      appMessageEmbedModel: AppMessageEmbedImpl = ...,
      participantsDescription: String? = ...
   ): ActivityInstanceEmbed {
      q.h(var3, "instanceId");
      q.h(var5, "appMessageEmbedModel");
      return new ActivityInstanceEmbed(var1, var3, var4, var5, var6, null);
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
         } else if (!q.c(this.instanceId, var1.instanceId)) {
            return false;
         } else if (!q.c(this.participantAvatarUris, var1.participantAvatarUris)) {
            return false;
         } else if (!q.c(this.appMessageEmbedModel, var1.appMessageEmbedModel)) {
            return false;
         } else {
            return q.c(this.participantsDescription, var1.participantsDescription);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var4: Int = this.instanceId.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.participantAvatarUris == null) {
         var1 = 0;
      } else {
         var1 = this.participantAvatarUris.hashCode();
      }

      val var5: Int = this.appMessageEmbedModel.hashCode();
      if (this.participantsDescription != null) {
         var2 = this.participantsDescription.hashCode();
      }

      return (((var3 * 31 + var4) * 31 + var1) * 31 + var5) * 31 + var2;
   }

   public override fun toString(): String {
      val var3: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var4: java.lang.String = this.instanceId;
      val var1: java.util.List = this.participantAvatarUris;
      val var6: AppMessageEmbedImpl = this.appMessageEmbedModel;
      val var5: java.lang.String = this.participantsDescription;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActivityInstanceEmbed(applicationId=");
      var2.append(var3);
      var2.append(", instanceId=");
      var2.append(var4);
      var2.append(", participantAvatarUris=");
      var2.append(var1);
      var2.append(", appMessageEmbedModel=");
      var2.append(var6);
      var2.append(", participantsDescription=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.activities.ActivityInstanceEmbed", var0, 5);
         var1.l("applicationId", false);
         var1.l("instanceId", false);
         var1.l("participantAvatarUris", true);
         var1.l("appMessageEmbedModel", false);
         var1.l("participantsDescription", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         val var1: C0 = C0.a;
         return new KSerializer[]{ApplicationId.$serializer.INSTANCE, C0.a, a.u(var2[2]), AppMessageEmbedImpl.$serializer.INSTANCE, a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): ActivityInstanceEmbed {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var10: Array<KSerializer> = ActivityInstanceEmbed.access$get$childSerializers$cp();
         val var5: Boolean = var12.y();
         var var9: ApplicationId = null;
         var var2: Int;
         var var6: Any;
         var var8: java.lang.String;
         val var13: java.util.List;
         if (var5) {
            var9 = var12.m(var11, 0, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var8 = var12.t(var11, 1);
            var13 = var12.v(var11, 2, var10[2], null) as java.util.List;
            var6 = var12.m(var11, 3, AppMessageEmbedImpl.$serializer.INSTANCE, null) as AppMessageEmbedImpl;
            val var7: java.lang.String = var12.v(var11, 4, C0.a, null) as java.lang.String;
            var2 = 31;
            var10 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var var15: java.util.List = null;
            var6 = null;
            var var14: Any = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var14 = var12.v(var11, 4, C0.a, var14) as java.lang.String;
                              var2 |= 16;
                           } else {
                              var6 = var12.m(var11, 3, AppMessageEmbedImpl.$serializer.INSTANCE, var6) as AppMessageEmbedImpl;
                              var2 |= 8;
                           }
                        } else {
                           var15 = var12.v(var11, 2, var10[2], var15) as java.util.List;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.m(var11, 0, ApplicationId.$serializer.INSTANCE, var9) as ApplicationId;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var10 = (KSerializer[])var14;
            var13 = var15;
         }

         var12.b(var11);
         return new ActivityInstanceEmbed(var2, var9, var8, var13, (AppMessageEmbedImpl)var6, var10, null, null);
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
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
