class Perfect
 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("First " + n + " perfect numbers are:");
        int num = 2;
        while (n > 0) {
            int sum = 1;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
                n--;
            }
            num++;
        }
    }
}

