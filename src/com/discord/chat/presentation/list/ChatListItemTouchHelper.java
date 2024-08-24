package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

public class ChatListItemTouchHelper extends ItemDecoration implements OnChildAttachStateChangeListener {
   static final int ACTION_MODE_DRAG_MASK = 16711680;
   private static final int ACTION_MODE_IDLE_MASK = 255;
   static final int ACTION_MODE_SWIPE_MASK = 65280;
   public static final int ACTION_STATE_DRAG = 2;
   public static final int ACTION_STATE_IDLE = 0;
   public static final int ACTION_STATE_SWIPE = 1;
   private static final int ACTIVE_POINTER_ID_NONE = -1;
   public static final int ANIMATION_TYPE_DRAG = 8;
   public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
   public static final int ANIMATION_TYPE_SWIPE_CANCEL_SPRINGY = 8;
   public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
   private static final boolean DEBUG = false;
   static final int DIRECTION_FLAG_COUNT = 8;
   public static final int DOWN = 2;
   public static final int END = 32;
   public static final int LEFT = 4;
   private static final int PIXELS_PER_SECOND = 1000;
   public static final int RIGHT = 8;
   public static final int START = 16;
   private static final String TAG = "ItemTouchHelper";
   public static final int UP = 1;
   private int mActionState;
   int mActivePointerId;
   ChatListCallback mCallback;
   private ChildDrawingOrderCallback mChildDrawingOrderCallback;
   private List<Integer> mDistances;
   private long mDragScrollStartTimeInMs;
   float mDx;
   float mDy;
   GestureDetectorCompat mGestureDetector;
   float mInitialTouchX;
   float mInitialTouchY;
   private ChatListItemTouchHelper.ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
   private float mMaxSwipeVelocity;
   private final OnItemTouchListener mOnItemTouchListener;
   View mOverdrawChild;
   int mOverdrawChildPosition;
   final List<View> mPendingCleanup = new ArrayList<>();
   List<ChatListItemTouchHelper.RecoverAnimation> mRecoverAnimations;
   RecyclerView mRecyclerView;
   final Runnable mScrollRunnable;
   ViewHolder mSelected;
   int mSelectedFlags;
   private float mSelectedStartX;
   private float mSelectedStartY;
   private int mSlop;
   private List<ViewHolder> mSwapTargets;
   private float mSwipeEscapeVelocity;
   private final float[] mTmpPosition = new float[2];
   private Rect mTmpRect;
   VelocityTracker mVelocityTracker;

