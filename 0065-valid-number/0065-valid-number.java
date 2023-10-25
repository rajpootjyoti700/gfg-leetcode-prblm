class Solution {
    public boolean isNumber(String s) {
        boolean hasDigit = false;
        boolean hasExponent = false;
        boolean hasDecimal = false;
        boolean needDigitAfterExponent = false;

        s = s.trim();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'E' && s.charAt(i - 1) != 'e') return false;

            } else if (Character.isDigit(c)) {
                hasDigit = true;
                needDigitAfterExponent = false;

            } else if (c == '.') {
                if (hasDecimal || hasExponent) return false;
                hasDecimal = true;

            } else if (c == 'E' || c == 'e') {
                if (hasExponent || !hasDigit) return false;
                hasExponent = true;
                needDigitAfterExponent = true;

            } else return false;
        }

        return !needDigitAfterExponent && hasDigit;
    }
}