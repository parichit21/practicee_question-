package Interview;


/*//div[@id="nav-cart-count-container"]//span*/
/*Hi I am a software tester*/
//   tester  software a am i hi

//te s te r


//frst output :- retset erawtfos a ma I i

//sencod output
public class rount1 {

    public static void main(String[] args) {
        reverse("Hi I am a software tester");
    }

        static void reverse(String str ){

            String [] arr = str.split(" ");
//                            str.toCharArray();
            for(int i =arr.length-1;i>0;i--)
            {
                System.out.print(" "+arr[i]);
            }



        }






}
