package com.discord.serialization

import java.util.ArrayList
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import ph.a
import wk.g
import wk.e.f

public open class IntEnumSerializer<T extends IntEnum>(type: KClass<Any>, default: Any? = ...) : KSerializer<T> {
   private final val choices: Array<Any>
   private final val choicesNumbers: Array<Int>
   public final val default: Any?
   public open val descriptor: SerialDescriptor
   private final val serialName: String

   init {
      r.h(var1, "type");
      super();
      this.default = (T)var2;
      val var9: java.lang.String = var1.o();
      r.e(var9);
      this.serialName = var9;
      val var6: Array<Any> = a.b(var1).getEnumConstants();
      r.e(var6);
      val var10: Array<IntEnum> = var6 as IntEnum[];
      this.choices = (T[])var6;
      val var7: ArrayList = new ArrayList((var6 as IntEnum[]).length);
      val var5: Int = var10.length;

      for (int var3 = 0; var3 < var5; var3++) {
         var7.add(var10[var3].getSerialNumber());
      }

      val var8: Array<Int> = var7.toArray(new Integer[0]);
      this.choicesNumbers = var8;
      this.descriptor = g.a(this.serialName, f.a);
      var var11: Boolean;
      if (var8.length == this.choices.length) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (var11) {
         var11 = false;
         if (b.A(var8).size() == var8.length) {
            var11 = true;
         }

         if (!var11) {
            throw new IllegalArgumentException("There must be no duplicates of serial numbers.".toString());
         }
      } else {
         throw new IllegalArgumentException("There must be exactly one serial number for every enum constant.".toString());
      }
   }

   public fun deserialize(decoder: Decoder): Any {
      var var4: Int;
      var var5: Int;
      label44: {
         r.h(var1, "decoder");
         var5 = var1.h();
         var4 = b.O(this.choicesNumbers, var5);
         if (var4 != -1) {
            val var2: Boolean;
            if (var4 >= 0 && var4 < this.choices.length) {
               var2 = true;
            } else {
               var2 = false;
            }

            if (var2) {
               break label44;
            }
         }

         if (this.default != null) {
            return this.default;
         }
      }

      var var11: Boolean;
      if (var4 != -1) {
         var11 = 1;
      } else {
         var11 = 0;
      }

      if (!var11) {
         val var10: java.lang.String = this.serialName;
         val var14: StringBuilder = new StringBuilder();
         var14.append(var5);
         var14.append(" is not a valid serial value of ");
         var14.append(var10);
         throw new IllegalStateException(var14.toString().toString());
      } else {
         if (var4 >= 0 && var4 < this.choices.length) {
            var11 = (boolean)1;
         } else {
            var11 = (boolean)0;
         }

         if (var11) {
            val var9: IntEnum = this.choices[var4];
            r.g(this.choices[var4], "choices[index]");
            return (T)var9;
         } else {
            val var8: java.lang.String = this.serialName;
            var11 = this.choices.length;
            val var6: StringBuilder = new StringBuilder();
            var6.append(var4);
            var6.append(" is not among valid ");
            var6.append(var8);
            var6.append(" choices, choices size is ");
            var6.append(var11);
            throw new IllegalStateException(var6.toString().toString());
         }
      }
   }

   public fun serialize(encoder: Encoder, value: Any) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      val var4: Int = b.O(this.choices, var2);
      if (var4 == -1 && this.default != null) {
         var1.B(this.default.getSerialNumber());
         return;
      } else {
         val var3: Boolean;
         if (var4 != -1) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            var1.B(this.choicesNumbers[var4]);
         } else {
            val var7: java.lang.String = this.serialName;
            val var8: Array<IntEnum> = this.choices;
            val var6: StringBuilder = new StringBuilder();
            var6.append(var2);
            var6.append(" is not a valid enum ");
            var6.append(var7);
            var6.append(", choices are ");
            var6.append(var8);
            throw new IllegalStateException(var6.toString().toString());
         }
      }
   }
}
