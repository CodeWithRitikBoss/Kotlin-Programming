class PasswordGenerator{
    lateinit var accountHolderFirstName: String
    lateinit var accountHolderLastName: String
    lateinit var userName: String
    lateinit var platformName: String
    lateinit var timeToChange: String
    lateinit var securityType: String

    fun setData(){
        println("Enter Account Holder First Name : ")
        accountHolderFirstName= readLine().toString()

        println("Enter Account Holder Last Name : ")
        accountHolderLastName= readLine().toString()

        println("Enter Account User Name : ")
        userName= readLine().toString()

        println("Enter Account Platform Type : ")
        platformName= readLine().toString()

        println("Enter Time to Change : ")
        timeToChange= readLine().toString()

        println("Enter Security Type(L/M/H) : ")
        securityType= readLine().toString()

    }

    fun getData(){
        println("Name: $accountHolderFirstName $accountHolderLastName")
        println("User Name: $userName")
        println("Platform Name: $platformName")
        println("Time to Change: $timeToChange")
        println("Security Type: $securityType")
    }

    fun passwordGenerator(){
        val p1= "$accountHolderFirstName$accountHolderLastName\$$userName%$platformName^$timeToChange&$securityType"
        println("Password is: $p1")
    }
}


fun main() {
    print("Password Generator.\n")

    val c1= PasswordGenerator()

    c1.setData()
//    c1.getData()
    c1.passwordGenerator()
}

