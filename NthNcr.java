import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        
        // Initialize the first element (C(rowIndex, 0) = 1)
        int ans = 1;
        res.add(ans);
        
        // Compute the first half of the row
        for (int i = 1; i <= rowIndex / 2; i++) {
            ans = ans * (rowIndex - i + 1) / i;
            res.add(ans);
        }
        
        // Reflect the first half for the second half of the row
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
            res.add(res.get(rowIndex - i));
        }
        
        return res;
    }
}
