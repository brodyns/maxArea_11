public class Main {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = {1, 1};
        System.out.println((new Solution()).maxArea(height));
    }
}

class Solution{
    public int maxArea(int[] height){
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while(i < j){
            area = height[i] < height[j] ?
                    Math.max(area, (j - i) * height[i++]):
                    Math.max(area, (j - i) * height[j--]);
        }
        return area;
    }
}
