public class Ap_Gp {
    public static void sum_AP(){
        int n=4,a=2,d=2;
        int sum=0;
       for (int i = 1; i <= n; i++) {
        sum=sum+a;
        a+=d;
       }
       System.out.println("The sum of Ap series is "+ sum);

    }
    public static void main(String[] args){

    //Print AP series
      int n1= 2;
      int d=3;
     System.out.println("The AP series is ");
      for (int i = 1; i <=5; i++) {
        System.out.print(n1+" ");
        n1= n1+d;
      }

         // Printing GP series
         System.out.print("The GP series is ");
      for (int i = 1; i <=5; i++) {
        System.out.print( n1+" ");
        n1= n1*d;
      }
        
System.out.println();


//Sum of the GP series
        int a=3;
        int r=5;
        int n=4;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+ a;
            a= a*r;
            //a= (int) Math.pow(2, 2);
        }
        System.out.println(sum);

        sum_AP();
    }
}

/* 
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContentView(R.layout.activity_main)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets
    }
    var textView=findViewById<TextView>(R.id.text1)
    var button=findViewById<TextView>(R.id.button)
    button.setOnClickListener({

    })
}
fun showDatePicker(textView: TextView){
    val calender=Calendar.getInstance()
    val year=calender.get(Calendar.YEAR)
    val month=calender.get(Calendar.MONTH)
    val date=calender.get(Calendar.DATE)
}


  int n1= 2;
        int lt= 4;
        int n=10;
        for (int i = 0; i < n-2; i++) {
            int t= lt*2;
            lt=t;
            System.out.println(lt);
        }
    */