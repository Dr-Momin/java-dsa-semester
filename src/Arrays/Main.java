package Arrays;

public class Main {
    public static void main(String[] args) {


//        int[] arr = {1, 5, 9, 2, 4, 7};

        MyArray myArray = new MyArray(5);

//        myArray.insert(0,2);
//        myArray.insert(1,4);
//        myArray.insert(2,3);
//        myArray.insert(3,8);
//        myArray.insert(4, 9);
//
//
//        int search = myArray.search(8);
////        System.out.println(search);
//
//        myArray.sort();
//
////        System.out.println(myArray.arr.toString());
//
//        for (int i = 0; i < myArray.arr.length; i++) {
//            System.out.print(myArray.arr[i] + " ");
//        }


        MyArray2D myArray2D = new MyArray2D(2, 2);

        myArray2D.insert(0, 0, 1);
        myArray2D.insert(0, 1, 4);
        myArray2D.insert(1, 0, 8);
        myArray2D.insert(1, 1, 9);



        for (int i = 0; i < myArray2D.arr.length; i++) {
            for (int j = i; j < myArray2D.arr.length; j++) {
                System.out.println(myArray2D.arr[i][j]);
            }
        }



    }
}
