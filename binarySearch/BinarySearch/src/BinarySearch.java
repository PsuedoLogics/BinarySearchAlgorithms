public class BinarySearch {

    int[] sortedArray = new int[30];
    int target = (int) (Math.random() * (30 + 1));
    int start, end;
    private void fill(){
        for(int i = 0; i < 30; i++){
            sortedArray[i] = i;
        }
        System.out.println(target);
        start = 0;
        end = sortedArray.length - 1;
    }

    private int search(int target, int start, int end){
        if(start > end)
            return -1;

        int middle =  start + (end - start) / 2;

        if(target == sortedArray[middle]){
            return middle;
        }
        if(target < sortedArray[middle]){
            return search(target, start, middle - 1);
        }

        return search(target, middle + 1, end);

    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.fill();
        System.out.println(bs.search(bs.target, bs.start, bs.end));

    }
}
