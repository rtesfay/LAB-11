class SmallestElementQ2 {
    public static void main(String[] args) {
    }
    public static int smallestElement(int []arr,int index){
            if (index==1){
                return arr[0];

            }else
                return Math.min(arr[index],smallestElement(arr,index-1));
        }

    }

