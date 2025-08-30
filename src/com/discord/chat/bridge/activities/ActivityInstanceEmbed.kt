package com.discord.chat.bridge.activities

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.primitives.ApplicationId
import kotlinx.serialization.KSerializer
import nb.g

@g
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
         } else if (!(this.instanceId == var1.instanceId)) {
            return false;
         } else if (!(this.participantAvatarUris == var1.participantAvatarUris)) {
            return false;
         } else if (!(this.appMessageEmbedModel == var1.appMessageEmbedModel)) {
            return false;
         } else {
            return this.participantsDescription == var1.participantsDescription;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var3: Int = this.instanceId.hashCode();
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

      return (((var4 * 31 + var3) * 31 + var1) * 31 + var5) * 31 + var2;
   }

   public override fun toString(): String {
      val var4: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var5: java.lang.String = this.instanceId;
      val var2: java.util.List = this.participantAvatarUris;
      val var3: AppMessageEmbedImpl = this.appMessageEmbedModel;
      val var6: java.lang.String = this.participantsDescription;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ActivityInstanceEmbed(applicationId=");
      var1.append(var4);
      var1.append(", instanceId=");
      var1.append(var5);
      var1.append(", participantAvatarUris=");
      var1.append(var2);
      var1.append(", appMessageEmbedModel=");
      var1.append(var3);
      var1.append(", participantsDescription=");
      var1.append(var6);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