   public ChatListItemTouchHelper(ChatListCallback var1) {
      this.mSelected = null;
      this.mActivePointerId = -1;
      this.mActionState = 0;
      this.mRecoverAnimations = new ArrayList<>();
      this.mScrollRunnable = new Runnable(this) {
         final ChatListItemTouchHelper this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void run() {
            ChatListItemTouchHelper var1x = this.this$0;
            if (var1x.mSelected != null && var1x.scrollIfNecessary()) {
               ChatListItemTouchHelper var2 = this.this$0;
               ViewHolder var3 = var2.mSelected;
               if (var3 != null) {
                  var2.moveIfNecessary(var3);
               }

               var1x = this.this$0;
               var1x.mRecyclerView.removeCallbacks(var1x.mScrollRunnable);
               f1.i0(this.this$0.mRecyclerView, this);
            }
         }
      };
      this.mChildDrawingOrderCallback = null;
      this.mOverdrawChild = null;
      this.mOverdrawChildPosition = -1;
      this.mOnItemTouchListener = new OnItemTouchListener(this) {
         final ChatListItemTouchHelper this$0;

         {
            this.this$0 = var1;
         }

         public boolean onInterceptTouchEvent(RecyclerView var1, MotionEvent var2) {
            this.this$0.mGestureDetector.a(var2);
            int var3 = var2.getActionMasked();
            boolean var5 = true;
            if (var3 == 0) {
               this.this$0.mActivePointerId = var2.getPointerId(0);
               this.this$0.mInitialTouchX = var2.getX();
               this.this$0.mInitialTouchY = var2.getY();
               this.this$0.obtainVelocityTracker();
               ChatListItemTouchHelper var7 = this.this$0;
               if (var7.mSelected == null) {
                  ChatListItemTouchHelper.RecoverAnimation var8 = var7.findAnimation(var2);
                  if (var8 != null) {
                     ChatListItemTouchHelper var6 = this.this$0;
                     var6.mInitialTouchX = var6.mInitialTouchX - var8.mX;
                     var6.mInitialTouchY = var6.mInitialTouchY - var8.mY;
                     var6.endRecoverAnimation(var8.mViewHolder, true);
                     if (this.this$0.mPendingCleanup.remove(var8.mViewHolder.itemView)) {
                        var6 = this.this$0;
                        var6.mCallback.clearView(var6.mRecyclerView, var8.mViewHolder);
                     }

                     this.this$0.select(var8.mViewHolder, var8.mActionState);
                     ChatListItemTouchHelper var9 = this.this$0;
                     var9.updateDxDy(var2, var9.mSelectedFlags, 0);
                  }
               }
            } else if (var3 != 3 && var3 != 1) {
               int var4 = this.this$0.mActivePointerId;
               if (var4 != -1) {
                  var4 = var2.findPointerIndex(var4);
                  if (var4 >= 0) {
                     this.this$0.checkSelectForSwipe(var3, var2, var4);
                  }
               }
            } else {
               ChatListItemTouchHelper var14 = this.this$0;
               var14.mCallback.onReleased(var1, var14.mSelected);
               ChatListItemTouchHelper var10 = this.this$0;
               var10.mActivePointerId = -1;
               var10.select(null, 0);
            }

            VelocityTracker var11 = this.this$0.mVelocityTracker;
            if (var11 != null) {
               var11.addMovement(var2);
            }

            if (this.this$0.mSelected == null) {
               var5 = false;
            }

            return var5;
         }

         public void onRequestDisallowInterceptTouchEvent(boolean var1) {
            if (var1) {
               this.this$0.select(null, 0);
            }
         }

         public void onTouchEvent(RecyclerView var1, MotionEvent var2) {
            this.this$0.mGestureDetector.a(var2);
            VelocityTracker var6 = this.this$0.mVelocityTracker;
            if (var6 != null) {
               var6.addMovement(var2);
            }

            if (this.this$0.mActivePointerId != -1) {
               int var4 = var2.getActionMasked();
               int var5 = var2.findPointerIndex(this.this$0.mActivePointerId);
               if (var5 >= 0) {
                  this.this$0.checkSelectForSwipe(var4, var2, var5);
               }

               ChatListItemTouchHelper var15 = this.this$0;
               ViewHolder var7 = var15.mSelected;
               if (var7 != null) {
                  byte var3 = 0;
                  if (var4 != 1) {
                     if (var4 == 2) {
                        if (var5 >= 0) {
                           var15.updateDxDy(var2, var15.mSelectedFlags, var5);
                           this.this$0.moveIfNecessary(var7);
                           ChatListItemTouchHelper var10 = this.this$0;
                           var10.mRecyclerView.removeCallbacks(var10.mScrollRunnable);
                           this.this$0.mScrollRunnable.run();
                           this.this$0.mRecyclerView.invalidate();
                        }

                        return;
                     }

                     if (var4 != 3) {
                        if (var4 == 6) {
                           var4 = var2.getActionIndex();
                           var5 = var2.getPointerId(var4);
                           ChatListItemTouchHelper var8 = this.this$0;
                           if (var5 == var8.mActivePointerId) {
                              if (var4 == 0) {
                                 var3 = 1;
                              }

                              var8.mActivePointerId = var2.getPointerId(var3);
                              ChatListItemTouchHelper var9 = this.this$0;
                              var9.updateDxDy(var2, var9.mSelectedFlags, var4);
                              return;
                           }
                        }

                        return;
                     }

                     VelocityTracker var11 = var15.mVelocityTracker;
                     if (var11 != null) {
                        var11.clear();
                     }
                  }

                  ChatListItemTouchHelper var12 = this.this$0;
                  var12.mCallback.onReleased(var1, var12.mSelected);
                  this.this$0.select(null, 0);
                  this.this$0.mActivePointerId = -1;
               }
            }
         }
      };
      this.mCallback = var1;
   }

   private void addChildDrawingOrderCallback() {
      if (this.mChildDrawingOrderCallback == null) {
         this.mChildDrawingOrderCallback = new ChildDrawingOrderCallback(this) {
            final ChatListItemTouchHelper this$0;

            {
               this.this$0 = var1;
            }

            public int onGetChildDrawingOrder(int var1, int var2) {
               ChatListItemTouchHelper var5 = this.this$0;
               View var6 = var5.mOverdrawChild;
               if (var6 == null) {
                  return var2;
               } else {
                  int var4 = var5.mOverdrawChildPosition;
                  int var3 = var4;
                  if (var4 == -1) {
                     var3 = var5.mRecyclerView.indexOfChild(var6);
                     this.this$0.mOverdrawChildPosition = var3;
                  }

                  if (var2 == var1 - 1) {
                     return var3;
                  } else {
                     if (var2 >= var3) {
                        var2++;
                     }

                     return var2;
                  }
               }
            }
         };
      }

      this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
   }

   private int checkHorizontalSwipe(ViewHolder var1, int var2) {
      if ((var2 & 12) != 0) {
         float var3 = this.mDx;
         byte var6 = 8;
         byte var5;
         if (var3 > 0.0F) {
            var5 = 8;
         } else {
            var5 = 4;
         }

         VelocityTracker var7 = this.mVelocityTracker;
         if (var7 != null && this.mActivePointerId > -1) {
            var7.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float var4 = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            var3 = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (!(var4 > 0.0F)) {
               var6 = 4;
            }

            var4 = Math.abs(var4);
            if ((var6 & var2) != 0 && var5 == var6 && var4 >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && var4 > Math.abs(var3)) {
               return var6;
            }
         }

         float var11 = this.mRecyclerView.getWidth();
         var3 = this.mCallback.getSwipeThreshold(var1);
         if ((var2 & var5) != 0 && Math.abs(this.mDx) > var11 * var3) {
            return var5;
         }
      }

      return 0;
   }

