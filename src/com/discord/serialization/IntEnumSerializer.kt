package com.discord.serialization

import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import vt.a
import zu.j
import zu.e.f

@SourceDebugExtension(["SMAP\nIntEnumSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntEnumSerializer.kt\ncom/discord/serialization/IntEnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n11165#2:65\n11500#2,3:66\n37#3,2:69\n1#4:71\n*S KotlinDebug\n*F\n+ 1 IntEnumSerializer.kt\ncom/discord/serialization/IntEnumSerializer\n*L\n17#1:65\n17#1:66,3\n17#1:69,2\n*E\n"])
public open class IntEnumSerializer<T extends IntEnum>(type: KClass<Any>, default: Any? = ...) : KSerializer {
   public final val default: Any?
   private final val serialName: String
   private final val choices: Array<Any>
   private final val choicesNumbers: Array<Int>
   public open val descriptor: SerialDescriptor

   init {
      this.default = (T)var2;
      val var8: java.lang.String = var1.getSimpleName();
      this.serialName = var8;
      val var5: Array<Any> = a.b(var1).getEnumConstants();
      val var6: Array<IntEnum> = var5 as Array<IntEnum>;
      this.choices = (T[])var5;
      val var9: ArrayList = new ArrayList((var5 as Array<IntEnum>).length);
      val var4: Int = var6.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var9.add(var6[var3].getSerialNumber());
      }

      val var7: Array<Int> = var9.toArray(new Integer[0]);
      this.choicesNumbers = var7;
      this.descriptor = j.b(this.serialName, f.a);
      if (var7.length == this.choices.length) {
         if (m.S(var7).size() != var7.length) {
            throw new IllegalArgumentException("There must be no duplicates of serial numbers.");
         }
      } else {
         throw new IllegalArgumentException("There must be exactly one serial number for every enum constant.");
      }
   }

   public fun deserialize(decoder: Decoder): Any {
      var var3: Int = var1.h();
      val var2: Int = m.k0(this.choicesNumbers, var3);
      if ((var2 == -1 || var2 < 0 || var2 >= this.choices.length) && this.default != null) {
         return this.default;
      } else if (var2 != -1) {
         if (var2 >= 0 && var2 < this.choices.length) {
            val var9: IntEnum = this.choices[var2];
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
      val var3: Int = m.k0(this.choices, var2);
      if (var3 == -1 && this.default != null) {
         var1.B(this.default.getSerialNumber());
         return;
      } else if (var3 != -1) {
         var1.B(this.choicesNumbers[var3]);
      } else {
         val var7: java.lang.String = this.serialName;
         val var6: Array<IntEnum> = this.choices;
         val var5: StringBuilder = new StringBuilder();
         var5.append(var2);
         var5.append(" is not a valid enum ");
         var5.append(var7);
         var5.append(", choices are ");
         var5.append(var6);
         throw new IllegalStateException(var5.toString().toString());
      }
   }
}
