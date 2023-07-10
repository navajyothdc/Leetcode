class Solution {
    public void duplicateZeros(int[] arr) {
        int counter=0;
        int tempArr[] = new int[arr.length];
        for(int i=0; i <arr.length; i++){
            if(counter >= tempArr.length){
                break;
            }
           if(arr[i] == 0){
               tempArr[counter]=arr[i];
               if(counter+1 < tempArr.length) {
            	   tempArr[counter+1] =arr[i];
               }
               counter += 2;
           }else{
               tempArr[counter]=arr[i];
               counter++;
           } 
        }
        for(int i=0; i <tempArr.length; i++){
            arr[i] = tempArr[i];
        }
    }
}