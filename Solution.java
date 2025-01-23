class Solution {
    public List<String> cellsInRange(String s) {
        // Column points
        char s0 = s.charAt(0);
        char s3 = s.charAt(3);
        // s0++;
        // System.out.println(s0);

        // Row points
        char s1 = s.charAt(1);
        char s4 = s.charAt(4);
        // System.out.println((s1 - '0' + 1));
       
        
        // Manipulate metrics
        int totalColumn = s3 - s0 + 1;
        int totalRow = s4 - s1 + 1;

        // Init list result
        List<String> res = new ArrayList<>();

        // Looping each metric to manipulate ouput
        for(int i = 0; i < totalColumn; i++) {
            String cell = "";
            for(int j = 0; j < totalRow; j++) {
                cell = s0 + "";
                cell = cell + (s1 - '0' + j);
                res.add(cell);
            }
            s0++;
        }

        return res;
    }
}
