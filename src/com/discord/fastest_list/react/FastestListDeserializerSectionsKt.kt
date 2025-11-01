package com.discord.fastest_list.react

import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Versioned
import com.discord.fastest_list.android.FastestListSections.Entry.SectionFooter
import com.discord.fastest_list.android.FastestListSections.Entry.SectionHeader
import com.discord.fastest_list.android.FastestListSections.Entry.SectionItem
import com.discord.fastest_list.android.FastestListSections.Versioned.Companion
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.Ref.IntRef

@JvmSynthetic
fun a(var0: java.util.List, var1: java.util.List, var2: IntRef, var3: FastestListSections.Entry): Unit {
   return invoke$lambda$0(var0, var1, var2, var3);
}

private fun createSectionFooter(
   listId: String,
   keysAreUniform: Boolean,
   sectionIndex: Int,
   sectionFooterKeys: ReadableArray,
   sectionFooterSizeUniform: Int?,
   sectionFooterSizes: ReadableArray
): SectionFooter? {
   val var6: Int;
   if (var4 != null) {
      var6 = var4;
   } else {
      var6 = SizeUtilsKt.getDpToPx(var5.getDouble(var2));
   }

   if (var6 > 0) {
      val var7: java.lang.String;
      if (!var1) {
         var7 = var3.getString(var2);
      } else {
         var7 = null;
      }

      return new FastestListSections.Entry.SectionFooter(
         FastestListSections.Entry.SectionFooter.Companion.createKey(var0, var2, var7), FastestListSections.Section.constructor-impl(var2), var6, null
      );
   } else {
      return null;
   }
}

private fun createSectionHeader(
   listId: String,
   keysAreUniform: Boolean,
   sectionIndex: Int,
   sectionHeaderKeys: ReadableArray,
   sectionHeaderSizeUniform: Int?,
   sectionHeaderSizes: ReadableArray
): SectionHeader? {
   val var6: Int;
   if (var4 != null) {
      var6 = var4;
   } else {
      var6 = SizeUtilsKt.getDpToPx(var5.getDouble(var2));
   }

   if (var6 > 0) {
      val var7: java.lang.String;
      if (!var1) {
         var7 = var3.getString(var2);
      } else {
         var7 = null;
      }

      return new FastestListSections.Entry.SectionHeader(
         FastestListSections.Entry.SectionHeader.Companion.createKey(var0, var2, var7), FastestListSections.Section.constructor-impl(var2), var6, null
      );
   } else {
      return null;
   }
}

private fun createSectionItem(
   listId: String,
   keysAreUniform: Boolean,
   sectionIndex: Int,
   sectionItemCount: Int,
   sectionItemIndex: Int,
   itemKeys: ReadableArray,
   itemSizeUniform: Int?,
   itemSizes: ReadableArray
): SectionItem {
   val var8: Int;
   if (var6 != null) {
      var8 = var6;
   } else {
      val var16: ReadableMap = var7.getMap(var2);
      var8 = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(var16, "sizes").getDouble(var4));
   }

   val var15: java.lang.String;
   if (!var1) {
      val var14: ReadableMap = var5.getMap(var2);
      var15 = NativeMapExtensionsKt.getNonNullArray(var14, "keys").getString(var4);
   } else {
      var15 = null;
   }

   var0 = FastestListSections.Entry.SectionItem.Companion.createKey(var0, var2, var4, var15);
   val var9: Int = FastestListSections.Section.constructor-impl(var2);
   var2 = FastestListSections.Item.constructor-impl(var4);
   if (var4 == 0) {
      var1 = true;
   } else {
      var1 = false;
   }

   val var10: Boolean;
   if (var4 == var3 - 1) {
      var10 = true;
   } else {
      var10 = false;
   }

   return new FastestListSections.Entry.SectionItem(var0, var9, var2, var8, var1, var10, null);
}

