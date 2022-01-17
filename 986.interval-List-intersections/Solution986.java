class Solution986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList();
        if (firstList.length == 0 || secondList.length == 0) {
            return result.stream().toArray(int[][]::new);
        }

        int i = 0, j = 0; 
        while (i < firstList.length && j < secondList.length) {
            if (firstList[i][1] < secondList[j][0]) {
                i++;
            } else if (secondList[j][1] < firstList[i][0]) {
                j++;
            } else {
                int start = Math.max(firstList[i][0], secondList[j][0]);
                int end = Math.min(firstList[i][1], secondList[j][1]);
                result.add(new int[]{start, end});
                if (firstList[i][1] < secondList[j][1]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return result.stream().toArray(int[][]::new);
    }
}
