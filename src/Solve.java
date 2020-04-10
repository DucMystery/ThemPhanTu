import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myArr[] = {1,2,3,4,5,6};

        System.out.println("Mời nhập vào giá trị cần thêm:");
        int number = scanner.nextInt();
        System.out.println("Mời nhập vào vị trí cần thêm:");
        int index = scanner.nextInt();

        themPhanTu(myArr,number,index);

    }

    static void themPhanTu(int arr[],int n,int viTri){
        int width =arr.length;
        int newArr[]= new int[arr.length+1];
        if (viTri<0|| viTri>arr.length-1){
            System.out.println("Ko the chen gia tri vao mang!");
        }else{
            for (int i=width;i>viTri;i--){
                newArr[i]=arr[i-1];
            }
            for (int i=0;i<viTri;i++){
                newArr[i] =arr[i];
            }
            newArr[viTri] =n;
            ++width;
            System.out.println("Mảng sau khi chèn là:");
            for (int j=0;j<width;j++){
                System.out.print(newArr[j]+"\t");
            }
        }
    }
}
