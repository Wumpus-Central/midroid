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
import fh.p
import java.util.ArrayList
import java.util.HashSet
import kotlin.jvm.internal.r

internal object EmojiPickerItemDataCoreDataDeserializer {
   private fun deserializeRowSize(data: ReadableMap): Int {
      val var3: Int = var1.getInt("rowSize");
      val var2: Boolean;
      if (var3 > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         return var3;
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   private fun deserializeTypeEmojiRowSlim(emojisRow: ReadableArray, emojiItems: MutableList<EmojiPickerItem>, isSectionNitroLocked: Boolean) {
      val var5: java.util.Iterator = NativeArrayExtensionsKt.sizeRange(var1).iterator();

      while (var5.hasNext()) {
         val var8: ReadableMap = var1.getMap((var5 as p).nextInt());
         r.g(var8, "emojisRow.getMap(emojisRowIndex)");
         val var6: java.lang.String = var8.getString("id");
         val var7: java.lang.String = NativeMapExtensionsKt.getNonNullString(var8, "name");
         val var4: Boolean = NativeMapExtensionsKt.getBoolean(var8, "animated", false);
         if (var6 == null) {
            var2.add(
               new EmojiPickerItem.Emoji(
                  IdUtilsKt.convertToId(var7),
                  var7,
                  var4,
                  null,
                  new UnicodeEmojis.Emoji(h.d(var7), NativeMapExtensionsKt.getNonNullString(var8, "surrogates")),
                  false,
                  40,
                  null
               )
            );
         } else {
            var2.add(
               new EmojiPickerItem.Emoji(
                  java.lang.Long.parseLong(var6),
                  var7,
                  var4,
                  EmojiPickerItem.Emoji.DisabledType.Companion.create(NativeMapExtensionsKt.getBoolean(var8, "disabled", false), var3),
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
      val var5: java.util.Iterator = var2.iterator();

      var var4: Any;
      do {
         if (!var5.hasNext()) {
            var4 = null;
            break;
         }

         var4 = var5.next();
      } while (!((EmojiPickerItem)var4 instanceof EmojiPickerItem.FooterUpsell));

      val var3: Boolean;
      if (var4 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         var2.add(h.k(var2), new EmojiPickerItem.FooterUpsell(NativeMapExtensionsKt.getNonNullString(var1, "id")));
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
         val var9: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var1, "emojisDisabled");
         val var10: HashSet = new HashSet();
         val var7: java.util.Iterator = NativeArrayExtensionsKt.sizeRange(var9).iterator();

         while (var7.hasNext()) {
            val var8: java.lang.String = var9.getString((var7 as p).nextInt());
            r.g(var8, "emojisDisabledArray.getString(index)");
            var10.add(java.lang.Long.parseLong(var8));
         }

         var2.add(
            new EmojiPickerItemData.CoreData.NativeSection.Guild(
               var6, var11, var5, var10, var4, var1.getBoolean("hasPremiumInlineRoadblockHeader"), var1.getBoolean("hasPremiumInlineRoadblockFooter")
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
      r.h(var1, "<this>");
      r.h(var2, "data");
      val var16: EmojiPickerItem.Spacer = new EmojiPickerItem.Spacer("top", SizeUtilsKt.getDpToPx(var4));
      val var8: EmojiPickerItem.Spacer = new EmojiPickerItem.Spacer("bottom", SizeUtilsKt.getDpToPx(var3));
      val var17: java.util.List = h.o(var16);
      val var9: java.util.List = h.o(var8);
      val var12: ArrayList = new ArrayList();
      val var10: ArrayList = new ArrayList();
      val var19: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var2, "data");
      val var11: java.util.Iterator = NativeArrayExtensionsKt.sizeRange(var19).iterator();
      var var6: Boolean = false;

      while (var11.hasNext()) {
         val var13: ReadableMap = var19.getMap((var11 as p).nextInt());
         r.g(var13, "dataRaw.getMap(index)");
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
                     INSTANCE.deserializeTypeFooterUpsell(var13, var9);
                  }
               } else {
                  val var23: EmojiPickerItemDataCoreDataDeserializer = INSTANCE;
                  val var18: Boolean = var13.getBoolean("isSectionNitroLocked");
                  if (!var6 && !var18) {
                     var6 = false;
                  } else {
                     var6 = true;
                  }

                  var23.deserializeTypeNativeSection(var13, var12, var10, var18);
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
         this.deserializeRowSize(var2), var2.getBoolean("hasGuildData"), var2.getBoolean("hasSearchData"), var6, var17, var9, var12, var10
      );
   }

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;

      @JvmStatic
      fun {
         val var0: IntArray = new int[EmojiPickerItemTypes.values().length];

         try {
            var0[EmojiPickerItemTypes.TITLE.ordinal()] = 1;
         } catch (var5: NoSuchFieldError) {
         }

         try {
            var0[EmojiPickerItemTypes.EMOJI_ROW_SLIM.ordinal()] = 2;
         } catch (var4: NoSuchFieldError) {
         }

         try {
            var0[EmojiPickerItemTypes.NATIVE_SECTION.ordinal()] = 3;
         } catch (var3: NoSuchFieldError) {
         }

         try {
            var0[EmojiPickerItemTypes.FOOTER_UPSELL.ordinal()] = 4;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
