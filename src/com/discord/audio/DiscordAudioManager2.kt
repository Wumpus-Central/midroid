package com.discord.audio

import android.content.Context
import android.media.AudioDeviceCallback
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.media.AudioManager$OnCommunicationDeviceChangedListener
import android.os.RemoteException
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class DiscordAudioManager2(context: Context) : DiscordAudioManagerInterface, AudioManager$OnCommunicationDeviceChangedListener {
   private final val context: Context
   private final val listeners: ArrayList<DiscordAudioManagerListener>
   private final val androidAudioManager: AudioManager
   private final var audioDevices: Set<AudioDeviceInfo>
   private final val audioDeviceCallback: AudioDeviceCallback
   private final var scoRetryCount: Int
   private final var communicationDeviceChangedRegistered: Boolean
   private final var preferredAudioDevice: AudioDeviceInfo?

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.listeners = new ArrayList<>();
      val var2: AudioManager = var1.getSystemService(AudioManager.class) as AudioManager;
      this.androidAudioManager = var2;
      this.audioDevices = w.d();
      this.audioDeviceCallback = this.setupAudioDeviceCallback();
      val var3: Array<AudioDeviceInfo> = var2.getDevices(2);
      q.e(var3);
      this.audioDevices = kotlin.collections.c.M0(var3);
   }

   private fun emitEffectiveDevice() {
      this.notifyListeners(new Function1(this.getEffectiveAudioDevice()) {
         final AndroidAudioDevice $device;

         {
            super(1);
            this.$device = var1;
         }

         public final void invoke(DiscordAudioManagerListener var1) {
            q.h(var1, "listener");
            var1.onActiveAudioDeviceChanged(this.$device);
         }
      });
   }

   private fun notifyListeners(action: (DiscordAudioManagerListener) -> Unit) {
      val var2: java.util.Iterator = this.listeners.iterator();

      while (var2.hasNext()) {
         var1.invoke(var2.next());
      }
   }

   private fun setActiveAudioDevice(device: AudioDeviceInfo) {
      try {
         b.a(this.androidAudioManager, var1);
      } catch (RemoteException | var2: IllegalArgumentException) {
      }
   }

   private fun setupAudioDeviceCallback(): AudioDeviceCallback {
      return new AudioDeviceCallback(this) {
         final DiscordAudioManager2 this$0;

         {
            this.this$0 = var1;
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         public void onAudioDevicesAdded(AudioDeviceInfo[] var1) {
            if (var1 != null && var1.length != 0) {
               val var5: DiscordAudioManager2 = this.this$0;
               var var7: java.util.Set = DiscordAudioManager2.access$getAudioDevices$p(this.this$0);
               val var8: ArrayList = new ArrayList();
               var var4: Int = var1.length;

               for (int var2 = 0; var2 < var4; var2++) {
                  val var6: AudioDeviceInfo = var1[var2];
                  if (var1[var2].isSink()) {
                     var8.add(var6);
                  }
               }

               DiscordAudioManager2.access$setAudioDevices$p(var5, w.l(var7, var8));
               DiscordAudioManager2.access$notifyListeners(this.this$0, new Function1(this.this$0) {
                  final DiscordAudioManager2 this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(DiscordAudioManagerListener var1) {
                     q.h(var1, "listener");
                     var1.onAudioDevicesUpdated(i.R0(this.this$0.getAudioDevices()));
                  }
               });
               if (DiscordAudioManager2.access$getPreferredAudioDevice$p(this.this$0) == null) {
                  var4 = var1.length;
                  var var11: Int = 0;

                  while (true) {
                     var7 = null;
                     if (var11 >= var4) {
                        var16 = null;
                        break;
                     }

                     var16 = var1[var11];
                     if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(var1[var11].getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.BLUETOOTH_HEADSET
                        )
                      {
                        break;
                     }

                     var11++;
                  }

                  var4 = var1.length;
                  var11 = 0;

                  var var17: AudioDeviceInfo;
                  while (true) {
                     var17 = var7;
                     if (var11 >= var4) {
                        break;
                     }

                     var17 = var1[var11];
                     if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(var1[var11].getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.WIRED_HEADSET
                        )
                      {
                        break;
                     }

                     var11++;
                  }

                  if (var16 != null) {
                     try {
                        b.a(DiscordAudioManager2.access$getAndroidAudioManager$p(this.this$0), var16);
                     } catch (RemoteException | var10: IllegalArgumentException) {
                     }
                  } else if (var17 != null) {
                     try {
                        b.a(DiscordAudioManager2.access$getAndroidAudioManager$p(this.this$0), var17);
                     } catch (RemoteException | var9: IllegalArgumentException) {
                     }
                  }
               }

               DiscordAudioManager2.access$emitEffectiveDevice(this.this$0);
            }
         }

         public void onAudioDevicesRemoved(AudioDeviceInfo[] var1) {
            if (var1 != null && var1.length != 0) {
               val var6: DiscordAudioManager2 = this.this$0;
               val var5: java.util.Set = DiscordAudioManager2.access$getAudioDevices$p(this.this$0);
               val var7: ArrayList = new ArrayList();
               val var3: Int = var1.length;

               for (int var2 = 0; var2 < var3; var2++) {
                  val var4: AudioDeviceInfo = var1[var2];
                  if (var1[var2].isSink()) {
                     var7.add(var4);
                  }
               }

               DiscordAudioManager2.access$setAudioDevices$p(var6, w.j(var5, i.V0(var7)));
               DiscordAudioManager2.access$notifyListeners(this.this$0, new Function1(this.this$0) {
                  final DiscordAudioManager2 this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(DiscordAudioManagerListener var1) {
                     q.h(var1, "listener");
                     var1.onAudioDevicesUpdated(i.R0(this.this$0.getAudioDevices()));
                  }
               });
               DiscordAudioManager2.access$emitEffectiveDevice(this.this$0);
            }
         }
      };
   }

   public override fun addListener(listener: DiscordAudioManagerListener) {
      q.h(var1, "listener");
      this.listeners.add(var1);
   }

   public override fun getAudioDevices(): Set<AndroidAudioDevice> {
      val var3: java.util.Set = this.audioDevices;
      val var2: ArrayList = new ArrayList();

      for (Object var4 : var3) {
         val var1: Int = (var4 as AudioDeviceInfo).getType();
         if (var1 != 8 && var1 != 18 && var1 != 24 && var1 != 27 && var1 != 30) {
            var2.add(var4);
         }
      }

      val var7: ArrayList = new ArrayList(i.v(var2, 10));

      for (AudioDeviceInfo var5 : var2) {
         var7.add(AndroidAudioDevice.Companion.fromAudioDeviceInfo(var5));
      }

      return i.U0(var7);
   }

   public override fun getEffectiveAudioDevice(): AndroidAudioDevice {
      val var1: AudioDeviceInfo = a.a(this.androidAudioManager);
      return if (var1 != null) AndroidAudioDevice.Companion.fromAudioDeviceInfo(var1) else new AndroidAudioDevice();
   }

   public open fun onCommunicationDeviceChanged(device: AudioDeviceInfo?) {
      this.emitEffectiveDevice();
   }

   public override fun removeListener(listener: DiscordAudioManagerListener) {
      q.h(var1, "listener");
      this.listeners.remove(var1);
   }

   public override fun setActiveAudioDevice(device: AndroidAudioDevice) {
      q.h(var1, "device");
      val var3: java.util.Iterator = this.audioDevices.iterator();

      while (true) {
         if (var3.hasNext()) {
            val var2: Any = var3.next();
            if ((var2 as AudioDeviceInfo).getId() != var1.getDeviceId()) {
               continue;
            }

            var4 = var2;
            break;
         }

         var4 = null;
         break;
      }

      val var5: AudioDeviceInfo = var4 as AudioDeviceInfo;
      if (var4 as AudioDeviceInfo != null) {
         this.preferredAudioDevice = var5;
         this.setActiveAudioDevice(var5);
      }
   }

   public override fun setCommunicationModeOn(on: Boolean) {
      if (var1) {
         this.androidAudioManager.setMode(3);
         val var3: Any = null;
         this.androidAudioManager.registerAudioDeviceCallback(this.audioDeviceCallback, null);
         if (!this.communicationDeviceChangedRegistered) {
            e.a(this.androidAudioManager, c.a(this.context), d.a(this));
            this.communicationDeviceChangedRegistered = true;
         }

         val var13: AudioDeviceInfo = this.preferredAudioDevice;
         val var6: java.util.Iterator = this.audioDevices.iterator();

         var var9: Any;
         do {
            if (!var6.hasNext()) {
               var9 = null;
               break;
            }

            var9 = var6.next();
         } while (
            AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(((AudioDeviceInfo)var9).getType(), SimpleDeviceType.INVALID)
               != SimpleDeviceType.BLUETOOTH_HEADSET
         );

         val var14: AudioDeviceInfo = var9 as AudioDeviceInfo;
         var var7: java.util.Iterator = this.audioDevices.iterator();

         do {
            if (!var7.hasNext()) {
               var9 = null;
               break;
            }

            var9 = var7.next();
         } while (
            AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(((AudioDeviceInfo)var9).getType(), SimpleDeviceType.INVALID)
               != SimpleDeviceType.WIRED_HEADSET
         );

         val var16: AudioDeviceInfo = var9 as AudioDeviceInfo;
         var7 = this.audioDevices.iterator();

         do {
            var9 = var3;
            if (!var7.hasNext()) {
               break;
            }

            var9 = var7.next();
         } while (
            AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(((AudioDeviceInfo)var9).getType(), SimpleDeviceType.INVALID)
               != SimpleDeviceType.SPEAKERPHONE
         );

         var9 = var9 as AudioDeviceInfo;
         if (var13 != null && this.audioDevices.contains(var13)) {
            this.setActiveAudioDevice(var13);
         } else if (var14 != null) {
            this.setActiveAudioDevice(var14);
         } else if (var16 != null) {
            this.setActiveAudioDevice(var16);
         } else if (var9 != null) {
            this.setActiveAudioDevice((AudioDeviceInfo)var9);
         }
      } else {
         if (this.communicationDeviceChangedRegistered) {
            this.communicationDeviceChangedRegistered = false;
            f.a(this.androidAudioManager, d.a(this));
         }

         this.androidAudioManager.unregisterAudioDeviceCallback(this.audioDeviceCallback);
         this.androidAudioManager.setMode(0);
      }
   }

   public override fun setSCORetryCount(count: Int) {
      this.scoRetryCount = var1;
   }

   public companion object {
      private final var instance: DiscordAudioManager2?

      public fun getInstance(context: Context): DiscordAudioManager2 {
         q.h(var1, "context");
         if (DiscordAudioManager2.access$getInstance$cp() == null) {
            DiscordAudioManager2.access$setInstance$cp(new DiscordAudioManager2(var1));
         }

         val var2: DiscordAudioManager2 = DiscordAudioManager2.access$getInstance$cp();
         q.e(var2);
         return var2;
      }
   }
}
