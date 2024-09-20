package com.discord.serialization

import hl.g
import hl.e.f
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import zh.a

public open class IntEnumSerializer<T extends IntEnum>(type: KClass<Any>, default: Any? = ...) : KSerializer {
   private final val choices: Array<Any>
   private final val choicesNumbers: Array<Int>
   public final val default: Any?
   public open val descriptor: SerialDescriptor
   private final val serialName: String

   init {
      q.h(var1, "type");
      super();
      this.default = (T)var2;
      val var8: java.lang.String = var1.i();
      q.e(var8);
      this.serialName = var8;
      val var5: Array<Any> = a.b(var1).getEnumConstants();
      q.e(var5);
      val var6: Array<IntEnum> = var5 as Array<IntEnum>;
      this.choices = (T[])var5;
      val var9: ArrayList = new ArrayList((var5 as Array<IntEnum>).length);
      val var4: Int = var6.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var9.add(var6[var3].getSerialNumber());
      }

      val var7: Array<Int> = var9.toArray(new Integer[0]);
      this.choicesNumbers = var7;
      this.descriptor = g.a(this.serialName, f.a);
      if (var7.length == this.choices.length) {
         if (c.A(var7).size() != var7.length) {
            throw new IllegalArgumentException("There must be no duplicates of serial numbers.".toString());
         }
      } else {
         throw new IllegalArgumentException("There must be exactly one serial number for every enum constant.".toString());
      }
   }

   public fun deserialize(decoder: Decoder): Any {
      q.h(var1, "decoder");
      var var3: Int = var1.j();
      val var2: Int = c.R(this.choicesNumbers, var3);
      if ((var2 == -1 || var2 < 0 || var2 >= this.choices.length) && this.default != null) {
         return this.default;
      } else if (var2 != -1) {
         if (var2 >= 0 && var2 < this.choices.length) {
            val var9: IntEnum = this.choices[var2];
            q.g(this.choices[var2], "get(...)");
            return (T)var9;
         } else {
            val var11: java.lang.String = this.serialName;
            var3 = this.choices.length;
            val var8: StringBuilder = new StringBuilder();
            var8.append(var2);
            var8.append(" is not among valid ");
            var8.append(var11);
            var8.append(" choices, choices size is ");
            var8.append(var3);
            throw new IllegalStateException(var8.toString().toString());
         }
      } else {
         val var4: java.lang.String = this.serialName;
         val var6: StringBuilder = new StringBuilder();
         var6.append(var3);
         var6.append(" is not a valid serial value of ");
         var6.append(var4);
         throw new IllegalStateException(var6.toString().toString());
      }
   }

   public fun serialize(encoder: Encoder, value: Any) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      val var3: Int = c.R(this.choices, var2);
      if (var3 == -1 && this.default != null) {
         var1.x(this.default.getSerialNumber());
         return;
      } else if (var3 != -1) {
         var1.x(this.choicesNumbers[var3]);
      } else {
         val var5: java.lang.String = this.serialName;
         val var6: Array<IntEnum> = this.choices;
         val var7: StringBuilder = new StringBuilder();
         var7.append(var2);
         var7.append(" is not a valid enum ");
         var7.append(var5);
         var7.append(", choices are ");
         var7.append(var6);
         throw new IllegalStateException(var7.toString().toString());
      }
   }
}