   private int checkVerticalSwipe(ViewHolder var1, int var2) {
      if ((var2 & 3) != 0) {
         float var3 = this.mDy;
         byte var6 = 2;
         byte var5;
         if (var3 > 0.0F) {
            var5 = 2;
         } else {
            var5 = 1;
         }

         VelocityTracker var7 = this.mVelocityTracker;
         if (var7 != null && this.mActivePointerId > -1) {
            var7.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            var3 = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float var4 = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (!(var4 > 0.0F)) {
               var6 = 1;
            }

            var4 = Math.abs(var4);
            if ((var6 & var2) != 0 && var6 == var5 && var4 >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && var4 > Math.abs(var3)) {
               return var6;
            }
         }

         var3 = this.mRecyclerView.getHeight();
         float var11 = this.mCallback.getSwipeThreshold(var1);
         if ((var2 & var5) != 0 && Math.abs(this.mDy) > var3 * var11) {
            return var5;
         }
      }

      return 0;
   }

   private void destroyCallbacks() {
      this.mRecyclerView.removeItemDecoration(this);
      this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
      this.mRecyclerView.removeOnChildAttachStateChangeListener(this);

      for (int var1 = this.mRecoverAnimations.size() - 1; var1 >= 0; var1--) {
         ChatListItemTouchHelper.RecoverAnimation var2 = this.mRecoverAnimations.get(0);
         var2.cancel();
         this.mCallback.clearView(this.mRecyclerView, var2.mViewHolder);
      }

      this.mRecoverAnimations.clear();
      this.mOverdrawChild = null;
      this.mOverdrawChildPosition = -1;
      this.releaseVelocityTracker();
      this.stopGestureDetection();
   }

