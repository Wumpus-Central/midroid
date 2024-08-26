package com.discord.chat.bridge.polls

import fh.s
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.r0
import xk.f0.a

@f
public data class PollResources(selectedIcon: String, checkmarkIcon: String, styles: Map<String, PollStyleSet> = s.h()) {
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
      r.h(var1, "selectedIcon");
      r.h(var2, "checkmarkIcon");
      r.h(var3, "styles");
      super();
      this.selectedIcon = var1;
      this.checkmarkIcon = var2;
      this.styles = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: PollResources, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.z(var2, 0, var0.selectedIcon);
      var1.z(var2, 1, var0.checkmarkIcon);
      if (var1.A(var2, 2) || !r.c(var0.styles, s.h())) {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 2, new r0(a2.a, PollStyleSet.$serializer.INSTANCE), var0.styles);
      }
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
      r.h(var1, "selectedIcon");
      r.h(var2, "checkmarkIcon");
      r.h(var3, "styles");
      return new PollResources(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollResources) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.selectedIcon, var1.selectedIcon)) {
            return false;
         } else if (!r.c(this.checkmarkIcon, var1.checkmarkIcon)) {
            return false;
         } else {
            return r.c(this.styles, var1.styles);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.selectedIcon.hashCode() * 31 + this.checkmarkIcon.hashCode()) * 31 + this.styles.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.selectedIcon;
      val var2: java.lang.String = this.checkmarkIcon;
      val var1: java.util.Map = this.styles;
      val var3: StringBuilder = new StringBuilder();
      var3.append("PollResources(selectedIcon=");
      var3.append(var4);
      var3.append(", checkmarkIcon=");
      var3.append(var2);
      var3.append(", styles=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<PollResources> {
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
         return new KSerializer[]{a2.a, a2.a, new r0(a2.a, PollStyleSet.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): PollResources {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var7: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var10: Any;
         if (var5) {
            var7 = var9.m(var8, 0);
            var6 = var9.m(var8, 1);
            var10 = var9.y(var8, 2, new r0(a2.a, PollStyleSet.$serializer.INSTANCE), null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var9.y(var8, 2, new r0(a2.a, PollStyleSet.$serializer.INSTANCE), var10);
                        var2 |= 4;
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new PollResources(var2, var7, var6, var10 as java.util.Map, null);
      }

      public open fun serialize(encoder: Encoder, value: PollResources) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollResources.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollResources> {
         return PollResources.$serializer.INSTANCE;
      }
   }
}
