package com.discord.overlapping_circles

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
import androidx.core.view.g0
import androidx.core.view.r0
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
import fh.l
import fh.o
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class OverlappingCirclesView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final var imageLoadingColor: Int
   private final val imageLoadingColorDrawable: ColorDrawable
   private final var maxItems: Int
   private final var overflowBgColor: Int
   private final var overflowTextColor: Int
   private final var overflowTextSizePx: Int
   private final val overlapNegativeMargin: Int
   private final var overlapPx: Int
   private final var placeholderCircleColor: Int
   private final var separatorSizePx: Int

   fun OverlappingCirclesView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.maxItems = 3;
      this.overlapPx = SizeUtilsKt.getDpToPx(4);
      this.separatorSizePx = SizeUtilsKt.getDpToPx(3);
      this.imageLoadingColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
      this.overflowBgColor = ThemeManagerKt.getTheme().getBackgroundSecondaryAlt();
      this.overflowTextColor = ThemeManagerKt.getTheme().getInteractiveNormal();
      this.overflowTextSizePx = SizeUtilsKt.getSpToPx(12);
      this.placeholderCircleColor = ThemeManagerKt.getTheme().getBackgroundAccent();
      this.imageLoadingColorDrawable = new ColorDrawable(this.imageLoadingColor);
      val var3: IntArray = R.styleable.OverlappingCirclesView;
      q.g(R.styleable.OverlappingCirclesView, "OverlappingCirclesView");
      val var4: TypedArray = var1.obtainStyledAttributes(var2, var3, 0, 0);
      q.g(var4, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
      this.maxItems = f.c(var4.getInt(R.styleable.OverlappingCirclesView_oc_maxItems, this.maxItems), 0);
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
      q.h(var1, "items");
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

      val var12: java.util.Iterator = i.J0(var1, var3).iterator();

      for (int var16 = 0; var12.hasNext(); var16++) {
         var var11: OverlappingItem = (OverlappingItem)var12.next();
         if (var16 < 0) {
            i.t();
         }

         var11 = var11;
         val var10: Boolean;
         if (var16 == var5 - 1 && !var2) {
            var10 = false;
         } else {
            var10 = true;
         }

         if (var11.getImageUri() != null) {
            val var18: java.lang.String;
            if (URLUtil.isValidUrl(var11.getImageUri())) {
               var18 = var11.getImageUri();
            } else {
               val var13: Context = this.getContext();
               q.g(var13, "getContext(...)");
               val var19: ReactAsset = ReactAsset.DefaultAvatar0;
               val var14: Context = this.getContext();
               q.g(var14, "getContext(...)");
               var18 = ReactAssetUtilsKt.getReactImageUrl(var13, var19.getUri(var14));
            }

            val var25: Context = this.getContext();
            q.g(var25, "getContext(...)");
            var11 = new OverlappingCirclesView.OverlappingClippedItem(var25, var18, var10, this.overlapPx, this.separatorSizePx, this.imageLoadingColorDrawable);
         } else {
            val var21: Context = this.getContext();
            val var7: Int = ThemeManagerKt.getTheme().getBackgroundAccent();
            val var6: Int = this.overlapPx;
            val var9: Int = this.separatorSizePx;
            val var8: Int = this.getLayoutParams().height;
            q.e(var21);
            var11 = new OverlappingCirclesView.PlaceholderItem(var21, var7, var10, var6, var9, var8);
         }

         val var26: LayoutParams = new LayoutParams(this.getLayoutParams().height, this.getLayoutParams().height);
         if (var16 > 0) {
            var26.setMarginStart(this.overlapNegativeMargin);
         }

         this.addView(var11, var26);
      }

      if (var2) {
         val var22: Context = this.getContext();
         q.g(var22, "getContext(...)");
         val var24: OverlappingCirclesView.OverflowItem = new OverlappingCirclesView.OverflowItem(
            var22, var1.size() - var3, this.overflowTextSizePx, this.overflowTextColor, this.overflowBgColor, this.getLayoutParams().height
         );
         val var23: LayoutParams = new LayoutParams(-2, -1);
         var23.setMarginStart(this.overlapNegativeMargin);
         this.addView(var24, var23);
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

   private class OverflowItem(context: Context, count: Int, textSizePx: Int, textColor: Int, bgColor: Int, sizePx: Int) : MaterialTextView {
      init {
         q.h(var1, "context");
         super(var1);
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
         q.g(g0.a(this, new Runnable(this, this) {
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
                  (var3 as LayoutParams).width = f.c(var1.getWidth(), var1.getHeight());
                  var2.setLayoutParams(var4);
               } else {
                  throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
               }
            }
         }), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
      }
   }

   @SuppressLint(["ViewConstructor"])
   private class OverlappingClippedItem(context: Context, imageUri: String, showSeparation: Boolean, overlapPx: Int, separatorSizePx: Int, defaultImg: Drawable)
      : SimpleDraweeView {
      private final var clipPath: Path

      init {
         q.h(var1, "context");
         q.h(var2, "imageUri");
         q.h(var6, "defaultImg");
         super(var1);
         this.clipPath = new Path();
         this.setHierarchy(GenericDraweeHierarchyBuilder.u(this.getResources()).D(var6).A(var6).y(1.0F).a());
         this.setImageURI(var2);
         if (r0.U(this) && !this.isLayoutRequested()) {
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
                     q.h(var1, "view");
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
            q.h(var1, "canvas");
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

   private class PlaceholderItem(context: Context, bgColor: Int, showSeparation: Boolean, overlapPx: Int, separatorSizePx: Int, size: Int) : View {
      private final val overlapPx: Int
      private final val paint: Paint
      private final val radius: Float

      private final val separatorClipPath: Path
         private final get() {
            return this.separatorClipPath$delegate.getValue() as Path;
         }


      private final val showSeparation: Boolean

      init {
         q.h(var1, "context");
         super(var1);
         this.showSeparation = var3;
         this.overlapPx = var4;
         this.radius = var6 / 2.0F;
         this.separatorClipPath$delegate = l.a(
            o.l,
            new Function0(this, var5) {
               final int $separatorSizePx;
               final OverlappingCirclesView.PlaceholderItem this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$separatorSizePx = var2;
               }

               public final Path invoke() {
                  return OverlappingCirclesView.Companion
                     .getClippingPathForSeparator(
                        OverlappingCirclesView.PlaceholderItem.access$getRadius$p(this.this$0),
                        OverlappingCirclesView.PlaceholderItem.access$getRadius$p(this.this$0)
                           - (float)OverlappingCirclesView.PlaceholderItem.access$getOverlapPx$p(this.this$0),
                        OverlappingCirclesView.PlaceholderItem.access$getRadius$p(this.this$0),
                        this.$separatorSizePx
                     );
               }
            }
         );
         val var7: Paint = new Paint();
         var7.setColor(var2);
         var7.setAntiAlias(true);
         this.paint = var7;
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
         // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
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
         // 1f: invokestatic com/discord/chat/presentation/list/d.a (Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
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
