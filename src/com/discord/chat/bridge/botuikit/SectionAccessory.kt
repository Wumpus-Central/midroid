package com.discord.chat.bridge.botuikit

import Ka.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f(with = SectionAccessory.Serializer::class)
public sealed interface SectionAccessory<T extends Component> {
   public val component: Any?

   public inline class Button : SectionAccessory<ButtonComponent> {
      public open val component: ButtonComponent

      @JvmStatic
      fun `constructor-impl`(var0: ButtonComponent): ButtonComponent {
         q.h(var0, "component");
         return var0;
      }

      @JvmStatic
      public open operator fun equals(other: Any?): Boolean {
         if (var1 !is SectionAccessory.Button) {
            return false;
         } else {
            return q.c(var0, (var1 as SectionAccessory.Button).unbox-impl());
         }
      }

      @JvmStatic
      fun `equals-impl0`(var0: ButtonComponent, var1: ButtonComponent): Boolean {
         return q.c(var0, var1);
      }

      @JvmStatic
      public open fun hashCode(): Int {
         return var0.hashCode();
      }

      @JvmStatic
      public open fun toString(): String {
         val var1: StringBuilder = new StringBuilder();
         var1.append("Button(component=");
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

   public companion object {
      public fun <T> serializer(typeSerial0: KSerializer<T>): KSerializer<SectionAccessory<T>> {
         q.h(var1, "typeSerial0");
         return SectionAccessory.Serializer.INSTANCE;
      }
   }

   public object Serializer : ComponentUnionSerializer<SectionAccessory<?>> {
      public open val unionName: String = "SectionAccessory"

      public open fun fromValue(value: SectionAccessory<*>): Component? {
         q.h(var1, "value");
         return var1.getComponent();
      }

      public open fun toValue(component: Component): SectionAccessory<*> {
         q.h(var1, "component");
         val var2: Any;
         if (var1 is ButtonComponent) {
            var2 = SectionAccessory.Button.box-impl(SectionAccessory.Button.constructor-impl(var1 as ButtonComponent));
         } else if (var1 is ThumbnailDisplayComponent) {
            var2 = SectionAccessory.Thumbnail.box-impl(SectionAccessory.Thumbnail.constructor-impl(var1 as ThumbnailDisplayComponent));
         } else {
            var2 = new SectionAccessory.Unknown();
         }

         return (SectionAccessory<?>)var2;
      }
   }

   public inline class Thumbnail : SectionAccessory<ThumbnailDisplayComponent> {
      public open val component: ThumbnailDisplayComponent

      @JvmStatic
      fun `constructor-impl`(var0: ThumbnailDisplayComponent): ThumbnailDisplayComponent {
         q.h(var0, "component");
         return var0;
      }

      @JvmStatic
      public open operator fun equals(other: Any?): Boolean {
         if (var1 !is SectionAccessory.Thumbnail) {
            return false;
         } else {
            return q.c(var0, (var1 as SectionAccessory.Thumbnail).unbox-impl());
         }
      }

      @JvmStatic
      fun `equals-impl0`(var0: ThumbnailDisplayComponent, var1: ThumbnailDisplayComponent): Boolean {
         return q.c(var0, var1);
      }

      @JvmStatic
      public open fun hashCode(): Int {
         return var0.hashCode();
      }

      @JvmStatic
      public open fun toString(): String {
         val var1: StringBuilder = new StringBuilder();
         var1.append("Thumbnail(component=");
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

   public class Unknown : SectionAccessory<Component> {
      public open val component: Component?
   }
}
