public class array_equality{
    public static void main(String[] args){
        int[] arrayOne = {
            1, 3, 5, 7
            };
        int[] arrayTwo = {2,4,6,8};
        boolean equalOrNot=true;
        if(arrayOne.length ==arrayTwo.length){
            for(int i=0; i<arrayOne.length;i++){
                if(arrayOne[i] != arrayTwo[i]){
                    equalOrNot=false;
                }
            }
            
        }else{
                equalOrNot=false;
            }
            if(equalOrNot){
                System.out.println("Two arrays are equal");
            }
            else{
                System.out.println("Two arrays are not equal");
            }
    }
}