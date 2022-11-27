public class Operations {
    public static void main(String[] args) {
int a=4, b=3;
int c=a+b;
System.out.println(c);
System.out.println(a*b);
int x=7, y=5;
        System.out.println(x/y);
        System.out.println(x%y);
double d=7, l=5;
        System.out.println(d/l);
        x=5;
        x=x+1;
        x++;
        ++x;
        System.out.println(x);

        x=4;
        System.out.println(x++);
        System.out.println(x);
        x=2;
        System.out.println(++x);
        System.out.println(x);

        x=3;
        y=4;
        c=x++ - --y;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("c= "+c);

        a=7;
        b=5;
        c=a++ + a-- + ++b - b--;//c=7+7+6-5=15;
            System.out.println(c);//15
            System.out.println(a);//7
            System.out.println(b);//5
            System.out.println(a++);//7
            System.out.println(++a);//9
            System.out.println(b++);//5
            System.out.println(b);//6

       x=5;
       boolean bl = x==6;
        System.out.println(bl);//false

        x=7;
        System.out.println(x!=6);//true
        System.out.println(x>6);
        System.out.println(x>7);
        System.out.println(x>8);
        System.out.println(x>=7);


        x=8;
        y=2;
        System.out.println(x % y==0);
        System.out.println("Logical Operators");

        x=7;
        System.out.println(x>=6 && x<10);//true
        boolean b1= x>=1 && x<=9;
        boolean b2 = x<0 || x>100;
        b2=true;
        System.out.println(!b2);// br will be false  (from true to false)

        System.out.println(5&8);//0
        System.out.println(17&24);//16
        System.out.println(5|8);//13
        System.out.println(5^8);//13


        x=5;
        x=x+2;
        System.out.println(x);//7
        //same
        x=3;
        x+=2;
        System.out.println(x);//5
        x=7;
        x=x&9;
        //same
        x&=9;
        System.out.println(x);




    }
}
