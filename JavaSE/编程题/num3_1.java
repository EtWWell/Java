public class num3_1{
    public static void main(String args[]){
        //求一到十的阶乘
        int res;
        res = 0;
        for(int i = 1; i < 11; i++){
            int a = i;
            int temp = 1;
            while(a > 1){
                temp = temp*a;
                a--;
            }
            res += temp;
            temp = 1;
        }
        System.out.println("1!+2!+3!+4!+...+10!="+res);
    }
}