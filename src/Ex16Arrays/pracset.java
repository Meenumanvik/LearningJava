package Ex16Arrays;

public class pracset {
        public int solution(int[] A) {
            int n=100; int i;
            //int result[] =new int[5];
            int output[]=new int[5];
            for( i=0;i<A.length-1;i++){
                for(int j=1;j<n;j++){
                if(A[i]==j ){
                     }output[i]=j;

            }}return output[i];}
        public static void main(String args[]){
            int[] A={1,3,6,4,1,2};

            pracset ss=new pracset();
            int output=ss.solution(A);
            System.out.println(output);

        }


    }


