public class pattern{
    public static void main(String[] args){
        for (int line= 1; line<=6;line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern{
    public static void main(String[] args){
        int n = 15;
        for(int line = 1; line<=n; line++){
            for(int star = 1; star<= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class pattern{
    public static void main(String[]args){
        int n = 20;
        for(int line = 1; line<= n; line++){
            for(int number = 1; number<=line; number++ ){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}


public class pattern{
    public static void main(String[]args){
        int n = 9;
        char ch = 'A';
        for(int line = 1;line<=n;line++){
            for( int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}


public class pattern {

    public static void main(String[]args){
        int n = 6;
        for(int line = 1; line<=n; line++){
            for(int star =1;star<=n;star++){
                System.out.print(" *");
            }
            System.out.println( );
        }
    }
}