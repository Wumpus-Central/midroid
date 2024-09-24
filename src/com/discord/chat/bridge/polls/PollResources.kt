package com.discord.chat.bridge.polls

import cl.f
import cl.n
import fl.b2
import fl.g0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import lh.r

@f
public data class PollResources(selectedIcon: String, checkmarkIcon: String, styles: Map<String, PollStyleSet> = r.h()) {
   public final val checkmarkIcon: String

   public final val defaultStyle: PollStyleSet
      public final get() {
         val var2: PollStyleSet = this.styles.get("normal");
         var var1: PollStyleSet = var2;
         if (var2 == null) {
            var1 = PollStyleSet.Companion.getDEFAULT();
         }

         return var1;
      }


   public final val selectedIcon: String
   public final val styles: Map<String, PollStyleSet>

   init {
      q.h(var1, "selectedIcon");
      q.h(var2, "checkmarkIcon");
      q.h(var3, "styles");
      super();
      this.selectedIcon = var1;
      this.checkmarkIcon = var2;
      this.styles = var3;
   }

   public operator fun component1(): String {
      return this.selectedIcon;
   }

   public operator fun component2(): String {
      return this.checkmarkIcon;
   }

   public operator fun component3(): Map<String, PollStyleSet> {
      return this.styles;
   }

   public fun copy(selectedIcon: String = var0.selectedIcon, checkmarkIcon: String = var0.checkmarkIcon, styles: Map<String, PollStyleSet> = var0.styles): PollResources {
      q.h(var1, "selectedIcon");
      q.h(var2, "checkmarkIcon");
      q.h(var3, "styles");
      return new PollResources(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollResources) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.selectedIcon, var1.selectedIcon)) {
            return false;
         } else if (!q.c(this.checkmarkIcon, var1.checkmarkIcon)) {
            return false;
         } else {
            return q.c(this.styles, var1.styles);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.selectedIcon.hashCode() * 31 + this.checkmarkIcon.hashCode()) * 31 + this.styles.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.selectedIcon;
      val var3: java.lang.String = this.checkmarkIcon;
      val var2: java.util.Map = this.styles;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PollResources(selectedIcon=");
      var4.append(var1);
      var4.append(", checkmarkIcon=");
      var4.append(var3);
      var4.append(", styles=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollResources.$serializer = new PollResources.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollResources", var0, 3);
         var1.l("selectedIcon", false);
         var1.l("checkmarkIcon", false);
         var1.l("styles", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, PollResources.access$get$childSerializers$cp()[2]};
      }

      public open fun deserialize(decoder: Decoder): PollResources {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var8: Array<KSerializer> = PollResources.access$get$childSerializers$cp();
         val var5: Boolean = var10.y();
         var var7: java.lang.String = null;
         var var2: Int;
         val var11: java.lang.String;
         val var13: java.util.Map;
         if (var5) {
            var7 = var10.t(var9, 0);
            var11 = var10.t(var9, 1);
            var13 = var10.m(var9, 2, var8[2], null) as java.util.Map;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var6: java.lang.String = null;
            var var12: java.util.Map = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.m(var9, 2, var8[2], var12) as java.util.Map;
                        var2 |= 4;
                     } else {
                        var6 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = var12;
            var11 = var6;
         }

         var10.b(var9);
         return new PollResources(var2, var7, var11, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: PollResources) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PollResources.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollResources> {
         return PollResources.$serializer.INSTANCE;
      }
   }
}
