// 8.16
public class HugeInteger {
    private int[] digits = new int[40]; 

   
    public HugeInteger() {}

   
    public HugeInteger(String s) {
        parse(s);
    }

    
    public void parse(String s) {
        for (int i = 0; i < 40; i++) digits[i] = 0;
        int start = 40 - s.length();
        for (int i = 0; i < s.length(); i++) {
            digits[start + i] = s.charAt(i) - '0';
        }
    }

    public String toString() {
        String result = "";
        boolean leadingZero = true;
        for (int d : digits) {
            if (d!= 0) leadingZero = false;
            if (!leadingZero) result += d;
        }
        return result.equals("")? "0" : result;
    }

    
    public HugeInteger add(HugeInteger h) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = 39; i >= 0; i--) {
            int sum = this.digits[i] + h.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

   
    public HugeInteger subtract(HugeInteger h) {
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = 39; i >= 0; i--) {
            int diff = this.digits[i] - h.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    
    public boolean isEqualTo(HugeInteger h) {
        for (int i = 0; i < 40; i++)
            if (this.digits[i]!= h.digits[i]) return false;
        return true;
    }

    public boolean isNotEqualTo(HugeInteger h) { return!isEqualTo(h); }

    public boolean isGreaterThan(HugeInteger h) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] > h.digits[i]) return true;
            if (this.digits[i] < h.digits[i]) return false;
        }
        return false;
    }

    public boolean isLessThan(HugeInteger h) {
        return!isGreaterThan(h) &&!isEqualTo(h);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger h) {
        return isGreaterThan(h) || isEqualTo(h);
    }

    public boolean isLessThanOrEqualTo(HugeInteger h) {
        return isLessThan(h) || isEqualTo(h);
    }

    public boolean isZero() {
        for (int d : digits) if (d!= 0) return false;
        return true;
    }
}