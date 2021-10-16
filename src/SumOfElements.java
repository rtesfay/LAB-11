class SumOfElementsQ3 {
    public static void main(String[] args) {
    }
    public static int sumOfElements(int []arr, int index){
            if (index<=0){
                return 0;
            }else
                return arr[index-1]+sumOfElements(arr,index-1);
        }
    }

