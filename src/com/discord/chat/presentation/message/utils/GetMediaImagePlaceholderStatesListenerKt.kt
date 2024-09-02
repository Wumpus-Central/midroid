package com.discord.chat.presentation.message.utils

import android.graphics.drawable.ColorDrawable
import com.discord.image.fresco.listeners.CompoundControllerListener
import com.discord.image.fresco.listeners.ControllerListener
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManager
import com.discord.theme.ThemeManagerKt
import com.discord.thumbhash.ThumbhashPlaceholderControllerListener
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

public fun getMediaImagePlaceholderStatesListener(imageView: SimpleDraweeView, placeholder: String?, placeholderVersion: Int?): CompoundControllerListener {
   q.h(var0, "imageView");
   return new CompoundControllerListener(
      new ThumbhashPlaceholderControllerListener(var0, new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondary()), var1, var2),
      new ControllerListener(var0) {
         final SimpleDraweeView $imageView;
         private final ScaleType imageViewInitialScaleType;

         {
            this.$imageView = var1;
            this.imageViewInitialScaleType = (var1.getHierarchy() as GenericDraweeHierarchy).n();
         }

         @Override
         public void onFailure(java.lang.String var1, java.lang.Throwable var2) {
            (this.$imageView.getHierarchy() as GenericDraweeHierarchy).u(ScaleType.e);
            val var4: SimpleDraweeView = this.$imageView;
            val var3: ReactAsset;
            if (ThemeManager.INSTANCE.isThemeDark()) {
               var3 = ReactAsset.PoopDark;
            } else {
               var3 = ReactAsset.PoopLight;
            }

            ReactAssetUtilsKt.setReactAsset(var4, var3);
         }

         @Override
         public void onSubmit(java.lang.String var1, Object var2) {
            (this.$imageView.getHierarchy() as GenericDraweeHierarchy).u(this.imageViewInitialScaleType);
         }
      }
   );
}
