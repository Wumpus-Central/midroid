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
import kotlin.jvm.internal.r
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
      val var16: ReadableMap = var7.getMap(var2);
      r.g(var16, "itemSizes.getMap(sectionIndex)");
      var8 = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(var16, "sizes").getInt(var4));
   }

   val var15: java.lang.String;
   if (!var1) {
      val var14: ReadableMap = var5.getMap(var2);
      r.g(var14, "itemKeys.getMap(sectionIndex)");
      var15 = NativeMapExtensionsKt.getNonNullArray(var14, "keys").getString(var4);
   } else {
      var15 = null;
   }

   var0 = FastestListSections.Entry.SectionItem.Companion.createKey(var0, var2, var4, var15);
   var2 = FastestListSections.Section.constructor-impl(var2);
   val var9: Int = FastestListSections.Item.constructor-impl(var4);
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

   return new FastestListSections.Entry.SectionItem(var0, var2, var9, var8, var1, var10, null);
}

internal operator fun Companion.invoke(value: ReadableMap): Versioned {
   r.h(var0, "<this>");
   r.h(var1, "value");
   val var18: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listId");
   val var6: Boolean = var1.getBoolean("keysAreUniform");
   val var15: ArrayList = new ArrayList();
   val var19: IntRef = new IntRef();
   val var12: ArrayList = new ArrayList();
   val var20: java.util.List = NativeArrayExtensionsKt.toIntList(NativeMapExtensionsKt.getNonNullArray(var1, "sections"));
   val var16: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "sectionsId");
   val var21: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "itemKeys");
   val var11: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "itemSizes");
   val var7: Int;
   if (var1.getBoolean("itemSizeIsUniform")) {
      val var24: ReadableMap = var11.getMap(0);
      r.g(var24, "itemSizes.getMap(0)");
      var7 = SizeUtilsKt.getDpToPx(NativeMapExtensionsKt.getNonNullArray(var24, "sizes").getInt(0));
   } else {
      var7 = null;
   }

   val var22: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionHeaderKeys");
   val var13: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionHeaderSizes");
   val var8: Int;
   if (var1.getBoolean("sectionHeaderSizeIsUniform")) {
      var8 = SizeUtilsKt.getDpToPx(var13.getInt(0));
   } else {
      var8 = null;
   }

   val var23: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionFooterKeys");
   val var14: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "sectionFooterSizes");
   val var9: Int;
   if (var1.getBoolean("sectionFooterSizeIsUniform")) {
      var9 = SizeUtilsKt.getDpToPx(var14.getInt(0));
   } else {
      var9 = null;
   }

   val var25: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listHeaderKey");
   var var2: Int = SizeUtilsKt.getDpToPx(var1.getInt("listHeaderSize"));
   val var26: FastestListSections.Entry.ListHeader;
   if (var2 > 0) {
      var26 = new FastestListSections.Entry.ListHeader(
         FastestListSections.Entry.ListHeader.Companion.createKey(var18, var25), FastestListSections.Section.constructor-impl(0), var2, null
      );
   } else {
      var26 = null;
   }

   val var10: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "listFooterKey");
   var2 = SizeUtilsKt.getDpToPx(var1.getInt("listFooterSize"));
   val var30: FastestListSections.Entry.ListFooter;
   if (var2 > 0) {
      var30 = new FastestListSections.Entry.ListFooter(
         FastestListSections.Entry.ListFooter.Companion.createKey(var18, var10),
         FastestListSections.Section.constructor-impl(Math.max(0, h.k(var20))),
         var2,
         null
      );
   } else {
      var30 = null;
   }

   val var17: Function1 = new Function1<FastestListSections.Entry, Unit>(var12, var15, var19) {
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
   val var31: Function1 = var17;

   while (var2 <= h.k(var20)) {
      if (var2 == 0) {
         var31.invoke(var26);
      }

      val var4: Int = (var20.get(var2) as java.lang.Number).intValue();
      if (var4 == 0) {
         var2++;
      } else {
         var31.invoke(createSectionHeader(var18, var6, var2, var22, var8, var13));

         var var3: Int;
         for (var3 = 0; var3 < var4; var3++) {
            var31.invoke(createSectionItem(var18, var6, var2, var4, var3, var21, var7, var11));
         }

         if (var3 == var4) {
            var31.invoke(createSectionFooter(var18, var6, var2, var23, var9, var14));
            if (var2 == h.k(var20)) {
               var31.invoke(var30);
            }
         }

         var2++;
      }
   }

   return new FastestListSections.Versioned(var16, var12, var19.j, var15);
}
