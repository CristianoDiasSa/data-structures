public class IterativeAndRecursive {
    public void iterativeChecking(int [] data){
        System.out.println("Iterative method!");
        for(int i = 0; i<data.length; i++){
            if (data[i] % 3 == 0){
                System.out.println("the number " + data[i] + " is divisible by 3");
            }else{
                System.out.println("the number " + data[i] + " is not divisible by 3");
            }
        }
    }
    public void recursiveChecking(int [] data, int k){
        if(k <= data.length-1){
            if(data[k] % 3 == 0){
                System.out.println("the number " + data[k] + " is divisible by 3");
                k++;
                recursiveChecking(data, k);
            }else{
                System.out.println("the number " + data[k] + " is not divisible by 3");
                k++;
                recursiveChecking(data, k);
            }
        }
    }
}
