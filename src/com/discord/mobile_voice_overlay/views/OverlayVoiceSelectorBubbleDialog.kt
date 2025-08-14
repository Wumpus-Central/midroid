package com.discord.mobile_voice_overlay.views

import android.animation.Animator
import android.animation.AnimatorInflater
import android.content.Context
import android.content.res.Configuration
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.R
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSelectorBinding
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.primitives.ChannelId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nOverlayVoiceSelectorBubbleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayVoiceSelectorBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,203:1\n39#2:204\n55#2,12:205\n84#2,3:217\n257#3,2:220\n257#3,2:222\n*S KotlinDebug\n*F\n+ 1 OverlayVoiceSelectorBubbleDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog\n*L\n60#1:204\n60#1:205,12\n60#1:217,3\n121#1:220,2\n122#1:222,2\n*E\n"])
public class OverlayVoiceSelectorBubbleDialog : OverlayDialog {
   private final var binding: OverlayVoiceChannelSelectorBinding
   private final var data: MobileVoiceOverlayData?
   private final val adapter: ResultAdapter
   public final var onTextChanged: (String) -> Unit
   public final var onChannelSelected: (ChannelId) -> Unit

   public constructor(context: Context) : super(var1) {
      val var2: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var2;
      this.adapter = new ResultAdapter(new t(this));
      WindowUtils.INSTANCE.removeFlag(this.getWindowLayoutParams(), 8);
      this.onTextChanged = new u();
      this.onChannelSelected = new v();
   }

   public constructor(context: Context, attrs: AttributeSet?) : super(var1, var2) {
      val var3: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var3;
      this.adapter = new ResultAdapter(new t(this));
      WindowUtils.INSTANCE.removeFlag(this.getWindowLayoutParams(), 8);
      this.onTextChanged = new u();
      this.onChannelSelected = new v();
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : super(var1, var2, var3) {
      val var4: OverlayVoiceChannelSelectorBinding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.binding = var4;
      this.adapter = new ResultAdapter(new t(this));
      WindowUtils.INSTANCE.removeFlag(this.getWindowLayoutParams(), 8);
      this.onTextChanged = new u();
      this.onChannelSelected = new v();
   }

   @JvmStatic
   fun `adapter$lambda$0`(var0: OverlayVoiceSelectorBubbleDialog, var1: ChannelId): Unit {
      var0.onChannelSelected.invoke(var1);
      return Unit.a;
   }

   private fun bindAssets() {
      val var1: MobileVoiceOverlayAssets = this.getOverlayAssets();
      if (var1 != null) {
         this.binding.channelSelect.setText(var1.getChannelSelect());
         this.binding.emptyResults.setText(var1.getNoResults());
         this.binding.overlayChannelSearch.setHint(var1.getSearchChannels());
         this.binding.close.setContentDescription(var1.getCloseWindow());
         val var2: SimpleDraweeView = this.binding.close;
         ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getInteractiveNormal());
         val var3: SimpleDraweeView = this.binding.close;
         ReactAssetUtilsKt.setReactAsset(var3, ReactAsset.Close);
      }
   }

   private fun bindData(): Unit? {
      val var4: MobileVoiceOverlayData = this.data;
      val var7: Unit;
      if (this.data != null) {
         val var3: Boolean = this.data.getChannelSelectorResults().isEmpty();
         val var5: TextView = this.binding.emptyResults;
         var var1: Byte;
         if (var3) {
            var1 = 0;
         } else {
            var1 = 8;
         }

         var5.setVisibility(var1);
         val var8: RecyclerView = this.binding.resultsRv;
         var1 = 8;
         if (!var3) {
            var1 = 0;
         }

         var8.setVisibility(var1);
         if (!var3) {
            this.adapter.setResults(var4.getChannelSelectorResults());
         }

         var7 = Unit.a;
      } else {
         var7 = null;
      }

      return var7;
   }

   @JvmStatic
   fun `onChannelSelected$lambda$2`(var0: ChannelId): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onTextChanged$lambda$1`(var0: java.lang.String): Unit {
      return Unit.a;
   }

   private fun onViewBound() {
      this.binding.close.setOnClickListener(new w(this));
      var var1: EditText = this.binding.overlayChannelSearch;
      var1.addTextChangedListener(new TextWatcher(this) {
         final OverlayVoiceSelectorBubbleDialog this$0;

         {
            this.this$0 = var1;
         }

         public void afterTextChanged(Editable var1) {
         }

         public void beforeTextChanged(java.lang.CharSequence var1, int var2, int var3, int var4) {
         }

         public void onTextChanged(java.lang.CharSequence var1, int var2, int var3, int var4) {
            var var6: Function1;
            label11: {
               var6 = this.this$0.getOnTextChanged();
               if (var1 != null) {
                  val var5: java.lang.String = var1.toString();
                  var1 = var5;
                  if (var5 != null) {
                     break label11;
                  }
               }

               var1 = "";
            }

            var6.invoke(var1);
         }
      });
      val var3: TextView = this.binding.channelSelect;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      val var2: TextView = this.binding.emptyResults;
      val var4: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
      var2.setVisibility(8);
      val var7: EditText = this.binding.overlayChannelSearch;
      DiscordFontUtilsKt.setDiscordFont(var7, var4);
      val var5: LinearLayout = this.binding.menuContainer;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var5, ThemeManagerKt.getTheme().getBackgroundTertiary(), 4, null, 0, 12, null);
      this.binding.dialogCard.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
      this.binding.channelSelect.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      this.binding.emptyResults.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      var1 = this.binding.overlayChannelSearch;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(var1, ThemeManagerKt.getTheme().getInteractiveMuted(), 8, null, 0, 12, null);
      var1.setHintTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      var1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      this.binding.resultsRv.setAdapter(this.adapter);
      this.bindAssets();
      this.bindData();
   }

   @JvmStatic
   fun `onViewBound$lambda$3`(var0: OverlayVoiceSelectorBubbleDialog, var1: View) {
      var0.closeDialog();
   }

   public override fun getClosingAnimator(): Animator {
      val var1: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_down_fade_out);
      var1.setTarget(this.binding.dialogCard);
      return var1;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.onViewBound();
      val var1: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.overlay_slide_up_fade_in);
      var1.setTarget(this.binding.dialogCard);
      var1.start();
   }

   protected override fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      this.removeAllViewsInLayout();
      this.binding = OverlayVoiceChannelSelectorBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
      this.onViewBound();
   }

   public override fun setAssets(assets: MobileVoiceOverlayAssets) {
      super.setAssets(var1);
      this.bindAssets();
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      this.data = var1;
      this.bindData();
   }
}
