package Do_Whiles;

public class PrintAtoZ {
    public static void main(String[] args) {
        char alpha = 'A';
        do{
            System.out.print(alpha + " ");
            alpha++;
        }while(alpha <= 'Z');
    }
}