internal operator fun Companion.invoke(value: ReadableMap): Versioned {
   val var21: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listId");
   val var5: Boolean = var1.getBoolean("keysAreUniform");
   val var20: ArrayList = new ArrayList();
   val var19: IntRef = new IntRef();
   val var18: ArrayList = new ArrayList();
   val var16: java.util.List = NativeArrayExtensionsKt.toIntList(NativeMapExtensionsKt.getNonNullArray(var1, "sections"));
   val var22: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "sectionsId");
   var var10: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "itemKeys");
   val var14: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "itemSizes");
   val var25: Int;
   if (var1.getBoolean("itemSizeIsUniform")) {
      val var24: ReadableMap = var14.getMap(0);
      var25 = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(var24, "sizes").getDouble(0));
   } else {
      var25 = null;
   }

   val var12: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionHeaderKeys");
   val var11: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionHeaderSizes");
   val var8: Int;
   if (var1.getBoolean("sectionHeaderSizeIsUniform")) {
      var8 = SizeUtilsKt.getDpToPx(var11.getDouble(0));
   } else {
      var8 = null;
   }

   val var15: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionFooterKeys");
   val var23: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionFooterSizes");
   val var7: Int;
   if (var1.getBoolean("sectionFooterSizeIsUniform")) {
      var7 = SizeUtilsKt.getDpToPx(var23.getDouble(0));
   } else {
      var7 = null;
   }

   val var6: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listHeaderKey");
   var var2: Int = SizeUtilsKt.getDpToPx(var1.getDouble("listHeaderSize"));
   val var29: FastestListSections.Entry.ListHeader;
   if (var2 > 0) {
      var29 = new FastestListSections.Entry.ListHeader(
         FastestListSections.Entry.ListHeader.Companion.createKey(var21, var6), FastestListSections.Section.constructor-impl(0), var2, null
      );
   } else {
      var29 = null;
   }

   val var9: Int = var8;
   val var31: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listFooterKey");
   var2 = SizeUtilsKt.getDpToPx(var1.getDouble("listFooterSize"));
   val var32: FastestListSections.Entry.ListFooter;
   if (var2 > 0) {
      var32 = new FastestListSections.Entry.ListFooter(
         FastestListSections.Entry.ListFooter.Companion.createKey(var21, var31),
         FastestListSections.Section.constructor-impl(Math.max(0, CollectionsKt.n(var16))),
         var2,
         null
      );
   } else {
      var32 = null;
   }

   val var17: a = new a(var18, var20, var19);
   var2 = 0;
   val var26: ReadableArray = var10;
   val var13: Int = var7;
   val var30: java.util.List = var16;
   var10 = var14;
   val var34: a = var17;

   while (var2 <= CollectionsKt.n(var30)) {
      if (var2 == 0) {
         var34.invoke(var29);
      }

      val var3: Int = (var30.get(var2) as java.lang.Number).intValue();
      if (var3 == 0) {
         if (var2 == CollectionsKt.n(var30)) {
            var34.invoke(var32);
         }

         var2++;
      } else {
         var34.invoke(createSectionHeader(var21, var5, var2, var12, var9, var11));

         var var4: Int;
         for (var4 = 0; var4 < var3; var4++) {
            var34.invoke(createSectionItem(var21, var5, var2, var3, var4, var26, var25, var10));
         }

         if (var4 == var3) {
            var34.invoke(createSectionFooter(var21, var5, var2, var15, var13, var23));
            if (var2 == CollectionsKt.n(var30)) {
               var34.invoke(var32);
            }
         }

         var2++;
      }
   }

   return new FastestListSections.Versioned(var22, var18, var19.element, var20);
}

fun `invoke$lambda$0`(var0: java.util.List, var1: java.util.List, var2: IntRef, var3: FastestListSections.Entry): Unit {
   if (var3 != null) {
      var0.add(var3);
      var1.add(var2.element);
      var2.element = var2.element + var3.getSize();
   }

   return Unit.a;
}
