//@file:JvmName("Demo")

import com.sun.jdi.IntegerType
import java.io.*
import java.util.*



fun main(args : Array<String>) {
//}
//    var a = 'A'..'z'
//
//    for (item in a){
//        println(item)
//    }

    //List

//    var newList = listOf<Int>(1,2,3,4,5,6)
//
//    for ((idx,value) in newList.withIndex()){
//        println("The value of index and value is$idx,$value")
//    }

    //Map

//    var alien = TreeMap<String,Int>()
//    alien["Priyanshu"]=21
//    alien["Raghav"]=34
//    alien["Ramananad"]=44
//
//    for ((name,age) in alien){
//        println("The name is : $name & the age is $age")
//    }

    // Functions

    //1) Normal functions

    // Arguments then return type , Here unit means void
//    fun add(a:Int,b:Int):Int{
//        return a+b
//    }
//
//    val ans = add(23,56)
//
//    println(ans)

    //2) Inline functions/ function expression

//    fun add(a:Int,b:Int):Int=a+b;
//
//    print(add(23,11))

//    3) Type casting in functions


//    fun salary(amount: Int): Int {
//        return (amount + 0.04 * amount).toInt()
//    }

//    4) Default arguments // When no arguments are supplied then defualt will take place
    // But question arises how to call them from Java Code since we would have to make 2 functions here in kotlin
    //code , but the solution is using @JvmOverloads keyword

//    @JvmOverloads // USed for calling from Java
//    fun calAmount(amount:Int,interest:Double=7.0):Int{
//        return (amount+amount*interest).toInt()
//    }

//    var finalAmount = calAmount(10000)
//    print(finalAmount)

    // 5) Named Parameters -> TO pass arguments in specific order not in predefined sequence

//    fun calAmount(amount:Int,interest:Double):Int{
//        return (amount+amount*interest).toInt()
//    }
//
//    print(calAmount(interest = 3.0,amount = 10000));

//    STRING TO INTEGER

//    var str:String = "4"
//
//    // Java way
//    var num:Int = Integer.parseInt(str)
//
//    // Kotlin Way
//    var num1:Int = str.toInt();

    // Exception Handling in Kotlin

    // Normal way
//    var str : String = "4a" ;
//    var num : Int = 0;
//    try {
//        num = str.toInt();
//    }
//    catch(e:Exception){
//        println("Please give proper input")
//    }

    //  Try-catch block as expression

//    var str : String = "4a" ;
//    var num : Int = try{
//        str.toInt()
//    }
//    catch(e:Exception){
//        -1
//    }
//
//    print(num);

    // Extension Functions -> Functions which are not a part of class internally but externally they are a part

//    var a1 = Alien()
//    var a2 = Alien()
//
//    a1.skill = "Java"
//    a2.skill = "SQL"

    // Now we have to make a function plus which adds skills of 2 aliens by taking one alien as an argument and then
    // returns resultant alien.

//    var a3 = a1.plus(a2);
//    println(a3.skill)


    // INFIX FUNCTIONS -> Instead of using a1.plus(a2) , instead we can use a1 plus a2 but in our extension function we
    // have to add keyword infix

//var a1 = Alien()
//    var a2 = Alien()
//
//    a1.skill = "Java"
//    a2.skill = "SQL"

//    var a3 = a1 plus a2
//    println(a3.skill)

    // OPERATOR OVERLOADING -> use operator keyword before infix in function

//var a1 = Alien()
//    var a2 = Alien()
//
//    a1.skill = "Java"
//    a2.skill = "SQL"

//    var a3 = a1+a2
//    println(a3)

    // CONSTRUCTOR

//    IN CLASS PART

// CONSTRUCTORS

    // Even we can remove the constructor keyword as well
//class Student constructor(var _name:String){
//
//    var name : String = _name;
//
//    fun show(){
//        println(name)
//    }
//
//}
//
//    var s1 = Student("Priyanshu")
//    s1.show()
//}

// INHERITANCE IN KOTLIN

    // To inherit base class we
    // 1) Use open keyword as every class is final in Kotlin
    // 2) we have to inherit the primary constructor as well like we used to do in java with super.

//    open class Human {
//        fun think() {
//            println("Real Thinking")
//        }
//    }
//
//    class Child:Human(){
//
//    }
//
//    var c = Child()
//    c.think();

    // Method Overriding
    // 3) All methods are also final in kotlin so we have to use open keyword in functions as well (In case of overrriding)

//    open class Human {
//        open fun think() {
//            println("Real Thinking")
//        }
//    }
//
//    class Child:Human(){
//        override fun think(){
//            println("Virtual Thinking")
//        }
//    }
//
//    var h:Human = Child()
//    h.think();

// Order of constructor calling

//    open class Human() {
//        // Calling primary constructor
//        init{
//            println("In human")
//        }
//        open fun think() {
//            println("Real Thinking")
//        }
//    }
//
//    class Child():Human(){
//        // Calling primary constructor
//        init{
//            println("Inside child")
//        }
//        override fun think(){
//            println("Virtual Thinking")
//        }
//    }
//
//    var h1:Human = Child();

    // Abstract Classes

//    abstract class Human{   // No need to use open keyword here because abstract classes are meant to be inherited/implemented
//        abstract fun think()
//    }
//
//    class Doctor:Human(){  // A class inheriting from abstract class has to either become abstract class
//                           // or implement all abstract methods
//
//        override fun think(){
//            println("Critical thinking")
//        }
//    }
//
//    var h:Human = Doctor()
//    h.think()


//    // Interfaces and multiple inheritance
//
//    interface A{
//        fun show()
//    }
//
//    interface B{
//        fun display()
//    }
//
//    class C:A,B{
//        override fun show(){
//            println("Inside show")
//        }
//
//        override fun display(){
//            println("Inside display")
//        }
//    }
//
//    fun main(args : Array<String>) {
//        var c = C()
//        c.show()
//        c.display()
//    }

// Interfaces and multiple inheritance -> From java 8 default methods also allowed in interfaces WHY ?
// Because if we add a new method suddenly then we have to implement it in all the derived classes . Hence we can
// implement it there itself.

//interface A{
//    fun show()
//
//    fun abc(){
//        println("abc A")
//    }
//}
//
//interface B{
//    fun display()
//
//    fun abc(){
//        println("abc B")
//    }
//}
//
//class C:A,B{
//    override fun show(){
//        println("Inside show")
//    }
//
//    override fun display(){
//        println("Inside display")
//    }
//
//    override fun abc(){ // To remove ambiguity from abc in interfaces A and B we do this step.
////        println("abc C")
//
//        // To call Abc from one of the super class we have to use generics
//        super<A>.abc()
//        super<B>.abc()
//
//
//    }
//}
//
//fun main(args : Array<String>) {
//    var c = C()
//    c.abc()
//
//
//
//}

// DATA CLASS -> To use clone,toString and equals we need to use data keyword at the start of the class

// 1. Every class needs a toString()
// 2.equals and hashCode
// 3.Clone

//data class Laptop(val brand:String , val price : Int){
//
//    fun show(){
//        println("Awesome Laptop")
//    }
//}
//
//fun main() {
//    var l1 = Laptop("Dell",40000)
//    var l2 = Laptop("Hp",50000)
//
//    var l3 = l1.copy()
//    // WHen we need to change the price then we can mention that as well
//    var l4 = l1.copy(price=60000)
//
//    println(l4)
//}

// TAKING INPUT IN KOTLIN

//    var num1 = readLine()
//    println(num1)

//


// Anonymous Inner class


// Concept simillar to anonymous inner class in Java . There we used to have object of the class on RHS here we will
// have with us object class .

//    interface Phone{
//        fun show(){
//            println("Calling")
//        }
//    }
//
//    var obj: Phone = object : Phone {
//        override fun show() {
//            println("Call,sms,camera")
//        }
//    }
//
//    obj.show()

// Companion Object (Also can be used to achieve static properties in kotlin)

//    class A{
//        companion object{
//            // This keyword is used to make static methods
//            @JvmStatic
//            fun show(){
//                println("A ka show")
//            }
//        }
//    }

//    A.show();


// Serialisable


//    class SerialDemo {
    var obj: Save = Save()
    var obj2 = Save()
    obj.i = 8


    val f = File("demo1.txt")
    val fos = FileOutputStream(f)
    val oos = ObjectOutputStream(fos)

    oos.writeObject(obj)


    val fis = FileInputStream(f)
    val ois = ObjectInputStream(fis)


    val returnObj: Save = ois.readObject() as Save
    println("The output is -> " + returnObj.i)
}


    class Save:Serializable {
        var i:Int? = 0
    }



