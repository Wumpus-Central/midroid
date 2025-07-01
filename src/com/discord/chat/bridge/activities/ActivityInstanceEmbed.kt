package com.discord.chat.bridge.activities

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.primitives.ApplicationId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import tb.f

@f
public data class ActivityInstanceEmbed(applicationId: ApplicationId,
   instanceId: String,
   participantAvatarUris: List<String>? = ...,
   appMessageEmbedModel: AppMessageEmbedImpl,
   participantsDescription: String? = ...
) : ActivityInstanceEmbed(var1, var3, var4, var5, var6) {
   public final val applicationId: ApplicationId
   public final val instanceId: String
   public final val participantAvatarUris: List<String>?
   public final val appMessageEmbedModel: AppMessageEmbedImpl
   public final val participantsDescription: String?

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
      val var6: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var5: java.lang.String = this.instanceId;
      val var1: java.util.List = this.participantAvatarUris;
      val var3: AppMessageEmbedImpl = this.appMessageEmbedModel;
      val var2: java.lang.String = this.participantsDescription;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ActivityInstanceEmbed(applicationId=");
      var4.append(var6);
      var4.append(", instanceId=");
      var4.append(var5);
      var4.append(", participantAvatarUris=");
      var4.append(var1);
      var4.append(", appMessageEmbedModel=");
      var4.append(var3);
      var4.append(", participantsDescription=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
