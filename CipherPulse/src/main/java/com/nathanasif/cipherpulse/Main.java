package com.nathanasif.cipherpulse;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("       CIPHER PULSE : Utility CLI       ");
        System.out.println("========================================");

        String sampleText = "NathanAsif-Lab2";
        
        String hashed = CipherUtils.sha256(sampleText);
        String encoded = CipherUtils.encodeBase64(sampleText);
        String decoded = CipherUtils.decodeBase64(encoded);

        System.out.println("[+] Target Text : " + sampleText);
        System.out.println("[+] SHA-256 Hash: " + hashed);
        System.out.println("[+] Base64 Enc  : " + encoded);
        System.out.println("[+] Base64 Dec  : " + decoded);
        System.out.println("========================================");
    }
}
