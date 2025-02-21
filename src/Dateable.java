public class Dateable {

  public static void main(String[] args) {
      // Write your code below, inside the main method
    Scanner scanner= new Scanner(System.in);
    System.out.println("Please enter your age");
    int age= scanner.nextInt();
    int num1= age/2;
    int least= num1+7;
    System.out.println(age+"years old should date someone who is at least"+least+"years old") ;
    
  }
  
}
