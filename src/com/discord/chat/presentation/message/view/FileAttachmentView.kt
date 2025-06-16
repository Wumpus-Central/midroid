package com.discord.chat.presentation.message.view

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Paint
import android.graphics.drawable.ShapeDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.FileAttachmentViewBinding
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.PublicFileDownloader
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

public open class FileAttachmentView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val binding: FileAttachmentViewBinding
   private final var uploadFinished: Boolean
   private final var uploadContext: UploadContext?

   open fun FileAttachmentView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var9: FileAttachmentViewBinding = FileAttachmentViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var9, "inflate(...)");
      this.binding = var9;
      var var4: SimpleDraweeView = var9.fileAttachmentDownload;
      kotlin.jvm.internal.q.g(var9.fileAttachmentDownload, "fileAttachmentDownload");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.Download);
      var4 = var9.fileAttachmentDownload;
      kotlin.jvm.internal.q.g(var9.fileAttachmentDownload, "fileAttachmentDownload");
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextMuted());
      var9.fileAttachmentDownload.setContentDescription(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.DOWNLOAD, null, 2, null));
      val var5: SimpleDraweeView = var9.fileAttachmentIcon;
      kotlin.jvm.internal.q.g(var9.fileAttachmentIcon, "fileAttachmentIcon");
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.File);
      val var6: SimpleDraweeView = var9.fileAttachmentIcon;
      kotlin.jvm.internal.q.g(var9.fileAttachmentIcon, "fileAttachmentIcon");
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getTextMuted());
      var9.fileAttachmentName.setTextColor(ThemeManagerKt.getTheme().getTextLink());
      val var11: TextView = var9.fileAttachmentName;
      kotlin.jvm.internal.q.g(var9.fileAttachmentName, "fileAttachmentName");
      val var7: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var11, DiscordFont.PrimaryMedium);
      var9.fileAttachmentDescription.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var12: TextView = var9.fileAttachmentDescription;
      kotlin.jvm.internal.q.g(var9.fileAttachmentDescription, "fileAttachmentDescription");
      SetTextSizeSpKt.setTextSizeSp(var12, 12.0F);
      val var13: TextView = var9.fileAttachmentDescription;
      kotlin.jvm.internal.q.g(var9.fileAttachmentDescription, "fileAttachmentDescription");
      DiscordFontUtilsKt.setDiscordFont(var13, var7);
      var9.fileAttachmentDownloadProgressBar.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
      val var8: View = var9.getRoot();
      kotlin.jvm.internal.q.g(var8, "getRoot(...)");
      val var3: Int = SizeUtilsKt.getDpToPx(8);
      var8.setPadding(var3, var3, var3, var3);
   }

   @JvmStatic
   fun `setContent$lambda$0`(var0: Function2, var1: java.lang.String, var2: java.lang.String, var3: View) {
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `setContent$lambda$1`(var0: FileAttachmentView, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: View) {
      cb.f.d(CoroutineViewUtilsKt.getAttachedScope(var0), cb.K.b(), null, new Function2(var0, var1, var2, var3, null) {
         final java.lang.String $attachmentDescription;
         final java.lang.String $attachmentName;
         final java.lang.String $url;
         int label;
         final FileAttachmentView this$0;

         {
            super(2, var5);
            this.this$0 = var1;
            this.$url = var2x;
            this.$attachmentName = var3;
            this.$attachmentDescription = var4;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, this.$url, this.$attachmentName, this.$attachmentDescription, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = A9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               var1 = PublicFileDownloader.INSTANCE;
               val var4: Context = this.this$0.getContext();
               kotlin.jvm.internal.q.g(var4, "getContext(...)");
               val var6: Flow = var1.downloadFile(var4, this.$url, this.$attachmentName, this.$attachmentDescription);
               val var7: FlowCollector = new FlowCollector(this.this$0) {
                  final FileAttachmentView this$0;

                  {
                     this.this$0 = var1;
                  }

                  public final Object emit(DownloadState var1, Continuation var2x) {
                     val var3x: Any = cb.f.g(cb.K.c(), new Function2(var1, this.this$0, null) {
                        final DownloadState $downloadState;
                        int label;
                        final FileAttachmentView this$0;

                        {
                           super(2, var3x);
                           this.$downloadState = var1;
                           this.this$0 = var2x;
                        }

                        public final Continuation create(Object var1, Continuation var2x) {
                           return new <anonymous constructor>(this.$downloadState, this.this$0, var2x);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           A9.b.e();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              val var4: Boolean = this.$downloadState is DownloadState.InProgress;
                              var1 = FileAttachmentView.access$getBinding$p(this.this$0).fileAttachmentDownloadProgressBar;
                              kotlin.jvm.internal.q.g(var1, "fileAttachmentDownloadProgressBar");
                              var var2x: Byte;
                              if (var4) {
                                 var2x = 0;
                              } else {
                                 var2x = 8;
                              }

                              var1.setVisibility(var2x);
                              val var6: SimpleDraweeView = FileAttachmentView.access$getBinding$p(this.this$0).fileAttachmentDownload;
                              kotlin.jvm.internal.q.g(var6, "fileAttachmentDownload");
                              var2x = 8;
                              if (!var4) {
                                 var2x = 0;
                              }

                              var6.setVisibility(var2x);
                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     }, var2x);
                     return if (var3x === A9.b.e()) var3x else Unit.a;
                  }
               };
               this.label = 1;
               if (var6.collect(var7, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 2, null);
   }

   @JvmStatic
   fun `setContent$lambda$3`(var0: FileAttachmentView): Unit {
      val var1: LinearLayout = var0.binding.uploadOverlayBackground;
      kotlin.jvm.internal.q.g(var0.binding.uploadOverlayBackground, "uploadOverlayBackground");
      var1.setVisibility(8);
      var0.uploadFinished = true;
      return Unit.a;
   }

   public fun setContent(
      attachmentName: String,
      attachmentDescription: String,
      url: String,
      onClick: (String, String) -> Unit,
      isSpoiler: Boolean,
      spoilerConfig: SpoilerConfig?,
      uploadItemProps: UploadItemProps?,
      backgroundColor: Int?
   ) {
      kotlin.jvm.internal.q.h(var1, "attachmentName");
      kotlin.jvm.internal.q.h(var2, "attachmentDescription");
      kotlin.jvm.internal.q.h(var3, "url");
      kotlin.jvm.internal.q.h(var4, "onClick");
      val var10: Boolean;
      if (var7 != null) {
         var10 = true;
      } else {
         var10 = false;
      }

      val var12: AttachedViewCoroutineScope = CoroutineViewUtilsKt.getAttachedScope(this);
      val var13: java.lang.String = this.getClass().getSimpleName();
      val var14: StringBuilder = new StringBuilder();
      var14.append("Binding ");
      var14.append(var13);
      AttachedViewCoroutineScope.cancelAllWork$default(var12, var14.toString(), null, 2, null);
      val var28: SimpleDraweeView = this.binding.fileAttachmentDownload;
      kotlin.jvm.internal.q.g(this.binding.fileAttachmentDownload, "fileAttachmentDownload");
      var var11: Byte;
      if (!var10) {
         var11 = 0;
      } else {
         var11 = 8;
      }

      var28.setVisibility(var11);
      val var29: ProgressBar = this.binding.fileAttachmentDownloadProgressBar;
      kotlin.jvm.internal.q.g(this.binding.fileAttachmentDownloadProgressBar, "fileAttachmentDownloadProgressBar");
      var29.setVisibility(4);
      val var30: TextView = this.binding.fileAttachmentName;
      kotlin.jvm.internal.q.g(this.binding.fileAttachmentName, "fileAttachmentName");
      ViewUtilsKt.setOptionalText(var30, var1);
      val var31: TextView = this.binding.fileAttachmentDescription;
      kotlin.jvm.internal.q.g(this.binding.fileAttachmentDescription, "fileAttachmentDescription");
      ViewUtilsKt.setOptionalText(var31, var2);
      if (var8 != null) {
         var11 = var8;
      } else {
         var11 = ThemeManagerKt.getTheme().getBackgroundSecondary();
      }

      val var25: View = this.binding.getRoot();
      kotlin.jvm.internal.q.g(var25, "getRoot(...)");
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         var25, var11, SizeUtilsKt.getDpToPx(8), ColorUtilsKt.getColorCompat(this, R.color.primary_dark_700_alpha_60), SizeUtilsKt.getDpToPx(0.25F)
      );
      if (!var10) {
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new I(var4, var3, var1), 1, null);
      }

      val var23: SimpleDraweeView = this.binding.fileAttachmentDownload;
      kotlin.jvm.internal.q.g(this.binding.fileAttachmentDownload, "fileAttachmentDownload");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var23, false, new J(this, var3, var1, var2), 1, null);
      this.binding.spoiler.configure(var6, this);
      if (var5) {
         val var15: SpoilerView = this.binding.spoiler;
         kotlin.jvm.internal.q.g(this.binding.spoiler, "spoiler");
         if (var15.getVisibility() == 0) {
            this.binding.fileAttachmentDownload.setImportantForAccessibility(4);
            this.binding.fileAttachmentName.setImportantForAccessibility(4);
            this.binding.fileAttachmentDescription.setImportantForAccessibility(4);
         }
      }

      val var16: View = this.binding.getRoot();
      val var9: Float;
      if (var7 != null) {
         var9 = var7.getUploadOpacity();
      } else {
         var9 = 1.0F;
      }

      var16.setAlpha(var9);
      val var24: AttachmentUploadOverlayView = this.binding.uploadOverlay;
      var11 = ThemeManagerKt.getTheme().getInteractiveNormal();
      val var17: ShapeDrawable = new ShapeDrawable();
      val var22: Paint = var17.getPaint();
      val var21: Context = this.getContext();
      kotlin.jvm.internal.q.g(var21, "getContext(...)");
      var22.setColor(ColorUtilsKt.getColorCompat(var21, 17170445));
      AttachmentUploadOverlayView.configureProgressView$default(
         var24, null, var17, null, var11, null, ThemeManagerKt.getTheme().getBackgroundModifierAccent(), 21, null
      );
      if (!kotlin.jvm.internal.q.c(this.uploadContext, this.uploadContext)) {
         this.uploadContext = this.uploadContext;
         this.uploadFinished = false;
      }

      if (var10 && !this.uploadFinished) {
         this.binding.uploadOverlayBackground.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
         val var19: LinearLayout = this.binding.uploadOverlayBackground;
         kotlin.jvm.internal.q.g(this.binding.uploadOverlayBackground, "uploadOverlayBackground");
         var19.setVisibility(0);
      }

      val var20: K = new K(this);
      this.binding.uploadOverlay.setProgress(var7);
      this.binding.uploadOverlay.setUploadCancel(var7);
      this.binding.uploadOverlay.setOnProgressAnimationComplete(var20);
   }
}
