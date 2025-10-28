package com.discord.codegen;

import H3.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeMediaEngineModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeMediaEngineModule";

   public NativeMediaEngineModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void addListener(String var1);

   @ReactMethod
   @a
   public abstract void connectionInstanceConfigureConnectionRetries(double var1, double var3, double var5, double var7);

   @ReactMethod
   @a
   public abstract void connectionInstanceDestroy(double var1);

   @ReactMethod
   @a
   public abstract void connectionInstanceDestroyUser(double var1, String var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceExecuteSecureFramesTransition(double var1, double var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceFastUdpReconnect(double var1);

   @ReactMethod
   @a
   public abstract void connectionInstanceGetEncryptionModes(double var1, Callback var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceGetFilteredStats(double var1, double var3, Callback var5);

   @ReactMethod
   @a
   public abstract void connectionInstanceGetMLSKeyPackageB64(double var1, Callback var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceGetMLSPairwiseFingerprintB64(double var1, double var3, String var5, Callback var6);

   @ReactMethod
   @a
   public abstract void connectionInstanceGetStats(double var1, Callback var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceMergeUsers(double var1, ReadableArray var3);

   @ReactMethod
   @a
   public abstract void connectionInstancePrepareMLSCommitTransitionB64(double var1, double var3, String var5, Callback var6);

   @ReactMethod
   @a
   public abstract void connectionInstancePrepareSecureFramesEpoch(double var1, String var3, double var4, String var6);

   @ReactMethod
   @a
   public abstract void connectionInstancePrepareSecureFramesTransition(double var1, double var3, double var5, Callback var7);

   @ReactMethod
   @a
   public abstract void connectionInstanceProcessMLSProposalsB64(double var1, String var3, Callback var4);

   @ReactMethod
   @a
   public abstract void connectionInstanceProcessMLSWelcomeB64(double var1, double var3, String var5, Callback var6);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetDesktopSource(double var1, String var3, boolean var4, String var5);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetLocalMute(double var1, String var3, boolean var4);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetLocalPan(double var1, String var3, double var4, double var6);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetLocalVolume(double var1, String var3, double var4);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetMinimumOutputDelay(double var1, double var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetNoInputThreshold(double var1, double var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetPTTActive(double var1, boolean var3, boolean var4);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetPingInterval(double var1, double var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetSelfDeafen(double var1, boolean var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetSelfMute(double var1, boolean var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetTransportOptions(double var1, ReadableMap var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceSetVideoBroadcast(double var1, boolean var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceTriggerOnSpeakingCallback(double var1);

   @ReactMethod
   @a
   public abstract void connectionInstanceTriggerOnVideoCallback(double var1);

   @ReactMethod
   @a
   public abstract void connectionInstanceUpdateMLSExternalSenderB64(double var1, String var3);

   @ReactMethod
   @a
   public abstract void connectionInstanceWasRemoteDisconnected(double var1);

   @ReactMethod
   @a
   public abstract void createOwnStreamConnectionWithOptions(double var1, String var3, ReadableMap var4, Callback var5);

   @ReactMethod
   @a
   public abstract void createVoiceConnectionWithOptions(double var1, String var3, ReadableMap var4, Callback var5);

   @ReactMethod
   @a
   public abstract void getAudioSubsystem(Callback var1);

   @ReactMethod
   @a
   public abstract void getCodecCapabilities(Callback var1);

   @ReactMethod
   @a
   public abstract void getCodecSurvey(Callback var1);

   @a
   public final Map<String, Object> getConstants() {
      Map var1 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var2 = new HashSet<>(Arrays.asList("AVAudioSessionMode", "DegradationPreference", "SupportedSecureFramesProtocolVersion", "supportedFeatures"));
         HashSet var3 = new HashSet();
         HashSet var4 = new HashSet(var1.keySet());
         var4.removeAll(var2);
         var4.removeAll(var3);
         if (!var4.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var4));
         }

         var2.removeAll(var1.keySet());
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var2));
         }
      }

      return var1;
   }

   @ReactMethod
   @a
   public abstract void getInputDevices(Callback var1);

   @ReactMethod
   @a
   public abstract void getMLSSigningKeyB64(String var1, double var2, Callback var4);

   public String getName() {
      return "NativeMediaEngineModule";
   }

   @ReactMethod
   @a
   public abstract void getOutputDevices(Callback var1);

   @ReactMethod
   @a
   public abstract void getSupportedVideoCodecs(Callback var1);

   protected abstract Map<String, Object> getTypedExportedConstants();

   @ReactMethod
   @a
   public abstract void getVideoInputDevices(Callback var1);

   @ReactMethod
   @a
   public abstract void initializeEngine();

   @ReactMethod
   @a
   public abstract void rankRtcRegions(ReadableArray var1, Callback var2);

   @ReactMethod
   @a
   public abstract void removeListeners(double var1);

   @ReactMethod
   @a
   public abstract void setAVAudioSessionMode(String var1);

   @ReactMethod
   @a
   public abstract void setAudioInputEnabled(boolean var1);

   @ReactMethod
   @a
   public abstract void setBroadcastThumbnailParams(double var1, double var3, double var5);

   @ReactMethod
   @a
   public abstract void setEmitVADLevel2(boolean var1);

   @ReactMethod
   @a
   public abstract void setHasFullbandPerformance(boolean var1);

   @ReactMethod
   @a
   public abstract void setInputDevice(double var1);

   @ReactMethod
   @a
   public abstract void setInputDeviceById(String var1);

   @ReactMethod
   @a
   public abstract void setInputVolume(double var1);

   @ReactMethod
   @a
   public abstract void setNoInputThreshold(double var1);

   @ReactMethod
   @a
   public abstract void setOffloadAdmControls(boolean var1);

   @ReactMethod
   @a
   public abstract void setOutputDevice(double var1);

   @ReactMethod
   @a
   public abstract void setOutputDeviceById(String var1);

   @ReactMethod
   @a
   public abstract void setOutputVolume(double var1);

   @ReactMethod
   @a
   public abstract void setSidechainCompression(boolean var1);

   @ReactMethod
   @a
   public abstract void setTransportOptions(ReadableMap var1);

   @ReactMethod
   @a
   public abstract void setVideoInputDevice(double var1);

   @ReactMethod
   @a
   public abstract void setVideoInputDeviceById(String var1);

   @ReactMethod
   @a
   public abstract void startBroadcast();

   @ReactMethod
   @a
   public abstract void startLocalAudioRecording(ReadableMap var1, Callback var2);

   @ReactMethod
   @a
   public abstract void stopBroadcast();

   @ReactMethod
   @a
   public abstract void stopBroadcastWithError(double var1, String var3);

   @ReactMethod
   @a
   public abstract void stopLocalAudioRecording(Callback var1);

   @ReactMethod
   @a
   public abstract void updateFieldTrial(String var1, String var2);
}
