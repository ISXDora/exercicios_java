
public class Ok {
    public static void main(String args[]){
        System.out.println(funcaoX(5));
        }
    public static int funcaoX(int n){
        int x = 0;
        if(n<=0){
            x=0;
            
        }else{
            x=n+funcaoX(n-1);
        }
        return x;
    }
}
