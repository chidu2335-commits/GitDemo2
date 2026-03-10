package automation_basics;

public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int arr[] = new int[3];
            arr[5] = 10;   // Array Index Exception
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        catch (Exception e) {
            System.out.println("General Exception");
        }
    }
    
    

	}


