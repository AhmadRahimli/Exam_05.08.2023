# Exam_05.08.2023
1)What is the purpose of the ViewHolder pattern in Android? 
The viewHolder pattern in Android is designed to increase the speed and effectiveness of scrolling in a RecylerView.
2) How do you handle exceptions in kotlin ? Provide an example of a try-catch block for handling a potential exception in your code.
Try-catch blocks can be used in Kotlin to deal with exceptions. The code that might throw an exception is contained in the try block, and the catch block is used to handle the exception if it arises.
fun main() {
    try {
        val numerator = 10
        val denominator = 0
        val result = numerator / denominator
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("An exception occurred: ${e.message}")
    }
}

3)What are Decorative Patterns , and why are they useful ? Demonstrate how you can use Decorative Patterns in Kotlin to add functionality to existing classes.
These patterns offer a structured method to structuring and organizing code, making it simpler to comprehend, maintain, and modify. Decorative patterns are reusable solutions to design issues that arise throughout the creation of software or other creative endeavors.

4)Prepare algorithm to find and eliminate duplicate elements in array

5)What is the purpose of the “let” keyword in Kotlin , give example.
Let keyword in kotlin is one of the scope functions that allow you to execute a code block with the context of an object

Val nullValue:String?=”hello”
nullValue?.let{value ->
print(value)
}

6)Which of the principle (SOLID) is violated in example ? : 



It is liskov principle

7) How can we declare static variables in Kotlin ? 
8) Class MyClass{
Companion object{
Cont val static variable=”hello”
}
}

9) What is Constructors ? How many types of constructors do you know in Kotlin?
A constructor is a special member function that is invoked when an object of the class is created primarily to initialize variables or properties.

9)Explain Usage of Factory Patterns in Kotlin , why do we need it ?
The foundation of the factory method pattern is the definition of abstract methods for a superclass's initialization procedures. Individual Kotlin subclasses are able to specify how they are initialized and constructed thanks to this design approach.


10 ) Implement a HouseFactory class that provides methods for creating different types of houses (Cottage , Villa ,Mansion). Each house type should have its own specific features.

11) What is LiveData ?
Any data can be wrapped in LiveData, including those from objects that implement Collections, like List. The following example illustrates how a getter method is used to access a LiveData object.

12) Explain MVP structure
Using an interface (also known as a contract), View-Presenter and Presenter-Model can communicate with one another.
One View is managed by one Presenter class at a time, hence there is a one-to-one link between the two.
The View class and the Model class are unaware of one another.


13) Find maximum product of two integers in an array

14) What is Singleton pattern? (Code example with short description)
A design pattern called singleton classes is used to limit the number of instances that can be created of a class. In other terms, a singleton class is a class that can only be instantiated once and will always return the same instance of the class as the first try.


15)Create a House class with attributes like the number of rooms,roof,type and color. Then , design a HouseBuilder class to construct House objects . Provide the necessary methods in the builder to set the attributes of the House class

