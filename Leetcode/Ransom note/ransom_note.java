class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var charactersAvailable = new int[26];
        for (var ch : magazine.toCharArray()) charactersAvailable[ch - 'a'] += 1;
        for (var ch : ransomNote.toCharArray()) if (charactersAvailable[ch - 'a']-- <= 0) return false;
        return true;
    }
}