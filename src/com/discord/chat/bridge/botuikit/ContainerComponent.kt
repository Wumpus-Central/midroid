package com.discord.chat.bridge.botuikit

import Ka.f
import com.discord.chat.bridge.spoiler.SpoilerableData
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class ContainerComponent(type: Int,
      id: String,
      errorText: String? = null,
      components: List<Component>,
      accentColor: Int? = null,
      isSpoiler: Boolean,
      spoilerDescription: String?,
      themedBackgroundColor: Int? = null
   )
   : BaseLayoutComponent,
   SpoilerableData {
   public open val type: Int
   public open val id: String
   public open val errorText: String?
   public final val components: List<Component>
   public final val accentColor: Int?
   public final val isSpoiler: Boolean
   public final val spoilerDescription: String?
   public final val themedBackgroundColor: Int?
   public open val spoilerOrNull: String?
   public open val obscureOrNull: Nothing?

   init {
      q.h(var2, "id");
      q.h(var4, "components");
      super(null);
      this.type = var1;
      this.id = var2;
      this.errorText = var3;
      this.components = var4;
      this.accentColor = var5;
      this.isSpoiler = var6;
      this.spoilerDescription = var7;
      this.themedBackgroundColor = var8;
      val var9: Boolean;
      if (var7 != null && !h.c0(var7)) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (var9) {
         var7 = null;
      }

      this.spoilerOrNull = var7;
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

   public operator fun component4(): List<Component> {
      return this.components;
   }

   public operator fun component5(): Int? {
      return this.accentColor;
   }

   public operator fun component6(): Boolean {
      return this.isSpoiler;
   }

   public operator fun component7(): String? {
      return this.spoilerDescription;
   }

   public operator fun component8(): Int? {
      return this.themedBackgroundColor;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      errorText: String? = var0.errorText,
      components: List<Component> = var0.components,
      accentColor: Int? = var0.accentColor,
      isSpoiler: Boolean = var0.isSpoiler,
      spoilerDescription: String? = var0.spoilerDescription,
      themedBackgroundColor: Int? = var0.themedBackgroundColor
   ): ContainerComponent {
      q.h(var2, "id");
      q.h(var4, "components");
      return new ContainerComponent(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContainerComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.errorText, var1.errorText)) {
            return false;
         } else if (!q.c(this.components, var1.components)) {
            return false;
         } else if (!q.c(this.accentColor, var1.accentColor)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!q.c(this.spoilerDescription, var1.spoilerDescription)) {
            return false;
         } else {
            return q.c(this.themedBackgroundColor, var1.themedBackgroundColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.type);
      val var6: Int = this.id.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.errorText == null) {
         var1 = 0;
      } else {
         var1 = this.errorText.hashCode();
      }

      val var7: Int = this.components.hashCode();
      val var2: Int;
      if (this.accentColor == null) {
         var2 = 0;
      } else {
         var2 = this.accentColor.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var3: Int;
      if (this.spoilerDescription == null) {
         var3 = 0;
      } else {
         var3 = this.spoilerDescription.hashCode();
      }

      if (this.themedBackgroundColor != null) {
         var4 = this.themedBackgroundColor.hashCode();
      }

      return ((((((var5 * 31 + var6) * 31 + var1) * 31 + var7) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var6: java.lang.String = this.id;
      val var7: java.lang.String = this.errorText;
      val var9: java.util.List = this.components;
      val var4: Int = this.accentColor;
      val var2: Boolean = this.isSpoiler;
      val var3: java.lang.String = this.spoilerDescription;
      val var8: Int = this.themedBackgroundColor;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ContainerComponent(type=");
      var5.append(var1);
      var5.append(", id=");
      var5.append(var6);
      var5.append(", errorText=");
      var5.append(var7);
      var5.append(", components=");
      var5.append(var9);
      var5.append(", accentColor=");
      var5.append(var4);
      var5.append(", isSpoiler=");
      var5.append(var2);
      var5.append(", spoilerDescription=");
      var5.append(var3);
      var5.append(", themedBackgroundColor=");
      var5.append(var8);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContainerComponent> {
         return ContainerComponent.$serializer.INSTANCE;
      }
   }
}
