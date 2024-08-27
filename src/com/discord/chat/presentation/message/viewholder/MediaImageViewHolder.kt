package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt

public open class MediaImageViewHolder(view: MediaImageView) : MessagePartViewHolder {
   private final val view: MediaImageView

   init {
      kotlin.jvm.internal.r.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(
      url: String,
      width: Int,
      height: Int,
      placeholder: String?,
      placeholderVersion: Int?,
      isSpoiler: Boolean,
      spoilerConfig: SpoilerConfig?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      showDescription: Boolean,
      description: String?,
      descriptionHint: String?,
      useNewAltTextButton: Boolean,
      onAltTextButtonClicked: ((String) -> Unit)?,
      radiusPx: Int,
      resizeMode: ResizeMode,
      isPartOfMosaic: Boolean,
      onClicked: OnClickListener?,
      onLongClicked: OnLongClickListener?,
      uploadItemProps: UploadItemProps?,
      accessibilityRole: String?,
      shouldAutoPlayGif: Boolean,
      filename: String?
   ) {
      kotlin.jvm.internal.r.h(var1, "url");
      kotlin.jvm.internal.r.h(var16, "resizeMode");
      this.view.setContent(var1, var2, var3, var16, var4, var5, var6, var7, var15, var20, var8, var9, var17, var22, var23);
      if (var18 != null) {
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.view, false, var18, 1, null);
      }

      if (var19 != null) {
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.view, false, var19, 1, null);
      }

      this.view.setDescription(var11, var12);
      if (var13 && var10) {
         var6 = true;
      } else {
         var6 = false;
      }

      this.view.showAltTextButton(var6, var11, var14);
      if (!var13 && var10) {
         var6 = true;
      } else {
         var6 = false;
      }

      this.view.showDescription(var6, var11);
      this.view.setRole(var21);
   }
}
