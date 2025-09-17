package com.discord.overlapping_circles

import A9.j
import A9.m
import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Path.Direction
import android.graphics.Path.Op
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import android.view.View.OnLayoutChangeListener
import android.webkit.URLUtil
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.core.view.J
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.material.textview.MaterialTextView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n51#2,9:288\n1872#3,3:297\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView\n*L\n69#1:288,9\n92#1:297,3\n*E\n"])
public class OverlappingCirclesView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout(var1, var2) {
   private final var maxItems: Int = 3
   private final var overlapPx: Int = SizeUtilsKt.getDpToPx(4)
   private final var separatorSizePx: Int = SizeUtilsKt.getDpToPx(3)
   private final var imageLoadingColor: Int
   private final var overflowBgColor: Int
   private final var overflowTextColor: Int
   private final var overflowTextSizePx: Int
   private final var placeholderCircleColor: Int
   private final val imageLoadingColorDrawable: ColorDrawable
   private final val overlapNegativeMargin: Int

   fun OverlappingCirclesView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      this.imageLoadingColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
      this.overflowBgColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
      this.overflowTextColor = ThemeManagerKt.getTheme().getInteractiveNormal();
      this.overflowTextSizePx = SizeUtilsKt.getSpToPx(12);
      this.placeholderCircleColor = ThemeManagerKt.getTheme().getBackgroundAccent();
      this.imageLoadingColorDrawable = new ColorDrawable(this.imageLoadingColor);
      val var3: IntArray = R.styleable.OverlappingCirclesView;
      val var4: TypedArray = var1.obtainStyledAttributes(var2, var3, 0, 0);
      this.maxItems = d.d(var4.getInt(R.styleable.OverlappingCirclesView_oc_maxItems, this.maxItems), 0);
      this.overlapPx = var4.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_overlap, this.overlapPx);
      this.separatorSizePx = var4.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_separation, this.separatorSizePx);
      this.imageLoadingColor = var4.getColor(R.styleable.OverlappingCirclesView_oc_circleBgColor, this.imageLoadingColor);
      this.overflowBgColor = var4.getColor(R.styleable.OverlappingCirclesView_oc_overflowBgColor, this.overflowBgColor);
      this.overflowTextColor = var4.getColor(R.styleable.OverlappingCirclesView_oc_overflowTextColor, this.overflowTextColor);
      this.overflowTextSizePx = var4.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_overflowTextSize, this.overflowTextSizePx);
      this.placeholderCircleColor = var4.getColor(R.styleable.OverlappingCirclesView_oc_placeholderColor, this.placeholderCircleColor);
      var4.recycle();
      this.setOrientation(0);
      this.overlapNegativeMargin = -Math.abs(this.overlapPx);
   }

   public fun setItems(items: List<OverlappingItem>) {
      this.removeAllViews();
      val var2: Boolean;
      if (var1.size() > this.maxItems) {
         var2 = true;
      } else {
         var2 = false;
      }

      val var5: Int = Math.min(var1.size(), this.maxItems);
      var var3: Int = this.maxItems;
      if (var2) {
         var3 = this.maxItems - 1;
      }

      val var8: java.util.Iterator = CollectionsKt.M0(var1, var3).iterator();

      for (int var12 = 0; var8.hasNext(); var12++) {
         var var7: OverlappingItem = (OverlappingItem)var8.next();
         if (var12 < 0) {
            CollectionsKt.u();
         }

         var7 = var7;
         val var6: Boolean;
         if (var12 == var5 - 1 && !var2) {
            var6 = false;
         } else {
            var6 = true;
         }

         if (var7.getImageUri() != null) {
            val var14: java.lang.String;
            if (URLUtil.isValidUrl(var7.getImageUri())) {
               var14 = var7.getImageUri();
            } else {
               val var10: Context = this.getContext();
               val var9: ReactAsset = ReactAsset.DefaultAvatar0;
               val var15: Context = this.getContext();
               var14 = ReactAssetUtilsKt.getReactImageUrl(var10, var9.getUri(var15));
            }

            val var21: Context = this.getContext();
            var7 = new OverlappingCirclesView.OverlappingClippedItem(var21, var14, var6, this.overlapPx, this.separatorSizePx, this.imageLoadingColorDrawable);
         } else {
            val var17: Context = this.getContext();
            var7 = new OverlappingCirclesView.PlaceholderItem(
               var17, this.placeholderCircleColor, var6, this.overlapPx, this.separatorSizePx, this.getLayoutParams().height
            );
         }

         val var22: LayoutParams = new LayoutParams(this.getLayoutParams().height, this.getLayoutParams().height);
         if (var12 > 0) {
            var22.setMarginStart(this.overlapNegativeMargin);
         }

         this.addView(var7, var22);
      }

      if (var2) {
         val var18: Context = this.getContext();
         val var19: OverlappingCirclesView.OverflowItem = new OverlappingCirclesView.OverflowItem(
            var18, var1.size() - var3, this.overflowTextSizePx, this.overflowTextColor, this.overflowBgColor, this.getLayoutParams().height
         );
         val var11: LayoutParams = new LayoutParams(-2, -1);
         var11.setMarginStart(this.overlapNegativeMargin);
         this.addView(var19, var11);
      }
   }

   public companion object {
      public const val SMALL_ITEM_HEIGHT_DP: Int

      public fun getClippingPathForSeparator(radius: Float, viewCenterX: Float, viewCenterY: Float, separatorSizePx: Int): Path {
         val var5: Path = new Path();
         var5.addCircle(var2 + (float)2 * var1 - (float)var4, var3, var1, Direction.CW);
         return var5;
      }
   }

   @SourceDebugExtension(["SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,287:1\n167#2,2:288\n81#2:290\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem\n*L\n259#1:288,2\n264#1:290\n*E\n"])
   private class OverflowItem(context: Context, count: Int, textSizePx: Int, textColor: Int, bgColor: Int, sizePx: Int) : MaterialTextView(var1) {
      init {
         DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryBold);
         this.setTextSize(0, (float)var3);
         this.setTextColor(var4);
         val var7: StringBuilder = new StringBuilder();
         var7.append("+");
         var7.append(var2);
         this.setText(var7.toString());
         this.setGravity(17);
         val var11: Float;
         var var9: Int = if ((var11 = SizeUtilsKt.getPxToDp(var6) - 20.0F) == 0.0F) 0 else (if (var11 < 0.0F) -1 else 1);
         if (var9 > 0) {
            var2 = SizeUtilsKt.getDpToPx(8);
         } else {
            var2 = SizeUtilsKt.getDpToPx(4);
         }

         if (var9 > 0) {
            var9 = SizeUtilsKt.getDpToPx(8);
         } else {
            var9 = SizeUtilsKt.getDpToPx(4);
         }

         this.setPadding(var2, 0, var9, 0);
         this.setBackgroundColor(var5);
         ViewClippingUtilsKt.clipToCircle(this);
         J.a(this, new Runnable(this, this) {
            final View $this_doOnPreDraw;
            final OverlappingCirclesView.OverflowItem this$0;

            {
               this.$this_doOnPreDraw = var1;
               this.this$0 = var2;
            }

            @Override
            public final void run() {
               val var1: View = this.$this_doOnPreDraw;
               val var2: OverlappingCirclesView.OverflowItem = this.this$0;
               val var3: android.view.ViewGroup.LayoutParams = this.this$0.getLayoutParams();
               if (var3 != null) {
                  val var4: LayoutParams = var3 as LayoutParams;
                  (var3 as LayoutParams).width = d.d(var1.getWidth(), var1.getHeight());
                  var2.setLayoutParams(var4);
               } else {
                  throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
               }
            }
         });
      }
   }

   @SuppressLint(["ViewConstructor"])
   @SourceDebugExtension(["SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,287:1\n67#2,4:288\n37#2,2:292\n55#2:294\n72#2:295\n27#3,7:296\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem\n*L\n174#1:288,4\n174#1:292,2\n174#1:294\n174#1:295\n191#1:296,7\n*E\n"])
   private class OverlappingClippedItem(context: Context, imageUri: String, showSeparation: Boolean, overlapPx: Int, separatorSizePx: Int, defaultImg: Drawable) : SimpleDraweeView(
         var1
      ) {
      private final var clipPath: Path = new Path()

      init {
         this.setHierarchy(GenericDraweeHierarchyBuilder.u(this.getResources()).D(var6).A(var6).y(1.0F).a());
         this.setImageURI(var2);
         if (this.isLaidOut() && !this.isLayoutRequested()) {
            val var7: Float = this.getLayoutParams().width / 2.0F;
            access$getClipPath$p(this).addCircle(var7, var7, var7, Direction.CW);
            if (var3) {
               access$getClipPath$p(this).op(OverlappingCirclesView.Companion.getClippingPathForSeparator(var7, var7 - (float)var4, var7, var5), Op.DIFFERENCE);
            }
         } else {
            this.addOnLayoutChangeListener(
               new OnLayoutChangeListener(this, var3, var4, var5) {
                  final int $overlapPx$inlined;
                  final int $separatorSizePx$inlined;
                  final boolean $showSeparation$inlined;
                  final OverlappingCirclesView.OverlappingClippedItem this$0;

                  {
                     this.this$0 = var1;
                     this.$showSeparation$inlined = var2;
                     this.$overlapPx$inlined = var3;
                     this.$separatorSizePx$inlined = var4;
                  }

                  public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
                     var1.removeOnLayoutChangeListener(this);
                     val var10: Float = this.this$0.getLayoutParams().width / 2.0F;
                     OverlappingCirclesView.OverlappingClippedItem.access$getClipPath$p(this.this$0).addCircle(var10, var10, var10, Direction.CW);
                     if (this.$showSeparation$inlined) {
                        OverlappingCirclesView.OverlappingClippedItem.access$getClipPath$p(this.this$0)
                           .op(
                              OverlappingCirclesView.Companion
                                 .getClippingPathForSeparator(var10, var10 - (float)this.$overlapPx$inlined, var10, this.$separatorSizePx$inlined),
                              Op.DIFFERENCE
                           );
                     }
                  }
               }
            );
         }
      }

      protected open fun onDraw(canvas: Canvas) {
         label13: {
            val var2: Int = var1.save();

            try {
               var1.clipPath(this.clipPath);
               super.onDraw(var1);
            } catch (var4: java.lang.Throwable) {
               var1.restoreToCount(var2);
            }

            var1.restoreToCount(var2);
         }
      }
   }

   @SourceDebugExtension(["SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,287:1\n27#2,7:288\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem\n*L\n223#1:288,7\n*E\n"])
   private class PlaceholderItem(context: Context, bgColor: Int, showSeparation: Boolean, overlapPx: Int, separatorSizePx: Int, size: Int) : View(var1) {
      private final val showSeparation: Boolean
      private final val overlapPx: Int
      private final val radius: Float

      private final val separatorClipPath: Path
         private final get() {
            return this.separatorClipPath$delegate.getValue() as Path;
         }


      private final val paint: Paint

      init {
         this.showSeparation = var3;
         this.overlapPx = var4;
         this.radius = var6 / 2.0F;
         this.separatorClipPath$delegate = j.a(m.i, new a(this, var5));
         val var7: Paint = new Paint();
         var7.setColor(var2);
         var7.setAntiAlias(true);
         this.paint = var7;
      }

      @JvmStatic
      fun `separatorClipPath_delegate$lambda$0`(var0: OverlappingCirclesView.PlaceholderItem, var1: Int): Path {
         return OverlappingCirclesView.Companion.getClippingPathForSeparator(var0.radius, var0.radius - (float)var0.overlapPx, var0.radius, var1);
      }

      protected open fun onDraw(canvas: Canvas) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
         //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
         //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
         //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
         //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
         //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
         //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
         //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
         //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
         //
         // Bytecode:
         // 00: aload 1
         // 01: ldc "canvas"
         // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 06: aload 1
         // 07: invokevirtual android/graphics/Canvas.save ()I
         // 0a: istore 3
         // 0b: aload 0
         // 0c: getfield com/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem.showSeparation Z
         // 0f: ifeq 37
         // 12: getstatic android/os/Build$VERSION.SDK_INT I
         // 15: bipush 26
         // 17: if_icmplt 2b
         // 1a: aload 1
         // 1b: aload 0
         // 1c: invokespecial com/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem.getSeparatorClipPath ()Landroid/graphics/Path;
         // 1f: invokestatic com/discord/chat/presentation/list/p.a (Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
         // 22: pop
         // 23: goto 37
         // 26: astore 4
         // 28: goto 4d
         // 2b: aload 1
         // 2c: aload 0
         // 2d: invokespecial com/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem.getSeparatorClipPath ()Landroid/graphics/Path;
         // 30: getstatic android/graphics/Region$Op.DIFFERENCE Landroid/graphics/Region$Op;
         // 33: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
         // 36: pop
         // 37: aload 0
         // 38: getfield com/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem.radius F
         // 3b: fstore 2
         // 3c: aload 1
         // 3d: fload 2
         // 3e: fload 2
         // 3f: fload 2
         // 40: aload 0
         // 41: getfield com/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem.paint Landroid/graphics/Paint;
         // 44: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
         // 47: aload 1
         // 48: iload 3
         // 49: invokevirtual android/graphics/Canvas.restoreToCount (I)V
         // 4c: return
         // 4d: aload 1
         // 4e: iload 3
         // 4f: invokevirtual android/graphics/Canvas.restoreToCount (I)V
         // 52: aload 4
         // 54: athrow
      }
   }
}
