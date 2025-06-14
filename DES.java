
public static String decToBin(int n) {
    String bin = Integer.toBinaryString(n);
    while (bin.length() < 4) {
        bin = "0" + bin;
    }
    return bin;
}
public final int[] PC1 = {
        57,49,41,33,25,17,9,
        1,58,50,42,34,26,18,
        10,2,59,51,43,35,27,
        19,11,3,60,52,44,36,
        63,55,47,39,31,23,15,
        7,62,54,46,38,30,22,
        14,6,61,53,45,37,29,
        21,13,5,28,20,12,4
};

public final int[] numLeftShift = {
        1, 1, 2, 2, 2, 2, 2, 2,
        1, 2, 2, 2, 2, 2, 2, 1
};

public final int[] PC2 = {
        14,17,11,24,1,5,
        3,28,15,6,21,10,
        23,19,12,4,26,8,
        16,7,27,20,13,2,
        41,52,31,37,47,55,
        30,40,51,45,33,48,
        44,49,39,56,34,53,
        46,42,50,36,29,32
};

public final int[] IP = {
        58,50,42,34,26,18,10,2,
        60,52,44,36,28,20,12,4,
        62,54,46,38,30,22,14,6,
        64,56,48,40,32,24,16,8,
        57,49,41,33,25,17,9,1,
        59,51,43,35,27,19,11,3,
        61,53,45,37,29,21,13,5,
        63,55,47,39,31,23,15,7
};

public final int[] E = {
        32,1,2,3,4,5,
        4,5,6,7,8,9,
        8,9,10,11,12,13,
        12,13,14,15,16,17,
        16,17,18,19,20,21,
        20,21,22,23,24,25,
        24,25,26,27,28,29,
        28,29,30,31,32,1
};

public final int[][][] S = {
        {
                {14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7},
                {0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8},
                {4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0},
                {15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13}
        },
        {
                {15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10},
                {3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},
                {0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},
                {13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9}
        },
        {
                {10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},
                {13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},
                {13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},
                {1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12}
        },
        {
                {7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},
                {13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},
                {10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4},
                {3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14}
        },
        {
                {2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},
                {14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},
                {4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},
                {11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3}
        },
        {
                {12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},
                {10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8},
                {9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},
                {4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13}
        },
        {
                {4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},
                {13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},
                {1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},
                {6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12}
        },
        {
                {13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},
                {1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},
                {7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},
                {2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}
        }
};

public final int[] P = {
        16,7,20,21,
        29,12,28,17,
        1,15,23,26,
        5,18,31,10,
        2,8,24,14,
        32,27,3,9,
        19,13,30,6,
        22,11,4,25
};

public final int[] IP_1 = {
        40,8,48,16,56,24,64,32,
        39,7,47,15,55,23,63,31,
        38,6,46,14,54,22,62,30,
        37,5,45,13,53,21,61,29,
        36,4,44,12,52,20,60,28,
        35,3,43,11,51,19,59,27,
        34,2,42,10,50,18,58,26,
        33,1,41,9,49,17,57,25
};

public class DES {

    public DES() {}

    public String applyPC1(String key64) {
        StringBuilder permutedKey = new StringBuilder();
        for (int i = 0; i < 56; i++) {
            permutedKey.append(key64.charAt(PC1[i] - 1));
        }
        return permutedKey.toString();
    }

    public String shiftLeft(String halfKey, int shifts) {
        String shifted = halfKey;
        for (int i = 0; i < shifts; i++) {
            char firstBit = shifted.charAt(0);
            shifted = shifted.substring(1) + firstBit;
        }
        return shifted;
    }
    public String applyPC2(String combinedHalves) {
        StringBuilder subkey = new StringBuilder();
        for (int i = 0; i < 48; i++) {
            subkey.append(PC2[i] - 1 < combinedHalves.length() ? combinedHalves.charAt(PC2[i] - 1) : '0');
        }
        return subkey.toString();
    }
    public List<String> generateSubkeys(String key64) {
        String key56 = applyPC1(key64);
        String C0 = key56.substring(0, 28);
        String D0 = key56.substring(28, 56);

        List<String> subkeys = new ArrayList<>(16);

        for (int i = 0; i < 16; i++) {
            C0 = shiftLeft(C0, numLeftShift[i]);
            D0 = shiftLeft(D0, numLeftShift[i]);

            String combined = C0 + D0;
            subkeys.add(applyPC2(combined));
        }

        return subkeys;
    }
    public String expand(String r32) {
        StringBuilder expanded = new StringBuilder();
        for (int j = 0; j < 48; j++) {
            expanded.append(r32.charAt(E[j] - 1));
        }
        return expanded.toString();
    }
    public String xorAdd(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < s1.length(); j++) {
            result.append(s1.charAt(j) == s2.charAt(j) ? '0' : '1');
        }
        return result.toString();
    }
    public String sboxWorking(String block, int index) {

        int row = (block.charAt(0) - '0') * 2 + (block.charAt(5) - '0');
        int col = (block.charAt(1) - '0') * 8 + (block.charAt(2) - '0') * 4 +
                (block.charAt(3) - '0') * 2 + (block.charAt(4) - '0');


        int sboxValue = S[index][row][col];


        return decToBin(sboxValue);
    }
    public String sboxSubstitution(String xored) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            String block = xored.substring(i * 6, i * 6 + 6);
            int sboxIndex = i;
            result.append(sboxWorking(block, sboxIndex));
        }
        return result.toString();
    }
    public String permutation(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            result.append(input.charAt(P[i] - 1));
        }
        return result.toString();
    }
    public String fFunction(String rightHalf, String subkey) {
        String expanded = expand(rightHalf);
        String xored = xorAdd(expanded, subkey);
        String sboxResult = sboxSubstitution(xored);
        return permutation(sboxResult);
    }
    public String applyIP(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 64; i++) {
            output.append(input.charAt(IP[i] - 1));
        }
        return output.toString();
    }
    public String finalPermutation(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 64; i++) {
            result.append(input.charAt(IP_1[i] - 1));
        }
        return result.toString();
    }
    public String encrypt(String plaintext, String key, boolean b) {

        List<String> subkeyList = generateSubkeys(key);
        String[] subkeys = new String[16];
        for (int i = 0; i < 16; i++) {
            subkeys[i] = subkeyList.get(i);
        }


        String permutedInput = applyIP(plaintext);
        String left = permutedInput.substring(0, 32);
        String right = permutedInput.substring(32, 64);


        if (b) {
            for (int i = 0; i < 16; i++) {
                String fResult = fFunction(right, subkeys[i]);
                String newLeft = right;
                String newRight = xorAdd(left, fResult);
                left = newLeft;
                right = newRight;
            }
        } else {
            for (int i = 15; i >= 0; i--) {
                String fResult = fFunction(right, subkeys[i]);
                String newLeft = right;
                String newRight = xorAdd(left, fResult);
                left = newLeft;
                right = newRight;
            }
        }


        String combined = right + left;
        String ciphertext = finalPermutation(combined);
        return ciphertext;
    }

};


public void main() {



     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter 8-character plaintext: ");
     String plaintext = scanner.nextLine();
     System.out.print("Enter 8-character secret key: ");
     String key = scanner.nextLine();


    DES des  = new DES() ;


    String ciphertext = des.encrypt(plaintext, key, true);
    String decryptedBinary = des.encrypt(ciphertext, key, false);

    System.out.println("\nOriginal Text (Binary):  " + plaintext);
    System.out.println("Encrypted Text (Binary): " + ciphertext);
    System.out.println("Decrypted Text (Binary): " + decryptedBinary);
}
