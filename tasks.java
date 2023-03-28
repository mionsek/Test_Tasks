
// 1. Write a class "Rectangle" with all necessary methods and fields, so that this piece of code would work:

public class Tasks {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area: " + rectangle.area()); // output: 12
    }
}

// 2. Write a program that searches the list of 'capitals' and checks if 'London' is in it. If so, the program should output "True", otherwise it should output "False".
// The program can be written in 2 ways: using a loop, and using streams;

    List<String> capitals = new ArrayList<>(
            Arrays.asList("Paris", "Warsaw", "Berlin", "Moscow", "London", "Madrid"));


// 3. Write a program that tries to convert each element to a Double from the given String array.
// If this is not possible, the program should write "Not possible to convert string 'A' to double",
// where 'A' is our String and move on to the next element in array.

    String[] array = new String[]{"3.14", "2.0", "XYZ", "0.5", "ABC", "10.1"};

