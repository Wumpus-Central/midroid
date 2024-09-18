package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import yk.b2
import yk.g0
import yk.g0.a

@f
public data class TapRoleIconData(roleName: String, roleIconSource: String) : ReactEvent {
   public final val roleIconSource: String
   public final val roleName: String

   init {
      q.h(var1, "roleName");
      q.h(var2, "roleIconSource");
      super();
      this.roleName = var1;
      this.roleIconSource = var2;
   }

   public operator fun component1(): String {
      return this.roleName;
   }

   public operator fun component2(): String {
      return this.roleIconSource;
   }

   public fun copy(roleName: String = var0.roleName, roleIconSource: String = var0.roleIconSource): TapRoleIconData {
      q.h(var1, "roleName");
      q.h(var2, "roleIconSource");
      return new TapRoleIconData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapRoleIconData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.roleName, var1.roleName)) {
            return false;
         } else {
            return q.c(this.roleIconSource, var1.roleIconSource);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.roleName.hashCode() * 31 + this.roleIconSource.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.roleName;
      val var2: java.lang.String = this.roleIconSource;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapRoleIconData(roleName=");
      var3.append(var1);
      var3.append(", roleIconSource=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapRoleIconData.$serializer = new TapRoleIconData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapRoleIconData", var0, 2);
         var1.l("roleName", false);
         var1.l("roleIconSource", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapRoleIconData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.t(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.t(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new TapRoleIconData(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: TapRoleIconData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapRoleIconData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapRoleIconData> {
         return TapRoleIconData.$serializer.INSTANCE;
      }
   }
}
