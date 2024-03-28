package com.example.bitcoinmining.service;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.kits.WalletAppKit;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.wallet.Wallet;
import org.springframework.stereotype.Service;

import java.io.File;

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

            // Start the WalletAppKit synchronously
            kit.start();

            // Wait for the WalletAppKit to be ready
            kit.awaitRunning();

            // Get the wallet balance
            Wallet wallet = kit.wallet();
            return wallet.getBalance().getValue() / 1e8; // Convert Satoshi to Bitcoin
        } catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
            return 0.0; // Return a default balance or handle the error gracefully
        }
    }
}
