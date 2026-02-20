class Main {
    public static int sqrt(int x){
        if(x == 1 || x == 0){
            return x;
        }
        
        long left = 1;
        long right = x;
        long ans = 0;
        
        while(left <= right){
            long mid = left+(right - left)/2;
            long square = mid * mid;
            
            if(square == x){
                return (int) mid;
            }
            else if (square < x){
                ans = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int x = 16;
        int ans = sqrt(x);
        System.out.println(ans);
    }
}
