import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] nums = new int[5];

    for(int i = 0; i < 5; i++){
        System.out.println("Digite um número inteiro: ");
        nums[i] = scanner.nextInt();
    }
    Arrays.sort(nums);

    System.out.println("Números em ordem crescente: ");
    for (int num : nums){
        System.out.println(num + " ");
    }
    }
}