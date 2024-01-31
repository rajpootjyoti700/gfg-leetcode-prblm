class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        var stack = new Stack<Integer>();
    var ans = new int[temperatures.length];

    for (var i=0; i < temperatures.length; i++) {
      while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
        var a = stack.pop();
        ans[a] = i-a;
      }
      stack.push(i);
    }
    return ans;
    }
}