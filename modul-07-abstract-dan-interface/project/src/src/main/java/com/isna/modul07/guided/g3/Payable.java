
package com.isna.modul07.guided.g3;

public interface Payable {
    double getPaymentAmount();

    // Default method
    default void printReceipt() {
        System.out.println("Struk Resmi - Total: Rp" + getPaymentAmount());
    }

    // Static method
    static void logTransaction(String message) {
        System.out.println("[AUDIT LOG] " + message);
    }
}
