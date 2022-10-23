fun main(){

//    Var is dynamic so we can reassigned value of variable
    val name = "Ahmad Muji"
    var company : String = "Dicoding"
    company = "dicoding academy"
//    Val can't reassigned value in variable
    val work : String = "Mobile dev "
//    work = "Flutter dev"


//    Operator
    val valueA: Int = 10
    val valueB: Int = 20

    val result : Int = valueA + valueB
//    Char data type
    var character : Char = 'A';
//    println("Character " + character++);
//    println("Character " + character++);
//    println("Character " + character++);
//    println("Character " + character--);
//    println("Character " + character--);
//    println("Character " + character--);
//    println("Character " + character--);
    println("---------")

    val fullName = "Ahmad"
    val firstCharacterOfFullName = fullName[0]

    for( char in fullName){
        println("$char");
    }

    val statement = "Kotlin is \"Awesome\u00A9 !\""
    println(statement)

    val line = """
        Line 1 
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)


//    println("First Character of $fullName is $firstCharacterOfFullName ")





//    println("----LOG----")
//    println(result)
//    println("---------")
//    println("Ahmad Muji sebagai ${work + company}")




//    Function
    println("----Function-----")
    fun setUser(name : String ,age : Int): String{
        return """
            Save User Succes
            Your name $name and your age $age
        """.trimIndent()
    }

    fun setNumber(userNumber : Int) = "Set Number Succes, Your number is $userNumber";

    fun printUser(name : String) : Unit{
        println(name);
    }


    fun traditionalFunction(job : String){
        println("Your job is $job")
    }


    println(setUser("Ahmad Muji",21))
    println(setNumber(87212))
    printUser("Flutter")
    traditionalFunction("Mobile Dev")


    //    If statement
    println("----If statement-----")
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val office =
    if(now > officeOpen){
          "Office still open"
    }else if(now == officeOpen){
        "Wait a minute, office will be open"
    }else{
         "Sorry Office now closed :("
    }

    val isOpen = now > officeOpen
    val isClosed = now < officeOpen || now > officeClosed

    if (!isOpen){
        println("Office close")
    }else{
        println("Office open")
    }

//    println("Office is open : $isOpen")
//    println("Office is Closed : $isClosed")

//    println(office)


//    Int
    println("----Int-----")
//    int
    val intNumber = 100
//    Long
    val longNumber : Long = 100
    val longNumber2 = 100L
//    Short
    val shortNumber3 : Short = 10
//    Byte
    val byteNumber = 0b11010010
//    Double
    val doubleNumber : Double = 1.5
//    Float
    val floatNumber : Float = 0.123456789f //yang terbaca hanya 0.1234567

    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    val numberOne  : Int= 21
    val numberTwo : Int = 20

    println(numberOne + numberTwo)
    println(5+4*5)
    print((5 + 4) * 4)

    val byteNumbe2r2: Byte = 1
    val intNumber22: Int = byteNumbe2r2.toInt() // compile error

    println(intNumber22);

    val stringNumber = "23"
    val intNumberMurni = 3

    println(intNumberMurni + stringNumber.toInt())

    val readableNumber = 10000_00_0
    println(readableNumber)


//    Array
    println("----Array-----")
    val arrayOne = arrayOf(1,2,3,4,5)
    val arrayDynamis = arrayOf("Ahmad",1,2.5,true)

    val intArray = intArrayOf(1, 3, 5, 7)
    intArray[2] = 11

    val intArrayTwo = Array(4, {i -> i*i})

    for (data in intArrayTwo){
        println(data)
    }

    //   Nullable
    println("----Nullable-----")
//    val textNulable :  String = null // Compile Error
    val textNulableGo :  String? = null // Ready to go

    //val textLength = text.length // compile time error

    if (textNulableGo != null){
        val textLength = textNulableGo.length // ready to go
    }

    val textLengthElvis = if (textNulableGo != null) textNulableGo.length else 1
    val text: String? = null
    val textLength = text!!.length // ready to go ???

}