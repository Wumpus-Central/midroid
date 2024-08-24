package com.discord.chat.bridge.polls

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h

@f
public data class PollAction(label: String,
   presentation: PollActionPresentation,
   enabled: Boolean,
   type: String? = null,
   secondaryLabel: String? = null,
   accessibilityHint: String? = null
) {
   public final val accessibilityHint: String?
   public final val enabled: Boolean
   public final val label: String
   public final val presentation: PollActionPresentation
   public final val secondaryLabel: String?
   public final val type: String?

   init {
      r.h(var1, "label");
      r.h(var2, "presentation");
      super();
      this.label = var1;
      this.presentation = var2;
      this.enabled = var3;
      this.type = var4;
      this.secondaryLabel = var5;
      this.accessibilityHint = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: PollAction, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.label);
      var1.y(var2, 1, PollActionPresentation.Companion.serializer(), var0.presentation);
      var1.x(var2, 2, var0.enabled);
      var var3: Boolean;
      if (!var1.A(var2, 3) && var0.type == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.type);
      }

      if (!var1.A(var2, 4) && var0.secondaryLabel == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.secondaryLabel);
      }

      label32: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (var0.accessibilityHint == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.accessibilityHint);
      }
   }

   public operator fun component1(): String {
      return this.label;
   }

   public operator fun component2(): PollActionPresentation {
      return this.presentation;
   }

   public operator fun component3(): Boolean {
      return this.enabled;
   }

   public operator fun component4(): String? {
      return this.type;
   }

   public operator fun component5(): String? {
      return this.secondaryLabel;
   }

   public operator fun component6(): String? {
      return this.accessibilityHint;
   }

   public fun copy(
      label: String = var0.label,
      presentation: PollActionPresentation = var0.presentation,
      enabled: Boolean = var0.enabled,
      type: String? = var0.type,
      secondaryLabel: String? = var0.secondaryLabel,
      accessibilityHint: String? = var0.accessibilityHint
   ): PollAction {
      r.h(var1, "label");
      r.h(var2, "presentation");
      return new PollAction(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAction) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.label, var1.label)) {
            return false;
         } else if (this.presentation != var1.presentation) {
            return false;
         } else if (this.enabled != var1.enabled) {
            return false;
         } else if (!r.c(this.type, var1.type)) {
            return false;
         } else if (!r.c(this.secondaryLabel, var1.secondaryLabel)) {
            return false;
         } else {
            return r.c(this.accessibilityHint, var1.accessibilityHint);
         }
      }
   }

   public fun getFullTextLabel(): String {
      val var1: java.lang.String = this.secondaryLabel;
      if (this.secondaryLabel == null) {
         return this.label;
      } else {
         val var3: java.lang.String = this.label;
         val var2: StringBuilder = new StringBuilder();
         var2.append(var3);
         var2.append("  •  ");
         var2.append(var1);
         return var2.toString();
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.label.hashCode();
      val var5: Int = this.presentation.hashCode();
      var var1: Byte = this.enabled;
      if (this.enabled != 0) {
         var1 = 1;
      }

      var var4: Int = 0;
      val var8: Int;
      if (this.type == null) {
         var8 = 0;
      } else {
         var8 = this.type.hashCode();
      }

      val var3: Int;
      if (this.secondaryLabel == null) {
         var3 = 0;
      } else {
         var3 = this.secondaryLabel.hashCode();
      }

      if (this.accessibilityHint != null) {
         var4 = this.accessibilityHint.hashCode();
      }

      return ((((var6 * 31 + var5) * 31 + var1) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.label;
      val var7: PollActionPresentation = this.presentation;
      val var1: Boolean = this.enabled;
      val var5: java.lang.String = this.type;
      val var3: java.lang.String = this.secondaryLabel;
      val var2: java.lang.String = this.accessibilityHint;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PollAction(label=");
      var6.append(var4);
      var6.append(", presentation=");
      var6.append(var7);
      var6.append(", enabled=");
      var6.append(var1);
      var6.append(", type=");
      var6.append(var5);
      var6.append(", secondaryLabel=");
      var6.append(var3);
      var6.append(", accessibilityHint=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<PollAction> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollAction.$serializer = new PollAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollAction", var0, 6);
         var1.l("label", false);
         var1.l("presentation", false);
         var1.l("enabled", false);
         var1.l("type", true);
         var1.l("secondaryLabel", true);
         var1.l("accessibilityHint", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, PollActionPresentation.Companion.serializer(), h.a, a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): PollAction {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.String;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var14: Any;
         if (var12.p()) {
            var6 = var12.m(var11, 0);
            var9 = var12.y(var11, 1, PollActionPresentation.Companion.serializer(), null);
            var5 = var12.C(var11, 2);
            var14 = a2.a;
            var8 = var12.n(var11, 3, a2.a, null);
            var7 = var12.n(var11, 4, (DeserializationStrategy)var14, null);
            var14 = var12.n(var11, 5, (DeserializationStrategy)var14, null);
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var7 = null;
            var9 = null;
            var8 = null;
            var6 = null;
            var14 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var12.o(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var7 = var12.m(var11, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var12.y(var11, 1, PollActionPresentation.Companion.serializer(), var9);
                     var2 |= 2;
                     break;
                  case 2:
                     var5 = var12.C(var11, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var12.n(var11, 3, a2.a, var8);
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = (java.lang.String)var12.n(var11, 4, a2.a, var6);
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var12.n(var11, 5, a2.a, var14);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var6 = (java.lang.String)var7;
            var7 = var6;
         }

         var12.c(var11);
         return new PollAction(
            var2, var6, var9 as PollActionPresentation, var5, var8 as java.lang.String, var7 as java.lang.String, var14 as java.lang.String, null
         );
      }

      public open fun serialize(encoder: Encoder, value: PollAction) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollAction.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollAction> {
         return PollAction.$serializer.INSTANCE;
      }
   }
}
