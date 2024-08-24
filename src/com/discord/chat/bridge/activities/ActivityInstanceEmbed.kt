package com.discord.chat.bridge.activities

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0
import xk.n1

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
         n1.b(var1, 231, ActivityInstanceEmbed.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: ActivityInstanceEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.ApplicationId..serializer.INSTANCE, ApplicationId.box-impl(var0.applicationId));
      var1.y(var2, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var1.z(var2, 2, var0.instanceId);
      var var3: Boolean;
      if (!var1.A(var2, 3) && var0.statusText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.statusText);
      }

      if (!var1.A(var2, 4) && var0.participantAvatarUris == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, new xk.f(a2.a), var0.participantAvatarUris);
      }

      label32: {
         var1.x(var2, 5, var0.buttonDisabled);
         var1.z(var2, 6, var0.buttonLabelText);
         var1.w(var2, 7, var0.buttonBackgroundColor);
         if (!var1.A(var2, 8)) {
            var3 = false;
            if (!var0.submitting) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.x(var2, 8, var0.submitting);
      }
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
      r.h(var5, "instanceId");
      r.h(var9, "buttonLabelText");
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
         } else if (!r.c(this.instanceId, var1.instanceId)) {
            return false;
         } else if (!r.c(this.statusText, var1.statusText)) {
            return false;
         } else if (!r.c(this.participantAvatarUris, var1.participantAvatarUris)) {
            return false;
         } else if (this.buttonDisabled != var1.buttonDisabled) {
            return false;
         } else if (!r.c(this.buttonLabelText, var1.buttonLabelText)) {
            return false;
         } else if (this.buttonBackgroundColor != var1.buttonBackgroundColor) {
            return false;
         } else {
            return this.submitting == var1.submitting;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var8: Int = ChannelId.hashCode-impl(this.channelId);
      val var7: Int = this.instanceId.hashCode();
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

      var var4: Byte = 1;
      var var3: Byte = this.buttonDisabled;
      if (this.buttonDisabled != 0) {
         var3 = 1;
      }

      val var9: Int = this.buttonLabelText.hashCode();
      val var10: Int = Integer.hashCode(this.buttonBackgroundColor);
      if (this.submitting == 0) {
         var4 = this.submitting;
      }

      return (((((((var6 * 31 + var8) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var9) * 31 + var10) * 31 + var4;
   }

   public override fun toString(): String {
      val var9: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var7: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var6: java.lang.String = this.instanceId;
      val var10: java.lang.String = this.statusText;
      val var4: java.util.List = this.participantAvatarUris;
      val var2: Boolean = this.buttonDisabled;
      val var5: java.lang.String = this.buttonLabelText;
      val var1: Int = this.buttonBackgroundColor;
      val var3: Boolean = this.submitting;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ActivityInstanceEmbed(applicationId=");
      var8.append(var9);
      var8.append(", channelId=");
      var8.append(var7);
      var8.append(", instanceId=");
      var8.append(var6);
      var8.append(", statusText=");
      var8.append(var10);
      var8.append(", participantAvatarUris=");
      var8.append(var4);
      var8.append(", buttonDisabled=");
      var8.append(var2);
      var8.append(", buttonLabelText=");
      var8.append(var5);
      var8.append(", buttonBackgroundColor=");
      var8.append(var1);
      var8.append(", submitting=");
      var8.append(var3);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : f0<ActivityInstanceEmbed> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{
            com.discord.primitives.ApplicationId..serializer.INSTANCE,
            com.discord.primitives.ChannelId..serializer.INSTANCE,
            a2.a,
            a.u(a2.a),
            a.u(new xk.f(var1)),
            h.a,
            var1,
            m0.a,
            h.a
         };
      }

      public open fun deserialize(decoder: Decoder): ActivityInstanceEmbed {
         r.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         val var9: Boolean = var18.p();
         var var3: Byte = 7;
         val var4: Int;
         var var5: Byte;
         var var6: Int;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         val var15: Any;
         if (var9) {
            var11 = var18.y(var17, 0, com.discord.primitives.ApplicationId..serializer.INSTANCE, null);
            var12 = var18.y(var17, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var10 = var18.m(var17, 2);
            val var19: a2 = a2.a;
            var13 = var18.n(var17, 3, a2.a, null);
            var14 = var18.n(var17, 4, new xk.f(var19), null);
            var5 = var18.C(var17, 5);
            val var20: java.lang.String = var18.m(var17, 6);
            val var2: Int = var18.i(var17, 7);
            var3 = var18.C(var17, 8);
            var4 = 511;
            var6 = var2;
            var15 = var20;
         } else {
            var var7: Boolean = true;
            var6 = 0;
            var var24: Byte = 0;
            var var22: Int = 0;
            var14 = null;
            var13 = null;
            var var21: Any = null;
            var12 = null;
            var11 = null;
            var10 = null;
            var5 = 0;

            while (var7) {
               label41: {
                  val var8: Int = var18.o(var17);
                  switch (var8) {
                     case -1:
                        var7 = false;
                        continue;
                     case 0:
                        var21 = var18.y(var17, 0, com.discord.primitives.ApplicationId..serializer.INSTANCE, var21);
                        var22 |= 1;
                        break;
                     case 1:
                        var10 = var18.y(var17, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var10);
                        var22 |= 2;
                        break;
                     case 2:
                        var12 = var18.m(var17, 2);
                        var22 |= 4;
                        break label41;
                     case 3:
                        var13 = var18.n(var17, 3, a2.a, var13);
                        var22 |= 8;
                        break label41;
                     case 4:
                        var14 = var18.n(var17, 4, new xk.f(a2.a), var14);
                        var22 |= 16;
                        var3 = 7;
                        continue;
                     case 5:
                        var5 = var18.C(var17, 5);
                        var22 |= 32;
                        continue;
                     case 6:
                        var11 = var18.m(var17, 6);
                        var22 |= 64;
                        continue;
                     case 7:
                        var6 = var18.i(var17, var3);
                        var22 |= 128;
                        continue;
                     case 8:
                        var24 = var18.C(var17, 8);
                        var22 |= 256;
                        continue;
                     default:
                        throw new n(var8);
                  }

                  var3 = 7;
                  continue;
               }

               var3 = 7;
            }

            var10 = var12;
            var15 = var11;
            var3 = var24;
            var12 = var10;
            var4 = var22;
            var11 = var21;
         }

         var18.c(var17);
         return new ActivityInstanceEmbed(
            var4,
            var11 as ApplicationId,
            var12 as ChannelId,
            (java.lang.String)var10,
            var13 as java.lang.String,
            var14 as java.util.List,
            (boolean)var5,
            (java.lang.String)var15,
            var6,
            (boolean)var3,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ActivityInstanceEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActivityInstanceEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInstanceEmbed> {
         return ActivityInstanceEmbed.$serializer.INSTANCE;
      }
   }
}
