
package com.example.bitcoinmining.service;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.kits.WalletAppKit;
import org.bitcoinj.params.MainNetParams;
import org.springframework.stereotype.Service;
import java.io.File;

import com.example.bitcoinmining.model.Wallet;
//Import necessary libraries


@Service
public class WalletService {

 public double getWalletBalance() {
     try {
         // Connect to the Bitcoin network
         NetworkParameters params = MainNetParams.get();

         // Specify directory for blockchain data and wallet files
         File directory = new File(".");
         String filePrefix = "BitcoinMiningApp"; // Prefix for wallet and blockchain files

         // Create WalletAppKit
         WalletAppKit kit = new WalletAppKit(params, directory, filePrefix) {
             @Override
             protected void onSetupCompleted() {
                 // Print a message when setup is completed
                 System.out.println("WalletAppKit setup completed");
             }
         };

         // Start the WalletAppKit asynchronously
         ListenableFuture<Wallet> future = kit.startAsync();

         // Add a callback to wait for the WalletAppKit to be ready
         Futures.addCallback(future, new FutureCallback<Wallet>() {
             @Override
             public void onSuccess(Wallet wallet) {
                 // Get the wallet balance
                 double balance = wallet.getBalance().getValue() / 1e8; // Convert Satoshi to Bitcoin
                 System.out.println("Wallet balance: " + balance);
             }

             @Override
             public void onFailure(Throwable t) {
                 // Handle failure
                 t.printStackTrace();
             }
         });

         // Return a placeholder value for now
         return 0.0;
     } catch (Exception e) {
         // Handle any exceptions
         e.printStackTrace();
         return 0.0; // Return a default balance or handle the error gracefully
     }
 }
}
