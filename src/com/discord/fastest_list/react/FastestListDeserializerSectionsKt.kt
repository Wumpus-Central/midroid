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
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.IntRef

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
      var6 = SizeUtilsKt.getDpToPx(var5.getInt(var2));
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
      var6 = SizeUtilsKt.getDpToPx(var5.getInt(var2));
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
      var8 = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(var7.getMap(var2), "sizes").getInt(var4));
   }

   val var14: java.lang.String;
   if (!var1) {
      var14 = NativeMapExtensionsKt.getNonNullArray(var5.getMap(var2), "keys").getString(var4);
   } else {
      var14 = null;
   }

   var0 = FastestListSections.Entry.SectionItem.Companion.createKey(var0, var2, var4, var14);
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
   q.h(var0, "<this>");
   q.h(var1, "value");
   val var20: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listId");
   val var5: Boolean = var1.getBoolean("keysAreUniform");
   val var14: ArrayList = new ArrayList();
   val var19: IntRef = new IntRef();
   val var11: ArrayList = new ArrayList();
   val var18: java.util.List = NativeArrayExtensionsKt.toIntList(NativeMapExtensionsKt.getNonNullArray(var1, "sections"));
   val var15: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "sectionsId");
   val var17: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "itemKeys");
   val var10: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "itemSizes");
   val var6: Int;
   if (var1.getBoolean("itemSizeIsUniform")) {
      var6 = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(var10.getMap(0), "sizes").getInt(0));
   } else {
      var6 = null;
   }

   val var21: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionHeaderKeys");
   val var12: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionHeaderSizes");
   val var7: Int;
   if (var1.getBoolean("sectionHeaderSizeIsUniform")) {
      var7 = SizeUtilsKt.getDpToPx(var12.getInt(0));
   } else {
      var7 = null;
   }

   val var22: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionFooterKeys");
   val var13: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionFooterSizes");
   val var8: Int;
   if (var1.getBoolean("sectionFooterSizeIsUniform")) {
      var8 = SizeUtilsKt.getDpToPx(var13.getInt(0));
   } else {
      var8 = null;
   }

   val var23: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listHeaderKey");
   var var2: Int = SizeUtilsKt.getDpToPx(var1.getInt("listHeaderSize"));
   val var24: FastestListSections.Entry.ListHeader;
   if (var2 > 0) {
      var24 = new FastestListSections.Entry.ListHeader(
         FastestListSections.Entry.ListHeader.Companion.createKey(var20, var23), FastestListSections.Section.constructor-impl(0), var2, null
      );
   } else {
      var24 = null;
   }

   val var9: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listFooterKey");
   var2 = SizeUtilsKt.getDpToPx(var1.getInt("listFooterSize"));
   val var28: FastestListSections.Entry.ListFooter;
   if (var2 > 0) {
      var28 = new FastestListSections.Entry.ListFooter(
         FastestListSections.Entry.ListFooter.Companion.createKey(var20, var9),
         FastestListSections.Section.constructor-impl(Math.max(0, i.m(var18))),
         var2,
         null
      );
   } else {
      var28 = null;
   }

   val var16: Function1 = new Function1(var11, var14, var19) {
      final java.util.List<FastestListSections.Entry> $sectionEntries;
      final java.util.List<Integer> $sectionOffsetAtPosition;
      final IntRef $sectionsCumulativeSize;

      {
         super(1);
         this.$sectionEntries = var1;
         this.$sectionOffsetAtPosition = var2;
         this.$sectionsCumulativeSize = var3;
      }

      public final void invoke(FastestListSections.Entry var1) {
         if (var1 != null) {
            this.$sectionEntries.add(var1);
            this.$sectionOffsetAtPosition.add(this.$sectionsCumulativeSize.j);
            this.$sectionsCumulativeSize.j = this.$sectionsCumulativeSize.j + var1.getSize();
         }
      }
   };
   var2 = 0;
   val var29: Function1 = var16;

   while (var2 <= i.m(var18)) {
      if (var2 == 0) {
         var29.invoke(var24);
      }

      val var4: Int = (var18.get(var2) as java.lang.Number).intValue();
      if (var4 == 0) {
         if (var2 == i.m(var18)) {
            var29.invoke(var28);
         }

         var2++;
      } else {
         var29.invoke(createSectionHeader(var20, var5, var2, var21, var7, var12));

         var var3: Int;
         for (var3 = 0; var3 < var4; var3++) {
            var29.invoke(createSectionItem(var20, var5, var2, var4, var3, var17, var6, var10));
         }

         if (var3 == var4) {
            var29.invoke(createSectionFooter(var20, var5, var2, var22, var8, var13));
            if (var2 == i.m(var18)) {
               var29.invoke(var28);
            }
         }

         var2++;
      }
   }

   return new FastestListSections.Versioned(var15, var11, var19.j, var14);
}
