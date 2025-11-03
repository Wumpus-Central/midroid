package com.discord.audio

public final var audioDeviceTypeToSimpleMapping: MutableMap<Int, SimpleDeviceType>
   internal set

public fun audioDeviceInfoToString(type: Int): String {
   switch (var0) {
      case 0:
         return "TYPE_UNKNOWN";
      case 1:
         return "TYPE_BUILTIN_EARPIECE";
      case 2:
         return "TYPE_BUILTIN_SPEAKER";
      case 3:
         return "TYPE_WIRED_HEADSET";
      case 4:
         return "TYPE_WIRED_HEADPHONES";
      case 5:
         return "TYPE_LINE_ANALOG";
      case 6:
         return "TYPE_LINE_DIGITAL";
      case 7:
         return "TYPE_BLUETOOTH_SCO";
      case 8:
         return "TYPE_BLUETOOTH_A2DP";
      case 9:
         return "TYPE_HDMI";
      case 10:
         return "TYPE_HDMI_ARC";
      case 11:
         return "TYPE_USB_DEVICE";
      case 12:
         return "TYPE_USB_ACCESSORY";
      case 13:
         return "TYPE_DOCK";
      case 14:
         return "TYPE_FM";
      case 15:
         return "TYPE_BUILTIN_MIC";
      case 16:
         return "TYPE_FM_TUNER";
      case 17:
         return "TYPE_TV_TUNER";
      case 18:
         return "TYPE_TELEPHONY";
      case 19:
         return "TYPE_AUX_LINE";
      case 20:
         return "TYPE_IP";
      case 21:
         return "TYPE_BUS";
      case 22:
         return "TYPE_USB_HEADSET";
      case 23:
         return "TYPE_HEARING_AID";
      case 24:
         return "TYPE_BUILTIN_SPEAKER_SAFE";
      case 25:
         return "TYPE_REMOTE_SUBMIX";
      case 26:
         return "TYPE_BLE_HEADSET";
      case 27:
         return "TYPE_BLE_SPEAKER";
      case 28:
      default:
         return "";
      case 29:
         return "TYPE_HDMI_EARC";
      case 30:
         return "TYPE_BLE_BROADCAST";
      case 31:
         return "TYPE_DOCK_ANALOG";
   }
}
