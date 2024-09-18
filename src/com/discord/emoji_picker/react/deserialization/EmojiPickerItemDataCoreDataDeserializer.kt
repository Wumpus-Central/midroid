package com.discord.emoji_picker.react.deserialization

import com.discord.emoji.UnicodeEmojis
import com.discord.emoji_picker.EmojiPickerItem
import com.discord.emoji_picker.EmojiPickerItemData
import com.discord.emoji_picker.EmojiPickerItemData.CoreData
import com.discord.emoji_picker.EmojiPickerItemData.CoreData.Companion
import com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Guild
import com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Unicode
import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import hh.o
import java.util.ArrayList
import java.util.HashSet
import kotlin.jvm.internal.q

internal object EmojiPickerItemDataCoreDataDeserializer {
   private fun deserializeRowSize(data: ReadableMap): Int {
      val var2: Int = var1.getInt("rowSize");
      if (var2 > 0) {
         return var2;
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   private fun deserializeTypeEmojiRowSlim(emojisRow: ReadableArray, emojiItems: MutableList<EmojiPickerItem>, isSectionNitroLocked: Boolean) {
      val var5: java.util.Iterator = NativeArrayExtensionsKt.sizeRange(var1).iterator();

      while (var5.hasNext()) {
         val var7: ReadableMap = var1.getMap((var5 as o).c());
         q.g(var7, "getMap(...)");
         val var6: java.lang.String = var7.getString("id");
         val var8: java.lang.String = NativeMapExtensionsKt.getNonNullString(var7, "name");
         val var4: Boolean = NativeMapExtensionsKt.getBoolean(var7, "animated", false);
         if (var6 == null) {
            var2.add(
               new EmojiPickerItem.Emoji(
                  IdUtilsKt.convertToId(var8),
                  var8,
                  var4,
                  null,
                  new UnicodeEmojis.Emoji(i.e(var8), NativeMapExtensionsKt.getNonNullString(var7, "surrogates")),
                  false,
                  40,
                  null
               )
            );
         } else {
            var2.add(
               new EmojiPickerItem.Emoji(
                  java.lang.Long.parseLong(var6),
                  var8,
                  var4,
                  EmojiPickerItem.Emoji.DisabledType.Companion.create(NativeMapExtensionsKt.getBoolean(var7, "disabled", false), var3),
                  null,
                  false,
                  48,
                  null
               )
            );
         }
      }
   }

   private fun deserializeTypeFooterUpsell(section: ReadableMap, trailing: MutableList<EmojiPickerItem>) {
      val var4: java.util.Iterator = var2.iterator();

      var var3: Any;
      do {
         if (!var4.hasNext()) {
            var3 = null;
            break;
         }

         var3 = var4.next();
      } while (!((EmojiPickerItem)var3 instanceof EmojiPickerItem.FooterUpsell));

      if (var3 == null) {
         var2.add(i.l(var2), new EmojiPickerItem.FooterUpsell(NativeMapExtensionsKt.getNonNullString(var1, "id")));
      } else {
         throw new IllegalArgumentException("Only one footer upsell is supported.".toString());
      }
   }

   private fun deserializeTypeNativeSection(
      emojiSection: ReadableMap,
      emojis: MutableList<Guild>,
      emojisUnicode: MutableList<Unicode>,
      isSectionNitroLocked: Boolean
   ) {
      val var6: java.lang.String = var1.getString("guildId");
      if (var6 != null) {
         val var11: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "title");
         val var5: Int = var1.getInt("emojiCount");
         val var7: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "emojisDisabled");
         val var8: HashSet = new HashSet();
         val var10: java.util.Iterator = NativeArrayExtensionsKt.sizeRange(var7).iterator();

         while (var10.hasNext()) {
            val var9: java.lang.String = var7.getString((var10 as o).c());
            q.g(var9, "getString(...)");
            var8.add(java.lang.Long.parseLong(var9));
         }

         var2.add(
            new EmojiPickerItemData.CoreData.NativeSection.Guild(
               var6, var11, var5, var8, var4, var1.getBoolean("hasPremiumInlineRoadblockHeader"), var1.getBoolean("hasPremiumInlineRoadblockFooter")
            )
         );
      } else {
         var3.add(new EmojiPickerItemData.CoreData.NativeSection.Unicode(NativeMapExtensionsKt.getNonNullString(var1, "title"), var1.getInt("emojiCount")));
      }
   }

   private fun deserializeTypeTitle(section: ReadableMap, leading: MutableList<EmojiPickerItem>) {
      var2.add(new EmojiPickerItem.Category(NativeMapExtensionsKt.getNonNullString(var1, "title"), 0L, false, 6, null));
   }

   public fun Companion.deserialize(data: ReadableMap, contentPaddingBottom: Float = 0.0F, contentPaddingTop: Float = 0.0F): CoreData {
      q.h(var1, "<this>");
      q.h(var2, "data");
      val var16: EmojiPickerItem.Spacer = new EmojiPickerItem.Spacer("top", SizeUtilsKt.getDpToPx(var4));
      val var8: EmojiPickerItem.Spacer = new EmojiPickerItem.Spacer("bottom", SizeUtilsKt.getDpToPx(var3));
      val var17: java.util.List = i.p(new EmojiPickerItem[]{var16});
      val var10: java.util.List = i.p(new EmojiPickerItem[]{var8});
      val var12: ArrayList = new ArrayList();
      val var19: ArrayList = new ArrayList();
      val var9: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var2, "data");
      val var11: java.util.Iterator = NativeArrayExtensionsKt.sizeRange(var9).iterator();
      var var6: Boolean = false;

      while (var11.hasNext()) {
         val var13: ReadableMap = var9.getMap((var11 as o).c());
         q.g(var13, "getMap(...)");
         val var14: EmojiPickerItemTypes = EmojiPickerItemTypes.Companion.create(var13.getInt("type"));
         val var5: Int = EmojiPickerItemDataCoreDataDeserializer.WhenMappings.$EnumSwitchMapping$0[var14.ordinal()];
         if (var5 != 1) {
            if (var5 != 2) {
               if (var5 != 3) {
                  if (var5 != 4) {
                     if (!var14.getNoop()) {
                        throw new IllegalArgumentException(var14.getUnsupported());
                     }
                  } else {
                     INSTANCE.deserializeTypeFooterUpsell(var13, var10);
                  }
               } else {
                  val var23: EmojiPickerItemDataCoreDataDeserializer = INSTANCE;
                  val var18: Boolean = var13.getBoolean("isSectionNitroLocked");
                  if (!var6 && !var18) {
                     var6 = false;
                  } else {
                     var6 = true;
                  }

                  var23.deserializeTypeNativeSection(var13, var12, var19, var18);
               }
            } else {
               val var21: EmojiPickerItemDataCoreDataDeserializer = INSTANCE;
               val var15: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var13, "emojis");
               val var7: Boolean = var13.getBoolean("isSectionNitroLocked");
               if (!var6 && !var7) {
                  var6 = false;
               } else {
                  var6 = true;
               }

               var21.deserializeTypeEmojiRowSlim(var15, var17, var7);
            }
         } else {
            INSTANCE.deserializeTypeTitle(var13, var17);
         }
      }

      return new EmojiPickerItemData.CoreData(
         this.deserializeRowSize(var2), var2.getBoolean("hasGuildData"), var2.getBoolean("hasSearchData"), var6, var17, var10, var12, var19
      );
   }
}
