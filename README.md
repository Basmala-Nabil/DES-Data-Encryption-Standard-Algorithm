🔐 DES (Data Encryption Standard) Algorithm

📘 Overview

DES (Data Encryption Standard) is a symmetric-key block cipher developed by IBM in the 1970s and later adopted by the U.S. government as a standard for secure data encryption. It encrypts data in 64-bit blocks using a 64-bit key (56 bits used for encryption, 8 bits for parity checking).


🧠 How It Works

DES is based on the Feistel network structure and operates through 16 rounds of processing. Here's the breakdown:

Initial Permutation (IP): The input 64-bit plaintext block is permuted using a fixed table.

Splitting: The permuted block is split into two 32-bit halves: Left (L) and Right (R).

Rounds (16 Total):

In each round:

The right half is expanded to 48 bits using the Expansion (E) table.

The expanded right half is XORed with a round key (48 bits).

The result passes through 8 S-boxes to reduce it back to 32 bits.

The output is then permuted using the P-box.

The result is XORed with the left half.

The two halves are swapped.

Final Permutation (IP⁻¹): After 16 rounds, the two halves are combined and passed through the inverse of the initial permutation to produce the final ciphertext.


🔑 Key Generation (Key Schedule)

A 64-bit key is used (56 bits + 8 parity bits).

PC-1 Table selects 56 bits from the original key.

The 56-bit key is split into two halves (C and D, 28 bits each).

Each half is shifted left based on a shift schedule.

PC-2 Table selects 48 bits from the combined C and D to form the round key.

This process is repeated to generate 16 subkeys for the 16 rounds.


🔁 Encryption vs. Decryption

Encryption: Runs through all 16 rounds using the subkeys in normal order.

Decryption: Uses the same process but applies the subkeys in reverse order.


⚙️ Technical Specs

Feature	Value

Block Size	64 bits

Key Size	64 bits (56 used)

Rounds	16

Key Type	Symmetric


⚠️ Security Notice

Although DES was a strong encryption standard in the past, it's no longer considered secure due to its short key length (56 bits), making it vulnerable to brute-force attacks.
Modern systems now use AES (Advanced Encryption Standard) as a more secure alternative.


📂 Project Features

This project implements the DES algorithm in Java (or C++, depending on your code) and includes:

All standard tables: IP, IP⁻¹, PC-1, PC-2, E, S-boxes, P.

Subkey generation for 16 rounds.

Encryption and decryption logic.

Display of intermediate steps for educational purposes.


👤 Author

Developed by Basmala Nabil El-Sayed

Faculty of Computer Science – Cairo University (International Branch)

Department: Networking and Cybersecurity
