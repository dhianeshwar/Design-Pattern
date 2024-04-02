package Strategy;

public class LoopStrategy implements FindStrategy{

    @Override
    public int largest(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[0];
    }
}
