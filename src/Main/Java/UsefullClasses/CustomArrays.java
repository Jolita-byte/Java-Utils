package UsefullClasses;

public class CustomArrays {
    private int[] ints;

    public CustomArrays() {
        ints = new int[0];
    }

    public CustomArrays(int[] ints) {
        this.ints = ints;
    }

    public void add(int number){
        int [] biggerArray = new int[ints.length+1];
        for (int i = 0; i < ints.length; i++){
            biggerArray [i] = ints[i];
        }
        biggerArray [biggerArray.length-1] = number;
        ints = biggerArray;
    }

    public void removeAt(int index){
        int [] smallerArray = new int[ints.length-1];
        for (int i = 0, k = 0; i < ints.length; i++){
            if (i == index) {
                continue;
            }
            smallerArray[k++] = ints[i];
        }
        ints = smallerArray;
    }

    public boolean any() {
        return ints.length > 0;
    }

    public int[] getAll() {
        return ints;
    }
}
