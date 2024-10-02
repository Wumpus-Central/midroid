package com.discord.chat.bridge.polls

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      q.h(var1, "label");
      q.h(var2, "presentation");
      super();
      this.label = var1;
      this.presentation = var2;
      this.enabled = var3;
      this.type = var4;
      this.secondaryLabel = var5;
      this.accessibilityHint = var6;
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
      q.h(var1, "label");
      q.h(var2, "presentation");
      return new PollAction(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.label, var1.label)) {
            return false;
         } else if (this.presentation != var1.presentation) {
            return false;
         } else if (this.enabled != var1.enabled) {
            return false;
         } else if (!q.c(this.type, var1.type)) {
            return false;
         } else if (!q.c(this.secondaryLabel, var1.secondaryLabel)) {
            return false;
         } else {
            return q.c(this.accessibilityHint, var1.accessibilityHint);
         }
      }
   }

   public fun getFullTextLabel(): String {
      val var2: java.lang.String = this.secondaryLabel;
      if (this.secondaryLabel == null) {
         return this.label;
      } else {
         val var3: java.lang.String = this.label;
         val var1: StringBuilder = new StringBuilder();
         var1.append(var3);
         var1.append("  •  ");
         var1.append(var2);
         return var1.toString();
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.label.hashCode();
      val var4: Int = this.presentation.hashCode();
      val var5: Int = java.lang.Boolean.hashCode(this.enabled);
      var var3: Int = 0;
      val var1: Int;
      if (this.type == null) {
         var1 = 0;
      } else {
         var1 = this.type.hashCode();
      }

      val var2: Int;
      if (this.secondaryLabel == null) {
         var2 = 0;
      } else {
         var2 = this.secondaryLabel.hashCode();
      }

      if (this.accessibilityHint != null) {
         var3 = this.accessibilityHint.hashCode();
      }

      return ((((var6 * 31 + var4) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.label;
      val var4: PollActionPresentation = this.presentation;
      val var1: Boolean = this.enabled;
      val var5: java.lang.String = this.type;
      val var2: java.lang.String = this.secondaryLabel;
      val var3: java.lang.String = this.accessibilityHint;
      val var7: StringBuilder = new StringBuilder();
      var7.append("PollAction(label=");
      var7.append(var6);
      var7.append(", presentation=");
      var7.append(var4);
      var7.append(", enabled=");
      var7.append(var1);
      var7.append(", type=");
      var7.append(var5);
      var7.append(", secondaryLabel=");
      var7.append(var2);
      var7.append(", accessibilityHint=");
      var7.append(var3);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : g0 {
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
         val var2: Array<KSerializer> = PollAction.access$get$childSerializers$cp();
         val var1: b2 = b2.a;
         return new KSerializer[]{b2.a, var2[1], h.a, a.u(b2.a), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): PollAction {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var10: Array<KSerializer> = PollAction.access$get$childSerializers$cp();
         var var2: Int;
         var var5: Boolean;
         var var6: PollActionPresentation;
         var var7: Any;
         var var9: java.lang.String;
         var var14: Any;
         if (var12.y()) {
            var9 = var12.t(var11, 0);
            var6 = var12.m(var11, 1, var10[1], null) as PollActionPresentation;
            var5 = var12.s(var11, 2);
            var14 = b2.a;
            var7 = var12.v(var11, 3, b2.a, null) as java.lang.String;
            var10 = var12.v(var11, 4, (DeserializationStrategy)var14, null) as java.lang.String;
            var14 = var12.v(var11, 5, (DeserializationStrategy)var14, null) as java.lang.String;
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var9 = null;
            var var8: PollActionPresentation = null;
            var7 = null;
            var6 = null;
            var14 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var12.x(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var9 = var12.t(var11, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var8 = var12.m(var11, 1, var10[1], var8) as PollActionPresentation;
                     var2 |= 2;
                     break;
                  case 2:
                     var5 = var12.s(var11, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var12.v(var11, 3, b2.a, var7) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var12.v(var11, 4, b2.a, var6) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var12.v(var11, 5, b2.a, var14) as java.lang.String;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var10 = var6;
            var6 = var8;
         }

         var12.b(var11);
         return new PollAction(var2, var9, var6, var5, (java.lang.String)var7, var10, (java.lang.String)var14, null);
      }

      public open fun serialize(encoder: Encoder, value: PollAction) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PollAction.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollAction> {
         return PollAction.$serializer.INSTANCE;
      }
   }
}
