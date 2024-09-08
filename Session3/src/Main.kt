//fun main() {
//    var name:String? = "eyad"
//     name = null
//    var y = name?: "hello"
//
//    println(y)
//    var x = 5
//    var z = 20
//    println((x?:1) * z)
//}





fun main(){
    val participants: Int = 8
    val minimumGrade: Int = 5
    val grades = arrayOf(10,9,8,7,7,7,5,5)
    var count:Int = 0
    for(item in grades){
        if (item > minimumGrade){
            count++
        }
    }
    println(count)
}




























//     var x = listOf(1,3,5,"5.5",5.5)
//     println(x)
//     val y:MutableList<Int> = mutableListOf(1,2,3,4,5,6)
//     y.add(7) // appends on element only at the end of the list
//     y.remove(5)
//     y.addAll(listOf(5,88)) // appends at the end of the list any element found 
//     println(y)
//     val x = setOf(1,2,2,3,4,5,6,6,10) // discards duplicate elements
//     println(x)
//      									// Every STLs has a mutable set




//     var x = mutableListOf(1,2,3,4,5,6)
//     x.add(7)
//     x.remove(2)
//     x.addAll(listOf(20,30))
//     println(x.count())
//     for(item in x){
//         println(item)
//     }

//    var y = mutableSetOf(1,2,3,4,5,6,7,8,-1,-100,-25,22,-20,-105)
//    val x = y.map{it*3}.filter{it>0} // or val x = y.map{x -> x*3}.filter{x -> x>0}
//     println(y)
//     println(x)




// Break and continue labels

//     first@ for(i in 1..5){
//     second@			for ( j in 1..9){
//         				if(i==2)break@second
//         				println("$i $j")

//             	}

//     		}




// 	val student1 = Student("Eyad","Yehia")
//     student1.printName()



//     val student1 = Student("Ahmed", "aly")
//     val student2 = student1.copy(fname = "hassan")
//     println(student1.toString())
// }


// Ordinary class as the basic OOP

//     class Student(fname:String, lname:String){
//           var studentName:String  	// lateinit is to check if the variable is initialized or not 
//         init{
//             studentName = "$fname $lname"
//         }
//         fun printName(){
//             println(studentName)
//         }
// 		}


// Data class without the need of geters and setters

// 	data class Student(val fname:String , val lname:String)
    