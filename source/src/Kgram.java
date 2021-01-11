package src;

public class Kgram {

    private Boolean compareString(String s1, String s2, int maxDuplicateSize){

        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int len = sb.length();
        int len2 = sb2.length();
        if(len < maxDuplicateSize || len2 < maxDuplicateSize){
            return false;
        }
        int l = len<len2?len:len2;
        int i =0;
        Boolean flag = false;
        for(i=0;i<len-maxDuplicateSize+1;i++){
            for(int j=0;j<len2-maxDuplicateSize+1;j++){
                if(sb.substring(i,i+maxDuplicateSize-1).equals(sb2.substring(j,j+maxDuplicateSize-1))){
                    System.out.println("发现重复的文本："+sb.substring(i,i+maxDuplicateSize-1));
                }
            }
        }
        if(flag){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        new Kgram().compareString("探索利用大数据识别围标串标","大数据识别围标串标的方法需要认真研究",8);
    }
}
