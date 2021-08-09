object Ceaser {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

 def main(args: Array[String]) {
   println("1 = Encrypt a string \n2 = Decrypt a string \n Enter your choice : ")
   val choice=scala.io.StdIn.readInt()

   if(choice!=1 && choice!=2){

     println("Wrong choice")

   }else{

     println("Enter the text")
     val text=scala.io.StdIn.readLine()
     var key=5

     if(choice==1){
       println(cipher(E,text,key,alphabet))
     }

     else{
       println(cipher(D,text,key,alphabet))
     }

   }}

  val E= (c: Char, key:Int, a:String) => a((a.indexOf(c.toUpper)+key) %a.size)

  val D=(c:Char,key:Int, a:String)=> a((a.indexOf(c.toUpper)-key+26) %a.size)

  val cipher = (algo: (Char,Int,String) => Char, s:String, key:Int, a:String) => s.map(algo(_,key,a))

}