package com.discord.chat.bridge.polls

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class PollAction(label: String,
   presentation: PollActionPresentation,
   enabled: Boolean,
   type: String? = null,
   secondaryLabel: String? = null,
   accessibilityHint: String? = null
) {
   public final val label: String
   public final val presentation: PollActionPresentation
   public final val enabled: Boolean
   public final val type: String?
   public final val secondaryLabel: String?
   public final val accessibilityHint: String?

   init {
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
      return new PollAction(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAction) {
         return false;
      } else {
         var1 = var1;
         if (!(this.label == var1.label)) {
            return false;
         } else if (this.presentation != var1.presentation) {
            return false;
         } else if (this.enabled != var1.enabled) {
            return false;
         } else if (!(this.type == var1.type)) {
            return false;
         } else if (!(this.secondaryLabel == var1.secondaryLabel)) {
            return false;
         } else {
            return this.accessibilityHint == var1.accessibilityHint;
         }
      }
   }

   public fun getFullTextLabel(): String {
      val var3: java.lang.String = this.secondaryLabel;
      if (this.secondaryLabel == null) {
         return this.label;
      } else {
         val var1: java.lang.String = this.label;
         val var2: StringBuilder = new StringBuilder();
         var2.append(var1);
         var2.append("  •  ");
         var2.append(var3);
         return var2.toString();
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.label.hashCode();
      val var6: Int = this.presentation.hashCode();
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

      return ((((var4 * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.label;
      val var5: PollActionPresentation = this.presentation;
      val var1: Boolean = this.enabled;
      val var3: java.lang.String = this.type;
      val var4: java.lang.String = this.secondaryLabel;
      val var6: java.lang.String = this.accessibilityHint;
      val var7: StringBuilder = new StringBuilder();
      var7.append("PollAction(label=");
      var7.append(var2);
      var7.append(", presentation=");
      var7.append(var5);
      var7.append(", enabled=");
      var7.append(var1);
      var7.append(", type=");
      var7.append(var3);
      var7.append(", secondaryLabel=");
      var7.append(var4);
      var7.append(", accessibilityHint=");
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollAction> {
         return PollAction.$serializer.INSTANCE;
      }
   }
}
