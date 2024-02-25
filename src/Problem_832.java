public class Problem_832 {
//    Flipping an Image
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int k=0;
            int l=image.length-1;
            while(k<l){
                int temp = image[i][k];
                image[i][k] = image[i][l];
                image[i][l] = temp;
                k++;
                l--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