   private List<ViewHolder> findSwapTargets(ViewHolder var1) {
      List var14 = this.mSwapTargets;
      if (var14 == null) {
         this.mSwapTargets = new ArrayList<>();
         this.mDistances = new ArrayList<>();
      } else {
         var14.clear();
         this.mDistances.clear();
      }

      int var3 = this.mCallback.getBoundingBoxMargin();
      int var5 = Math.round(this.mSelectedStartX + this.mDx) - var3;
      int var6 = Math.round(this.mSelectedStartY + this.mDy) - var3;
      int var2 = var1.itemView.getWidth();
      var3 *= 2;
      int var7 = var2 + var5 + var3;
      int var10 = var1.itemView.getHeight() + var6 + var3;
      int var11 = (var5 + var7) / 2;
      int var9 = (var6 + var10) / 2;
      LayoutManager var15 = this.mRecyclerView.getLayoutManager();
      int var8 = var15.getChildCount();

      for (int var17 = 0; var17 < var8; var17++) {
         View var16 = var15.getChildAt(var17);
         if (var16 != var1.itemView && var16.getBottom() >= var6 && var16.getTop() <= var10 && var16.getRight() >= var5 && var16.getLeft() <= var7) {
            ViewHolder var22 = this.mRecyclerView.getChildViewHolder(var16);
            if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, var22)) {
               int var4 = Math.abs(var11 - (var16.getLeft() + var16.getRight()) / 2);
               var3 = Math.abs(var9 - (var16.getTop() + var16.getBottom()) / 2);
               int var12 = var4 * var4 + var3 * var3;
               int var13 = this.mSwapTargets.size();
               var4 = 0;

               for (var3 = 0; var4 < var13 && var12 > this.mDistances.get(var4); var4++) {
                  var3++;
               }

               this.mSwapTargets.add(var3, var22);
               this.mDistances.add(var3, var12);
            }
         }
      }

      return this.mSwapTargets;
   }

   private ViewHolder findSwipedView(MotionEvent var1) {
      LayoutManager var7 = this.mRecyclerView.getLayoutManager();
      int var6 = this.mActivePointerId;
      if (var6 == -1) {
         return null;
      } else {
         var6 = var1.findPointerIndex(var6);
         float var4 = var1.getX(var6);
         float var5 = this.mInitialTouchX;
         float var2 = var1.getY(var6);
         float var3 = this.mInitialTouchY;
         var4 = Math.abs(var4 - var5);
         var2 = Math.abs(var2 - var3);
         var6 = this.mSlop;
         if (var4 < var6 && var2 < var6) {
            return null;
         } else if (var4 > var2 && var7.canScrollHorizontally()) {
            return null;
         } else if (var2 > var4 && var7.canScrollVertically()) {
            return null;
         } else {
            View var8 = this.findChildView(var1);
            return var8 == null ? null : this.mRecyclerView.getChildViewHolder(var8);
         }
      }
   }

   private void getSelectedDxDy(float[] var1) {
      if ((this.mSelectedFlags & 12) != 0) {
         var1[0] = this.mSelectedStartX + this.mDx - this.mSelected.itemView.getLeft();
      } else {
         var1[0] = this.mSelected.itemView.getTranslationX();
      }

      if ((this.mSelectedFlags & 3) != 0) {
         var1[1] = this.mSelectedStartY + this.mDy - this.mSelected.itemView.getTop();
      } else {
         var1[1] = this.mSelected.itemView.getTranslationY();
      }
   }

   private static boolean hitTest(View var0, float var1, float var2, float var3, float var4) {
      boolean var5;
      if (var1 >= var3 && var1 <= var3 + var0.getWidth() && var2 >= var4 && var2 <= var4 + var0.getHeight()) {
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   private void releaseVelocityTracker() {
      VelocityTracker var1 = this.mVelocityTracker;
      if (var1 != null) {
         var1.recycle();
         this.mVelocityTracker = null;
      }
   }

   private void setupCallbacks() {
      this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
      this.mRecyclerView.addItemDecoration(this);
      this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
      this.mRecyclerView.addOnChildAttachStateChangeListener(this);
      this.startGestureDetection();
   }

   private void startGestureDetection() {
      this.mItemTouchHelperGestureListener = new ChatListItemTouchHelper.ItemTouchHelperGestureListener(this);
      this.mGestureDetector = new GestureDetectorCompat(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
   }

   private void stopGestureDetection() {
      ChatListItemTouchHelper.ItemTouchHelperGestureListener var1 = this.mItemTouchHelperGestureListener;
      if (var1 != null) {
         var1.doNotReactToLongPress();
         this.mItemTouchHelperGestureListener = null;
      }

      if (this.mGestureDetector != null) {
         this.mGestureDetector = null;
      }
   }

   private int swipeIfNecessary(ViewHolder var1) {
      if (this.mActionState == 2) {
         return 0;
      } else {
         int var3 = this.mCallback.getMovementFlags(this.mRecyclerView, var1);
         int var2 = (this.mCallback.convertToAbsoluteDirection(var3, f1.B(this.mRecyclerView)) & 0xFF00) >> 8;
         if (var2 == 0) {
            return 0;
         } else {
            int var4 = (var3 & 0xFF00) >> 8;
            if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
               var3 = this.checkHorizontalSwipe(var1, var2);
               if (var3 > 0) {
                  if ((var4 & var3) == 0) {
                     return androidx.recyclerview.widget.e.convertToRelativeDirection(var3, f1.B(this.mRecyclerView));
                  }

                  return var3;
               }

               var2 = this.checkVerticalSwipe(var1, var2);
               if (var2 > 0) {
                  return var2;
               }
            } else {
               var3 = this.checkVerticalSwipe(var1, var2);
               if (var3 > 0) {
                  return var3;
               }

               var3 = this.checkHorizontalSwipe(var1, var2);
               if (var3 > 0) {
                  var2 = var3;
                  if ((var4 & var3) == 0) {
                     var2 = androidx.recyclerview.widget.e.convertToRelativeDirection(var3, f1.B(this.mRecyclerView));
                  }

                  return var2;
               }
            }

            return 0;
         }
      }
   }

   public void attachToRecyclerView(RecyclerView var1) {
      RecyclerView var2 = this.mRecyclerView;
      if (var2 != var1) {
         if (var2 != null) {
            this.destroyCallbacks();
         }

         this.mRecyclerView = var1;
         if (var1 != null) {
            Resources var3 = var1.getResources();
            this.mSwipeEscapeVelocity = var3.getDimension(z0.b.f);
            this.mMaxSwipeVelocity = var3.getDimension(z0.b.e);
            this.setupCallbacks();
         }
      }
   }

   void checkSelectForSwipe(int var1, MotionEvent var2, int var3) {
      if (this.mSelected == null && var1 == 2 && this.mActionState != 2 && this.mCallback.isItemViewSwipeEnabled()) {
         if (this.mRecyclerView.getScrollState() == 1) {
            return;
         }

         ViewHolder var8 = this.findSwipedView(var2);
         if (var8 == null) {
            return;
         }

         var1 = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, var8) & 0xFF00) >> 8;
         if (var1 == 0) {
            return;
         }

         float var4 = var2.getX(var3);
         float var5 = var2.getY(var3);
         var4 -= this.mInitialTouchX;
         float var6 = var5 - this.mInitialTouchY;
         var5 = Math.abs(var4);
         float var7 = Math.abs(var6);
         var3 = this.mSlop;
         if (var5 < var3 && var7 < var3) {
            return;
         }

         if (var5 > var7) {
            if (var4 < 0.0F && (var1 & 4) == 0) {
               return;
            }

            if (var4 > 0.0F && (var1 & 8) == 0) {
               return;
            }
         } else {
            if (var6 < 0.0F && (var1 & 1) == 0) {
               return;
            }

            if (var6 > 0.0F && (var1 & 2) == 0) {
               return;
            }
         }

         this.mDy = 0.0F;
         this.mDx = 0.0F;
         this.mActivePointerId = var2.getPointerId(0);
         this.select(var8, 1);
      }
   }

   void endRecoverAnimation(ViewHolder var1, boolean var2) {
      for (int var3 = this.mRecoverAnimations.size() - 1; var3 >= 0; var3--) {
         ChatListItemTouchHelper.RecoverAnimation var4 = this.mRecoverAnimations.get(var3);
         if (var4.mViewHolder == var1) {
            var4.mOverridden |= var2;
            if (!var4.mEnded) {
               var4.cancel();
            }

            this.mRecoverAnimations.remove(var3);
            return;
         }
      }
   }

   ChatListItemTouchHelper.RecoverAnimation findAnimation(MotionEvent var1) {
      if (this.mRecoverAnimations.isEmpty()) {
         return null;
      } else {
         View var4 = this.findChildView(var1);

         for (int var2 = this.mRecoverAnimations.size() - 1; var2 >= 0; var2--) {
            ChatListItemTouchHelper.RecoverAnimation var3 = this.mRecoverAnimations.get(var2);
            if (var3.mViewHolder.itemView == var4) {
               return var3;
            }
         }

         return null;
      }
   }

   View findChildView(MotionEvent var1) {
      float var3 = var1.getX();
      float var2 = var1.getY();
      ViewHolder var6 = this.mSelected;
      if (var6 != null) {
         View var7 = var6.itemView;
         if (hitTest(var7, var3, var2, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
            return var7;
         }
      }

      for (int var4 = this.mRecoverAnimations.size() - 1; var4 >= 0; var4--) {
         ChatListItemTouchHelper.RecoverAnimation var8 = this.mRecoverAnimations.get(var4);
         View var5 = var8.mViewHolder.itemView;
         if (hitTest(var5, var3, var2, var8.mX, var8.mY)) {
            return var5;
         }
      }

      return this.mRecyclerView.findChildViewUnder(var3, var2);
   }

   public void getItemOffsets(Rect var1, View var2, RecyclerView var3, State var4) {
      var1.setEmpty();
   }

   boolean hasRunningRecoverAnim() {
      int var2 = this.mRecoverAnimations.size();

      for (int var1 = 0; var1 < var2; var1++) {
         if (!this.mRecoverAnimations.get(var1).mEnded) {
            return true;
         }
      }

      return false;
   }

   void moveIfNecessary(ViewHolder var1) {
      if (!this.mRecyclerView.isLayoutRequested()) {
         if (this.mActionState == 2) {
            float var2 = this.mCallback.getMoveThreshold(var1);
            int var6 = (int)(this.mSelectedStartX + this.mDx);
            int var4 = (int)(this.mSelectedStartY + this.mDy);
            if (!(Math.abs(var4 - var1.itemView.getTop()) < var1.itemView.getHeight() * var2)
               || !(Math.abs(var6 - var1.itemView.getLeft()) < var1.itemView.getWidth() * var2)) {
               List var7 = this.findSwapTargets(var1);
               if (var7.size() != 0) {
                  ViewHolder var8 = this.mCallback.chooseDropTarget(var1, var7, var6, var4);
                  if (var8 == null) {
                     this.mSwapTargets.clear();
                     this.mDistances.clear();
                  } else {
                     int var5 = var8.getAbsoluteAdapterPosition();
                     int var3 = var1.getAbsoluteAdapterPosition();
                     if (this.mCallback.onMove(this.mRecyclerView, var1, var8)) {
                        this.mCallback.onMoved(this.mRecyclerView, var1, var3, var8, var5, var6, var4);
                     }
                  }
               }
            }
         }
      }
   }

   void obtainVelocityTracker() {
      VelocityTracker var1 = this.mVelocityTracker;
      if (var1 != null) {
         var1.recycle();
      }

      this.mVelocityTracker = VelocityTracker.obtain();
   }

   public void onChildViewAttachedToWindow(View var1) {
   }

   public void onChildViewDetachedFromWindow(View var1) {
      this.removeChildDrawingOrderCallbackIfNecessary(var1);
      ViewHolder var3 = this.mRecyclerView.getChildViewHolder(var1);
      if (var3 != null) {
         ViewHolder var2 = this.mSelected;
         if (var2 != null && var3 == var2) {
            this.select(null, 0);
         } else {
            this.endRecoverAnimation(var3, false);
            if (this.mPendingCleanup.remove(var3.itemView)) {
               this.mCallback.clearView(this.mRecyclerView, var3);
            }
         }
      }
   }

   public void onDraw(Canvas var1, RecyclerView var2, State var3) {
      this.mOverdrawChildPosition = -1;
      float var4;
      float var5;
      if (this.mSelected != null) {
         this.getSelectedDxDy(this.mTmpPosition);
         float[] var6 = this.mTmpPosition;
         var4 = var6[0];
         var5 = var6[1];
      } else {
         var4 = 0.0F;
         var5 = 0.0F;
      }

      this.mCallback.onDraw(var1, var2, this.mSelected, this.mRecoverAnimations, this.mActionState, var4, var5);
   }

   public void onDrawOver(Canvas var1, RecyclerView var2, State var3) {
      float var4;
      float var5;
      if (this.mSelected != null) {
         this.getSelectedDxDy(this.mTmpPosition);
         float[] var6 = this.mTmpPosition;
         var4 = var6[0];
         var5 = var6[1];
      } else {
         var4 = 0.0F;
         var5 = 0.0F;
      }

      this.mCallback.onDrawOver(var1, var2, this.mSelected, this.mRecoverAnimations, this.mActionState, var4, var5);
   }

   void postDispatchSwipe(ChatListItemTouchHelper.RecoverAnimation var1, int var2) {
      this.mRecyclerView.post(new Runnable(this, var1, var2) {
         final ChatListItemTouchHelper this$0;
         final ChatListItemTouchHelper.RecoverAnimation val$anim;
         final int val$swipeDir;

         {
            this.this$0 = var1;
            this.val$anim = var2x;
            this.val$swipeDir = var3;
         }

         @Override
         public void run() {
            RecyclerView var1x = this.this$0.mRecyclerView;
            if (var1x != null && var1x.isAttachedToWindow()) {
               ChatListItemTouchHelper.RecoverAnimation var2x = this.val$anim;
               if (!var2x.mOverridden && var2x.mViewHolder.getAbsoluteAdapterPosition() != -1) {
                  ItemAnimator var3 = this.this$0.mRecyclerView.getItemAnimator();
                  if ((var3 == null || !var3.isRunning(null)) && !this.this$0.hasRunningRecoverAnim()) {
                     this.this$0.mCallback.onSwiped(this.val$anim.mViewHolder, this.val$swipeDir);
                  } else {
                     this.this$0.mRecyclerView.post(this);
                  }
               }
            }
         }
      });
   }

   void removeChildDrawingOrderCallbackIfNecessary(View var1) {
      if (var1 == this.mOverdrawChild) {
         this.mOverdrawChild = null;
         if (this.mChildDrawingOrderCallback != null) {
            this.mRecyclerView.setChildDrawingOrderCallback(null);
         }
      }
   }

   boolean scrollIfNecessary() {
      if (this.mSelected == null) {
         this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
         return false;
      } else {
         long var7 = System.currentTimeMillis();
         long var5 = this.mDragScrollStartTimeInMs;
         if (var5 == Long.MIN_VALUE) {
            var5 = 0L;
         } else {
            var5 = var7 - var5;
         }

         LayoutManager var9 = this.mRecyclerView.getLayoutManager();
         if (this.mTmpRect == null) {
            this.mTmpRect = new Rect();
         }

         int var2;
         label66: {
            var9.calculateItemDecorationsForChild(this.mSelected.itemView, this.mTmpRect);
            if (var9.canScrollHorizontally()) {
               int var3 = (int)(this.mSelectedStartX + this.mDx);
               var2 = var3 - this.mTmpRect.left - this.mRecyclerView.getPaddingLeft();
               float var1 = this.mDx;
               if (var1 < 0.0F && var2 < 0) {
                  break label66;
               }

               if (var1 > 0.0F) {
                  var2 = var3
                     + this.mSelected.itemView.getWidth()
                     + this.mTmpRect.right
                     - (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight());
                  if (var2 > 0) {
                     break label66;
                  }
               }
            }

            var2 = 0;
         }

         int var11;
         label57: {
            if (var9.canScrollVertically()) {
               int var4 = (int)(this.mSelectedStartY + this.mDy);
               var11 = var4 - this.mTmpRect.top - this.mRecyclerView.getPaddingTop();
               float var10 = this.mDy;
               if (var10 < 0.0F && var11 < 0) {
                  break label57;
               }

               if (var10 > 0.0F) {
                  var11 = var4
                     + this.mSelected.itemView.getHeight()
                     + this.mTmpRect.bottom
                     - (this.mRecyclerView.getHeight() - this.mRecyclerView.getPaddingBottom());
                  if (var11 > 0) {
                     break label57;
                  }
               }
            }

            var11 = 0;
         }

         int var12 = var2;
         if (var2 != 0) {
            var12 = this.mCallback
               .interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getWidth(), var2, this.mRecyclerView.getWidth(), var5);
         }

         if (var11 != 0) {
            var11 = this.mCallback
               .interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getHeight(), var11, this.mRecyclerView.getHeight(), var5);
         }

         if (var12 == 0 && var11 == 0) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
         } else {
            if (this.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
               this.mDragScrollStartTimeInMs = var7;
            }

            this.mRecyclerView.scrollBy(var12, var11);
            return true;
         }
      }
   }

   void select(ViewHolder var1, int var2) {
      if (var1 != this.mSelected || var2 != this.mActionState) {
         this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
         int var9 = this.mActionState;
         this.endRecoverAnimation(var1, true);
         this.mActionState = var2;
         if (var2 == 2) {
            if (var1 == null) {
               throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }

            this.mOverdrawChild = var1.itemView;
            this.addChildDrawingOrderCallback();
         }

         ViewHolder var11 = this.mSelected;
         boolean var16;
         if (var11 != null) {
            if (var11.itemView.getParent() == null) {
               this.removeChildDrawingOrderCallbackIfNecessary(var11.itemView);
               this.mCallback.clearView(this.mRecyclerView, var11);
               var16 = 0;
            } else {
               int var8;
               if (!this.mCallback.shouldReturnToOriginalPosition() && var9 != 2) {
                  var8 = this.swipeIfNecessary(var11);
               } else {
                  var8 = 0;
               }

               this.releaseVelocityTracker();
               var16 = 4;
               float var4;
               float var12;
               if (var8 == 1 || var8 == 2) {
                  float var14 = Math.signum(this.mDy);
                  var4 = this.mRecyclerView.getHeight();
                  var12 = 0.0F;
                  var4 = var14 * var4;
               } else if (var8 != 4 && var8 != 8 && var8 != 16 && var8 != 32) {
                  var12 = 0.0F;
                  var4 = 0.0F;
               } else {
                  float var5 = Math.signum(this.mDx);
                  var12 = this.mRecyclerView.getWidth();
                  var4 = 0.0F;
                  var12 = var5 * var12;
               }

               if (var9 == 2) {
                  var16 = 8;
               } else if (var8 > 0) {
                  var16 = 2;
               } else if (this.mCallback.shouldUseSpringyExit()) {
                  var16 = 8;
               }

               this.getSelectedDxDy(this.mTmpPosition);
               float[] var10 = this.mTmpPosition;
               float var6 = var10[0];
               float var15 = var10[1];
               ChatListItemTouchHelper.RecoverAnimation var17 = new ChatListItemTouchHelper.RecoverAnimation(
                  this, var11, var16, var9, var6, var15, var12, var4, var8, var11
               ) {
                  final ChatListItemTouchHelper this$0;
                  final ViewHolder val$prevSelected;
                  final int val$swipeDir;

                  {
                     this.this$0 = var1;
                     this.val$swipeDir = var9x;
                     this.val$prevSelected = var10x;
                  }

                  @Override
                  public void onAnimationEnd(Animator var1) {
                     super.onAnimationEnd(var1);
                     if (!super.mOverridden) {
                        if (this.val$swipeDir <= 0) {
                           ChatListItemTouchHelper var5 = this.this$0;
                           var5.mCallback.clearView(var5.mRecyclerView, this.val$prevSelected);
                        } else {
                           this.this$0.mPendingCleanup.add(this.val$prevSelected.itemView);
                           super.mIsPendingCleanup = true;
                           int var2x = this.val$swipeDir;
                           if (var2x > 0) {
                              this.this$0.postDispatchSwipe(this, var2x);
                           }
                        }

                        ChatListItemTouchHelper var6x = this.this$0;
                        View var4x = var6x.mOverdrawChild;
                        View var3 = this.val$prevSelected.itemView;
                        if (var4x == var3) {
                           var6x.removeChildDrawingOrderCallbackIfNecessary(var3);
                        }
                     }
                  }
               };
               var17.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, var16, var12 - var6, var4 - var15));
               this.mRecoverAnimations.add(var17);
               var17.start();
               var16 = 1;
            }

            this.mSelected = null;
         } else {
            var16 = 0;
         }

         if (var1 != null) {
            this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, var1) & (1 << var2 * 8 + 8) - 1) >> this.mActionState * 8;
            this.mSelectedStartX = var1.itemView.getLeft();
            this.mSelectedStartY = var1.itemView.getTop();
            this.mSelected = var1;
            if (var2 == 2) {
               var1.itemView.performHapticFeedback(0);
            }
         }

         if (!var16) {
            this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
         }

         this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
         this.mRecyclerView.invalidate();
      }
   }

   public void startDrag(ViewHolder var1) {
      if (this.mCallback.hasDragFlag(this.mRecyclerView, var1)) {
         if (var1.itemView.getParent() == this.mRecyclerView) {
            this.obtainVelocityTracker();
            this.mDy = 0.0F;
            this.mDx = 0.0F;
            this.select(var1, 2);
         }
      }
   }

   void updateDxDy(MotionEvent var1, int var2, int var3) {
      float var5 = var1.getX(var3);
      float var4 = var1.getY(var3);
      Pair var6 = this.mCallback.getEffectiveDxDy(var5 - this.mInitialTouchX, var4 - this.mInitialTouchY);
      this.mDx = (Float)var6.first;
      this.mDy = (Float)var6.second;
      if ((var2 & 4) == 0) {
         this.mDx = Math.max(0.0F, this.mDx);
      }

      if ((var2 & 8) == 0) {
         this.mDx = Math.min(0.0F, this.mDx);
      }

      if ((var2 & 1) == 0) {
         this.mDy = Math.max(0.0F, this.mDy);
      }

      if ((var2 & 2) == 0) {
         this.mDy = Math.min(0.0F, this.mDy);
      }
   }

   private class ItemTouchHelperGestureListener extends SimpleOnGestureListener {
      private boolean mShouldReactToLongPress;
      final ChatListItemTouchHelper this$0;

      ItemTouchHelperGestureListener(ChatListItemTouchHelper var1) {
         this.this$0 = var1;
         this.mShouldReactToLongPress = true;
      }

      void doNotReactToLongPress() {
         this.mShouldReactToLongPress = false;
      }

      public boolean onDown(MotionEvent var1) {
         return true;
      }

      public void onLongPress(MotionEvent var1) {
         if (this.mShouldReactToLongPress) {
            View var6 = this.this$0.findChildView(var1);
            if (var6 != null) {
               ViewHolder var10 = this.this$0.mRecyclerView.getChildViewHolder(var6);
               if (var10 != null) {
                  ChatListItemTouchHelper var7 = this.this$0;
                  if (!var7.mCallback.hasDragFlag(var7.mRecyclerView, var10)) {
                     return;
                  }

                  int var5 = var1.getPointerId(0);
                  int var4 = this.this$0.mActivePointerId;
                  if (var5 == var4) {
                     var4 = var1.findPointerIndex(var4);
                     float var2 = var1.getX(var4);
                     float var3 = var1.getY(var4);
                     ChatListItemTouchHelper var8 = this.this$0;
                     var8.mInitialTouchX = var2;
                     var8.mInitialTouchY = var3;
                     var8.mDy = 0.0F;
                     var8.mDx = 0.0F;
                     if (var8.mCallback.isLongPressDragEnabled()) {
                        this.this$0.select(var10, 2);
                     }
                  }
               }
            }
         }
      }
   }

   static class RecoverAnimation implements AnimatorListener {
      final int mActionState;
      final int mAnimationType;
      boolean mEnded;
      private float mFraction;
      boolean mIsPendingCleanup;
      boolean mOverridden = false;
      final float mStartDx;
      final float mStartDy;
      final float mTargetX;
      final float mTargetY;
      final ValueAnimator mValueAnimator;
      final ViewHolder mViewHolder;
      float mX;
      float mY;

      RecoverAnimation(ViewHolder var1, int var2, int var3, float var4, float var5, float var6, float var7) {
         this.mEnded = false;
         this.mActionState = var3;
         this.mAnimationType = var2;
         this.mViewHolder = var1;
         this.mStartDx = var4;
         this.mStartDy = var5;
         this.mTargetX = var6;
         this.mTargetY = var7;
         ValueAnimator var8 = ValueAnimator.ofFloat(new float[]{0.0F, 1.0F});
         this.mValueAnimator = var8;
         var8.addUpdateListener(new AnimatorUpdateListener(this) {
            final ChatListItemTouchHelper.RecoverAnimation this$0;

            {
               this.this$0 = var1;
            }

            public void onAnimationUpdate(ValueAnimator var1) {
               this.this$0.setFraction(var1.getAnimatedFraction());
            }
         });
         var8.setTarget(var1.itemView);
         if (var2 == 8) {
            var8.setInterpolator(new AccelerateDecelerateInterpolator());
         }

         var8.addListener(this);
         this.setFraction(0.0F);
      }

      public void cancel() {
         this.mValueAnimator.cancel();
      }

      public void onAnimationCancel(Animator var1) {
         this.setFraction(1.0F);
      }

      public void onAnimationEnd(Animator var1) {
         if (!this.mEnded) {
            this.mViewHolder.setIsRecyclable(true);
         }

         this.mEnded = true;
      }

      public void onAnimationRepeat(Animator var1) {
      }

      public void onAnimationStart(Animator var1) {
      }

      public void setDuration(long var1) {
         this.mValueAnimator.setDuration(var1);
      }

      public void setFraction(float var1) {
         this.mFraction = var1;
      }

      public void start() {
         this.mViewHolder.setIsRecyclable(false);
         this.mValueAnimator.start();
      }

      public void update() {
         float var1 = this.mStartDx;
         float var2 = this.mTargetX;
         if (var1 == var2) {
            this.mX = this.mViewHolder.itemView.getTranslationX();
         } else {
            this.mX = var1 + this.mFraction * (var2 - var1);
         }

         var1 = this.mStartDy;
         var2 = this.mTargetY;
         if (var1 == var2) {
            this.mY = this.mViewHolder.itemView.getTranslationY();
         } else {
            this.mY = var1 + this.mFraction * (var2 - var1);
         }
      }
   }
}
