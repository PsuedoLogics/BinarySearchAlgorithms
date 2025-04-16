public class BinarySearchSecondAttempt {

    int[] sArray = new int[100];
    int start, end;
    int target = (int) (Math.random() * 100 + 1);
    void fill()
    {
        int i = 0;
        while(i < 100){
            sArray[i] = i;
            i++;
        }
        start = 0;
        end = sArray.length - 1;
        System.out.println("Array filled and target is: " + target);
    }

    int search(int start, int end, int target)
    {
        if(start > end)
            return -1;

        int middle = start + (end - start) / 2;

        if(target == sArray[middle])
            return middle;
        if(target > sArray[middle])
        {
            return search(middle, end, target);
        }

        return search(start, middle, target);
    }

    public static void main(String[] args) {
        BinarySearchSecondAttempt bst = new BinarySearchSecondAttempt();
        bst.fill();
        System.out.println(bst.search(bst.start, bst.end, bst.target));
    }

}
