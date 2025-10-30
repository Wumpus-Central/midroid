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
         if (var1 != -2) {
            if (var1 != -1) {
               if (var1 != 12) {
                  switch (var1) {
                     case 2:
                        return new BillingManagerException.ServiceUnavailableException(var1);
                     case 3:
                        return new BillingManagerException.BillingUnavailableException(var1);
                     case 4:
                        return new BillingManagerException.ItemUnavailableException(var1);
                     case 5:
                        return new BillingManagerException.DeveloperErrorException(var1);
                     case 6:
                        return new BillingManagerException.GenericErrorException(var1);
                     case 7:
                        return new BillingManagerException.ItemAlreadyOwnedException(var1);
                     case 8:
                        return new BillingManagerException.ItemNotOwnedException(var1);
                     default:
                        return new BillingManagerException.UnknownBillingException(var1);
                  }
               } else {
                  return new BillingManagerException.NetworkErrorException(var1);
               }
            } else {
               return new BillingManagerException.ServiceDisconnectedException(var1);
            }
         } else {
            return new BillingManagerException.FeatureNotSupportedException(var1);
         }
      }

      public fun wrap(e: Exception, context: String): BillingManagerException {
         if (var1 is BillingManagerException) {
            return var1 as BillingManagerException;
         } else {
            val var3: java.lang.String = var1.getMessage();
            val var4: StringBuilder = new StringBuilder();
            var4.append(var2);
            var4.append(" exception: ");
            var4.append(var3);
            return new BillingManagerException.BillingException(var4.toString());
         }
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
