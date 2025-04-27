package com.discord.chat.bridge.botuikit

import ca.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f(with = SectionChildComponent.Serializer::class)
public sealed interface SectionChildComponent<T extends Component> {
   public val component: Any?

   public companion object {
      public fun <T0> serializer(typeSerial0: KSerializer<T0>): KSerializer<SectionChildComponent<T0>> {
         q.h(var1, "typeSerial0");
         return SectionChildComponent.Serializer.INSTANCE;
      }
   }

   public object Serializer : ComponentUnionSerializer<SectionChildComponent<?>> {
      public open val unionName: String = "SectionAccessory"

      public open fun fromValue(value: SectionChildComponent<*>): Component? {
         q.h(var1, "value");
         return var1.getComponent();
      }

      public open fun toValue(component: Component): SectionChildComponent<*> {
         q.h(var1, "component");
         val var2: Any;
         if (var1 is TextDisplayComponent) {
            var2 = SectionChildComponent.TextDisplay.box-impl(SectionChildComponent.TextDisplay.constructor-impl(var1 as TextDisplayComponent));
         } else {
            var2 = new SectionChildComponent.Unknown();
         }

         return (SectionChildComponent<?>)var2;
      }
   }

   public inline class TextDisplay : SectionChildComponent<TextDisplayComponent> {
      public open val component: TextDisplayComponent

      @JvmStatic
      fun `constructor-impl`(var0: TextDisplayComponent): TextDisplayComponent {
         q.h(var0, "component");
         return var0;
      }

      @JvmStatic
      public open operator fun equals(other: Any?): Boolean {
         if (var1 !is SectionChildComponent.TextDisplay) {
            return false;
         } else {
            return q.c(var0, (var1 as SectionChildComponent.TextDisplay).unbox-impl());
         }
      }

      @JvmStatic
      fun `equals-impl0`(var0: TextDisplayComponent, var1: TextDisplayComponent): Boolean {
         return q.c(var0, var1);
      }

      @JvmStatic
      public open fun hashCode(): Int {
         return var0.hashCode();
      }

      @JvmStatic
      public open fun toString(): String {
         val var1: StringBuilder = new StringBuilder();
         var1.append("TextDisplay(component=");
         var1.append(var0);
         var1.append(")");
         return var1.toString();
      }

      override fun equals(var1: Any): Boolean {
         return equals-impl(this.component, var1);
      }

      override fun hashCode(): Int {
         return hashCode-impl(this.component);
      }

      override fun toString(): java.lang.String {
         return toString-impl(this.component);
      }
   }

   public class Unknown : SectionChildComponent<Component> {
      public open val component: Component?
   }
}
