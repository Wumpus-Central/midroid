package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class SectionComponent(type: Int, id: String, errorText: String? = null, components: List<SectionChildComponent<*>>, accessory: SectionAccessory<*>)
   : BaseLayoutComponent {
   public open val type: Int
   public open val id: String
   public open val errorText: String?
   public final val components: List<SectionChildComponent<*>>
   public final val accessory: SectionAccessory<*>

   init {
      r.h(var2, "id");
      r.h(var4, "components");
      r.h(var5, "accessory");
      super(null);
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
      this.accessory = var5;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): String? {
      return this.errorText;
   }

   public operator fun component4(): List<SectionChildComponent<*>> {
      return this.components;
   }

   public operator fun component5(): SectionAccessory<*> {
      return this.accessory;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      errorText: String? = var0.errorText,
      components: List<SectionChildComponent<*>> = var0.components,
      accessory: SectionAccessory<*> = var0.accessory
   ): SectionComponent {
      r.h(var2, "id");
      r.h(var4, "components");
      r.h(var5, "accessory");
      return new SectionComponent(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SectionComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.errorText, var1.errorText)) {
            return false;
         } else if (!r.c(this.components, var1.components)) {
            return false;
         } else {
            return r.c(this.accessory, var1.accessory);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.type);
      val var2: Int = this.id.hashCode();
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      return (((var3 * 31 + var2) * 31 + var1) * 31 + this.components.hashCode()) * 31 + this.accessory.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var6: java.lang.String = this.errorText;
      val var2: java.util.List = this.components;
      val var4: SectionAccessory = this.accessory;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SectionComponent(type=");
      var5.append(var1);
      var5.append(", id=");
      var5.append(var3);
      var5.append(", errorText=");
      var5.append(var6);
      var5.append(", components=");
      var5.append(var2);
      var5.append(", accessory=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SectionComponent> {
         return SectionComponent.$serializer.INSTANCE;
      }
   }
}
