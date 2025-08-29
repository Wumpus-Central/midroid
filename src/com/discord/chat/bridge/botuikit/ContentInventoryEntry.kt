package com.discord.chat.bridge.botuikit

import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class ContentInventoryEntry(authorId: UserId,
   contentId: String,
   imageUrl: String,
   imageClickable: ContentInventoryEntryClickable? = ...,
   avatarUrl: String,
   platformIconUrl: String? = ...,
   platformClickable: ContentInventoryEntryClickable? = ...,
   userActionDescription: String,
   userClickable: ContentInventoryEntryClickable? = ...,
   title: String,
   titleClickable: ContentInventoryEntryClickable? = ...,
   subtitles: List<Subtitle>,
   gradientColors: List<GradientColor>,
   clickable: ContentInventoryEntryClickable? = ...
) : ContentInventoryEntry(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15) {
   public final val authorId: UserId
   public final val contentId: String
   public final val imageUrl: String
   public final val imageClickable: ContentInventoryEntryClickable?
   public final val avatarUrl: String
   public final val platformIconUrl: String?
   public final val platformClickable: ContentInventoryEntryClickable?
   public final val userActionDescription: String
   public final val userClickable: ContentInventoryEntryClickable?
   public final val title: String
   public final val titleClickable: ContentInventoryEntryClickable?
   public final val subtitles: List<Subtitle>
   public final val gradientColors: List<GradientColor>
   public final val clickable: ContentInventoryEntryClickable?

   public final val subtitle: Subtitle?
      public final get() {
         return CollectionsKt.j0(this.subtitles, 0) as Subtitle;
      }


   fun ContentInventoryEntry(
      var1: Long,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: ContentInventoryEntryClickable,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: ContentInventoryEntryClickable,
      var9: java.lang.String,
      var10: ContentInventoryEntryClickable,
      var11: java.lang.String,
      var12: ContentInventoryEntryClickable,
      var13: MutableList<Subtitle>,
      var14: MutableList<GradientColor>,
      var15: ContentInventoryEntryClickable
   ) {
      super();
      this.authorId = var1;
      this.contentId = var3;
      this.imageUrl = var4;
      this.imageClickable = var5;
      this.avatarUrl = var6;
      this.platformIconUrl = var7;
      this.platformClickable = var8;
      this.userActionDescription = var9;
      this.userClickable = var10;
      this.title = var11;
      this.titleClickable = var12;
      this.subtitles = var13;
      this.gradientColors = var14;
      this.clickable = var15;
   }

   public operator fun component1(): UserId {
      return this.authorId;
   }

   public operator fun component10(): String {
      return this.title;
   }

   public operator fun component11(): ContentInventoryEntryClickable? {
      return this.titleClickable;
   }

   public operator fun component12(): List<Subtitle> {
      return this.subtitles;
   }

   public operator fun component13(): List<GradientColor> {
      return this.gradientColors;
   }

   public operator fun component14(): ContentInventoryEntryClickable? {
      return this.clickable;
   }

   public operator fun component2(): String {
      return this.contentId;
   }

   public operator fun component3(): String {
      return this.imageUrl;
   }

   public operator fun component4(): ContentInventoryEntryClickable? {
      return this.imageClickable;
   }

   public operator fun component5(): String {
      return this.avatarUrl;
   }

   public operator fun component6(): String? {
      return this.platformIconUrl;
   }

   public operator fun component7(): ContentInventoryEntryClickable? {
      return this.platformClickable;
   }

   public operator fun component8(): String {
      return this.userActionDescription;
   }

   public operator fun component9(): ContentInventoryEntryClickable? {
      return this.userClickable;
   }

   public fun copy(
      authorId: UserId = ...,
      contentId: String = ...,
      imageUrl: String = ...,
      imageClickable: ContentInventoryEntryClickable? = ...,
      avatarUrl: String = ...,
      platformIconUrl: String? = ...,
      platformClickable: ContentInventoryEntryClickable? = ...,
      userActionDescription: String = ...,
      userClickable: ContentInventoryEntryClickable? = ...,
      title: String = ...,
      titleClickable: ContentInventoryEntryClickable? = ...,
      subtitles: List<Subtitle> = ...,
      gradientColors: List<GradientColor> = ...,
      clickable: ContentInventoryEntryClickable? = ...
   ): ContentInventoryEntry {
      return new ContentInventoryEntry(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntry) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.authorId, var1.authorId)) {
            return false;
         } else if (!(this.contentId == var1.contentId)) {
            return false;
         } else if (!(this.imageUrl == var1.imageUrl)) {
            return false;
         } else if (!(this.imageClickable == var1.imageClickable)) {
            return false;
         } else if (!(this.avatarUrl == var1.avatarUrl)) {
            return false;
         } else if (!(this.platformIconUrl == var1.platformIconUrl)) {
            return false;
         } else if (!(this.platformClickable == var1.platformClickable)) {
            return false;
         } else if (!(this.userActionDescription == var1.userActionDescription)) {
            return false;
         } else if (!(this.userClickable == var1.userClickable)) {
            return false;
         } else if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.titleClickable == var1.titleClickable)) {
            return false;
         } else if (!(this.subtitles == var1.subtitles)) {
            return false;
         } else if (!(this.gradientColors == var1.gradientColors)) {
            return false;
         } else {
            return this.clickable == var1.clickable;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = UserId.hashCode-impl(this.authorId);
      val var8: Int = this.contentId.hashCode();
      val var9: Int = this.imageUrl.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.imageClickable == null) {
         var1 = 0;
      } else {
         var1 = this.imageClickable.hashCode();
      }

      val var10: Int = this.avatarUrl.hashCode();
      val var2: Int;
      if (this.platformIconUrl == null) {
         var2 = 0;
      } else {
         var2 = this.platformIconUrl.hashCode();
      }

      val var3: Int;
      if (this.platformClickable == null) {
         var3 = 0;
      } else {
         var3 = this.platformClickable.hashCode();
      }

      val var11: Int = this.userActionDescription.hashCode();
      val var4: Int;
      if (this.userClickable == null) {
         var4 = 0;
      } else {
         var4 = this.userClickable.hashCode();
      }

      val var12: Int = this.title.hashCode();
      val var5: Int;
      if (this.titleClickable == null) {
         var5 = 0;
      } else {
         var5 = this.titleClickable.hashCode();
      }

      val var13: Int = this.subtitles.hashCode();
      val var14: Int = this.gradientColors.hashCode();
      if (this.clickable != null) {
         var6 = this.clickable.hashCode();
      }

      return (
               (
                        (
                                 (
                                          ((((((((var7 * 31 + var8) * 31 + var9) * 31 + var1) * 31 + var10) * 31 + var2) * 31 + var3) * 31 + var11) * 31 + var4)
                                                * 31
                                             + var12
                                       )
                                       * 31
                                    + var5
                              )
                              * 31
                           + var13
                     )
                     * 31
                  + var14
            )
            * 31
         + var6;
   }

   public override fun toString(): String {
      val var10: java.lang.String = UserId.toString-impl(this.authorId);
      val var12: java.lang.String = this.contentId;
      val var13: java.lang.String = this.imageUrl;
      val var5: ContentInventoryEntryClickable = this.imageClickable;
      val var14: java.lang.String = this.avatarUrl;
      val var15: java.lang.String = this.platformIconUrl;
      val var2: ContentInventoryEntryClickable = this.platformClickable;
      val var6: java.lang.String = this.userActionDescription;
      val var1: ContentInventoryEntryClickable = this.userClickable;
      val var3: java.lang.String = this.title;
      val var8: ContentInventoryEntryClickable = this.titleClickable;
      val var7: java.util.List = this.subtitles;
      val var11: java.util.List = this.gradientColors;
      val var9: ContentInventoryEntryClickable = this.clickable;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ContentInventoryEntry(authorId=");
      var4.append(var10);
      var4.append(", contentId=");
      var4.append(var12);
      var4.append(", imageUrl=");
      var4.append(var13);
      var4.append(", imageClickable=");
      var4.append(var5);
      var4.append(", avatarUrl=");
      var4.append(var14);
      var4.append(", platformIconUrl=");
      var4.append(var15);
      var4.append(", platformClickable=");
      var4.append(var2);
      var4.append(", userActionDescription=");
      var4.append(var6);
      var4.append(", userClickable=");
      var4.append(var1);
      var4.append(", title=");
      var4.append(var3);
      var4.append(", titleClickable=");
      var4.append(var8);
      var4.append(", subtitles=");
      var4.append(var7);
      var4.append(", gradientColors=");
      var4.append(var11);
      var4.append(", clickable=");
      var4.append(var9);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntry> {
         return ContentInventoryEntry.$serializer.INSTANCE;
      }
   }
}
