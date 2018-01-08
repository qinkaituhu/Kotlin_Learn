/**
 * Created by Qin kai on 2018/1/8
 */

fun main(args: Array<String>) {
    var run = 5
    run = 6

    val int1 = 9999
    val long1 = int1.toLong()

    val pi = 3.141592653589793238

    /*var 电费 = 3.6
    电费 = "五毛"
    -> 类型安全*/

    // Kotlin中布尔型只有2个值：true 和 false

    //元组 最多一次容纳3个值:  二元（Pair） 和 三元（ Triple）

    val 课程 = Triple(3, "学会", "kotlin")
    val 费用 = Pair("学费", 0)

    var add:String? = "上海师范大学"
    var sex:Boolean? = false

    val 一百到一百 = 1..100
    val 一百到一百间的奇数 = 一百到一百.step(2)

    println("每天跑${run}公里")
    println("Int -> Long: ${long1}")
    println("圆周率${pi}")
    println("${课程.first}天${课程.second}${课程.third}")
    println("${费用.first}${费用.second}元！")

    if (sex != null && sex == true) {
        println("先生，最便宜了！")
    } else {
        println("美女，全场八折哦！")
    }

    //不需要 new
    println(3 + 4)
    println(3 - 4)
    println(3 * 4)
    println(12 / 4.0)

    println(13 % 4.1)

    for (i in 一百到一百间的奇数) {
        println("奇数：${i}")
    }

    println("我爱学习Kotlin".endsWith("Kotlin", true))

    val a = 5
    val b = 3
    val isToday = if (a > b) true else false
    println(isToday)
}

/** 数据类型 Int Long Short Byte Double Float
 *  注意类型名首字母是大写的
 *
 *  var 变量名: Int = 3
 *
 *  字符串模板：${} 变量的占位符
 *
 */