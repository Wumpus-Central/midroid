package com.discord.billing

public sealed class BillingManagerException protected constructor(reason: String, errorCode: String) : Exception(var1) {
   public final val reason: String
   public final val errorCode: String

   init {
      this.reason = var1;
      this.errorCode = var2;
   }

   public class BillingClientNotReadyException : BillingManagerException("Billing client is not ready yet", "999")

   public class BillingException(message: String) : BillingManagerException(var1, "5000")

   public class BillingUnavailableException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Billing service unavailable due to user error, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public companion object {
      public fun fromBillingResult(responseCode: Int): BillingManagerException {
         var var2: Any;
         if (var1 != -2) {
            if (var1 != -1) {
               if (var1 != 12) {
                  switch (var1) {
                     case 2:
                        var2 = new BillingManagerException.ServiceUnavailableException(var1);
                        break;
                     case 3:
                        var2 = new BillingManagerException.BillingUnavailableException(var1);
                        break;
                     case 4:
                        var2 = new BillingManagerException.ItemUnavailableException(var1);
                        break;
                     case 5:
                        var2 = new BillingManagerException.DeveloperErrorException(var1);
                        break;
                     case 6:
                        var2 = new BillingManagerException.GenericErrorException(var1);
                        break;
                     case 7:
                        var2 = new BillingManagerException.ItemAlreadyOwnedException(var1);
                        break;
                     case 8:
                        var2 = new BillingManagerException.ItemNotOwnedException(var1);
                        break;
                     default:
                        var2 = new BillingManagerException.UnknownBillingException(var1);
                  }
               } else {
                  var2 = new BillingManagerException.NetworkErrorException(var1);
               }
            } else {
               var2 = new BillingManagerException.ServiceDisconnectedException(var1);
            }
         } else {
            var2 = new BillingManagerException.FeatureNotSupportedException(var1);
         }

         return (BillingManagerException)var2;
      }

      public fun wrap(e: Exception, context: String): BillingManagerException {
         if (var1 is BillingManagerException) {
            var1 = var1;
         } else {
            val var5: java.lang.String = var1.getMessage();
            val var3: StringBuilder = new StringBuilder();
            var3.append(var2);
            var3.append(" exception: ");
            var3.append(var5);
            var1 = new BillingManagerException.BillingException(var3.toString());
         }

         return var1;
      }
   }

   public class DeveloperErrorException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Developer error, the request is not valid, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class FeatureNotSupportedException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Feature not supported, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class GenericErrorException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("An error occurred in the billing process, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class ItemAlreadyOwnedException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("The item is already owned, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class ItemNotOwnedException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("The item is not owned, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class ItemUnavailableException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Item is not available for purchase, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class NetworkErrorException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Network error, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class ServiceDisconnectedException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Billing service disconnected, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class ServiceUnavailableException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Google Play Billing Service unavailable, Google Error Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }

   public class UnknownBillingException(code: Int) : BillingManagerException {
      init {
         val var2: StringBuilder = new StringBuilder();
         var2.append("Unhandled billing exception. Code: ");
         var2.append(var1);
         super(var2.toString(), java.lang.String.valueOf(var1), null);
      }
   }
}
